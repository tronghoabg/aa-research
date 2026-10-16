package K8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: K8.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0697i extends AbstractC2614a {
    public static final Parcelable.Creator<C0697i> CREATOR = new C0691c(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6646a;

    /* renamed from: b, reason: collision with root package name */
    public final C0698j f6647b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6648c;

    /* renamed from: d, reason: collision with root package name */
    public final J8.I f6649d;

    /* renamed from: e, reason: collision with root package name */
    public final C0693e f6650e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6651f;

    public C0697i(ArrayList arrayList, C0698j c0698j, String str, J8.I i5, C0693e c0693e, ArrayList arrayList2) {
        AbstractC1732v.i(arrayList);
        this.f6646a = arrayList;
        AbstractC1732v.i(c0698j);
        this.f6647b = c0698j;
        AbstractC1732v.f(str);
        this.f6648c = str;
        this.f6649d = i5;
        this.f6650e = c0693e;
        AbstractC1732v.i(arrayList2);
        this.f6651f = arrayList2;
    }

    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6646a.iterator();
        while (it.hasNext()) {
            arrayList.add((J8.z) it.next());
        }
        Iterator it2 = this.f6651f.iterator();
        while (it2.hasNext()) {
            arrayList.add((J8.C) it2.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f6646a, false);
        AbstractC1304a.Z(parcel, 2, this.f6647b, i5, false);
        AbstractC1304a.a0(parcel, 3, this.f6648c, false);
        AbstractC1304a.Z(parcel, 4, this.f6649d, i5, false);
        AbstractC1304a.Z(parcel, 5, this.f6650e, i5, false);
        AbstractC1304a.e0(parcel, 6, this.f6651f, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
