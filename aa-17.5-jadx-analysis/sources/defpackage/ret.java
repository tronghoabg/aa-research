package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ret implements rfb {
    private final int a;
    private abpt b;
    private final rfb c;
    private final List d = new ArrayList();

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rfb] */
    public ret(vtn vtnVar) {
        this.a = vtnVar.a;
        ?? r2 = vtnVar.b;
        r2.getClass();
        this.c = r2;
    }

    @Override // defpackage.rfb
    public final synchronized void a(ots otsVar) {
        adzp adzpVar;
        wer.c();
        otw otwVar = otsVar.c;
        if (otwVar == null) {
            otwVar = otw.a;
        }
        List list = this.d;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                adzpVar = new adzp(this.a);
                list.add(adzpVar);
                break;
            }
            adzpVar = (adzp) it.next();
            otw otwVar2 = ((ots) adzpVar.c).c;
            if (otwVar2 == null) {
                otwVar2 = otw.a;
            }
            if (otwVar2.equals(otwVar)) {
                break;
            }
        }
        int i = this.a;
        Object obj = adzpVar.a;
        int size = ((yec) obj).size() + otsVar.g.size();
        ((yec) obj).addAll(otsVar.g);
        int i2 = size - i;
        if (i2 > 0) {
            adzpVar.b += i2;
        }
        adzpVar.b += otsVar.h;
        adzpVar.c = otsVar;
        otr otrVarB = otr.b(otsVar.e);
        if (otrVarB == null) {
            otrVarB = otr.AUDIO_STREAMING_STATUS_UNSPECIFIED;
        }
        if (otrVarB != otr.STREAMING) {
            ots otsVarC = adzpVar.c();
            if ((otsVarC.b & 8) != 0) {
                ott ottVar = otsVarC.f;
                if (ottVar == null) {
                    ottVar = ott.a;
                }
                abpt abptVar = ottVar.c;
                if (abptVar == null) {
                    abptVar = abpt.a;
                }
                rrd.d(3, "CAR.AudioDiagAggr", null, "voice session started at: %s, audio session start time: %s", abqu.f(this.b), abqu.f(abptVar));
                if (abzi.s(abptVar, this.b) > 0) {
                    this.c.a(otsVarC);
                } else {
                    rrd.d(4, "CAR.AudioDiagAggr", null, "voice session started at: %s, ignore audio stream session: %s", abqu.f(this.b), uqw.ab(otsVarC));
                }
            } else {
                this.c.a(otsVarC);
            }
            list.remove(adzpVar);
        }
    }

    public final synchronized void b() {
        wer.c();
        List list = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.a(((adzp) it.next()).c());
        }
        list.clear();
    }

    public final synchronized void c() {
        this.b = abqu.d();
    }
}
