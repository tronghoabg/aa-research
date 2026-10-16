package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawModifierKt {
    public static final CacheDrawModifierNode CacheDrawModifierNode(l<? super CacheDrawScope, DrawResult> lVar) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), lVar);
    }

    public static final Modifier drawBehind(Modifier modifier, l<? super DrawScope, ab> lVar) {
        return modifier.then(new DrawBehindElement(lVar));
    }

    public static final Modifier drawWithCache(Modifier modifier, l<? super CacheDrawScope, DrawResult> lVar) {
        return modifier.then(new DrawWithCacheElement(lVar));
    }

    public static final Modifier drawWithContent(Modifier modifier, l<? super ContentDrawScope, ab> lVar) {
        return modifier.then(new DrawWithContentElement(lVar));
    }
}
