package androidx.savedstate;

import android.os.Bundle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import h.ab;
import h.g.a.l;
import java.util.Map;
import kotlinx.b.b;

/* loaded from: classes4.dex */
public final class SavedStateKt {
    /* renamed from: getKotlinSerializable-FwvpL2Y, reason: not valid java name */
    public static final <T> T m13250getKotlinSerializableFwvpL2Y(Bundle bundle, b<T> bVar, String str, SavedStateConfiguration savedStateConfiguration) {
        return (T) SavedStateKt__SavedStateKt.m13258getKotlinSerializableFwvpL2Y(bundle, bVar, str, savedStateConfiguration);
    }

    /* renamed from: getKotlinSerializable-MNCnQt8, reason: not valid java name */
    public static final /* synthetic */ <T> T m13252getKotlinSerializableMNCnQt8(Bundle bundle, String str, SavedStateConfiguration savedStateConfiguration) {
        return (T) SavedStateKt__SavedStateKt.m13260getKotlinSerializableMNCnQt8(bundle, str, savedStateConfiguration);
    }

    /* renamed from: putKotlinSerializable-xOxc9nE, reason: not valid java name */
    public static final <T> void m13256putKotlinSerializablexOxc9nE(Bundle bundle, b<T> bVar, String str, T t, SavedStateConfiguration savedStateConfiguration) {
        SavedStateKt__SavedStateKt.m13264putKotlinSerializablexOxc9nE(bundle, bVar, str, t, savedStateConfiguration);
    }

    public static final <T> T read(Bundle bundle, l<? super SavedStateReader, ? extends T> lVar) {
        return (T) SavedStateKt__SavedStateKt.read(bundle, lVar);
    }

    public static final Bundle savedState(Bundle bundle, l<? super SavedStateWriter, ab> lVar) {
        return SavedStateKt__SavedState_androidKt.savedState(bundle, lVar);
    }

    public static final <T> T write(Bundle bundle, l<? super SavedStateWriter, ? extends T> lVar) {
        return (T) SavedStateKt__SavedStateKt.write(bundle, lVar);
    }

    public static final Bundle savedState(Map<String, ? extends Object> map, l<? super SavedStateWriter, ab> lVar) {
        return SavedStateKt__SavedState_androidKt.savedState(map, lVar);
    }
}
