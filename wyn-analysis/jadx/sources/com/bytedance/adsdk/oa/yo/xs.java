package com.bytedance.adsdk.oa.yo;

import android.util.Pair;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public class xs<T> {

    /* renamed from: oa, reason: collision with root package name */
    T f24641oa;
    T uef;

    private static boolean oa(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return oa(pair.first, this.uef) && oa(pair.second, this.f24641oa);
    }

    public int hashCode() {
        T t10 = this.uef;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f24641oa;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.uef + StringUtils.SPACE + this.f24641oa + "}";
    }

    public void uef(T t10, T t11) {
        this.uef = t10;
        this.f24641oa = t11;
    }
}
