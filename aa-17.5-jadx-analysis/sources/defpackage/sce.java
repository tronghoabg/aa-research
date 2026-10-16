package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sce extends ijo implements scf {
    final /* synthetic */ Context a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ sgp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sce(sgp sgpVar, Context context, AtomicBoolean atomicBoolean) {
        super("com.google.android.gms.carsetup.IServiceHandshakeCallback");
        this.a = context;
        this.b = atomicBoolean;
        this.c = sgpVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.scf
    public final void e() throws PackageManager.NameNotFoundException {
        try {
            sgp sgpVar = this.c;
            Context context = this.a;
            rju rjuVar = (rju) sgpVar.b.gu();
            int callingUid = Binder.getCallingUid();
            if (Process.myUid() != callingUid) {
                ?? r3 = rjuVar.b;
                if (!r3.contains(Integer.valueOf(callingUid))) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                    skn sknVarA = skn.a(context);
                    if (packagesForUid != null) {
                        for (String str : packagesForUid) {
                            boolean zB = sknVarA.b(str);
                            boolean zContains = ((ygr) rjuVar.a).contains(str);
                            Integer numValueOf = Integer.valueOf(callingUid);
                            if (zB && zContains) {
                                sgp.a.l().ai(8918).w("Allowing call from UID %d", callingUid);
                                r3.add(numValueOf);
                            }
                        }
                    }
                    sgp.a.h().ai(8916).w("Call from UID %d is not allowed.", callingUid);
                    throw new SecurityException("Caller is not allowed");
                }
            }
            this.b.set(true);
        } catch (SecurityException e) {
            sgp.a.l().p(e).ai(8915).u("Not allowing caller of service handshake");
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws PackageManager.NameNotFoundException, RemoteException {
        if (i != 1) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
