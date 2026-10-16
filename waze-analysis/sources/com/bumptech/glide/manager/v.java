package com.bumptech.glide.manager;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v {

    /* renamed from: b, reason: collision with root package name */
    private static volatile v f3549b;

    /* renamed from: a, reason: collision with root package name */
    final Set f3550a = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f3551c;

    /* renamed from: d, reason: collision with root package name */
    private final u f3552d;

    private v(Context context) {
        this.f3552d = new u(com.bumptech.glide.g.p.g(new q(this, context)), new r(this));
    }

    static v a(Context context) {
        if (f3549b == null) {
            synchronized (v.class) {
                if (f3549b == null) {
                    f3549b = new v(context.getApplicationContext());
                }
            }
        }
        return f3549b;
    }

    final synchronized void b(b bVar) {
        Set set = this.f3550a;
        set.add(bVar);
        if (!this.f3551c && !set.isEmpty()) {
            this.f3551c = this.f3552d.b();
        }
    }

    final synchronized void c(b bVar) {
        Set set = this.f3550a;
        set.remove(bVar);
        if (this.f3551c && set.isEmpty()) {
            this.f3552d.a();
            this.f3551c = false;
        }
    }
}
