package androidx.lifecycle.serialization;

import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import h.g.a.a;
import h.g.b.x;
import h.i.d;
import kotlinx.b.b;
import kotlinx.b.e.e;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateHandleDelegateKt {
    public static final /* synthetic */ d saved(SavedStateHandle savedStateHandle, b bVar, String str, SavedStateConfiguration savedStateConfiguration, a aVar) {
        x.f(savedStateHandle, "<this>");
        x.f(bVar, "serializer");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        return new SavedStateHandleDelegate(savedStateHandle, bVar, str, savedStateConfiguration, aVar);
    }

    public static /* synthetic */ d saved$default(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration savedStateConfiguration, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if (1 == (i2 & 1)) {
            str = null;
        }
        x.f(savedStateHandle, "<this>");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return savedNullable(savedStateHandle, p.e(serializersModule), str, savedStateConfiguration, aVar);
    }

    public static final <T> d<Object, T> savedNullable(SavedStateHandle savedStateHandle, b<T> bVar, String str, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar) {
        x.f(savedStateHandle, "<this>");
        x.f(bVar, "serializer");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        return new SavedStateHandleDelegate(savedStateHandle, bVar, str, savedStateConfiguration, aVar);
    }

    public static /* synthetic */ d savedNullable$default(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration savedStateConfiguration, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if (1 == (i2 & 1)) {
            str = null;
        }
        x.f(savedStateHandle, "<this>");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return savedNullable(savedStateHandle, p.e(serializersModule), str, savedStateConfiguration, aVar);
    }

    public static final /* synthetic */ <T> d<Object, T> saved(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar) {
        x.f(savedStateHandle, "<this>");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return savedNullable(savedStateHandle, p.e(serializersModule), str, savedStateConfiguration, aVar);
    }

    public static final /* synthetic */ <T> d<Object, T> savedNullable(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar) {
        x.f(savedStateHandle, "<this>");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return savedNullable(savedStateHandle, p.e(serializersModule), str, savedStateConfiguration, aVar);
    }

    public static /* synthetic */ d saved$default(SavedStateHandle savedStateHandle, b bVar, String str, SavedStateConfiguration savedStateConfiguration, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return saved(savedStateHandle, bVar, str, savedStateConfiguration, aVar);
    }

    public static /* synthetic */ d savedNullable$default(SavedStateHandle savedStateHandle, b bVar, String str, SavedStateConfiguration savedStateConfiguration, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return savedNullable(savedStateHandle, bVar, str, savedStateConfiguration, aVar);
    }
}
