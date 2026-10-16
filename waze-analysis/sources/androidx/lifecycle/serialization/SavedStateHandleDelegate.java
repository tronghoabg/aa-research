package androidx.lifecycle.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.internal.CanonicalName_jvmKt;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.SavedStateDecoderKt;
import androidx.savedstate.serialization.SavedStateEncoderKt;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.i.d;
import h.k;
import h.l.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlinx.b.b;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SavedStateHandleDelegate<T> implements SavedStateRegistry.SavedStateProvider, d {
    private Object cachedValue;
    private final SavedStateConfiguration configuration;
    private final a<T> init;
    private final String key;
    private final SavedStateHandle savedStateHandle;
    private final b<T> serializer;

    /* compiled from: WazeSource */
    final class UNINITIALIZED {
        public static final UNINITIALIZED INSTANCE = new UNINITIALIZED();

        private UNINITIALIZED() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleDelegate(SavedStateHandle savedStateHandle, b<T> bVar, String str, SavedStateConfiguration savedStateConfiguration, a<? extends T> aVar) {
        x.f(savedStateHandle, "savedStateHandle");
        x.f(bVar, "serializer");
        x.f(savedStateConfiguration, "configuration");
        x.f(aVar, "init");
        this.savedStateHandle = savedStateHandle;
        this.serializer = bVar;
        this.key = str;
        this.configuration = savedStateConfiguration;
        this.init = aVar;
        this.cachedValue = UNINITIALIZED.INSTANCE;
    }

    private final String getQualifiedKey(Object obj, r<?> rVar) {
        String strConcat;
        String str = this.key;
        if (str != null) {
            return str;
        }
        if (obj != null) {
            int i2 = ar.f48106a;
            strConcat = String.valueOf(CanonicalName_jvmKt.getCanonicalName(new m(obj.getClass()))).concat(".");
        } else {
            strConcat = "";
        }
        return strConcat.concat(String.valueOf(rVar.getName()));
    }

    private final T loadInitialValue(String str) {
        Bundle bundle = (Bundle) this.savedStateHandle.get(str);
        if (bundle == null) {
            return this.init.invoke();
        }
        b<T> bVar = this.serializer;
        x.d(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<{T of androidx.lifecycle.serialization.SavedStateHandleDelegate & Any}>");
        return (T) SavedStateDecoderKt.decodeFromSavedStateNullable(bVar, bundle, this.configuration);
    }

    @Override // h.i.d, h.i.c
    public T getValue(Object obj, r<?> rVar) {
        x.f(rVar, "property");
        if (x.n(this.cachedValue, UNINITIALIZED.INSTANCE)) {
            String qualifiedKey = getQualifiedKey(obj, rVar);
            this.savedStateHandle.setSavedStateProvider(qualifiedKey, this);
            this.cachedValue = loadInitialValue(qualifiedKey);
        }
        return (T) this.cachedValue;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle saveState() {
        k[] kVarArr;
        if (!x.n(this.cachedValue, UNINITIALIZED.INSTANCE)) {
            Object obj = this.cachedValue;
            return SavedStateEncoderKt.encodeToSavedStateNullable(this.serializer, obj, this.configuration);
        }
        Map mapJ = h.a.r.j();
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
        return bundleBundleOf;
    }

    @Override // h.i.d
    public void setValue(Object obj, r<?> rVar, T t) {
        x.f(rVar, "property");
        if (x.n(this.cachedValue, UNINITIALIZED.INSTANCE)) {
            this.savedStateHandle.setSavedStateProvider(getQualifiedKey(obj, rVar), this);
        }
        this.cachedValue = t;
    }
}
