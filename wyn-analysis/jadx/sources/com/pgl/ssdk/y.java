package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static int f32623a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f32624b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f32625c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f32626d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f32627e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f32628f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f32629g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f32630h = false;

    /* renamed from: i, reason: collision with root package name */
    private static InputManager f32631i;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32632a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f32633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32634c;

        public a(String str, Context context, int i5) {
            this.f32632a = str;
            this.f32633b = context;
            this.f32634c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (y.f32629g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f32632a);
            }
            InputManager inputManagerB = y.b(this.f32633b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f32634c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                str = "nihc";
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                str = "vihc";
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                str = "eihc";
            }
            y.c(str);
        }
    }

    public static /* synthetic */ int b() {
        int i5 = f32625c;
        f32625c = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int c() {
        int i5 = f32628f;
        f32628f = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int d() {
        int i5 = f32623a;
        f32623a = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int e() {
        int i5 = f32626d;
        f32626d = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int f() {
        int i5 = f32624b;
        f32624b = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int g() {
        int i5 = f32627e;
        f32627e = i5 + 1;
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f32630h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = aw.a(z.a());
            if (sharedPreferencesA != null) {
                f32628f = sharedPreferencesA.getInt("nihc", 0);
                f32627e = sharedPreferencesA.getInt("eihc", 0);
                f32626d = sharedPreferencesA.getInt("vihc", 0);
                f32630h = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r2) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            h()
            r2.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case 100415: goto L4e;
                case 109064: goto L43;
                case 116752: goto L38;
                case 3113119: goto L2d;
                case 3381238: goto L22;
                case 3619566: goto L17;
                default: goto L15;
            }
        L15:
            r2 = r1
            goto L58
        L17:
            java.lang.String r0 = "vihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L20
            goto L15
        L20:
            r2 = 5
            goto L58
        L22:
            java.lang.String r0 = "nihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L15
        L2b:
            r2 = 4
            goto L58
        L2d:
            java.lang.String r0 = "eihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
            goto L15
        L36:
            r2 = 3
            goto L58
        L38:
            java.lang.String r0 = "vic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L15
        L41:
            r2 = 2
            goto L58
        L43:
            java.lang.String r0 = "nic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4c
            goto L15
        L4c:
            r2 = 1
            goto L58
        L4e:
            java.lang.String r0 = "eic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L57
            goto L15
        L57:
            r2 = 0
        L58:
            switch(r2) {
                case 0: goto L6b;
                case 1: goto L68;
                case 2: goto L65;
                case 3: goto L62;
                case 4: goto L5f;
                case 5: goto L5c;
                default: goto L5b;
            }
        L5b:
            return r1
        L5c:
            int r2 = com.pgl.ssdk.y.f32626d
            return r2
        L5f:
            int r2 = com.pgl.ssdk.y.f32628f
            return r2
        L62:
            int r2 = com.pgl.ssdk.y.f32627e
            return r2
        L65:
            int r2 = com.pgl.ssdk.y.f32623a
            return r2
        L68:
            int r2 = com.pgl.ssdk.y.f32625c
            return r2
        L6b:
            int r2 = com.pgl.ssdk.y.f32624b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.y.b(java.lang.String):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = aw.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.MotionEvent r2, android.content.Context r3) {
        /*
            if (r2 == 0) goto L4f
            if (r3 == 0) goto L4f
            boolean r0 = com.pgl.ssdk.y.f32629g
            if (r0 == 0) goto L42
            r0 = 0
            int r0 = r2.getToolType(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            r1 = 2
            if (r0 != r1) goto L42
        L1c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "android.view.InputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$WindowInputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$InputStage"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            goto L43
        L42:
            r0 = 0
        L43:
            int r2 = r2.getDeviceId()
            com.pgl.ssdk.y$a r1 = new com.pgl.ssdk.y$a
            r1.<init>(r0, r3, r2)
            com.pgl.ssdk.ar.b(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.y.a(android.view.MotionEvent, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f32631i == null) {
            f32631i = (InputManager) context.getSystemService("input");
        }
        return f32631i;
    }
}
