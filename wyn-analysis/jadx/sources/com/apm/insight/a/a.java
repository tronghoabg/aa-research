package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* loaded from: classes.dex */
public class a implements ICrashCallback {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f20166d;

    /* renamed from: a, reason: collision with root package name */
    private volatile String f20167a;

    /* renamed from: b, reason: collision with root package name */
    private volatile i.a f20168b;

    /* renamed from: c, reason: collision with root package name */
    private volatile i.a f20169c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f20170e = false;

    private a() {
    }

    public static a a() {
        if (f20166d == null) {
            synchronized (a.class) {
                try {
                    if (f20166d == null) {
                        f20166d = new a();
                    }
                } finally {
                }
            }
        }
        return f20166d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f20167a = str;
        this.f20168b = aVar;
        this.f20169c = aVar2;
        if (this.f20170e) {
            return;
        }
        this.f20170e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
