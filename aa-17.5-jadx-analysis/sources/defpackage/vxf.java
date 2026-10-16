package defpackage;

/* loaded from: classes.dex */
public final class vxf extends vzk {
    public vxf(ajgu ajguVar) {
        super(ajguVar);
    }

    @Override // defpackage.vzk
    protected final void a(rju rjuVar) {
        ajgu ajguVar = this.b;
        if ((ajguVar.b & 16) != 0) {
            ajgv ajgvVar = ajguVar.g;
            if (ajgvVar == null) {
                ajgvVar = ajgv.a;
            }
            rjuVar.z("DMS", Long.valueOf(ajgvVar.c));
        }
    }
}
