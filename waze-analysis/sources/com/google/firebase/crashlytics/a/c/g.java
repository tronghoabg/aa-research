package com.google.firebase.crashlytics.a.c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9183a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f9184b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int a() {
        boolean zL = l();
        ?? r0 = zL;
        if (m()) {
            r0 = (zL ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static int b(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, f(context));
    }

    public static synchronized long c(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String e(Context context) {
        int iB = b(context, "com.google.firebase.crashlytics.mapping_file_id", TypedValues.Custom.S_STRING);
        if (iB == 0) {
            iB = b(context, "com.crashlytics.android.build_id", TypedValues.Custom.S_STRING);
        }
        if (iB != 0) {
            return context.getResources().getString(iB);
        }
        return null;
    }

    public static String f(Context context) throws Resources.NotFoundException {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i2);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String g(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            char[] cArr2 = f9184b;
            int i3 = i2 + i2;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & StylePropertiesKt.RightId];
        }
        return new String(cArr);
    }

    public static String h(String str) {
        return o(str.getBytes());
    }

    public static String i(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static void j(Closeable closeable, String str) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                com.google.firebase.crashlytics.a.i.a().e(str, e2);
            }
        }
    }

    public static boolean k(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean l() {
        return Build.PRODUCT.contains("sdk") || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu");
    }

    public static boolean m() {
        boolean zL = l();
        String str = Build.TAGS;
        if ((zL || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zL && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean n(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    private static String o(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return g(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            com.google.firebase.crashlytics.a.i.a().e("Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }
}
