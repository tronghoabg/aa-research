package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dqk extends defpackage.dqd {
    public float ao;

    @java.lang.Deprecated
    protected final java.util.HashMap ap;

    @java.lang.Deprecated
    protected final java.util.HashMap aq;

    @java.lang.Deprecated
    protected final java.util.HashMap ar;
    public defpackage.dqf as;
    private java.util.HashMap at;
    private java.util.HashMap au;

    public dqk(defpackage.dqh dqhVar, int i) {
        super(dqhVar, i);
        this.ao = 0.5f;
        this.ap = new java.util.HashMap();
        this.aq = new java.util.HashMap();
        this.ar = new java.util.HashMap();
        this.as = defpackage.dqf.a;
    }

    final float A(java.lang.String str) {
        java.util.HashMap map = this.au;
        return (map == null || !map.containsKey(str)) ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : ((java.lang.Float) this.au.get(str)).floatValue();
    }

    protected final float B(java.lang.String str) {
        java.util.HashMap map = this.ar;
        return map.containsKey(str) ? ((java.lang.Float) map.get(str)).floatValue() : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    final float C(java.lang.String str) {
        java.util.HashMap map = this.at;
        return (map == null || !map.containsKey(str)) ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : ((java.lang.Float) this.at.get(str)).floatValue();
    }

    protected final float D(java.lang.String str) {
        java.util.HashMap map = this.aq;
        return map.containsKey(str) ? ((java.lang.Float) map.get(str)).floatValue() : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    protected final float E(java.lang.String str) {
        java.util.HashMap map = this.ap;
        if (map.containsKey(str)) {
            return ((java.lang.Float) map.get(str)).floatValue();
        }
        return -1.0f;
    }

    public final void F(java.lang.Object obj, float f, float f2, float f3, float f4, float f5) {
        super.z(obj);
        if (!java.lang.Float.isNaN(f)) {
            this.ap.put(obj, java.lang.Float.valueOf(f));
        }
        if (!java.lang.Float.isNaN(f2)) {
            this.aq.put(obj, java.lang.Float.valueOf(f2));
        }
        if (!java.lang.Float.isNaN(f3)) {
            this.ar.put(obj, java.lang.Float.valueOf(f3));
        }
        if (!java.lang.Float.isNaN(f4)) {
            java.util.HashMap map = this.at;
            if (map == null) {
                map = new java.util.HashMap();
                this.at = map;
            }
            map.put(obj, java.lang.Float.valueOf(f4));
        }
        if (java.lang.Float.isNaN(f5)) {
            return;
        }
        java.util.HashMap map2 = this.au;
        if (map2 == null) {
            map2 = new java.util.HashMap();
            this.au = map2;
        }
        map2.put(obj, java.lang.Float.valueOf(f5));
    }
}
