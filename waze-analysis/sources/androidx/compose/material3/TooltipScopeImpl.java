package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.window.PopupPositionProvider;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TooltipScopeImpl implements TooltipScope {
    public static final int $stable = 0;
    private final a<LayoutCoordinates> getAnchorBounds;
    private final PopupPositionProvider positionProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public TooltipScopeImpl(a<? extends LayoutCoordinates> aVar, PopupPositionProvider popupPositionProvider) {
        this.getAnchorBounds = aVar;
        this.positionProvider = popupPositionProvider;
    }

    static final DrawResult drawCaret$lambda$0(p pVar, TooltipScopeImpl tooltipScopeImpl, CacheDrawScope cacheDrawScope) {
        return (DrawResult) pVar.invoke(cacheDrawScope, tooltipScopeImpl.getAnchorBounds.invoke());
    }

    @Override // androidx.compose.material3.TooltipScope
    public /* synthetic */ Modifier drawCaret(Modifier modifier, final p pVar) {
        return DrawModifierKt.drawWithCache(modifier, new l() { // from class: androidx.compose.material3.TooltipScopeImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TooltipScopeImpl.drawCaret$lambda$0(pVar, this, (CacheDrawScope) obj);
            }
        });
    }

    public final a<LayoutCoordinates> getGetAnchorBounds() {
        return this.getAnchorBounds;
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.material3.TooltipScope
    public LayoutCoordinates obtainAnchorBounds(MeasureScope measureScope) {
        return this.getAnchorBounds.invoke();
    }

    @Override // androidx.compose.material3.TooltipScope
    public PopupPositionProvider obtainPositionProvider() {
        return this.positionProvider;
    }
}
