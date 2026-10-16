package com.google.y.a.a.a;

import com.google.d.b.an;
import com.google.d.b.v;
import com.google.d.b.w;
import com.google.d.d.cn;
import com.google.d.d.fu;
import j$.util.Objects;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends j {

    /* renamed from: a, reason: collision with root package name */
    private final int f13421a;

    /* renamed from: b, reason: collision with root package name */
    private final cn f13422b;

    g(cn cnVar) throws a {
        an.B(cnVar);
        this.f13422b = cnVar;
        fu fuVarListIterator = cnVar.entrySet().listIterator();
        int i2 = 0;
        while (fuVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) fuVarListIterator.next();
            int iB = ((j) entry.getKey()).b();
            i2 = i2 < iB ? iB : i2;
            int iB2 = ((j) entry.getValue()).b();
            if (i2 < iB2) {
                i2 = iB2;
            }
        }
        int i3 = i2 + 1;
        this.f13421a = i3;
        if (i3 > 8) {
            throw new a("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // com.google.y.a.a.a.j
    protected final int a() {
        return d((byte) -96);
    }

    @Override // com.google.y.a.a.a.j
    protected final int b() {
        return this.f13421a;
    }

    public final cn c() {
        return this.f13422b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iCompareTo;
        int size;
        int size2;
        j jVar = (j) obj;
        if (a() != jVar.a()) {
            size = a();
            size2 = jVar.a();
        } else {
            cn cnVar = this.f13422b;
            int size3 = cnVar.size();
            cn cnVar2 = ((g) jVar).f13422b;
            if (size3 == cnVar2.size()) {
                fu fuVarListIterator = cnVar.entrySet().listIterator();
                fu fuVarListIterator2 = cnVar2.entrySet().listIterator();
                do {
                    if (!fuVarListIterator.hasNext() && !fuVarListIterator2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) fuVarListIterator.next();
                    Map.Entry entry2 = (Map.Entry) fuVarListIterator2.next();
                    int iCompareTo2 = ((j) entry.getKey()).compareTo((j) entry2.getKey());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                    iCompareTo = ((j) entry.getValue()).compareTo((j) entry2.getValue());
                } while (iCompareTo == 0);
                return iCompareTo;
            }
            size = cnVar.size();
            size2 = cnVar2.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f13422b.equals(((g) obj).f13422b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a()), this.f13422b);
    }

    public final String toString() throws IOException {
        cn cnVar = this.f13422b;
        if (cnVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fu fuVarListIterator = cnVar.entrySet().listIterator();
        while (fuVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) fuVarListIterator.next();
            linkedHashMap.put(((j) entry.getKey()).toString().replace("\n", "\n  "), ((j) entry.getValue()).toString().replace("\n", "\n  "));
        }
        v vVarA = w.b(",\n  ").a(" : ");
        StringBuilder sb = new StringBuilder("{\n  ");
        vVarA.a(sb, linkedHashMap.entrySet());
        sb.append("\n}");
        return sb.toString();
    }
}
