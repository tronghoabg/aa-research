package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(new p() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda3
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ((SaveableStateHolderImpl) obj2).saveAll();
        }
    }, new l() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaveableStateHolderImpl.Saver$lambda$1((Map) obj);
        }
    });
    private final l<Object, Boolean> canBeSaved;
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final MutableScatterMap<Object, SaveableStateRegistry> registries;
    private final Map<Object, Map<String, List<Object>>> savedStates;

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registries = ScatterMapKt.mutableScatterMapOf();
        this.canBeSaved = new l() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SaveableStateHolderImpl.canBeSaved$lambda$0(this.f$0, obj));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SaveableStateProvider$lambda$0$1$0(final SaveableStateHolderImpl saveableStateHolderImpl, final Object obj, final SaveableStateRegistryWrapper saveableStateRegistryWrapper, DisposableEffectScope disposableEffectScope) {
        if (!saveableStateHolderImpl.registries.contains(obj)) {
            saveableStateHolderImpl.savedStates.remove(obj);
            saveableStateHolderImpl.registries.set(obj, saveableStateRegistryWrapper);
            return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$lambda$0$1$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Object objRemove = this.this$0.registries.remove(obj);
                    SaveableStateRegistryWrapper saveableStateRegistryWrapper2 = saveableStateRegistryWrapper;
                    if (objRemove == saveableStateRegistryWrapper2) {
                        SaveableStateHolderImpl saveableStateHolderImpl2 = this.this$0;
                        saveableStateHolderImpl2.saveTo(saveableStateRegistryWrapper2, saveableStateHolderImpl2.savedStates, obj);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Key " + obj + " was used multiple times ");
    }

    static final ab SaveableStateProvider$lambda$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, p pVar, int i2, Composer composer, int i3) {
        saveableStateHolderImpl.SaveableStateProvider(obj, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final SaveableStateHolderImpl Saver$lambda$1(Map map) {
        return new SaveableStateHolderImpl(map);
    }

    static final boolean canBeSaved$lambda$0(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
        SaveableStateRegistry saveableStateRegistry = saveableStateHolderImpl.parentSaveableStateRegistry;
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> saveAll() {
        /*
            r18 = this;
            r0 = r18
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.runtime.saveable.SaveableStateRegistry> r1 = r0.registries
            androidx.collection.ScatterMap r1 = (androidx.collection.ScatterMap) r1
            java.lang.Object[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> r5 = r0.savedStates
            if (r4 < 0) goto L51
            r6 = 0
            r7 = r6
        L15:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4c
            int r10 = r7 - r4
            r11 = r6
        L28:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L4a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L46
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r2[r12]
            r12 = r3[r12]
            androidx.compose.runtime.saveable.SaveableStateRegistry r12 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r12
            r0.saveTo(r12, r5, r14)
        L46:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L28
        L4a:
            if (r12 != r13) goto L51
        L4c:
            if (r7 == r4) goto L51
            int r7 = r7 + 1
            goto L15
        L51:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L59
            r0 = 0
            return r0
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateHolderImpl.saveAll():java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTo(SaveableStateRegistry saveableStateRegistry, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> mapPerformSave = saveableStateRegistry.performSave();
        if (mapPerformSave.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapPerformSave);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(533563200);
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
                ComposerKt.traceEventStart(533563200, i3, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            composerStartRestartGroup.startReusableGroup(207, obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                if (!this.canBeSaved.invoke(obj).booleanValue()) {
                    throw new IllegalArgumentException("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                }
                SaveableStateRegistryWrapper saveableStateRegistryWrapper = new SaveableStateRegistryWrapper(SaveableStateRegistryKt.SaveableStateRegistry(this.savedStates.get(obj), this.canBeSaved));
                composerStartRestartGroup.updateRememberedValue(saveableStateRegistryWrapper);
                objRememberedValue = saveableStateRegistryWrapper;
            }
            final SaveableStateRegistryWrapper saveableStateRegistryWrapper2 = (SaveableStateRegistryWrapper) objRememberedValue;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateRegistryWrapper2), LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner().provides(saveableStateRegistryWrapper2)}, pVar, composerStartRestartGroup, (i3 & 112) | ProvidedValue.$stable);
            ab abVar = ab.f48028a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(obj) | composerStartRestartGroup.changedInstance(saveableStateRegistryWrapper2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return SaveableStateHolderImpl.SaveableStateProvider$lambda$0$1$0(this.f$0, obj, saveableStateRegistryWrapper2, (DisposableEffectScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(abVar, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReusableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return SaveableStateHolderImpl.SaveableStateProvider$lambda$1(this.f$0, obj, pVar, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        if (this.registries.remove(obj) == null) {
            this.savedStates.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SaveableStateHolderImpl(LinkedHashMap linkedHashMap, int i2, o oVar) {
        this((i2 & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
    }
}
