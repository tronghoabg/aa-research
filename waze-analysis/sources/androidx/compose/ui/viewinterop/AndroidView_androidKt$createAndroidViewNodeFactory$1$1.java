package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidView_androidKt$createAndroidViewNodeFactory$1$1 extends y implements a<LayoutNode> {
    final /* synthetic */ int $compositeKeyHash;
    final /* synthetic */ Context $context;
    final /* synthetic */ l $factory;
    final /* synthetic */ View $ownerView;
    final /* synthetic */ CompositionContext $parentReference;
    final /* synthetic */ SaveableStateRegistry $stateRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$createAndroidViewNodeFactory$1$1(Context context, l lVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i2, View view) {
        super(0);
        this.$context = context;
        this.$factory = lVar;
        this.$parentReference = compositionContext;
        this.$stateRegistry = saveableStateRegistry;
        this.$compositeKeyHash = i2;
        this.$ownerView = view;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final LayoutNode invoke() {
        KeyEvent.Callback callback = this.$ownerView;
        x.d(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new ViewFactoryHolder(this.$context, this.$factory, this.$parentReference, this.$stateRegistry, this.$compositeKeyHash, (Owner) callback).getLayoutNode();
    }
}
