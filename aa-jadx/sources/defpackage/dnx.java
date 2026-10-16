package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dnx extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }
}
