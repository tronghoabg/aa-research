package com.waze.car_lib;

import com.waze.car_lib.screens.core.ScreenPresentable;
import com.waze.iv;
import j$.util.Collection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class br implements com.waze.shared_infra.coordinators.g {

    /* renamed from: a, reason: collision with root package name */
    private final List f19212a = new ArrayList();

    @Override // com.waze.shared_infra.coordinators.g
    public final void a(String str) {
        h.g.b.x.f(str, "presentableUuid");
        ScreenPresentable screenPresentableE = e(str);
        if (screenPresentableE != null) {
            screenPresentableE.popToThis();
        }
    }

    @Override // com.waze.shared_infra.coordinators.g
    public final /* bridge */ /* synthetic */ void b(com.waze.shared_infra.coordinators.f fVar, boolean z, String str) {
        ScreenPresentable screenPresentable = (ScreenPresentable) fVar;
        h.g.b.x.f(screenPresentable, "presentable");
        h.g.b.x.f(str, "controllerId");
        this.f19212a.add(new WeakReference(screenPresentable));
        if (z) {
            screenPresentable.push();
        }
    }

    @Override // com.waze.shared_infra.coordinators.g
    public final void c(String str) {
        h.g.b.x.f(str, "presentableUuid");
        ScreenPresentable screenPresentableE = e(str);
        if (screenPresentableE != null) {
            screenPresentableE.remove();
        }
        Collection.EL.removeIf(this.f19212a, new bq(new iv(str, 11), 0));
    }

    @Override // com.waze.shared_infra.coordinators.g
    public final boolean d(String str) {
        h.g.b.x.f(str, "presentableUuid");
        ScreenPresentable screenPresentableE = e(str);
        if (screenPresentableE != null) {
            return screenPresentableE.isTop();
        }
        return false;
    }

    public final ScreenPresentable e(String str) {
        Object next;
        h.g.b.x.f(str, "presentableUuid");
        Iterator it = this.f19212a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ScreenPresentable screenPresentable = (ScreenPresentable) ((WeakReference) next).get();
            if (h.g.b.x.n(screenPresentable != null ? screenPresentable.getUuid() : null, str)) {
                break;
            }
        }
        WeakReference weakReference = (WeakReference) next;
        if (weakReference != null) {
            return (ScreenPresentable) weakReference.get();
        }
        return null;
    }
}
