package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oou extends android.view.ViewOutlineProvider {
    final /* synthetic */ defpackage.oow a;

    public oou(defpackage.oow oowVar) {
        this.a = oowVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        view.getClass();
        outline.getClass();
        defpackage.oow oowVar = this.a;
        android.graphics.Rect rect = oowVar.a;
        if (!rect.isEmpty()) {
            float f = oowVar.b;
            if (f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                outline.setRoundRect(rect, f);
                return;
            }
        }
        outline.setEmpty();
    }
}
