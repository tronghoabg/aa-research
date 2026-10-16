package androidx.savedstate;

import android.os.Bundle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.SavedStateDecoderKt;
import androidx.savedstate.serialization.SavedStateEncoderKt;
import h.g.a.l;
import h.g.b.x;
import kotlinx.b.b;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class SavedStateKt__SavedStateKt {
    /* renamed from: getKotlinSerializable-FwvpL2Y, reason: not valid java name */
    public static final <T> T m13258getKotlinSerializableFwvpL2Y(Bundle bundle, b<T> bVar, String str, SavedStateConfiguration savedStateConfiguration) {
        x.f(bundle, "$this$getKotlinSerializable");
        x.f(bVar, "deserializer");
        x.f(str, "key");
        x.f(savedStateConfiguration, "configuration");
        return (T) SavedStateDecoderKt.decodeFromSavedStateNullable(bVar, SavedStateReader.m13326getSavedStateimpl(bundle, str), savedStateConfiguration);
    }

    /* renamed from: getKotlinSerializable-FwvpL2Y$default, reason: not valid java name */
    public static /* synthetic */ Object m13259getKotlinSerializableFwvpL2Y$default(Bundle bundle, b bVar, String str, SavedStateConfiguration savedStateConfiguration, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return SavedStateKt.m13250getKotlinSerializableFwvpL2Y(bundle, bVar, str, savedStateConfiguration);
    }

    /* renamed from: getKotlinSerializable-MNCnQt8, reason: not valid java name */
    public static final /* synthetic */ <T> T m13260getKotlinSerializableMNCnQt8(Bundle bundle, String str, SavedStateConfiguration savedStateConfiguration) {
        x.f(bundle, "$this$getKotlinSerializable");
        x.f(str, "key");
        x.f(savedStateConfiguration, "configuration");
        x.i();
        return (T) SavedStateKt.m13250getKotlinSerializableFwvpL2Y(bundle, p.d(), str, savedStateConfiguration);
    }

    /* renamed from: getKotlinSerializable-MNCnQt8$default, reason: not valid java name */
    public static /* synthetic */ Object m13261getKotlinSerializableMNCnQt8$default(Bundle bundle, String str, SavedStateConfiguration savedStateConfiguration, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        x.f(bundle, "$this$getKotlinSerializable");
        x.f(str, "key");
        x.f(savedStateConfiguration, "configuration");
        x.i();
        return SavedStateKt.m13250getKotlinSerializableFwvpL2Y(bundle, p.d(), str, savedStateConfiguration);
    }

    /* renamed from: putKotlinSerializable-KI3wEYg, reason: not valid java name */
    public static final /* synthetic */ <T> void m13262putKotlinSerializableKI3wEYg(Bundle bundle, String str, T t, SavedStateConfiguration savedStateConfiguration) {
        x.f(bundle, "$this$putKotlinSerializable");
        x.f(str, "key");
        x.f(savedStateConfiguration, "configuration");
        x.i();
        SavedStateKt.m13256putKotlinSerializablexOxc9nE(bundle, p.d(), str, t, savedStateConfiguration);
    }

    /* renamed from: putKotlinSerializable-KI3wEYg$default, reason: not valid java name */
    public static /* synthetic */ void m13263putKotlinSerializableKI3wEYg$default(Bundle bundle, String str, Object obj, SavedStateConfiguration savedStateConfiguration, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        x.f(bundle, "$this$putKotlinSerializable");
        x.f(str, "key");
        x.f(savedStateConfiguration, "configuration");
        x.i();
        SavedStateKt.m13256putKotlinSerializablexOxc9nE(bundle, p.d(), str, obj, savedStateConfiguration);
    }

    /* renamed from: putKotlinSerializable-xOxc9nE, reason: not valid java name */
    public static final <T> void m13264putKotlinSerializablexOxc9nE(Bundle bundle, b<T> bVar, String str, T t, SavedStateConfiguration savedStateConfiguration) {
        x.f(bundle, "$this$putKotlinSerializable");
        x.f(bVar, "serializer");
        x.f(str, "key");
        x.f(savedStateConfiguration, "configuration");
        SavedStateWriter.m13382putSavedStateimpl(bundle, str, SavedStateEncoderKt.encodeToSavedStateNullable(bVar, t, savedStateConfiguration));
    }

    /* renamed from: putKotlinSerializable-xOxc9nE$default, reason: not valid java name */
    public static /* synthetic */ void m13265putKotlinSerializablexOxc9nE$default(Bundle bundle, b bVar, String str, Object obj, SavedStateConfiguration savedStateConfiguration, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        SavedStateKt.m13256putKotlinSerializablexOxc9nE(bundle, bVar, str, obj, savedStateConfiguration);
    }

    public static final <T> T read(Bundle bundle, l<? super SavedStateReader, ? extends T> lVar) {
        x.f(bundle, "<this>");
        x.f(lVar, "block");
        SavedStateReader.m13269constructorimpl(bundle);
        return lVar.invoke(SavedStateReader.m13268boximpl(bundle));
    }

    public static final <T> T write(Bundle bundle, l<? super SavedStateWriter, ? extends T> lVar) {
        x.f(bundle, "<this>");
        x.f(lVar, "block");
        SavedStateWriter.m13355constructorimpl(bundle);
        return lVar.invoke(SavedStateWriter.m13353boximpl(bundle));
    }
}
