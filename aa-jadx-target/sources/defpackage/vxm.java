package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxm extends defpackage.wag {
    public vxm(ajht ajhtVar) {
        super(ajhtVar);
    }

    @Override // defpackage.wag
    protected final void a(defpackage.rkq rkqVar) {
        ajht ajhtVar = this.b;
        if ((ajhtVar.b & 128) != 0) {
            ajhn ajhnVar = ajhtVar.j;
            if (ajhnVar == null) {
                ajhnVar = ajhn.a;
            }
            rkqVar.z("PCAS", java.lang.Long.valueOf(ajhnVar.c));
            rkqVar.z("PCOS", java.lang.Long.valueOf(ajhnVar.d));
            rkqVar.z("PDAS", java.lang.Long.valueOf(ajhnVar.e));
        }
    }
}
