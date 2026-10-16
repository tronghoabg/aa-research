package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sda extends defpackage.ijw implements defpackage.sdb {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
    final /* synthetic */ defpackage.shl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sda(defpackage.shl shlVar, android.content.Context context, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        super("com.google.android.gms.carsetup.IServiceHandshakeCallback");
        this.a = context;
        this.b = atomicBoolean;
        this.c = shlVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.sdb
    public final void e() {
        try {
            defpackage.shl shlVar = this.c;
            android.content.Context context = this.a;
            defpackage.rkq rkqVar = (defpackage.rkq) shlVar.b.fF();
            int callingUid = android.os.Binder.getCallingUid();
            if (android.os.Process.myUid() != callingUid) {
                ?? r3 = rkqVar.b;
                if (!r3.contains(java.lang.Integer.valueOf(callingUid))) {
                    java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                    defpackage.slj sljVarA = defpackage.slj.a(context);
                    if (packagesForUid != null) {
                        for (java.lang.String str : packagesForUid) {
                            boolean zB = sljVarA.b(str);
                            boolean zContains = ((defpackage.yhx) rkqVar.a).contains(str);
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(callingUid);
                            if (zB && zContains) {
                                defpackage.shl.a.l().ai(8943).w("Allowing call from UID %d", callingUid);
                                r3.add(numValueOf);
                            }
                        }
                    }
                    defpackage.shl.a.h().ai(8941).w("Call from UID %d is not allowed.", callingUid);
                    throw new java.lang.SecurityException("Caller is not allowed");
                }
            }
            this.b.set(true);
        } catch (java.lang.SecurityException e) {
            defpackage.shl.a.l().p(e).ai(8940).u("Not allowing caller of service handshake");
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
