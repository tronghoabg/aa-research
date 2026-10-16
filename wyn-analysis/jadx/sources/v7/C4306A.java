package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: v7.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4306A extends AbstractC2614a {
    public static final Parcelable.Creator<C4306A> CREATOR = new U(0);

    /* renamed from: a, reason: collision with root package name */
    public final E f46903a;

    /* renamed from: b, reason: collision with root package name */
    public final r f46904b;

    public C4306A(String str, int i5) {
        AbstractC1732v.i(str);
        try {
            this.f46903a = E.c(str);
            try {
                this.f46904b = r.c(i5);
            } catch (C4323q e7) {
                throw new IllegalArgumentException(e7);
            }
        } catch (D e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4306A)) {
            return false;
        }
        C4306A c4306a = (C4306A) obj;
        return this.f46903a.equals(c4306a.f46903a) && this.f46904b.equals(c4306a.f46904b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46903a, this.f46904b});
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, v7.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        this.f46903a.getClass();
        AbstractC1304a.a0(parcel, 2, "public-key", false);
        AbstractC1304a.X(parcel, 3, Integer.valueOf(this.f46904b.f46996a.a()));
        AbstractC1304a.m0(iL0, parcel);
    }
}
