package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class BringIntoViewNode extends Modifier.Node {
    private l<? super l<? super Rect, ab>, ab> onRequesterReady;
    private final l<Rect, ab> requester = new BringIntoViewNode$requester$1(this);

    public BringIntoViewNode(l<? super l<? super Rect, ab>, ab> lVar) {
        this.onRequesterReady = lVar;
    }

    public final l<l<? super Rect, ab>, ab> getOnRequesterReady() {
        return this.onRequesterReady;
    }

    public final l<Rect, ab> getRequester() {
        return this.requester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.onRequesterReady.invoke(this.requester);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.onRequesterReady.invoke(null);
    }

    public final void setOnRequesterReady(l<? super l<? super Rect, ab>, ab> lVar) {
        this.onRequesterReady = lVar;
    }

    public final void update(l<? super l<? super Rect, ab>, ab> lVar) {
        this.onRequesterReady = lVar;
        if (isAttached()) {
            lVar.invoke(this.requester);
        }
    }
}
