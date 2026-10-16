package W6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import l7.AbstractC3398b;
import l7.C3397a;

/* loaded from: classes3.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new T6.f(5);

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f15180g;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15181a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15182b;

    /* renamed from: c, reason: collision with root package name */
    public f f15183c;

    /* renamed from: d, reason: collision with root package name */
    public String f15184d;

    /* renamed from: e, reason: collision with root package name */
    public String f15185e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15186f;

    static {
        HashMap map = new HashMap();
        f15180g = map;
        map.put("authenticatorInfo", new C3397a(11, false, 11, false, "authenticatorInfo", 2, f.class));
        map.put(InAppPurchaseMetaData.KEY_SIGNATURE, new C3397a(7, false, 7, false, InAppPurchaseMetaData.KEY_SIGNATURE, 3, null));
        map.put("package", new C3397a(7, false, 7, false, "package", 4, null));
    }

    public e(HashSet hashSet, int i5, f fVar, String str, String str2, String str3) {
        this.f15181a = hashSet;
        this.f15182b = i5;
        this.f15183c = fVar;
        this.f15184d = str;
        this.f15185e = str2;
        this.f15186f = str3;
    }

    @Override // l7.AbstractC3398b
    public final void addConcreteTypeInternal(C3397a c3397a, String str, AbstractC3398b abstractC3398b) {
        int i5 = c3397a.f40018g;
        if (i5 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i5), abstractC3398b.getClass().getCanonicalName()));
        }
        this.f15183c = (f) abstractC3398b;
        this.f15181a.add(Integer.valueOf(i5));
    }

    @Override // l7.AbstractC3398b
    public final /* synthetic */ Map getFieldMappings() {
        return f15180g;
    }

    @Override // l7.AbstractC3398b
    public final Object getFieldValue(C3397a c3397a) {
        int i5 = c3397a.f40018g;
        if (i5 == 1) {
            return Integer.valueOf(this.f15182b);
        }
        if (i5 == 2) {
            return this.f15183c;
        }
        if (i5 == 3) {
            return this.f15184d;
        }
        if (i5 == 4) {
            return this.f15185e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c3397a.f40018g);
    }

    @Override // l7.AbstractC3398b
    public final boolean isFieldSet(C3397a c3397a) {
        return this.f15181a.contains(Integer.valueOf(c3397a.f40018g));
    }

    @Override // l7.AbstractC3398b
    public final void setStringInternal(C3397a c3397a, String str, String str2) {
        int i5 = c3397a.f40018g;
        if (i5 == 3) {
            this.f15184d = str2;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i5)));
            }
            this.f15185e = str2;
        }
        this.f15181a.add(Integer.valueOf(i5));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        HashSet hashSet = this.f15181a;
        if (hashSet.contains(1)) {
            AbstractC1304a.k0(parcel, 1, 4);
            parcel.writeInt(this.f15182b);
        }
        if (hashSet.contains(2)) {
            AbstractC1304a.Z(parcel, 2, this.f15183c, i5, true);
        }
        if (hashSet.contains(3)) {
            AbstractC1304a.a0(parcel, 3, this.f15184d, true);
        }
        if (hashSet.contains(4)) {
            AbstractC1304a.a0(parcel, 4, this.f15185e, true);
        }
        if (hashSet.contains(5)) {
            AbstractC1304a.a0(parcel, 5, this.f15186f, true);
        }
        AbstractC1304a.m0(iL0, parcel);
    }
}
