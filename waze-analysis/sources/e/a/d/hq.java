package e.a.d;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hq extends d {

    /* renamed from: a, reason: collision with root package name */
    int f47105a;

    /* renamed from: b, reason: collision with root package name */
    final int f47106b;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f47107c;

    /* renamed from: d, reason: collision with root package name */
    int f47108d = -1;

    hq(byte[] bArr, int i2, int i3) {
        com.google.d.b.an.m(i2 >= 0, "offset must be >= 0");
        com.google.d.b.an.m(i3 >= 0, "length must be >= 0");
        int i4 = i3 + i2;
        com.google.d.b.an.m(i4 <= 0, "offset + length exceeds array boundary");
        this.f47107c = bArr;
        this.f47105a = i2;
        this.f47106b = i4;
    }

    @Override // e.a.d.d, e.a.d.ho
    public final void b() {
        this.f47108d = this.f47105a;
    }

    @Override // e.a.d.d, e.a.d.ho
    public final void c() {
        int i2 = this.f47108d;
        if (i2 == -1) {
            throw new InvalidMarkException();
        }
        this.f47105a = i2;
    }

    @Override // e.a.d.d, e.a.d.ho
    public final boolean d() {
        return true;
    }

    @Override // e.a.d.ho
    public final int e() {
        a(1);
        int i2 = this.f47105a;
        this.f47105a = i2 + 1;
        return this.f47107c[i2] & 255;
    }

    @Override // e.a.d.ho
    public final int f() {
        return this.f47106b - this.f47105a;
    }

    @Override // e.a.d.ho
    public final /* bridge */ /* synthetic */ ho g(int i2) {
        a(i2);
        int i3 = this.f47105a;
        this.f47105a = i3 + i2;
        return new hq(this.f47107c, i3, i2);
    }

    @Override // e.a.d.ho
    public final void i(OutputStream outputStream, int i2) throws IOException {
        a(i2);
        outputStream.write(this.f47107c, this.f47105a, i2);
        this.f47105a += i2;
    }

    @Override // e.a.d.ho
    public final void j(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f47107c, this.f47105a, bArr, i2, i3);
        this.f47105a += i3;
    }

    @Override // e.a.d.ho
    public final void k(int i2) {
        a(i2);
        this.f47105a += i2;
    }
}
