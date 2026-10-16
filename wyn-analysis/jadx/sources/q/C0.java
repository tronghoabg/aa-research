package q;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f43620b;

    public /* synthetic */ C0(F0 f02, int i5) {
        this.f43619a = i5;
        this.f43620b = f02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F0 f02 = this.f43620b;
        switch (this.f43619a) {
            case 0:
                C3838t0 c3838t0 = f02.f43629c;
                if (c3838t0 != null) {
                    c3838t0.setListSelectionHidden(true);
                    c3838t0.requestLayout();
                    break;
                }
                break;
            default:
                C3838t0 c3838t02 = f02.f43629c;
                if (c3838t02 != null) {
                    WeakHashMap weakHashMap = k1.S.f38779a;
                    if (c3838t02.isAttachedToWindow() && f02.f43629c.getCount() > f02.f43629c.getChildCount() && f02.f43629c.getChildCount() <= f02.f43638m) {
                        f02.f43651z.setInputMethodMode(2);
                        f02.show();
                        break;
                    }
                }
                break;
        }
    }
}
