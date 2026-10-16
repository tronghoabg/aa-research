package com.waze.ifs.ui;

import android.view.View;
import android.widget.ExpandableListView;
import com.waze.settings.gw;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k implements ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f24564a;

    k(w wVar) {
        Objects.requireNonNull(wVar);
        this.f24564a = wVar;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i2, int i3, long j2) {
        w wVar = this.f24564a;
        int iA = ((v) wVar.r).a(i2, i3);
        gw gwVar = (gw) ((v) wVar.r).getItem(iA);
        if (gwVar.f37348a) {
            w.j(wVar, iA, gwVar, false);
        } else {
            if (wVar.r.d() != null) {
                wVar.r.d().f37348a = false;
            }
            gwVar.f37348a = true;
        }
        wVar.r.notifyDataSetChanged();
        return true;
    }
}
