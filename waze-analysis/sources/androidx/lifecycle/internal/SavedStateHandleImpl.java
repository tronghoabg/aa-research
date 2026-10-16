package androidx.lifecycle.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import e.c.d.a;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateHandleImpl {
    private final Map<String, bn<Object>> flows;
    private final Map<String, bn<Object>> mutableFlows;
    private final Map<String, SavedStateRegistry.SavedStateProvider> providers;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    public SavedStateHandleImpl(Map<String, ? extends Object> map) {
        x.f(map, "initialState");
        this.regular = r.t(map);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.internal.SavedStateHandleImpl$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleImpl.savedStateProvider$lambda$0(this.f$0);
            }
        };
    }

    static final Bundle savedStateProvider$lambda$0(SavedStateHandleImpl savedStateHandleImpl) {
        k[] kVarArr;
        for (Map.Entry entry : r.r(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((String) entry.getKey(), ((bn) entry.getValue()).d());
        }
        for (Map.Entry entry2 : r.r(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.set((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
        }
        Map<String, Object> map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(new k(entry3.getKey(), entry3.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        return bundleBundleOf;
    }

    public final void clearSavedStateProvider(String str) {
        x.f(str, "key");
        this.providers.remove(str);
    }

    public final boolean contains(String str) {
        x.f(str, "key");
        return this.regular.containsKey(str);
    }

    public final <T> T get(String str) {
        T t;
        x.f(str, "key");
        try {
            bn<Object> bnVar = this.mutableFlows.get(str);
            if (bnVar != null && (t = (T) bnVar.d()) != null) {
                return t;
            }
            return (T) this.regular.get(str);
        } catch (ClassCastException unused) {
            this.remove(str);
            return null;
        }
    }

    public final Map<String, bn<Object>> getMutableFlows() {
        return this.mutableFlows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> bn<T> getMutableStateFlow(String str, T t) {
        x.f(str, "key");
        Map<String, bn<Object>> map = this.mutableFlows;
        Object objB = map.get(str);
        if (objB == null) {
            if (!this.regular.containsKey(str)) {
                this.regular.put(str, t);
            }
            objB = ck.b(this.regular.get(str));
            map.put(str, objB);
        }
        return (bn) objB;
    }

    public final Map<String, Object> getRegular() {
        return this.regular;
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> ch<T> getStateFlow(String str, T t) {
        x.f(str, "key");
        Map<String, bn<Object>> map = this.flows;
        bn<Object> bnVarB = map.get(str);
        if (bnVarB == null) {
            if (!this.regular.containsKey(str)) {
                this.regular.put(str, t);
            }
            bnVarB = ck.b(this.regular.get(str));
            map.put(str, bnVarB);
        }
        return ai.U(bnVarB);
    }

    public final Set<String> keys() {
        return a.v(this.regular.keySet(), this.providers.keySet());
    }

    public final <T> T remove(String str) {
        x.f(str, "key");
        Map<String, bn<Object>> map = this.flows;
        T t = (T) this.regular.remove(str);
        map.remove(str);
        this.mutableFlows.remove(str);
        return t;
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> void set(String str, T t) {
        x.f(str, "key");
        this.regular.put(str, t);
        bn<Object> bnVar = this.flows.get(str);
        if (bnVar != null) {
            bnVar.e(t);
        }
        bn<Object> bnVar2 = this.mutableFlows.get(str);
        if (bnVar2 != null) {
            bnVar2.e(t);
        }
    }

    public final void setSavedStateProvider(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        x.f(str, "key");
        x.f(savedStateProvider, "provider");
        this.providers.put(str, savedStateProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i2, o oVar) {
        this((i2 & 1) != 0 ? r.j() : map);
    }
}
