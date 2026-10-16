package com.waze;

import android.util.Base64;
import androidx.compose.foundation.style.StylePropertiesKt;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lh {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25149a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f25150b = {105, -35, -88, 69, 92, 125, -44, StylePropertiesKt.ContentColorId, 75, -13, 83, -73, 115, StylePropertiesKt.LetterSpacingId, 78, -20};

    public static boolean a() {
        int iL = com.google.android.gms.common.h.b().l(mg.a());
        if (iL == 0) {
            return true;
        }
        com.waze.shared_infra.i.h.c("Google play services not available (reason: " + iL + ")");
        return false;
    }

    static byte[] b(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f25150b);
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            try {
                cipher.init(1, new SecretKeySpec(Base64.decode(str2, 0), "AES"), ivParameterSpec);
            } catch (InvalidAlgorithmParameterException unused) {
            } catch (InvalidKeyException unused2) {
                return null;
            }
            return cipher.doFinal(str.getBytes());
        } catch (NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused3) {
            return null;
        }
    }
}
