package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mp extends dzp {
    final mq a;
    public final Map b = new WeakHashMap();

    public mp(mq mqVar) {
        this.a = mqVar;
    }

    @Override // defpackage.dzp
    public final edj a(View view) {
        dzp dzpVar = (dzp) this.b.get(view);
        return dzpVar != null ? dzpVar.a(view) : super.a(view);
    }

    @Override // defpackage.dzp
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        dzp dzpVar = (dzp) this.b.get(view);
        if (dzpVar != null) {
            dzpVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        mq mqVar = this.a;
        if (!mqVar.k()) {
            RecyclerView recyclerView = mqVar.a;
            if (recyclerView.g() != null) {
                recyclerView.g().aN(view, edgVar);
                dzp dzpVar = (dzp) this.b.get(view);
                if (dzpVar != null) {
                    dzpVar.c(view, edgVar);
                    return;
                } else {
                    super.c(view, edgVar);
                    return;
                }
            }
        }
        super.c(view, edgVar);
    }

    @Override // defpackage.dzp
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        dzp dzpVar = (dzp) this.b.get(view);
        if (dzpVar != null) {
            dzpVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dzp
    public final void e(View view, int i) {
        dzp dzpVar = (dzp) this.b.get(view);
        if (dzpVar != null) {
            dzpVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.dzp
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        dzp dzpVar = (dzp) this.b.get(view);
        if (dzpVar != null) {
            dzpVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dzp
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        dzp dzpVar = (dzp) this.b.get(view);
        return dzpVar != null ? dzpVar.g(view, accessibilityEvent) : super.g(view, accessibilityEvent);
    }

    @Override // defpackage.dzp
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        dzp dzpVar = (dzp) this.b.get(viewGroup);
        return dzpVar != null ? dzpVar.h(viewGroup, view, accessibilityEvent) : super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.dzp
    public final boolean i(View view, int i, Bundle bundle) {
        mq mqVar = this.a;
        if (!mqVar.k()) {
            RecyclerView recyclerView = mqVar.a;
            if (recyclerView.g() != null) {
                dzp dzpVar = (dzp) this.b.get(view);
                if (dzpVar != null) {
                    if (dzpVar.i(view, i, bundle)) {
                        return true;
                    }
                } else if (super.i(view, i, bundle)) {
                    return true;
                }
                RecyclerView recyclerView2 = recyclerView.g().s;
                me meVar = recyclerView2.e;
                ml mlVar = recyclerView2.N;
                return false;
            }
        }
        return super.i(view, i, bundle);
    }
}
