package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sup extends defpackage.slw implements defpackage.sma {
    public static final defpackage.rkq a = new defpackage.rkq("LocationServices.API", new defpackage.sum());

    public sup(android.content.Context context) {
        super(context, null, a, defpackage.slq.c, defpackage.slv.a);
    }

    public final defpackage.swx a() {
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new defpackage.qqv(9);
        snyVar.c = 2414;
        return super.u(0, snyVar.a());
    }

    public final defpackage.swx b() {
        defpackage.sub.e(102);
        com.google.android.gms.location.CurrentLocationRequest currentLocationRequest = new com.google.android.gms.location.CurrentLocationRequest(10000L, 0, 102, Long.MAX_VALUE, false, 0, new android.os.WorkSource(null), null);
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new defpackage.qqu(currentLocationRequest, 15);
        snyVar.c = 2415;
        return super.u(0, snyVar.a());
    }

    public final void c(android.location.Location location) {
        defpackage.sqs.aq(location != null);
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new defpackage.qqu(location, 14);
        snyVar.c = 2419;
        super.u(1, snyVar.a());
    }
}
