package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zva implements vgj {
    final zwl b;
    public final zwa d;
    public final zys e;
    private final zyb f;
    private final String g;
    final Map a = new HashMap();
    public final Map c = new HashMap();

    public zva(zwa zwaVar, zwl zwlVar, zys zysVar, zyb zybVar, String str) {
        this.d = zwaVar;
        this.b = zwlVar;
        this.e = zysVar;
        this.g = str;
        this.f = zybVar;
        a();
    }

    public final void a() {
        zyb zybVar = this.f;
        String str = this.g;
        if (zybVar.a(str).isEmpty() && (zybVar.b(str).isEmpty() || zybVar.b(str).contains(aauq.UNKNOWN_MAP_FACTS_TYPE))) {
            return;
        }
        this.b.p(true);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return null;
    }

    @Override // defpackage.vgj
    public final void e(IMapCapabilitiesDelegate iMapCapabilitiesDelegate) throws RemoteException {
        for (zuz zuzVar : this.a.values()) {
            boolean z = zuzVar.d;
            boolean zB = zuzVar.b();
            zuzVar.d = zB;
            if (z != zB) {
                zuzVar.a();
            }
        }
    }
}
