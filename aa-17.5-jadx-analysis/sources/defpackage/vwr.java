package defpackage;

/* loaded from: classes.dex */
public final class vwr extends vzk {
    public vwr(ajgu ajguVar) {
        super(ajguVar);
    }

    @Override // defpackage.vzk
    protected final void a(rju rjuVar) {
        ajgu ajguVar = this.b;
        if ((ajguVar.b & 128) != 0) {
            ajgo ajgoVar = ajguVar.j;
            if (ajgoVar == null) {
                ajgoVar = ajgo.a;
            }
            rjuVar.z("PCAS", Long.valueOf(ajgoVar.c));
            rjuVar.z("PCOS", Long.valueOf(ajgoVar.d));
            rjuVar.z("PDAS", Long.valueOf(ajgoVar.e));
        }
    }
}
