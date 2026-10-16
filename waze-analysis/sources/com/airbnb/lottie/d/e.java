package com.airbnb.lottie.d;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2278a = new e("COMPOSITION");

    /* renamed from: b, reason: collision with root package name */
    private final List f2279b;

    /* renamed from: c, reason: collision with root package name */
    private f f2280c;

    private e(e eVar) {
        this.f2279b = new ArrayList(eVar.f2279b);
        this.f2280c = eVar.f2280c;
    }

    private final boolean h() {
        return ((String) this.f2279b.get(r1.size() - 1)).equals("**");
    }

    private static final boolean i(String str) {
        return "__container".equals(str);
    }

    public final int a(String str, int i2) {
        if (i(str)) {
            return 0;
        }
        List list = this.f2279b;
        if (((String) list.get(i2)).equals("**")) {
            return (i2 != list.size() + (-1) && ((String) list.get(i2 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final e b(String str) {
        e eVar = new e(this);
        eVar.f2279b.add(str);
        return eVar;
    }

    public final e c(f fVar) {
        e eVar = new e(this);
        eVar.f2280c = fVar;
        return eVar;
    }

    public final f d() {
        return this.f2280c;
    }

    public final boolean e(String str, int i2) {
        List list = this.f2279b;
        if (i2 >= list.size()) {
            return false;
        }
        int size = list.size() - 1;
        String str2 = (String) list.get(i2);
        if (!str2.equals("**")) {
            return (i2 == size || (i2 == list.size() + (-2) && h())) && (str2.equals(str) || str2.equals(ProxyConfig.MATCH_ALL_SCHEMES));
        }
        if (i2 == size) {
            return true;
        }
        int i3 = i2 + 1;
        if (((String) list.get(i3)).equals(str)) {
            if (i2 != list.size() - 2) {
                return i2 == list.size() + (-3) && h();
            }
            return true;
        }
        if (i3 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i3)).equals(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f2279b.equals(eVar.f2279b)) {
            return false;
        }
        f fVar = this.f2280c;
        return fVar != null ? fVar.equals(eVar.f2280c) : eVar.f2280c == null;
    }

    public final boolean f(String str, int i2) {
        if (i(str)) {
            return true;
        }
        List list = this.f2279b;
        if (i2 >= list.size()) {
            return false;
        }
        return ((String) list.get(i2)).equals(str) || ((String) list.get(i2)).equals("**") || ((String) list.get(i2)).equals(ProxyConfig.MATCH_ALL_SCHEMES);
    }

    public final boolean g(String str, int i2) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f2279b;
        return i2 < list.size() + (-1) || ((String) list.get(i2)).equals("**");
    }

    public final int hashCode() {
        int iHashCode = this.f2279b.hashCode() * 31;
        f fVar = this.f2280c;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2279b);
        f fVar = this.f2280c;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(strValueOf);
        sb.append(",resolved=");
        sb.append(fVar != null);
        sb.append("}");
        return sb.toString();
    }

    public e(String... strArr) {
        this.f2279b = Arrays.asList(strArr);
    }
}
