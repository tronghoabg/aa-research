package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class ic extends ViewGroup {
    protected final ib a;
    public final Context b;
    public ActionMenuView c;
    public io d;
    public int e;
    protected erb f;
    private boolean g;
    private boolean h;

    public ic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ib(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static final int e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int f(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        int i5 = measuredHeight + i4;
        if (z) {
            view.layout(i - measuredWidth, i4, i, i5);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, i5);
        return measuredWidth;
    }

    public void c(int i) {
        throw null;
    }

    public final erb g(int i, long j) {
        erb erbVar = this.f;
        if (erbVar != null) {
            erbVar.t();
        }
        if (i != 0) {
            erb erbVarV = ebm.v(this);
            erbVarV.u(BitmapDescriptorFactory.HUE_RED);
            erbVarV.v(j);
            ib ibVar = this.a;
            ibVar.d(erbVarV, i);
            erbVarV.w(ibVar);
            return erbVarV;
        }
        if (getVisibility() != 0) {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        erb erbVarV2 = ebm.v(this);
        erbVarV2.u(1.0f);
        erbVarV2.v(j);
        ib ibVar2 = this.a;
        ibVar2.d(erbVarV2, 0);
        erbVarV2.w(ibVar2);
        return erbVarV2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, fs.a, R.attr.actionBarStyle, 0);
        c(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        io ioVar = this.d;
        if (ioVar != null) {
            ioVar.h = ca.y(ioVar.b);
            hg hgVar = ioVar.c;
            if (hgVar != null) {
                hgVar.l(true);
            }
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
            r5.h = r1
            r0 = r2
        Lc:
            boolean r3 = r5.h
            r4 = 1
            if (r3 != 0) goto L1c
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1c
            if (r6 != 0) goto L1d
            r5.h = r4
            goto L1d
        L1c:
            r2 = r0
        L1d:
            r6 = 10
            if (r2 == r6) goto L24
            r6 = 3
            if (r2 != r6) goto L26
        L24:
            r5.h = r1
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            erb erbVar = this.f;
            if (erbVar != null) {
                erbVar.t();
            }
            super.setVisibility(i);
        }
    }

    public ic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    ic(Context context) {
        this(context, null);
    }
}
