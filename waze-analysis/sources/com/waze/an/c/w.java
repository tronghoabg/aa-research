package com.waze.an.c;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.places.Address;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14822a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14823b;

    public w(Favorite favorite) {
        h.g.b.x.f(favorite, "proto");
        this.f14823b = favorite;
        Address address = favorite.getPlace().getAddress();
        h.g.b.x.e(address, "getAddress(...)");
        this.f14822a = address;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.an.c.k, java.lang.Object] */
    public final k a() {
        return this.f14823b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.ui.l.ad, java.lang.Object] */
    public final com.waze.ui.l.ad b() {
        return this.f14822a;
    }

    public final int c() {
        return ((Favorite) this.f14823b).getId();
    }

    public final Favorite.Type d() {
        Favorite.Type type = ((Favorite) this.f14823b).getType();
        h.g.b.x.e(type, "getType(...)");
        return type;
    }

    public final Address e() {
        return (Address) this.f14822a;
    }

    public final AddressItem f() {
        int iC;
        Favorite favorite = (Favorite) this.f14823b;
        AddressItem addressItem = new AddressItem(favorite.getPlace().getPosition().getLongitude(), favorite.getPlace().getPosition().getLatitude(), "");
        Address address = (Address) this.f14822a;
        addressItem.setVenueAddress(address.getCountry(), address.getState(), address.getCity(), address.getStreet(), address.getHouseNumber(), address.getZip());
        addressItem.setTitle(g());
        addressItem.setType(h() ? 1 : i() ? 3 : 5);
        addressItem.setCategory(1);
        addressItem.setVenueId(favorite.getPlace().getVenueId());
        addressItem.setRoutingContext(favorite.getPlace().getRoutingContext());
        addressItem.setId(c() + "|1");
        Favorite.Type type = favorite.getType();
        h.g.b.x.e(type, "getType(...)");
        h.g.b.x.f(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        Favorite.Type type2 = Favorite.Type.DEFAULT;
        int iOrdinal = type.ordinal();
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
        addressItem.setImage(Integer.valueOf(iC));
        addressItem.setSecondaryTitle(com.waze.nightmode.e.k(address));
        return addressItem;
    }

    public final String g() {
        String name = ((Favorite) this.f14823b).getName();
        h.g.b.x.e(name, "getName(...)");
        return name;
    }

    public final boolean h() {
        return d() == Favorite.Type.HOME;
    }

    public final boolean i() {
        return d() == Favorite.Type.WORK;
    }

    public w(com.waze.ui.l.ad adVar, k kVar) {
        h.g.b.x.f(adVar, "insightCardState");
        h.g.b.x.f(kVar, "insightStateHolder");
        this.f14822a = adVar;
        this.f14823b = kVar;
    }
}
