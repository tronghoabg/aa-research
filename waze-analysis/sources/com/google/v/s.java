package com.google.v;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s extends t {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f13050b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13051c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13052d;

    s(byte[] bArr, int i2, int i3) {
        p(i2, i2 + i3, bArr.length);
        this.f13050b = bArr;
        this.f13051c = i2;
        this.f13052d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.v.v
    final byte a(int i2) {
        return this.f13050b[this.f13051c + i2];
    }

    @Override // com.google.v.v
    public final int c() {
        return this.f13052d;
    }

    @Override // com.google.v.v
    public final v d(int i2, int i3) {
        int iP = p(i2, i3, this.f13052d);
        return iP == 0 ? v.f13054a : new s(this.f13050b, this.f13051c + i2, iP);
    }

    @Override // com.google.v.v
    public final v e(int i2, int i3) {
        int iP = p(i2, i3, this.f13052d);
        return iP == 0 ? v.f13054a : new s(this.f13050b, this.f13051c + i2, iP);
    }

    @Override // com.google.v.v
    public final z f() {
        return z.Z(this.f13050b, this.f13051c, this.f13052d);
    }

    @Override // com.google.v.v
    public final InputStream g() {
        return new ByteArrayInputStream(this.f13050b, this.f13051c, this.f13052d);
    }

    @Override // com.google.v.v
    protected final String h(Charset charset) {
        return new String(this.f13050b, this.f13051c, this.f13052d, charset);
    }

    @Override // com.google.v.v
    public final ByteBuffer i() {
        return ByteBuffer.wrap(this.f13050b, this.f13051c, this.f13052d).asReadOnlyBuffer();
    }

    @Override // com.google.v.v
    final void j(q qVar) {
        qVar.a(this.f13050b, this.f13051c, this.f13052d);
    }

    @Override // com.google.v.v
    protected final boolean k(v vVar) {
        boolean z = vVar instanceof u;
        if (!z && !(vVar instanceof s)) {
            return vVar.k(this);
        }
        int i2 = this.f13052d;
        if (i2 > vVar.c()) {
            throw new IllegalArgumentException("Length too large: " + i2 + i2);
        }
        if (i2 > vVar.c()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + vVar.c());
        }
        if (z) {
            return v.v(this.f13050b, this.f13051c, ((u) vVar).f13053b, 0, i2);
        }
        if (vVar instanceof s) {
            s sVar = (s) vVar;
            return v.v(this.f13050b, this.f13051c, sVar.f13050b, sVar.f13051c, i2);
        }
        v vVarE = vVar.e(0, i2);
        int i3 = this.f13051c;
        return vVarE.equals(e(i3, i2 + i3));
    }

    @Override // com.google.v.v
    public final boolean l() {
        byte[] bArr = this.f13050b;
        int i2 = this.f13051c;
        return dc.r(bArr, i2, this.f13052d + i2);
    }

    @Override // com.google.v.v
    protected final void n(byte[] bArr, int i2) {
        System.arraycopy(this.f13050b, this.f13051c, bArr, 0, i2);
    }

    @Override // com.google.v.v
    protected final int o(int i2, int i3) {
        return ep.a(i2, this.f13050b, this.f13051c, i3);
    }

    Object writeReplace() {
        return v.t(x());
    }
}
