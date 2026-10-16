package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class yk {
    public static final yk a = new yk(null, new HashMap(), true);
    public final Map b;
    public final boolean c;
    public final Map d = new HashMap();
    public final PackageManager e;
    public final boolean f;

    public yk(PackageManager packageManager, Map map, boolean z) {
        this.e = packageManager;
        this.b = map;
        this.c = z;
        boolean z2 = false;
        if (packageManager != null && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            z2 = true;
        }
        this.f = z2;
    }

    private static MessageDigest b() {
        try {
            return MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException e) {
            Log.e("CarApp.Val", "Could not find SHA256 hash algorithm", e);
            return null;
        }
    }

    public final String a(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        MessageDigest messageDigestB = b();
        if (messageDigestB == null) {
            return null;
        }
        messageDigestB.update(byteArray);
        byte[] bArrDigest = messageDigestB.digest();
        StringBuilder sb = new StringBuilder((r0 * 3) - 1);
        for (byte b : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
