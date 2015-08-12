/*******************************************************************************
 * Copyright © Microsoft Open Technologies, Inc.
 * 
 * All Rights Reserved
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * THIS CODE IS PROVIDED *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION
 * ANY IMPLIED WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A
 * PARTICULAR PURPOSE, MERCHANTABILITY OR NON-INFRINGEMENT.
 * 
 * See the Apache License, Version 2.0 for the specific language
 * governing permissions and limitations under the License.
 ******************************************************************************/
package com.microsoft.aad.adal4j;

import java.util.Set;

/**
 *
 */
final class StringHelper {

    static boolean isBlank(final String str) {
        return str == null || str.trim().length() == 0;
    }

    static boolean isBlank(final String[] str) {
        return str == null || str.length == 0;
    }

    static String convertSetToString(Set<String> input) {
        return convertArrayToString(input.toArray(new String[input.size()]));
    }

    static String convertArrayToString(String[] array) {
        StringBuilder builder = new StringBuilder();
        boolean isFirst = true;
        for (String value : array) {
            if (!isFirst) {
                builder.append(" ");
            }

            builder.append(value);
            isFirst = false;
        }

        return builder.toString();
    }

}
