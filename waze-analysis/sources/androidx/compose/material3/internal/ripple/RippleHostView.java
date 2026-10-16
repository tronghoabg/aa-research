package androidx.compose.material3.internal.ripple;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleHostView extends View {
    private static final long MinimumRippleStateChangeTime = 5;
    private static final long ResetRippleDelayDuration = 50;
    private Boolean bounded;
    private Long lastRippleStateChangeTimeMillis;
    private a<ab> onInvalidateRipple;
    private Runnable resetRippleRunnable;
    private UnprojectedRipple ripple;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] PressedState = {R.attr.state_pressed, R.attr.state_enabled};
    private static final int[] RestingState = new int[0];

    public RippleHostView(Context context) {
        super(context);
    }

    private final void createRipple(boolean z) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    private final void setRippleState(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l2 = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l2 != null ? l2.longValue() : 0L);
        if (z) {
            iArr = PressedState;
        } else {
            if (jLongValue < 5) {
                Runnable runnable2 = new Runnable() { // from class: androidx.compose.material3.internal.ripple.RippleHostView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RippleHostView.setRippleState$lambda$1(this.f$0);
                    }
                };
                this.resetRippleRunnable = runnable2;
                postDelayed(runnable2, ResetRippleDelayDuration);
                this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
            }
            iArr = RestingState;
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(iArr);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    static final void setRippleState$lambda$1(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        rippleHostView.resetRippleRunnable = null;
    }

    /* renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m6399addRippleKOepWvA(PressInteraction.Press press, boolean z, long j2, int i2, long j3, float f2, a<ab> aVar) {
        if (this.ripple == null || !x.n(Boolean.valueOf(z), this.bounded)) {
            createRipple(z);
            this.bounded = Boolean.valueOf(z);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        x.c(unprojectedRipple);
        this.onInvalidateRipple = aVar;
        m6400setRipplePropertiesbiQXAtU(j2, i2, j3, f2);
        if (z) {
            unprojectedRipple.setHotspot(Float.intBitsToFloat((int) (press.m2381getPressPositionF1C5BW0() >> 32)), Float.intBitsToFloat((int) (press.m2381getPressPositionF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            x.c(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            disposeRipple();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        a<ab> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m6400setRipplePropertiesbiQXAtU(long j2, int i2, long j3, float f2) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        if (unprojectedRipple.getRadius() != i2) {
            unprojectedRipple.setRadius(i2);
        }
        unprojectedRipple.m6410setColorDxMtmZc(j3, f2);
        Rect rect = new Rect(0, 0, h.h.a.b(Float.intBitsToFloat((int) (j2 >> 32))), h.h.a.b(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
