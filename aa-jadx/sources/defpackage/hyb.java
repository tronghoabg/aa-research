package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hyb implements defpackage.hxw {
    public static final android.graphics.Bitmap.Config[] a;
    public static final android.graphics.Bitmap.Config[] b;
    public static final android.graphics.Bitmap.Config[] c;
    public static final android.graphics.Bitmap.Config[] d;
    public static final android.graphics.Bitmap.Config[] e;
    public final defpackage.hya f = new defpackage.hya();
    public final defpackage.hxq g = new defpackage.hxq();
    private final java.util.Map h = new java.util.HashMap();

    static {
        android.graphics.Bitmap.Config[] configArr = (android.graphics.Bitmap.Config[]) java.util.Arrays.copyOf(new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = android.graphics.Bitmap.Config.RGBA_F16;
        a = configArr;
        b = configArr;
        c = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.RGB_565};
        d = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_4444};
        e = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ALPHA_8};
    }

    static java.lang.String c(int i, android.graphics.Bitmap.Config config) {
        return "[" + i + "](" + java.lang.String.valueOf(config) + ")";
    }

    @Override // defpackage.hxw
    public final java.lang.String a(android.graphics.Bitmap bitmap) {
        return c(defpackage.igg.a(bitmap), bitmap.getConfig());
    }

    @Override // defpackage.hxw
    public final java.lang.String b(int i, int i2, android.graphics.Bitmap.Config config) {
        return c(i * i2 * defpackage.igg.b(config), config);
    }

    public final java.util.NavigableMap d(android.graphics.Bitmap.Config config) {
        java.util.Map map = this.h;
        java.util.NavigableMap navigableMap = (java.util.NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(java.lang.Integer num, android.graphics.Bitmap bitmap) {
        java.util.NavigableMap navigableMapD = d(bitmap.getConfig());
        java.lang.Integer num2 = (java.lang.Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, java.lang.Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + toString());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.g);
        sb.append(", sortedSizes=(");
        java.util.Map map = this.h;
        for (java.util.Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!map.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
