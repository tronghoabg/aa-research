package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al {

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference f10146a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f10147b;

    /* renamed from: c, reason: collision with root package name */
    private af f10148c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f10149d;

    private al(SharedPreferences sharedPreferences, Executor executor) {
        this.f10149d = executor;
        this.f10147b = sharedPreferences;
    }

    public static synchronized al b(Context context, Executor executor) {
        WeakReference weakReference = f10146a;
        al alVar = weakReference != null ? (al) weakReference.get() : null;
        if (alVar != null) {
            return alVar;
        }
        al alVar2 = new al(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
        alVar2.d();
        f10146a = new WeakReference(alVar2);
        return alVar2;
    }

    private final synchronized void d() {
        this.f10148c = af.b(this.f10147b, this.f10149d);
    }

    final synchronized ak a() {
        String str;
        ArrayDeque arrayDeque = this.f10148c.f10125a;
        synchronized (arrayDeque) {
            str = (String) arrayDeque.peek();
        }
        return ak.a(str);
    }

    final synchronized void c(ak akVar) {
        this.f10148c.c(akVar.d());
    }
}
