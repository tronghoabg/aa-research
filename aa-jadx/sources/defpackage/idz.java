package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class idz implements defpackage.idi {
    final /* synthetic */ defpackage.ieb a;

    public idz(defpackage.ieb iebVar) {
        this.a = iebVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.idi
    public final void a(boolean z) {
        java.util.ArrayList arrayList;
        defpackage.igg.f();
        defpackage.ieb iebVar = this.a;
        synchronized (iebVar) {
            arrayList = new java.util.ArrayList((java.util.Collection) iebVar.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.idi) arrayList.get(i)).a(z);
        }
    }
}
