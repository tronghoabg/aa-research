package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;

/* loaded from: classes2.dex */
public final class mog extends InputConnectionWrapper {
    final /* synthetic */ CarRestrictedEditText a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mog(CarRestrictedEditText carRestrictedEditText, InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = carRestrictedEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        moh mohVar = this.a.a;
        if (mohVar == null) {
            return super.commitText(charSequence, i);
        }
        mohVar.b(charSequence.toString());
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        moh mohVar = this.a.a;
        if (mohVar == null) {
            return super.deleteSurroundingText(i, i2);
        }
        mohVar.c();
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        CarRestrictedEditText carRestrictedEditText = this.a;
        if (carRestrictedEditText.a == null) {
            return super.sendKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            carRestrictedEditText.a.d((char) keyEvent.getKeyCode());
        } else if (keyEvent.getAction() == 1) {
            carRestrictedEditText.a.e((char) keyEvent.getKeyCode());
        }
        return true;
    }
}
