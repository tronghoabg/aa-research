package com.waze.inbox;

import android.support.v7.widget.fe;
import com.waze.ui.z.as;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends fe {

    /* renamed from: a, reason: collision with root package name */
    private final j f24695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InboxRecycler inboxRecycler, j jVar) {
        super(jVar);
        Objects.requireNonNull(inboxRecycler);
        this.f24695a = jVar;
        jVar.d(inboxRecycler);
    }

    public final void a(n nVar, boolean z, boolean z2) {
        j jVar = this.f24695a;
        jVar.b(nVar);
        if (z) {
            int iH = as.h(jVar.getResources(), 8);
            jVar.setPadding(iH, iH, iH, iH);
        }
        if (z2) {
            int iH2 = as.h(jVar.getResources(), 80);
            int iH3 = as.h(jVar.getResources(), 8);
            jVar.setPadding(iH3, iH3, iH3, iH2);
        }
    }
}
