package p9;

import A.AbstractC0213f;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: p9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3783d extends k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f43344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43345b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f43346c;

    public C3783d(int i5, List list) {
        this.f43344a = new ArrayList(list);
        this.f43345b = i5;
    }

    @Override // p9.k
    public final String a() {
        boolean z2;
        String str;
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f43344a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = e();
            } else if (((k) it.next()) instanceof C3783d) {
                break;
            }
        }
        if (z2) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb2.append(((k) it2.next()).a());
            }
            return sb2.toString();
        }
        int i5 = this.f43345b;
        if (i5 == 1) {
            str = "and";
        } else {
            if (i5 != 2) {
                throw null;
            }
            str = "or";
        }
        sb2.append(str.concat("("));
        sb2.append(TextUtils.join(",", arrayList));
        sb2.append(")");
        return sb2.toString();
    }

    @Override // p9.k
    public final List b() {
        return DesugarCollections.unmodifiableList(this.f43344a);
    }

    @Override // p9.k
    public final List c() {
        ArrayList arrayList = this.f43346c;
        if (arrayList != null) {
            return DesugarCollections.unmodifiableList(arrayList);
        }
        this.f43346c = new ArrayList();
        Iterator it = this.f43344a.iterator();
        while (it.hasNext()) {
            this.f43346c.addAll(((k) it.next()).c());
        }
        return DesugarCollections.unmodifiableList(this.f43346c);
    }

    @Override // p9.k
    public final boolean d(s9.k kVar) {
        boolean zE = e();
        ArrayList arrayList = this.f43344a;
        if (zE) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((k) it.next()).d(kVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((k) it2.next()).d(kVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.f43345b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3783d)) {
            return false;
        }
        C3783d c3783d = (C3783d) obj;
        return this.f43345b == c3783d.f43345b && this.f43344a.equals(c3783d.f43344a);
    }

    public final int hashCode() {
        return this.f43344a.hashCode() + AbstractC0213f.d(this.f43345b, 1147, 31);
    }

    public final String toString() {
        return a();
    }
}
