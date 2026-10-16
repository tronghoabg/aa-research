package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class vxo extends vzk {
    public vxo(ajgu ajguVar) {
        super(ajguVar);
    }

    @Override // defpackage.vzk
    protected final void a(rju rjuVar) {
        ajgu ajguVar = this.b;
        int i = ajguVar.b;
        int i2 = i & 2048;
        if (i2 == 0 && (i & 4096) == 0) {
            return;
        }
        if (i2 != 0) {
            String string = UUID.randomUUID().toString();
            ajhb ajhbVar = ajguVar.n;
            if (ajhbVar == null) {
                ajhbVar = ajhb.a;
            }
            rjuVar.w("TRA", string, ajhbVar.f());
            return;
        }
        if ((i & 4096) != 0) {
            String string2 = UUID.randomUUID().toString();
            ajfr ajfrVar = ajguVar.o;
            if (ajfrVar == null) {
                ajfrVar = ajfr.a;
            }
            rjuVar.w("TRB", string2, ajfrVar.f());
        }
    }
}
