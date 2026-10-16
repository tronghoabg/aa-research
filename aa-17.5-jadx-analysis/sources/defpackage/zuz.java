package defpackage;

import com.google.android.libraries.maps.model.FeatureLayerOptions;
import com.google.android.libraries.maps.model.FeatureType;
import com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate;
import com.google.android.libraries.maps.model.internal.IOnFeatureClickListener;
import com.google.android.libraries.maps.model.internal.IStyleFactory;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zuz extends IFeatureLayerDelegate.Stub {
    final Map a;
    final Set b;
    final String c;
    public boolean d;
    private final zrt e = zrt.a;
    private final String f;
    private final String g;
    private final zwa h;
    private IStyleFactory i;
    private final zwl j;
    private final zys k;

    public zuz(FeatureLayerOptions featureLayerOptions, zwa zwaVar, Map map, zwl zwlVar, zys zysVar) {
        String featureType = featureLayerOptions.getFeatureType();
        this.f = featureType;
        String datasetId = featureLayerOptions.getDatasetId();
        this.g = datasetId;
        this.h = zwaVar;
        this.a = map;
        this.j = zwlVar;
        this.b = new HashSet();
        this.k = zysVar;
        this.d = b();
        this.c = featureType.equals(FeatureType.DATASET) ? datasetId : featureType;
    }

    public final void a() {
        IStyleFactory iStyleFactory;
        if (this.d) {
            iStyleFactory = this.i;
        } else {
            this.h.g(this.f, this.g, "FeatureLayer");
            iStyleFactory = null;
        }
        String str = this.f;
        if (str.equals(FeatureType.DATASET)) {
            str = this.g;
        }
        Map map = this.a;
        if (iStyleFactory != map.get(str)) {
            if (iStyleFactory != null) {
                map.put(str, iStyleFactory);
            } else {
                map.remove(str);
            }
            this.j.Z(new aacq(yfy.j(map), this.k, (byte[]) null));
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
    public final void addOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) {
        try {
            this.e.a();
            Set set = this.b;
            set.add(iOnFeatureClickListener);
            this.j.I(this.c, set);
            this.h.g(this.f, this.g, "FeatureLayer");
            this.k.b(aahu.FEATURE_LAYER_ADD_CLICK_LISTENER);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    public final boolean b() {
        zwa zwaVar = this.h;
        return zwaVar.j(this.f) || zwaVar.i(this.g);
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
    public final String getDatasetId() {
        return this.g;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
    public final String getFeatureType() {
        return this.f;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
    public final boolean isAvailable() {
        this.e.a();
        return this.d;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
    public final void removeOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) {
        try {
            this.e.a();
            Set set = this.b;
            set.remove(iOnFeatureClickListener);
            this.j.I(this.c, set);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
    public final void setFeatureStyle(IStyleFactory iStyleFactory) {
        int i;
        this.e.a();
        this.i = iStyleFactory;
        a();
        String str = this.f;
        if (str.equals(FeatureType.DATASET)) {
            i = 19;
        } else {
            yfy yfyVar = zuv.a;
            i = yfyVar.containsKey(str) ? ((aauq) yfyVar.get(str)).u : 0;
        }
        zys zysVar = this.k;
        aahu aahuVar = aahu.FEATURE_LAYER_SET_STYLE;
        abnp abnpVarN = yvv.a.n();
        abnp abnpVarN2 = yvq.a.n();
        abnpVarN2.t();
        yvq yvqVar = (yvq) abnpVarN2.b;
        yvqVar.b |= 1;
        yvqVar.c = i;
        abnpVarN.t();
        yvv yvvVar = (yvv) abnpVarN.b;
        yvq yvqVar2 = (yvq) abnpVarN2.q();
        yvqVar2.getClass();
        yvvVar.c = yvqVar2;
        yvvVar.b = 2;
        zysVar.c(aahuVar, (yvv) abnpVarN.q());
    }
}
