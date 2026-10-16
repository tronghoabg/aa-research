package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public class yo {
    private static HashMap<String, ArrayList<String>> uef = new HashMap<>();

    private static Signature[] oa(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList<String> uef(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (uef.get(str) != null) {
                return uef.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : oa(context, packageName)) {
                    String strUef = "error!";
                    if ("MD5".equals(str)) {
                        strUef = uef(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        strUef = uef(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strUef = uef(signature, "SHA256");
                    }
                    arrayList.add(strUef);
                }
            } catch (Exception unused) {
            }
            uef.put(str, arrayList);
        }
        return arrayList;
    }

    public static String uef(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayListUef = uef(context, "SHA1");
        if (arrayListUef != null && arrayListUef.size() != 0) {
            for (int i5 = 0; i5 < arrayListUef.size(); i5++) {
                sb2.append(arrayListUef.get(i5));
                if (i5 < arrayListUef.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private static String uef(Signature signature, String str) throws NoSuchAlgorithmException {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb2 = new StringBuilder();
                for (byte b5 : bArrDigest) {
                    sb2.append(Integer.toHexString((b5 & ForkServer.ERROR) | 256).substring(1, 3).toUpperCase());
                    sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                }
                return sb2.substring(0, sb2.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}
