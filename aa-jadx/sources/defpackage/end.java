package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class end implements android.text.method.KeyListener {
    private final android.text.method.KeyListener a;

    public end(android.text.method.KeyListener keyListener) {
        this.a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(android.view.View view, android.text.Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[RETURN] */
    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        boolean zN;
        if (i != 67) {
            if (i == 112) {
                zN = defpackage.due.n(editable, keyEvent, true);
            } else if (this.a.onKeyDown(view, editable, i, keyEvent)) {
                return false;
            }
            return true;
        }
        zN = defpackage.due.n(editable, keyEvent, false);
        if (zN) {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        } else if (this.a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(android.view.View view, android.text.Editable editable, android.view.KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
