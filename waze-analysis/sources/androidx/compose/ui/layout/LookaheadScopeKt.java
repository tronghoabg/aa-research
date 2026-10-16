package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.y;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LookaheadScopeKt {
    private static final p<Placeable.PlacementScope, LayoutCoordinates, Boolean> defaultPlacementApproachInProgress = LookaheadScopeKt$defaultPlacementApproachInProgress$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LookaheadScope(q<? super LookaheadScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(441837433);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(qVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(441837433, i3, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:49)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LookaheadScopeImpl(null, i5, 0 == true ? 1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) objRememberedValue;
            LookaheadScopeKt$LookaheadScope$1$1 lookaheadScopeKt$LookaheadScope$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (lookaheadScopeKt$LookaheadScope$1$1RememberedValue == Composer.Companion.getEmpty()) {
                lookaheadScopeKt$LookaheadScope$1$1RememberedValue = LookaheadScopeKt$LookaheadScope$1$1.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(lookaheadScopeKt$LookaheadScope$1$1RememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) lookaheadScopeKt$LookaheadScope$1$1RememberedValue;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(aVar);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7347initimpl(composerStartRestartGroup, LookaheadScopeKt$LookaheadScope$2$1.INSTANCE);
            Updater.m7351setimpl(composerStartRestartGroup, lookaheadScopeImpl, LookaheadScopeKt$LookaheadScope$2$2.INSTANCE);
            qVar.invoke(lookaheadScopeImpl, composerStartRestartGroup, Integer.valueOf((i3 << 3) & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass4(qVar, i2));
        }
    }

    public static final Modifier approachLayout(Modifier modifier, l<? super IntSize, Boolean> lVar, p<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> pVar, q<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        return modifier.then(new ApproachLayoutElement(qVar, lVar, pVar));
    }

    public static /* synthetic */ Modifier approachLayout$default(Modifier modifier, l lVar, p pVar, q qVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = defaultPlacementApproachInProgress;
        }
        return approachLayout(modifier, lVar, pVar, qVar);
    }

    /* renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m9778localLookaheadPositionOfFgt4K4Q(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z) {
        LayoutCoordinates lookaheadCoordinates = lookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        boolean z2 = lookaheadCoordinates instanceof LookaheadLayoutCoordinates;
        LayoutCoordinates lookaheadCoordinates2 = lookaheadScope.toLookaheadCoordinates(layoutCoordinates2);
        return z2 ? ((LookaheadLayoutCoordinates) lookaheadCoordinates).mo9745localPositionOfS_NoaFU(lookaheadCoordinates2, j2, z) : lookaheadCoordinates2 instanceof LookaheadLayoutCoordinates ? ((LookaheadLayoutCoordinates) lookaheadCoordinates2).mo9745localPositionOfS_NoaFU(lookaheadCoordinates, j2, z) ^ (-9223372034707292160L) : lookaheadCoordinates.mo9745localPositionOfS_NoaFU(lookaheadCoordinates, j2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutCoordinates lookaheadScopeCoordinates(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates) {
        if (layoutCoordinates instanceof LookaheadCapablePlaceable) {
            return lookaheadScope.getLookaheadScopeCoordinates(((LookaheadCapablePlaceable) layoutCoordinates).getPlacementScope());
        }
        Objects.toString(layoutCoordinates);
        throw new IllegalArgumentException("Invalid LayoutCoordinates: ".concat(String.valueOf(layoutCoordinates)));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4, reason: invalid class name */
    final class AnonymousClass4 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q<LookaheadScope, Composer, Integer, ab> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(q<? super LookaheadScope, ? super Composer, ? super Integer, ab> qVar, int i2) {
            super(2);
            this.$content = qVar;
            this.$$changed = i2;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }

        public final void invoke(Composer composer, int i2) {
            LookaheadScopeKt.LookaheadScope(this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }
}
