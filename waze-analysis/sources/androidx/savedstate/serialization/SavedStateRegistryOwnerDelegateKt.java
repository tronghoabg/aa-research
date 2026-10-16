package androidx.savedstate.serialization;

import androidx.savedstate.SavedStateRegistryOwner;
import h.g.a.a;
import h.g.b.x;
import h.i.d;
import kotlinx.b.b;
import kotlinx.b.e.e;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateRegistryOwnerDelegateKt {
    public static final /* synthetic */ d saved(SavedStateRegistryOwner savedStateRegistryOwner, b bVar, String str, SavedStateConfiguration savedStateConfiguration, a aVar) {
        x.f(savedStateRegistryOwner, "<this>");
        x.f(bVar, "serializer");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        return new SavedStateRegistryOwnerDelegate(savedStateRegistryOwner.getSavedStateRegistry(), bVar, str, savedStateConfiguration, aVar);
    }

    public static /* synthetic */ d saved$default(SavedStateRegistryOwner savedStateRegistryOwner, String str, SavedStateConfiguration savedStateConfiguration, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if (1 == (i2 & 1)) {
            str = null;
        }
        x.f(savedStateRegistryOwner, "<this>");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return savedNullable(savedStateRegistryOwner, p.e(serializersModule), str, savedStateConfiguration, aVar);
    }

    public static final <T> d<Object, T> savedNullable(SavedStateRegistryOwner savedStateRegistryOwner, b<T> bVar, String str, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar) {
        x.f(savedStateRegistryOwner, "<this>");
        x.f(bVar, "serializer");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        return new SavedStateRegistryOwnerDelegate(savedStateRegistryOwner.getSavedStateRegistry(), bVar, str, savedStateConfiguration, aVar);
    }

    public static /* synthetic */ d savedNullable$default(SavedStateRegistryOwner savedStateRegistryOwner, String str, SavedStateConfiguration savedStateConfiguration, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if (1 == (i2 & 1)) {
            str = null;
        }
        x.f(savedStateRegistryOwner, "<this>");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return savedNullable(savedStateRegistryOwner, p.e(serializersModule), str, savedStateConfiguration, aVar);
    }

    public static final /* synthetic */ <T> d<Object, T> saved(SavedStateRegistryOwner savedStateRegistryOwner, String str, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar) {
        x.f(savedStateRegistryOwner, "<this>");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return savedNullable(savedStateRegistryOwner, p.e(serializersModule), str, savedStateConfiguration, aVar);
    }

    public static final /* synthetic */ <T> d<Object, T> savedNullable(SavedStateRegistryOwner savedStateRegistryOwner, String str, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar) {
        x.f(savedStateRegistryOwner, "<this>");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return savedNullable(savedStateRegistryOwner, p.e(serializersModule), str, savedStateConfiguration, aVar);
    }

    public static /* synthetic */ d saved$default(SavedStateRegistryOwner savedStateRegistryOwner, b bVar, String str, SavedStateConfiguration savedStateConfiguration, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return saved(savedStateRegistryOwner, bVar, str, savedStateConfiguration, aVar);
    }

    public static /* synthetic */ d savedNullable$default(SavedStateRegistryOwner savedStateRegistryOwner, b bVar, String str, SavedStateConfiguration savedStateConfiguration, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return savedNullable(savedStateRegistryOwner, bVar, str, savedStateConfiguration, aVar);
    }
}
