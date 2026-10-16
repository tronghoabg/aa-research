package com.google.y.a.a.a;

import com.google.d.b.an;
import com.google.d.b.w;
import com.google.d.d.bn;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    private final bn f13416a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13417b;

    /* JADX WARN: Multi-variable type inference failed */
    b(bn bnVar) throws a {
        an.B(bnVar);
        this.f13416a = bnVar;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13416a.size(); i3++) {
            int iB = ((j) this.f13416a.get(i3)).b();
            if (i2 < iB) {
                i2 = iB;
            }
        }
        int i4 = i2 + 1;
        this.f13417b = i4;
        if (i4 > 8) {
            throw new a("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // com.google.y.a.a.a.j
    protected final int a() {
        return d((byte) -128);
    }

    @Override // com.google.y.a.a.a.j
    protected final int b() {
        return this.f13417b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int size;
        int size2;
        j jVar = (j) obj;
        if (a() != jVar.a()) {
            size = a();
            size2 = jVar.a();
        } else {
            bn bnVar = this.f13416a;
            int size3 = bnVar.size();
            bn bnVar2 = ((b) jVar).f13416a;
            if (size3 == bnVar2.size()) {
                for (int i2 = 0; i2 < bnVar.size(); i2++) {
                    int iCompareTo = ((j) bnVar.get(i2)).compareTo((j) bnVar2.get(i2));
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                return 0;
            }
            size = bnVar.size();
            size2 = bnVar2.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f13416a.equals(((b) obj).f13416a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a()), this.f13416a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        bn bnVar = this.f13416a;
        if (bnVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = bnVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((j) bnVar.get(i2)).toString().replace("\n", "\n  "));
        }
        w wVarB = w.b(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        wVarB.h(sb, arrayList);
        sb.append("\n]");
        return sb.toString();
    }
}
