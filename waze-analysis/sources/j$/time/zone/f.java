package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f50113a;

    public f(ArrayList arrayList) {
        this.f50113a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            g.b(new g());
            return null;
        }
        try {
            g gVar = (g) g.class.cast(Class.forName(property, true, g.class.getClassLoader()).newInstance());
            g.b(gVar);
            this.f50113a.add(gVar);
            return null;
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }
}
