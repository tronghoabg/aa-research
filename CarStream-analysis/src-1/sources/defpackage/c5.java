package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import java.security.MessageDigest;
import java.util.UUID;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class c5 {
    public static final UUID a = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;

    public static String a(Context context) {
        String str = "";
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
        } catch (Throwable unused) {
            if (cursorQuery != null) {
            }
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable unused2) {
                }
            }
            return "";
        }
        String string = cursorQuery.getString(1);
        if (string != null) {
            if (!"null".equals(string)) {
                str = string;
            }
        }
        try {
            cursorQuery.close();
        } catch (Throwable unused3) {
        }
        return str;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 >> 4) & 15, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    public static String c() {
        String str = b;
        return str == null ? "" : str;
    }

    public static synchronized void d(Context context) {
        if (b != null) {
            return;
        }
        String strG = xc.g(context, "hwid", "");
        b = strG;
        if (!strG.isEmpty()) {
            c = context.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getString(xc.h("hwidH1"), "");
            d = context.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getString(xc.h("hwidH2"), "");
            e = context.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getString(xc.h("hwidH3"), "");
            f = context.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getString(xc.h("hwidH4"), "");
            return;
        }
        c = e("cnt1|wv|", f());
        d = e("cnt1|gsf|", a(context));
        e = e("cnt1|aid|", Settings.Secure.getString(context.getContentResolver(), "android_id"));
        String strE = e("cnt1|bld|", Build.BRAND + "|" + Build.DEVICE + "|" + Build.MODEL + "|" + Build.PRODUCT + "|" + Build.HARDWARE + "|" + Build.BOARD);
        f = strE;
        String str = c;
        String str2 = d;
        String str3 = e;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(strE);
        String strE2 = e("", sb.toString());
        b = strE2;
        xc.p(context, "hwid", strE2);
        xc.p(context, "hwidH1", c);
        xc.p(context, "hwidH2", d);
        xc.p(context, "hwidH3", e);
        xc.p(context, "hwidH4", f);
    }

    public static String e(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return "";
        }
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(str.concat(str2).getBytes("UTF-8")));
        } catch (Exception unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x003f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Unreachable blocks removed: 7, instructions: 8 */
    public static java.lang.String f() {
        /*
            r0 = 28
            r1 = 0
            android.media.MediaDrm r2 = new android.media.MediaDrm     // Catch: java.lang.Throwable -> L21
            java.util.UUID r3 = defpackage.c5.a     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "deviceUniqueId"
            byte[] r1 = r2.getPropertyByteArray(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = b(r1)     // Catch: java.lang.Throwable -> L20
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            if (r3 < r0) goto L1c
            r2.release()     // Catch: java.lang.Throwable -> L1f
            return r1
        L1c:
            r2.release()     // Catch: java.lang.Throwable -> L1f
        L1f:
            return r1
        L20:
            r1 = r2
        L21:
            java.lang.String r2 = ""
            if (r1 == 0) goto L30
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L30
            if (r3 < r0) goto L2d
            r1.release()     // Catch: java.lang.Throwable -> L30
            goto L30
        L2d:
            r1.release()     // Catch: java.lang.Throwable -> L30
        L30:
            return r2
        L31:
            r2 = move-exception
            if (r1 == 0) goto L3f
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3f
            if (r3 < r0) goto L3c
            r1.release()     // Catch: java.lang.Throwable -> L3f
            goto L3f
        L3c:
            r1.release()     // Catch: java.lang.Throwable -> L3f
        L3f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5.f():java.lang.String");
    }
}
