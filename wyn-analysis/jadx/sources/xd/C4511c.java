package xd;

import Ef.E;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import wd.C4402c;

/* renamed from: xd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4511c implements E {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47883d;

    /* renamed from: e, reason: collision with root package name */
    public static final Nd.a f47884e;

    /* renamed from: a, reason: collision with root package name */
    public final C4402c f47885a;

    /* renamed from: b, reason: collision with root package name */
    public Fd.b f47886b;

    /* renamed from: c, reason: collision with root package name */
    public Gd.a f47887c;

    @NotNull
    private volatile /* synthetic */ int received;

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(Object.class);
        try {
            kTypeB = H.b(Object.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f47884e = new Nd.a("CustomResponse", new Sd.a(orCreateKotlinClass, kTypeB));
        f47883d = AtomicIntegerFieldUpdater.newUpdater(C4511c.class, "received");
    }

    public C4511c(C4402c client) {
        AbstractC3340k.e(client, "client");
        this.f47885a = client;
        this.received = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Sd.a r8, lf.AbstractC3464c r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.C4511c.a(Sd.a, lf.c):java.lang.Object");
    }

    public final Nd.d b() {
        return d().b();
    }

    public boolean c() {
        return false;
    }

    public final Fd.b d() {
        Fd.b bVar = this.f47886b;
        if (bVar != null) {
            return bVar;
        }
        AbstractC3340k.m("request");
        throw null;
    }

    public final Gd.a e() {
        Gd.a aVar = this.f47887c;
        if (aVar != null) {
            return aVar;
        }
        AbstractC3340k.m("response");
        throw null;
    }

    public Object f() {
        return e().d();
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return e().getCoroutineContext();
    }

    public final String toString() {
        return "HttpClientCall[" + d().getUrl() + ", " + e().e() + ']';
    }
}
