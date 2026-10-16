package com.waze.j;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class d {
    public String b() {
        return null;
    }

    public String c() {
        return "";
    }

    public String d() {
        throw null;
    }

    public abstract int e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return com.waze.shared_infra.i.h.o(d(), dVar.d()) && com.waze.shared_infra.i.h.o(c(), dVar.c());
    }

    public com.waze.shared_infra.h.c f() {
        return com.waze.shared_infra.h.c.f37873a;
    }

    public final int g() {
        int iE = e() - 1;
        if (iE != 0 && iE != 1) {
            if (iE == 2) {
                AddressItem addressItemT = t();
                if (addressItemT != null) {
                    if (addressItemT.isWork()) {
                        return com.waze.design_components.b.d.f23309j.c(com.waze.design_components.b.e.f23314c);
                    }
                    if (addressItemT.isHome()) {
                        return com.waze.design_components.b.d.f23304e.c(com.waze.design_components.b.e.f23314c);
                    }
                    int type = addressItemT.getType();
                    if (type == 1) {
                        return com.waze.design_components.b.d.f23304e.c(com.waze.design_components.b.e.f23314c);
                    }
                    if (type == 3) {
                        return com.waze.design_components.b.d.f23309j.c(com.waze.design_components.b.e.f23314c);
                    }
                    if (type == 5) {
                        return com.waze.design_components.b.d.M.c(com.waze.design_components.b.e.f23312a);
                    }
                    if (type == 8) {
                        return com.waze.design_components.b.d.P.c(com.waze.design_components.b.e.f23312a);
                    }
                    if (addressItemT.getImage() != null) {
                        return addressItemT.getImage().intValue();
                    }
                }
                return com.waze.design_components.b.d.f23307h.c(com.waze.design_components.b.e.f23312a);
            }
            if (iE != 3) {
                return iE != 4 ? h() : com.waze.design_components.b.d.ar.c(com.waze.design_components.b.e.f23312a);
            }
        }
        return com.waze.design_components.b.d.I.c(com.waze.design_components.b.e.f23312a);
    }

    protected int h() {
        return com.waze.design_components.b.d.aj.c(com.waze.design_components.b.e.f23312a);
    }

    public n i() {
        return null;
    }

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final String l() {
        return o() ? "GOOGLE" : "WAZE";
    }

    public String m() {
        return null;
    }

    public String n() {
        return null;
    }

    final boolean o() {
        return n() != null && n().toLowerCase().contains("google");
    }

    public AddressItem t() {
        return null;
    }
}
