package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlinx.b.e.e;
import kotlinx.b.l;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateEncoderKt {
    public static final /* synthetic */ Bundle encodeToSavedState(l lVar, Object obj, SavedStateConfiguration savedStateConfiguration) {
        k[] kVarArr;
        x.f(lVar, "serializer");
        x.f(obj, "value");
        x.f(savedStateConfiguration, "configuration");
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        new SavedStateEncoder(bundleBundleOf, savedStateConfiguration).encodeSerializableValue(lVar, obj);
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(Object obj, SavedStateConfiguration savedStateConfiguration, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        x.f(obj, "value");
        x.f(savedStateConfiguration, "configuration");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return encodeToSavedStateNullable(p.e(serializersModule), obj, savedStateConfiguration);
    }

    public static final <T> Bundle encodeToSavedStateNullable(l<? super T> lVar, T t, SavedStateConfiguration savedStateConfiguration) {
        k[] kVarArr;
        x.f(lVar, "serializer");
        x.f(savedStateConfiguration, "configuration");
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        new SavedStateEncoder(bundleBundleOf, savedStateConfiguration).encodeSerializableValue(lVar, t);
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle encodeToSavedStateNullable$default(Object obj, SavedStateConfiguration savedStateConfiguration, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        x.f(savedStateConfiguration, "configuration");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return encodeToSavedStateNullable(p.e(serializersModule), obj, savedStateConfiguration);
    }

    public static /* synthetic */ Bundle encodeToSavedStateNullable$default(l lVar, Object obj, SavedStateConfiguration savedStateConfiguration, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedStateNullable(lVar, obj, savedStateConfiguration);
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(l lVar, Object obj, SavedStateConfiguration savedStateConfiguration, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedState(lVar, obj, savedStateConfiguration);
    }

    public static final /* synthetic */ <T> Bundle encodeToSavedStateNullable(T t, SavedStateConfiguration savedStateConfiguration) {
        x.f(savedStateConfiguration, "configuration");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return encodeToSavedStateNullable(p.e(serializersModule), t, savedStateConfiguration);
    }

    public static final <T> Bundle encodeToSavedStateNullable(l<? super T> lVar, T t) {
        x.f(lVar, "serializer");
        return encodeToSavedStateNullable$default(lVar, t, null, 4, null);
    }

    public static final /* synthetic */ <T> Bundle encodeToSavedState(T t, SavedStateConfiguration savedStateConfiguration) {
        x.f(t, "value");
        x.f(savedStateConfiguration, "configuration");
        e serializersModule = savedStateConfiguration.getSerializersModule();
        x.i();
        return encodeToSavedStateNullable(p.e(serializersModule), t, savedStateConfiguration);
    }

    public static final /* synthetic */ Bundle encodeToSavedState(l lVar, Object obj) {
        x.f(lVar, "serializer");
        x.f(obj, "value");
        return encodeToSavedState$default(lVar, obj, null, 4, null);
    }
}
