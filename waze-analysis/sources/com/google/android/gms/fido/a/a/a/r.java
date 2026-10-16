package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<r> CREATOR = new e(7, null);

    /* renamed from: a, reason: collision with root package name */
    private final d f5431a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f5432b;

    /* renamed from: c, reason: collision with root package name */
    private final bd f5433c;

    /* renamed from: d, reason: collision with root package name */
    private final aw f5434d;

    r(String str, Boolean bool, String str2, String str3) {
        d dVarA;
        aw awVarA = null;
        if (str == null) {
            dVarA = null;
        } else {
            try {
                dVarA = d.a(str);
            } catch (av | bc | c e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        this.f5431a = dVarA;
        this.f5432b = bool;
        this.f5433c = str2 == null ? null : bd.a(str2);
        if (str3 != null) {
            awVarA = aw.a(str3);
        }
        this.f5434d = awVarA;
    }

    public final aw a() {
        aw awVar = this.f5434d;
        if (awVar != null) {
            return awVar;
        }
        Boolean bool = this.f5432b;
        return (bool == null || !bool.booleanValue()) ? aw.RESIDENT_KEY_DISCOURAGED : aw.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Objects.equals(this.f5431a, rVar.f5431a) && Objects.equals(this.f5432b, rVar.f5432b) && Objects.equals(this.f5433c, rVar.f5433c) && Objects.equals(a(), rVar.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5431a, this.f5432b, this.f5433c, a()});
    }

    public final String toString() {
        aw awVar = this.f5434d;
        bd bdVar = this.f5433c;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.f5431a) + ", \n requireResidentKey=" + this.f5432b + ", \n requireUserVerification=" + String.valueOf(bdVar) + ", \n residentKeyRequirement=" + String.valueOf(awVar) + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        d dVar = this.f5431a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 2, dVar == null ? null : dVar.toString());
        com.google.android.gms.common.internal.bb.j(parcel, this.f5432b);
        bd bdVar = this.f5433c;
        com.google.android.gms.common.internal.bb.u(parcel, 4, bdVar == null ? null : bdVar.toString());
        aw awVarA = a();
        com.google.android.gms.common.internal.bb.u(parcel, 5, awVarA != null ? awVarA.toString() : null);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
