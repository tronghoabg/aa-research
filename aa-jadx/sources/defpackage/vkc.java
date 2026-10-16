package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vkc extends com.google.android.libraries.maps.model.internal.IOnFeatureClickListener.Stub {
    final /* synthetic */ com.google.android.libraries.maps.model.FeatureLayer.OnFeatureClickListener a;

    public vkc(com.google.android.libraries.maps.model.FeatureLayer.OnFeatureClickListener onFeatureClickListener) {
        this.a = onFeatureClickListener;
    }

    @Override // com.google.android.libraries.maps.model.internal.IOnFeatureClickListener
    public final void onFeatureClick(com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate iFeatureClickEventDelegate) {
        this.a.onFeatureClick(new com.google.android.libraries.maps.model.FeatureClickEvent(iFeatureClickEventDelegate));
    }
}
