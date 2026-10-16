package androidx.appcompat.widget;

import R1.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.wynauto.wyn.R;
import java.lang.reflect.InvocationTargetException;
import n1.InterfaceC3577k;
import q.C3811f0;
import q.C3835s;
import q.V;
import q.e1;
import q.f1;
import q.v1;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC3577k {

    /* renamed from: a, reason: collision with root package name */
    public final q f17852a;

    /* renamed from: b, reason: collision with root package name */
    public final V f17853b;

    /* renamed from: c, reason: collision with root package name */
    public C3835s f17854c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C3835s getEmojiTextViewHelper() {
        if (this.f17854c == null) {
            this.f17854c = new C3835s(this);
        }
        return this.f17854c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f17852a;
        if (qVar != null) {
            qVar.n();
        }
        V v2 = this.f17853b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (v1.f43928b) {
            return super.getAutoSizeMaxTextSize();
        }
        V v2 = this.f17853b;
        if (v2 != null) {
            return Math.round(v2.f43715i.f43775e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (v1.f43928b) {
            return super.getAutoSizeMinTextSize();
        }
        V v2 = this.f17853b;
        if (v2 != null) {
            return Math.round(v2.f43715i.f43774d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (v1.f43928b) {
            return super.getAutoSizeStepGranularity();
        }
        V v2 = this.f17853b;
        if (v2 != null) {
            return Math.round(v2.f43715i.f43773c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (v1.f43928b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v2 = this.f17853b;
        return v2 != null ? v2.f43715i.f43776f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (v1.f43928b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v2 = this.f17853b;
        if (v2 != null) {
            return v2.f43715i.f43771a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3935e.T(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f17852a;
        if (qVar != null) {
            return qVar.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f17852a;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17853b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17853b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        V v2 = this.f17853b;
        if (v2 == null || v1.f43928b) {
            return;
        }
        v2.f43715i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        super.onTextChanged(charSequence, i5, i10, i11);
        V v2 = this.f17853b;
        if (v2 == null || v1.f43928b) {
            return;
        }
        C3811f0 c3811f0 = v2.f43715i;
        if (c3811f0.f()) {
            c3811f0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i10, int i11, int i12) {
        if (v1.f43928b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i5, i10, i11, i12);
            return;
        }
        V v2 = this.f17853b;
        if (v2 != null) {
            v2.h(i5, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i5) {
        if (v1.f43928b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
            return;
        }
        V v2 = this.f17853b;
        if (v2 != null) {
            v2.i(iArr, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i5) {
        if (v1.f43928b) {
            super.setAutoSizeTextTypeWithDefaults(i5);
            return;
        }
        V v2 = this.f17853b;
        if (v2 != null) {
            v2.j(i5);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f17852a;
        if (qVar != null) {
            qVar.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.f17852a;
        if (qVar != null) {
            qVar.v(i5);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3935e.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        V v2 = this.f17853b;
        if (v2 != null) {
            v2.f43707a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f17852a;
        if (qVar != null) {
            qVar.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f17852a;
        if (qVar != null) {
            qVar.z(mode);
        }
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f17853b;
        v2.k(colorStateList);
        v2.b();
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f17853b;
        v2.l(mode);
        v2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) throws Resources.NotFoundException {
        super.setTextAppearance(context, i5);
        V v2 = this.f17853b;
        if (v2 != null) {
            v2.g(context, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i5, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = v1.f43928b;
        if (z2) {
            super.setTextSize(i5, f10);
            return;
        }
        V v2 = this.f17853b;
        if (v2 == null || z2) {
            return;
        }
        C3811f0 c3811f0 = v2.f43715i;
        if (c3811f0.f()) {
            return;
        }
        c3811f0.g(f10, i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i5) throws Resources.NotFoundException {
        super(context, attributeSet, i5);
        f1.a(context);
        e1.a(getContext(), this);
        q qVar = new q(this);
        this.f17852a = qVar;
        qVar.t(attributeSet, i5);
        V v2 = new V(this);
        this.f17853b = v2;
        v2.f(attributeSet, i5);
        v2.b();
        getEmojiTextViewHelper().b(attributeSet, i5);
    }
}
