package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import ea.S;
import java.util.Iterator;

/* renamed from: i8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2857b extends z {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IBinder f36887g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S f36888h;

    public C2857b(S s10, IBinder iBinder) {
        this.f36888h = s10;
        this.f36887g = iBinder;
    }

    @Override // i8.z
    public final void b() throws RemoteException {
        d dVar = (d) this.f36888h.f34501b;
        dVar.f36904n = (IInterface) dVar.f36900i.a(this.f36887g);
        y yVar = dVar.f36893b;
        yVar.b("linkToDeath", new Object[0]);
        try {
            dVar.f36904n.asBinder().linkToDeath(dVar.k, 0);
        } catch (RemoteException e7) {
            yVar.a(e7, "linkToDeath failed", new Object[0]);
        }
        dVar.f36898g = false;
        Iterator it = dVar.f36895d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        dVar.f36895d.clear();
    }
}
