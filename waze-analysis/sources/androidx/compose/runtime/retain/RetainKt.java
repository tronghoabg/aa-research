package androidx.compose.runtime.retain;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RetainKt {
    private static final Object RetainedValuesStoreMissingValue = new Object();

    public static final <T> T retain(int i2, Object[] objArr, a<? extends T> aVar, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2119413254, i3, -1, "androidx.compose.runtime.retain.retain (Retain.kt:209)");
        }
        T t = (T) retainImpl(new RetainKeys(objArr, ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0), i2), aVar, composer, (i3 >> 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    private static final <T> T retainImpl(RetainKeys retainKeys, a<? extends T> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(583113279, i2, -1, "androidx.compose.runtime.retain.retainImpl (Retain.kt:222)");
        }
        final RetainedValuesStore retainedValuesStore = (RetainedValuesStore) composer.consume(LocalRetainedValuesStoreKt.getLocalRetainedValuesStore());
        boolean z = (((i2 & 14) ^ 6) > 4 && composer.changed(retainKeys)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            Object obj = RetainedValuesStoreMissingValue;
            Object objConsumeExitedValueOrDefault = retainedValuesStore.consumeExitedValueOrDefault(retainKeys, obj);
            objRememberedValue = objConsumeExitedValueOrDefault != obj ? new RetainedValueHolder(retainKeys, objConsumeExitedValueOrDefault, retainedValuesStore, false) : new RetainedValueHolder(retainKeys, aVar.invoke(), retainedValuesStore, true);
            composer.updateRememberedValue(objRememberedValue);
        }
        final RetainedValueHolder retainedValueHolder = (RetainedValueHolder) objRememberedValue;
        if (retainedValueHolder.getOwner() != retainedValuesStore) {
            composer.startReplaceGroup(-1614000612);
            boolean zChangedInstance = composer.changedInstance(retainedValueHolder) | composer.changedInstance(retainedValuesStore);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.runtime.retain.RetainKt$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return RetainKt.retainImpl$lambda$1$0(retainedValueHolder, retainedValuesStore);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.SideEffect((a) objRememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1613932381);
            composer.endReplaceGroup();
        }
        T t = (T) retainedValueHolder.getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab retainImpl$lambda$1$0(RetainedValueHolder retainedValueHolder, RetainedValuesStore retainedValuesStore) {
        retainedValueHolder.readoptUnder$runtime_retain(retainedValuesStore);
        return ab.f48028a;
    }

    public static final <T> T retain(int i2, a<? extends T> aVar, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(663053747, i3, -1, "androidx.compose.runtime.retain.retain (Retain.kt:195)");
        }
        T t = (T) retainImpl(new RetainKeys(null, ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0), i2), aVar, composer, i3 & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final /* synthetic */ <T> T retain(a<? extends T> aVar, Composer composer, int i2) {
        x.i();
        return (T) retain(Object.class.getName().hashCode(), aVar, composer, (i2 << 3) & 112);
    }

    public static final /* synthetic */ <T> T retain(Object[] objArr, a<? extends T> aVar, Composer composer, int i2) {
        x.i();
        return (T) retain(Object.class.getName().hashCode(), Arrays.copyOf(objArr, objArr.length), aVar, composer, (i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY);
    }
}
