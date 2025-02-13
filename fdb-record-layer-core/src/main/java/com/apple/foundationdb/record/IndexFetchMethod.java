/*
 * IndexFetchMethod.java
 *
 * This source file is part of the FoundationDB open source project
 *
 * Copyright 2015-2022 Apple Inc. and the FoundationDB project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.apple.foundationdb.record;

import com.apple.foundationdb.annotation.API;

/**
 * An indicator for the index fetch method to use for a query or an index scan.
 * Possible values are:
 * <UL>
 * <LI>{@link IndexFetchMethod#SCAN_AND_FETCH} use regular index scan followed by fetch</LI>
 * <LI>{@link IndexFetchMethod#USE_REMOTE_FETCH} use remote fetch feature from FDB</LI>
 * <LI>{@link IndexFetchMethod#USE_REMOTE_FETCH_WITH_FALLBACK} use remote fetch ability with fallback to regular
 * scan and fetch in case of failure. This is a safety measure meant to be used while the
 * remote fetch mechanism is being tested</LI>
 * </UL>
 */
@API(API.Status.EXPERIMENTAL)
public enum IndexFetchMethod { SCAN_AND_FETCH, USE_REMOTE_FETCH, USE_REMOTE_FETCH_WITH_FALLBACK }
