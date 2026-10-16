package androidx.compose.runtime;

import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import h.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposablesKt {
    public static final /* synthetic */ <T, E extends Applier> void ComposeNode(a<? extends T> aVar, l<? super Updater<T>, ab> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, ab> qVar, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        Applier<?> applier = composer.getApplier();
        x.i();
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m7342boximpl(composer));
        qVar.invoke(SkippableUpdater.m7316boximpl(composer), composer, Integer.valueOf((i2 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier> void ReusableComposeNode(a<? extends T> aVar, l<? super Updater<T>, ab> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, ab> qVar, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        Applier<?> applier = composer.getApplier();
        x.i();
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m7342boximpl(composer));
        qVar.invoke(SkippableUpdater.m7316boximpl(composer), composer, Integer.valueOf((i2 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final void ReusableContent(Object obj, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        composer.startReusableGroup(207, obj);
        pVar.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        composer.endReusableGroup();
    }

    public static final void ReusableContentHost(boolean z, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        composer.startReusableGroup(207, Boolean.valueOf(z));
        boolean zChanged = composer.changed(z);
        if (z) {
            pVar.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
    }

    public static final Composer getCurrentComposer(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i2, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:191)");
        }
        throw new j("Implemented as an intrinsic");
    }

    public static final int getCurrentCompositeKeyHash(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i2, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:252)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    public static final long getCurrentCompositeKeyHashCode(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-168259424, i2, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:268)");
        }
        long compositeKeyHashCode = composer.getCompositeKeyHashCode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositeKeyHashCode;
    }

    public static final CompositionContext getCurrentCompositionContext(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1645225943, i2, -1, "androidx.compose.runtime.<get-currentCompositionContext> (Composables.kt:206)");
        }
        ControlledComposition composition = composer.getComposition();
        x.d(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        CompositionContext parent = ((CompositionImpl) composition).getParent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return parent;
    }

    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i2, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:231)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionLocalContext;
    }

    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i2, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:216)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final <T> T key(Object[] objArr, p<? super Composer, ? super Integer, ? extends T> pVar, Composer composer, int i2) {
        return pVar.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
    }

    public static final <T> T remember(Object[] objArr, a<? extends T> aVar, Composer composer, int i2) {
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= composer.changed(obj);
        }
        T t = (T) composer.rememberedValue();
        if (!zChanged && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T tInvoke = aVar.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final CompositionContext rememberCompositionContext(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i2, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:516)");
        }
        CompositionContext compositionContextBuildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionContextBuildContext;
    }

    public static /* synthetic */ void getCurrentCompositeKeyHash$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getCurrentCompositionContext$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations(Composer composer, int i2) {
    }

    public static final <T> T remember(Object obj, Object obj2, a<? extends T> aVar, Composer composer, int i2) {
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        T t = (T) composer.rememberedValue();
        if (!zChanged && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T tInvoke = aVar.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final <T> T remember(Object obj, a<? extends T> aVar, Composer composer, int i2) {
        boolean zChanged = composer.changed(obj);
        T t = (T) composer.rememberedValue();
        if (!zChanged && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T tInvoke = aVar.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final <T> T remember(a<? extends T> aVar, Composer composer, int i2) {
        T t = (T) composer.rememberedValue();
        if (t != Composer.Companion.getEmpty()) {
            return t;
        }
        T tInvoke = aVar.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final <T> T remember(Object obj, Object obj2, Object obj3, a<? extends T> aVar, Composer composer, int i2) {
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t = (T) composer.rememberedValue();
        if (!zChanged && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T tInvoke = aVar.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final /* synthetic */ <T, E extends Applier> void ComposeNode(a<? extends T> aVar, l<? super Updater<T>, ab> lVar, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        Applier<?> applier = composer.getApplier();
        x.i();
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m7342boximpl(composer));
        pVar.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier> void ReusableComposeNode(a<? extends T> aVar, l<? super Updater<T>, ab> lVar, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        Applier<?> applier = composer.getApplier();
        x.i();
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m7342boximpl(composer));
        pVar.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier> void ComposeNode(a<? extends T> aVar, l<? super Updater<T>, ab> lVar, Composer composer, int i2) {
        Applier<?> applier = composer.getApplier();
        x.i();
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m7342boximpl(composer));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier> void ReusableComposeNode(a<? extends T> aVar, l<? super Updater<T>, ab> lVar, Composer composer, int i2) {
        Applier<?> applier = composer.getApplier();
        x.i();
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m7342boximpl(composer));
        composer.endNode();
    }
}
