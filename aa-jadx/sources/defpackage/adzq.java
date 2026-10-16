package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adzq extends defpackage.adzo {
    @Override // defpackage.adzo
    public final boolean a(defpackage.adzr adzrVar) {
        synchronized (adzrVar) {
            if (adzrVar.a != 0) {
                return false;
            }
            adzrVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.adzo
    public final void b(defpackage.adzr adzrVar) {
        synchronized (adzrVar) {
            adzrVar.a = 0;
        }
    }
}
