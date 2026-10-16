package com.bumptech.glide.load.a.a;

import android.graphics.Bitmap;
import com.bumptech.glide.g.r;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q implements l {

    /* renamed from: a, reason: collision with root package name */
    private static final Bitmap.Config[] f2970a;

    /* renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config[] f2971b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bitmap.Config[] f2972c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f2973d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f2974e;

    /* renamed from: f, reason: collision with root package name */
    private final p f2975f = new p();

    /* renamed from: g, reason: collision with root package name */
    private final f f2976g = new f();

    /* renamed from: h, reason: collision with root package name */
    private final Map f2977h = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f2970a = configArr;
        f2971b = configArr;
        f2972c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f2973d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f2974e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    static String f(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + String.valueOf(config) + ")";
    }

    private final NavigableMap g(Bitmap.Config config) {
        Map map = this.f2977h;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    private final void h(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapG = g(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapG.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapG.remove(num);
                return;
            } else {
                navigableMapG.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + toString());
    }

    @Override // com.bumptech.glide.load.a.a.l
    public final Bitmap a(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        p pVar = this.f2975f;
        int iB = r.b(i2, i3, config);
        o oVarD = pVar.d(iB, config);
        int i4 = 0;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f2971b;
        } else {
            int i5 = n.f2966a[config.ordinal()];
            configArr = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? new Bitmap.Config[]{config} : f2974e : f2973d : f2972c : f2970a;
        }
        int length = configArr.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) g(config2).ceilingKey(Integer.valueOf(iB));
            if (num == null || num.intValue() > iB * 8) {
                i4++;
            } else if (num.intValue() != iB || (config2 != null ? !config2.equals(config) : config != null)) {
                pVar.c(oVarD);
                oVarD = pVar.d(num.intValue(), config2);
            }
        }
        Bitmap bitmap = (Bitmap) this.f2976g.a(oVarD);
        if (bitmap != null) {
            h(Integer.valueOf(oVarD.f2967a), bitmap);
            bitmap.reconfigure(i2, i3, config);
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.a.a.l
    public final Bitmap b() {
        Bitmap bitmap = (Bitmap) this.f2976g.b();
        if (bitmap != null) {
            h(Integer.valueOf(r.a(bitmap)), bitmap);
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.a.a.l
    public final String c(Bitmap bitmap) {
        return f(r.a(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.a.a.l
    public final String d(int i2, int i3, Bitmap.Config config) {
        return f(r.b(i2, i3, config), config);
    }

    @Override // com.bumptech.glide.load.a.a.l
    public final void e(Bitmap bitmap) {
        o oVarD = this.f2975f.d(r.a(bitmap), bitmap.getConfig());
        this.f2976g.c(oVarD, bitmap);
        NavigableMap navigableMapG = g(bitmap.getConfig());
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(oVarD.f2967a));
        navigableMapG.put(Integer.valueOf(oVarD.f2967a), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f2976g);
        sb.append(", sortedSizes=(");
        Map map = this.f2977h;
        for (Map.Entry entry : map.entrySet()) {
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
