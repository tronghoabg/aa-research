package androidx.savedstate.internal;

import android.os.Bundle;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateRegistryImpl {
    private static final Companion Companion = new Companion(null);
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private boolean isAllowingSavingState;
    private boolean isRestored;
    private final MutableScatterMap<String, SavedStateRegistry.SavedStateProvider> keyToProviders;
    private final SynchronizedObject lock;
    private final a<ab> onAttach;
    private final SavedStateRegistryOwner owner;
    private Bundle restoredState;

    public SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, a<ab> aVar) {
        x.f(savedStateRegistryOwner, "owner");
        x.f(aVar, "onAttach");
        this.owner = savedStateRegistryOwner;
        this.onAttach = aVar;
        this.lock = new SynchronizedObject();
        this.keyToProviders = ScatterMapKt.mutableScatterMapOf();
        this.isAllowingSavingState = true;
    }

    static final void performAttach$lambda$2(SavedStateRegistryImpl savedStateRegistryImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        x.f(lifecycleOwner, "<unused var>");
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_START) {
            savedStateRegistryImpl.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            savedStateRegistryImpl.isAllowingSavingState = false;
        }
    }

    public final Bundle consumeRestoredStateForKey(String str) {
        x.f(str, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        SavedStateReader.m13269constructorimpl(bundle);
        Bundle bundleM13326getSavedStateimpl = SavedStateReader.m13270containsimpl(bundle, str) ? SavedStateReader.m13326getSavedStateimpl(bundle, str) : null;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13391removeimpl(bundle, str);
        SavedStateReader.m13269constructorimpl(bundle);
        if (SavedStateReader.m13347isEmptyimpl(bundle)) {
            this.restoredState = null;
        }
        return bundleM13326getSavedStateimpl;
    }

    public final a<ab> getOnAttach$savedstate() {
        return this.onAttach;
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider(String str) {
        SavedStateRegistry.SavedStateProvider savedStateProvider;
        x.f(str, "key");
        synchronized (this.lock) {
            savedStateProvider = (SavedStateRegistry.SavedStateProvider) this.keyToProviders.get(str);
        }
        return savedStateProvider;
    }

    public final boolean isAllowingSavingState$savedstate() {
        return this.isAllowingSavingState;
    }

    public final boolean isRestored() {
        return this.isRestored;
    }

    public final void performAttach() {
        if (this.owner.getLifecycle().getCurrentState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.onAttach.invoke();
        this.owner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistryImpl.performAttach$lambda$2(this.f$0, lifecycleOwner, event);
            }
        });
        this.attached = true;
    }

    public final void performRestore$savedstate(Bundle bundle) {
        if (!this.attached) {
            performAttach();
        }
        if (this.owner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            Lifecycle.State currentState = this.owner.getLifecycle().getCurrentState();
            Objects.toString(currentState);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(currentState)));
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM13326getSavedStateimpl = null;
        if (bundle != null) {
            SavedStateReader.m13269constructorimpl(bundle);
            if (SavedStateReader.m13270containsimpl(bundle, SAVED_COMPONENTS_KEY)) {
                bundleM13326getSavedStateimpl = SavedStateReader.m13326getSavedStateimpl(bundle, SAVED_COMPONENTS_KEY);
            }
        }
        this.restoredState = bundleM13326getSavedStateimpl;
        this.isRestored = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performSave$savedstate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "outBundle"
            h.g.b.x.f(r1, r2)
            java.util.Map r2 = h.a.r.j()
            boolean r3 = r2.isEmpty()
            r4 = 0
            if (r3 == 0) goto L17
            h.k[] r2 = new h.k[r4]
            goto L55
        L17:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r2.size()
            r3.<init>(r5)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L49
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            h.k r7 = new h.k
            r7.<init>(r6, r5)
            r3.add(r7)
            goto L2a
        L49:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            h.k[] r2 = new h.k[r4]
            java.lang.Object[] r2 = r3.toArray(r2)
            h.k[] r2 = (h.k[]) r2
        L55:
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            h.k[] r2 = (h.k[]) r2
            android.os.Bundle r2 = androidx.core.os.BundleKt.bundleOf(r2)
            androidx.savedstate.SavedStateWriter.m13355constructorimpl(r2)
            android.os.Bundle r3 = r0.restoredState
            if (r3 == 0) goto L6a
            androidx.savedstate.SavedStateWriter.m13359putAllimpl(r2, r3)
        L6a:
            androidx.savedstate.internal.SynchronizedObject r3 = r0.lock
            monitor-enter(r3)
            androidx.collection.MutableScatterMap r0 = access$getKeyToProviders$p(r0)     // Catch: java.lang.Throwable -> Ld4
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r5 = r0.keys     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r6 = r0.values     // Catch: java.lang.Throwable -> Ld4
            long[] r0 = r0.metadata     // Catch: java.lang.Throwable -> Ld4
            int r7 = r0.length     // Catch: java.lang.Throwable -> Ld4
            int r7 = r7 + (-2)
            if (r7 < 0) goto Lc1
            r8 = r4
        L7f:
            r9 = r0[r8]     // Catch: java.lang.Throwable -> Ld4
            long r11 = ~r9     // Catch: java.lang.Throwable -> Ld4
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto Lbc
            int r11 = r8 - r7
            r12 = r4
        L92:
            int r13 = ~r11     // Catch: java.lang.Throwable -> Ld4
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto Lba
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto Lb6
            int r13 = r8 << 3
            int r13 = r13 + r12
            r15 = r5[r13]     // Catch: java.lang.Throwable -> Ld4
            r13 = r6[r13]     // Catch: java.lang.Throwable -> Ld4
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r13 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r13     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> Ld4
            android.os.Bundle r13 = r13.saveState()     // Catch: java.lang.Throwable -> Ld4
            androidx.savedstate.SavedStateWriter.m13382putSavedStateimpl(r2, r15, r13)     // Catch: java.lang.Throwable -> Ld4
        Lb6:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            goto L92
        Lba:
            if (r13 != r14) goto Lc1
        Lbc:
            if (r8 == r7) goto Lc1
            int r8 = r8 + 1
            goto L7f
        Lc1:
            monitor-exit(r3)
            androidx.savedstate.SavedStateReader.m13269constructorimpl(r2)
            boolean r0 = androidx.savedstate.SavedStateReader.m13347isEmptyimpl(r2)
            if (r0 != 0) goto Ld3
            androidx.savedstate.SavedStateWriter.m13355constructorimpl(r1)
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            androidx.savedstate.SavedStateWriter.m13382putSavedStateimpl(r1, r0, r2)
        Ld3:
            return
        Ld4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.savedstate.internal.SavedStateRegistryImpl.performSave$savedstate(android.os.Bundle):void");
    }

    public final void registerSavedStateProvider(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        x.f(str, "key");
        x.f(savedStateProvider, "provider");
        synchronized (this.lock) {
            if (this.keyToProviders.contains(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.keyToProviders.set(str, savedStateProvider);
        }
    }

    public final void setAllowingSavingState$savedstate(boolean z) {
        this.isAllowingSavingState = z;
    }

    public final void unregisterSavedStateProvider(String str) {
        x.f(str, "key");
        synchronized (this.lock) {
        }
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, a aVar, int i2, o oVar) {
        this(savedStateRegistryOwner, (i2 & 2) != 0 ? new a() { // from class: androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        } : aVar);
    }
}
