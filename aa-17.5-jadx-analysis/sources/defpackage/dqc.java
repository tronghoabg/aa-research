package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class dqc extends dpv {
    public float ao;

    @Deprecated
    protected final HashMap ap;

    @Deprecated
    protected final HashMap aq;

    @Deprecated
    protected final HashMap ar;
    public dpx as;
    private HashMap at;
    private HashMap au;

    public dqc(dpz dpzVar, int i) {
        super(dpzVar, i);
        this.ao = 0.5f;
        this.ap = new HashMap();
        this.aq = new HashMap();
        this.ar = new HashMap();
        this.as = dpx.a;
    }

    final float A(String str) {
        HashMap map = this.au;
        return (map == null || !map.containsKey(str)) ? BitmapDescriptorFactory.HUE_RED : ((Float) this.au.get(str)).floatValue();
    }

    protected final float B(String str) {
        HashMap map = this.ar;
        return map.containsKey(str) ? ((Float) map.get(str)).floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    final float C(String str) {
        HashMap map = this.at;
        return (map == null || !map.containsKey(str)) ? BitmapDescriptorFactory.HUE_RED : ((Float) this.at.get(str)).floatValue();
    }

    protected final float D(String str) {
        HashMap map = this.aq;
        return map.containsKey(str) ? ((Float) map.get(str)).floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    protected final float E(String str) {
        HashMap map = this.ap;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return -1.0f;
    }

    public final void F(Object obj, float f, float f2, float f3, float f4, float f5) {
        super.z(obj);
        if (!Float.isNaN(f)) {
            this.ap.put(obj, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            this.aq.put(obj, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            this.ar.put(obj, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            HashMap map = this.at;
            if (map == null) {
                map = new HashMap();
                this.at = map;
            }
            map.put(obj, Float.valueOf(f4));
        }
        if (Float.isNaN(f5)) {
            return;
        }
        HashMap map2 = this.au;
        if (map2 == null) {
            map2 = new HashMap();
            this.au = map2;
        }
        map2.put(obj, Float.valueOf(f5));
    }
}
