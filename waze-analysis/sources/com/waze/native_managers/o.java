package com.waze.native_managers;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends HandlerThread implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30705a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f30706b = h.g.a(new n(0));

    /* renamed from: c, reason: collision with root package name */
    private final CompletableDeferred f30707c;

    private o() {
        super("Native Thread", -4);
        this.f30707c = bo.j();
    }

    static final o a() {
        return new o();
    }

    public final Object b(h.c.e eVar) {
        Object objC = this.f30707c.c(eVar);
        return objC == h.c.a.a.f48038a ? objC : ab.f48028a;
    }

    @Override // android.os.HandlerThread, com.waze.native_managers.p
    public final Looper getLooper() {
        Looper looper = super.getLooper();
        x.e(looper, "getLooper(...)");
        return looper;
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        Object objA;
        super.onLooperPrepared();
        try {
            o oVar = this;
            System.loadLibrary("waze");
            this.f30707c.a(true);
            objA = Integer.valueOf(Log.i("Waze", "Waze Library is loaded"));
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC == null) {
            return;
        }
        Log.e("Waze", "could not load library, reason=".concat(String.valueOf(thC.getMessage())));
        this.f30707c.b(thC);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
