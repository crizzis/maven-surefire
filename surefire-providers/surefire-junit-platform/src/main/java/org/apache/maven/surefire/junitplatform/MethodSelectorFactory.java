package org.apache.maven.surefire.junitplatform;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.support.descriptor.MethodSource;

class MethodSelectorFactory implements TestSelectorFactory
{
    @Override
    public boolean supports( TestSource source )
    {
        return source instanceof MethodSource;
    }

    @Override
    public String getContainerName( TestSource source )
    {
        return ( ( MethodSource ) source ).getClassName();
    }

    @Override
    public String getSelectorName( TestSource source )
    {
        return ( ( MethodSource ) source ).getMethodName();
    }
}
