package defpackage;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* loaded from: classes.dex */
class dji extends djh {
    public dji(InputConnection inputConnection, afec afecVar) {
        super(inputConnection, afecVar);
    }

    @Override // defpackage.djh
    protected final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // defpackage.djh, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // defpackage.djh, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
