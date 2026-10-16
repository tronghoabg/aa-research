package defpackage;

/* loaded from: classes3.dex */
final class ury implements usd {
    private final int[] a;
    private final int[] b;
    private final int[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;

    public ury(int[] iArr, int i, int i2, int i3, int i4, boolean z, int[] iArr2, int[] iArr3) {
        this.a = iArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = z;
        this.b = iArr2;
        this.c = iArr3;
    }

    private final int f(int i) {
        int i2 = i - this.f;
        return this.h ? a.H(i2) : i2;
    }

    @Override // defpackage.usd
    public final int a() {
        return this.d;
    }

    @Override // defpackage.usd
    public final tpf b() {
        if (this.c == null) {
            return null;
        }
        return new tpf(f(r0[0]), r0[1] - this.g);
    }

    @Override // defpackage.usd
    public final tpf c() {
        if (this.b == null) {
            return null;
        }
        return new tpf(f(r0[0]), r0[1] - this.g);
    }

    @Override // defpackage.usd
    public final void d(int i, tpf tpfVar) {
        int i2 = this.e;
        int[] iArr = this.a;
        int i3 = i2 + i;
        tpfVar.n(f(iArr[i3]), iArr[i3 + 1] - this.g);
    }

    @Override // defpackage.usd
    public final boolean e(int i, int i2) {
        int[] iArr = this.a;
        int i3 = this.e;
        return iArr[i3 + i] == iArr[i2 + i3];
    }
}
