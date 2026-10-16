package defpackage;

/* loaded from: classes2.dex */
public final class ker implements hmk {
    public final keq a;
    public final ajab b;
    private final ept c;
    private final ajab d;

    public ker(ept eptVar) {
        eptVar.getClass();
        this.c = eptVar;
        yph.c("VoiceSessionManager");
        ajab ajabVarA = ajac.a(null);
        this.b = ajabVarA;
        this.d = ajabVarA;
        this.a = new keq(this);
        eptVar.c(new erc(this, 6, null));
    }

    @Override // defpackage.hmk
    public final /* synthetic */ aiyk a() {
        return this.d;
    }

    @Override // defpackage.hmk
    public final void b(hmi hmiVar) {
        ywk ywkVar;
        kwv kwvVarH = kfl.h();
        epq epqVar = epr.Companion;
        int iOrdinal = hmiVar.ordinal();
        if (iOrdinal == 0) {
            ywkVar = ywk.SCRIM_CLICKED;
        } else {
            if (iOrdinal != 1) {
                throw new aezs();
            }
            ywkVar = ywk.X_BUTTON_CLICKED;
        }
        kwvVarH.n(ywkVar);
    }
}
