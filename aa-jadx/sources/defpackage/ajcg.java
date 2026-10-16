package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajcg implements defpackage.afdk, defpackage.afeb {
    private final defpackage.afdk a;
    private final defpackage.afdo b;

    public ajcg(defpackage.afdk afdkVar, defpackage.afdo afdoVar) {
        this.a = afdkVar;
        this.b = afdoVar;
    }

    @Override // defpackage.afeb
    public final java.lang.StackTraceElement di() {
        return null;
    }

    @Override // defpackage.afeb
    public final defpackage.afeb dj() {
        defpackage.afdk afdkVar = this.a;
        if (afdkVar instanceof defpackage.afeb) {
            return (defpackage.afeb) afdkVar;
        }
        return null;
    }

    @Override // defpackage.afdk
    public final defpackage.afdo gT() {
        return this.b;
    }

    @Override // defpackage.afdk
    public final void w(java.lang.Object obj) {
        this.a.w(obj);
    }
}
