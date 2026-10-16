package x7;

import A.AbstractC0213f;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.identity.zzer;
import com.unity3d.services.UnityAdsConstants;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;

/* renamed from: x7.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4493e extends AbstractC2614a {
    public static final Parcelable.Creator<C4493e> CREATOR = new C4381i(23);

    /* renamed from: a, reason: collision with root package name */
    public final float[] f47777a;

    /* renamed from: b, reason: collision with root package name */
    public final float f47778b;

    /* renamed from: c, reason: collision with root package name */
    public final float f47779c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47780d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f47781e;

    /* renamed from: f, reason: collision with root package name */
    public final float f47782f;

    /* renamed from: g, reason: collision with root package name */
    public final float f47783g;

    public C4493e(float[] fArr, float f10, float f11, long j8, byte b5, float f12, float f13) {
        zzer.zzb(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        zzer.zzb((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true, "Input attitude cannot contain NaNs.");
        zzer.zza(f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 < 360.0f);
        zzer.zza(f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 <= 180.0f);
        zzer.zza(f13 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f13 <= 180.0f);
        zzer.zza(j8 >= 0);
        this.f47777a = fArr;
        this.f47778b = f10;
        this.f47779c = f11;
        this.f47782f = f12;
        this.f47783g = f13;
        this.f47780d = j8;
        this.f47781e = (byte) (((byte) (((byte) (b5 | 16)) | 4)) | 8);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4493e) {
                C4493e c4493e = (C4493e) obj;
                byte b5 = this.f47781e;
                boolean z2 = ((b5 & 32) != 0) == ((c4493e.f47781e & 32) != 0) && ((b5 & 32) == 0 || Float.compare(this.f47782f, c4493e.f47782f) == 0);
                boolean z10 = ((b5 & 64) != 0) == ((c4493e.f47781e & 64) != 0) && ((b5 & 64) == 0 || Float.compare(this.f47783g, c4493e.f47783g) == 0);
                if (Float.compare(this.f47778b, c4493e.f47778b) != 0 || Float.compare(this.f47779c, c4493e.f47779c) != 0 || !z2 || !z10 || this.f47780d != c4493e.f47780d || !Arrays.equals(this.f47777a, c4493e.f47777a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f47778b), Float.valueOf(this.f47779c), Float.valueOf(this.f47783g), Long.valueOf(this.f47780d), this.f47777a, Byte.valueOf(this.f47781e)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientation[attitude=");
        sb2.append(Arrays.toString(this.f47777a));
        sb2.append(", headingDegrees=");
        sb2.append(this.f47778b);
        sb2.append(", headingErrorDegrees=");
        sb2.append(this.f47779c);
        if ((this.f47781e & 64) != 0) {
            sb2.append(", conservativeHeadingErrorDegrees=");
            sb2.append(this.f47783g);
        }
        sb2.append(", elapsedRealtimeNs=");
        return AbstractC0213f.e(sb2, this.f47780d, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        float[] fArr = (float[]) this.f47777a.clone();
        int iL02 = AbstractC1304a.l0(1, parcel);
        parcel.writeFloatArray(fArr);
        AbstractC1304a.m0(iL02, parcel);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeFloat(this.f47778b);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeFloat(this.f47779c);
        AbstractC1304a.k0(parcel, 6, 8);
        parcel.writeLong(this.f47780d);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f47781e);
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeFloat(this.f47782f);
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeFloat(this.f47783g);
        AbstractC1304a.m0(iL0, parcel);
    }
}
