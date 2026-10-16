package androidx.compose.runtime.retain;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.retain.impl.PreconditionsKt;
import h.ab;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RetainedValuesStoreRegistry {
    public static final int $stable = 8;
    private final MutableScatterMap<Object, ManagedRetainedValuesStore> childStores = new MutableScatterMap<>(0, 1, null);
    private boolean isDisposed;

    static final ab LocalRetainedValuesStoreProvider$lambda$0(RetainedValuesStoreRegistry retainedValuesStoreRegistry, Object obj, p pVar, int i2, Composer composer, int i3) {
        retainedValuesStoreRegistry.LocalRetainedValuesStoreProvider(obj, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final boolean dispose$lambda$0(Object obj) {
        return true;
    }

    private final RetainedValuesStore getOrCreateRetainedValuesStoreForChild(Object obj) {
        if (this.isDisposed) {
            PreconditionsKt.throwIllegalStateException("Cannot get a RetainedValuesStore after a RetainedValuesStoreRegistry has been disposed.");
        }
        MutableScatterMap<Object, ManagedRetainedValuesStore> mutableScatterMap = this.childStores;
        ManagedRetainedValuesStore managedRetainedValuesStore = mutableScatterMap.get(obj);
        if (managedRetainedValuesStore == null) {
            managedRetainedValuesStore = new ManagedRetainedValuesStore();
            mutableScatterMap.set(obj, managedRetainedValuesStore);
        }
        return managedRetainedValuesStore;
    }

    public final void LocalRetainedValuesStoreProvider(final Object obj, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1626630244);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(obj) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(this) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1626630244, i3, -1, "androidx.compose.runtime.retain.RetainedValuesStoreRegistry.LocalRetainedValuesStoreProvider (RetainedValuesStoreRegistry.kt:70)");
            }
            LocalRetainedValuesStoreKt.LocalRetainedValuesStoreProvider(getOrCreateRetainedValuesStoreForChild(obj), pVar, composerStartRestartGroup, i3 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.runtime.retain.RetainedValuesStoreRegistry$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return RetainedValuesStoreRegistry.LocalRetainedValuesStoreProvider$lambda$0(this.f$0, obj, pVar, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final void clearChild(Object obj) {
        ManagedRetainedValuesStore managedRetainedValuesStoreRemove = this.childStores.remove(obj);
        if (managedRetainedValuesStoreRemove != null) {
            managedRetainedValuesStoreRemove.dispose();
        }
    }

    public final void clearChildren(l<Object, Boolean> lVar) {
        int i2;
        MutableScatterMap<Object, ManagedRetainedValuesStore> mutableScatterMap = this.childStores;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj = mutableScatterMap.keys[i6];
                        ManagedRetainedValuesStore managedRetainedValuesStore = (ManagedRetainedValuesStore) mutableScatterMap.values[i6];
                        Boolean boolInvoke = lVar.invoke(obj);
                        if (boolInvoke.booleanValue()) {
                            managedRetainedValuesStore.dispose();
                        }
                        if (boolInvoke.booleanValue()) {
                            mutableScatterMap.removeValueAt(i6);
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void dispose() {
        this.isDisposed = true;
        clearChildren(new l() { // from class: androidx.compose.runtime.retain.RetainedValuesStoreRegistry$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        });
    }
}
