/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sugis.graal;

import jakarta.annotation.Nullable;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructorAnnotationTest {

    @Test
    public void testAnnotationPresent() throws Exception {
        Assertions.assertThat(NullableParameter.class.getDeclaredConstructors()[0]
                        .getParameters()[0]
                                .getAnnotations())
                .singleElement()
                .isInstanceOf(Nullable.class);
    }

    static class NullableParameter {
        private final String s;
        private final int i;

        NullableParameter(@Nullable final String s, final int i) {
            this.s = s;
            this.i = i;
        }
    }
}
