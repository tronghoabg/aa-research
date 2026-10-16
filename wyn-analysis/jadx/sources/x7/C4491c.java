package x7;

import A7.R0;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import ka.AbstractC3256n;
import w7.C4381i;

/* renamed from: x7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4491c extends AbstractC2614a {
    public static final Parcelable.Creator<C4491c> CREATOR = new C4381i(21);

    /* renamed from: e, reason: collision with root package name */
    public static final R0 f47764e = new R0(17);

    /* renamed from: a, reason: collision with root package name */
    public final List f47765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47766b;

    /* renamed from: c, reason: collision with root package name */
    public final List f47767c;

    /* renamed from: d, reason: collision with root package name */
    public String f47768d;

    public C4491c(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        AbstractC1732v.j(arrayList, "transitions can't be null");
        AbstractC1732v.a("transitions can't be empty.", !arrayList.isEmpty());
        TreeSet treeSet = new TreeSet(f47764e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4490b c4490b = (C4490b) it.next();
            AbstractC1732v.a("Found duplicated transition: " + c4490b + ".", treeSet.add(c4490b));
        }
        this.f47765a = DesugarCollections.unmodifiableList(arrayList);
        this.f47766b = str;
        this.f47767c = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
        this.f47768d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4491c.class == obj.getClass()) {
            C4491c c4491c = (C4491c) obj;
            if (AbstractC1732v.m(this.f47765a, c4491c.f47765a) && AbstractC1732v.m(this.f47766b, c4491c.f47766b) && AbstractC1732v.m(this.f47768d, c4491c.f47768d) && AbstractC1732v.m(this.f47767c, c4491c.f47767c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f47765a.hashCode() * 31;
        String str = this.f47766b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f47767c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f47768d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f47765a);
        String strValueOf2 = String.valueOf(this.f47767c);
        String str = this.f47768d;
        int length = strValueOf.length();
        String str2 = this.f47766b;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + strValueOf2.length() + 18 + String.valueOf(str).length() + 1);
        AbstractC3256n.p(sb2, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str2);
        AbstractC3256n.p(sb2, "', mClients=", strValueOf2, ", mAttributionTag=", str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        AbstractC1732v.i(parcel);
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f47765a, false);
        AbstractC1304a.a0(parcel, 2, this.f47766b, false);
        AbstractC1304a.e0(parcel, 3, this.f47767c, false);
        AbstractC1304a.a0(parcel, 4, this.f47768d, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
