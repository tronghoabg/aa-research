package com.waze.uid;

import android.content.res.Resources;
import com.waze.NativeManager;
import e.a.cm;
import e.a.ee;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static Resources f44491a;

    public f() {
    }

    private static void c() {
        com.waze.shared_infra.i.h.k("LogoutConfirmationDialog", "logging out");
        NativeManager.getInstance().LogOutAccount();
    }

    public static int d(int i2) {
        return f44491a.getDimensionPixelSize(i2);
    }

    public static void e(Resources resources) {
        if (f44491a == null) {
            f44491a = resources;
        }
    }

    static void f() {
        c();
    }

    static void g() {
        c();
    }

    public static f j() {
        return new f(null);
    }

    public void a(ee eeVar, cm cmVar) {
        throw null;
    }

    public void h(Object obj) {
        throw null;
    }

    public void i() {
    }

    public void u(cm cmVar) {
    }

    public f(byte[] bArr) {
    }
}
