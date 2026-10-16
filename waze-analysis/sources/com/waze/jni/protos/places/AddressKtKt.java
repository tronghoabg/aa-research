package com.waze.jni.protos.places;

import com.waze.jni.protos.places.Address;
import com.waze.jni.protos.places.AddressKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AddressKtKt {
    /* renamed from: -initializeaddress, reason: not valid java name */
    public static final Address m27898initializeaddress(l<? super AddressKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AddressKt.Dsl.Companion companion = AddressKt.Dsl.Companion;
        Address.Builder builderNewBuilder = Address.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AddressKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Address copy(Address address, l<? super AddressKt.Dsl, ab> lVar) {
        x.f(address, "<this>");
        x.f(lVar, "block");
        AddressKt.Dsl.Companion companion = AddressKt.Dsl.Companion;
        Address.Builder builder = address.toBuilder();
        x.e(builder, "toBuilder(...)");
        AddressKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
