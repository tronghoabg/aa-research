package defpackage;

import com.google.android.gms.car.RadioConfiguration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class mih {
    public static final ygr a;
    public static final mih b;
    public final RadioConfiguration.RadioBandGroup c;
    public final int d;

    static {
        ygr ygrVarQ = ygr.q(1, 2, 3);
        ygrVarQ.getClass();
        a = ygrVarQ;
        b = new mih(null, 0);
    }

    public mih(RadioConfiguration.RadioBandGroup radioBandGroup, int i) {
        this.c = radioBandGroup;
        this.d = i;
    }

    public final String a() {
        RadioConfiguration.RadioBandGroup radioBandGroup = this.c;
        if (radioBandGroup == null) {
            return "favorites";
        }
        List list = radioBandGroup.a;
        list.getClass();
        List<Integer> listCb = woy.cb(list);
        ArrayList arrayList = new ArrayList();
        for (Integer num : listCb) {
            String str = (num != null && num.intValue() == 1) ? "am" : (num != null && num.intValue() == 2) ? "fm" : (num != null && num.intValue() == 3) ? "dab" : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return woy.cu(arrayList, "-", "bands:", null, null, 60);
    }

    public final boolean b() {
        RadioConfiguration.RadioBandGroup radioBandGroup = this.c;
        if (radioBandGroup != null) {
            return radioBandGroup.b;
        }
        return false;
    }

    public final boolean c() {
        return this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mih)) {
            return false;
        }
        mih mihVar = (mih) obj;
        return affa.f(this.c, mihVar.c) && this.d == mihVar.d;
    }

    public final int hashCode() {
        RadioConfiguration.RadioBandGroup radioBandGroup = this.c;
        return ((radioBandGroup == null ? 0 : radioBandGroup.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "BrowseNode(bandGroup=" + this.c + ", order=" + this.d + ")";
    }
}
