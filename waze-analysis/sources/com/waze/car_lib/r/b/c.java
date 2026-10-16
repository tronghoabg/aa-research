package com.waze.car_lib.r.b;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.settings.tree.c.h;
import h.a.i;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f21007a;

    c(d dVar) {
        this.f21007a = dVar;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        Object next;
        String strC;
        d dVar = this.f21007a;
        a aVarA = dVar.a();
        if (aVarA != null && (strC = aVarA.c()) != null) {
            return strC;
        }
        Iterator it = dVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((a) next).c(), com.waze.settings.e.a.b.f37127h.a())) {
                break;
            }
        }
        a aVar = (a) next;
        if (aVar != null) {
            return aVar.c();
        }
        a aVar2 = (a) i.U(dVar.d());
        if (aVar2 == null) {
            return null;
        }
        return aVar2.c();
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        d dVar = this.f21007a;
        a aVarA = dVar.a();
        String strC = aVarA != null ? aVarA.c() : null;
        if (x.n(strC, str)) {
            return;
        }
        if (str != null) {
            dVar.f21008a.h(str);
            if (strC == null) {
                strC = "";
            }
            dVar.f21009b.c(str, strC);
        }
        dVar.i();
    }
}
