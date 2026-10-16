package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rnn extends android.view.inputmethod.InputConnectionWrapper {
    private final defpackage.rnh a;

    public rnn(defpackage.rnh rnhVar) {
        super(null, true);
        this.a = rnhVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        try {
            defpackage.rnh rnhVar = this.a;
            android.os.IBinder iBinderAsBinder = rnhVar.asBinder();
            if (iBinderAsBinder != null && iBinderAsBinder.isBinderAlive()) {
                return rnhVar.j();
            }
        } catch (android.os.RemoteException unused) {
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        try {
            return this.a.k(i);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        try {
            return this.a.l(charSequence, i);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        try {
            return this.a.m(i, i2);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        try {
            defpackage.rnh rnhVar = this.a;
            android.os.IBinder iBinderAsBinder = rnhVar.asBinder();
            if (iBinderAsBinder != null && iBinderAsBinder.isBinderAlive()) {
                return rnhVar.n();
            }
        } catch (android.os.RemoteException unused) {
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        try {
            return this.a.o();
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        try {
            return this.a.e(i);
        } catch (android.os.RemoteException unused) {
            return 0;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i) {
        return null;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i) {
        try {
            return this.a.f(i);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i, int i2) {
        try {
            return this.a.g(i, i2);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i, int i2) {
        try {
            return this.a.h(i, i2);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        try {
            return this.a.p(i);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        try {
            return this.a.q(i);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        try {
            return this.a.r(str, bundle);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        try {
            return this.a.s(z);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        try {
            return this.a.t(keyEvent);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        try {
            return this.a.u(i, i2);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i) {
        try {
            return this.a.v(charSequence, i);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        try {
            return this.a.w(i, i2);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }
}
