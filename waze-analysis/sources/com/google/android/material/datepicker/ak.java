package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    static final int f6405a = ax.k().getMaximum(4);

    /* renamed from: g, reason: collision with root package name */
    private static final int f6406g = (ax.k().getMaximum(5) + ax.k().getMaximum(7)) - 1;

    /* renamed from: b, reason: collision with root package name */
    final aj f6407b;

    /* renamed from: c, reason: collision with root package name */
    e f6408c;

    /* renamed from: d, reason: collision with root package name */
    final c f6409d;

    /* renamed from: e, reason: collision with root package name */
    final l f6410e;

    /* renamed from: f, reason: collision with root package name */
    final at f6411f;

    /* renamed from: h, reason: collision with root package name */
    private Collection f6412h;

    ak(aj ajVar, at atVar, c cVar, l lVar) {
        this.f6407b = ajVar;
        this.f6411f = atVar;
        this.f6409d = cVar;
        this.f6410e = lVar;
        this.f6412h = atVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void l(TextView textView, long j2, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        d dVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean zN = n(j2);
        at atVar = this.f6411f;
        Iterator it = new ArrayList().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            F f2 = ((Pair) it.next()).first;
            if (f2 != 0 && ((Long) f2).longValue() == j2) {
                z2 = true;
                break;
            }
        }
        Iterator it2 = new ArrayList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = false;
                break;
            }
            S s = ((Pair) it2.next()).second;
            if (s != 0 && ((Long) s).longValue() == j2) {
                z3 = true;
                break;
            }
        }
        textView.setContentDescription(aw.b(context, j2, zN, z2, z3));
        if (this.f6409d.f().a(j2)) {
            textView.setEnabled(true);
            Iterator it3 = atVar.e().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                } else {
                    if (ax.a(j2) == ax.a(((Long) it3.next()).longValue())) {
                        break;
                    }
                }
            }
            textView.setSelected(z);
            if (z) {
                dVar = this.f6408c.f6455b;
            } else {
                boolean zN2 = n(j2);
                e eVar = this.f6408c;
                dVar = zN2 ? eVar.f6456c : eVar.f6454a;
            }
        } else {
            textView.setEnabled(false);
            dVar = this.f6408c.f6460g;
        }
        if (this.f6410e == null || i2 == -1) {
            dVar.e(textView);
            return;
        }
        aj ajVar = this.f6407b;
        int i3 = ajVar.f6399b;
        int i4 = ajVar.f6398a;
        throw null;
    }

    private final void m(MaterialCalendarGridView materialCalendarGridView, long j2) {
        aj ajVarG = aj.g(j2);
        aj ajVar = this.f6407b;
        if (ajVarG.equals(ajVar)) {
            int iC = ajVar.c(j2);
            l((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iC) - materialCalendarGridView.getFirstVisiblePosition()), j2, iC);
        }
    }

    private static final boolean n(long j2) {
        return ax.j().getTimeInMillis() == j2;
    }

    final int a(int i2) {
        return g() + (i2 - 1);
    }

    final int b() {
        return e(g() - 1);
    }

    final int c() {
        return f(h() + 1);
    }

    final int d(int i2) {
        if (k(i2)) {
            return i2;
        }
        long itemId = getItemId(i2);
        for (int i3 = 1; i3 < this.f6407b.f6400c; i3++) {
            int i4 = i2 + i3;
            if (i4 < f6406g && getItemId(i4) == itemId && k(i4)) {
                return i4;
            }
            int i5 = i2 - i3;
            if (i5 >= 0 && getItemId(i5) == itemId && k(i5)) {
                return i5;
            }
        }
        return -1;
    }

    final int e(int i2) {
        do {
            i2++;
            if (i2 > h()) {
                return -1;
            }
        } while (!k(i2));
        return i2;
    }

    final int f(int i2) {
        for (int i3 = i2 - 1; i3 >= g(); i3--) {
            if (k(i3)) {
                return i3;
            }
        }
        return -1;
    }

    final int g() {
        return this.f6407b.b(this.f6409d.b());
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f6406g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.f6407b.f6400c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.e r1 = r5.f6408c
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.e r1 = new com.google.android.material.datepicker.e
            r1.<init>(r0)
            r5.f6408c = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131558589(0x7f0d00bd, float:1.8742498E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.g()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.aj r8 = r5.f6407b
            int r2 = r8.f6401d
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 == 0) goto L73
            long r1 = r6.longValue()
            r5.l(r0, r1, r7)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.ak.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    final int h() {
        return (g() + this.f6407b.f6401d) - 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < g() || i2 > h()) {
            return null;
        }
        return Long.valueOf(this.f6407b.e((i2 - g()) + 1));
    }

    public final void j(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f6412h.iterator();
        while (it.hasNext()) {
            m(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        at atVar = this.f6411f;
        if (atVar != null) {
            Iterator it2 = atVar.e().iterator();
            while (it2.hasNext()) {
                m(materialCalendarGridView, ((Long) it2.next()).longValue());
            }
            this.f6412h = atVar.e();
        }
    }

    final boolean k(int i2) {
        Long item = getItem(i2);
        return item != null && this.f6409d.f().a(item.longValue());
    }
}
