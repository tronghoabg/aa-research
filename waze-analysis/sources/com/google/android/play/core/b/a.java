package com.google.android.play.core.b;

import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final w f6964a;

    a() {
        this.f6964a = null;
    }

    public void a(Exception exc) {
        w wVar = this.f6964a;
        if (wVar != null) {
            wVar.d(exc);
        }
    }

    protected abstract void b();

    final w c() {
        return this.f6964a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e2) {
            a(e2);
        }
    }

    public a(w wVar) {
        this.f6964a = wVar;
    }
}
