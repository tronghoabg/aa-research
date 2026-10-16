package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class iz extends CheckedTextView {
    private final iw a;
    private final jw b;
    private final aaem c;
    private bii d;

    public iz(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        nb.d(this, getContext());
        jw jwVar = new jw(this);
        this.b = jwVar;
        jwVar.c(attributeSet, R.attr.checkedTextViewStyle);
        jwVar.a();
        iw iwVar = new iw(this);
        this.a = iwVar;
        iwVar.b(attributeSet, R.attr.checkedTextViewStyle);
        aaem aaemVar = new aaem(this);
        this.c = aaemVar;
        aaemVar.u(attributeSet);
        a().I(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final bii a() {
        bii biiVar = this.d;
        if (biiVar != null) {
            return biiVar;
        }
        bii biiVar2 = new bii((TextView) this);
        this.d = biiVar2;
        return biiVar2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        jw jwVar = this.b;
        if (jwVar != null) {
            jwVar.a();
        }
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.a();
        }
        aaem aaemVar = this.c;
        if (aaemVar != null) {
            aaemVar.t();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        eee.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        lv.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        emr emrVar = emr.b;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        iw iwVar = this.a;
        if (iwVar != null) {
            iwVar.c(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        aaem aaemVar = this.c;
        if (aaemVar != null) {
            if (aaemVar.a) {
                aaemVar.a = false;
            } else {
                aaemVar.a = true;
                aaemVar.t();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jw jwVar = this.b;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jw jwVar = this.b;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jw jwVar = this.b;
        if (jwVar != null) {
            jwVar.d(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ca.e(getContext(), i));
    }
}
