package androidx.mediarouter.app;

/* JADX INFO: loaded from: classes2.dex */
final class OverlayListView extends android.widget.ListView {
    private final java.util.List a;

    public OverlayListView(android.content.Context context) {
        super(context);
        this.a = new java.util.ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.List list = this.a;
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public OverlayListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new java.util.ArrayList();
    }

    public OverlayListView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new java.util.ArrayList();
    }
}
