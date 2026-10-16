package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iuy extends defpackage.rlh {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.SERVICE");
    private final defpackage.yhe c;
    private boolean d = true;

    public iuy(defpackage.yhe yheVar) {
        defpackage.ysr.bk(true ^ yheVar.isEmpty(), "No car displays are attached. Displays have not been discovered or car is disconnected/disconnecting.");
        this.c = yheVar;
    }

    @Override // defpackage.rli
    public final int a() throws android.os.RemoteException {
        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(this.c.values()).filter(new defpackage.iux(0)).findFirst();
        if (true == optionalFindFirst.isPresent()) {
            defpackage.ivi iviVar = ((defpackage.ivc) optionalFindFirst.get()).o;
            iviVar.getClass();
            int iW = iviVar.w();
            int i = iW - 1;
            if (iW == 0) {
                throw null;
            }
            optionalFindFirst = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(i));
        }
        return ((java.lang.Integer) optionalFindFirst.orElse(0)).intValue();
    }

    @Override // defpackage.rli
    public final void b(boolean z) {
        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 1353)).y("Setting updates enabled %s", java.lang.Boolean.valueOf(z));
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rli
    public final void c(com.google.android.gms.car.display.UiStyle uiStyle) {
        if (!this.d) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 1354)).u("Blocking theme update.");
            return;
        }
        defpackage.abor aborVarN = xpy.a.n();
        defpackage.abor aborVarN2 = xps.a.n();
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(uiStyle.a).map(new defpackage.rix(7));
        aborVarN2.getClass();
        map.forEach(new defpackage.pmt(aborVarN2, 3));
        j$.util.Collection.-EL.stream(uiStyle.b).map(new defpackage.rix(7)).forEach(new defpackage.pmt(aborVarN2, 4));
        xps xpsVarQ = aborVarN2.q();
        aborVarN.t();
        xpy xpyVar = aborVarN.b;
        xpsVarQ.getClass();
        xpyVar.c = xpsVarQ;
        xpyVar.b |= 1;
        xpy xpyVarQ = aborVarN.q();
        defpackage.you youVarListIterator = ((defpackage.ygw) this.c.values()).listIterator(0);
        while (youVarListIterator.hasNext()) {
            defpackage.ivc ivcVar = (defpackage.ivc) youVarListIterator.next();
            defpackage.ivi iviVar = ivcVar.o;
            com.google.android.gms.car.display.CarDisplayId carDisplayId = ivcVar.j;
            iviVar.getClass();
            iviVar.p(xpyVarQ);
        }
    }
}
