package defpackage;

/* loaded from: classes3.dex */
final class aeay extends adrh {
    public static final ajmy a = new ajmy();
    public final admf b;
    public final String c;
    public final adzv d;
    public final String e;
    public final aeax f;
    public final boolean g;
    private final aeaw h;
    private final adis i;

    public aeay(admf admfVar, admc admcVar, aean aeanVar, aebe aebeVar, aebq aebqVar, Object obj, int i, int i2, String str, String str2, adzv adzvVar, aeac aeacVar, adiw adiwVar) {
        super(new aebm(0), adzvVar, aeacVar, admcVar, adiwVar);
        this.h = new aeaw(this);
        this.g = false;
        this.d = adzvVar;
        this.b = admfVar;
        this.e = str;
        this.c = str2;
        this.i = aebeVar.r;
        this.f = new aeax(this, i, adzvVar, obj, aeanVar, aebqVar, aebeVar, i2);
    }

    @Override // defpackage.adsh
    public final adis a() {
        return this.i;
    }

    @Override // defpackage.adrh
    protected final /* synthetic */ adrg p() {
        return this.h;
    }

    @Override // defpackage.adrh, defpackage.adrk
    protected final /* synthetic */ adrj q() {
        return this.f;
    }

    public final adme r() {
        return this.b.a;
    }

    @Override // defpackage.adrh
    protected final /* synthetic */ adrj t() {
        return this.f;
    }
}
