package com.waze.shared_infra.e;

import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f37850a;

    public a(byte[] bArr) {
        x.f(bArr, "byteArray");
        this.f37850a = bArr;
    }

    public final byte[] a() {
        return this.f37850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Arrays.equals(this.f37850a, ((a) obj).f37850a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37850a);
    }

    public final String toString() {
        return "EquatableByteArray(size=" + this.f37850a.length + ")";
    }
}
