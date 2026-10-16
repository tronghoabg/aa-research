package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.lang.Iterable$EL;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class uqs implements uqq {
    public final /* synthetic */ uqt a;
    private final yfq b;
    private final uru c;

    public uqs(uqt uqtVar, abbd abbdVar, urv urvVar) throws IOException {
        toq toqVarG;
        toq toqVarG2;
        tyu twaVar;
        uim uimVar;
        uim uimVar2;
        this.a = uqtVar;
        uru uruVarB = urvVar == null ? null : urvVar.b();
        this.c = uruVarB;
        abct abctVar = abbdVar.g;
        abctVar = abctVar == null ? abct.a : abctVar;
        abfi abfiVar = uqtVar.e.a;
        tnr tnrVar = uqtVar.b;
        tqt tqtVarA = uruVarB != null ? uruVarB.a() : null;
        trt trtVar = uqtVar.c;
        txe txeVarM = tnrVar.m();
        aboh<abcs> abohVar = abctVar.b;
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        for (abcs abcsVar : abohVar) {
            tsm tsmVar = tsm.b;
            tqt tqtVar = tqtVarA == null ? txeVarM.b.g : tqtVarA;
            if (abfiVar == abfi.WORLD_ENCODING_UNKNOWN) {
                throw new IllegalArgumentException("Attempting to create a client-inject label with an unknown vertex encoding");
            }
            if ((abcsVar.b & 8) != 0) {
                txeVarM.e(tsmVar);
                if ((abcsVar.b & 16) != 0) {
                    throw new UnsupportedOperationException("Cannot create point label from line label proto");
                }
                tyh tyhVar = (tyh) tqtVar;
                if (txe.h(abcsVar, txeVarM.o, tyhVar.e)) {
                    tof tofVar = (tof) txeVarM.d.get(abfiVar);
                    tofVar.getClass();
                    try {
                        abag abagVar = abcsVar.e;
                        uimVar2 = uim.a(abagVar == null ? abag.a : abagVar, tofVar);
                    } catch (IOException unused) {
                        uimVar2 = new uim(new too(), 2, BitmapDescriptorFactory.HUE_RED);
                    }
                    txe txeVar = txeVarM;
                    twi twiVar = new twi(trtVar, uimVar2, txeVarM.c, txeVarM.f, txeVarM.l, abcsVar, tyhVar.e, txeVar);
                    abcsVar = abcsVar;
                    txeVarM = txeVar;
                    txeVarM.k.e(abcsVar, twiVar);
                    twaVar = twiVar;
                } else {
                    tof tofVar2 = (tof) txeVarM.d.get(abfiVar);
                    tofVar2.getClass();
                    try {
                        abag abagVar2 = abcsVar.e;
                        uimVar = uim.a(abagVar2 == null ? abag.a : abagVar2, tofVar2);
                    } catch (IOException unused2) {
                        uimVar = new uim(new too(), 2, BitmapDescriptorFactory.HUE_RED);
                    }
                    txe txeVar2 = txeVarM;
                    tyu twiVar2 = new twi(trtVar, uimVar, txeVarM.c, txeVarM.f, txeVarM.l, abcsVar, tyhVar.e, txeVar2, null);
                    abcsVar = abcsVar;
                    txeVarM = txeVar2;
                    txeVar2.o.t(new rdz(txeVar2, twiVar2, abcsVar, 10, (char[]) null));
                    twaVar = twiVar2;
                }
            } else {
                txeVarM.e(tsmVar);
                if ((abcsVar.b & 8) != 0) {
                    throw new UnsupportedOperationException("Cannot create line label from point label proto");
                }
                tyh tyhVar2 = (tyh) tqtVar;
                if (txe.h(abcsVar, txeVarM.o, tyhVar2.e)) {
                    tof tofVar3 = (tof) txeVarM.d.get(abfiVar);
                    tofVar3.getClass();
                    try {
                        abdy abdyVar = abcsVar.f;
                        abms abmsVar = (abdyVar == null ? abdy.a : abdyVar).b;
                        abdy abdyVar2 = abcsVar.f;
                        toqVarG2 = tofVar3.g(abmsVar, (abdyVar2 == null ? abdy.a : abdyVar2).c);
                    } catch (IOException unused3) {
                        toqVarG2 = toq.c;
                    }
                    twaVar = new twa(trtVar, toqVarG2, txeVarM.c, txeVarM.f, abcsVar, tyhVar2.e, txeVarM);
                } else {
                    tof tofVar4 = (tof) txeVarM.d.get(abfiVar);
                    tofVar4.getClass();
                    try {
                        abdy abdyVar3 = abcsVar.f;
                        abms abmsVar2 = (abdyVar3 == null ? abdy.a : abdyVar3).b;
                        abdy abdyVar4 = abcsVar.f;
                        toqVarG = tofVar4.g(abmsVar2, (abdyVar4 == null ? abdy.a : abdyVar4).c);
                    } catch (IOException unused4) {
                        toqVarG = toq.c;
                    }
                    tyu twaVar2 = new twa(trtVar, toqVarG, txeVarM.c, txeVarM.f, abcsVar, tyhVar2.e, txeVarM, null);
                    txeVarM.o.t(new tvv(twaVar2, 11));
                    twaVar = twaVar2;
                }
            }
            abnh abnhVar = abhx.a;
            abcsVar.j(abnhVar);
            Object objJ = abcsVar.w.j(abnhVar.d);
            if (!((abii) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).q) {
                abdl abdlVar = abcsVar.u;
                abdlVar = abdlVar == null ? abdl.a : abdlVar;
                abnh abnhVar2 = abdn.P;
                abdlVar.j(abnhVar2);
                Object objJ2 = abdlVar.w.j(abnhVar2.d);
                if (!((abii) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2))).q) {
                    twaVar.h();
                }
            }
            yflVar.i(twaVar);
        }
        this.b = yflVar.g();
    }

    @Override // defpackage.uqq
    public final void a() {
        Iterable$EL.forEach(this.b, new qio(this, 13));
    }

    @Override // defpackage.uqq
    public final void b() {
        Iterable$EL.forEach(this.b, new qio(this, 14));
        uru uruVar = this.c;
        if (uruVar != null) {
            uruVar.close();
        }
    }

    @Override // defpackage.uqq
    public final void c() {
        Iterable$EL.forEach(this.b, new qio(this, 12));
    }

    @Override // defpackage.uqq
    public final twi d() {
        uqt uqtVar = this.a;
        if (!uqtVar.f.a.isEmpty() || !uqtVar.f.b.isEmpty()) {
            ((ynz) uqt.a.a(uys.a).ai((char) 9605)).u("Invalid assumption that CVO is a single label: had geometry.");
            return null;
        }
        yfq yfqVar = this.b;
        if (yfqVar.isEmpty()) {
            ((ynz) uqt.a.a(uys.a).ai((char) 9608)).u("Invalid assumption that CVO is a single label: had no label.");
            return null;
        }
        if (((yls) yfqVar).c != 1) {
            ((ynz) uqt.a.a(uys.a).ai((char) 9607)).u("Invalid assumption that CVO is a single label: had multiple.");
            return null;
        }
        tpv tpvVar = (tpv) yfqVar.get(0);
        if (tpvVar instanceof twi) {
            return (twi) tpvVar;
        }
        ((ynz) uqt.a.a(uys.a).ai((char) 9606)).u("Invalid assumption that CVO is a single label: not point label.");
        return null;
    }
}
