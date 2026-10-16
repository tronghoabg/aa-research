package com.google.e.a.d.a;

import android.security.keystore.KeyGenParameterSpec;
import com.google.e.a.e.al;
import com.google.e.a.j.aj;
import com.google.e.a.o;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements o {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8407a = new Object();

    static boolean c(String str) {
        synchronized (f8407a) {
            String strB = aj.b(str);
            if (d.b(strB)) {
                return false;
            }
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpecBuild);
            keyGenerator.generateKey();
            return true;
        }
    }

    @Override // com.google.e.a.o
    public final com.google.e.a.a a(String str) throws GeneralSecurityException {
        e eVar;
        try {
            synchronized (f8407a) {
                eVar = new e(aj.b(str));
                byte[] bArrB = al.b(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(bArrB, eVar.a(eVar.b(bArrB, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return eVar;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @Override // com.google.e.a.o
    public final boolean b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
