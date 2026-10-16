package com.waze.settings.tree.a;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.settings.bs;
import com.waze.settings.ds;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements com.waze.settings.tree.c.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37486a;

    o(ds dsVar) {
        this.f37486a = dsVar;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        bs bsVar = (bs) this.f37486a.A().d();
        h.g.b.x.f(bsVar, "<this>");
        return bsVar.x() ? bsVar.j() : bsVar.m();
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        h.g.b.x.c(str);
        this.f37486a.S(str);
    }
}
