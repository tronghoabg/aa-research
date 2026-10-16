package defpackage;

import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class uog implements uom {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/VectorDiskTileUnpacker");
    private final boolean b;
    private final uod c;
    private final erb d;

    public uog(erb erbVar, uod uodVar, boolean z) {
        this.d = erbVar;
        this.c = uodVar;
        this.b = z;
    }

    @Override // defpackage.uom
    public final uku a(pka pkaVar, abgl abglVar, ukp ukpVar, byte[] bArr, boolean z, toz tozVar) {
        ukp ukpVar2;
        try {
            ukpVar2 = ukpVar;
            try {
                uku ukuVarK = ukx.k(pkaVar, abglVar, ukpVar2, bArr, z, this.d, tozVar, this.c.j, this.b);
                ukt uktVar = ukuVarK.a;
                ((ynz) a.a(uktVar == ukt.h ? Level.FINE : Level.WARNING).ai(9495)).R("Disk vector tile unpack result for tile type %s and coords %s - %s", abglVar.name(), ukpVar2, uktVar);
                return ukuVarK;
            } catch (RuntimeException e) {
                e = e;
                ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai((char) 9496)).y("Unexpected exception unpacking disk vector tile at coords %s", ukpVar2);
                return new uku(ukt.e, xvy.a);
            }
        } catch (RuntimeException e2) {
            e = e2;
            ukpVar2 = ukpVar;
        }
    }
}
