package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.srf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConsentInformation> CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    public static class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator<AccountConsentInformation> CREATOR = new srf(16);
        public final String a;
        public final byte[] b;
        public final List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            return Objects.equals(this.a, accountConsentInformation.a) && Arrays.equals(this.b, accountConsentInformation.b) && Objects.equals(this.c, accountConsentInformation.c);
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int iL = spu.l(parcel, 20293);
            spu.F(parcel, 1, str);
            spu.v(parcel, 2, this.b);
            spu.A(parcel, 3, new ArrayList(this.c));
            spu.m(parcel, iL);
        }
    }

    static {
        new ConsentInformation(null, false, false);
        CREATOR = new srf(17);
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        return Objects.equals(this.c, consentInformation.c) && Objects.equals(Boolean.valueOf(this.a), Boolean.valueOf(consentInformation.a));
    }

    public final int hashCode() {
        return Objects.hash(this.c, Boolean.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, new ArrayList(this.c));
        spu.n(parcel, 2, this.a);
        spu.n(parcel, 3, this.b);
        spu.m(parcel, iL);
    }
}
