package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class fqa implements aiyl, afev {
    final /* synthetic */ fqd a;

    public fqa(fqd fqdVar) {
        this.a = fqdVar;
    }

    @Override // defpackage.aiyl
    public final /* bridge */ /* synthetic */ Object a(Object obj, afck afckVar) {
        this.a.h((fpz) obj);
        return afak.a;
    }

    @Override // defpackage.afev
    public final aezn eV() {
        return new afeo(2, this.a, fqd.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aiyl) && (obj instanceof afev)) {
            return affa.f(eV(), ((afev) obj).eV());
        }
        return false;
    }

    public final int hashCode() {
        return eV().hashCode();
    }
}
