package e.a;

import androidx.core.app.NotificationCompat;
import com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationServiceGrpc;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dx {

    /* renamed from: a, reason: collision with root package name */
    private final Object f47349a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f47350b;

    public dx(org.a.d.i.a aVar, org.a.d.g.a aVar2) {
        h.g.b.x.f(aVar, "scopeQualifier");
        h.g.b.x.f(aVar2, "module");
        this.f47349a = aVar;
        this.f47350b = aVar2;
    }

    static /* bridge */ /* synthetic */ String b(dx dxVar) {
        return (String) dxVar.f47349a;
    }

    public static av g() {
        return new av();
    }

    public final dy a() {
        return new dy(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void d(cq cqVar) {
        this.f47350b.add(cqVar);
    }

    public final okhttp3.z e() {
        return (okhttp3.z) this.f47349a;
    }

    public final okhttp3.ao f() {
        return (okhttp3.ao) this.f47350b;
    }

    public final ee h() {
        return (ee) this.f47350b;
    }

    public final Object i() {
        return this.f47349a;
    }

    public final org.a.d.g.a j() {
        return (org.a.d.g.a) this.f47350b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, org.a.d.i.a] */
    public final org.a.d.i.a k() {
        return this.f47349a;
    }

    public /* synthetic */ dx(okhttp3.z zVar, okhttp3.ao aoVar) {
        this.f47349a = zVar;
        this.f47350b = aoVar;
    }

    /* synthetic */ dx(ee eeVar, Object obj) {
        com.google.d.b.an.C(eeVar, NotificationCompat.CATEGORY_STATUS);
        this.f47350b = eeVar;
        this.f47349a = obj;
    }

    /* synthetic */ dx() {
        this.f47350b = new ArrayList();
        this.f47349a = AppIntegrationServiceGrpc.SERVICE_NAME;
    }
}
