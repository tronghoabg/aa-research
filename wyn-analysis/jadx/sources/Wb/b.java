package Wb;

import android.content.Context;
import android.net.ConnectivityManager;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.C4273j;
import uc.C4281r;
import uc.InterfaceC4269f;
import xa.d;
import y3.C4552j;

/* loaded from: classes5.dex */
public class b implements InterfaceC3885b {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f15455a;

    /* renamed from: b, reason: collision with root package name */
    public C4273j f15456b;

    /* renamed from: c, reason: collision with root package name */
    public a f15457c;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        this.f15455a = new C4281r(interfaceC4269f, "dev.fluttercommunity.plus/connectivity");
        this.f15456b = new C4273j(interfaceC4269f, "dev.fluttercommunity.plus/connectivity_status");
        Context context = c3884a.f44186a;
        d dVar = new d((ConnectivityManager) context.getSystemService("connectivity"), 25);
        C4552j c4552j = new C4552j(dVar, 25);
        this.f15457c = new a(context, dVar);
        this.f15455a.b(c4552j);
        this.f15456b.a(this.f15457c);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f15455a.b(null);
        this.f15456b.a(null);
        this.f15457c.onCancel(null);
        this.f15455a = null;
        this.f15456b = null;
        this.f15457c = null;
    }
}
