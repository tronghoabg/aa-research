package e.a.f.a;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends l {

    /* renamed from: b, reason: collision with root package name */
    private final int f47572b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.stats.storage.c f47573c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.stats.storage.c f47574d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.stats.storage.c f47575e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.stats.storage.c f47576f;

    public h(com.waze.stats.storage.c cVar, com.waze.stats.storage.c cVar2, com.waze.stats.storage.c cVar3, com.waze.stats.storage.c cVar4, Provider provider, int i2) {
        super(provider);
        this.f47573c = cVar;
        this.f47574d = cVar2;
        this.f47575e = cVar3;
        this.f47576f = cVar4;
        this.f47572b = i2;
    }

    @Override // e.a.f.a.l
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        com.waze.stats.storage.c cVar = this.f47575e;
        if (cVar.i(sSLSocket) && (bArr = (byte[]) cVar.h(sSLSocket, new Object[0])) != null) {
            return new String(bArr, o.f47605b);
        }
        return null;
    }

    @Override // e.a.f.a.l
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str != null) {
            this.f47573c.j(sSLSocket, true);
            this.f47574d.j(sSLSocket, str);
        }
        com.waze.stats.storage.c cVar = this.f47576f;
        if (cVar.i(sSLSocket)) {
            cVar.h(sSLSocket, g(list));
        }
    }

    @Override // e.a.f.a.l
    public final int c() {
        return this.f47572b;
    }
}
