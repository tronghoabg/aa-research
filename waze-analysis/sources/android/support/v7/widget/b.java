package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.waze.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class b extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final a f1099a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f1100b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f1101c;

    /* renamed from: d, reason: collision with root package name */
    protected p f1102d;

    /* renamed from: e, reason: collision with root package name */
    protected int f1103e;

    /* renamed from: f, reason: collision with root package name */
    protected ViewPropertyAnimatorCompat f1104f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1105g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1106h;

    b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1099a = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1100b = context;
        } else {
            this.f1100b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int a(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    protected static final int f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    protected static final int g(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        int i6 = measuredHeight + i5;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, i6);
            return -measuredWidth;
        }
        view.layout(i2, i5, i2 + measuredWidth, i6);
        return measuredWidth;
    }

    public final ViewPropertyAnimatorCompat b(int i2, long j2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f1104f;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        if (i2 != 0) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate = ViewCompat.animate(this);
            viewPropertyAnimatorCompatAnimate.alpha(0.0f);
            viewPropertyAnimatorCompatAnimate.setDuration(j2);
            a aVar = this.f1099a;
            aVar.a(viewPropertyAnimatorCompatAnimate, i2);
            viewPropertyAnimatorCompatAnimate.setListener(aVar);
            return viewPropertyAnimatorCompatAnimate;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate2 = ViewCompat.animate(this);
        viewPropertyAnimatorCompatAnimate2.alpha(1.0f);
        viewPropertyAnimatorCompatAnimate2.setDuration(j2);
        a aVar2 = this.f1099a;
        aVar2.a(viewPropertyAnimatorCompatAnimate2, 0);
        viewPropertyAnimatorCompatAnimate2.setListener(aVar2);
        return viewPropertyAnimatorCompatAnimate2;
    }

    public void d(int i2) {
        throw null;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, android.support.v7.a.a.f479a, R.attr.actionBarStyle, 0);
        d(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        p pVar = this.f1102d;
        if (pVar != null) {
            pVar.x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lc
            r5.f1106h = r1
            r0 = r2
        Lc:
            boolean r3 = r5.f1106h
            r4 = 1
            if (r3 != 0) goto L1c
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1c
            if (r6 != 0) goto L1d
            r5.f1106h = r4
            goto L1d
        L1c:
            r2 = r0
        L1d:
            r6 = 10
            if (r2 == r6) goto L24
            r6 = 3
            if (r2 != r6) goto L26
        L24:
            r5.f1106h = r1
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.b.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1105g = false;
            actionMasked = 0;
        }
        if (!this.f1105g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.f1105g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1105g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f1104f;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            super.setVisibility(i2);
        }
    }

    b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    b(Context context) {
        this(context, null);
    }
}
