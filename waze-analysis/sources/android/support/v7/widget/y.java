package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class y extends Button implements TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView {
    private aj mAppCompatEmojiTextHelper;
    private final x mBackgroundTintHelper;
    private bi mFontVariationSettingsManager;
    private final bj mTextHelper;

    public y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        fz.d(this, getContext());
        x xVar = new x(this);
        this.mBackgroundTintHelper = xVar;
        xVar.d(attributeSet, i2);
        bj bjVar = new bj(this);
        this.mTextHelper = bjVar;
        bjVar.e(attributeSet, i2);
        bjVar.d();
        getEmojiTextViewHelper().b(attributeSet, i2);
    }

    private aj getEmojiTextViewHelper() {
        aj ajVar = this.mAppCompatEmojiTextHelper;
        if (ajVar != null) {
            return ajVar;
        }
        aj ajVar2 = new aj(this);
        this.mAppCompatEmojiTextHelper = ajVar2;
        return ajVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.c();
        }
        bj bjVar = this.mTextHelper;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().b();
    }

    bi getFontVariationSettingsManager() {
        bi biVar = this.mFontVariationSettingsManager;
        if (biVar != null) {
            return biVar;
        }
        bi biVar2 = new bi(this, new af(this, 1));
        this.mFontVariationSettingsManager = biVar2;
        return biVar2;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.a();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return getFontVariationSettingsManager().a();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().e();
    }

    /* renamed from: lambda$getFontVariationSettingsManager$0$android-support-v7-widget-AppCompatButton, reason: not valid java name */
    /* synthetic */ void m142xdc1dcc3(Typeface typeface) {
        super.setTypeface(typeface);
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
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        super.setAutoSizeTextTypeWithDefaults(i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.e(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f(inputFilterArr));
    }

    @Override // android.widget.TextView
    public boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().d(str);
    }

    public void setSupportAllCaps(boolean z) {
        bj bjVar = this.mTextHelper;
        if (bjVar != null) {
            bjVar.h(z);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.g(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x xVar = this.mBackgroundTintHelper;
        if (xVar != null) {
            xVar.h(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.i(colorStateList);
        this.mTextHelper.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.j(mode);
        this.mTextHelper.d();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        bj bjVar = this.mTextHelper;
        if (bjVar != null) {
            bjVar.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        getFontVariationSettingsManager().c(typeface);
    }

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public y(Context context) {
        this(context, null);
    }
}
