package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import androidx.car.app.CarContext;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class a6 {
    public static final String a = xc.b("Iw5tsy21Dc5n7SJUeqIs/FaTY/wmVG2mPec=");
    public static final ExecutorService b = Executors.newSingleThreadExecutor();
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static String d;

    public static void a(Context context, y5 y5Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", ec.o(context));
            jSONObject.put("hwid", c5.c());
            jSONObject.put("hw", d());
            jSONObject.put("device", b(context));
            jSONObject.put("nonce", Long.toHexString(System.nanoTime()));
            JSONObject jSONObjectL = w1.l(context);
            if (jSONObjectL != null) {
                jSONObject.put("loc", jSONObjectL);
            }
            b.execute(new s5(xc.b("ZAwo7D3nR4Jt"), jSONObject, context, y5Var));
        } catch (Exception unused) {
            c.post(new f(y5Var, 24));
        }
    }

    public static JSONObject b(Context context) throws JSONException {
        int i;
        boolean zBooleanValue;
        byte[] byteArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("android", Build.VERSION.SDK_INT);
        synchronized (ec.class) {
            Boolean bool = ec.a;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                String strQ = ec.q("cnt-probe");
                Boolean boolValueOf = Boolean.valueOf(strQ != null && "cnt-probe".equals(ec.p(strQ)));
                ec.a = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            }
        }
        jSONObject.put("tok_hw", zBooleanValue);
        String str = "";
        try {
            String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str2 != null) {
                str = str2;
            }
        } catch (Throwable unused) {
        }
        jSONObject.put(CarContext.APP_SERVICE, str);
        String str3 = d;
        if (str3 == null) {
            d = "";
            try {
                PackageManager packageManager = context.getPackageManager();
                byteArray = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    SigningInfo signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                    if (signingInfo != null) {
                        Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                        if (apkContentsSigners != null && apkContentsSigners.length > 0) {
                            byteArray = apkContentsSigners[0].toByteArray();
                        }
                    }
                } else {
                    Signature[] signatureArr = packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                }
            } catch (Throwable unused2) {
            }
            if (byteArray == null) {
                str3 = d;
            } else {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(byteArray);
                StringBuilder sb = new StringBuilder(64);
                for (byte b2 : bArrDigest) {
                    sb.append(String.format("%02X", Byte.valueOf(b2)));
                }
                d = sb.toString();
                str3 = d;
            }
        }
        jSONObject.put("cert", str3);
        return jSONObject;
    }

    public static void c(Context context) {
        if (ec.j(context)) {
            if ((System.currentTimeMillis() / 1000) - context.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getLong(xc.h("licenseLastCheck"), 0L) < 3600) {
                return;
            }
            a(context, new c1(context, 5));
        }
    }

    public static JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = c5.c;
        if (str == null) {
            str = "";
        }
        jSONObject.put("h1", str);
        String str2 = c5.d;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("h2", str2);
        String str3 = c5.e;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("h3", str3);
        String str4 = c5.f;
        jSONObject.put("h4", str4 != null ? str4 : "");
        return jSONObject;
    }

    public static JSONObject e(String str) {
        try {
            return new JSONObject(new String(Base64.decode(str.substring(0, str.indexOf(46)), 8), "UTF-8"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, UnsupportedEncodingException {
        int iIndexOf;
        try {
            iIndexOf = str.indexOf(46);
        } catch (Exception unused) {
        }
        if (iIndexOf <= 0) {
            return false;
        }
        byte[] bytes = str.substring(0, iIndexOf).getBytes("UTF-8");
        byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 8);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEuFdBn2NqQ44nIEILSuDEFrEM4b3GSr04n0kPEd+YREA2YWFgNnJUQEsImoMm1e8mBjtlrvfIYGAj7OONFPmTcA==", 0)));
        java.security.Signature signature = java.security.Signature.getInstance("SHA256withECDSA");
        signature.initVerify(publicKeyGeneratePublic);
        signature.update(bytes);
        return signature.verify(bArrDecode);
    }
}
