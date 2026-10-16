package androidx.compose.runtime;

import com.waze.strings.DisplayStrings;
import h.c.j;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.b.b;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final <T extends R, R> State<R> collectAsState(k<? extends T> kVar, R r, j jVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            jVar = h.c.k.f48060a;
        }
        j jVar2 = jVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:69)");
        }
        boolean zChangedInstance = composer.changedInstance(jVar2) | composer.changedInstance(kVar);
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(jVar2, kVar, null);
            composer.updateRememberedValue(snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue);
        }
        p pVar = (p) snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue;
        State<R> stateProduceState = SnapshotStateKt.produceState(r, kVar, jVar2, pVar, composer, ((i2 >> 3) & 14) | ((i2 << 3) & 112) | (i2 & DisplayStrings.DS_TAP_TO_VERIFY));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateProduceState;
    }

    public static final <T> k<T> snapshotFlow(a<? extends T> aVar) {
        return snapshotFlowImpl$SnapshotStateKt__SnapshotFlowKt(null, aVar);
    }

    private static final <T> k<T> snapshotFlowImpl$SnapshotStateKt__SnapshotFlowKt(SnapshotFlowManager snapshotFlowManager, a<? extends T> aVar) {
        return new b(new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(snapshotFlowManager, aVar, null));
    }

    public static final <T> k<T> snapshotFlow(SnapshotFlowManager snapshotFlowManager, a<? extends T> aVar) {
        return snapshotFlowImpl$SnapshotStateKt__SnapshotFlowKt(snapshotFlowManager, aVar);
    }

    public static final <T> State<T> collectAsState(ch<? extends T> chVar, j jVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            jVar = h.c.k.f48060a;
        }
        j jVar2 = jVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:53)");
        }
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(chVar, chVar.d(), jVar2, composer, (i2 & 14) | ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsState;
    }
}
