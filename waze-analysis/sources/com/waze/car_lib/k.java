package com.waze.car_lib;

import androidx.car.app.CarContext;
import androidx.car.app.media.CarAudioRecord;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends com.waze.h.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CarContext f20292a;

    k(CarContext carContext) {
        this.f20292a = carContext;
    }

    @Override // com.waze.h.b.a
    public final com.waze.h.b.e a(com.waze.h.c.a aVar) {
        h.g.b.x.f(aVar, "audioConfig");
        CarAudioRecord carAudioRecordCreate = CarAudioRecord.create(this.f20292a);
        h.g.b.x.e(carAudioRecordCreate, "create(...)");
        return new j(carAudioRecordCreate, aVar);
    }
}
