package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jzs extends android.view.inputmethod.InputConnectionWrapper {
    public jzs(android.view.inputmethod.InputConnection inputConnection) {
        super(inputConnection, false);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        charSequence.getClass();
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.sendKeyEvent(keyEvent);
    }
}
