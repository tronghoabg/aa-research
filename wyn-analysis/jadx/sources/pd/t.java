package pd;

import cg.C1618g;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final C1618g f43600a;

    /* renamed from: b, reason: collision with root package name */
    public int f43601b;

    /* renamed from: c, reason: collision with root package name */
    public int f43602c;

    public t(C1618g c1618g, int i5) {
        this.f43600a = c1618g;
        this.f43601b = i5;
    }

    public final void a(byte[] bArr, int i5, int i10) {
        this.f43600a.W(bArr, i5, i10);
        this.f43601b -= i10;
        this.f43602c += i10;
    }
}
