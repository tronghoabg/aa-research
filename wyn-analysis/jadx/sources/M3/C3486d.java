package m3;

import Bf.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: m3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3486d {

    /* renamed from: a, reason: collision with root package name */
    public final String f40345a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40346b;

    /* renamed from: c, reason: collision with root package name */
    public final List f40347c;

    /* renamed from: d, reason: collision with root package name */
    public final List f40348d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public C3486d(String str, boolean z2, List columns, List orders) {
        AbstractC3340k.e(columns, "columns");
        AbstractC3340k.e(orders, "orders");
        this.f40345a = str;
        this.f40346b = z2;
        this.f40347c = columns;
        this.f40348d = orders;
        List arrayList = orders;
        if (arrayList.isEmpty()) {
            int size = columns.size();
            arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add("ASC");
            }
        }
        this.f40348d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3486d) {
            C3486d c3486d = (C3486d) obj;
            if (this.f40346b == c3486d.f40346b && AbstractC3340k.a(this.f40347c, c3486d.f40347c) && AbstractC3340k.a(this.f40348d, c3486d.f40348d)) {
                String str = this.f40345a;
                boolean zK0 = r.k0(str, "index_", false);
                String str2 = c3486d.f40345a;
                return zK0 ? r.k0(str2, "index_", false) : str.equals(str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f40345a;
        return this.f40348d.hashCode() + ((this.f40347c.hashCode() + ((((r.k0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f40346b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f40345a + "', unique=" + this.f40346b + ", columns=" + this.f40347c + ", orders=" + this.f40348d + "'}";
    }
}
