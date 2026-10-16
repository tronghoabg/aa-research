package com.google.android.gms.common.internal;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class A implements com.google.android.gms.common.api.e {

    /* renamed from: b, reason: collision with root package name */
    public static final A f26577b = new A(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f26578a;

    public /* synthetic */ A(String str) {
        this.f26578a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            return AbstractC1732v.m(this.f26578a, ((A) obj).f26578a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26578a});
    }
}
