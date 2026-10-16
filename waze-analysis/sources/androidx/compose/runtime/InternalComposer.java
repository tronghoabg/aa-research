package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class InternalComposer implements Composer {
    public static final int $stable = 0;

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changed(byte b2) {
        return changed(b2);
    }

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changedInstance(Object obj) {
        return changed(obj);
    }

    public abstract void changesApplied$runtime();

    /* renamed from: composeContent--ZbOJvo$runtime */
    public abstract void mo7297composeContentZbOJvo$runtime(MutableScatterMap<Object, Object> mutableScatterMap, p<? super Composer, ? super Integer, ab> pVar, ShouldPauseCallback shouldPauseCallback);

    public abstract void deactivate$runtime();

    public abstract void dispose$runtime();

    public abstract void endReuseFromRoot$runtime();

    public abstract boolean forceRecomposeScopes$runtime();

    public abstract boolean getAreChildrenComposing$runtime();

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ int getCompoundKeyHash() {
        return Composer$$ExternalSyntheticBackport0.m(getCompositeKeyHashCode());
    }

    public abstract RecomposeScopeImpl getCurrentRecomposeScope$runtime();

    public abstract Changes getDeferredChanges$runtime();

    public abstract CompositionErrorContextImpl getErrorContext$runtime();

    public abstract boolean getHasPendingChanges$runtime();

    public abstract boolean getSourceMarkersEnabled$runtime();

    public abstract boolean isComposing$runtime();

    public abstract int parentKey$runtime();

    public abstract List<ComposeStackTraceFrame> parentStackTrace$runtime();

    public abstract void prepareCompose$runtime(a<ab> aVar);

    /* renamed from: recompose-aFTiNEg$runtime */
    public abstract boolean mo7298recomposeaFTiNEg$runtime(MutableScatterMap<Object, Object> mutableScatterMap, ShouldPauseCallback shouldPauseCallback);

    public abstract ComposeStackTrace stackTraceForValue$runtime(Object obj);

    public abstract int stacksSize$runtime();

    public abstract void startReuseFromRoot$runtime();

    public abstract boolean tryImminentInvalidation$runtime(RecomposeScopeImpl recomposeScopeImpl, Object obj);

    /* renamed from: updateComposerInvalidations-RY85e9Y$runtime */
    public abstract void mo7299updateComposerInvalidationsRY85e9Y$runtime(MutableScatterMap<Object, Object> mutableScatterMap);

    public abstract void verifyConsistent$runtime();

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changed(char c2) {
        return changed(c2);
    }

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changed(double d2) {
        return changed(d2);
    }

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changed(float f2) {
        return changed(f2);
    }

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changed(int i2) {
        return changed(i2);
    }

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changed(long j2) {
        return changed(j2);
    }

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changed(short s) {
        return changed(s);
    }

    @Override // androidx.compose.runtime.Composer
    public /* synthetic */ boolean changed(boolean z) {
        return changed(z);
    }
}
