package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import h.a.i;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsModifierKt {
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        SemanticsConfiguration semanticsConfiguration2 = semanticsConfiguration;
        int iA = r.a(i.q(semanticsConfiguration2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration2) {
            k kVar = new k(entry.getKey().getName(), entry.getValue());
            linkedHashMap.put(kVar.c(), kVar.d());
        }
        properties.set("properties", linkedHashMap);
    }

    public static final Modifier clearAndSetSemantics(Modifier modifier, l<? super SemanticsPropertyReceiver, ab> lVar) {
        return modifier.then(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    public static final Modifier semantics(Modifier modifier, boolean z, l<? super SemanticsPropertyReceiver, ab> lVar) {
        return modifier.then(new AppendedSemanticsElement(z, lVar));
    }
}
