package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1688b {

    /* renamed from: a, reason: collision with root package name */
    public final int f26505a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f26506b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f26507c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26508d;

    public C1688b(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f26506b = iVar;
        this.f26507c = eVar;
        this.f26508d = str;
        this.f26505a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1688b)) {
            return false;
        }
        C1688b c1688b = (C1688b) obj;
        return AbstractC1732v.m(this.f26506b, c1688b.f26506b) && AbstractC1732v.m(this.f26507c, c1688b.f26507c) && AbstractC1732v.m(this.f26508d, c1688b.f26508d);
    }

    public final int hashCode() {
        return this.f26505a;
    }
}
