package okhttp3;

import Bf.k;
import Bf.r;
import Fe.c;
import com.google.android.gms.internal.consent_sdk.a;
import ef.C2527k;
import ff.t;
import ff.v;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import uf.InterfaceC4291a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/Headers;", "", "Lef/k;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Headers implements Iterable<C2527k>, InterfaceC4291a {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f42269b = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final String[] f42270a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f42271a = new ArrayList(20);

        public final void a(String name, String value) {
            AbstractC3340k.e(name, "name");
            AbstractC3340k.e(value, "value");
            Headers.f42269b.getClass();
            Companion.a(name);
            Companion.b(value, name);
            c(name, value);
        }

        public final void b(String str) {
            int iV0 = k.v0(str, ':', 1, 4);
            if (iV0 != -1) {
                String strSubstring = str.substring(0, iV0);
                AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iV0 + 1);
                AbstractC3340k.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return;
            }
            if (str.charAt(0) != ':') {
                c("", str);
                return;
            }
            String strSubstring3 = str.substring(1);
            AbstractC3340k.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
        }

        public final void c(String name, String value) {
            AbstractC3340k.e(name, "name");
            AbstractC3340k.e(value, "value");
            ArrayList arrayList = this.f42271a;
            arrayList.add(name);
            arrayList.add(k.V0(value).toString());
        }

        public final Headers d() {
            Object[] array = this.f42271a.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String e(String name) {
            AbstractC3340k.e(name, "name");
            ArrayList arrayList = this.f42271a;
            int size = arrayList.size() - 2;
            int iT = c.t(size, 0, -2);
            if (iT > size) {
                return null;
            }
            while (true) {
                int i5 = size - 2;
                if (name.equalsIgnoreCase((String) arrayList.get(size))) {
                    return (String) arrayList.get(size + 1);
                }
                if (size == iT) {
                    return null;
                }
                size = i5;
            }
        }

        public final void f(String name) {
            AbstractC3340k.e(name, "name");
            int i5 = 0;
            while (true) {
                ArrayList arrayList = this.f42271a;
                if (i5 >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i5))) {
                    arrayList.remove(i5);
                    arrayList.remove(i5);
                    i5 -= 2;
                }
                i5 += 2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i5 = 0;
            while (i5 < length) {
                int i10 = i5 + 1;
                char cCharAt = str.charAt(i5);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i5), str).toString());
                }
                i5 = i10;
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            int i5 = 0;
            while (i5 < length) {
                int i10 = i5 + 1;
                char cCharAt = str.charAt(i5);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    throw new IllegalArgumentException(AbstractC3340k.k(Util.p(str2) ? "" : AbstractC3340k.k(str, ": "), Util.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i5), str2)).toString());
                }
                i5 = i10;
            }
        }

        public static Headers c(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i5 = 0;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                String str = strArr2[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i10] = k.V0(str).toString();
                i10 = i11;
            }
            int iT = c.t(0, strArr2.length - 1, 2);
            if (iT >= 0) {
                while (true) {
                    int i12 = i5 + 2;
                    String str2 = strArr2[i5];
                    String str3 = strArr2[i5 + 1];
                    a(str2);
                    b(str3, str2);
                    if (i5 == iT) {
                        break;
                    }
                    i5 = i12;
                }
            }
            return new Headers(strArr2);
        }

        private Companion() {
        }
    }

    public Headers(String[] strArr) {
        this.f42270a = strArr;
    }

    public final String a(String name) {
        AbstractC3340k.e(name, "name");
        f42269b.getClass();
        String[] strArr = this.f42270a;
        int length = strArr.length - 2;
        int iT = c.t(length, 0, -2);
        if (iT > length) {
            return null;
        }
        while (true) {
            int i5 = length - 2;
            if (r.c0(name, strArr[length], true)) {
                return strArr[length + 1];
            }
            if (length == iT) {
                return null;
            }
            length = i5;
        }
    }

    public final String c(int i5) {
        return this.f42270a[i5 * 2];
    }

    public final Builder d() {
        Builder builder = new Builder();
        t.f0(builder.f42271a, this.f42270a);
        return builder;
    }

    public final Map e() {
        r.d0();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        int i5 = 0;
        while (i5 < size) {
            int i10 = i5 + 1;
            String strC = c(i5);
            Locale locale = Locale.US;
            String strV = a.v(locale, "US", strC, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strV);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strV, arrayList);
            }
            arrayList.add(f(i5));
            i5 = i10;
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.f42270a, ((Headers) obj).f42270a);
        }
        return false;
    }

    public final String f(int i5) {
        return this.f42270a[(i5 * 2) + 1];
    }

    public final List g(String name) {
        AbstractC3340k.e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i5 = 0;
        while (i5 < size) {
            int i10 = i5 + 1;
            if (name.equalsIgnoreCase(c(i5))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i5));
            }
            i5 = i10;
        }
        if (arrayList == null) {
            return v.f35432a;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        AbstractC3340k.d(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42270a);
    }

    @Override // java.lang.Iterable
    public final Iterator<C2527k> iterator() {
        int size = size();
        C2527k[] c2527kArr = new C2527k[size];
        for (int i5 = 0; i5 < size; i5++) {
            c2527kArr[i5] = new C2527k(c(i5), f(i5));
        }
        return AbstractC3340k.i(c2527kArr);
    }

    public final int size() {
        return this.f42270a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i5 = 0;
        while (i5 < size) {
            int i10 = i5 + 1;
            String strC = c(i5);
            String strF = f(i5);
            sb2.append(strC);
            sb2.append(": ");
            if (Util.p(strC)) {
                strF = "██";
            }
            sb2.append(strF);
            sb2.append("\n");
            i5 = i10;
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
