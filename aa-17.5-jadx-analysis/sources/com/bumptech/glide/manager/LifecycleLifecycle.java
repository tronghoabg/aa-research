package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.epr;
import defpackage.eps;
import defpackage.ept;
import defpackage.epz;
import defpackage.eqa;
import defpackage.idg;
import defpackage.idh;
import defpackage.ify;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class LifecycleLifecycle implements idg, epz {
    private final Set a = new HashSet();
    private final ept b;

    public LifecycleLifecycle(ept eptVar) {
        this.b = eptVar;
        eptVar.c(this);
    }

    @Override // defpackage.idg
    public final void a(idh idhVar) {
        this.a.add(idhVar);
        ept eptVar = this.b;
        if (eptVar.a() == eps.a) {
            idhVar.j();
        } else if (eptVar.a().a(eps.d)) {
            idhVar.k();
        } else {
            idhVar.l();
        }
    }

    @Override // defpackage.idg
    public final void b(idh idhVar) {
        this.a.remove(idhVar);
    }

    @OnLifecycleEvent(a = epr.ON_DESTROY)
    public void onDestroy(eqa eqaVar) {
        Iterator it = ify.e(this.a).iterator();
        while (it.hasNext()) {
            ((idh) it.next()).j();
        }
        eqaVar.getLifecycle().d(this);
    }

    @OnLifecycleEvent(a = epr.ON_START)
    public void onStart(eqa eqaVar) {
        Iterator it = ify.e(this.a).iterator();
        while (it.hasNext()) {
            ((idh) it.next()).k();
        }
    }

    @OnLifecycleEvent(a = epr.ON_STOP)
    public void onStop(eqa eqaVar) {
        Iterator it = ify.e(this.a).iterator();
        while (it.hasNext()) {
            ((idh) it.next()).l();
        }
    }
}
