package com.google.android.gms.l;

import android.os.Bundle;
import com.google.android.gms.common.api.ac;
import com.google.android.gms.f.aa;
import com.google.d.b.an;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Date;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements com.google.android.gms.o.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5639b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f5640c;

    public /* synthetic */ q(Object obj, Object obj2, int i2) {
        this.f5640c = i2;
        this.f5638a = obj;
        this.f5639b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.o.a
    public final Object a(com.google.android.gms.o.t tVar) {
        int i2 = this.f5640c;
        if (i2 == 0) {
            boolean z = tVar.f() instanceof ac;
            Object obj = this.f5639b;
            Object obj2 = this.f5638a;
            if (z) {
                return ((v) obj2).a(((com.google.android.libraries.phenotype.client.a.f) obj).getSnapshotToken());
            }
            if (tVar.f() instanceof com.google.android.gms.common.api.i) {
                com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) tVar.f();
                an.B(iVar);
                if (iVar.a() == 29514) {
                    return ((v) obj2).a(((com.google.android.libraries.phenotype.client.a.f) obj).getSnapshotToken());
                }
            }
            return tVar;
        }
        if (i2 == 1) {
            return aa.a((aa) this.f5639b, (Bundle) this.f5638a, tVar);
        }
        if (i2 == 2) {
            return FirebaseInstanceId.q((FirebaseInstanceId) this.f5638a, (String) this.f5639b);
        }
        if (i2 == 3) {
            com.google.firebase.remoteconfig.internal.m.g((com.google.firebase.remoteconfig.internal.m) this.f5638a, (Date) this.f5639b, tVar);
            return tVar;
        }
        if (i2 != 4) {
            return com.google.firebase.remoteconfig.internal.s.j((com.google.firebase.remoteconfig.internal.s) this.f5639b, (com.google.android.gms.o.t) this.f5638a);
        }
        return ((com.google.firebase.remoteconfig.internal.m) this.f5638a).h(tVar, 0L, this.f5639b);
    }

    public /* synthetic */ q(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f5640c = i2;
        this.f5639b = obj;
        this.f5638a = obj2;
    }
}
