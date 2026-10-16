package defpackage;

/* loaded from: classes3.dex */
final class yds extends ydr {
    final /* synthetic */ ydu a;
    private final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yds(ydu yduVar, int i) {
        super(yduVar.d[i]);
        this.a = yduVar;
        this.c = i;
    }

    @Override // defpackage.ydr
    public final yfy a() {
        return this.a.c;
    }

    @Override // defpackage.ydr
    public final Object b(int i) {
        return this.a.f[this.c][i];
    }

    @Override // defpackage.yfy
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ydr, defpackage.yfw, defpackage.yfy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
