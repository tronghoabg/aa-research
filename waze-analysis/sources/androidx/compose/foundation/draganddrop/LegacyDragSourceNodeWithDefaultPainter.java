package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LegacyDragSourceNodeWithDefaultPainter extends DelegatingNode {
    private p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> dragAndDropSourceHandler;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<DragAndDropSourceScope, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = LegacyDragSourceNodeWithDefaultPainter.this.new AnonymousClass2(eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(DragAndDropSourceScope dragAndDropSourceScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(dragAndDropSourceScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                DragAndDropSourceScope dragAndDropSourceScope = (DragAndDropSourceScope) this.L$0;
                p<DragAndDropSourceScope, e<? super ab>, Object> dragAndDropSourceHandler = LegacyDragSourceNodeWithDefaultPainter.this.getDragAndDropSourceHandler();
                this.label = 1;
                if (dragAndDropSourceHandler.invoke(dragAndDropSourceScope, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public LegacyDragSourceNodeWithDefaultPainter(p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
        final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        delegate(new LegacyDragAndDropSourceNode(new l() { // from class: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LegacyDragSourceNodeWithDefaultPainter._init_$lambda$1(cacheDrawScopeDragShadowCallback, (DrawScope) obj);
            }
        }, new AnonymousClass2(null)));
    }

    static final ab _init_$lambda$1(CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback, DrawScope drawScope) {
        cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
        return ab.f48028a;
    }

    public final p<DragAndDropSourceScope, e<? super ab>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(p<? super DragAndDropSourceScope, ? super e<? super ab>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }
}
