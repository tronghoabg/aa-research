package android.support.v7.app;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ak extends ContentFrameLayout {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f515a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(an anVar, Context context) {
        super(context);
        this.f515a = anVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f515a.Q(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                an anVar = this.f515a;
                anVar.K(anVar.X(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(android.support.a.i.d(getContext(), i2));
    }
}
