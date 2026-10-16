package com.google.d.f.b.a;

import android.os.Build;
import com.google.d.f.b.ad;
import com.google.d.f.b.ae;
import dalvik.system.VMStack;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends ae {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f7698a = e.a();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f7699b;

    /* renamed from: c, reason: collision with root package name */
    private static final ad f7700c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        f7699b = z;
        f7700c = new d();
    }

    static Class<?> p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return e.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.google.d.f.b.ae
    protected com.google.d.f.b.g e(String str) {
        return j.e(str);
    }

    @Override // com.google.d.f.b.ae
    protected ad h() {
        return f7700c;
    }

    @Override // com.google.d.f.b.ae
    protected com.google.d.f.c.a j() {
        return k.b();
    }

    @Override // com.google.d.f.b.ae
    protected String m() {
        return "platform: Android";
    }
}
