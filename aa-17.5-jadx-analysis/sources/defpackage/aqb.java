package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class aqb extends afeo implements afeg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqb(Object obj, int i, char[] cArr) {
        super(2, obj, cct.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        this.a = i;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            long j = ((dlv) obj).a;
            aqe aqeVar = (aqe) this.receiver;
            ahnc.d(((ama) aqeVar).c.f(), null, 0, new aqd(aqeVar, j, (afck) null, 2, (char[]) null), 3);
            return afak.a;
        }
        if (i != 1) {
            int iIntValue = ((Number) obj2).intValue();
            ((cct) this.receiver).a((bux) obj, iIntValue);
            return afak.a;
        }
        long j2 = ((dlv) obj).a;
        aqe aqeVar2 = (aqe) this.receiver;
        ahnc.d(((ama) aqeVar2).c.f(), null, 0, new aqd(aqeVar2, j2, (afck) null, 0), 3);
        return afak.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqb(Object obj, int i, byte[] bArr) {
        super(2, obj, aqe.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqb(Object obj, int i) {
        super(2, obj, aqe.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4);
        this.a = i;
    }
}
