package defpackage;

/* loaded from: classes.dex */
public enum odm {
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

    private static final yfy m;
    public final int l;

    static {
        odm odmVar = NEW;
        odm odmVar2 = DIALING;
        odm odmVar3 = RINGING;
        odm odmVar4 = HOLDING;
        odm odmVar5 = ACTIVE;
        odm odmVar6 = DISCONNECTED;
        odm odmVar7 = SELECT_PHONE_ACCOUNT;
        odm odmVar8 = CONNECTING;
        odm odmVar9 = DISCONNECTING;
        odm odmVar10 = SIMULATED_RINGING;
        odm odmVar11 = AUDIO_PROCESSING;
        yfu yfuVar = new yfu(4);
        yfuVar.e(Integer.valueOf(odmVar.l), odmVar);
        yfuVar.e(Integer.valueOf(odmVar2.l), odmVar2);
        yfuVar.e(Integer.valueOf(odmVar3.l), odmVar3);
        yfuVar.e(Integer.valueOf(odmVar4.l), odmVar4);
        yfuVar.e(Integer.valueOf(odmVar5.l), odmVar5);
        yfuVar.e(Integer.valueOf(odmVar6.l), odmVar6);
        yfuVar.e(Integer.valueOf(odmVar7.l), odmVar7);
        yfuVar.e(Integer.valueOf(odmVar8.l), odmVar8);
        yfuVar.e(Integer.valueOf(odmVar9.l), odmVar9);
        yfuVar.e(Integer.valueOf(odmVar11.l), odmVar11);
        yfuVar.e(Integer.valueOf(odmVar10.l), odmVar10);
        m = yfuVar.d(true);
    }

    odm(int i) {
        this.l = i;
    }

    public static odm a(int i) {
        odm odmVar = (odm) m.get(Integer.valueOf(i));
        odmVar.getClass();
        return odmVar;
    }
}
