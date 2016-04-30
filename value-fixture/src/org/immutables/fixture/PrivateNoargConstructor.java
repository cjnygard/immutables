/*
   Copyright 2016 Immutables Authors and Contributors

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.immutables.fixture;

import org.immutables.value.Value;
import org.immutables.value.Value.Style;

public interface PrivateNoargConstructor {}

@Value.Immutable
@Style(privateNoargConstructor = true)
interface PrivateNoargConstructorNominal {
  boolean is();
  byte b();
  short s();
  int i();
  long l();
  char c();
  float f();
  double d();
  Object o();
}

@Value.Immutable(prehash=true)
@Style(privateNoargConstructor = true)
interface PrivateNoargConstructorOverridePrehash {

  boolean is();
  byte b();
  short s();
  int i();
  long l();
  char c();
  float f();
  double d();
  Object o();
}

@Value.Immutable(prehash=true)
@Style(privateNoargConstructor = false)
interface PrivateNoargConstructorOptionFalseDoNotAffectPrehash {

  boolean is();
  byte b();
  short s();
  int i();
  long l();
  char c();
  float f();
  double d();
  Object o();
}


@Value.Immutable(singleton = true)
@Style(privateNoargConstructor = true)
interface PrivateNoargConstructorIsOverriddenBySingleton {
  
  @Value.Default
  default int test() {
    return 1;
  }
  
  default void use() {
    ImmutablePrivateNoargConstructorIsOverriddenBySingleton.of();
  }
}