package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* loaded from: classes4.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f32480a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f32481b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f32482c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f32483d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f32484e = null;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f32485f = false;

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f32486g = false;

    /* renamed from: h, reason: collision with root package name */
    private static DisplayManager f32487h;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i5) {
            aa.b(i5, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i5) {
            aa.b(i5, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i5) {
            aa.b(i5, 2);
        }
    }

    private static String a(int i5) {
        Display display = f32487h.getDisplay(i5);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i5, int i10) {
        if (i5 == 0) {
            return;
        }
        try {
            String strA = a(i5);
            if (i10 == 1) {
                if (strA.equals(f32482c)) {
                    return;
                }
                f32482c = strA;
            } else if (i10 == 2) {
                if (strA.equals(f32483d)) {
                    return;
                }
                f32483d = strA;
            } else {
                if (i10 != 3 || strA.equals(f32484e)) {
                    return;
                }
                f32484e = strA;
            }
        } catch (Throwable unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object objA = au.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = au.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = au.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f32481b) {
            return;
        }
        if (f32480a == null) {
            f32480a = new a();
        }
        if (f32487h == null) {
            f32487h = (DisplayManager) context.getSystemService("display");
        }
        if (f32487h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f32487h.registerDisplayListener(f32480a, handlerB);
            f32481b = true;
        } catch (Exception unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f32481b && (f32482c != null || f32483d != null || f32484e != null)) {
            return true;
        }
        if (f32481b && f32485f) {
            return f32486g;
        }
        int i5 = 0;
        if (context == null) {
            return false;
        }
        if (f32487h == null) {
            f32487h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f32487h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            int length = displays.length;
            while (true) {
                if (i5 < length) {
                    Display display = displays[i5];
                    if (display != null && display.getDisplayId() != 0) {
                        f32486g = true;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
        }
        f32485f = true;
        return f32486g;
    }
}
