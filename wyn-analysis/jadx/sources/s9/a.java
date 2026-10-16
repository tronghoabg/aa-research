package s9;

import A.AbstractC0213f;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final c f45354e = new c(0, b.f45360d);

    /* renamed from: f, reason: collision with root package name */
    public static final q6.d f45355f = new q6.d(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f45356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45357b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f45358c;

    /* renamed from: d, reason: collision with root package name */
    public final c f45359d;

    public a(int i5, String str, ArrayList arrayList, c cVar) {
        this.f45356a = i5;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f45357b = str;
        this.f45358c = arrayList;
        if (cVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f45359d = cVar;
    }

    public final d a() {
        Iterator it = this.f45358c.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (AbstractC0213f.b(dVar.f45368b, 3)) {
                return dVar;
            }
        }
        return null;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f45358c.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!AbstractC0213f.b(dVar.f45368b, 3)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f45356a == aVar.f45356a && this.f45357b.equals(aVar.f45357b) && this.f45358c.equals(aVar.f45358c) && this.f45359d.equals(aVar.f45359d);
    }

    public final int hashCode() {
        return this.f45359d.hashCode() ^ ((((((this.f45356a ^ 1000003) * 1000003) ^ this.f45357b.hashCode()) * 1000003) ^ this.f45358c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "FieldIndex{indexId=" + this.f45356a + ", collectionGroup=" + this.f45357b + ", segments=" + this.f45358c + ", indexState=" + this.f45359d + "}";
    }
}
