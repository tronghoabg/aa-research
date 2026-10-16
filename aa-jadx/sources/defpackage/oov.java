package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oov extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        view.getClass();
        outline.getClass();
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }
}
