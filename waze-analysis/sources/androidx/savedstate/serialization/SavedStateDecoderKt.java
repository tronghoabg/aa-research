package androidx.savedstate.serialization;

import android.os.Bundle;
import h.g.b.x;
import kotlinx.b.a;
import kotlinx.b.e.e;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateDecoderKt {
    public static final /* synthetic */ <T> T decodeFromSavedState(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        x.f(bundle, "savedState");
        x.f(savedStateConfiguration, "configuration");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return (T) decodeFromSavedStateNullable(p.e(serializersModule), bundle, savedStateConfiguration);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        x.f(bundle, "savedState");
        x.f(savedStateConfiguration, "configuration");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return decodeFromSavedStateNullable(p.e(serializersModule), bundle, savedStateConfiguration);
    }

    public static final /* synthetic */ <T> T decodeFromSavedStateNullable(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        x.f(bundle, "savedState");
        x.f(savedStateConfiguration, "configuration");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return (T) decodeFromSavedStateNullable(p.e(serializersModule), bundle, savedStateConfiguration);
    }

    public static /* synthetic */ Object decodeFromSavedStateNullable$default(Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        x.f(bundle, "savedState");
        x.f(savedStateConfiguration, "configuration");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return decodeFromSavedStateNullable(p.e(serializersModule), bundle, savedStateConfiguration);
    }

    public static final /* synthetic */ Object decodeFromSavedState(a aVar, Bundle bundle) {
        x.f(aVar, "deserializer");
        x.f(bundle, "savedState");
        return decodeFromSavedState$default(aVar, bundle, null, 4, null);
    }

    public static final <T> T decodeFromSavedStateNullable(a<? extends T> aVar, Bundle bundle) {
        x.f(aVar, "deserializer");
        x.f(bundle, "savedState");
        return (T) decodeFromSavedStateNullable$default(aVar, bundle, null, 4, null);
    }

    public static final /* synthetic */ Object decodeFromSavedState(a aVar, Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        x.f(aVar, "deserializer");
        x.f(bundle, "savedState");
        x.f(savedStateConfiguration, "configuration");
        return new SavedStateDecoder(bundle, savedStateConfiguration).decodeSerializableValue(aVar);
    }

    public static final <T> T decodeFromSavedStateNullable(a<? extends T> aVar, Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        x.f(aVar, "deserializer");
        x.f(bundle, "savedState");
        x.f(savedStateConfiguration, "configuration");
        return (T) new SavedStateDecoder(bundle, savedStateConfiguration).decodeSerializableValue(aVar);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(a aVar, Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedState(aVar, bundle, savedStateConfiguration);
    }

    public static /* synthetic */ Object decodeFromSavedStateNullable$default(a aVar, Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedStateNullable(aVar, bundle, savedStateConfiguration);
    }
}
