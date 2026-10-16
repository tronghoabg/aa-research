package F4;

import Y4.m;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f3865d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f3866e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f3867f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f3868g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f3869h;

    /* renamed from: a, reason: collision with root package name */
    public final e f3870a = new e(1);

    /* renamed from: b, reason: collision with root package name */
    public final S3.c f3871b = new S3.c(5);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3872c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f3865d = configArr;
        f3866e = configArr;
        f3867f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3868g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3869h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i5, Bitmap.Config config) {
        return "[" + i5 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(m.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i5, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int i11 = 0;
        int iB = m.b(i5, i10, config);
        e eVar = this.f3870a;
        h hVarE0 = (h) ((ArrayDeque) eVar.f421a).poll();
        if (hVarE0 == null) {
            hVarE0 = eVar.e0();
        }
        j jVar = (j) hVarE0;
        jVar.f3863b = iB;
        jVar.f3864c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = i.f3861a[config.ordinal()];
            configArr = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? new Bitmap.Config[]{config} : f3869h : f3868g : f3867f : f3865d;
        } else {
            configArr = f3866e;
        }
        int length = configArr.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i11];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iB));
            if (num == null || num.intValue() > iB * 8) {
                i11++;
            } else if (num.intValue() != iB || (config2 != null ? !config2.equals(config) : config != null)) {
                eVar.M(jVar);
                int iIntValue = num.intValue();
                Object objE0 = (h) ((ArrayDeque) eVar.f421a).poll();
                if (objE0 == null) {
                    objE0 = eVar.e0();
                }
                jVar = (j) objE0;
                jVar.f3863b = iIntValue;
                jVar.f3864c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f3871b.j(jVar);
        if (bitmap != null) {
            a(Integer.valueOf(jVar.f3863b), bitmap);
            bitmap.reconfigure(i5, i10, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f3872c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f3870a;
        h hVarE0 = (h) ((ArrayDeque) eVar.f421a).poll();
        if (hVarE0 == null) {
            hVarE0 = eVar.e0();
        }
        j jVar = (j) hVarE0;
        jVar.f3863b = iC;
        jVar.f3864c = config;
        this.f3871b.r(jVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(jVar.f3863b));
        navigableMapD.put(Integer.valueOf(jVar.f3863b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbJ = N0.a.j("SizeConfigStrategy{groupedMap=");
        sbJ.append(this.f3871b);
        sbJ.append(", sortedSizes=(");
        HashMap map = this.f3872c;
        for (Map.Entry entry : map.entrySet()) {
            sbJ.append(entry.getKey());
            sbJ.append('[');
            sbJ.append(entry.getValue());
            sbJ.append("], ");
        }
        if (!map.isEmpty()) {
            sbJ.replace(sbJ.length() - 2, sbJ.length(), "");
        }
        sbJ.append(")}");
        return sbJ.toString();
    }
}
