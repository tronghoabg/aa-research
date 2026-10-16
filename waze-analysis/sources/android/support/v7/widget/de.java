package android.support.v7.widget;

import android.view.View;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class de {

    /* renamed from: b, reason: collision with root package name */
    int f1330b;

    /* renamed from: c, reason: collision with root package name */
    int f1331c;

    /* renamed from: d, reason: collision with root package name */
    int f1332d;

    /* renamed from: e, reason: collision with root package name */
    int f1333e;

    /* renamed from: f, reason: collision with root package name */
    int f1334f;

    /* renamed from: g, reason: collision with root package name */
    int f1335g;

    /* renamed from: k, reason: collision with root package name */
    int f1339k;
    boolean m;

    /* renamed from: a, reason: collision with root package name */
    boolean f1329a = true;

    /* renamed from: h, reason: collision with root package name */
    int f1336h = 0;

    /* renamed from: i, reason: collision with root package name */
    int f1337i = 0;

    /* renamed from: j, reason: collision with root package name */
    boolean f1338j = false;

    /* renamed from: l, reason: collision with root package name */
    List f1340l = null;

    de() {
    }

    final View a(et etVar) {
        List list = this.f1340l;
        if (list == null) {
            View viewC = etVar.c(this.f1332d);
            this.f1332d += this.f1333e;
            return viewC;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = ((fe) this.f1340l.get(i2)).itemView;
            eo eoVar = (eo) view.getLayoutParams();
            if (!eoVar.c() && this.f1332d == eoVar.a()) {
                c(view);
                return view;
            }
        }
        return null;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int iA;
        int size = this.f1340l.size();
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        View view2 = null;
        while (true) {
            if (i2 >= size) {
                break;
            }
            View view3 = ((fe) this.f1340l.get(i2)).itemView;
            eo eoVar = (eo) view3.getLayoutParams();
            if (view3 != view && !eoVar.c() && (iA = (eoVar.a() - this.f1332d) * this.f1333e) >= 0 && iA < i3) {
                if (iA == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i3 = iA;
                }
            }
            i2++;
        }
        if (view2 == null) {
            this.f1332d = -1;
        } else {
            this.f1332d = ((eo) view2.getLayoutParams()).a();
        }
    }

    final boolean d(fb fbVar) {
        int i2 = this.f1332d;
        return i2 >= 0 && i2 < fbVar.a();
    }
}
