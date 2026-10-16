package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bit implements android.view.inputmethod.InputConnection {
    public defpackage.dkd a;
    public int b;
    public boolean c;
    private final defpackage.beg e;
    private final defpackage.blw f;
    private final defpackage.dck g;
    private int h;
    private final defpackage.izq j;
    private final java.util.List i = new java.util.ArrayList();
    public boolean d = true;

    public bit(defpackage.dkd dkdVar, defpackage.izq izqVar, defpackage.beg begVar, defpackage.blw blwVar, defpackage.dck dckVar) {
        this.j = izqVar;
        this.e = begVar;
        this.f = blwVar;
        this.g = dckVar;
        this.a = dkdVar;
    }

    private final void c(int i) {
        sendKeyEvent(new android.view.KeyEvent(0, i));
        sendKeyEvent(new android.view.KeyEvent(1, i));
    }

    private final void d() {
        this.h++;
    }

    public final void a(defpackage.djg djgVar) {
        d();
        try {
            this.i.add(djgVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            java.util.List list = this.i;
            if (!list.isEmpty()) {
                ((defpackage.bis) this.j.a).b.invoke(defpackage.afga.bb(list));
                list.clear();
            }
        }
        return this.h > 0;
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
        this.i.clear();
        this.h = 0;
        this.d = false;
        java.util.List list = ((defpackage.bis) this.j.a).i;
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
        return b();
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
                    c(277);
                    break;
                case android.R.id.copy:
                    c(278);
                    break;
                case android.R.id.paste:
                    c(279);
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
        ((defpackage.bis) this.j.a).c.invoke(new defpackage.djk(i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture handwritingGesture, java.util.concurrent.Executor executor, final java.util.function.IntConsumer intConsumer) {
        defpackage.dfb dfbVar;
        char c;
        long jG;
        int i;
        int iE;
        defpackage.bfi bfiVarE;
        int iE2;
        defpackage.bfi bfiVarE2;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            defpackage.beg begVar = this.e;
            defpackage.blw blwVar = this.f;
            defpackage.dck dckVar = this.g;
            defpackage.bge bgeVar = new defpackage.bge(this, 16);
            final int iM = 3;
            if (begVar != null && (dfbVar = begVar.f) != null) {
                defpackage.bfi bfiVarE3 = begVar.e();
                if (defpackage.afga.f(dfbVar, bfiVarE3 != null ? bfiVarE3.a.a.a : null)) {
                    if (axd$.ExternalSyntheticApiModelOutline0.m$2(handwritingGesture)) {
                        android.view.inputmethod.SelectGesture selectGestureM = axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture);
                        long jF = defpackage.axd.F(begVar, defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m(selectGestureM)), defpackage.axd.Q(axd$.ExternalSyntheticApiModelOutline0.m(selectGestureM)), defpackage.dfx.b);
                        if (defpackage.dgc.i(jF)) {
                            iM = defpackage.axd.M(selectGestureM, bgeVar);
                        } else {
                            defpackage.axd.P(jF, blwVar, bgeVar);
                            iM = 1;
                        }
                    } else if (axd$.ExternalSyntheticApiModelOutline0.m$1(handwritingGesture)) {
                        android.view.inputmethod.DeleteGesture deleteGestureM = axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture);
                        int iQ = defpackage.axd.Q(axd$.ExternalSyntheticApiModelOutline0.m(deleteGestureM));
                        long jF2 = defpackage.axd.F(begVar, defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m(deleteGestureM)), iQ, defpackage.dfx.b);
                        if (defpackage.dgc.i(jF2)) {
                            iM = defpackage.axd.M(deleteGestureM, bgeVar);
                        } else {
                            defpackage.axd.N(jF2, dfbVar, defpackage.a.X(iQ, 1), bgeVar);
                            iM = 1;
                        }
                    } else if (axd$.ExternalSyntheticApiModelOutline0.m$3(handwritingGesture)) {
                        android.view.inputmethod.SelectRangeGesture selectRangeGestureM = axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture);
                        long jG2 = defpackage.axd.G(begVar, defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m(selectRangeGestureM)), defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m$1(selectRangeGestureM)), defpackage.axd.Q(axd$.ExternalSyntheticApiModelOutline0.m(selectRangeGestureM)), defpackage.dfx.b);
                        if (defpackage.dgc.i(jG2)) {
                            iM = defpackage.axd.M(selectRangeGestureM, bgeVar);
                        } else {
                            defpackage.axd.P(jG2, blwVar, bgeVar);
                            iM = 1;
                        }
                    } else if (axd$.ExternalSyntheticApiModelOutline0.m$4(handwritingGesture)) {
                        android.view.inputmethod.DeleteRangeGesture deleteRangeGestureM = axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture);
                        int iQ2 = defpackage.axd.Q(axd$.ExternalSyntheticApiModelOutline0.m(deleteRangeGestureM));
                        long jG3 = defpackage.axd.G(begVar, defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m(deleteRangeGestureM)), defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m$1(deleteRangeGestureM)), iQ2, defpackage.dfx.b);
                        if (defpackage.dgc.i(jG3)) {
                            iM = defpackage.axd.M(deleteRangeGestureM, bgeVar);
                        } else {
                            defpackage.axd.N(jG3, dfbVar, defpackage.a.X(iQ2, 1), bgeVar);
                            iM = 1;
                        }
                    } else {
                        int iIntValue = 0;
                        if (axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture)) {
                            android.view.inputmethod.JoinOrSplitGesture joinOrSplitGestureM = axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture);
                            if (dckVar == null || (iE2 = defpackage.axd.E(begVar, defpackage.axd.H(axd$.ExternalSyntheticApiModelOutline0.m(joinOrSplitGestureM)), dckVar)) == -1 || ((bfiVarE2 = begVar.e()) != null && defpackage.axd.I(bfiVarE2.a, iE2))) {
                                iM = defpackage.axd.M(joinOrSplitGestureM, bgeVar);
                            } else {
                                int iCharCount = iE2;
                                while (iCharCount > 0) {
                                    int iCodePointBefore = java.lang.Character.codePointBefore(dfbVar, iCharCount);
                                    if (!defpackage.axd.J(iCodePointBefore)) {
                                        break;
                                    } else {
                                        iCharCount -= java.lang.Character.charCount(iCodePointBefore);
                                    }
                                }
                                while (iE2 < dfbVar.a()) {
                                    int iCodePointAt = java.lang.Character.codePointAt(dfbVar, iE2);
                                    if (!defpackage.axd.J(iCodePointAt)) {
                                        break;
                                    } else {
                                        iE2 += java.lang.Character.charCount(iCodePointAt);
                                    }
                                }
                                long jG4 = defpackage.dax.g(iCharCount, iE2);
                                if (defpackage.dgc.i(jG4)) {
                                    defpackage.axd.O(defpackage.dgc.e(jG4), " ", bgeVar);
                                } else {
                                    defpackage.axd.N(jG4, dfbVar, false, bgeVar);
                                }
                                iM = 1;
                            }
                        } else if (axd$.ExternalSyntheticApiModelOutline0.m$5(handwritingGesture)) {
                            android.view.inputmethod.InsertGesture insertGestureM = axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture);
                            if (dckVar == null || (iE = defpackage.axd.E(begVar, defpackage.axd.H(axd$.ExternalSyntheticApiModelOutline0.m(insertGestureM)), dckVar)) == -1 || ((bfiVarE = begVar.e()) != null && defpackage.axd.I(bfiVarE.a, iE))) {
                                iM = defpackage.axd.M(insertGestureM, bgeVar);
                            } else {
                                defpackage.axd.O(iE, axd$.ExternalSyntheticApiModelOutline0.m(insertGestureM), bgeVar);
                                iM = 1;
                            }
                        } else if (axd$.ExternalSyntheticApiModelOutline0.m$6(handwritingGesture)) {
                            android.view.inputmethod.RemoveSpaceGesture removeSpaceGestureM = axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture);
                            defpackage.bfi bfiVarE4 = begVar.e();
                            defpackage.dga dgaVar = bfiVarE4 != null ? bfiVarE4.a : null;
                            long jH = defpackage.axd.H(axd$.ExternalSyntheticApiModelOutline0.m(removeSpaceGestureM));
                            long jH2 = defpackage.axd.H(axd$.ExternalSyntheticApiModelOutline0.m$1(removeSpaceGestureM));
                            defpackage.ctc ctcVarF = begVar.f();
                            if (dgaVar == null || ctcVarF == null) {
                                c = ' ';
                                jG = defpackage.dgc.a;
                            } else {
                                long jM = ctcVarF.m(jH);
                                long jM2 = ctcVarF.m(jH2);
                                defpackage.dfi dfiVar = dgaVar.b;
                                c = ' ';
                                int iD = defpackage.axd.D(dfiVar, jM, dckVar);
                                int iD2 = defpackage.axd.D(dfiVar, jM2, dckVar);
                                if (iD == -1) {
                                    if (iD2 == -1) {
                                        jG = defpackage.dgc.a;
                                    } else {
                                        iD = iD2;
                                    }
                                } else if (iD2 != -1) {
                                    iD = java.lang.Math.min(iD, iD2);
                                }
                                int i2 = (int) (jM2 >> 32);
                                int i3 = (int) (jM >> 32);
                                float fD = (dgaVar.d(iD) + dgaVar.a(iD)) / 2.0f;
                                jG = dfiVar.g(new defpackage.cjj(java.lang.Math.min(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i2)), (-0.1f) + fD, java.lang.Math.max(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i2)), fD + 0.1f), 0, defpackage.dfx.a);
                            }
                            if (defpackage.dgc.i(jG)) {
                                iM = defpackage.axd.M(removeSpaceGestureM, bgeVar);
                            } else {
                                defpackage.afgt afgtVar = new defpackage.afgt();
                                afgtVar.a = -1;
                                defpackage.afgt afgtVar2 = new defpackage.afgt();
                                afgtVar2.a = -1;
                                int i4 = (int) (jG >> c);
                                int i5 = (int) (4294967295L & jG);
                                java.lang.String string = dfbVar.subSequence(java.lang.Math.min(i4, i5), java.lang.Math.max(i4, i5)).b;
                                aito aitoVar = new aito("\\s+");
                                defpackage.beh behVar = new defpackage.beh(afgtVar, afgtVar2, 6, null);
                                string.getClass();
                                aiti aitiVarG = aitoVar.g(string);
                                if (aitiVarG != null) {
                                    int length = string.length();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
                                    do {
                                        sb.append((java.lang.CharSequence) string, iIntValue, aitiVarG.b().f().intValue());
                                        sb.append((java.lang.CharSequence) behVar.invoke(aitiVarG));
                                        iIntValue = aitiVarG.b().e().intValue() + 1;
                                        aitiVarG = aitiVarG.c();
                                        if (iIntValue >= length) {
                                            break;
                                        }
                                    } while (aitiVarG != null);
                                    if (iIntValue < length) {
                                        sb.append((java.lang.CharSequence) string, iIntValue, length);
                                    }
                                    string = sb.toString();
                                }
                                int i6 = afgtVar.a;
                                if (i6 == -1 || (i = afgtVar2.a) == -1) {
                                    iM = defpackage.axd.M(removeSpaceGestureM, bgeVar);
                                } else {
                                    int iE3 = defpackage.dgc.e(jG) + i6;
                                    int iE4 = defpackage.dgc.e(jG);
                                    java.lang.String strSubstring = string.substring(i6, string.length() - (defpackage.dgc.b(jG) - afgtVar2.a));
                                    strSubstring.getClass();
                                    bgeVar.invoke(new defpackage.bik(new defpackage.djg[]{new defpackage.dkc(iE3, iE4 + i), new defpackage.djb(strSubstring, 1)}));
                                    iM = 1;
                                }
                            }
                        } else {
                            iM = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new java.lang.Runnable() { // from class: bif
                    @Override // java.lang.Runnable
                    public final void run() {
                        a$.ExternalSyntheticApiModelOutline2.m(intConsumer, iM);
                    }
                });
            } else {
                a$.ExternalSyntheticApiModelOutline2.m(intConsumer, iM);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        defpackage.dfb dfbVar;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            defpackage.beg begVar = this.e;
            final defpackage.blw blwVar = this.f;
            if (begVar == null || (dfbVar = begVar.f) == null) {
                return false;
            }
            defpackage.bfi bfiVarE = begVar.e();
            if (!defpackage.afga.f(dfbVar, bfiVarE != null ? bfiVarE.a.a.a : null)) {
                return false;
            }
            if (axd$.ExternalSyntheticApiModelOutline0.m$2(previewableHandwritingGesture)) {
                android.view.inputmethod.SelectGesture selectGestureM = axd$.ExternalSyntheticApiModelOutline0.m(previewableHandwritingGesture);
                if (blwVar != null) {
                    blwVar.r(defpackage.axd.F(begVar, defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m(selectGestureM)), defpackage.axd.Q(axd$.ExternalSyntheticApiModelOutline0.m(selectGestureM)), defpackage.dfx.b));
                } else {
                    blwVar = null;
                }
            } else if (axd$.ExternalSyntheticApiModelOutline0.m$1(previewableHandwritingGesture)) {
                android.view.inputmethod.DeleteGesture deleteGestureM = axd$.ExternalSyntheticApiModelOutline0.m(previewableHandwritingGesture);
                if (blwVar != null) {
                    blwVar.o(defpackage.axd.F(begVar, defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m(deleteGestureM)), defpackage.axd.Q(axd$.ExternalSyntheticApiModelOutline0.m(deleteGestureM)), defpackage.dfx.b));
                } else {
                    blwVar = null;
                }
            } else if (axd$.ExternalSyntheticApiModelOutline0.m$3(previewableHandwritingGesture)) {
                android.view.inputmethod.SelectRangeGesture selectRangeGestureM = axd$.ExternalSyntheticApiModelOutline0.m(previewableHandwritingGesture);
                if (blwVar != null) {
                    blwVar.r(defpackage.axd.G(begVar, defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m(selectRangeGestureM)), defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m$1(selectRangeGestureM)), defpackage.axd.Q(axd$.ExternalSyntheticApiModelOutline0.m(selectRangeGestureM)), defpackage.dfx.b));
                } else {
                    blwVar = null;
                }
            } else if (axd$.ExternalSyntheticApiModelOutline0.m$4(previewableHandwritingGesture)) {
                android.view.inputmethod.DeleteRangeGesture deleteRangeGestureM = axd$.ExternalSyntheticApiModelOutline0.m(previewableHandwritingGesture);
                if (blwVar != null) {
                    blwVar.o(defpackage.axd.G(begVar, defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m(deleteRangeGestureM)), defpackage.ckn.e(axd$.ExternalSyntheticApiModelOutline0.m$1(deleteRangeGestureM)), defpackage.axd.Q(axd$.ExternalSyntheticApiModelOutline0.m(deleteRangeGestureM)), defpackage.dfx.b));
                } else {
                    blwVar = null;
                }
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: bij
                    @Override // android.os.CancellationSignal.OnCancelListener
                    public final void onCancel() {
                        defpackage.blw blwVar2 = blwVar;
                        if (blwVar2 != null) {
                            defpackage.beg begVar2 = blwVar2.d;
                            if (begVar2 != null) {
                                begVar2.h(defpackage.dgc.a);
                            }
                            defpackage.beg begVar3 = blwVar2.d;
                            if (begVar3 != null) {
                                begVar3.l(defpackage.dgc.a);
                            }
                        }
                    }
                });
            }
            return true;
        }
        return false;
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
        defpackage.bio bioVar;
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
            bioVar = ((defpackage.bis) this.j.a).l;
            synchronized (bioVar.a) {
                bioVar.d = z2;
                bioVar.e = z3;
                bioVar.f = z4;
                bioVar.g = z;
                if (i2 != 0) {
                    bioVar.c = true;
                    if (bioVar.h != null) {
                        bioVar.a();
                    }
                }
                bioVar.b = z5;
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        bioVar = ((defpackage.bis) this.j.a).l;
        synchronized (bioVar.a) {
            bioVar.d = z2;
            bioVar.e = z3;
            bioVar.f = z4;
            bioVar.g = z;
            if (i2 != 0) {
                bioVar.c = true;
                if (bioVar.h != null) {
                    bioVar.a();
                }
            }
            bioVar.b = z5;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        if (!this.d) {
            return false;
        }
        ((android.view.inputmethod.BaseInputConnection) ((defpackage.bis) this.j.a).j.a()).sendKeyEvent(keyEvent);
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
