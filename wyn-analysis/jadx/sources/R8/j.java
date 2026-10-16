package R8;

import j$.util.Objects;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final R0.e f10466a;

    /* renamed from: b, reason: collision with root package name */
    public final i f10467b;

    public j(R0.e eVar, X8.c cVar) {
        this.f10466a = eVar;
        this.f10467b = new i(cVar);
    }

    public final void a(String str) {
        i iVar = this.f10467b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f10464b, str)) {
                i.a(iVar.f10463a, str, iVar.f10465c);
                iVar.f10464b = str;
            }
        }
    }
}
