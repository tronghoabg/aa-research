package com.waze.modules.a;

import android.content.SharedPreferences;
import com.waze.mg;
import h.g.b.x;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29799a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f29800b;

    static {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("GrpcTokenExpirationTechCode");
        x.e(eVarD, "create(...)");
        f29800b = eVarD;
    }

    public static final void a() {
        Instant instantPlus = Instant.now().plus(Duration.ofMinutes(1L));
        com.waze.shared_infra.i.e eVar = f29800b;
        Objects.toString(instantPlus);
        eVar.g("Changing gRPC token to expire in a minute at ".concat(String.valueOf(instantPlus)));
        SharedPreferences.Editor editorEdit = com.waze.be.b.f16231a.a(mg.f29780a.a()).edit();
        editorEdit.putLong("GrpcTokenExpiresAtMillis", instantPlus.toEpochMilli());
        editorEdit.apply();
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        throw null;
    }
}
