package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class ix extends Button {
    public final iw a;
    private final jw b;
    private ccq c;
    private bii d;

    public ix(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        nb.d(this, getContext());
        iw iwVar = new iw(this);
        this.a = iwVar;
        iwVar.b(attributeSet, i);
        jw jwVar = new jw(this);
        this.b = jwVar;
        jwVar.c(attributeSet, i);
        jwVar.a();
        c().I(attributeSet, i);
    }

    private final bii c() {
        bii biiVar = this.d;
        if (biiVar != null) {
            return biiVar;
        }
        bii biiVar2 = new bii((TextView) this);
        this.d = biiVar2;
        return biiVar2;
    }

    final ccq b() {
        ccq ccqVar = this.c;
        if (ccqVar != null) {
            return ccqVar;
        }
        ccq ccqVar2 = new ccq(this, new ba(this, 6));
        this.c = ccqVar2;
        return ccqVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.a();
        }
        jw jwVar = this.b;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        eee.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return (String) b().a;
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return (Typeface) b().c;
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

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        emr emrVar = emr.b;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        emr emrVar = emr.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return b().e(str);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jw jwVar = this.b;
        if (jwVar != null) {
            jwVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        b().d(typeface);
    }

    public ix(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public ix(Context context) {
        this(context, null);
    }
}
