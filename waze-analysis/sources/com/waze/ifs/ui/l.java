package com.waze.ifs.ui;

import android.view.View;
import android.widget.AdapterView;
import com.waze.settings.gw;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f24565a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24566b;

    l(w wVar, int i2, byte[] bArr) {
        this.f24566b = i2;
        Objects.requireNonNull(wVar);
        this.f24565a = wVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        int i3 = this.f24566b;
        w wVar = this.f24565a;
        if (i3 != 0) {
            gw gwVar = (gw) wVar.s.getItem(i2);
            w.j(wVar, wVar.s.a(gwVar), gwVar, false);
            return;
        }
        if (wVar.f24586b == null) {
            return;
        }
        if (wVar.f24587c) {
            wVar.f24586b[i2].f37348a = true;
            return;
        }
        if (wVar.r.d() != null) {
            wVar.r.d().f37348a = false;
        }
        gw gwVar2 = wVar.f24595k ? (gw) ((p) wVar.r).getItem(i2) : (gw) wVar.r.getItem(i2);
        gwVar2.f37348a = true;
        boolean z = gwVar2 == wVar.t;
        if (z && (wVar.t.f37349b == null || wVar.t.f37349b.length() == 0)) {
            return;
        }
        w.j(wVar, i2, gwVar2, z);
    }

    l(w wVar, int i2) {
        this.f24566b = i2;
        Objects.requireNonNull(wVar);
        this.f24565a = wVar;
    }
}
