package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private final MutableScatterSet<Object> previouslyComposedKeys;
    private final SaveableStateHolder wrappedHolder;
    private final SaveableStateRegistry wrappedRegistry;

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        this.wrappedRegistry = saveableStateRegistry;
        this.wrappedHolder = saveableStateHolder;
        this.previouslyComposedKeys = ScatterSetKt.mutableScatterSetOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SaveableStateProvider$lambda$0$0(final LazySaveableStateHolder lazySaveableStateHolder, final Object obj, DisposableEffectScope disposableEffectScope) {
        lazySaveableStateHolder.previouslyComposedKeys.minusAssign((MutableScatterSet<Object>) obj);
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.this$0.previouslyComposedKeys.plusAssign((MutableScatterSet) obj);
            }
        };
    }

    static final ab SaveableStateProvider$lambda$1(LazySaveableStateHolder lazySaveableStateHolder, Object obj, p pVar, int i2, Composer composer, int i3) {
        lazySaveableStateHolder.SaveableStateProvider(obj, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final boolean _init_$lambda$0(SaveableStateRegistry saveableStateRegistry, Object obj) {
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-858296452);
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
                ComposerKt.traceEventStart(-858296452, i3, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            int i5 = i3 & 14;
            this.wrappedHolder.SaveableStateProvider(obj, pVar, composerStartRestartGroup, i3 & 126);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return LazySaveableStateHolder.SaveableStateProvider$lambda$0$0(this.f$0, obj, (DisposableEffectScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(obj, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, i5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return LazySaveableStateHolder.SaveableStateProvider$lambda$1(this.f$0, obj, pVar, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.wrappedRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.wrappedRegistry.consumeRestored(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        /*
            r15 = this;
            androidx.collection.MutableScatterSet<java.lang.Object> r0 = r15.previouslyComposedKeys
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            java.lang.Object[] r1 = r0.elements
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L49
            r3 = 0
            r4 = r3
        Lf:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L44
            int r7 = r4 - r2
            r8 = r3
        L22:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L42
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L3e
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            androidx.compose.runtime.saveable.SaveableStateHolder r11 = r15.wrappedHolder
            r11.removeState(r9)
        L3e:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L22
        L42:
            if (r9 != r10) goto L49
        L44:
            if (r4 == r2) goto L49
            int r4 = r4 + 1
            goto Lf
        L49:
            androidx.compose.runtime.saveable.SaveableStateRegistry r15 = r15.wrappedRegistry
            java.util.Map r15 = r15.performSave()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.performSave():java.util.Map");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, a<? extends Object> aVar) {
        return this.wrappedRegistry.registerProvider(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        this.wrappedHolder.removeState(obj);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final Map saver$lambda$0(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
            Map<String, List<Object>> mapPerformSave = lazySaveableStateHolder.performSave();
            if (mapPerformSave.isEmpty()) {
                return null;
            }
            return mapPerformSave;
        }

        static final LazySaveableStateHolder saver$lambda$1(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder, Map map) {
            return new LazySaveableStateHolder(saveableStateRegistry, map, saveableStateHolder);
        }

        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(final SaveableStateRegistry saveableStateRegistry, final SaveableStateHolder saveableStateHolder) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazySaveableStateHolder.Companion.saver$lambda$0((SaverScope) obj, (LazySaveableStateHolder) obj2);
                }
            }, new l() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return LazySaveableStateHolder.Companion.saver$lambda$1(saveableStateRegistry, saveableStateHolder, (Map) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public LazySaveableStateHolder(final SaveableStateRegistry saveableStateRegistry, Map<String, ? extends List<? extends Object>> map, SaveableStateHolder saveableStateHolder) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new l() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(LazySaveableStateHolder._init_$lambda$0(saveableStateRegistry, obj));
            }
        }), saveableStateHolder);
    }
}
