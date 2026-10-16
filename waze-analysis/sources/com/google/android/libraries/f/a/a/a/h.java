package com.google.android.libraries.f.a.a.a;

import android.os.Bundle;
import com.google.android.gms.common.internal.m;
import h.g.b.aq;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h implements com.google.android.gms.common.internal.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f5932a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f5933b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f5934c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f5935d;

    h(aq aqVar, k kVar, j jVar, CompletableDeferred completableDeferred) {
        this.f5932a = aqVar;
        this.f5933b = kVar;
        this.f5934c = jVar;
        this.f5935d = completableDeferred;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void a(Bundle bundle) {
        try {
            m mVar = (m) this.f5932a.f48105a;
            com.google.android.gms.a.b.a.d dVar = mVar != null ? (com.google.android.gms.a.b.a.d) mVar.y() : null;
            if (dVar == null) {
                this.f5935d.a(new b(a.f5923d));
                return;
            }
            String packageName = this.f5933b.f5938a.getPackageName();
            x.e(packageName, "getPackageName(...)");
            dVar.a(new com.google.android.gms.a.b.a.a(packageName), this.f5934c);
        } catch (Throwable unused) {
            this.f5935d.a(new b(a.f5924e));
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void b(int i2) {
        this.f5935d.a(new b(a.f5924e));
    }
}
