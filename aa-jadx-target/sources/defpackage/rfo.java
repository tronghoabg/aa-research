package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rfo implements defpackage.rfx {
    private final int a;
    private defpackage.abqv b;
    private final defpackage.rfx c;
    private final java.util.List d = new java.util.ArrayList();

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rfx] */
    public rfo(defpackage.vuj vujVar) {
        this.a = vujVar.a;
        ?? r2 = vujVar.b;
        r2.getClass();
        this.c = r2;
    }

    @Override // defpackage.rfx
    public final synchronized void a(defpackage.oup oupVar) {
        aeap aeapVar;
        defpackage.out outVar;
        defpackage.wfp.c();
        defpackage.out outVar2 = oupVar.c;
        if (outVar2 == null) {
            outVar2 = defpackage.out.a;
        }
        java.util.List list = this.d;
        java.util.Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                aeapVar = new aeap(this.a);
                list.add(aeapVar);
                break;
            } else {
                aeapVar = (aeap) it.next();
                outVar = ((defpackage.oup) aeapVar.c).c;
                if (outVar == null) {
                    outVar = defpackage.out.a;
                }
            }
        } while (!outVar.equals(outVar2));
        int i = this.a;
        java.lang.Object obj = aeapVar.a;
        int size = ((defpackage.yfi) obj).size() + oupVar.g.size();
        ((defpackage.yfi) obj).addAll(oupVar.g);
        int i2 = size - i;
        if (i2 > 0) {
            aeapVar.b += i2;
        }
        aeapVar.b += oupVar.h;
        aeapVar.c = oupVar;
        defpackage.ouo ouoVarB = defpackage.ouo.b(oupVar.e);
        if (ouoVarB == null) {
            ouoVarB = defpackage.ouo.AUDIO_STREAMING_STATUS_UNSPECIFIED;
        }
        if (ouoVarB != defpackage.ouo.STREAMING) {
            defpackage.oup oupVarC = aeapVar.c();
            if ((oupVarC.b & 8) != 0) {
                defpackage.ouq ouqVar = oupVarC.f;
                if (ouqVar == null) {
                    ouqVar = defpackage.ouq.a;
                }
                defpackage.abqv abqvVar = ouqVar.c;
                if (abqvVar == null) {
                    abqvVar = defpackage.abqv.a;
                }
                defpackage.rrx.d(3, "CAR.AudioDiagAggr", null, "voice session started at: %s, audio session start time: %s", defpackage.abrx.f(this.b), defpackage.abrx.f(abqvVar));
                if (acal.j(abqvVar, this.b) > 0) {
                    this.c.a(oupVarC);
                } else {
                    defpackage.rrx.d(4, "CAR.AudioDiagAggr", null, "voice session started at: %s, ignore audio stream session: %s", defpackage.abrx.f(this.b), qsp.B(oupVarC));
                }
            } else {
                this.c.a(oupVarC);
            }
            list.remove(aeapVar);
        }
    }

    public final synchronized void b() {
        defpackage.wfp.c();
        java.util.List list = this.d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.a(((aeap) it.next()).c());
        }
        list.clear();
    }

    public final synchronized void c() {
        this.b = defpackage.abrx.d();
    }
}
