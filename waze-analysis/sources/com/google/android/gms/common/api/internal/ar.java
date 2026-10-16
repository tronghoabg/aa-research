package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final Map f4758a = DesugarCollections.synchronizedMap(new ArrayMap());

    /* renamed from: b, reason: collision with root package name */
    private int f4759b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f4760c;

    ar() {
    }

    final void c(int i2, int i3, Intent intent) {
        Iterator it = this.f4758a.values().iterator();
        while (it.hasNext()) {
            ((an) it.next()).d(i2, i3, intent);
        }
    }

    final void d(Bundle bundle) {
        this.f4759b = 1;
        this.f4760c = bundle;
        for (Map.Entry entry : this.f4758a.entrySet()) {
            ((an) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void e() {
        this.f4759b = 5;
        for (an anVar : this.f4758a.values()) {
        }
    }

    final void f() {
        this.f4759b = 3;
        Iterator it = this.f4758a.values().iterator();
        while (it.hasNext()) {
            ((an) it.next()).k();
        }
    }

    final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f4758a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((an) entry.getValue()).h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void h() {
        this.f4759b = 2;
        Iterator it = this.f4758a.values().iterator();
        while (it.hasNext()) {
            ((an) it.next()).l();
        }
    }

    final void i() {
        this.f4759b = 4;
        Iterator it = this.f4758a.values().iterator();
        while (it.hasNext()) {
            ((an) it.next()).m();
        }
    }

    final void j(an anVar) {
        Map map = this.f4758a;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map.put("ConnectionlessLifecycleHelper", anVar);
        if (this.f4759b > 0) {
            new com.waze.native_managers.j(Looper.getMainLooper()).post(new aq(this, anVar));
        }
    }

    final void k() {
        for (an anVar : this.f4758a.values()) {
        }
    }

    final an l(Class cls) {
        return (an) cls.cast(this.f4758a.get("ConnectionlessLifecycleHelper"));
    }
}
