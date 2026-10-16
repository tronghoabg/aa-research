package com.bumptech.glide.manager;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.ac;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    final Map f3532a = new HashMap();

    j() {
    }

    final ac a(Context context, com.bumptech.glide.c cVar, Lifecycle lifecycle, boolean z) {
        com.bumptech.glide.g.r.h();
        com.bumptech.glide.g.r.h();
        Map map = this.f3532a;
        ac acVar = (ac) map.get(lifecycle);
        if (acVar != null) {
            return acVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        ac acVar2 = new ac(cVar, lifecycleLifecycle, new i(this), context);
        map.put(lifecycle, acVar2);
        lifecycleLifecycle.a(new h(this, lifecycle));
        if (!z) {
            return acVar2;
        }
        acVar2.h();
        return acVar2;
    }
}
