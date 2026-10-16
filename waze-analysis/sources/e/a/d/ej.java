package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ej implements ai {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ka f46879a;

    ej(ka kaVar) {
        Objects.requireNonNull(kaVar);
        this.f46879a = kaVar;
    }

    @Override // e.a.d.ai
    public final void a() {
        ek ekVar = this.f46879a.f47266a;
        e.a.ee eeVarG = e.a.ee.f47411k.g("Keepalive failed. The connection is likely gone");
        js jsVar = js.SUBCHANNEL_SHUTDOWN;
        ekVar.a(eeVarG);
    }

    @Override // e.a.d.ai
    public final void b() {
    }
}
