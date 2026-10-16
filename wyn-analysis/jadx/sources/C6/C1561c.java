package c6;

import E5.C0448e0;
import E5.T;
import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1561c implements W5.b {
    public static final Parcelable.Creator<C1561c> CREATOR = new C1559a(1);

    /* renamed from: a, reason: collision with root package name */
    public final long f19659a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19660b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19661c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19662d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19663e;

    public C1561c(long j8, long j10, long j11, long j12, long j13) {
        this.f19659a = j8;
        this.f19660b = j10;
        this.f19661c = j11;
        this.f19662d = j12;
        this.f19663e = j13;
    }

    @Override // W5.b
    public final /* synthetic */ T a() {
        return null;
    }

    @Override // W5.b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // W5.b
    public final /* synthetic */ void d(C0448e0 c0448e0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1561c.class == obj.getClass()) {
            C1561c c1561c = (C1561c) obj;
            if (this.f19659a == c1561c.f19659a && this.f19660b == c1561c.f19660b && this.f19661c == c1561c.f19661c && this.f19662d == c1561c.f19662d && this.f19663e == c1561c.f19663e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v0.O(this.f19663e) + ((v0.O(this.f19662d) + ((v0.O(this.f19661c) + ((v0.O(this.f19660b) + ((v0.O(this.f19659a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f19659a + ", photoSize=" + this.f19660b + ", photoPresentationTimestampUs=" + this.f19661c + ", videoStartPosition=" + this.f19662d + ", videoSize=" + this.f19663e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f19659a);
        parcel.writeLong(this.f19660b);
        parcel.writeLong(this.f19661c);
        parcel.writeLong(this.f19662d);
        parcel.writeLong(this.f19663e);
    }

    public C1561c(Parcel parcel) {
        this.f19659a = parcel.readLong();
        this.f19660b = parcel.readLong();
        this.f19661c = parcel.readLong();
        this.f19662d = parcel.readLong();
        this.f19663e = parcel.readLong();
    }
}
