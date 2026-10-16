package D0;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2264a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2265b;

    /* renamed from: c, reason: collision with root package name */
    public int f2266c;

    public final int a(int i5, Object key) {
        AbstractC3340k.e(key, "key");
        int i10 = this.f2266c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(i10, i5, this.f2264a);
        if (iA < 0 || key.equals(this.f2265b[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f2264a[i11] == i5) {
            if (key.equals(this.f2265b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f2264a[i12] == i5; i12--) {
            if (key.equals(this.f2265b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int b() {
        int i5 = this.f2266c;
        if (i5 == 0) {
            return -1;
        }
        int iA = a.a(i5, 0, this.f2264a);
        if (iA < 0 || this.f2265b[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i5 && this.f2264a[i10] == 0) {
            if (this.f2265b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f2264a[i11] == 0; i11--) {
            if (this.f2265b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        int i5;
        int iA;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f2266c;
                if (i10 == cVar.f2266c) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        Object[] objArr = this.f2265b;
                        int i12 = i11 << 1;
                        Object obj2 = objArr[i12];
                        Object obj3 = objArr[i12 + 1];
                        if (obj2 == null) {
                            iA = cVar.b();
                        } else {
                            cVar.getClass();
                            iA = cVar.a(obj2.hashCode(), obj2);
                        }
                        Object obj4 = iA >= 0 ? cVar.f2265b[(iA << 1) + 1] : null;
                        if (obj3 == null) {
                            if (obj4 == null) {
                                if ((obj2 == null ? cVar.b() : cVar.a(obj2.hashCode(), obj2)) >= 0) {
                                }
                            }
                        } else if (obj3.equals(obj4)) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Map) && this.f2266c == ((Map) obj).size()) {
                int i13 = this.f2266c;
                for (0; i5 < i13; i5 + 1) {
                    Object[] objArr2 = this.f2265b;
                    int i14 = i5 << 1;
                    Object obj5 = objArr2[i14];
                    Object obj6 = objArr2[i14 + 1];
                    Object obj7 = ((Map) obj).get(obj5);
                    if (obj6 == null) {
                        i5 = (obj7 == null && ((Map) obj).containsKey(obj5)) ? i5 + 1 : 0;
                    } else if (obj6.equals(obj7)) {
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f2264a;
        Object[] objArr = this.f2265b;
        int i5 = this.f2266c;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i5) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public final String toString() {
        int i5 = this.f2266c;
        if (i5 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(i5 * 28);
        sb2.append('{');
        int i10 = this.f2266c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            int i12 = i11 << 1;
            Object obj = this.f2265b[i12];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object obj2 = this.f2265b[i12 + 1];
            if (obj2 != this) {
                sb2.append(obj2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC3340k.d(string, "buffer.toString()");
        return string;
    }
}
