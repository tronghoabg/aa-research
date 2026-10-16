package androidx.compose.runtime;

import h.ab;
import h.c.e;
import h.c.j;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import java.util.Arrays;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;
import kotlinx.coroutines.bt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    public static final void DisposableEffect(Object[] objArr, l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:398)");
        }
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object[] objArr, p<? super af, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:542)");
        }
        j applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    static final ab LaunchedEffect$lambda$0(p pVar, int i2, Composer composer, int i3) {
        LaunchedEffect(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void SideEffect(Object[] objArr, a<ab> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1304457028, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:181)");
        }
        boolean zChanged = composer.changed(objArr.length);
        for (Object obj : objArr) {
            zChanged |= composer.changed(obj);
        }
        if (zChanged) {
            composer.recordSideEffect(aVar);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final af createCompositionCoroutineScope(j jVar, Composer composer) {
        if (jVar.get(br.f51766a) == null) {
            return new RememberedCoroutineScope(composer.getApplyCoroutineContext(), jVar);
        }
        bt btVar = new bt(null);
        btVar.b(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return aj.e(btVar);
    }

    public static final af rememberCoroutineScope(a<? extends j> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            aVar = new a<k>() { // from class: androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h.g.a.a
                public final k invoke() {
                    return k.f48060a;
                }
            };
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = createCompositionCoroutineScope(aVar.invoke(), composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        return (af) objRememberedValue;
    }

    public static final void SideEffect(Object obj, Object obj2, a<ab> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(322341111, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:116)");
        }
        if (composer.changed(obj) | composer.changed(obj2)) {
            composer.recordSideEffect(aVar);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void SideEffect(Object obj, a<ab> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(224973783, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:85)");
        }
        if (composer.changed(obj)) {
            composer.recordSideEffect(aVar);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void SideEffect(a<ab> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:58)");
        }
        composer.recordSideEffect(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void SideEffect(Object obj, Object obj2, Object obj3, a<ab> aVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1659153943, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:149)");
        }
        if (composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3)) {
            composer.recordSideEffect(aVar);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:324)");
        }
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(lVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, p<? super af, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:495)");
        }
        j applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, pVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:287)");
        }
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(lVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, p<? super af, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:476)");
        }
        j applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, pVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:254)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError);
    }

    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:362)");
        }
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(lVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(final p<? super af, ? super e<? super ab>, ? extends Object> pVar, Composer composer, final int i2) {
        int i3 = i2 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-805415771);
        if (composerStartRestartGroup.shouldExecute(1 == i3, i3)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:460)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError);
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.runtime.EffectsKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return EffectsKt.LaunchedEffect$lambda$0(pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, p<? super af, ? super e<? super ab>, ? extends Object> pVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:519)");
        }
        j applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, pVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
