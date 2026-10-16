package com.waze.ifs.ui;

import android.view.View;
import android.widget.ExpandableListView;
import com.waze.settings.gw;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j implements ExpandableListView.OnGroupClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ExpandableListView f24562a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f24563b;

    j(w wVar, ExpandableListView expandableListView) {
        this.f24562a = expandableListView;
        Objects.requireNonNull(wVar);
        this.f24563b = wVar;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i2, long j2) {
        w wVar = this.f24563b;
        int iA = ((v) wVar.r).a(i2, -1);
        gw gwVar = (gw) ((v) wVar.r).getItem(iA);
        if (gwVar.f37348a) {
            w.j(wVar, iA, gwVar, false);
            return true;
        }
        if (wVar.r.d() != null) {
            wVar.r.d().f37348a = false;
        }
        gwVar.f37348a = true;
        ExpandableListView expandableListView2 = this.f24562a;
        if (expandableListView2.isGroupExpanded(i2)) {
            expandableListView2.collapseGroup(i2);
            wVar.w = -1;
        } else {
            expandableListView2.expandGroup(i2);
            if (wVar.w != -1) {
                expandableListView2.collapseGroup(wVar.w);
            }
            wVar.w = i2;
            expandableListView2.smoothScrollToPosition(i2);
        }
        return true;
    }
}
