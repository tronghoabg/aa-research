package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.serialization.SerializableSaverKt;
import androidx.savedstate.serialization.SavedStateConfiguration;
import h.g.a.a;
import h.g.b.x;
import java.util.Arrays;
import kotlinx.b.b;
import kotlinx.b.e.e;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RememberSerializableKt {
    public static final <T> MutableState<T> rememberSerializable(Object[] objArr, b<T> bVar, SavedStateConfiguration savedStateConfiguration, a<? extends MutableState<T>> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1248826527, i2, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:163)");
        }
        MutableState<T> mutableState = (MutableState) RememberSaveableKt.m7616rememberSaveable(Arrays.copyOf(objArr, objArr.length), RememberSaveableKt.mutableStateSaver(SerializableSaverKt.serializableSaver(bVar, savedStateConfiguration)), (String) null, (a) aVar, composer, (i2 & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    /* renamed from: rememberSerializable, reason: collision with other method in class */
    public static final /* synthetic */ <T> T m7617rememberSerializable(Object[] objArr, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        SavedStateConfiguration savedStateConfiguration2 = savedStateConfiguration;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        e serializersModule = savedStateConfiguration2.getSerializersModule();
        x.i();
        return (T) m7618rememberSerializable(objArrCopyOf, p.e(serializersModule), savedStateConfiguration2, (a) aVar, composer, (i2 << 3) & 8064, 0);
    }

    public static final /* synthetic */ <T> MutableState<T> rememberSerializable(Object[] objArr, SavedStateConfiguration savedStateConfiguration, a<? extends MutableState<T>> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        SavedStateConfiguration savedStateConfiguration2 = savedStateConfiguration;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        e serializersModule = savedStateConfiguration2.getSerializersModule();
        x.i();
        return rememberSerializable(objArrCopyOf, p.e(serializersModule), savedStateConfiguration2, (a) aVar, composer, (i2 << 3) & 8064, 0);
    }

    /* renamed from: rememberSerializable, reason: collision with other method in class */
    public static final <T> T m7618rememberSerializable(Object[] objArr, b<T> bVar, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1261607160, i2, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:93)");
        }
        T t = (T) RememberSaveableKt.m7616rememberSaveable(Arrays.copyOf(objArr, objArr.length), SerializableSaverKt.serializableSaver(bVar, savedStateConfiguration), (String) null, (a) aVar, composer, (i2 & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }
}
