package com.google.android.libraries.phenotype.client.stable;

import android.util.Log;
import com.google.d.d.cf;
import java.io.IOException;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements com.google.d.b.t {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f6134a;

    public /* synthetic */ l(int i2) {
        this.f6134a = i2;
    }

    @Override // com.google.d.b.t
    public final Object apply(Object obj) {
        int i2 = this.f6134a;
        if (i2 == 0) {
            int i3 = q.f6146b;
            return "";
        }
        if (i2 == 1) {
            return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return cf.k((Collection) obj);
                }
                int i4 = d.a.a.a.a.a.f46213a;
                return "com.google.android.gms.fido";
            }
            com.google.android.libraries.phenotype.client.a.m mVar = (com.google.android.libraries.phenotype.client.a.m) obj;
            if (mVar.a() != 29514) {
                throw mVar;
            }
            com.google.android.libraries.phenotype.client.b.t tVarNewBuilder = com.google.android.libraries.phenotype.client.b.u.newBuilder();
            com.google.android.libraries.phenotype.client.b.m mVarNewBuilder = com.google.android.libraries.phenotype.client.b.n.newBuilder();
            mVarNewBuilder.a(System.currentTimeMillis());
            tVarNewBuilder.a(mVarNewBuilder);
            return tVarNewBuilder.build();
        }
        com.google.android.libraries.phenotype.client.a.h hVar = (com.google.android.libraries.phenotype.client.a.h) obj;
        az azVarNewBuilder = ba.newBuilder();
        if (hVar == null) {
            return azVarNewBuilder.build();
        }
        for (com.google.android.libraries.phenotype.client.a.k kVar : hVar.getFlagList()) {
            bb bbVarNewBuilder = bd.newBuilder();
            bbVarNewBuilder.e(kVar.getName());
            int iOrdinal = kVar.getValueCase().ordinal();
            if (iOrdinal == 0) {
                bbVarNewBuilder.d(kVar.getLongValue());
            } else if (iOrdinal == 1) {
                bbVarNewBuilder.a(kVar.getBoolValue());
            } else if (iOrdinal == 2) {
                bbVarNewBuilder.c(kVar.getDoubleValue());
            } else if (iOrdinal == 3) {
                bbVarNewBuilder.f(kVar.getStringValue());
            } else {
                if (iOrdinal != 4) {
                    throw new IllegalStateException("No known flag type");
                }
                bbVarNewBuilder.b(kVar.getBytesValue());
            }
            azVarNewBuilder.a(bbVarNewBuilder.build());
        }
        azVarNewBuilder.d(hVar.getServerToken());
        azVarNewBuilder.e(hVar.getSnapshotToken());
        azVarNewBuilder.b(hVar.getConfigurationVersion());
        if (hVar.hasExperimentToken()) {
            azVarNewBuilder.c(hVar.getExperimentToken());
        }
        return azVarNewBuilder.build();
    }
}
