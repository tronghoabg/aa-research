package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dag implements defpackage.dek {
    public boolean a;
    final /* synthetic */ defpackage.cld b;

    public dag(defpackage.cld cldVar) {
        this.b = cldVar;
    }

    @Override // defpackage.dek
    public final void a(defpackage.dej dejVar, java.lang.Object obj) {
        if (obj == this.b) {
            this.a = true;
        }
    }
}
