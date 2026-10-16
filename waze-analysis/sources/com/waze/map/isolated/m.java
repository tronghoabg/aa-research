package com.waze.map.isolated;

import androidx.core.app.NotificationCompat;
import java.util.Objects;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements i, h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29237a;

    /* renamed from: b, reason: collision with root package name */
    private final bm f29238b;

    public /* synthetic */ m(byte[] bArr) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("MavEventObservable");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(eVarD, "logger");
        this.f29237a = eVarD;
        this.f29238b = bu.e(0, 8, null, 5);
    }

    @Override // com.waze.map.isolated.h
    public final void a(g gVar) {
        h.g.b.x.f(gVar, NotificationCompat.CATEGORY_EVENT);
        Objects.toString(gVar);
        this.f29237a.a("sending ".concat(gVar.toString()));
        this.f29238b.c(gVar);
    }

    @Override // com.waze.map.isolated.i
    public final bq b() {
        return this.f29238b;
    }

    public m() {
        this(null);
    }
}
