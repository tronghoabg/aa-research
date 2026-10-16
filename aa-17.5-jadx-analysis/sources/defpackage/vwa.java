package defpackage;

/* loaded from: classes.dex */
public final class vwa extends vzk {
    public vwa(ajgu ajguVar) {
        super(ajguVar);
    }

    @Override // defpackage.vzk
    protected final void a(rju rjuVar) {
        ajgu ajguVar = this.b;
        if ((ajguVar.b & 32) != 0) {
            ajfh ajfhVar = ajguVar.h;
            if (ajfhVar == null) {
                ajfhVar = ajfh.a;
            }
            int i = 0;
            int i2 = 0;
            for (ajfg ajfgVar : ajfhVar.b) {
                i += ajfgVar.l;
                i2 += ajfgVar.k;
            }
            rjuVar.z("TRQS", Integer.valueOf(i));
            rjuVar.z("TRPS", Integer.valueOf(i2));
        }
    }
}
