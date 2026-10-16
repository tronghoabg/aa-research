package com.google.b.d.b;

import com.google.android.gms.common.api.internal.bc;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p implements Runnable, y {

    /* renamed from: a, reason: collision with root package name */
    private x f7108a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7109b = com.google.android.libraries.d.a.a.b(Thread.currentThread());

    /* renamed from: c, reason: collision with root package name */
    private boolean f7110c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7111d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7112e;

    p(x xVar, boolean z) {
        this.f7112e = false;
        this.f7108a = xVar;
        this.f7112e = z;
    }

    private final void b() {
        this.f7110c = true;
        if (!this.f7109b || this.f7111d) {
            return;
        }
        com.google.android.libraries.d.a.a.c();
    }

    public final void a(bm bmVar) {
        if (this.f7110c) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.f7111d) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.f7111d = true;
        bmVar.addListener(this, cf.y());
    }

    @Override // com.google.b.d.b.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f7108a;
        try {
            this.f7108a = null;
            if (!this.f7111d) {
                if (this.f7110c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (xVar != null) {
                xVar.close();
            }
            if (this.f7112e) {
                j.c(j.a(), o.f7107a);
            }
        } catch (Throwable th) {
            if (xVar != null) {
                try {
                    xVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7110c || !this.f7111d) {
            com.google.android.libraries.d.a.a.a(new bc(3));
        } else {
            b();
        }
    }
}
