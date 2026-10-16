package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lia extends defpackage.lhr {
    final /* synthetic */ defpackage.lib a;

    public lia(defpackage.lib libVar) {
        this.a = libVar;
    }

    @Override // defpackage.lhr, defpackage.lhs
    public final void b() {
        defpackage.lib libVar = this.a;
        synchronized (libVar.b) {
            libVar.a = defpackage.lic.a;
        }
    }
}
