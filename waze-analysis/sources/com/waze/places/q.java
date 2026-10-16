package com.waze.places;

import com.google.v.du;
import com.waze.hw;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.places.Place;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class q implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du f33133b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33134c;

    public /* synthetic */ q(Object obj, du duVar, int i2) {
        this.f33134c = i2;
        this.f33132a = obj;
        this.f33133b = duVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f33134c;
        if (i2 == 0) {
            return ab.storeRecentPlaceInRecents$lambda$0((ab) this.f33132a, (GenericPlace) this.f33133b);
        }
        if (i2 == 1) {
            return m.formatPlaceToString$lambda$0((m) this.f33132a, (Place) this.f33133b);
        }
        du duVar = this.f33133b;
        return i2 != 2 ? ab.storeFavoritePlaceInRecents$lambda$0((ab) this.f33132a, (GenericPlace) duVar) : ab.storeFavoritePlace$lambda$0((ab) this.f33132a, (GenericPlace) duVar);
    }
}
