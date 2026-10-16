package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aqg extends defpackage.affo implements defpackage.affg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(java.lang.Object obj, int i, char[] cArr) {
        super(2, obj, defpackage.ccz.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        this.a = i;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.a;
        if (i == 0) {
            long j = ((defpackage.dmd) obj).a;
            defpackage.aqj aqjVar = (defpackage.aqj) this.receiver;
            ahoc.d(((defpackage.amf) aqjVar).c.f(), (defpackage.afdo) null, 0, new defpackage.aqi(aqjVar, j, (defpackage.afdk) null, 2, (char[]) null), 3);
            return defpackage.afbk.a;
        }
        if (i != 1) {
            int iIntValue = ((java.lang.Number) obj2).intValue();
            ((defpackage.ccz) this.receiver).a((defpackage.bve) obj, iIntValue);
            return defpackage.afbk.a;
        }
        long j2 = ((defpackage.dmd) obj).a;
        defpackage.aqj aqjVar2 = (defpackage.aqj) this.receiver;
        ahoc.d(((defpackage.amf) aqjVar2).c.f(), (defpackage.afdo) null, 0, new defpackage.aqi(aqjVar2, j2, (defpackage.afdk) null, 0), 3);
        return defpackage.afbk.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(java.lang.Object obj, int i, byte[] bArr) {
        super(2, obj, defpackage.aqj.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(java.lang.Object obj, int i) {
        super(2, obj, defpackage.aqj.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4);
        this.a = i;
    }
}
