/*
 * Copyright 2013-2020 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package brave.spring.beans;

import brave.baggage.BaggageField;

public class CorrelationField {
  BaggageField field;
  String name;
  boolean dirty, flushOnUpdate;

  public void setField(BaggageField field) {
    this.field = field;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDirty(boolean dirty) {
    this.dirty = dirty;
  }

  public void setFlushOnUpdate(boolean flushOnUpdate) {
    this.flushOnUpdate = flushOnUpdate;
  }
}