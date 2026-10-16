package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class alq extends defpackage.cwo implements defpackage.cwu {
    private final defpackage.aiz a;
    private final defpackage.ajv b;
    private android.graphics.RenderNode c;

    public alq(defpackage.cwn cwnVar, defpackage.aiz aizVar, defpackage.ajv ajvVar) {
        this.a = aizVar;
        this.b = ajvVar;
        W(cwnVar);
    }

    private final android.graphics.RenderNode d() {
        android.graphics.RenderNode renderNode = this.c;
        if (renderNode != null) {
            return renderNode;
        }
        android.graphics.RenderNode renderNode2 = new android.graphics.RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.c = renderNode2;
        return renderNode2;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01c1 A[PHI: r18
  0x01c1: PHI (r18v2 boolean) = (r18v1 boolean), (r18v11 boolean) binds: [B:77:0x018e, B:85:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        float f;
        long j;
        boolean zDraw;
        char c;
        defpackage.aiz aizVar = this.a;
        aizVar.i(cxnVar.o());
        defpackage.ckc ckcVarB = cxnVar.r().b();
        android.graphics.Canvas canvas = defpackage.cjn.a;
        ckcVarB.getClass();
        android.graphics.Canvas canvas2 = ((defpackage.cjm) ckcVarB).a;
        aizVar.c.a();
        if (defpackage.cjl.d(cxnVar.o())) {
            cxnVar.q();
            return;
        }
        if (!canvas2.isHardwareAccelerated()) {
            defpackage.ajv ajvVar = this.b;
            android.widget.EdgeEffect edgeEffect = ajvVar.b;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            android.widget.EdgeEffect edgeEffect2 = ajvVar.c;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            android.widget.EdgeEffect edgeEffect3 = ajvVar.d;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            android.widget.EdgeEffect edgeEffect4 = ajvVar.e;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            android.widget.EdgeEffect edgeEffect5 = ajvVar.f;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            android.widget.EdgeEffect edgeEffect6 = ajvVar.g;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            android.widget.EdgeEffect edgeEffect7 = ajvVar.h;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            android.widget.EdgeEffect edgeEffect8 = ajvVar.i;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            cxnVar.q();
            return;
        }
        float fDN = cxnVar.dN(30.0f);
        defpackage.ajv ajvVar2 = this.b;
        boolean z = ajvVar2.r() || ajvVar2.s() || ajvVar2.i() || ajvVar2.j();
        boolean z2 = ajvVar2.l() || ajvVar2.m() || ajvVar2.o() || ajvVar2.p();
        if (z && z2) {
            alh$.ExternalSyntheticApiModelOutline0.m(d(), 0, 0, canvas2.getWidth(), canvas2.getHeight());
        } else if (z) {
            android.graphics.RenderNode renderNodeD = d();
            int width = canvas2.getWidth();
            int iK = defpackage.afhi.k(fDN);
            alh$.ExternalSyntheticApiModelOutline0.m(renderNodeD, 0, 0, width + iK + iK, canvas2.getHeight());
        } else {
            if (!z2) {
                cxnVar.q();
                return;
            }
            android.graphics.RenderNode renderNodeD2 = d();
            int width2 = canvas2.getWidth();
            int height = canvas2.getHeight();
            int iK2 = defpackage.afhi.k(fDN);
            alh$.ExternalSyntheticApiModelOutline0.m(renderNodeD2, 0, 0, width2, height + iK2 + iK2);
        }
        android.graphics.RecordingCanvas recordingCanvasM = alh$.ExternalSyntheticApiModelOutline0.m(d());
        if (ajvVar2.m()) {
            android.widget.EdgeEffect edgeEffectD = ajvVar2.d();
            int iSave = recordingCanvasM.save();
            recordingCanvasM.rotate(90.0f);
            edgeEffectD.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave);
            edgeEffectD.finish();
        }
        if (ajvVar2.l()) {
            android.widget.EdgeEffect edgeEffectC = ajvVar2.c();
            f = 1.0f;
            int iSave2 = recordingCanvasM.save();
            recordingCanvasM.rotate(270.0f);
            zDraw = edgeEffectC.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave2);
            if (ajvVar2.n()) {
                j = 4294967295L;
                defpackage.ca.bi(ajvVar2.d(), defpackage.ca.bg(edgeEffectC), 1.0f - java.lang.Float.intBitsToFloat((int) (aizVar.e() & 4294967295L)));
            } else {
                j = 4294967295L;
            }
        } else {
            f = 1.0f;
            j = 4294967295L;
            zDraw = false;
        }
        if (ajvVar2.s()) {
            android.widget.EdgeEffect edgeEffectH = ajvVar2.h();
            int iSave3 = recordingCanvasM.save();
            recordingCanvasM.rotate(180.0f);
            edgeEffectH.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave3);
            edgeEffectH.finish();
        }
        if (ajvVar2.r()) {
            android.widget.EdgeEffect edgeEffectG = ajvVar2.g();
            zDraw = edgeEffectG.draw(recordingCanvasM) || zDraw;
            if (ajvVar2.t()) {
                c = ' ';
                defpackage.ca.bi(ajvVar2.h(), defpackage.ca.bg(edgeEffectG), java.lang.Float.intBitsToFloat((int) (aizVar.e() >> 32)));
            } else {
                c = ' ';
            }
        } else {
            c = ' ';
        }
        if (ajvVar2.p()) {
            android.widget.EdgeEffect edgeEffectF = ajvVar2.f();
            int iSave4 = recordingCanvasM.save();
            recordingCanvasM.rotate(270.0f);
            edgeEffectF.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave4);
            edgeEffectF.finish();
        }
        if (ajvVar2.o()) {
            android.widget.EdgeEffect edgeEffectE = ajvVar2.e();
            int iSave5 = recordingCanvasM.save();
            recordingCanvasM.rotate(90.0f);
            boolean zDraw2 = edgeEffectE.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave5);
            zDraw = zDraw2 || zDraw;
            if (ajvVar2.q()) {
                defpackage.ca.bi(ajvVar2.f(), defpackage.ca.bg(edgeEffectE), java.lang.Float.intBitsToFloat((int) (aizVar.e() & j)));
            }
        }
        if (ajvVar2.j()) {
            android.widget.EdgeEffect edgeEffectB = ajvVar2.b();
            edgeEffectB.draw(recordingCanvasM);
            edgeEffectB.finish();
        }
        if (ajvVar2.i()) {
            android.widget.EdgeEffect edgeEffectA = ajvVar2.a();
            int iSave6 = recordingCanvasM.save();
            recordingCanvasM.rotate(180.0f);
            boolean zDraw3 = edgeEffectA.draw(recordingCanvasM);
            recordingCanvasM.restoreToCount(iSave6);
            boolean z3 = zDraw3 || zDraw;
            if (ajvVar2.k()) {
                defpackage.ca.bi(ajvVar2.b(), defpackage.ca.bg(edgeEffectA), f - java.lang.Float.intBitsToFloat((int) (aizVar.e() >> c)));
            }
            zDraw = z3;
        }
        if (zDraw) {
            aizVar.h();
        }
        float f2 = true != z2 ? fDN : 0.0f;
        if (true == z) {
            fDN = 0.0f;
        }
        defpackage.dlz dlzVarP = cxnVar.p();
        defpackage.cjm cjmVar = new defpackage.cjm();
        cjmVar.a = recordingCanvasM;
        long jO = cxnVar.o();
        defpackage.dlo dloVarC = cxnVar.r().c();
        defpackage.dlz dlzVarD = cxnVar.r().d();
        defpackage.ckc ckcVarB2 = cxnVar.r().b();
        long jA = cxnVar.r().a();
        defpackage.cmq cmqVar = cxnVar.r().a;
        defpackage.cmi cmiVarR = cxnVar.r();
        cmiVarR.f(cxnVar);
        cmiVarR.g(dlzVarP);
        cmiVarR.e(cjmVar);
        cmiVarR.h(jO);
        cmiVarR.a = null;
        cjmVar.g();
        try {
            cxnVar.r().c.l(f2, fDN);
            try {
                cxnVar.q();
                float f3 = -fDN;
                float f4 = -f2;
                cxnVar.r().c.l(f4, f3);
                cjmVar.e();
                defpackage.cmi cmiVarR2 = cxnVar.r();
                cmiVarR2.f(dloVarC);
                cmiVarR2.g(dlzVarD);
                cmiVarR2.e(ckcVarB2);
                cmiVarR2.h(jA);
                cmiVarR2.a = cmqVar;
                alh$.ExternalSyntheticApiModelOutline0.m(d());
                int iSave7 = canvas2.save();
                canvas2.translate(f4, f3);
                alh$.ExternalSyntheticApiModelOutline0.m(canvas2, d());
                canvas2.restoreToCount(iSave7);
            } catch (java.lang.Throwable th) {
                cxnVar.r().c.l(-f2, -fDN);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            cjmVar.e();
            defpackage.cmi cmiVarR3 = cxnVar.r();
            cmiVarR3.f(dloVarC);
            cmiVarR3.g(dlzVarD);
            cmiVarR3.e(ckcVarB2);
            cmiVarR3.h(jA);
            cmiVarR3.a = cmqVar;
            throw th2;
        }
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
