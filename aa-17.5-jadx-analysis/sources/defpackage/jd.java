package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class jd extends EditText implements eak {
    private final iw a;
    private final jw b;
    private ccq c;
    private final rz d;
    private ajmd e;

    public jd(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        nb.d(this, getContext());
        iw iwVar = new iw(this);
        this.a = iwVar;
        iwVar.b(attributeSet, i);
        jw jwVar = new jw(this);
        this.b = jwVar;
        jwVar.c(attributeSet, i);
        jwVar.a();
        rz rzVar = new rz(this);
        this.d = rzVar;
        rzVar.d(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (rz.e(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerF = rz.f(keyListener);
            if (keyListenerF == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerF);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private final ajmd d() {
        ajmd ajmdVar = this.e;
        if (ajmdVar != null) {
            return ajmdVar;
        }
        ajmd ajmdVar2 = new ajmd(this, null);
        this.e = ajmdVar2;
        return ajmdVar2;
    }

    @Override // defpackage.eak
    public final dzw a(dzw dzwVar) {
        return ecx.b(this, dzwVar);
    }

    final ccq c() {
        ccq ccqVar = this.c;
        if (ccqVar != null) {
            return ccqVar;
        }
        ccq ccqVar2 = new ccq(this, new kzp(this, 1));
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
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        eee.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return (String) c().a;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return (Typeface) c().c;
    }

    @Override // android.widget.TextView, android.view.View, defpackage.gkt
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrT;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jw.f(this, inputConnectionOnCreateInputConnection, editorInfo);
        lv.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrT = ebm.t(this)) != null) {
            editorInfo.contentMimeTypes = strArrT;
            ajmd ajmdVar = new ajmd(this);
            a.al(editorInfo, "editorInfo must be non-null");
            inputConnectionOnCreateInputConnection = new edt(inputConnectionOnCreateInputConnection, ajmdVar);
        }
        return this.d.g(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ebm.t(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    ebm.c(this, (Build.VERSION.SDK_INT >= 31 ? new dzq(clipData, 3) : new dzs(clipData, 3)).a());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && ebm.t(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                dzr dzqVar = Build.VERSION.SDK_INT >= 31 ? new dzq(primaryClip, 1) : new dzs(primaryClip, 1);
                dzqVar.c(i == 16908322 ? 0 : 1);
                ebm.c(this, dzqVar.a());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
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
    public final boolean setFontVariationSettings(String str) {
        return c().e(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(rz.f(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jw jwVar = this.b;
        if (jwVar != null) {
            jwVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        c().d(typeface);
    }

    public jd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public jd(Context context) {
        this(context, null);
    }
}
