package com.google.firebase.appcheck.a;

import com.google.android.gms.o.ag;
import com.google.android.gms.o.s;
import com.google.android.gms.o.t;
import com.google.android.libraries.phenotype.client.stable.au;
import com.google.android.play.core.a.r;
import com.google.firebase.remoteconfig.internal.m;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8842a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f8843b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f8843b = i2;
        this.f8842a = obj;
    }

    @Override // com.google.android.gms.o.s
    public final t a(Object obj) {
        int i2 = this.f8843b;
        if (i2 == 0) {
            return d.e((d) this.f8842a, (com.google.firebase.appcheck.b) obj);
        }
        if (i2 == 1) {
            com.google.firebase.appcheck.debug.a.b bVar = (com.google.firebase.appcheck.debug.a.b) this.f8842a;
            return ag.a(bVar.f8888e, new au(bVar, new com.google.android.libraries.e.a.a.b((String) obj), 2));
        }
        if (i2 == 2) {
            return com.google.firebase.appcheck.playintegrity.a.e.c((com.google.firebase.appcheck.playintegrity.a.e) this.f8842a, (r) obj);
        }
        if (i2 == 3) {
            return com.google.firebase.remoteconfig.b.h((com.google.firebase.remoteconfig.b) this.f8842a);
        }
        Object obj2 = this.f8842a;
        long j2 = m.f10699a;
        return ag.c(obj2);
    }
}
