package defpackage;

/* loaded from: classes3.dex */
public final class zio extends adqq {
    public boolean a;
    public final /* synthetic */ zis b;
    public final adqq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zio(zis zisVar, adqq adqqVar) {
        super(null, null);
        this.b = zisVar;
        this.a = false;
        this.c = adqqVar;
    }

    @Override // defpackage.adqq
    public final void a(adnq adnqVar, admc admcVar) {
        this.b.a.execute(new uze((Object) this, (Object) adnqVar, (Object) admcVar, 7, (byte[]) null));
    }

    @Override // defpackage.adqq
    public final void be(admc admcVar) {
        this.b.a.execute(new xab(this, admcVar, 8, null));
    }

    @Override // defpackage.adqq
    public final void g(Object obj) {
        this.b.a.execute(new xab(this, obj, 9, null));
    }

    @Override // defpackage.adqq
    public final void h() {
        this.b.a.execute(new wxj(this, 16));
    }
}
