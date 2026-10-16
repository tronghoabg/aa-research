package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class u extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<u> CREATOR = new n(7);

    /* renamed from: a, reason: collision with root package name */
    private final y f4555a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4556b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4557c;

    u(y yVar, String str, int i2) {
        av.m(yVar);
        this.f4555a = yVar;
        this.f4556b = str;
        this.f4557c = i2;
    }

    public static t a(u uVar) {
        t tVar = new t();
        tVar.c(uVar.f4555a);
        tVar.d(uVar.f4557c);
        String str = uVar.f4556b;
        if (str != null) {
            tVar.b(str);
        }
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Objects.equals(this.f4555a, uVar.f4555a) && Objects.equals(this.f4556b, uVar.f4556b) && this.f4557c == uVar.f4557c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4555a, this.f4556b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        y yVar = this.f4555a;
        int iD = bb.d(parcel);
        bb.t(parcel, 1, yVar, i2);
        bb.u(parcel, 2, this.f4556b);
        bb.g(parcel, 3, this.f4557c);
        bb.e(parcel, iD);
    }
}
