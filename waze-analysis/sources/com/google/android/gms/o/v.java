package com.google.android.gms.o;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5776a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f5777b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5778c;

    v() {
    }

    public final void a(u uVar) {
        synchronized (this.f5776a) {
            if (this.f5777b == null) {
                this.f5777b = new ArrayDeque();
            }
            this.f5777b.add(uVar);
        }
    }

    public final void b(t tVar) {
        u uVar;
        Object obj = this.f5776a;
        synchronized (obj) {
            if (this.f5777b != null && !this.f5778c) {
                this.f5778c = true;
                while (true) {
                    synchronized (obj) {
                        uVar = (u) this.f5777b.poll();
                        if (uVar == null) {
                            this.f5778c = false;
                            return;
                        }
                    }
                    uVar.c(tVar);
                }
            }
        }
    }
}
