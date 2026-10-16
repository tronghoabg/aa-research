package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final class biq implements InputConnection {
    public djv a;
    public int b;
    public boolean c;
    private final bed e;
    private final blr f;
    private final dcc g;
    private int h;
    private final izj j;
    private final List i = new ArrayList();
    public boolean d = true;

    public biq(djv djvVar, izj izjVar, bed bedVar, blr blrVar, dcc dccVar) {
        this.j = izjVar;
        this.e = bedVar;
        this.f = blrVar;
        this.g = dccVar;
        this.a = djvVar;
    }

    private final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    private final void d() {
        this.h++;
    }

    public final void a(diz dizVar) {
        d();
        try {
            this.i.add(dizVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            List list = this.i;
            if (!list.isEmpty()) {
                ((bip) this.j.a).b.invoke(woy.ch(list));
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
        List list = ((bip) this.j.a).i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (affa.f(((WeakReference) list.get(i)).get(), this)) {
                list.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return this.d;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new diu(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new dix(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new diy(i, i2));
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
        a(new djb());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.a.a(), dfv.d(this.a.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        int i2 = i & 1;
        this.c = 1 == i2;
        if (i2 != 0) {
            this.b = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return aclh.w(this.a);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (dfv.i(this.a.b)) {
            return null;
        }
        return dap.m(this.a).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return dap.n(this.a, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return dap.o(this.a, i).b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        if (this.d) {
            switch (i) {
                case R.id.selectAll:
                    a(new dju(0, this.a.a().length()));
                    break;
                case R.id.cut:
                    c(277);
                    break;
                case R.id.copy:
                    c(278);
                    break;
                case R.id.paste:
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
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    Log.w("RecordingIC", a.bp(i, "IME sends unsupported Editor Action: "));
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        ((bip) this.j.a).c.invoke(new djd(i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        deu deuVar;
        char c;
        long jG;
        char c2;
        int i;
        int iL;
        bff bffVarD;
        int iL2;
        bff bffVarD2;
        if (Build.VERSION.SDK_INT >= 34) {
            bed bedVar = this.e;
            blr blrVar = this.f;
            dcc dccVar = this.g;
            bgb bgbVar = new bgb(this, 17);
            final int iS = 3;
            if (bedVar != null && (deuVar = bedVar.f) != null) {
                bff bffVarD3 = bedVar.d();
                if (affa.f(deuVar, bffVarD3 != null ? bffVarD3.a.a.a : null)) {
                    if (awx$$ExternalSyntheticApiModelOutline0.m193m((Object) handwritingGesture)) {
                        SelectGesture selectGestureM188m = awx$$ExternalSyntheticApiModelOutline0.m188m((Object) handwritingGesture);
                        long jM = awx.M(bedVar, ckf.g(selectGestureM188m.getSelectionArea()), awx.W(selectGestureM188m.getGranularity()), dfq.b);
                        if (dfv.i(jM)) {
                            iS = awx.S(selectGestureM188m, bgbVar);
                        } else {
                            awx.V(jM, blrVar, bgbVar);
                            iS = 1;
                        }
                    } else if (awx$$ExternalSyntheticApiModelOutline0.m$4(handwritingGesture)) {
                        DeleteGesture deleteGestureM183m = awx$$ExternalSyntheticApiModelOutline0.m183m((Object) handwritingGesture);
                        int iW = awx.W(deleteGestureM183m.getGranularity());
                        long jM2 = awx.M(bedVar, ckf.g(deleteGestureM183m.getDeletionArea()), iW, dfq.b);
                        if (dfv.i(jM2)) {
                            iS = awx.S(deleteGestureM183m, bgbVar);
                        } else {
                            awx.T(jM2, deuVar, a.Y(iW, 1), bgbVar);
                            iS = 1;
                        }
                    } else if (awx$$ExternalSyntheticApiModelOutline0.m$5(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM189m = awx$$ExternalSyntheticApiModelOutline0.m189m((Object) handwritingGesture);
                        long jN = awx.N(bedVar, ckf.g(selectRangeGestureM189m.getSelectionStartArea()), ckf.g(selectRangeGestureM189m.getSelectionEndArea()), awx.W(selectRangeGestureM189m.getGranularity()), dfq.b);
                        if (dfv.i(jN)) {
                            iS = awx.S(selectRangeGestureM189m, bgbVar);
                        } else {
                            awx.V(jN, blrVar, bgbVar);
                            iS = 1;
                        }
                    } else if (awx$$ExternalSyntheticApiModelOutline0.m$3(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM184m = awx$$ExternalSyntheticApiModelOutline0.m184m((Object) handwritingGesture);
                        int iW2 = awx.W(deleteRangeGestureM184m.getGranularity());
                        long jN2 = awx.N(bedVar, ckf.g(deleteRangeGestureM184m.getDeletionStartArea()), ckf.g(deleteRangeGestureM184m.getDeletionEndArea()), iW2, dfq.b);
                        if (dfv.i(jN2)) {
                            iS = awx.S(deleteRangeGestureM184m, bgbVar);
                        } else {
                            awx.T(jN2, deuVar, a.Y(iW2, 1), bgbVar);
                            iS = 1;
                        }
                    } else {
                        int iIntValue = 0;
                        if (awx$$ExternalSyntheticApiModelOutline0.m$6(handwritingGesture)) {
                            JoinOrSplitGesture joinOrSplitGestureM186m = awx$$ExternalSyntheticApiModelOutline0.m186m((Object) handwritingGesture);
                            if (dccVar == null || (iL2 = awx.L(bedVar, awx.O(joinOrSplitGestureM186m.getJoinOrSplitPoint()), dccVar)) == -1 || ((bffVarD2 = bedVar.d()) != null && awx.P(bffVarD2.a, iL2))) {
                                iS = awx.S(joinOrSplitGestureM186m, bgbVar);
                            } else {
                                int iCharCount = iL2;
                                while (iCharCount > 0) {
                                    int iCodePointBefore = Character.codePointBefore(deuVar, iCharCount);
                                    if (!awx.Q(iCodePointBefore)) {
                                        break;
                                    } else {
                                        iCharCount -= Character.charCount(iCodePointBefore);
                                    }
                                }
                                while (iL2 < deuVar.a()) {
                                    int iCodePointAt = Character.codePointAt(deuVar, iL2);
                                    if (!awx.Q(iCodePointAt)) {
                                        break;
                                    } else {
                                        iL2 += Character.charCount(iCodePointAt);
                                    }
                                }
                                long jT = czz.t(iCharCount, iL2);
                                if (dfv.i(jT)) {
                                    awx.U(dfv.e(jT), " ", bgbVar);
                                } else {
                                    awx.T(jT, deuVar, false, bgbVar);
                                }
                                iS = 1;
                            }
                        } else if (awx$$ExternalSyntheticApiModelOutline0.m$1(handwritingGesture)) {
                            InsertGesture insertGestureM185m = awx$$ExternalSyntheticApiModelOutline0.m185m((Object) handwritingGesture);
                            if (dccVar == null || (iL = awx.L(bedVar, awx.O(insertGestureM185m.getInsertionPoint()), dccVar)) == -1 || ((bffVarD = bedVar.d()) != null && awx.P(bffVarD.a, iL))) {
                                iS = awx.S(insertGestureM185m, bgbVar);
                            } else {
                                awx.U(iL, insertGestureM185m.getTextToInsert(), bgbVar);
                                iS = 1;
                            }
                        } else if (awx$$ExternalSyntheticApiModelOutline0.m$2(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureM187m = awx$$ExternalSyntheticApiModelOutline0.m187m((Object) handwritingGesture);
                            bff bffVarD4 = bedVar.d();
                            dft dftVar = bffVarD4 != null ? bffVarD4.a : null;
                            long jO = awx.O(removeSpaceGestureM187m.getStartPoint());
                            long jO2 = awx.O(removeSpaceGestureM187m.getEndPoint());
                            cst cstVarE = bedVar.e();
                            if (dftVar == null || cstVarE == null) {
                                c = ' ';
                                jG = dfv.a;
                            } else {
                                long jM3 = cstVarE.m(jO);
                                long jM4 = cstVarE.m(jO2);
                                dfb dfbVar = dftVar.b;
                                c = ' ';
                                int iK = awx.K(dfbVar, jM3, dccVar);
                                int iK2 = awx.K(dfbVar, jM4, dccVar);
                                if (iK == -1) {
                                    if (iK2 == -1) {
                                        jG = dfv.a;
                                    } else {
                                        iK = iK2;
                                    }
                                } else if (iK2 != -1) {
                                    iK = Math.min(iK, iK2);
                                }
                                int i2 = (int) (jM4 >> 32);
                                int i3 = (int) (jM3 >> 32);
                                float fD = (dftVar.d(iK) + dftVar.a(iK)) / 2.0f;
                                jG = dfbVar.g(new cjb(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2)), (-0.1f) + fD, Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2)), fD + 0.1f), 0, dfq.a);
                            }
                            if (dfv.i(jG)) {
                                iS = awx.S(removeSpaceGestureM187m, bgbVar);
                            } else {
                                afft afftVar = new afft();
                                afftVar.a = -1;
                                afft afftVar2 = new afft();
                                afftVar2.a = -1;
                                int i4 = (int) (jG >> c);
                                int i5 = (int) (4294967295L & jG);
                                String string = deuVar.subSequence(Math.min(i4, i5), Math.max(i4, i5)).b;
                                aisp aispVar = new aisp("\\s+");
                                bee beeVar = new bee(afftVar, afftVar2, 6, null);
                                string.getClass();
                                aisj aisjVarG = aispVar.g(string);
                                if (aisjVarG == null) {
                                    c2 = 0;
                                } else {
                                    int length = string.length();
                                    StringBuilder sb = new StringBuilder(length);
                                    c2 = 0;
                                    do {
                                        sb.append((CharSequence) string, iIntValue, aisjVarG.b().f().intValue());
                                        sb.append((CharSequence) beeVar.invoke(aisjVarG));
                                        iIntValue = aisjVarG.b().e().intValue() + 1;
                                        aisjVarG = aisjVarG.c();
                                        if (iIntValue >= length) {
                                            break;
                                        }
                                    } while (aisjVarG != null);
                                    if (iIntValue < length) {
                                        sb.append((CharSequence) string, iIntValue, length);
                                    }
                                    string = sb.toString();
                                }
                                int i6 = afftVar.a;
                                if (i6 == -1 || (i = afftVar2.a) == -1) {
                                    iS = awx.S(removeSpaceGestureM187m, bgbVar);
                                } else {
                                    int iE = dfv.e(jG) + i6;
                                    int iE2 = dfv.e(jG);
                                    String strSubstring = string.substring(i6, string.length() - (dfv.b(jG) - afftVar2.a));
                                    strSubstring.getClass();
                                    diz[] dizVarArr = new diz[2];
                                    dizVarArr[c2] = new dju(iE, iE2 + i);
                                    dizVarArr[1] = new diu(strSubstring, 1);
                                    bgbVar.invoke(new big(dizVarArr));
                                    iS = 1;
                                }
                            }
                        } else {
                            iS = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: bib
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(iS);
                    }
                });
            } else {
                intConsumer.accept(iS);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture r6, android.os.CancellationSignal r7) {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 < r1) goto Ldf
            bed r0 = r5.e
            blr r5 = r5.f
            if (r0 == 0) goto Ldf
            deu r1 = r0.f
            if (r1 != 0) goto L12
            return r2
        L12:
            bff r3 = r0.d()
            r4 = 0
            if (r3 == 0) goto L20
            dft r3 = r3.a
            dfs r3 = r3.a
            deu r3 = r3.a
            goto L21
        L20:
            r3 = r4
        L21:
            boolean r1 = defpackage.affa.f(r1, r3)
            if (r1 != 0) goto L28
            return r2
        L28:
            boolean r1 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m193m(r6)
            if (r1 == 0) goto L52
            android.view.inputmethod.SelectGesture r6 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m188m(r6)
            if (r5 == 0) goto L4f
            android.graphics.RectF r1 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m180m(r6)
            cjb r1 = defpackage.ckf.g(r1)
            int r6 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m(r6)
            int r6 = defpackage.awx.W(r6)
            dfr r2 = defpackage.dfq.b
            long r0 = defpackage.awx.M(r0, r1, r6, r2)
            r5.r(r0)
            goto Ld3
        L4f:
            r5 = r4
            goto Ld3
        L52:
            boolean r1 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m$4(r6)
            if (r1 == 0) goto L78
            android.view.inputmethod.DeleteGesture r6 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m183m(r6)
            if (r5 == 0) goto L4f
            android.graphics.RectF r1 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m178m(r6)
            cjb r1 = defpackage.ckf.g(r1)
            int r6 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m(r6)
            int r6 = defpackage.awx.W(r6)
            dfr r2 = defpackage.dfq.b
            long r0 = defpackage.awx.M(r0, r1, r6, r2)
            r5.o(r0)
            goto Ld3
        L78:
            boolean r1 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m$5(r6)
            if (r1 == 0) goto La6
            android.view.inputmethod.SelectRangeGesture r6 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m189m(r6)
            if (r5 == 0) goto L4f
            android.graphics.RectF r1 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m181m(r6)
            cjb r1 = defpackage.ckf.g(r1)
            android.graphics.RectF r2 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m$1(r6)
            cjb r2 = defpackage.ckf.g(r2)
            int r6 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m(r6)
            int r6 = defpackage.awx.W(r6)
            dfr r3 = defpackage.dfq.b
            long r0 = defpackage.awx.N(r0, r1, r2, r6, r3)
            r5.r(r0)
            goto Ld3
        La6:
            boolean r1 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m$3(r6)
            if (r1 == 0) goto Ldf
            android.view.inputmethod.DeleteRangeGesture r6 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m184m(r6)
            if (r5 == 0) goto L4f
            android.graphics.RectF r1 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m179m(r6)
            cjb r1 = defpackage.ckf.g(r1)
            android.graphics.RectF r2 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m$1(r6)
            cjb r2 = defpackage.ckf.g(r2)
            int r6 = defpackage.awx$$ExternalSyntheticApiModelOutline0.m(r6)
            int r6 = defpackage.awx.W(r6)
            dfr r3 = defpackage.dfq.b
            long r0 = defpackage.awx.N(r0, r1, r2, r6, r3)
            r5.o(r0)
        Ld3:
            r6 = 1
            if (r7 == 0) goto Lde
            bif r0 = new bif
            r0.<init>()
            r7.setOnCancelListener(r0)
        Lde:
            return r6
        Ldf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biq.previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture, android.os.CancellationSignal):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.d
            r1 = 0
            if (r0 == 0) goto L73
            r0 = r10 & 1
            r2 = r10 & 2
            r3 = 1
            if (r2 == 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r1
        Lf:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4b
            r4 = r10 & 16
            if (r4 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r1
        L1c:
            r5 = r10 & 8
            if (r5 == 0) goto L22
            r5 = r3
            goto L23
        L22:
            r5 = r1
        L23:
            r6 = r10 & 4
            if (r6 == 0) goto L29
            r6 = r3
            goto L2a
        L29:
            r6 = r1
        L2a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 34
            if (r7 < r8) goto L35
            r10 = r10 & 32
            if (r10 == 0) goto L35
            r1 = r3
        L35:
            if (r4 != 0) goto L48
            if (r5 != 0) goto L48
            if (r6 != 0) goto L48
            if (r1 != 0) goto L48
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r8) goto L44
            r10 = r3
            r1 = r10
            goto L46
        L44:
            r10 = r1
            r1 = r3
        L46:
            r4 = r1
            goto L4d
        L48:
            r10 = r1
            r1 = r6
            goto L4e
        L4b:
            r10 = r1
            r4 = r3
        L4d:
            r5 = r4
        L4e:
            izj r9 = r9.j
            java.lang.Object r9 = r9.a
            bip r9 = (defpackage.bip) r9
            bil r9 = r9.l
            java.lang.Object r6 = r9.a
            monitor-enter(r6)
            r9.d = r4     // Catch: java.lang.Throwable -> L70
            r9.e = r5     // Catch: java.lang.Throwable -> L70
            r9.f = r1     // Catch: java.lang.Throwable -> L70
            r9.g = r10     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6c
            r9.c = r3     // Catch: java.lang.Throwable -> L70
            djv r10 = r9.h     // Catch: java.lang.Throwable -> L70
            if (r10 == 0) goto L6c
            r9.a()     // Catch: java.lang.Throwable -> L70
        L6c:
            r9.b = r2     // Catch: java.lang.Throwable -> L70
            monitor-exit(r6)
            return r3
        L70:
            r9 = move-exception
            monitor-exit(r6)
            throw r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biq.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (!this.d) {
            return false;
        }
        ((BaseInputConnection) ((bip) this.j.a).j.a()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.d;
        if (z) {
            a(new djs(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new djt(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new dju(i, i2));
        return true;
    }
}
