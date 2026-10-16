package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InspectableValueKt {
    private static final l<InspectorInfo, ab> NoInspectorInfo = InspectableValueKt$NoInspectorInfo$1.INSTANCE;
    private static boolean isDebugInspectorInfoEnabled;

    public static final l<InspectorInfo, ab> debugInspectorInfo(l<? super InspectorInfo, ab> lVar) {
        return isDebugInspectorInfoEnabled() ? new AnonymousClass1(lVar) : getNoInspectorInfo();
    }

    public static final l<InspectorInfo, ab> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final Modifier inspectable(Modifier modifier, l<? super InspectorInfo, ab> lVar, l<? super Modifier, ? extends Modifier> lVar2) {
        return inspectableWrapper(modifier, lVar, lVar2.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, l<? super InspectorInfo, ab> lVar, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(lVar);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.InspectableValueKt$debugInspectorInfo$1, reason: invalid class name */
    public final class AnonymousClass1 extends y implements l<InspectorInfo, ab> {
        final /* synthetic */ l<InspectorInfo, ab> $definitions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super InspectorInfo, ab> lVar) {
            super(1);
            this.$definitions = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InspectorInfo inspectorInfo) {
            this.$definitions.invoke(inspectorInfo);
        }
    }
}
