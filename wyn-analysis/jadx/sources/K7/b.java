package K7;

import android.view.View;
import k1.r;
import k1.v0;

/* loaded from: classes4.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f6557a;

    /* renamed from: b, reason: collision with root package name */
    public final View f6558b;

    /* renamed from: c, reason: collision with root package name */
    public int f6559c;

    public b(View view) {
        this.f6558b = view;
    }

    @Override // k1.r
    public v0 v(View view, v0 v0Var) {
        int i5 = v0Var.f38877a.f(519).f19122b;
        View view2 = this.f6558b;
        int i10 = this.f6557a;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i5;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f6559c + i5, view2.getPaddingRight(), view2.getPaddingBottom());
        return v0Var;
    }

    public b(View view, int i5, int i10) {
        this.f6557a = i5;
        this.f6558b = view;
        this.f6559c = i10;
    }
}
