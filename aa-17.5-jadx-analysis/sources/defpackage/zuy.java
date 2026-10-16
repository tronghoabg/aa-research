package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.FeatureType;
import com.google.android.libraries.maps.model.internal.IFeatureDelegate;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zuy extends IFeatureDelegate.Stub {
    public static final yfy a;
    public final String b;
    public final String c;
    private final zys d;
    private final int e;
    private final String f;
    private final yfy g;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e("a1", FeatureType.ADMINISTRATIVE_AREA_LEVEL_1);
        yfuVar.e("a2", FeatureType.ADMINISTRATIVE_AREA_LEVEL_2);
        yfuVar.e("c", FeatureType.COUNTRY);
        yfuVar.e("l", FeatureType.LOCALITY);
        yfuVar.e("p", FeatureType.POSTAL_CODE);
        yfuVar.e("sd", FeatureType.SCHOOL_DISTRICT);
        a = yfuVar.d(true);
    }

    public zuy(zux zuxVar) {
        this.e = zuxVar.a;
        this.b = zuxVar.b;
        this.f = zuxVar.c;
        this.c = zuxVar.d;
        this.g = zuxVar.e;
        this.d = zuxVar.f;
    }

    public static zuy a(abst abstVar, zys zysVar) {
        zux zuxVar = new zux();
        HashMap map = new HashMap();
        for (abss abssVar : abstVar.b) {
            if (abssVar.c.equals("_?f")) {
                zuxVar.b = (String) a.get(abssVar.d);
            } else if (abssVar.c.equals("_?p")) {
                zuxVar.c = abssVar.d;
            } else if (abssVar.c.equals("?_")) {
                zuxVar.b = FeatureType.DATASET;
                zuxVar.d = abssVar.d;
            } else {
                map.put(abssVar.c, abssVar.d);
            }
        }
        if (zuxVar.d != null) {
            zuxVar.b(map);
        }
        zuxVar.f = zysVar;
        return zuxVar.a();
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
    public final /* synthetic */ Map getDatasetAttributes() throws RemoteException {
        return this.g;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
    public final String getDatasetId() {
        return this.c;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
    public final String getFeatureType() {
        return this.b;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
    public final String getPlaceId() {
        this.d.b(aahu.PLACE_FEATURE_ACCESS_PLACEID);
        return this.f;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
    public final int getSubfeatureType() {
        return this.e;
    }
}
