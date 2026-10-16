package okhttp3.internal.f;

import java.net.SocketTimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ac extends k.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f56111a;

    public ac(ad adVar) {
        this.f56111a = adVar;
    }

    @Override // k.e
    protected final void a() {
        ad adVar = this.f56111a;
        adVar.u(b.f56147i);
        adVar.i().B();
    }

    public final void b() {
        if (m()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
