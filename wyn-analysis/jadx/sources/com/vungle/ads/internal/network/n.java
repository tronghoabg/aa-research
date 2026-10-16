package com.vungle.ads.internal.network;

import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Response;

/* loaded from: classes5.dex */
public abstract class n {
    public static o a(Object obj, Response rawResponse) {
        AbstractC3340k.e(rawResponse, "rawResponse");
        if (rawResponse.d()) {
            return new o(rawResponse, obj, 0);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static o a(Response rawResponse) {
        AbstractC3340k.e(rawResponse, "rawResponse");
        if (!rawResponse.d()) {
            return new o(rawResponse, null, 0);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }
}
