package defpackage;

/* loaded from: classes3.dex */
final class ydp extends ydr {
    final /* synthetic */ ydu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydp(ydu yduVar) {
        super(yduVar.e.length);
        this.a = yduVar;
    }

    @Override // defpackage.ydr
    public final yfy a() {
        return this.a.c;
    }

    @Override // defpackage.ydr
    public final /* bridge */ /* synthetic */ Object b(int i) {
        return new ydo(this.a, i);
    }

    @Override // defpackage.yfy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ydr, defpackage.yfw, defpackage.yfy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
