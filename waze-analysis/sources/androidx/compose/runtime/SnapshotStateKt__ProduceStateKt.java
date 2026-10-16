package androidx.compose.runtime;

import h.ab;
import h.c.e;
import h.g.a.p;
import java.util.Arrays;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    public static final <T> State<T> produceState(T t, Object[] objArr, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:200)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zChangedInstance = composer.changedInstance(pVar);
        SnapshotStateKt__ProduceStateKt$produceState$5$1 snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$5$1(pVar, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue);
        }
        EffectsKt.LaunchedEffect(objArrCopyOf, (p<? super af, ? super e<? super ab>, ? extends Object>) snapshotStateKt__ProduceStateKt$produceState$5$1RememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(pVar);
        SnapshotStateKt__ProduceStateKt$produceState$3$1 snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$3$1(pVar, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue);
        }
        EffectsKt.LaunchedEffect(obj, obj2, (p) snapshotStateKt__ProduceStateKt$produceState$3$1RememberedValue, composer, (i2 >> 3) & 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> State<T> produceState(T t, Object obj, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928268701, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:107)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(pVar);
        SnapshotStateKt__ProduceStateKt$produceState$2$1 snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$2$1(pVar, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue);
        }
        EffectsKt.LaunchedEffect(obj, (p<? super af, ? super e<? super ab>, ? extends Object>) snapshotStateKt__ProduceStateKt$produceState$2$1RememberedValue, composer, (i2 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> State<T> produceState(T t, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10454275, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ab abVar = ab.f48028a;
        boolean zChangedInstance = composer.changedInstance(pVar);
        SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$1$1(pVar, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue);
        }
        EffectsKt.LaunchedEffect(abVar, (p<? super af, ? super e<? super ab>, ? extends Object>) snapshotStateKt__ProduceStateKt$produceState$1$1RememberedValue, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, Object obj3, p<? super ProduceStateScope<T>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:170)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(pVar);
        SnapshotStateKt__ProduceStateKt$produceState$4$1 snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue = new SnapshotStateKt__ProduceStateKt$produceState$4$1(pVar, mutableState, null);
            composer.updateRememberedValue(snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue);
        }
        EffectsKt.LaunchedEffect(obj, obj2, obj3, (p) snapshotStateKt__ProduceStateKt$produceState$4$1RememberedValue, composer, (i2 >> 3) & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
