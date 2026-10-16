package com.google.v;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends t {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f13053b;

    u(byte[] bArr) {
        bArr.getClass();
        this.f13053b = bArr;
    }

    @Override // com.google.v.v
    final byte a(int i2) {
        return this.f13053b[i2];
    }

    @Override // com.google.v.v
    public final int c() {
        return this.f13053b.length;
    }

    @Override // com.google.v.v
    public final v d(int i2, int i3) {
        int iP = p(i2, i3, c());
        return iP == 0 ? v.f13054a : new s(this.f13053b, i2, iP);
    }

    @Override // com.google.v.v
    public final v e(int i2, int i3) {
        int iP = p(0, i3, c());
        return iP == 0 ? v.f13054a : new s(this.f13053b, 0, iP);
    }

    @Override // com.google.v.v
    public final z f() {
        return z.Z(this.f13053b, 0, c());
    }

    @Override // com.google.v.v
    public final InputStream g() {
        return new ByteArrayInputStream(this.f13053b, 0, c());
    }

    @Override // com.google.v.v
    protected final String h(Charset charset) {
        return new String(this.f13053b, charset);
    }

    @Override // com.google.v.v
    public final ByteBuffer i() {
        return ByteBuffer.wrap(this.f13053b).asReadOnlyBuffer();
    }

    @Override // com.google.v.v
    final void j(q qVar) {
        qVar.a(this.f13053b, 0, c());
    }

    @Override // com.google.v.v
    protected final boolean k(v vVar) {
        boolean z = vVar instanceof u;
        if (z) {
            return Arrays.equals(this.f13053b, ((u) vVar).f13053b);
        }
        boolean z2 = vVar instanceof s;
        if (!z2) {
            return vVar.k(this);
        }
        int iC = c();
        if (iC > vVar.c()) {
            throw new IllegalArgumentException("Length too large: " + iC + c());
        }
        if (iC <= vVar.c()) {
            if (z) {
                return v.v(this.f13053b, 0, ((u) vVar).f13053b, 0, iC);
            }
            if (!z2) {
                return vVar.e(0, iC).equals(e(0, iC));
            }
            s sVar = (s) vVar;
            return v.v(this.f13053b, 0, sVar.f13050b, sVar.f13051c, iC);
        }
        throw new IllegalArgumentException("Ran off end of other: 0, " + iC + ", " + vVar.c());
    }

    @Override // com.google.v.v
    public final boolean l() {
        return dc.q(this.f13053b);
    }

    @Override // com.google.v.v
    protected final void n(byte[] bArr, int i2) {
        System.arraycopy(this.f13053b, 0, bArr, 0, i2);
    }

    @Override // com.google.v.v
    protected final int o(int i2, int i3) {
        return ep.a(i2, this.f13053b, 0, i3);
    }
}
