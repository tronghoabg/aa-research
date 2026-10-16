package com.google.d.g;

import com.google.d.b.an;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends f implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final byte[] f7877a;

    e(byte[] bArr) {
        an.B(bArr);
        this.f7877a = bArr;
    }

    @Override // com.google.d.g.f
    public final int a() {
        byte[] bArr = this.f7877a;
        int length = bArr.length;
        an.w(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // com.google.d.g.f
    public final int b() {
        return this.f7877a.length * 8;
    }

    @Override // com.google.d.g.f
    final boolean c(f fVar) {
        int length = fVar.e().length;
        byte[] bArr = this.f7877a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            z &= bArr[i2] == fVar.e()[i2];
        }
        return z;
    }

    @Override // com.google.d.g.f
    public final byte[] d() {
        return (byte[]) this.f7877a.clone();
    }

    @Override // com.google.d.g.f
    final byte[] e() {
        return this.f7877a;
    }
}
