package defpackage;

import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class uoh implements uon {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/VectorNetworkTileUnpacker");
    private final aezk b;
    private final boolean c;
    private final uod d;
    private final erb e;

    public uoh(erb erbVar, aezk aezkVar, uod uodVar, boolean z) {
        this.e = erbVar;
        this.b = aezkVar;
        this.d = uodVar;
        this.c = z;
    }

    @Override // defpackage.uon
    public final uku a(pka pkaVar, abgl abglVar, ukp ukpVar, byte[] bArr, toz tozVar) {
        ukp ukpVar2;
        RuntimeException runtimeException;
        try {
            boolean z = true;
            if (abglVar == abgl.GMM_SATELLITE) {
                try {
                    if (!ujb.g(bArr)) {
                        z = false;
                    }
                } catch (RuntimeException e) {
                    runtimeException = e;
                    ukpVar2 = ukpVar;
                    ((ynz) ((ynz) ((ynz) a.g()).p(runtimeException)).ai((char) 9498)).y("Unexpected exception unpacking network vector tile at coords %s", ukpVar2);
                    return new uku(ukt.e, xvy.a);
                }
            }
            ukpVar2 = ukpVar;
            try {
                uku ukuVarK = ukx.k(pkaVar, abglVar, ukpVar2, bArr, z, this.e, tozVar, this.d.j, this.c);
                ((ynz) a.a(ukuVarK.a == ukt.h ? Level.FINE : Level.WARNING).ai(9497)).R("Network vector tile unpack result for tile type %s and coords %s - %s", abglVar.name(), ukpVar2, ukuVarK);
                return ukuVarK;
            } catch (RuntimeException e2) {
                e = e2;
                runtimeException = e;
                ((ynz) ((ynz) ((ynz) a.g()).p(runtimeException)).ai((char) 9498)).y("Unexpected exception unpacking network vector tile at coords %s", ukpVar2);
                return new uku(ukt.e, xvy.a);
            }
        } catch (RuntimeException e3) {
            e = e3;
            ukpVar2 = ukpVar;
        }
    }
}
