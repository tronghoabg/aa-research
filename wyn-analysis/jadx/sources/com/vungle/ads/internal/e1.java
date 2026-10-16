package com.vungle.ads.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32971a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32972b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f32973c;

    public e1(f1 f1Var) {
        this.f32973c = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c1 c1VarA;
        c1 c1VarA2;
        this.f32973c.f33002g = false;
        for (Map.Entry entry : this.f32973c.f32996a.entrySet()) {
            View view = (View) entry.getKey();
            if (f1.a(this.f32973c, view, ((d1) entry.getValue()).b())) {
                this.f32971a.add(view);
            } else {
                this.f32972b.add(view);
            }
        }
        Iterator it = this.f32971a.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            d1 d1Var = (d1) this.f32973c.f32996a.get(view2);
            if (d1Var != null && (c1VarA2 = d1Var.a()) != null) {
                c1VarA2.onImpression(view2);
            }
            f1 f1Var = this.f32973c;
            AbstractC3340k.d(view2, "view");
            f1Var.a(view2);
        }
        this.f32971a.clear();
        Iterator it2 = this.f32972b.iterator();
        while (it2.hasNext()) {
            View view3 = (View) it2.next();
            d1 d1Var2 = (d1) this.f32973c.f32996a.get(view3);
            if (d1Var2 != null && (c1VarA = d1Var2.a()) != null) {
                c1VarA.onViewInvisible(view3);
            }
        }
        this.f32972b.clear();
        if (this.f32973c.f32996a.isEmpty() || this.f32973c.f33003h) {
            return;
        }
        f1.d(this.f32973c);
    }
}
