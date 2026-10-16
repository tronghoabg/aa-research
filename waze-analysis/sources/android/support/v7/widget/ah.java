package android.support.v7.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
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
import androidx.core.util.Preconditions;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ah extends EditText implements TintableBackgroundView, OnReceiveContentViewBehavior, TintableCompoundDrawablesView {

    /* renamed from: a, reason: collision with root package name */
    private final x f1054a;

    /* renamed from: b, reason: collision with root package name */
    private final bj f1055b;

    /* renamed from: c, reason: collision with root package name */
    private final TextViewOnReceiveContentListener f1056c;

    /* renamed from: d, reason: collision with root package name */
    private final ai f1057d;

    /* renamed from: e, reason: collision with root package name */
    private ag f1058e;

    /* renamed from: f, reason: collision with root package name */
    private bi f1059f;

    public ah(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        fz.d(this, getContext());
        x xVar = new x(this);
        this.f1054a = xVar;
        xVar.d(attributeSet, i2);
        bj bjVar = new bj(this);
        this.f1055b = bjVar;
        bjVar.e(attributeSet, i2);
        bjVar.d();
        Preconditions.checkNotNull(this);
        this.f1056c = new TextViewOnReceiveContentListener();
        ai aiVar = new ai(this);
        this.f1057d = aiVar;
        aiVar.c(attributeSet, i2);
        KeyListener keyListener = getKeyListener();
        if (ai.d(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = aiVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private final ag c() {
        ag agVar = this.f1058e;
        if (agVar != null) {
            return agVar;
        }
        ag agVar2 = new ag(this);
        this.f1058e = agVar2;
        return agVar2;
    }

    final bi a() {
        bi biVar = this.f1059f;
        if (biVar != null) {
            return biVar;
        }
        bi biVar2 = new bi(this, new af(this, 0));
        this.f1059f = biVar2;
        return biVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1054a;
        if (xVar != null) {
            xVar.c();
        }
        bj bjVar = this.f1055b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return a().b();
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f1054a;
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f1054a;
        if (xVar != null) {
            return xVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1055b.a();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1055b.b();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return a().a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] onReceiveContentMimeTypes;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        bj.k(this, inputConnectionOnCreateInputConnection, editorInfo);
        ed.b(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (onReceiveContentMimeTypes = ViewCompat.getOnReceiveContentMimeTypes(this)) != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, onReceiveContentMimeTypes);
            inputConnectionOnCreateInputConnection = InputConnectionCompat.createWrapper(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.f1057d.b(inputConnectionOnCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ViewCompat.getOnReceiveContentMimeTypes(this) != null) {
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
                ah ahVar = this;
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = ahVar.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                ahVar.beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) ahVar.getText(), offsetForPosition);
                    ViewCompat.performReceiveContent(ahVar, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
                    return true;
                } finally {
                    ahVar.endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
        return this.f1056c.onReceiveContent(this, contentInfoCompat);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        if (Build.VERSION.SDK_INT < 31 && ViewCompat.getOnReceiveContentMimeTypes(this) != null) {
            if (i2 != 16908322) {
                if (i2 == 16908337) {
                    i2 = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                ContentInfoCompat.Builder builder = new ContentInfoCompat.Builder(primaryClip, 1);
                builder.setFlags(i2 == 16908322 ? 0 : 1);
                ViewCompat.performReceiveContent(this, builder.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x xVar = this.f1054a;
        if (xVar != null) {
            xVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x xVar = this.f1054a;
        if (xVar != null) {
            xVar.e(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1055b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bj bjVar = this.f1055b;
        if (bjVar != null) {
            bjVar.d();
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return a().d(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1057d.a(keyListener));
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x xVar = this.f1054a;
        if (xVar != null) {
            xVar.g(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x xVar = this.f1054a;
        if (xVar != null) {
            xVar.h(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        bj bjVar = this.f1055b;
        bjVar.i(colorStateList);
        bjVar.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        bj bjVar = this.f1055b;
        bjVar.j(mode);
        bjVar.d();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        bj bjVar = this.f1055b;
        if (bjVar != null) {
            bjVar.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        a().c(typeface);
    }

    public ah(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public ah(Context context) {
        this(context, null);
    }
}
