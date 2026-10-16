package android.support.v7.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f1060a;

    /* renamed from: b, reason: collision with root package name */
    private final EmojiEditTextHelper f1061b;

    ai(EditText editText) {
        this.f1060a = editText;
        this.f1061b = new EmojiEditTextHelper(editText, false);
    }

    static final boolean d(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    final KeyListener a(KeyListener keyListener) {
        return d(keyListener) ? this.f1061b.getKeyListener(keyListener) : keyListener;
    }

    final InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1061b.onCreateInputConnection(inputConnection, editorInfo);
    }

    final void c(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f1060a.getContext().obtainStyledAttributes(attributeSet, android.support.v7.a.a.f487i, i2, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            this.f1061b.setEnabled(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
