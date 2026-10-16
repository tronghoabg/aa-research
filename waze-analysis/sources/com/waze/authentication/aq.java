package com.waze.authentication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.waze.NativeManager;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq implements ar {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f15736a = {'W', 'a', 'z', 'e', 'A', 'n', 'd', 'r', 'o', 'i', 'd'};

    /* renamed from: b, reason: collision with root package name */
    private final Context f15737b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15738c;

    public aq(Context context) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("PasswordEncryption");
        this.f15737b = context;
        this.f15738c = eVarD;
    }

    private final byte[] c() {
        Context context = this.f15737b;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        try {
            if (string != null) {
                return string.getBytes("utf-8");
            }
            int i2 = 0;
            SharedPreferences sharedPreferences = context.getSharedPreferences(NativeManager.PREFS_DB, 0);
            long j2 = 0;
            if (sharedPreferences.contains("Unique id")) {
                return d(sharedPreferences.getLong("Unique id", 0L));
            }
            byte[] bArr = new byte[8];
            new SecureRandom(d(SystemClock.elapsedRealtime())).nextBytes(bArr);
            int i3 = 0;
            while (i2 < 8) {
                j2 += (bArr[i2] & 255) << (i3 * 8);
                i2++;
                i3++;
            }
            Long.valueOf(j2).getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("Unique id", j2);
            editorEdit.apply();
            return bArr;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static byte[] d(long j2) {
        byte[] bArr = new byte[8];
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j2 >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    @Override // com.waze.authentication.ar
    public final String a(String str) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArrB = str != null ? com.waze.utils.a.b(str) : new byte[0];
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(new PBEKeySpec(f15736a));
            Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
            cipher.init(2, secretKeyGenerateSecret, new PBEParameterSpec(c(), 20));
            return new String(cipher.doFinal(bArrB));
        } catch (Exception e2) {
            com.waze.shared_infra.i.e eVar = this.f15738c;
            eVar.d("Cannot decrypt password: ".concat(String.valueOf(e2.getMessage())));
            eVar.d(Log.getStackTraceString(e2));
            return null;
        }
    }

    @Override // com.waze.authentication.ar
    public final String b(String str) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bytes = str != null ? str.getBytes("utf-8") : new byte[0];
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(new PBEKeySpec(f15736a));
            Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
            cipher.init(1, secretKeyGenerateSecret, new PBEParameterSpec(c(), 20));
            return com.waze.utils.a.a(cipher.doFinal(bytes));
        } catch (Exception unused) {
            return "";
        }
    }
}
