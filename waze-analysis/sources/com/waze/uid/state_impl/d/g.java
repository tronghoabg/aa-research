package com.waze.uid.state_impl.d;

import com.waze.authentication.ax;
import com.waze.authentication.k;
import com.waze.uid.UidModel;
import com.waze.uid.d.q;
import com.waze.uid.state_impl.username_login.LoginParameters;
import h.ab;
import h.g.a.p;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f44630a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f44631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, h.c.e eVar) {
        super(2, eVar);
        this.f44631b = hVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f44631b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        LoginParameters loginParameters;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44630a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f44630a = 1;
            obj = q.f44463a.a().f44467e.g(new Long(500L), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ax) next) instanceof k) {
                break;
            }
        }
        ax axVar = (ax) next;
        h hVar = this.f44631b;
        if (axVar != null) {
            UidModel uidModel = (UidModel) hVar.f44485c.b();
            if (uidModel != null && (loginParameters = uidModel.getLoginParameters()) != null) {
                loginParameters.setDidFindRecoveryCredentials(true);
            }
            k kVar = (k) axVar;
            h.c(hVar, kVar.b(), kVar.a());
        } else {
            hVar.k();
        }
        return ab.f48028a;
    }
}
