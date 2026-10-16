package defpackage;

import com.google.android.libraries.maps.model.FeatureType;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zuv {
    static final yfy a = yfy.p(FeatureType.ADMINISTRATIVE_AREA_LEVEL_1, aauq.ADMINISTRATIVE_AREA1, FeatureType.ADMINISTRATIVE_AREA_LEVEL_2, aauq.ADMINISTRATIVE_AREA2, FeatureType.COUNTRY, aauq.COUNTRY, FeatureType.LOCALITY, aauq.LOCALITY, FeatureType.POSTAL_CODE, aauq.POSTAL_CODE, FeatureType.SCHOOL_DISTRICT, aauq.SCHOOL_DISTRICT_V2);
    public final Set b = new HashSet();
    public ygr c = new ymp(aauq.UNKNOWN_MAP_FACTS_TYPE);
    public ygr d = yly.a;
    private final String e;
    private final zyb f;

    public zuv(String str, zyb zybVar) {
        this.e = str;
        this.f = zybVar;
        a();
    }

    public final boolean a() {
        zyb zybVar = this.f;
        String str = this.e;
        ygr ygrVarB = zybVar.b(str);
        ygr ygrVarA = zybVar.a(str);
        aauq aauqVar = aauq.UNKNOWN_MAP_FACTS_TYPE;
        if (ygrVarB.contains(aauqVar) && ygrVarB.equals(this.c)) {
            if (woy.am(str)) {
                ygrVarB = yly.a;
            } else {
                HashSet hashSet = new HashSet();
                hashSet.addAll(a.values());
                ygrVarB = ygr.n(hashSet);
            }
        }
        if ((ygrVarB.equals(this.c) || ygrVarB.contains(aauqVar)) && ygrVarA.equals(this.d)) {
            return false;
        }
        this.c = ygrVarB;
        this.d = ygrVarA;
        return true;
    }
}
