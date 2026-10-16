package defpackage;

import com.google.android.libraries.maps.model.Feature;
import com.google.android.libraries.maps.model.FeatureLayer;
import com.google.android.libraries.maps.model.FeatureStyle;
import com.google.android.libraries.maps.model.internal.IFeatureDelegate;
import com.google.android.libraries.maps.model.internal.IStyleFactory;

/* loaded from: classes3.dex */
public final class vje extends IStyleFactory.Stub {
    final /* synthetic */ FeatureLayer.StyleFactory a;

    public vje(FeatureLayer.StyleFactory styleFactory) {
        this.a = styleFactory;
    }

    @Override // com.google.android.libraries.maps.model.internal.IStyleFactory
    public final FeatureStyle getStyle(IFeatureDelegate iFeatureDelegate) {
        Feature featureA = Feature.a(iFeatureDelegate);
        if (featureA == null) {
            return null;
        }
        return this.a.getStyle(featureA);
    }
}
