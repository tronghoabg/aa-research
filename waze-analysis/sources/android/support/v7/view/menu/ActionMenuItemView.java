package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.bn;
import android.support.v7.widget.cr;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ActionMenuItemView extends bn implements View.OnClickListener, ae, android.support.v7.widget.q {

    /* renamed from: a, reason: collision with root package name */
    t f713a;

    /* renamed from: b, reason: collision with root package name */
    p f714b;

    /* renamed from: c, reason: collision with root package name */
    c f715c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f716d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f717e;

    /* renamed from: f, reason: collision with root package name */
    private cr f718f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f719g;

    /* renamed from: h, reason: collision with root package name */
    private int f720h;

    /* renamed from: i, reason: collision with root package name */
    private int f721i;

    /* renamed from: j, reason: collision with root package name */
    private int f722j;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f719g = p();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.a.a.f481c, i2, 0);
        this.f720h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f722j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f721i = -1;
        setSaveEnabled(false);
    }

    private final void o() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f716d);
        if (this.f717e != null && (!this.f713a.q() || !this.f719g)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f716d : null);
        CharSequence contentDescription = this.f713a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f713a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f713a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            setTooltipText(z3 ? null : this.f713a.getTitle());
        } else {
            setTooltipText(tooltipText);
        }
    }

    private final boolean p() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        return i2 >= 480 || configuration.orientation == 2;
    }

    @Override // android.support.v7.view.menu.ae
    public final t a() {
        return this.f713a;
    }

    public final void b(p pVar) {
        this.f714b = pVar;
    }

    public final void c(c cVar) {
        this.f715c = cVar;
    }

    public final boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.support.v7.widget.q
    public final boolean e() {
        return d();
    }

    @Override // android.support.v7.widget.q
    public final boolean f() {
        return d() && this.f713a.getIcon() == null;
    }

    @Override // android.support.v7.view.menu.ae
    public final boolean g() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // android.support.v7.view.menu.ae
    public final void h(t tVar) {
        this.f713a = tVar;
        Drawable icon = tVar.getIcon();
        this.f717e = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f722j;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(icon, null, null, null);
        o();
        this.f716d = tVar.c(this);
        o();
        setId(tVar.getItemId());
        setVisibility(true != tVar.isVisible() ? 8 : 0);
        setEnabled(tVar.isEnabled());
        if (tVar.hasSubMenu() && this.f718f == null) {
            this.f718f = new b(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p pVar = this.f714b;
        if (pVar != null) {
            pVar.b(this.f713a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f719g = p();
        o();
    }

    @Override // android.support.v7.widget.bn, android.widget.TextView, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4;
        boolean zD = d();
        if (zD && (i4 = this.f721i) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int iMin = this.f720h;
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size, iMin);
        }
        if (mode != 1073741824 && this.f720h > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (zD || this.f717e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f717e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cr crVar;
        if (this.f713a.hasSubMenu() && (crVar = this.f718f) != null && crVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f721i = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
