package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jlb {
    public final boolean a;
    public final Object b;
    public final Object c;

    public jlb(boolean z) {
        this.a = z;
        this.c = new AtomicReference(null);
        this.b = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final boolean a(Context context) throws PackageManager.NameNotFoundException {
        int callingUid = Binder.getCallingUid();
        boolean z = true;
        if (this.a && Process.myUid() == callingUid) {
            yph yphVar = jld.a;
            return true;
        }
        ?? r2 = this.c;
        if (r2.contains(Integer.valueOf(callingUid))) {
            yph yphVar2 = jld.a;
            return true;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
        skn sknVarA = skn.a(context);
        if (packagesForUid != null) {
            int i = 0;
            while (i < packagesForUid.length) {
                String str = packagesForUid[i];
                boolean zB = sknVarA.b(str);
                boolean zContains = ((ygr) this.b).contains(str);
                yph yphVar3 = jld.a;
                ype ypeVar = (ype) ((ype) yphVar3.f()).ai(2293);
                Integer numValueOf = Integer.valueOf(callingUid);
                Boolean boolValueOf = Boolean.valueOf(zB);
                zjc zjcVar = zjc.a;
                boolean z2 = z;
                ypeVar.S("Package %s for uid %d: isGoogleSigned = %b, isPackageAllowed = %b", str, numValueOf, new zjd(zjcVar, boolValueOf), new zjd(zjcVar, Boolean.valueOf(zContains)));
                if (zB && zContains) {
                    ((ype) ((ype) yphVar3.f()).ai(2294)).D("Allowing call from UID %d, package %s", callingUid, new zjd(zjcVar, str));
                    r2.add(numValueOf);
                    return z2;
                }
                i++;
                z = z2;
            }
        } else {
            ((ype) ((ype) jld.a.g()).ai((char) 2291)).u("isAllowedCaller - list of packages to verify is null");
        }
        ((ype) ((ype) jld.a.g()).ai((char) 2292)).w("Call from UID %d is not allowed.", callingUid);
        return false;
    }

    public final void b(float f) {
        ((byb) this.b).h(f);
    }

    public jlb(List list, boolean z) {
        this.c = new ConcurrentSkipListSet();
        this.b = ygr.n(list);
        this.a = z;
    }
}
