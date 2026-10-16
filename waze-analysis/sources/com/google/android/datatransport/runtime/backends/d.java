package com.google.android.datatransport.runtime.backends;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f4160a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4161b;

    /* synthetic */ d(Iterable iterable, byte[] bArr) {
        this.f4160a = iterable;
        this.f4161b = bArr;
    }

    public final Iterable a() {
        return this.f4160a;
    }

    public final byte[] b() {
        return this.f4161b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f4160a.equals(dVar.f4160a)) {
                byte[] bArr = this.f4161b;
                if (dVar instanceof d) {
                }
                if (Arrays.equals(bArr, dVar.f4161b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f4160a.hashCode() ^ 1000003;
        return Arrays.hashCode(this.f4161b) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f4161b;
        return "BackendRequest{events=" + String.valueOf(this.f4160a) + ", extras=" + Arrays.toString(bArr) + "}";
    }

    public d() {
        throw null;
    }
}
