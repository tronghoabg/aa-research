package androidx.compose.runtime.saveable.serialization;

import android.os.Bundle;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.SavedStateDecoderKt;
import androidx.savedstate.serialization.SavedStateEncoderKt;
import h.g.a.l;
import h.g.b.x;
import kotlinx.b.b;
import kotlinx.b.e.e;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SerializableSaverKt {
    public static final /* synthetic */ <Serializable> Saver<Serializable, Bundle> serializableSaver(SavedStateConfiguration savedStateConfiguration) {
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return serializableSaver(p.e(serializersModule), savedStateConfiguration);
    }

    public static /* synthetic */ Saver serializableSaver$default(SavedStateConfiguration savedStateConfiguration, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return serializableSaver(p.e(serializersModule), savedStateConfiguration);
    }

    public static final <Serializable> Saver<Serializable, Bundle> serializableSaver(final b<Serializable> bVar, final SavedStateConfiguration savedStateConfiguration) {
        return SaverKt.Saver(new h.g.a.p() { // from class: androidx.compose.runtime.saveable.serialization.SerializableSaverKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return SavedStateEncoderKt.encodeToSavedState(bVar, obj2, savedStateConfiguration);
            }
        }, new l() { // from class: androidx.compose.runtime.saveable.serialization.SerializableSaverKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SavedStateDecoderKt.decodeFromSavedState(bVar, (Bundle) obj, savedStateConfiguration);
            }
        });
    }

    public static /* synthetic */ Saver serializableSaver$default(b bVar, SavedStateConfiguration savedStateConfiguration, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return serializableSaver(bVar, savedStateConfiguration);
    }
}
