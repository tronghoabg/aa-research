package androidx.constraintlayout.compose;

import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class LayoutReference {
    public static final int $stable = 0;
    private final Map<String, HelperParams> helperParamsMap = new LinkedHashMap();
    private final Object id;

    public LayoutReference(Object obj) {
        this.id = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutReference) && x.n(getId$constraintlayout_compose(), ((LayoutReference) obj).getId$constraintlayout_compose());
    }

    public final /* synthetic */ <T extends HelperParams> T getHelperParams$constraintlayout_compose() {
        Map map = this.helperParamsMap;
        x.i();
        int i2 = ar.f48106a;
        Object obj = map.get(new m(HelperParams.class).c());
        x.i();
        return (T) obj;
    }

    public Object getId$constraintlayout_compose() {
        return this.id;
    }

    public int hashCode() {
        return getId$constraintlayout_compose().hashCode();
    }

    public final void setHelperParams$constraintlayout_compose(HelperParams helperParams) {
        Class<?> cls = helperParams.getClass();
        int i2 = ar.f48106a;
        String strC = new m(cls).c();
        if (strC != null) {
            this.helperParamsMap.put(strC, helperParams);
        }
    }
}
