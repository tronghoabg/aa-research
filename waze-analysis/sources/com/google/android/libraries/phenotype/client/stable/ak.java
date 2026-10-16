package com.google.android.libraries.phenotype.client.stable;

import android.os.Process;
import android.util.Log;
import com.google.d.m.a.bo;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ak implements ar {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6052a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.d.b.aj f6053b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6054c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.d.b.aj f6055d;

    public ak(com.google.d.b.aj ajVar) {
        com.google.android.libraries.phenotype.client.d dVar = new com.google.android.libraries.phenotype.client.d(2);
        this.f6053b = ajVar;
        this.f6054c = Math.max(5, 10);
        this.f6055d = dVar;
    }

    public static /* synthetic */ void b(ak akVar) {
        if (((Boolean) akVar.f6055d.get()).booleanValue()) {
            Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    @Override // com.google.android.libraries.phenotype.client.stable.ar
    public final void a() {
        synchronized (ak.class) {
            if (!f6052a) {
                android.support.v4.app.ae aeVar = new android.support.v4.app.ae(this, 20);
                long j2 = this.f6054c;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                bo boVar = (bo) this.f6053b.get();
                al.c(boVar.schedule(new aj(this, aeVar, boVar, j2, timeUnit), j2, timeUnit));
                f6052a = true;
            }
        }
    }
}
