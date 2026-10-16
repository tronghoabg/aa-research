package com.bumptech.glide.load.a.a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    final Object f2941a;

    /* renamed from: b, reason: collision with root package name */
    e f2942b;

    /* renamed from: c, reason: collision with root package name */
    e f2943c;

    /* renamed from: d, reason: collision with root package name */
    private List f2944d;

    e(Object obj) {
        this.f2943c = this;
        this.f2942b = this;
        this.f2941a = obj;
    }

    public final int a() {
        List list = this.f2944d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int iA = a();
        if (iA > 0) {
            return this.f2944d.remove(iA - 1);
        }
        return null;
    }

    public final void c(Object obj) {
        if (this.f2944d == null) {
            this.f2944d = new ArrayList();
        }
        this.f2944d.add(obj);
    }

    e() {
        this(null);
    }
}
