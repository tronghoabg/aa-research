package com.vungle.ads.internal.util;

import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class r {
    public static String a(String key, kotlinx.serialization.json.c json) {
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(key, "key");
        try {
            return Xf.j.d((kotlinx.serialization.json.b) AbstractC2641B.v(key, json)).a();
        } catch (Exception unused) {
            return null;
        }
    }
}
