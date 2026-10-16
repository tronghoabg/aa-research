package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f20273a;

    /* renamed from: b, reason: collision with root package name */
    private static Printer f20274b;

    /* renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f20275c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f20276d = false;

    public interface a {
        String a();

        String b();

        String c();
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f20273a) {
            return;
        }
        f20273a = true;
        f20274b = new Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    h.a(true, str);
                } else if (str.charAt(0) == '<') {
                    h.a(false, str);
                }
            }
        };
        i.a();
        i.a(f20274b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f20275c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z2, String str) {
        e.f20219a = System.nanoTime() / 1000000;
        e.f20220b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f20275c;
        for (int i5 = 0; i5 < copyOnWriteArrayList.size(); i5++) {
            e eVar = copyOnWriteArrayList.get(i5);
            if (eVar == null || !eVar.a()) {
                if (!z2 && eVar.f20221c) {
                    eVar.b("");
                }
            } else if (z2) {
                if (!eVar.f20221c) {
                    eVar.a(str);
                }
            } else if (eVar.f20221c) {
                eVar.b(str);
            }
        }
    }
}
