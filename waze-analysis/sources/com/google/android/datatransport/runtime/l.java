package com.google.android.datatransport.runtime;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.a f4199a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4200b;

    public l(com.google.android.datatransport.a aVar, byte[] bArr) {
        if (aVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f4199a = aVar;
        this.f4200b = bArr;
    }

    public final com.google.android.datatransport.a a() {
        return this.f4199a;
    }

    public final byte[] b() {
        return this.f4200b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f4199a.equals(lVar.f4199a)) {
            return Arrays.equals(this.f4200b, lVar.f4200b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f4199a.hashCode() ^ 1000003;
        return Arrays.hashCode(this.f4200b) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f4199a.toString() + ", bytes=[...]}";
    }
}
