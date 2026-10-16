package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateHandle {
    public static final Companion Companion = new Companion(null);
    private SavedStateHandleImpl impl;
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    public SavedStateHandle(Map<String, ? extends Object> map) {
        x.f(map, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(map);
    }

    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        if (this.impl.getMutableFlows().containsKey(str)) {
            throw new IllegalArgumentException(SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(str));
        }
        Map<String, SavingStateLiveData<?>> map = this.liveDatas;
        SavingStateLiveData<?> savingStateLiveData2 = map.get(str);
        if (savingStateLiveData2 == null) {
            if (this.impl.getRegular().containsKey(str)) {
                savingStateLiveData = new SavingStateLiveData<>(this, str, this.impl.getRegular().get(str));
            } else if (z) {
                this.impl.getRegular().put(str, t);
                savingStateLiveData = new SavingStateLiveData<>(this, str, t);
            } else {
                savingStateLiveData = new SavingStateLiveData<>(this, str);
            }
            savingStateLiveData2 = savingStateLiveData;
            map.put(str, savingStateLiveData2);
        }
        return savingStateLiveData2;
    }

    public final void clearSavedStateProvider(String str) {
        x.f(str, "key");
        this.impl.clearSavedStateProvider(str);
    }

    public final boolean contains(String str) {
        x.f(str, "key");
        return this.impl.contains(str);
    }

    public final <T> T get(String str) {
        x.f(str, "key");
        return (T) this.impl.get(str);
    }

    public final <T> MutableLiveData<T> getLiveData(String str) {
        x.f(str, "key");
        return getLiveDataInternal(str, false, null);
    }

    public final <T> bn<T> getMutableStateFlow(String str, T t) {
        x.f(str, "key");
        if (this.liveDatas.containsKey(str)) {
            throw new IllegalArgumentException(SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(str));
        }
        return this.impl.getMutableStateFlow(str, t);
    }

    public final <T> ch<T> getStateFlow(String str, T t) {
        x.f(str, "key");
        boolean zContainsKey = this.impl.getMutableFlows().containsKey(str);
        SavedStateHandleImpl savedStateHandleImpl = this.impl;
        return zContainsKey ? ai.U(savedStateHandleImpl.getMutableStateFlow(str, t)) : savedStateHandleImpl.getStateFlow(str, t);
    }

    public final Set<String> keys() {
        return a.v(this.impl.keys(), this.liveDatas.keySet());
    }

    public final <T> T remove(String str) {
        x.f(str, "key");
        T t = (T) this.impl.remove(str);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(str);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        return t;
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.impl.getSavedStateProvider();
    }

    public final <T> void set(String str, T t) {
        x.f(str, "key");
        if (Companion.validateValue(t)) {
            SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(str);
            SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
            if (savingStateLiveData2 != null) {
                savingStateLiveData2.setValue(t);
            }
            this.impl.set(str, t);
            return;
        }
        x.c(t);
        throw new IllegalArgumentException("Can't put value with type " + t.getClass() + " into saved state");
    }

    public final void setSavedStateProvider(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        x.f(str, "key");
        x.f(savedStateProvider, "provider");
        this.impl.setSavedStateProvider(str, savedStateProvider);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            x.c(classLoader);
            bundle.setClassLoader(classLoader);
            SavedStateReader.m13269constructorimpl(bundle);
            return new SavedStateHandle(SavedStateReader.m13350toMapimpl(bundle));
        }

        public final boolean validateValue(Object obj) {
            return SavedStateHandleImpl_androidKt.isAcceptableType(obj);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            x.f(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            SavedStateHandleImpl savedStateHandleImpl;
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null && (savedStateHandleImpl = savedStateHandle.impl) != null) {
                savedStateHandleImpl.set(this.key, t);
            }
            super.setValue(t);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t) {
            super(t);
            x.f(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }
    }

    public final <T> MutableLiveData<T> getLiveData(String str, T t) {
        x.f(str, "key");
        return getLiveDataInternal(str, true, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandle() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(null, 1, 0 == true ? 1 : 0);
    }
}
