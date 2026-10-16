package q;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class E0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f43623a;

    public E0(F0 f02) {
        this.f43623a = f02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i5) {
        if (i5 == 1) {
            F0 f02 = this.f43623a;
            if (f02.f43651z.getInputMethodMode() == 2 || f02.f43651z.getContentView() == null) {
                return;
            }
            Handler handler = f02.f43647v;
            C0 c02 = f02.f43643r;
            handler.removeCallbacks(c02);
            c02.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i5, int i10, int i11) {
    }
}
