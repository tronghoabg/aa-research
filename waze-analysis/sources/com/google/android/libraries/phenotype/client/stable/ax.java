package com.google.android.libraries.phenotype.client.stable;

import com.google.d.d.bq;
import com.google.d.d.bs;
import com.google.d.d.ci;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ax {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6095a = true;

    /* renamed from: b, reason: collision with root package name */
    private final String f6096b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.v.v f6097c;

    /* renamed from: d, reason: collision with root package name */
    private final bs f6098d;

    /* renamed from: e, reason: collision with root package name */
    private final aw f6099e;

    private ax(ba baVar, aw awVar) {
        ba.getDefaultInstance().equals(baVar);
        this.f6096b = baVar.getSnapshotToken();
        this.f6097c = baVar.getExperimentToken();
        baVar.getServerToken();
        baVar.getConfigurationVersion();
        ci.o();
        bq bqVarC = bs.c(baVar.getFlagCount() + 3);
        for (bd bdVar : baVar.getFlagList()) {
            int iOrdinal = bdVar.getValueCase().ordinal();
            if (iOrdinal == 0) {
                bqVarC.d(bdVar.getName(), Long.valueOf(bdVar.getLongValue()));
            } else if (iOrdinal == 1) {
                bqVarC.d(bdVar.getName(), Boolean.valueOf(bdVar.getBooleanValue()));
            } else if (iOrdinal == 2) {
                bqVarC.d(bdVar.getName(), Double.valueOf(bdVar.getDoubleValue()));
            } else if (iOrdinal == 3) {
                bqVarC.d(bdVar.getName(), bdVar.getStringValue());
            } else if (iOrdinal == 4) {
                bqVarC.d(bdVar.getName(), bdVar.getBytesValue().x());
            }
        }
        bqVarC.d("__phenotype_server_token", baVar.getServerToken());
        bqVarC.d("__phenotype_snapshot_token", baVar.getSnapshotToken());
        bqVarC.d("__phenotype_configuration_version", Long.valueOf(baVar.getConfigurationVersion()));
        this.f6098d = bqVarC.a();
        this.f6099e = awVar;
    }

    static ax b(ba baVar, aw awVar) {
        return new ax(baVar, awVar);
    }

    static ax c(com.google.android.libraries.phenotype.client.b.j jVar, aw awVar) {
        return new ax(jVar, awVar);
    }

    static ax d(ba baVar, ax axVar) {
        return new ax(baVar, axVar.f6099e);
    }

    final com.google.android.libraries.phenotype.client.a.e a() {
        return this.f6099e.c();
    }

    final bs e() {
        return this.f6098d;
    }

    final com.google.v.v f() {
        return this.f6097c;
    }

    final String g() {
        return this.f6096b;
    }

    public final boolean h() {
        int iOrdinal = this.f6099e.a().ordinal();
        return iOrdinal == 15 || iOrdinal == 16;
    }

    public final boolean i() {
        return this.f6099e.a() == com.google.android.libraries.phenotype.client.a.c.DIRECT_BOOT_BUT_PACKAGE_NOT_DIRECT_BOOT_AWARE;
    }

    public final boolean j() {
        return this.f6099e.f6092a == com.google.android.libraries.phenotype.client.a.d.DEFAULT_VALUES;
    }

    public final boolean k() {
        return this.f6095a;
    }

    public final boolean l() {
        return this.f6099e.d();
    }

    private ax(com.google.android.libraries.phenotype.client.b.j jVar, aw awVar) {
        jVar.i();
        this.f6096b = jVar.g();
        this.f6097c = jVar.e();
        jVar.f();
        jVar.a();
        Map mapH = jVar.h();
        if (mapH != null) {
            ci.m(mapH.keySet());
        } else {
            ci.o();
        }
        com.google.android.libraries.phenotype.client.b.h hVarB = jVar.b();
        bq bqVarC = bs.c(hVarB.a() + 3);
        hVarB.f(bqVarC);
        bqVarC.d("__phenotype_server_token", jVar.f());
        bqVarC.d("__phenotype_snapshot_token", jVar.g());
        bqVarC.d("__phenotype_configuration_version", Long.valueOf(jVar.a()));
        this.f6098d = bqVarC.a();
        this.f6099e = awVar;
    }
}
