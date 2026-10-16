package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;

/* loaded from: classes3.dex */
final class unt implements uom {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/ImageDiskTileUnpacker");
    private final ackk b;
    private final uaj c;

    public unt(ackk ackkVar, uaj uajVar) {
        this.b = ackkVar;
        this.c = uajVar;
    }

    @Override // defpackage.uom
    public final uku a(pka pkaVar, abgl abglVar, ukp ukpVar, byte[] bArr, boolean z, toz tozVar) throws IOException {
        RuntimeException runtimeException;
        ukp ukpVar2;
        uaj uajVar;
        uku ukuVar;
        ujb ujbVar;
        if (z) {
            try {
                uajVar = this.c;
            } catch (RuntimeException e) {
                e = e;
                ukpVar2 = ukpVar;
            }
            try {
                if (uajVar != null && uajVar.a() && !ujb.g(bArr)) {
                    return ((uog) this.b.a()).a(pkaVar, abglVar, ukpVar, bArr, true, tozVar);
                }
                ukpVar2 = ukpVar;
                byte[] bArr2 = bArr;
                try {
                    int length = bArr2.length;
                    if (length == 0) {
                        ujbVar = new ujb(pkaVar, abglVar, ukpVar2, bArr2, tozVar, 0);
                    } else {
                        if (bArr2[0] == ton.a[0]) {
                            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr2));
                            if (dataInputStream.readInt() == 1146241364) {
                                int iK = lws.K(dataInputStream);
                                if (iK != 7 && iK != 8) {
                                    throw new IOException(a.bn(iK, "Version mismatch: 7 or 8 expected, ", " found"));
                                }
                                ukp ukpVar3 = new ukp(lws.K(dataInputStream), lws.K(dataInputStream), lws.K(dataInputStream), null);
                                if (ukpVar3.b != ukpVar2.b || ukpVar3.c != ukpVar2.c || ukpVar3.a != ukpVar2.a) {
                                    throw new IOException("Expected tile coords: " + ukpVar2.toString() + " but received " + ukpVar3.toString());
                                }
                                lws.K(dataInputStream);
                                int iK2 = lws.K(dataInputStream);
                                int iK3 = lws.K(dataInputStream);
                                int iK4 = lws.K(dataInputStream);
                                if (iK2 < 0 || iK3 < 0) {
                                    throw new IOException(a.bo(iK3, iK2, "The tile image dimensions were invalid (width=", ", height="));
                                }
                                if (iK4 < 0) {
                                    throw new IOException(a.bn(iK4, "The tile image size of ", " is not valid"));
                                }
                                byte[] bArr3 = new byte[iK4];
                                dataInputStream.readFully(bArr3);
                                bArr2 = bArr3;
                            }
                        }
                        ujbVar = new ujb(pkaVar, abglVar, ukpVar2, bArr2, tozVar, length);
                    }
                    ukuVar = uku.a(ujbVar, ukt.h);
                } catch (IOException e2) {
                    ((ynz) ((ynz) ((ynz) a.h()).p(e2)).ai((char) 9481)).u("Error unpacking image tile");
                    ukuVar = new uku(ukt.d, xvy.a);
                }
                ukt uktVar = ukuVar.a;
                ((ynz) a.a(uktVar == ukt.h ? Level.FINE : Level.WARNING).ai(9482)).R("Disk vector tile unpack result for tile type %s and coords %s - %s", abglVar.name(), ukpVar2, uktVar);
                return ukuVar;
            } catch (RuntimeException e3) {
                e = e3;
                runtimeException = e;
                ((ynz) ((ynz) ((ynz) a.g()).p(runtimeException)).ai((char) 9483)).y("Unexpected exception unpacking disk image tile at coords %s", ukpVar2);
                return new uku(ukt.e, xvy.a);
            }
        }
        try {
            yob yobVar = a;
            ((ynz) yobVar.a(uys.a).ai(9485)).y("unpacking uncompressed tiles not supported for %s tile type", abglVar.name());
            ((ynz) ((ynz) yobVar.g()).ai(9484)).y("Unpacking uncompressed tiles not supported for tile type: %s", abglVar.name());
            return new uku(ukt.c, xvy.a);
        } catch (RuntimeException e4) {
            runtimeException = e4;
            ukpVar2 = ukpVar;
        }
        ((ynz) ((ynz) ((ynz) a.g()).p(runtimeException)).ai((char) 9483)).y("Unexpected exception unpacking disk image tile at coords %s", ukpVar2);
        return new uku(ukt.e, xvy.a);
    }
}
