package androidx.compose.ui.platform;

import h.ab;
import h.g.a.l;
import h.m.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    private InspectorInfo _values;
    private final l<InspectorInfo, ab> info;

    /* JADX WARN: Multi-variable type inference failed */
    public InspectorValueInfo(l<? super InspectorInfo, ab> lVar) {
        this.info = lVar;
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo = this._values;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.info.invoke(inspectorInfo);
        }
        this._values = inspectorInfo;
        return inspectorInfo;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public h<ValueElement> getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public Object getValueOverride() {
        return getValues().getValue();
    }
}
