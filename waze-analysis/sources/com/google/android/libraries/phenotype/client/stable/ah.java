package com.google.android.libraries.phenotype.client.stable;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah implements w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f6038a;

    /* renamed from: b, reason: collision with root package name */
    private final ar f6039b;

    ah(ai aiVar, ar arVar) {
        Objects.requireNonNull(aiVar);
        this.f6038a = aiVar;
        this.f6039b = arVar;
    }

    @Override // com.google.android.libraries.phenotype.client.stable.w
    public final void a(v vVar) {
        Iterator it = this.f6038a.f6045f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (p.c(q.f6147c, vVar.getConfigPackagesList()) && !z) {
                this.f6039b.a();
                z = true;
            }
        }
    }
}
