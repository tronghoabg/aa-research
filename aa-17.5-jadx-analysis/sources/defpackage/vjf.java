package defpackage;

import com.google.android.libraries.maps.model.FeatureClickEvent;
import com.google.android.libraries.maps.model.FeatureLayer;
import com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate;
import com.google.android.libraries.maps.model.internal.IOnFeatureClickListener;

/* loaded from: classes3.dex */
public final class vjf extends IOnFeatureClickListener.Stub {
    final /* synthetic */ FeatureLayer.OnFeatureClickListener a;

    public vjf(FeatureLayer.OnFeatureClickListener onFeatureClickListener) {
        this.a = onFeatureClickListener;
    }

    @Override // com.google.android.libraries.maps.model.internal.IOnFeatureClickListener
    public final void onFeatureClick(IFeatureClickEventDelegate iFeatureClickEventDelegate) {
        this.a.onFeatureClick(new FeatureClickEvent(iFeatureClickEventDelegate));
    }
}
