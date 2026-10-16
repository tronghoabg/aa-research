package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zjn implements defpackage.aclt {
    private final defpackage.aclw a;

    public zjn(defpackage.aclw aclwVar) {
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.zjm a() {
        j$.util.Optional optional = (j$.util.Optional) ((defpackage.aclu) this.a).b;
        optional.getClass();
        java.lang.Object obj = defpackage.zjm.a;
        if (optional.isPresent()) {
            obj = optional.get();
        }
        return (defpackage.zjm) obj;
    }
}
