package defpackage;

/* loaded from: classes.dex */
public final class ldz {
    public boolean d;
    private final afgl e = new lhu(new daz(this, 17), new lhn(false));
    private final afgl f = new lhu(new krq(14), new lhn(false));
    private final aezr g = new aezy(new ksz(10));
    static final /* synthetic */ afia[] b = {new affo(ldz.class, "flagEnabled", "getFlagEnabled(Lcom/google/android/gms/car/CarClientToken;)Z"), new affo(ldz.class, "hasTouchInput", "getHasTouchInput(Lcom/google/android/gms/car/CarClientToken;)Z")};
    public static final ldy a = new ldy();
    public static final afgl c = new kkp(mki.b, 5);

    public static final ldz a() {
        return a.a();
    }

    public final boolean b() {
        yph yphVar = kio.a;
        kio kioVar = (kio) mki.a.i(kio.class);
        try {
            if (!kioVar.r()) {
                return this.d;
            }
            qrn qrnVarE = kioVar.e();
            qrnVarE.getClass();
            return c(qrnVarE);
        } catch (IllegalStateException | qrz unused) {
            return this.d;
        }
    }

    public final boolean c(qrn qrnVar) {
        qrnVar.getClass();
        afia<?>[] afiaVarArr = b;
        if (((Boolean) this.e.getValue(qrnVar, afiaVarArr[0])).booleanValue()) {
            return ((Boolean) this.g.a()).booleanValue() || ((Boolean) this.f.getValue(qrnVar, afiaVarArr[1])).booleanValue();
        }
        return false;
    }

    public final boolean d(qrn qrnVar) {
        mki.a.g();
        return qrnVar.a().p(raj.Z);
    }
}
