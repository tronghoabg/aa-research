package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1725n {

    /* renamed from: a, reason: collision with root package name */
    public final String f26676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26677b;

    public C1725n(String str, String str2) {
        AbstractC1732v.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f26676a = str;
        this.f26677b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public final void a(Exception exc, String str, String str2) {
        if (Log.isLoggable(this.f26676a, 6)) {
            String str3 = this.f26677b;
            if (str3 != null) {
                str2 = str3.concat(str2);
            }
            Log.e(str, str2, exc);
        }
    }
}
