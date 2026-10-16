package defpackage;

/* loaded from: classes3.dex */
final class ydt extends ydr {
    final /* synthetic */ ydu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydt(ydu yduVar) {
        super(yduVar.d.length);
        this.a = yduVar;
    }

    @Override // defpackage.ydr
    public final yfy a() {
        return this.a.b;
    }

    @Override // defpackage.ydr
    public final /* bridge */ /* synthetic */ Object b(int i) {
        return new yds(this.a, i);
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
