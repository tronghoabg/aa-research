package com.waze.authentication.a;

import android.content.SharedPreferences;
import com.waze.authentication.f;
import com.waze.authentication.t;
import com.waze.car_lib.l;
import com.waze.config.ConfigValues;
import com.waze.shared_infra.q.e;
import h.g.b.x;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f15680a;

    /* renamed from: b, reason: collision with root package name */
    private final e f15681b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15682c;

    public /* synthetic */ a(SharedPreferences sharedPreferences, e eVar, l lVar) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("GrpcTokenStorage");
        x.e(eVarD, "create(...)");
        x.f(sharedPreferences, "sharedPreferences");
        x.f(eVar, "clock");
        x.f(lVar, "grpcConfig");
        x.f(eVarD, "logger");
        this.f15680a = sharedPreferences;
        this.f15681b = eVar;
        this.f15682c = eVarD;
    }

    @Override // com.waze.authentication.f
    public final /* bridge */ /* synthetic */ Object a() {
        SharedPreferences sharedPreferences = this.f15680a;
        String string = sharedPreferences.getString("GrpcToken", null);
        if (string == null) {
            this.f15682c.g("gRPC token is null");
            return null;
        }
        long j2 = sharedPreferences.getLong("GrpcTokenExpiresAtMillis", 0L);
        Boolean boolB = ConfigValues.CONFIG_VALUE_NETWORK_GRPC_INVALIDATE_TOKEN_ON_EXPIRATION.b();
        x.e(boolB, "getValue(...)");
        if (boolB.booleanValue()) {
            e eVar = this.f15681b;
            if (j2 < eVar.a()) {
                this.f15682c.g("gRPC token is expired since " + Instant.ofEpochMilli(j2) + ", current time " + Instant.ofEpochMilli(eVar.a()) + ".");
                return null;
            }
        }
        this.f15682c.a("gRPC token is valid. Expires at " + Instant.ofEpochMilli(j2) + ".");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
        x.e(instantOfEpochMilli, "ofEpochMilli(...)");
        return new com.waze.authentication.a(string, instantOfEpochMilli);
    }

    @Override // com.waze.authentication.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(com.waze.authentication.a aVar) {
        Instant instantA;
        SharedPreferences.Editor editorEdit = this.f15680a.edit();
        editorEdit.putString("GrpcToken", aVar != null ? aVar.b() : null);
        long epochMilli = 0;
        if (aVar != null && (instantA = aVar.a()) != null) {
            epochMilli = instantA.toEpochMilli();
        }
        editorEdit.putLong("GrpcTokenExpiresAtMillis", epochMilli);
        boolean zCommit = editorEdit.commit();
        com.waze.shared_infra.i.e eVar = this.f15682c;
        if (!zCommit) {
            eVar.b("Failed to store token");
            throw t.f15773a;
        }
        eVar.a("Token expiring at " + (aVar != null ? aVar.a() : null) + " was stored successfully");
    }
}
