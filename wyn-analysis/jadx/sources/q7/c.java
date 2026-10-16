package Q7;

import D9.o;
import Fe.g;
import U8.v0;
import Va.M6;
import W7.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u3.C4240b;
import u3.C4241c;
import u3.C4242d;

/* loaded from: classes4.dex */
public final class c extends AppCompatCheckBox {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f9892e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f9893f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9894g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9895h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9896i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9897j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f9898l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f9899m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9900n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f9901o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f9902p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f9903q;

    /* renamed from: r, reason: collision with root package name */
    public int f9904r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f9905s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9906t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f9907u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f9908v;

    /* renamed from: w, reason: collision with root package name */
    public final C4242d f9909w;

    /* renamed from: x, reason: collision with root package name */
    public final a f9910x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9890y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f9891z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f9888A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f9889B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r12, android.util.AttributeSet r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i5 = this.f9904r;
        return i5 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i5 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9894g == null) {
            int I3 = v0.I(R.attr.colorControlActivated, this);
            int I10 = v0.I(R.attr.colorError, this);
            int I11 = v0.I(R.attr.colorSurface, this);
            int I12 = v0.I(R.attr.colorOnSurface, this);
            this.f9894g = new ColorStateList(f9888A, new int[]{v0.S(1.0f, I11, I10), v0.S(1.0f, I11, I3), v0.S(0.54f, I11, I12), v0.S(0.38f, I11, I12), v0.S(0.38f, I11, I12)});
        }
        return this.f9894g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f9901o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        int intrinsicWidth;
        int intrinsicHeight;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        o oVar;
        Drawable drawableMutate = this.f9898l;
        ColorStateList colorStateList3 = this.f9901o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f9898l = drawableMutate;
        Drawable drawableMutate2 = this.f9899m;
        ColorStateList colorStateList4 = this.f9902p;
        PorterDuff.Mode mode = this.f9903q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f9899m = drawableMutate2;
        if (this.f9900n) {
            C4242d c4242d = this.f9909w;
            if (c4242d != null) {
                Drawable drawable = c4242d.f46586a;
                a aVar = this.f9910x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f9885a == null) {
                        aVar.f9885a = new C4240b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f9885a);
                }
                ArrayList arrayList = c4242d.f46582e;
                C4241c c4241c = c4242d.f46579b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c4242d.f46582e.size() == 0 && (oVar = c4242d.f46581d) != null) {
                        c4241c.f46575b.removeListener(oVar);
                        c4242d.f46581d = null;
                    }
                }
                Drawable drawable2 = c4242d.f46586a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f9885a == null) {
                        aVar.f9885a = new C4240b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f9885a);
                } else if (aVar != null) {
                    if (c4242d.f46582e == null) {
                        c4242d.f46582e = new ArrayList();
                    }
                    if (!c4242d.f46582e.contains(aVar)) {
                        c4242d.f46582e.add(aVar);
                        if (c4242d.f46581d == null) {
                            c4242d.f46581d = new o(c4242d, 6);
                        }
                        c4241c.f46575b.addListener(c4242d.f46581d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f9898l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && c4242d != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c4242d, false);
                    ((AnimatedStateListDrawable) this.f9898l).addTransition(R.id.indeterminate, R.id.unchecked, c4242d, false);
                }
            }
        }
        Drawable drawable4 = this.f9898l;
        if (drawable4 != null && (colorStateList2 = this.f9901o) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f9899m;
        if (drawable5 != null && (colorStateList = this.f9902p) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f9898l;
        Drawable drawable7 = this.f9899m;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
            } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                float intrinsicWidth2 = drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight();
                if (intrinsicWidth2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth3 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth3 / intrinsicWidth2);
                    intrinsicWidth = intrinsicWidth3;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
                }
            } else {
                intrinsicWidth = drawable7.getIntrinsicWidth();
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f9898l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f9899m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f9902p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f9903q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f9901o;
    }

    public int getCheckedState() {
        return this.f9904r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f9904r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9895h && this.f9901o == null && this.f9902p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9890y);
        }
        if (this.f9897j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9891z);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i11 = iArrOnCreateDrawableState[i10];
            if (i11 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i11 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i10] = 16842912;
                break;
            }
            i10++;
        }
        this.f9905s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f9896i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (k.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f9897j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f9887a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f9887a = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i5) {
        setButtonDrawable(g.B(getContext(), i5));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f9899m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i5) {
        setButtonIconDrawable(g.B(getContext(), i5));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f9902p == colorStateList) {
            return;
        }
        this.f9902p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f9903q == mode) {
            return;
        }
        this.f9903q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f9901o == colorStateList) {
            return;
        }
        this.f9901o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f9896i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i5) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f9904r != i5) {
            this.f9904r = i5;
            super.setChecked(i5 == 1);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.f9907u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f9906t) {
                return;
            }
            this.f9906t = true;
            LinkedHashSet linkedHashSet = this.f9893f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw M6.j(it);
                }
            }
            if (this.f9904r != 2 && (onCheckedChangeListener = this.f9908v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f9906t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i5) {
        setErrorAccessibilityLabel(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f9897j == z2) {
            return;
        }
        this.f9897j = z2;
        refreshDrawableState();
        Iterator it = this.f9892e.iterator();
        if (it.hasNext()) {
            throw M6.j(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9908v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f9907u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f9895h = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f9898l = drawable;
        this.f9900n = false;
        a();
    }
}
