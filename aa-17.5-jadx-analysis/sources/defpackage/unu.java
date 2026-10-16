package defpackage;

import java.io.IOException;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class unu implements uon {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/ImageNetworkTileUnpacker");
    private final ackk b;
    private final uaj c;

    public unu(ackk ackkVar, uaj uajVar) {
        this.b = ackkVar;
        this.c = uajVar;
    }

    @Override // defpackage.uon
    public final uku a(pka pkaVar, abgl abglVar, ukp ukpVar, byte[] bArr, toz tozVar) {
        ukp ukpVar2;
        uku ukuVar;
        uaj uajVar;
        try {
        } catch (RuntimeException e) {
            e = e;
            ukpVar2 = ukpVar;
        }
        try {
            if (this.b != null && (uajVar = this.c) != null && uajVar.a() && !ujb.g(bArr)) {
                return ((uoh) this.b.a()).a(pkaVar, abglVar, ukpVar, bArr, tozVar);
            }
            ukpVar2 = ukpVar;
            try {
                ukuVar = uku.a(new ujb(pkaVar, abglVar, ukpVar2, bArr, tozVar, bArr.length), ukt.h);
            } catch (IOException e2) {
                ((ynz) ((ynz) ((ynz) a.h()).p(e2)).ai((char) 9488)).y("Error unpacking images tile at coords %s", ukpVar2);
                ukuVar = new uku(ukt.d, xvy.a);
            }
            ((ynz) a.a(ukuVar.a == ukt.h ? Level.FINE : Level.WARNING).ai(9486)).R("Network image tile unpack result for tile type %s and coords %s - %s", abglVar.name(), ukpVar2, ukuVar);
            return ukuVar;
        } catch (RuntimeException e3) {
            e = e3;
            ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai((char) 9487)).y("Unexpected exception unpacking disk image tile at coords %s", ukpVar2);
            return new uku(ukt.e, xvy.a);
        }
    }
}
