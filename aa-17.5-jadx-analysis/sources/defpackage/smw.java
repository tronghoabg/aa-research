package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class smw {
    public final smr a;
    public final Feature[] b;
    public final boolean c;
    public final int d;
    final /* synthetic */ smx e;

    public smw(smx smxVar, smr smrVar, Feature[] featureArr, boolean z, int i) {
        this.e = smxVar;
        this.a = smrVar;
        this.b = featureArr;
        this.c = z;
        this.d = i;
    }

    public final smp a() {
        return this.a.a;
    }

    protected final void b(skq skqVar, nok nokVar) throws RemoteException {
        this.e.a.a(skqVar, nokVar);
    }
}
