package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import f4.C2555b;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: v7.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4331z extends AbstractC2614a {
    public static final Parcelable.Creator<C4331z> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final E f47021a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f47022b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f47023c;

    static {
        zzbc.zzk(zzh.zza, zzh.zzb);
        CREATOR = new C2555b(29);
    }

    public C4331z(String str, byte[] bArr, ArrayList arrayList) {
        AbstractC1732v.i(str);
        try {
            this.f47021a = E.c(str);
            AbstractC1732v.i(bArr);
            this.f47022b = bArr;
            this.f47023c = arrayList;
        } catch (D e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4331z)) {
            return false;
        }
        C4331z c4331z = (C4331z) obj;
        if (!this.f47021a.equals(c4331z.f47021a) || !Arrays.equals(this.f47022b, c4331z.f47022b)) {
            return false;
        }
        ArrayList arrayList = this.f47023c;
        ArrayList arrayList2 = c4331z.f47023c;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47021a, Integer.valueOf(Arrays.hashCode(this.f47022b)), this.f47023c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        this.f47021a.getClass();
        AbstractC1304a.a0(parcel, 2, "public-key", false);
        AbstractC1304a.T(parcel, 3, this.f47022b, false);
        AbstractC1304a.e0(parcel, 4, this.f47023c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
