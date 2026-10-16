package com.google.e.a.i.a;

import com.google.e.a.e.ag;
import com.google.e.a.e.ar;
import com.google.e.a.f;
import com.google.e.a.j.v;
import com.google.e.a.m;
import com.google.e.a.n;
import com.google.e.a.z;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {
    public static z a(n nVar, ag agVar) throws GeneralSecurityException {
        if (!ar.b(nVar)) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < nVar.a(); i2++) {
            m mVarC = nVar.c(i2);
            if (mVarC.c().equals(f.f8466a)) {
                arrayList.add((z) agVar.a(mVarC));
            }
        }
        z zVar = (z) agVar.a(nVar.d());
        if (zVar != null) {
            return new d(arrayList, zVar);
        }
        throw new GeneralSecurityException("No primary set");
    }

    public static byte[] b(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) throws IllegalStateException, GeneralSecurityException {
        Mac mac = (Mac) v.f8759b.a(str);
        if (i2 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i2];
        mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i3 = 1;
        int i4 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr3);
            mac.update((byte) i3);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i5 = i4 + length;
            if (i5 >= i2) {
                System.arraycopy(bArrDoFinal, 0, bArr4, i4, i2 - i4);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, i4, length);
            i3++;
            i4 = i5;
        }
    }
}
