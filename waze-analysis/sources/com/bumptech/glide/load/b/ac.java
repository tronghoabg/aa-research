package com.bumptech.glide.load.b;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac {

    /* renamed from: a, reason: collision with root package name */
    private static final Queue f3203a;

    /* renamed from: b, reason: collision with root package name */
    private int f3204b;

    /* renamed from: c, reason: collision with root package name */
    private int f3205c;

    /* renamed from: d, reason: collision with root package name */
    private Object f3206d;

    static {
        int i2 = com.bumptech.glide.g.r.f2918a;
        f3203a = new ArrayDeque(0);
    }

    private ac() {
    }

    static ac b(Object obj) {
        ac acVar;
        Queue queue = f3203a;
        synchronized (queue) {
            acVar = (ac) queue.poll();
        }
        if (acVar == null) {
            acVar = new ac();
        }
        acVar.f3206d = obj;
        acVar.f3205c = 0;
        acVar.f3204b = 0;
        return acVar;
    }

    public final void a() {
        Queue queue = f3203a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ac) {
            ac acVar = (ac) obj;
            int i2 = acVar.f3205c;
            int i3 = acVar.f3204b;
            if (this.f3206d.equals(acVar.f3206d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3206d.hashCode();
    }
}
