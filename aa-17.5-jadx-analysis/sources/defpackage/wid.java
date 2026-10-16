package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.net.URLEncoder;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class wid {
    public static final long a;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 86400000L;
    }

    static int a() {
        String strG = g();
        if (strG.contains(".")) {
            strG = strG.substring(strG.lastIndexOf(".") + 1);
        }
        return Integer.parseInt(strG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle b(abyr abyrVar) {
        abyq abyqVar = abyrVar.c;
        if (abyqVar == null) {
            abyqVar = abyq.a;
        }
        aboh abohVar = abyqVar.b;
        int size = abohVar.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            abyp abypVar = (abyp) abohVar.get(i);
            bundle.putString(abypVar.b, abypVar.c);
        }
        return bundle;
    }

    public static abow c(abow abowVar, byte[] bArr) {
        try {
            return abowVar.K().h(bArr, abnj.a()).q();
        } catch (abon e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.abxs d(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wid.d(android.content.Context):abxs");
    }

    public static String e(PackageInfo packageInfo) {
        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
                if (bArrDigest == null) {
                    return null;
                }
                int length = bArrDigest.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                Log.e("SurveyUtils", "Can't find SHA1.", e);
            }
        }
        return null;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || !Patterns.WEB_URL.matcher(woy.ar(str)).matches()) {
            Log.e("SurveyUtils", "Follow up URL was empty or invalid.");
            return "";
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            Uri uri = Uri.parse(str);
            try {
                wox woxVar = wia.c;
                if (wia.b(adio.a.gu().a(wia.b))) {
                    return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery(), null).toString();
                }
                return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery() != null ? URLEncoder.encode(uri.getQuery(), StandardCharsets.UTF_8) : "").toString();
            } catch (URISyntaxException e) {
                Log.e("SurveyUtils", e.getMessage());
            }
        }
        Log.e("SurveyUtils", "Follow up URL is not http or https.");
        return "";
    }

    static String g() {
        wox woxVar = wia.c;
        Context context = wia.b;
        adgy adgyVar = adgy.a;
        String strA = adgyVar.gu().a(context);
        if (!strA.equals(CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE)) {
            return strA;
        }
        wox woxVar2 = wia.c;
        return adgyVar.gu().b(wia.b);
    }

    public static void h(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void i(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static boolean j(String str, String str2) {
        String[] strArrSplit = TextUtils.split(str2, ",");
        int i = 0;
        while (true) {
            if (i >= strArrSplit.length) {
                break;
            }
            strArrSplit[i] = strArrSplit[i].trim();
            i++;
        }
        for (String str3 : strArrSplit) {
            if (TextUtils.equals(str3, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static boolean l(abyn abynVar) {
        abyo abyoVar = abynVar.f;
        if (abyoVar == null) {
            abyoVar = abyo.a;
        }
        return abyoVar.b;
    }

    public static boolean m(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean n(abyn abynVar) {
        if (abynVar.g.size() <= 1) {
            abyt abytVar = (abyt) abynVar.g.get(0);
            int i = abytVar.i;
            int iAx = a.ax(i);
            if (iAx != 0 && iAx == 3) {
                abxm abxmVar = (abytVar.c == 4 ? (abzd) abytVar.d : abzd.a).c;
                if (abxmVar == null) {
                    abxmVar = abxm.a;
                }
                Iterator<E> it = abxmVar.b.iterator();
                while (it.hasNext()) {
                    int iAz = a.az(((abxl) it.next()).c);
                    if (iAz == 0) {
                        iAz = 1;
                    }
                    if (iAz == 4) {
                        return true;
                    }
                }
                return false;
            }
            int iAx2 = a.ax(i);
            if (iAx2 != 0 && iAx2 == 5) {
                return false;
            }
        }
        return true;
    }
}
