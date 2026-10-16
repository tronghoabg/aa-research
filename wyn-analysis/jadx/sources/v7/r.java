package v7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new U(24);

    /* renamed from: a, reason: collision with root package name */
    public final Enum f46996a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(InterfaceC4307a interfaceC4307a) {
        this.f46996a = (Enum) interfaceC4307a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r c(int i5) throws C4323q {
        G g9;
        if (i5 == -262) {
            g9 = G.RS1;
        } else {
            G[] gArrValues = G.values();
            int length = gArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    for (EnumC4324s enumC4324s : EnumC4324s.values()) {
                        if (enumC4324s.f46998a == i5) {
                            g9 = enumC4324s;
                        }
                    }
                    throw new C4323q(AbstractC0279p0.i(i5, "Algorithm with COSE value ", " not supported"));
                }
                G g10 = gArrValues[i10];
                if (g10.f46924a == i5) {
                    g9 = g10;
                    break;
                }
                i10++;
            }
        }
        return new r(g9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, v7.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, v7.a] */
    public final boolean equals(Object obj) {
        return (obj instanceof r) && this.f46996a.a() == ((r) obj).f46996a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46996a});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, v7.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f46996a.a());
    }
}
