package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.waze.strings.DisplayStrings;
import h.c.j;
import h.g.a.p;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FlowExtKt {
    public static final <T> State<T> collectAsStateWithLifecycle(k<? extends T> kVar, T t, Lifecycle lifecycle, Lifecycle.State state, j jVar, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i3 & 8) != 0) {
            jVar = h.c.k.f48060a;
        }
        j jVar2 = jVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977777920, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {kVar, lifecycle, state2, jVar2};
        boolean zChangedInstance = ((((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) > 2048 && composer.changed(state2.ordinal())) || (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 2048) | composer.changedInstance(lifecycle) | composer.changedInstance(jVar2) | composer.changedInstance(kVar);
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue == Composer.Companion.getEmpty()) {
            flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, jVar2, kVar, null);
            composer.updateRememberedValue(flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue);
        }
        State<T> stateProduceState = SnapshotStateKt.produceState((Object) t, objArr, (p) flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue, composer, (i2 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateProduceState;
    }

    public static final <T> State<T> collectAsStateWithLifecycle(k<? extends T> kVar, T t, LifecycleOwner lifecycleOwner, Lifecycle.State state, j jVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i3 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i3 & 8) != 0) {
            jVar = h.c.k.f48060a;
        }
        j jVar2 = jVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485997211, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        int i4 = i2 & 112;
        int i5 = i2 & 7168;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(kVar, t, lifecycleOwner.getLifecycle(), state2, jVar2, composer, (i2 & 14) | (((i2 >> 3) & 8) << 3) | i4 | i5 | (i2 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    public static final <T> State<T> collectAsStateWithLifecycle(ch<? extends T> chVar, Lifecycle lifecycle, Lifecycle.State state, j jVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i3 & 4) != 0) {
            jVar = h.c.k.f48060a;
        }
        j jVar2 = jVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1858162195, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:99)");
        }
        int i4 = i2 << 3;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(chVar, chVar.d(), lifecycle, state2, jVar2, composer, (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    public static final <T> State<T> collectAsStateWithLifecycle(ch<? extends T> chVar, LifecycleOwner lifecycleOwner, Lifecycle.State state, j jVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i3 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i3 & 4) != 0) {
            jVar = h.c.k.f48060a;
        }
        j jVar2 = jVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743249048, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        Object objD = chVar.d();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        int i4 = i2 << 3;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(chVar, objD, lifecycle, state2, jVar2, composer, (i2 & 14) | (i4 & 7168) | (i4 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }
}
