package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vyj extends defpackage.wag {
    public vyj(ajht ajhtVar) {
        super(ajhtVar);
    }

    @Override // defpackage.wag
    protected final void a(defpackage.rkq rkqVar) {
        ajht ajhtVar = this.b;
        int i = ajhtVar.b;
        int i2 = i & 2048;
        if (i2 == 0 && (i & 4096) == 0) {
            return;
        }
        if (i2 != 0) {
            java.lang.String string = java.util.UUID.randomUUID().toString();
            ajia ajiaVar = ajhtVar.n;
            if (ajiaVar == null) {
                ajiaVar = ajia.a;
            }
            rkqVar.w("TRA", string, ajiaVar.f());
            return;
        }
        if ((i & 4096) != 0) {
            java.lang.String string2 = java.util.UUID.randomUUID().toString();
            ajgq ajgqVar = ajhtVar.o;
            if (ajgqVar == null) {
                ajgqVar = ajgq.a;
            }
            rkqVar.w("TRB", string2, ajgqVar.f());
        }
    }
}
