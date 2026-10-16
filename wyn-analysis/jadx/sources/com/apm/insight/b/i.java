package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static int f20277a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static b f20278b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f20279c;

    /* renamed from: d, reason: collision with root package name */
    private static Printer f20280d;

    public interface a {
    }

    public static class b implements Printer {

        /* renamed from: a, reason: collision with root package name */
        List<Printer> f20281a = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private List<Printer> f20284d = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        List<Printer> f20282b = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private boolean f20285e = false;

        /* renamed from: c, reason: collision with root package name */
        boolean f20283c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f20283c) {
                for (Printer printer : this.f20282b) {
                    if (!this.f20281a.contains(printer)) {
                        this.f20281a.add(printer);
                    }
                }
                this.f20282b.clear();
                this.f20283c = false;
            }
            if (this.f20281a.size() > i.f20277a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f20281a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f20279c) {
            return;
        }
        f20279c = true;
        f20278b = new b();
        Printer printerD = d();
        f20280d = printerD;
        if (printerD != null) {
            f20278b.f20281a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f20278b);
        }
    }

    public static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f20278b.f20282b.contains(printer)) {
            return;
        }
        f20278b.f20282b.add(printer);
        f20278b.f20283c = true;
    }
}
