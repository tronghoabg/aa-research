package ea;

import android.os.Build;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* renamed from: ea.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2488c implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2488c f34517a = new C2488c();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f34518b = h9.d.c(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f34519c = h9.d.c("versionName");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f34520d = h9.d.c("appBuildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f34521e = h9.d.c("deviceManufacturer");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f34522f = h9.d.c("currentProcessDetails");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f34523g = h9.d.c("appProcessDetails");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        C2486a c2486a = (C2486a) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(f34518b, c2486a.f34510a);
        fVar.add(f34519c, c2486a.f34511b);
        fVar.add(f34520d, c2486a.f34512c);
        fVar.add(f34521e, Build.MANUFACTURER);
        fVar.add(f34522f, c2486a.f34513d);
        fVar.add(f34523g, c2486a.f34514e);
    }
}
