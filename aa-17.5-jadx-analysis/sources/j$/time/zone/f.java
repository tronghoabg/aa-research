package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class f implements PrivilegedAction {
    public final /* synthetic */ ArrayList a;

    public f(ArrayList arrayList) {
        this.a = arrayList;
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
            this.a.add(gVar);
            return null;
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
