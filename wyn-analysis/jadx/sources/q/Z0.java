package q;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class Z0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f43728a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f43729b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f43730c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f43731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43732e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f43733f;

    public Z0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f43732e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f43729b = rect3;
        Rect rect4 = new Rect();
        this.f43731d = rect4;
        Rect rect5 = new Rect();
        this.f43730c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i5 = -scaledTouchSlop;
        rect4.inset(i5, i5);
        rect5.set(rect2);
        this.f43728a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        int x5 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z10 = this.f43733f;
                if (z10 && !this.f43731d.contains(x5, y10)) {
                    z11 = z10;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z10 = this.f43733f;
                    this.f43733f = false;
                }
                z2 = true;
                z11 = false;
            }
            z11 = z10;
            z2 = true;
        } else if (this.f43729b.contains(x5, y10)) {
            this.f43733f = true;
            z2 = true;
        } else {
            z2 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f43730c;
        View view = this.f43728a;
        if (!z2 || rect.contains(x5, y10)) {
            motionEvent.setLocation(x5 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
