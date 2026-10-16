package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class svo extends defpackage.slw {
    public static final /* synthetic */ int a = 0;

    static {
        android.util.Pair.create(new defpackage.sqs(), defpackage.sqs.aS(null));
    }

    public svo(android.content.Context context) {
        super(context, null, defpackage.svi.a, defpackage.slq.c, defpackage.slv.a);
    }

    private static defpackage.swx j() {
        defpackage.sls slsVar = new defpackage.sls(new com.google.android.gms.common.api.Status(16, null, null, null));
        defpackage.sxc sxcVar = new defpackage.sxc();
        sxcVar.o(slsVar);
        return sxcVar;
    }

    private final boolean k(int i) {
        return defpackage.sks.d.l(this.b, i) == 0;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.swx a(java.lang.String str) {
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new qqu(str, 16);
        return super.u(0, snyVar.a());
    }

    public final defpackage.swx b(final defpackage.wbr wbrVar) {
        wbrVar.getClass();
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new defpackage.snv() { // from class: svm
            @Override // defpackage.snv
            public final void a(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                int i = defpackage.svo.a;
                defpackage.svq svqVar = new defpackage.svq((defpackage.lhe) obj2);
                defpackage.svr svrVar = (defpackage.svr) ((defpackage.svs) obj).v();
                byte[] bArrH = wbrVar.h();
                android.os.Parcel parcelFp = svrVar.fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeStrongBinder(svqVar);
                parcelFp.writeByteArray(bArrH);
                svrVar.fr(31, parcelFp);
            }
        };
        snyVar.b = new com.google.android.gms.common.Feature[]{defpackage.svg.a};
        snyVar.b();
        return super.u(0, snyVar.a());
    }

    public final defpackage.swx c() {
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new qqv(10);
        snyVar.b = new com.google.android.gms.common.Feature[]{defpackage.svg.i};
        snyVar.b();
        return super.u(0, snyVar.a());
    }

    public final /* synthetic */ defpackage.swx d(java.lang.String str, byte[] bArr, defpackage.swx swxVar) throws java.lang.Exception {
        if (swxVar.g()) {
            return swxVar;
        }
        if (!k(11925000)) {
            return j();
        }
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new qpm(str, bArr, 8, (byte[]) null);
        return super.u(0, snyVar.a());
    }

    public final defpackage.swx e(java.lang.String str, zis zisVar) {
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new qpm(str, zisVar, 12);
        snyVar.b = new com.google.android.gms.common.Feature[]{defpackage.svg.h};
        snyVar.b();
        return super.u(0, snyVar.a());
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.swx f(java.lang.String str) {
        if (!k(12451000)) {
            return j();
        }
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new qpm(str, 11);
        return super.u(0, snyVar.a());
    }

    public final defpackage.swx g(java.lang.String str, java.lang.String str2) {
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new qpm(str, str2, 7, (byte[]) null);
        return super.u(0, snyVar.a());
    }

    @java.lang.Deprecated
    public final defpackage.swx h(java.lang.String str) {
        java.lang.String packageName = this.b.getPackageName();
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new qpm(str, packageName, 9, (byte[]) null);
        snyVar.b = new com.google.android.gms.common.Feature[]{defpackage.svg.c};
        snyVar.b();
        return super.u(0, snyVar.a());
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.swx i(java.lang.String str, int i, java.lang.String[] strArr) {
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new svk(str, i, strArr);
        return super.u(0, snyVar.a());
    }
}
