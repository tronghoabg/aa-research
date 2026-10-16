package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mom extends android.view.inputmethod.InputConnectionWrapper {
    final /* synthetic */ com.google.android.apps.auto.components.support.CarRestrictedEditText a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mom(com.google.android.apps.auto.components.support.CarRestrictedEditText carRestrictedEditText, android.view.inputmethod.InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = carRestrictedEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        defpackage.mon monVar = this.a.a;
        if (monVar == null) {
            return super.commitText(charSequence, i);
        }
        monVar.b(charSequence.toString());
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        defpackage.mon monVar = this.a.a;
        if (monVar == null) {
            return super.deleteSurroundingText(i, i2);
        }
        monVar.c();
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        com.google.android.apps.auto.components.support.CarRestrictedEditText carRestrictedEditText = this.a;
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
