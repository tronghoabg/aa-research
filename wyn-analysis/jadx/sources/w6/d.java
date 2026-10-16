package W6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.Map;
import l7.C3397a;
import x.C4412e;

/* loaded from: classes3.dex */
public final class d extends zzbz {
    public static final Parcelable.Creator<d> CREATOR = new T6.f(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C4412e f15173g;

    /* renamed from: a, reason: collision with root package name */
    public final int f15174a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f15175b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f15176c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f15177d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f15178e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f15179f;

    static {
        C4412e c4412e = new C4412e(0);
        f15173g = c4412e;
        c4412e.put("registered", C3397a.V(2, "registered"));
        c4412e.put("in_progress", C3397a.V(3, "in_progress"));
        c4412e.put("success", C3397a.V(4, "success"));
        c4412e.put("failed", C3397a.V(5, "failed"));
        c4412e.put("escrowed", C3397a.V(6, "escrowed"));
    }

    public d(int i5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f15174a = i5;
        this.f15175b = arrayList;
        this.f15176c = arrayList2;
        this.f15177d = arrayList3;
        this.f15178e = arrayList4;
        this.f15179f = arrayList5;
    }

    @Override // l7.AbstractC3398b
    public final Map getFieldMappings() {
        return f15173g;
    }

    @Override // l7.AbstractC3398b
    public final Object getFieldValue(C3397a c3397a) {
        switch (c3397a.f40018g) {
            case 1:
                return Integer.valueOf(this.f15174a);
            case 2:
                return this.f15175b;
            case 3:
                return this.f15176c;
            case 4:
                return this.f15177d;
            case 5:
                return this.f15178e;
            case 6:
                return this.f15179f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + c3397a.f40018g);
        }
    }

    @Override // l7.AbstractC3398b
    public final boolean isFieldSet(C3397a c3397a) {
        return true;
    }

    @Override // l7.AbstractC3398b
    public final void setStringsInternal(C3397a c3397a, String str, ArrayList arrayList) {
        int i5 = c3397a.f40018g;
        if (i5 == 2) {
            this.f15175b = arrayList;
            return;
        }
        if (i5 == 3) {
            this.f15176c = arrayList;
            return;
        }
        if (i5 == 4) {
            this.f15177d = arrayList;
        } else if (i5 == 5) {
            this.f15178e = arrayList;
        } else {
            if (i5 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i5)));
            }
            this.f15179f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f15174a);
        AbstractC1304a.c0(parcel, 2, this.f15175b);
        AbstractC1304a.c0(parcel, 3, this.f15176c);
        AbstractC1304a.c0(parcel, 4, this.f15177d);
        AbstractC1304a.c0(parcel, 5, this.f15178e);
        AbstractC1304a.c0(parcel, 6, this.f15179f);
        AbstractC1304a.m0(iL0, parcel);
    }
}
