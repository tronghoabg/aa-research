package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import ff.AbstractC2641B;
import i.AbstractC2820a;
import p.AbstractC3752c;
import p.C3751b;
import p.j;
import p.k;
import p.m;
import p.y;
import q.InterfaceC3818j;
import q.Y;

/* loaded from: classes.dex */
public class ActionMenuItemView extends Y implements y, View.OnClickListener, InterfaceC3818j {

    /* renamed from: h, reason: collision with root package name */
    public m f17757h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f17758i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f17759j;
    public j k;

    /* renamed from: l, reason: collision with root package name */
    public C3751b f17760l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC3752c f17761m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17762n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17763o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17764p;

    /* renamed from: q, reason: collision with root package name */
    public int f17765q;

    /* renamed from: r, reason: collision with root package name */
    public final int f17766r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f17762n = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2820a.f36440c, 0, 0);
        this.f17764p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f17766r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f17765q = -1;
        setSaveEnabled(false);
    }

    @Override // q.InterfaceC3818j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // q.InterfaceC3818j
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f17757h.getIcon() == null;
    }

    @Override // p.y
    public final void c(m mVar) {
        this.f17757h = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.getTitleCondensed());
        setId(mVar.f43068a);
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.f17760l == null) {
            this.f17760l = new C3751b(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i5 < 480) {
            return (i5 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p.y
    public m getItemData() {
        return this.f17757h;
    }

    public final void h() {
        boolean z2 = true;
        boolean z10 = !TextUtils.isEmpty(this.f17758i);
        if (this.f17759j != null && ((this.f17757h.f43091y & 4) != 4 || (!this.f17762n && !this.f17763o))) {
            z2 = false;
        }
        boolean z11 = z10 & z2;
        setText(z11 ? this.f17758i : null);
        CharSequence charSequence = this.f17757h.f43083q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f17757h.f43072e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f17757h.f43084r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC2641B.J(this, z11 ? null : this.f17757h.f43072e);
        } else {
            AbstractC2641B.J(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.k;
        if (jVar != null) {
            jVar.a(this.f17757h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17762n = g();
        h();
    }

    @Override // q.Y, android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i11 = this.f17765q) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f17764p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (!zIsEmpty || this.f17759j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f17759j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3751b c3751b;
        if (this.f17757h.hasSubMenu() && (c3751b = this.f17760l) != null && c3751b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f17763o != z2) {
            this.f17763o = z2;
            m mVar = this.f17757h;
            if (mVar != null) {
                k kVar = mVar.f43080n;
                kVar.k = true;
                kVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f17759j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i5 = this.f17766r;
            if (intrinsicWidth > i5) {
                intrinsicHeight = (int) (intrinsicHeight * (i5 / intrinsicWidth));
                intrinsicWidth = i5;
            }
            if (intrinsicHeight > i5) {
                intrinsicWidth = (int) (intrinsicWidth * (i5 / intrinsicHeight));
            } else {
                i5 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i5);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(j jVar) {
        this.k = jVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i5, int i10, int i11, int i12) {
        this.f17765q = i5;
        super.setPadding(i5, i10, i11, i12);
    }

    public void setPopupCallback(AbstractC3752c abstractC3752c) {
        this.f17761m = abstractC3752c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f17758i = charSequence;
        h();
    }
}
