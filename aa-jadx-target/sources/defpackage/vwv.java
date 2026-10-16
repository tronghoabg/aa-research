package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwv extends defpackage.wag {
    public vwv(ajht ajhtVar) {
        super(ajhtVar);
    }

    @Override // defpackage.wag
    protected final void a(defpackage.rkq rkqVar) {
        ajht ajhtVar = this.b;
        if ((ajhtVar.b & 32) != 0) {
            ajgg ajggVar = ajhtVar.h;
            if (ajggVar == null) {
                ajggVar = ajgg.a;
            }
            int i = 0;
            int i2 = 0;
            for (ajgf ajgfVar : ajggVar.b) {
                i += ajgfVar.l;
                i2 += ajgfVar.k;
            }
            rkqVar.z("TRQS", java.lang.Integer.valueOf(i));
            rkqVar.z("TRPS", java.lang.Integer.valueOf(i2));
        }
    }
}
