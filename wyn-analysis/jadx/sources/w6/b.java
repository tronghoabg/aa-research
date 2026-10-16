package W6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import l7.AbstractC3398b;
import l7.C3397a;

/* loaded from: classes3.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new T6.f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f15167f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15168a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15169b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f15170c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15171d;

    /* renamed from: e, reason: collision with root package name */
    public d f15172e;

    static {
        HashMap map = new HashMap();
        f15167f = map;
        map.put("authenticatorData", new C3397a(11, true, 11, true, "authenticatorData", 2, e.class));
        map.put("progress", new C3397a(11, false, 11, false, "progress", 4, d.class));
    }

    public b(HashSet hashSet, int i5, ArrayList arrayList, int i10, d dVar) {
        this.f15168a = hashSet;
        this.f15169b = i5;
        this.f15170c = arrayList;
        this.f15171d = i10;
        this.f15172e = dVar;
    }

    @Override // l7.AbstractC3398b
    public final void addConcreteTypeArrayInternal(C3397a c3397a, String str, ArrayList arrayList) {
        int i5 = c3397a.f40018g;
        if (i5 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i5), arrayList.getClass().getCanonicalName()));
        }
        this.f15170c = arrayList;
        this.f15168a.add(Integer.valueOf(i5));
    }

    @Override // l7.AbstractC3398b
    public final void addConcreteTypeInternal(C3397a c3397a, String str, AbstractC3398b abstractC3398b) {
        int i5 = c3397a.f40018g;
        if (i5 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i5), abstractC3398b.getClass().getCanonicalName()));
        }
        this.f15172e = (d) abstractC3398b;
        this.f15168a.add(Integer.valueOf(i5));
    }

    @Override // l7.AbstractC3398b
    public final /* synthetic */ Map getFieldMappings() {
        return f15167f;
    }

    @Override // l7.AbstractC3398b
    public final Object getFieldValue(C3397a c3397a) {
        int i5 = c3397a.f40018g;
        if (i5 == 1) {
            return Integer.valueOf(this.f15169b);
        }
        if (i5 == 2) {
            return this.f15170c;
        }
        if (i5 == 4) {
            return this.f15172e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c3397a.f40018g);
    }

    @Override // l7.AbstractC3398b
    public final boolean isFieldSet(C3397a c3397a) {
        return this.f15168a.contains(Integer.valueOf(c3397a.f40018g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        HashSet hashSet = this.f15168a;
        if (hashSet.contains(1)) {
            AbstractC1304a.k0(parcel, 1, 4);
            parcel.writeInt(this.f15169b);
        }
        if (hashSet.contains(2)) {
            AbstractC1304a.e0(parcel, 2, this.f15170c, true);
        }
        if (hashSet.contains(3)) {
            AbstractC1304a.k0(parcel, 3, 4);
            parcel.writeInt(this.f15171d);
        }
        if (hashSet.contains(4)) {
            AbstractC1304a.Z(parcel, 4, this.f15172e, i5, true);
        }
        AbstractC1304a.m0(iL0, parcel);
    }
}
