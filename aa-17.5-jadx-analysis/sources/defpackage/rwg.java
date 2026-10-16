package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes.dex */
public final class rwg extends rwi {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CAR.CarServiceBroker");
    private final Context c;
    private final qup d;
    private final rzo e;
    private final skn f;

    public rwg(Context context, qup qupVar, rzo rzoVar, skn sknVar) {
        this.c = context;
        this.d = qupVar;
        this.e = rzoVar;
        this.f = sknVar;
    }

    @Override // defpackage.rwj
    public final qup a(Bundle bundle) {
        if (Binder.getCallingUid() == Process.myUid() && Binder.getCallingPid() == Process.myPid()) {
            ((ype) ((ype) b.f()).ai((char) 8448)).u("Allowing self process.");
            return this.d;
        }
        String[] packagesForUid = this.c.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null || (packagesForUid.length) <= 0) {
            throw new IllegalStateException("Could not find calling package");
        }
        for (String str : packagesForUid) {
            if (this.f.b(str)) {
                str.getClass();
                if (rzp.d.contains(str) || (affa.f(str, RemoteApiConstants.NOW_PACKAGE) && Build.VERSION.SDK_INT <= 30)) {
                    rzp.c.l().y("Package validated: %s", new zjd(zjc.a, str));
                    return this.d;
                }
                rzp.c.h().y("Package NOT validated: %s", new zjd(zjc.a, str));
            }
        }
        throw new IllegalStateException("Calling package not allowed");
    }
}
