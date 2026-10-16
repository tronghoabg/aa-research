package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum oeg {
    NEW(0),
    DIALING(1),
    RINGING(2),
    HOLDING(3),
    ACTIVE(4),
    DISCONNECTED(7),
    SELECT_PHONE_ACCOUNT(8),
    CONNECTING(9),
    DISCONNECTING(10),
    SIMULATED_RINGING(13),
    AUDIO_PROCESSING(12);

    private static final defpackage.yhe m;
    public final int l;

    static {
        defpackage.oeg oegVar = NEW;
        defpackage.oeg oegVar2 = DIALING;
        defpackage.oeg oegVar3 = RINGING;
        defpackage.oeg oegVar4 = HOLDING;
        defpackage.oeg oegVar5 = ACTIVE;
        defpackage.oeg oegVar6 = DISCONNECTED;
        defpackage.oeg oegVar7 = SELECT_PHONE_ACCOUNT;
        defpackage.oeg oegVar8 = CONNECTING;
        defpackage.oeg oegVar9 = DISCONNECTING;
        defpackage.oeg oegVar10 = SIMULATED_RINGING;
        defpackage.oeg oegVar11 = AUDIO_PROCESSING;
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(java.lang.Integer.valueOf(oegVar.l), oegVar);
        yhaVar.f(java.lang.Integer.valueOf(oegVar2.l), oegVar2);
        yhaVar.f(java.lang.Integer.valueOf(oegVar3.l), oegVar3);
        yhaVar.f(java.lang.Integer.valueOf(oegVar4.l), oegVar4);
        yhaVar.f(java.lang.Integer.valueOf(oegVar5.l), oegVar5);
        yhaVar.f(java.lang.Integer.valueOf(oegVar6.l), oegVar6);
        yhaVar.f(java.lang.Integer.valueOf(oegVar7.l), oegVar7);
        yhaVar.f(java.lang.Integer.valueOf(oegVar8.l), oegVar8);
        yhaVar.f(java.lang.Integer.valueOf(oegVar9.l), oegVar9);
        yhaVar.f(java.lang.Integer.valueOf(oegVar11.l), oegVar11);
        yhaVar.f(java.lang.Integer.valueOf(oegVar10.l), oegVar10);
        m = yhaVar.d(true);
    }

    oeg(int i) {
        this.l = i;
    }

    public static defpackage.oeg a(int i) {
        defpackage.oeg oegVar = (defpackage.oeg) m.get(java.lang.Integer.valueOf(i));
        oegVar.getClass();
        return oegVar;
    }
}
