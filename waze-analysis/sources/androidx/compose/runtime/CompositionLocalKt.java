package androidx.compose.runtime;

import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositionLocalKt {
    public static final void CompositionLocalProvider(final CompositionLocalContext compositionLocalContext, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162003659);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changed(compositionLocalContext) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162003659, i4, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:446)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime = compositionLocalContext.getCompositionLocals$runtime();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime.size());
            for (Map.Entry<CompositionLocal<Object>, ValueHolder<Object>> entry : compositionLocals$runtime.entrySet()) {
                arrayList.add(entry.getValue().toProvided(entry.getKey()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), pVar, composerStartRestartGroup, i4 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.runtime.CompositionLocalKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CompositionLocalKt.CompositionLocalProvider$lambda$3(compositionLocalContext, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab CompositionLocalProvider$lambda$0(ProvidedValue[] providedValueArr, p pVar, int i2, Composer composer, int i3) {
        CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (p<? super Composer, ? super Integer, ab>) pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab CompositionLocalProvider$lambda$1(ProvidedValue providedValue, p pVar, int i2, Composer composer, int i3) {
        CompositionLocalProvider((ProvidedValue<?>) providedValue, (p<? super Composer, ? super Integer, ab>) pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab CompositionLocalProvider$lambda$3(CompositionLocalContext compositionLocalContext, p pVar, int i2, Composer composer, int i3) {
        CompositionLocalProvider(compositionLocalContext, (p<? super Composer, ? super Integer, ab>) pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, a<? extends T> aVar) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, aVar);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, aVar);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithComputedDefaultOf(l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        return new ComputedProvidableCompositionLocal(lVar);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithHostDefaultOf(final HostDefaultKey<T> hostDefaultKey) {
        return compositionLocalWithComputedDefaultOf(new l() { // from class: androidx.compose.runtime.CompositionLocalKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ((HostDefaultProvider) ((CompositionLocalAccessorScope) obj).getCurrentValue(HostDefaultProviderKt.getLocalHostDefaultProvider())).getHostDefault(hostDefaultKey);
            }
        });
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(a<? extends T> aVar) {
        return new StaticProvidableCompositionLocal(aVar);
    }

    public static final <T> T withCompositionLocal(ProvidedValue providedValue, p<? super Composer, ? super Integer, ? extends T> pVar, Composer composer, int i2) {
        composer.startProvider(providedValue);
        T tInvoke = pVar.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        composer.endProvider();
        return tInvoke;
    }

    public static final <T> T withCompositionLocals(ProvidedValue[] providedValueArr, p<? super Composer, ? super Integer, ? extends T> pVar, Composer composer, int i2) {
        composer.startProviders(providedValueArr);
        T tInvoke = pVar.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        composer.endProvider();
        return tInvoke;
    }

    public static final void CompositionLocalProvider(final ProvidedValue<?> providedValue, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-149765515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-149765515, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:425)");
        }
        composerStartRestartGroup.startProvider(providedValue);
        pVar.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
        composerStartRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.runtime.CompositionLocalKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CompositionLocalKt.CompositionLocalProvider$lambda$1(providedValue, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CompositionLocalProvider(final ProvidedValue<?>[] providedValueArr, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(415205898);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(415205898, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:405)");
        }
        composerStartRestartGroup.startProviders(providedValueArr);
        pVar.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
        composerStartRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.runtime.CompositionLocalKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CompositionLocalKt.CompositionLocalProvider$lambda$0(providedValueArr, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
