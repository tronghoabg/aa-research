package W6;

import A7.AbstractC0279p0;
import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import l7.C3397a;

/* loaded from: classes3.dex */
public final class f extends zzbz {
    public static final Parcelable.Creator<f> CREATOR = new T6.f(6);

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f15187h;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15189b;

    /* renamed from: c, reason: collision with root package name */
    public String f15190c;

    /* renamed from: d, reason: collision with root package name */
    public int f15191d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f15192e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f15193f;

    /* renamed from: g, reason: collision with root package name */
    public final a f15194g;

    static {
        HashMap map = new HashMap();
        f15187h = map;
        map.put("accountType", new C3397a(7, false, 7, false, "accountType", 2, null));
        map.put("status", new C3397a(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new C3397a(8, false, 8, false, "transferBytes", 4, null));
    }

    public f(HashSet hashSet, int i5, String str, int i10, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f15188a = hashSet;
        this.f15189b = i5;
        this.f15190c = str;
        this.f15191d = i10;
        this.f15192e = bArr;
        this.f15193f = pendingIntent;
        this.f15194g = aVar;
    }

    @Override // l7.AbstractC3398b
    public final /* synthetic */ Map getFieldMappings() {
        return f15187h;
    }

    @Override // l7.AbstractC3398b
    public final Object getFieldValue(C3397a c3397a) {
        int i5 = c3397a.f40018g;
        if (i5 == 1) {
            return Integer.valueOf(this.f15189b);
        }
        if (i5 == 2) {
            return this.f15190c;
        }
        if (i5 == 3) {
            return Integer.valueOf(this.f15191d);
        }
        if (i5 == 4) {
            return this.f15192e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c3397a.f40018g);
    }

    @Override // l7.AbstractC3398b
    public final boolean isFieldSet(C3397a c3397a) {
        return this.f15188a.contains(Integer.valueOf(c3397a.f40018g));
    }

    @Override // l7.AbstractC3398b
    public final void setDecodedBytesInternal(C3397a c3397a, String str, byte[] bArr) {
        int i5 = c3397a.f40018g;
        if (i5 != 4) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Field with id=", " is not known to be a byte array."));
        }
        this.f15192e = bArr;
        this.f15188a.add(Integer.valueOf(i5));
    }

    @Override // l7.AbstractC3398b
    public final void setIntegerInternal(C3397a c3397a, String str, int i5) {
        int i10 = c3397a.f40018g;
        if (i10 != 3) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i10, "Field with id=", " is not known to be an int."));
        }
        this.f15191d = i5;
        this.f15188a.add(Integer.valueOf(i10));
    }

    @Override // l7.AbstractC3398b
    public final void setStringInternal(C3397a c3397a, String str, String str2) {
        int i5 = c3397a.f40018g;
        if (i5 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i5)));
        }
        this.f15190c = str2;
        this.f15188a.add(Integer.valueOf(i5));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        HashSet hashSet = this.f15188a;
        if (hashSet.contains(1)) {
            AbstractC1304a.k0(parcel, 1, 4);
            parcel.writeInt(this.f15189b);
        }
        if (hashSet.contains(2)) {
            AbstractC1304a.a0(parcel, 2, this.f15190c, true);
        }
        if (hashSet.contains(3)) {
            int i10 = this.f15191d;
            AbstractC1304a.k0(parcel, 3, 4);
            parcel.writeInt(i10);
        }
        if (hashSet.contains(4)) {
            AbstractC1304a.T(parcel, 4, this.f15192e, true);
        }
        if (hashSet.contains(5)) {
            AbstractC1304a.Z(parcel, 5, this.f15193f, i5, true);
        }
        if (hashSet.contains(6)) {
            AbstractC1304a.Z(parcel, 6, this.f15194g, i5, true);
        }
        AbstractC1304a.m0(iL0, parcel);
    }
}
