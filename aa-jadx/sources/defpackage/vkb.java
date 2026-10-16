package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vkb extends com.google.android.libraries.maps.model.internal.IStyleFactory.Stub {
    final /* synthetic */ com.google.android.libraries.maps.model.FeatureLayer.StyleFactory a;

    public vkb(com.google.android.libraries.maps.model.FeatureLayer.StyleFactory styleFactory) {
        this.a = styleFactory;
    }

    @Override // com.google.android.libraries.maps.model.internal.IStyleFactory
    public final com.google.android.libraries.maps.model.FeatureStyle getStyle(com.google.android.libraries.maps.model.internal.IFeatureDelegate iFeatureDelegate) {
        com.google.android.libraries.maps.model.Feature featureA = com.google.android.libraries.maps.model.Feature.a(iFeatureDelegate);
        if (featureA == null) {
            return null;
        }
        return this.a.getStyle(featureA);
    }
}
