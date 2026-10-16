package q;

import ac.C1346a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.wynauto.wyn.R;
import k1.C3117d;
import k1.C3119f;
import k1.InterfaceC3116c;
import k1.InterfaceC3131s;
import n1.C3575i;
import n1.InterfaceC3577k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public class r extends EditText implements InterfaceC3131s, InterfaceC3577k {

    /* renamed from: a, reason: collision with root package name */
    public final R1.q f43874a;

    /* renamed from: b, reason: collision with root package name */
    public final V f43875b;

    /* renamed from: c, reason: collision with root package name */
    public final C3845x f43876c;

    /* renamed from: d, reason: collision with root package name */
    public final C3575i f43877d;

    /* renamed from: e, reason: collision with root package name */
    public final C3845x f43878e;

    /* renamed from: f, reason: collision with root package name */
    public C3832q f43879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.editTextStyle);
        f1.a(context);
        e1.a(getContext(), this);
        R1.q qVar = new R1.q(this);
        this.f43874a = qVar;
        qVar.t(attributeSet, R.attr.editTextStyle);
        V v2 = new V(this);
        this.f43875b = v2;
        v2.f(attributeSet, R.attr.editTextStyle);
        v2.b();
        C3845x c3845x = new C3845x();
        c3845x.f43940b = this;
        this.f43876c = c3845x;
        this.f43877d = new C3575i();
        C3845x c3845x2 = new C3845x(this);
        this.f43878e = c3845x2;
        c3845x2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c3845x2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C3832q getSuperCaller() {
        if (this.f43879f == null) {
            this.f43879f = new C3832q(this);
        }
        return this.f43879f;
    }

    @Override // k1.InterfaceC3131s
    public final C3119f a(C3119f c3119f) {
        this.f43877d.getClass();
        return C3575i.a(this, c3119f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        R1.q qVar = this.f43874a;
        if (qVar != null) {
            qVar.n();
        }
        V v2 = this.f43875b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3935e.T(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        R1.q qVar = this.f43874a;
        if (qVar != null) {
            return qVar.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R1.q qVar = this.f43874a;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43875b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43875b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3845x c3845x;
        if (Build.VERSION.SDK_INT >= 28 || (c3845x = this.f43876c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c3845x.f43941c;
        return textClassifier == null ? N.a((TextView) c3845x.f43940b) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa A[PHI: r3
  0x00fa: PHI (r3v10 java.lang.String[]) = (r3v5 java.lang.String[]), (r3v11 java.lang.String[]) binds: [B:68:0x0111, B:60:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r19) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.r.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i5 = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i5 < 31 && i5 >= 24 && dragEvent.getLocalState() == null && k1.S.g(this) != null) {
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
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = AbstractC3849z.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i5) {
        InterfaceC3116c c1346a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || k1.S.g(this) == null || !(i5 == 16908322 || i5 == 16908337)) {
            return super.onTextContextMenuItem(i5);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                c1346a = new C1346a(primaryClip, 1);
            } else {
                C3117d c3117d = new C3117d();
                c3117d.f38807b = primaryClip;
                c3117d.f38808c = 1;
                c1346a = c3117d;
            }
            c1346a.x(i5 == 16908322 ? 0 : 1);
            k1.S.i(this, c1346a.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R1.q qVar = this.f43874a;
        if (qVar != null) {
            qVar.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        R1.q qVar = this.f43874a;
        if (qVar != null) {
            qVar.v(i5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43875b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f43875b;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3935e.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f43878e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f43878e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        R1.q qVar = this.f43874a;
        if (qVar != null) {
            qVar.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R1.q qVar = this.f43874a;
        if (qVar != null) {
            qVar.z(mode);
        }
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f43875b;
        v2.k(colorStateList);
        v2.b();
    }

    @Override // n1.InterfaceC3577k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f43875b;
        v2.l(mode);
        v2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) throws Resources.NotFoundException {
        super.setTextAppearance(context, i5);
        V v2 = this.f43875b;
        if (v2 != null) {
            v2.g(context, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3845x c3845x;
        if (Build.VERSION.SDK_INT >= 28 || (c3845x = this.f43876c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3845x.f43941c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
