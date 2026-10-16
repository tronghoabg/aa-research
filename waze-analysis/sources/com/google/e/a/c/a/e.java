package com.google.e.a.c.a;

import com.google.e.a.c.i;
import com.google.e.a.e.ab;
import com.google.e.a.e.ag;
import com.google.e.a.e.ar;
import com.google.e.a.e.k;
import com.google.e.a.f;
import com.google.e.a.m;
import com.google.e.a.n;
import com.waze.strings.DisplayStrings;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {
    public static com.google.e.a.d a(n nVar, ag agVar) throws GeneralSecurityException {
        com.google.e.a.k.a aVarF;
        if (!ar.b(nVar)) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < nVar.a(); i2++) {
            m mVarC = nVar.c(i2);
            if (mVarC.c().equals(f.f8466a)) {
                com.google.e.a.d dVar = (com.google.e.a.d) agVar.a(mVarC);
                com.google.d.m.a.a.b bVarJ = mVarC.j();
                if (bVarJ instanceof i) {
                    aVarF = ((i) bVarJ).h();
                } else {
                    if (!(bVarJ instanceof com.google.e.a.e.i)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + bVarJ.getClass().getName() + " with parameters " + String.valueOf(bVarJ.e()));
                    }
                    aVarF = ((com.google.e.a.e.i) bVarJ).f();
                }
                ab.b(aVarF, new c(dVar, mVarC.b()), map);
            }
        }
        if (((k) nVar.b(k.class)) == null) {
            return new d(new c((com.google.e.a.d) agVar.a(nVar.d()), nVar.d().b()), ab.a(map));
        }
        throw null;
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[length] = -128;
        return bArrCopyOf;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            byte b3 = (byte) ((b2 + b2) & DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2);
            bArr2[i2] = b3;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((bArr[i3] >> 7) & 1) | b3);
            }
            i2 = i3;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
