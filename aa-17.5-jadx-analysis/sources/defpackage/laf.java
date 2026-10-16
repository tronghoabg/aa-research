package defpackage;

/* loaded from: classes.dex */
public final class laf {
    public static final yph a = yph.c("GH.AgsaAudioDiagnostics");
    public rfe b;
    public final ret c;
    public final rfm d;
    public final abnp e = otq.a.n();
    public final mko f = new mko(new lab(0 == true ? 1 : 0), new lac());
    private final ydx g = new ydx(16);

    /* JADX WARN: Multi-variable type inference failed */
    public laf() {
        vtn vtnVar = new vtn((byte[]) null);
        vtnVar.b = new rfb() { // from class: lad
            @Override // defpackage.rfb
            public final void a(ots otsVar) {
                ((ype) laf.a.l().ai((char) 3680)).y("Audio streaming session ended, got diagnostics: %s", uqw.ab(otsVar));
                laf lafVar = this.a;
                synchronized (lafVar) {
                    abnp abnpVar = lafVar.e;
                    abnpVar.t();
                    otq otqVar = (otq) abnpVar.b;
                    otq otqVar2 = otq.a;
                    otsVar.getClass();
                    aboh abohVar = otqVar.b;
                    if (!abohVar.c()) {
                        otqVar.b = abnv.I(abohVar);
                    }
                    otqVar.b.add(otsVar);
                    lafVar.f.q(otsVar);
                }
            }
        };
        vtnVar.a = sk.AUDIO_CONTENT_BUFFER_SIZE;
        woy.aa(vtnVar.b != null, "delegateListener is required");
        this.c = new ret(vtnVar);
        rfk rfkVar = new rfk();
        rfkVar.a = 256;
        rfkVar.b = 64;
        rfkVar.c = new rfd() { // from class: lae
            @Override // defpackage.rfd
            public final void a(oub oubVar) {
                yph yphVar = laf.a;
                rzk rzkVarN = rzk.n();
                uqw.O(rzkVarN, oubVar);
                ((ype) yphVar.l().ai((char) 3681)).y("Microphone recording session ended, got diagnostics: %s", rzkVarN.toString());
                laf lafVar = this.a;
                synchronized (lafVar) {
                    abnp abnpVar = lafVar.e;
                    abnpVar.t();
                    otq otqVar = (otq) abnpVar.b;
                    otq otqVar2 = otq.a;
                    oubVar.getClass();
                    aboh abohVar = otqVar.c;
                    if (!abohVar.c()) {
                        otqVar.c = abnv.I(abohVar);
                    }
                    otqVar.c.add(oubVar);
                }
            }
        };
        woy.aa(rfkVar.c != null, "delegateListener is required");
        this.d = new rfm(rfkVar);
    }

    public final synchronized otq a() {
        abnp abnpVar = this.e;
        if (((otq) abnpVar.b).b.size() == 0 && ((otq) abnpVar.b).c.size() == 0) {
            return null;
        }
        return (otq) abnpVar.q();
    }

    public final synchronized yfq b() {
        return yfq.o(this.g);
    }

    public final synchronized void c() {
        wer.c();
        rfe rfeVar = this.b;
        if (rfeVar == null) {
            ((ype) ((ype) a.h()).ai((char) 3682)).u("diagnosticsManager unavailable, skipping audio diagnostics logging");
            return;
        }
        this.b = null;
        ret retVar = this.c;
        rfeVar.f(retVar);
        rfm rfmVar = this.d;
        rfeVar.g(rfmVar);
        retVar.b();
        rfmVar.b();
        abnp abnpVar = this.e;
        otq otqVar = (otq) abnpVar.q();
        if (abnpVar.a.T()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        abnpVar.b = abnpVar.p();
        this.g.add(otqVar);
    }
}
