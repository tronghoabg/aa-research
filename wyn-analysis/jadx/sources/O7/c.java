package O7;

import U8.v0;
import a8.AbstractC1340a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import c8.C1582f;
import c8.C1583g;
import c8.C1587k;
import c8.u;
import com.google.android.material.button.MaterialButton;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f8889a;

    /* renamed from: b, reason: collision with root package name */
    public C1587k f8890b;

    /* renamed from: c, reason: collision with root package name */
    public int f8891c;

    /* renamed from: d, reason: collision with root package name */
    public int f8892d;

    /* renamed from: e, reason: collision with root package name */
    public int f8893e;

    /* renamed from: f, reason: collision with root package name */
    public int f8894f;

    /* renamed from: g, reason: collision with root package name */
    public int f8895g;

    /* renamed from: h, reason: collision with root package name */
    public int f8896h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f8897i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f8898j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f8899l;

    /* renamed from: m, reason: collision with root package name */
    public C1583g f8900m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8904q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f8906s;

    /* renamed from: t, reason: collision with root package name */
    public int f8907t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8901n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8902o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8903p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8905r = true;

    public c(MaterialButton materialButton, C1587k c1587k) {
        this.f8889a = materialButton;
        this.f8890b = c1587k;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f8906s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f8906s.getNumberOfLayers() > 2 ? (u) this.f8906s.getDrawable(2) : (u) this.f8906s.getDrawable(1);
    }

    public final C1583g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f8906s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1583g) ((LayerDrawable) ((InsetDrawable) this.f8906s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(C1587k c1587k) {
        this.f8890b = c1587k;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(c1587k);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(c1587k);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(c1587k);
        }
    }

    public final void d(int i5, int i10) {
        WeakHashMap weakHashMap = S.f38779a;
        MaterialButton materialButton = this.f8889a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f8893e;
        int i12 = this.f8894f;
        this.f8894f = i10;
        this.f8893e = i5;
        if (!this.f8902o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i5) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void e() {
        C1583g c1583g = new C1583g(this.f8890b);
        MaterialButton materialButton = this.f8889a;
        c1583g.h(materialButton.getContext());
        c1583g.setTintList(this.f8898j);
        PorterDuff.Mode mode = this.f8897i;
        if (mode != null) {
            c1583g.setTintMode(mode);
        }
        float f10 = this.f8896h;
        ColorStateList colorStateList = this.k;
        c1583g.f19729a.f19722j = f10;
        c1583g.invalidateSelf();
        C1582f c1582f = c1583g.f19729a;
        if (c1582f.f19716d != colorStateList) {
            c1582f.f19716d = colorStateList;
            c1583g.onStateChange(c1583g.getState());
        }
        C1583g c1583g2 = new C1583g(this.f8890b);
        c1583g2.setTint(0);
        float f11 = this.f8896h;
        int I3 = this.f8901n ? v0.I(R.attr.colorSurface, materialButton) : 0;
        c1583g2.f19729a.f19722j = f11;
        c1583g2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(I3);
        C1582f c1582f2 = c1583g2.f19729a;
        if (c1582f2.f19716d != colorStateListValueOf) {
            c1582f2.f19716d = colorStateListValueOf;
            c1583g2.onStateChange(c1583g2.getState());
        }
        C1583g c1583g3 = new C1583g(this.f8890b);
        this.f8900m = c1583g3;
        c1583g3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1340a.a(this.f8899l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c1583g2, c1583g}), this.f8891c, this.f8893e, this.f8892d, this.f8894f), this.f8900m);
        this.f8906s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C1583g c1583gB = b(false);
        if (c1583gB != null) {
            c1583gB.i(this.f8907t);
            c1583gB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        C1583g c1583gB = b(false);
        C1583g c1583gB2 = b(true);
        if (c1583gB != null) {
            float f10 = this.f8896h;
            ColorStateList colorStateList = this.k;
            c1583gB.f19729a.f19722j = f10;
            c1583gB.invalidateSelf();
            C1582f c1582f = c1583gB.f19729a;
            if (c1582f.f19716d != colorStateList) {
                c1582f.f19716d = colorStateList;
                c1583gB.onStateChange(c1583gB.getState());
            }
            if (c1583gB2 != null) {
                float f11 = this.f8896h;
                int I3 = this.f8901n ? v0.I(R.attr.colorSurface, this.f8889a) : 0;
                c1583gB2.f19729a.f19722j = f11;
                c1583gB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(I3);
                C1582f c1582f2 = c1583gB2.f19729a;
                if (c1582f2.f19716d != colorStateListValueOf) {
                    c1582f2.f19716d = colorStateListValueOf;
                    c1583gB2.onStateChange(c1583gB2.getState());
                }
            }
        }
    }
}
