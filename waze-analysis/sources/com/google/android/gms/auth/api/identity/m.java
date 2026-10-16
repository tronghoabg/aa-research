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
public final class m extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<m> CREATOR = new n(0);

    /* renamed from: a, reason: collision with root package name */
    private final l f4526a;

    /* renamed from: b, reason: collision with root package name */
    private final f f4527b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4528c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4529d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4530e;

    /* renamed from: f, reason: collision with root package name */
    private final j f4531f;

    /* renamed from: g, reason: collision with root package name */
    private final h f4532g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f4533h;

    m(l lVar, f fVar, String str, boolean z, int i2, j jVar, h hVar, boolean z2) {
        av.m(lVar);
        this.f4526a = lVar;
        av.m(fVar);
        this.f4527b = fVar;
        this.f4528c = str;
        this.f4529d = z;
        this.f4530e = i2;
        if (jVar == null) {
            i iVar = new i();
            iVar.d(false);
            jVar = iVar.a();
        }
        this.f4531f = jVar;
        if (hVar == null) {
            g gVar = new g();
            gVar.c(false);
            hVar = gVar.a();
        }
        this.f4532g = hVar;
        this.f4533h = z2;
    }

    public static e a(m mVar) {
        e eVar = new e();
        eVar.c(mVar.f4527b);
        eVar.f(mVar.f4526a);
        eVar.e(mVar.f4531f);
        eVar.d(mVar.f4532g);
        eVar.b(mVar.f4529d);
        eVar.i(mVar.f4530e);
        eVar.g(mVar.f4533h);
        String str = mVar.f4528c;
        if (str != null) {
            eVar.h(str);
        }
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.f4526a, mVar.f4526a) && Objects.equals(this.f4527b, mVar.f4527b) && Objects.equals(this.f4531f, mVar.f4531f) && Objects.equals(this.f4532g, mVar.f4532g) && Objects.equals(this.f4528c, mVar.f4528c) && this.f4529d == mVar.f4529d && this.f4530e == mVar.f4530e && this.f4533h == mVar.f4533h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4526a, this.f4527b, this.f4531f, this.f4532g, this.f4528c, Boolean.valueOf(this.f4529d), Integer.valueOf(this.f4530e), Boolean.valueOf(this.f4533h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        l lVar = this.f4526a;
        int iD = bb.d(parcel);
        bb.t(parcel, 1, lVar, i2);
        bb.t(parcel, 2, this.f4527b, i2);
        bb.u(parcel, 3, this.f4528c);
        bb.f(parcel, 4, this.f4529d);
        bb.g(parcel, 5, this.f4530e);
        bb.t(parcel, 6, this.f4531f, i2);
        bb.t(parcel, 7, this.f4532g, i2);
        bb.f(parcel, 8, this.f4533h);
        bb.e(parcel, iD);
    }
}
