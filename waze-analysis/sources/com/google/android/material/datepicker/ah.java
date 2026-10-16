package com.google.android.material.datepicker;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah extends ap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f6394a;

    ah(ai aiVar) {
        Objects.requireNonNull(aiVar);
        this.f6394a = aiVar;
    }

    @Override // com.google.android.material.datepicker.ap
    public final void a() {
        Iterator it = this.f6394a.f6427a.iterator();
        while (it.hasNext()) {
            ((ap) it.next()).a();
        }
    }

    @Override // com.google.android.material.datepicker.ap
    public final void b(Object obj) {
        Iterator it = this.f6394a.f6427a.iterator();
        while (it.hasNext()) {
            ((ap) it.next()).b(obj);
        }
    }
}
