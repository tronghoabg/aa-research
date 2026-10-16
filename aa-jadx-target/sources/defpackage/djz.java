package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class djz implements android.view.inputmethod.InputConnection {
    public defpackage.dkd a;
    public int b;
    public boolean c;
    private int e;
    private final defpackage.izq g;
    private final java.util.List f = new java.util.ArrayList();
    public boolean d = true;

    public djz(defpackage.dkd dkdVar, defpackage.izq izqVar) {
        this.g = izqVar;
        this.a = dkdVar;
    }

    private final void a(defpackage.djg djgVar) {
        d();
        try {
            this.f.add(djgVar);
        } finally {
            c();
        }
    }

    private final void b(int i) {
        sendKeyEvent(new android.view.KeyEvent(0, i));
        sendKeyEvent(new android.view.KeyEvent(1, i));
    }

    private final boolean c() {
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            java.util.List list = this.f;
            if (!list.isEmpty()) {
                ((defpackage.dkf) this.g.a).c.invoke(defpackage.afga.bb(list));
                list.clear();
            }
        }
        return this.e > 0;
    }

    private final void d() {
        this.e++;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!this.d) {
            return false;
        }
        d();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f.clear();
        this.e = 0;
        this.d = false;
        java.util.List list = ((defpackage.dkf) this.g.a).g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (defpackage.afga.f(((java.lang.ref.WeakReference) list.get(i)).get(), this)) {
                list.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        return this.d;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new defpackage.djb(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new defpackage.dje(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new defpackage.djf(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!this.d) {
            return false;
        }
        a(new defpackage.dji());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return android.text.TextUtils.getCapsMode(this.a.a(), defpackage.dgc.d(this.a.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i) {
        int i2 = i & 1;
        this.c = 1 == i2;
        if (i2 != 0) {
            this.b = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return defpackage.acmj.p(this.a);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i) {
        if (defpackage.dgc.i(this.a.b)) {
            return null;
        }
        return defpackage.dki.e(this.a).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i, int i2) {
        return defpackage.dki.f(this.a, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i, int i2) {
        return defpackage.dki.g(this.a, i).b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        if (this.d) {
            switch (i) {
                case android.R.id.selectAll:
                    a(new defpackage.dkc(0, this.a.a().length()));
                    break;
                case android.R.id.cut:
                    b(277);
                    break;
                case android.R.id.copy:
                    b(278);
                    break;
                case android.R.id.paste:
                    b(279);
                    break;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        if (!this.d) {
            return false;
        }
        if (i != 0) {
            switch (i) {
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    i2 = 2;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    i2 = 3;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    i2 = 4;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    i2 = 6;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    i2 = 7;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = 5;
                    break;
                default:
                    android.util.Log.w("RecordingIC", defpackage.a.bo(i, "IME sends unsupported Editor Action: "));
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        ((defpackage.dkf) this.g.a).d.invoke(new defpackage.djk(i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        return this.d;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0063 A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:41:0x0059, B:43:0x0063, B:45:0x0069, B:46:0x006c), top: B:53:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0069 A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:41:0x0059, B:43:0x0063, B:45:0x0069, B:46:0x006c), top: B:53:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.djc djcVar;
        boolean z4 = false;
        if (!this.d) {
            return false;
        }
        int i2 = i & 1;
        boolean z5 = (i & 2) != 0;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z6 = (i & 4) != 0;
            if (android.os.Build.VERSION.SDK_INT >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z6 || z4) {
                z = z4;
                z4 = z6;
            } else {
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    z = true;
                    z4 = true;
                } else {
                    z = z4;
                    z4 = true;
                }
                z2 = z4;
            }
            djcVar = ((defpackage.dkf) this.g.a).i;
            synchronized (djcVar.a) {
                djcVar.d = z2;
                djcVar.e = z3;
                djcVar.f = z4;
                djcVar.g = z;
                if (i2 != 0) {
                    djcVar.c = true;
                    if (djcVar.h != null) {
                        djcVar.a();
                    }
                }
                djcVar.b = z5;
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        djcVar = ((defpackage.dkf) this.g.a).i;
        synchronized (djcVar.a) {
            djcVar.d = z2;
            djcVar.e = z3;
            djcVar.f = z4;
            djcVar.g = z;
            if (i2 != 0) {
                djcVar.c = true;
                if (djcVar.h != null) {
                    djcVar.a();
                }
            }
            djcVar.b = z5;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        if (!this.d) {
            return false;
        }
        ((android.view.inputmethod.BaseInputConnection) ((defpackage.dkf) this.g.a).h.a()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.d;
        if (z) {
            a(new defpackage.dka(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new defpackage.dkb(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new defpackage.dkc(i, i2));
        return true;
    }
}
