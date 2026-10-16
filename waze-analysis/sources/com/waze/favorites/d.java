package com.waze.favorites;

import com.waze.R;
import com.waze.an.c.w;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.navigate.AddressItem;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements com.waze.destination_cell.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23799a;

    /* renamed from: b, reason: collision with root package name */
    private final w f23800b;

    public d(w wVar, boolean z) {
        x.f(wVar, "favorite");
        this.f23800b = wVar;
        this.f23799a = z;
    }

    @Override // com.waze.destination_cell.a.a
    public final int a() {
        Favorite.Type typeD = this.f23800b.d();
        Favorite.Type type = Favorite.Type.DEFAULT;
        int iOrdinal = typeD.ordinal();
        if (iOrdinal == 0) {
            return -1;
        }
        if (iOrdinal == 1) {
            return R.string.contentDescription_addressHome;
        }
        if (iOrdinal == 2) {
            return R.string.contentDescription_addressWork;
        }
        if (iOrdinal == 3) {
            return -1;
        }
        throw new h.i();
    }

    @Override // com.waze.destination_cell.a.a
    public final AddressItem b() {
        return this.f23800b.f();
    }

    @Override // com.waze.destination_cell.a.a
    public final Integer c() {
        int iC;
        Favorite.Type typeD = this.f23800b.d();
        Favorite.Type type = Favorite.Type.DEFAULT;
        int iOrdinal = typeD.ordinal();
        if (iOrdinal == 0) {
            iC = com.waze.design_components.b.d.M.c(com.waze.design_components.b.e.f23312a);
        } else if (iOrdinal == 1) {
            iC = com.waze.design_components.b.d.f23304e.c(com.waze.design_components.b.e.f23314c);
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            iC = com.waze.design_components.b.d.M.c(com.waze.design_components.b.e.f23312a);
        } else {
            iC = com.waze.design_components.b.d.f23309j.c(com.waze.design_components.b.e.f23314c);
        }
        return Integer.valueOf(iC);
    }

    @Override // com.waze.destination_cell.a.a
    public final String d() {
        String strK = com.waze.nightmode.e.k(this.f23800b.e());
        return strK == null ? "" : strK;
    }

    @Override // com.waze.destination_cell.a.a
    public final String e() {
        return this.f23800b.g();
    }

    @Override // com.waze.destination_cell.a.a
    public final String f() {
        return "";
    }

    @Override // com.waze.destination_cell.a.a
    public final String g() {
        return "";
    }

    @Override // com.waze.destination_cell.a.a
    public final boolean h() {
        return true;
    }

    @Override // com.waze.destination_cell.a.a
    public final int i() {
        w wVar = this.f23800b;
        return (wVar.h() || wVar.i()) ? 4 : 1;
    }

    public final boolean j() {
        return this.f23799a;
    }

    public final w k() {
        return this.f23800b;
    }
}
