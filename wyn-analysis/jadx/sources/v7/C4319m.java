package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* renamed from: v7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4319m extends AbstractC2614a {
    public static final Parcelable.Creator<C4319m> CREATOR = new U(21);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC4309c f46986a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f46987b;

    /* renamed from: c, reason: collision with root package name */
    public final W f46988c;

    /* renamed from: d, reason: collision with root package name */
    public final I f46989d;

    public C4319m(String str, Boolean bool, String str2, String str3) {
        EnumC4309c enumC4309cC;
        I iC = null;
        if (str == null) {
            enumC4309cC = null;
        } else {
            try {
                enumC4309cC = EnumC4309c.c(str);
            } catch (H | V | C4308b e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f46986a = enumC4309cC;
        this.f46987b = bool;
        this.f46988c = str2 == null ? null : W.c(str2);
        if (str3 != null) {
            iC = I.c(str3);
        }
        this.f46989d = iC;
    }

    public final I V() {
        I i5 = this.f46989d;
        if (i5 != null) {
            return i5;
        }
        Boolean bool = this.f46987b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return I.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4319m)) {
            return false;
        }
        C4319m c4319m = (C4319m) obj;
        return AbstractC1732v.m(this.f46986a, c4319m.f46986a) && AbstractC1732v.m(this.f46987b, c4319m.f46987b) && AbstractC1732v.m(this.f46988c, c4319m.f46988c) && AbstractC1732v.m(V(), c4319m.V());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46986a, this.f46987b, this.f46988c, V()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        EnumC4309c enumC4309c = this.f46986a;
        AbstractC1304a.a0(parcel, 2, enumC4309c == null ? null : enumC4309c.f46955a, false);
        AbstractC1304a.R(parcel, 3, this.f46987b);
        W w2 = this.f46988c;
        AbstractC1304a.a0(parcel, 4, w2 == null ? null : w2.f46943a, false);
        AbstractC1304a.a0(parcel, 5, V() != null ? V().f46927a : null, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
