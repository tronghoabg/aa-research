package I9;

import android.view.View;
import android.widget.ScrollView;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public View f5434a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5435b;

    /* renamed from: c, reason: collision with root package name */
    public int f5436c;

    public final int a() {
        View view = this.f5434a;
        if (view.getVisibility() == 8) {
            return 0;
        }
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getChildAt(0).getMeasuredHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom();
    }
}
