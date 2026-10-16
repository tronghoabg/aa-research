package j;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import o.C3623d;

/* loaded from: classes.dex */
public final class u extends ContentFrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f38485i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, C3623d c3623d) {
        super(c3623d, null);
        this.f38485i = wVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f38485i.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x5 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x5 < -5 || y10 < -5 || x5 > getWidth() + 5 || y10 > getHeight() + 5) {
                w wVar = this.f38485i;
                wVar.r(wVar.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i5) {
        setBackgroundDrawable(Fe.g.B(getContext(), i5));
    }
}
