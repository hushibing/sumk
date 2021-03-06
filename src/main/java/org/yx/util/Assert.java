/**
 * Copyright (C) 2016 - 2030 youtongluan.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.yx.util;

import org.yx.exception.SumkException;

public final class Assert {

	public static void notNull(Object obj) {
		if (obj == null) {
			throw new SumkException(567567, "param must not be null");
		}

	}

	public static void notNull(Object obj, String msg) {
		if (obj == null) {
			throw new SumkException(652345436, msg);
		}

	}

	public static void notEmpty(String obj, String msg) {
		if (obj == null || obj.isEmpty()) {
			throw new SumkException(657645465, msg);
		}

	}

	public static void isTrue(boolean b, String msg) {
		if (b) {
			return;
		}
		throw new SumkException(5674354, msg);
	}

	public static void hasText(String text, String msg) {
		if (text == null || text.trim().isEmpty()) {
			throw new SumkException(652342134, msg);
		}

	}

}
