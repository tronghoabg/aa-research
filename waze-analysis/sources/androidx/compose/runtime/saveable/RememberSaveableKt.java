package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.m.k;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    public static final String generateCannotBeSavedErrorMessage(Object obj) {
        Objects.toString(obj);
        return String.valueOf(obj).concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    public static final <T> Saver<MutableState<T>, MutableState> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        x.d(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new p() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return RememberSaveableKt.mutableStateSaver$lambda$0$0(saver, (SaverScope) obj, (MutableState) obj2);
            }
        }, new l() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RememberSaveableKt.mutableStateSaver$lambda$0$1(saver, (MutableState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState mutableStateSaver$lambda$0$0(Saver saver, SaverScope saverScope, MutableState mutableState) {
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        Object objSave = saver.save(saverScope, snapshotMutableState.getValue());
        if (objSave == null) {
            return null;
        }
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        x.d(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return SnapshotStateKt.mutableStateOf(objSave, policy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState mutableStateSaver$lambda$0$1(Saver saver, MutableState mutableState) {
        Object objRestore;
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        if (snapshotMutableState.getValue() != 0) {
            T value = snapshotMutableState.getValue();
            if (value == 0) {
                x.g();
            }
            objRestore = saver.restore(value);
        } else {
            objRestore = null;
        }
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        x.d(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
        return SnapshotStateKt.mutableStateOf(objRestore, policy);
    }

    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m7616rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, a<? extends T> aVar, Composer composer, int i2, int i3) {
        Object[] objArr2;
        final T t;
        Object objConsumeRestored;
        if ((i3 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        final Saver<T, ? extends Object> saver2 = saver;
        int i4 = i3 & 4;
        T tInvoke = null;
        if (i4 != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            int i5 = MaxSupportedRadix;
            k.y(i5);
            str = Long.toString(currentCompositeKeyHashCode, i5);
            x.e(str, "toString(...)");
        }
        final String str3 = str;
        x.d(saver2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            if (saveableStateRegistry != null && (objConsumeRestored = saveableStateRegistry.consumeRestored(str3)) != null) {
                tInvoke = saver2.restore(objConsumeRestored);
            }
            if (tInvoke == null) {
                tInvoke = aVar.invoke();
            }
            objArr2 = objArr;
            Object saveableHolder = new SaveableHolder(saver2, saveableStateRegistry, str3, tInvoke, objArr2);
            composer.updateRememberedValue(saveableHolder);
            objRememberedValue = saveableHolder;
        } else {
            objArr2 = objArr;
        }
        final SaveableHolder saveableHolder2 = (SaveableHolder) objRememberedValue;
        Object valueIfInputsDidntChange = saveableHolder2.getValueIfInputsDidntChange(objArr2);
        if (valueIfInputsDidntChange == null) {
            valueIfInputsDidntChange = aVar.invoke();
        }
        boolean zChangedInstance = composer.changedInstance(saveableHolder2);
        boolean z = true;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changedInstance(saver2)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean zChangedInstance2 = zChangedInstance | z | composer.changedInstance(saveableStateRegistry) | composer.changed(str3) | composer.changedInstance(valueIfInputsDidntChange) | composer.changedInstance(objArr2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            final Object[] objArr3 = objArr2;
            t = (T) valueIfInputsDidntChange;
            Object obj = new a() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return RememberSaveableKt.rememberSaveable$lambda$1$0(saveableHolder2, saver2, saveableStateRegistry, str3, t, objArr3);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue2 = obj;
        } else {
            t = (T) valueIfInputsDidntChange;
        }
        EffectsKt.SideEffect((a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberSaveable$lambda$1$0(SaveableHolder saveableHolder, Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        saveableHolder.update(saver, saveableStateRegistry, str, obj, objArr);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String strGenerateCannotBeSavedErrorMessage;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                strGenerateCannotBeSavedErrorMessage = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strGenerateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strGenerateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(strGenerateCannotBeSavedErrorMessage);
    }

    public static final <T> MutableState<T> rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, a<? extends MutableState<T>> aVar, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:243)");
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        MutableState<T> mutableState = (MutableState) m7616rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str, (a) aVar, composer, i2 & 8064, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> MutableState<T> rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, a<? extends MutableState<T>> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-746165481, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:203)");
        }
        MutableState<T> mutableState = (MutableState) m7616rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), (String) null, (a) aVar, composer, ((i2 << 3) & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m7615rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, a<? extends T> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(674689872, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:175)");
        }
        T t = (T) m7616rememberSaveable(Arrays.copyOf(objArr, objArr.length), (Saver) saver, (String) null, (a) aVar, composer, (i2 & 112) | 384 | ((i2 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final <T> T rememberSaveable(Object[] objArr, a<? extends T> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1564532345, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        T t = (T) m7616rememberSaveable(Arrays.copyOf(objArr, objArr.length), SaverKt.autoSaver(), (String) null, (a) aVar, composer, ((i2 << 6) & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }
}
