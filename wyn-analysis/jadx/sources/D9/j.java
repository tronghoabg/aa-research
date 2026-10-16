package D9;

import E4.w;
import J9.C0656o;
import org.apache.tika.metadata.TikaCoreProperties;
import z9.EnumC4625D;
import z9.InterfaceC4626E;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final N9.h f2578a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4626E f2579b;

    public j(N9.h hVar, InterfaceC4626E interfaceC4626E) {
        this.f2578a = hVar;
        this.f2579b = interfaceC4626E;
    }

    public final void a(w wVar) {
        InterfaceC4626E interfaceC4626E;
        e.a("Image Downloading  Error : " + wVar.getMessage() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + wVar.getCause());
        if (this.f2578a == null || (interfaceC4626E = this.f2579b) == null) {
            return;
        }
        if (wVar.getLocalizedMessage().contains("Failed to decode")) {
            ((C0656o) interfaceC4626E).a(EnumC4625D.f48429d);
        } else {
            ((C0656o) interfaceC4626E).a(EnumC4625D.f48426a);
        }
    }
}
