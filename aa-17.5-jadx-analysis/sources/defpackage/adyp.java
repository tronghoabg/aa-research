package defpackage;

/* loaded from: classes3.dex */
final class adyp extends adyn {
    @Override // defpackage.adyn
    public final boolean a(adyq adyqVar) {
        synchronized (adyqVar) {
            if (adyqVar.a != 0) {
                return false;
            }
            adyqVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.adyn
    public final void b(adyq adyqVar) {
        synchronized (adyqVar) {
            adyqVar.a = 0;
        }
    }
}
