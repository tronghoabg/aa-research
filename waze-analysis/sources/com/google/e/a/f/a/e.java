package com.google.e.a.f.a;

import androidx.compose.foundation.style.StylePropertiesKt;
import com.google.e.a.e.ab;
import com.google.e.a.e.ag;
import com.google.e.a.e.ar;
import com.google.e.a.e.k;
import com.google.e.a.f;
import com.google.e.a.m;
import com.google.e.a.n;
import com.google.e.a.q;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {
    public static q a(n nVar, ag agVar) throws GeneralSecurityException {
        if (!ar.b(nVar)) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        HashMap map = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < nVar.a(); i3++) {
            m mVarC = nVar.c(i3);
            if (mVarC.c().equals(f.f8466a)) {
                com.google.e.a.k.a aVarD = a.d(mVarC.j());
                mVarC.b();
                ab.b(aVarD, new e(), map);
            }
        }
        if (((k) nVar.b(k.class)) != null) {
            throw null;
        }
        nVar.d();
        ab.a(map);
        return new d(i2);
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & StylePropertiesKt.RightId));
        }
        return sb.toString();
    }

    public static byte[] c(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 + i2;
            int iDigit = Character.digit(str.charAt(i3), 16);
            int iDigit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i2] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static com.google.e.a.f.e d(n nVar, ag agVar) throws GeneralSecurityException {
        if (!ar.b(nVar)) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        m mVarD = nVar.d();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < nVar.a(); i2++) {
            m mVarC = nVar.c(i2);
            if (mVarC.c().equals(f.f8466a)) {
                ab.b(a.d(mVarC.j()), (com.google.e.a.f.e) agVar.a(mVarC), map);
            }
        }
        ab.a(map);
        return new b((char[]) null);
    }
}
