package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class enc extends android.view.inputmethod.InputConnectionWrapper {
    private final android.widget.TextView a;

    public enc(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = textView;
        defpackage.emx emxVar = defpackage.emx.b;
    }

    private final android.text.Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return defpackage.due.o(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return defpackage.due.o(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
