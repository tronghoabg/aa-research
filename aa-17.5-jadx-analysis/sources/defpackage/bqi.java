package defpackage;

import android.net.LinkProperties;
import android.net.Network;
import android.support.v4.app.Fragment;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class bqi extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(adu aduVar, fwu fwuVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = aduVar;
        this.d = fwuVar;
        this.b = bwqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (defpackage.affz.o(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.nbb r8, defpackage.naw r9, android.support.v4.app.Fragment r10, defpackage.afck r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.naz
            if (r0 == 0) goto L13
            r0 = r11
            naz r0 = (defpackage.naz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            naz r0 = new naz
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r8 = r0.a
            naw r9 = r0.e
            nbb r10 = r0.d
            defpackage.woy.dF(r11)
            goto Lae
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            java.lang.Object r8 = r0.a
            naw r9 = r0.e
            nbb r10 = r0.d
            defpackage.woy.dF(r11)
            goto L96
        L47:
            java.lang.Object r10 = r0.a
            naw r9 = r0.e
            nbb r8 = r0.d
            defpackage.woy.dF(r11)
            goto L68
        L51:
            defpackage.woy.dF(r11)
            yph r11 = defpackage.nbb.a
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r11 = r8.e()
            r0.d = r8
            r0.e = r9
            r0.a = r10
            r0.c = r6
            java.lang.Object r11 = defpackage.thg.g(r11, r0)
            if (r11 == r1) goto Lb9
        L68:
            yph r11 = defpackage.nbb.a
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r11 = r8.e()
            int r11 = r11.b
            if (r11 != 0) goto L9c
            yph r11 = defpackage.nbb.a
            yop r11 = r11.l()
            java.lang.String r2 = "Auto swipe to show media suggestion card"
            r11.u(r2)
            aivt r11 = defpackage.aivt.a
            nba r2 = new nba
            r6 = 0
            r2.<init>(r8, r3, r6)
            r0.d = r8
            r0.e = r9
            r0.a = r10
            r0.c = r5
            java.lang.Object r11 = defpackage.ahnc.a(r11, r2, r0)
            if (r11 == r1) goto Lb9
            r7 = r10
            r10 = r8
            r8 = r7
        L96:
            yzy r11 = defpackage.yzy.Hm
            defpackage.mwc.a(r11, r3)
            goto L9f
        L9c:
            r7 = r10
            r10 = r8
            r8 = r7
        L9f:
            r0.d = r10
            r0.e = r9
            r0.a = r8
            r0.c = r4
            java.lang.Object r11 = defpackage.affz.o(r0)
            if (r11 != r1) goto Lae
            goto Lb9
        Lae:
            r9.getClass()
            android.support.v4.app.Fragment r8 = (android.support.v4.app.Fragment) r8
            r10.f(r9, r8)
            afak r8 = defpackage.afak.a
            return r8
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqi.c(nbb, naw, android.support.v4.app.Fragment, afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [fml, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [iev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [fjh, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.e) {
            case 0:
                Object obj2 = this.b;
                return new bqi((bqj) obj2, (akq) this.c, (afeg) this.d, afckVar, 0);
            case 1:
                return new bqi((cqz) this.d, (asf) this.c, (bqj) this.b, afckVar, 1);
            case 2:
                Object obj3 = this.c;
                return new bqi((egd) obj3, (fdf) this.d, (egz) this.b, afckVar, 2);
            case 3:
                Object obj4 = this.c;
                return new bqi((egd) obj4, (wci) this.b, (fdf) this.d, afckVar, 3);
            case 4:
                return new bqi((afco) this.b, (aiyk) this.d, (bxd) this.c, afckVar, 4);
            case 5:
                Object obj5 = this.d;
                return new bqi((flz) obj5, (fjn) this.b, (fjh) this.c, afckVar, 5);
            case 6:
                Object obj6 = this.b;
                return new bqi((gjv) obj6, (fod) this.d, (fml) this.c, afckVar, 6);
            case 7:
                Object obj7 = this.c;
                return new bqi((adu) obj7, (fwu) this.d, (bwq) this.b, afckVar, 7);
            case 8:
                return new bqi((aiyk) this.d, (adu) this.c, (bwq) this.b, afckVar, 8);
            case 9:
                return new bqi((afec) this.d, (ieb) this.c, this.b, afckVar, 9);
            case 10:
                return new bqi((aizk) this.d, (bym) this.b, (bwq) this.c, afckVar, 10);
            case 11:
                Object obj8 = this.c;
                return new bqi((kjq) obj8, (klq) this.b, this.d, afckVar, 11);
            case 12:
                Object obj9 = this.d;
                return new bqi((nbb) obj9, (naw) this.b, (Fragment) this.c, afckVar, 12);
            case 13:
                Object obj10 = this.d;
                return new bqi((nbb) obj10, (naw) this.b, (Fragment) this.c, afckVar, 13, null);
            case 14:
                Object obj11 = this.d;
                return new bqi((Duration) obj11, (ofq) this.b, (iev) this.c, afckVar, 14);
            case 15:
                return new bqi((axr) this.c, (bym) this.b, (bym) this.d, afckVar, 15);
            case 16:
                Object obj12 = this.d;
                return new bqi((pce) obj12, (Network) this.b, (LinkProperties) this.c, afckVar, 16);
            case 17:
                Object obj13 = this.d;
                return new bqi((tlp) obj13, (tlm) this.c, (tlo) this.b, afckVar, 17);
            default:
                return new bqi((ajaq) this.d, (aiyl) this.b, this.c, afckVar, 18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b7, code lost:
    
        if (r9.hR(r3, r15) == r0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03c9, code lost:
    
        if (defpackage.ahnc.a(r3, r7, r15) == r0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03cb, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Type inference failed for: r0v32, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [fjh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v119, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v62, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v68, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [cqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v94, types: [iev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v96, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v98, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [fml, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [aiyk, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqi.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 8:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 9:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 10:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 11:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 12:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 13:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 14:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 15:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 16:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 17:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((bqi) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(afco afcoVar, aiyk aiykVar, bxd bxdVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = afcoVar;
        this.d = aiykVar;
        this.c = bxdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(afec afecVar, ieb iebVar, Object obj, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = afecVar;
        this.c = iebVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(aiyk aiykVar, adu aduVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = aiykVar;
        this.c = aduVar;
        this.b = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(aizk aizkVar, bym bymVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = aizkVar;
        this.b = bymVar;
        this.c = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(ajaq ajaqVar, aiyl aiylVar, Object obj, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = ajaqVar;
        this.b = aiylVar;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(axr axrVar, bym bymVar, bym bymVar2, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = axrVar;
        this.b = bymVar;
        this.d = bymVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(bqj bqjVar, akq akqVar, afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = bqjVar;
        this.c = akqVar;
        this.d = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(cqz cqzVar, asf asfVar, bqj bqjVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = cqzVar;
        this.c = asfVar;
        this.b = bqjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(egd egdVar, fdf fdfVar, egz egzVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = egdVar;
        this.d = fdfVar;
        this.b = egzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(egd egdVar, wci wciVar, fdf fdfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = egdVar;
        this.b = wciVar;
        this.d = fdfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(flz flzVar, fjn fjnVar, fjh fjhVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = flzVar;
        this.b = fjnVar;
        this.c = fjhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(gjv gjvVar, fod fodVar, fml fmlVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = gjvVar;
        this.d = fodVar;
        this.c = fmlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(Duration duration, ofq ofqVar, iev ievVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = duration;
        this.b = ofqVar;
        this.c = ievVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(kjq kjqVar, klq klqVar, Object obj, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = kjqVar;
        this.b = klqVar;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(nbb nbbVar, naw nawVar, Fragment fragment, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = nbbVar;
        this.b = nawVar;
        this.c = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(nbb nbbVar, naw nawVar, Fragment fragment, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.e = i;
        this.d = nbbVar;
        this.b = nawVar;
        this.c = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(pce pceVar, Network network, LinkProperties linkProperties, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = pceVar;
        this.b = network;
        this.c = linkProperties;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqi(tlp tlpVar, tlm tlmVar, tlo tloVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = tlpVar;
        this.c = tlmVar;
        this.b = tloVar;
    }
}
