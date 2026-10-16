package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.a.r;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CompositionDataTreeKt {
    public static final <T, R> List<R> makeTree(Set<? extends CompositionData> set, l<? super CompositionInstance, ab> lVar, r<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? super List<? extends R>, ? extends T> rVar, q<? super CompositionInstance, ? super T, ? super List<? extends CompositionInstance>, ? extends R> qVar, ContextCache contextCache) {
        return new CompositionDataTree(set, lVar, rVar, qVar, contextCache).build();
    }

    public static /* synthetic */ List makeTree$default(Set set, l lVar, r rVar, q qVar, ContextCache contextCache, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            contextCache = new ContextCache();
        }
        return makeTree(set, lVar, rVar, qVar, contextCache);
    }
}
