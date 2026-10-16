package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vya extends defpackage.wag {
    public vya(ajht ajhtVar) {
        super(ajhtVar);
    }

    @Override // defpackage.wag
    protected final void a(defpackage.rkq rkqVar) {
        ajht ajhtVar = this.b;
        if ((ajhtVar.b & 16) != 0) {
            ajhu ajhuVar = ajhtVar.g;
            if (ajhuVar == null) {
                ajhuVar = ajhu.a;
            }
            rkqVar.z("DMS", java.lang.Long.valueOf(ajhuVar.c));
        }
    }
}
