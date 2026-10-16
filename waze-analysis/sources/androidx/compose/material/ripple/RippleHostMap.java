package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RippleHostMap {
    private final Map<RippleHostKey, RippleHostView> indicationToHostMap = new LinkedHashMap();
    private final Map<RippleHostView, RippleHostKey> hostToIndicationMap = new LinkedHashMap();

    public final RippleHostView get(RippleHostKey rippleHostKey) {
        return this.indicationToHostMap.get(rippleHostKey);
    }

    public final void remove(RippleHostKey rippleHostKey) {
        RippleHostView rippleHostView = this.indicationToHostMap.get(rippleHostKey);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(rippleHostKey);
    }

    public final void set(RippleHostKey rippleHostKey, RippleHostView rippleHostView) {
        this.indicationToHostMap.put(rippleHostKey, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, rippleHostKey);
    }

    public final RippleHostKey get(RippleHostView rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }
}
