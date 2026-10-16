package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final a<ComposeUiNode> Constructor = LayoutNode.Companion.getConstructor$ui();
        private static final a<ComposeUiNode> VirtualConstructor = ComposeUiNode$Companion$VirtualConstructor$1.INSTANCE;
        private static final p<ComposeUiNode, Modifier, ab> SetModifier = ComposeUiNode$Companion$SetModifier$1.INSTANCE;
        private static final p<ComposeUiNode, Density, ab> SetDensity = ComposeUiNode$Companion$SetDensity$1.INSTANCE;
        private static final p<ComposeUiNode, CompositionLocalMap, ab> SetResolvedCompositionLocals = ComposeUiNode$Companion$SetResolvedCompositionLocals$1.INSTANCE;
        private static final p<ComposeUiNode, MeasurePolicy, ab> SetMeasurePolicy = ComposeUiNode$Companion$SetMeasurePolicy$1.INSTANCE;
        private static final p<ComposeUiNode, LayoutDirection, ab> SetLayoutDirection = ComposeUiNode$Companion$SetLayoutDirection$1.INSTANCE;
        private static final p<ComposeUiNode, ViewConfiguration, ab> SetViewConfiguration = ComposeUiNode$Companion$SetViewConfiguration$1.INSTANCE;
        private static final p<ComposeUiNode, Integer, ab> SetCompositeKeyHash = ComposeUiNode$Companion$SetCompositeKeyHash$1.INSTANCE;
        private static final l<ComposeUiNode, ab> ApplyOnDeactivatedNodeAssertion = ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1.INSTANCE;

        private Companion() {
        }

        public final l<ComposeUiNode, ab> getApplyOnDeactivatedNodeAssertion() {
            return ApplyOnDeactivatedNodeAssertion;
        }

        public final a<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        public final p<ComposeUiNode, Integer, ab> getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        public final p<ComposeUiNode, Density, ab> getSetDensity() {
            return SetDensity;
        }

        public final p<ComposeUiNode, LayoutDirection, ab> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final p<ComposeUiNode, MeasurePolicy, ab> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final p<ComposeUiNode, Modifier, ab> getSetModifier() {
            return SetModifier;
        }

        public final p<ComposeUiNode, CompositionLocalMap, ab> getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final p<ComposeUiNode, ViewConfiguration, ab> getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final a<ComposeUiNode> getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    int getCompositeKeyHash();

    CompositionLocalMap getCompositionLocalMap();

    Density getDensity();

    LayoutDirection getLayoutDirection();

    MeasurePolicy getMeasurePolicy();

    Modifier getModifier();

    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i2);

    void setCompositionLocalMap(CompositionLocalMap compositionLocalMap);

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);
}
