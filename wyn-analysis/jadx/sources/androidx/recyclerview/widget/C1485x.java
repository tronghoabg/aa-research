package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19024a;

    /* renamed from: b, reason: collision with root package name */
    public int f19025b;

    /* renamed from: c, reason: collision with root package name */
    public int f19026c;

    /* renamed from: d, reason: collision with root package name */
    public int f19027d;

    /* renamed from: e, reason: collision with root package name */
    public int f19028e;

    /* renamed from: f, reason: collision with root package name */
    public int f19029f;

    /* renamed from: g, reason: collision with root package name */
    public int f19030g;

    /* renamed from: h, reason: collision with root package name */
    public int f19031h;

    /* renamed from: i, reason: collision with root package name */
    public int f19032i;

    /* renamed from: j, reason: collision with root package name */
    public int f19033j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19034l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.k.size();
        View view2 = null;
        int i5 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((m0) this.k.get(i10)).itemView;
            W w2 = (W) view3.getLayoutParams();
            if (view3 != view && !w2.f18812a.isRemoved() && (layoutPosition = (w2.f18812a.getLayoutPosition() - this.f19027d) * this.f19028e) >= 0 && layoutPosition < i5) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i5 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f19027d = -1;
        } else {
            this.f19027d = ((W) view2.getLayoutParams()).f18812a.getLayoutPosition();
        }
    }

    public final View b(c0 c0Var) {
        List list = this.k;
        if (list == null) {
            View view = c0Var.j(this.f19027d, Long.MAX_VALUE).itemView;
            this.f19027d += this.f19028e;
            return view;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = ((m0) this.k.get(i5)).itemView;
            W w2 = (W) view2.getLayoutParams();
            if (!w2.f18812a.isRemoved() && this.f19027d == w2.f18812a.getLayoutPosition()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
