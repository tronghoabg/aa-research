package com.waze.settings.c;

import android.view.View;
import com.waze.settings.de;
import com.waze.settings.tree.t;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends com.waze.settings.tree.d.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f36923a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.ev.f f36924b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, com.waze.ev.f fVar, String str, com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, String str2) {
        super(str, nVar, null, dVar, null, str2, 20);
        this.f36923a = bVar;
        this.f36924b = fVar;
    }

    @Override // com.waze.settings.tree.d.g, com.waze.settings.tree.f
    protected final View O(de deVar) {
        x.f(deVar, "page");
        View viewO = super.O(deVar);
        viewO.setOnClickListener(new t(this, this.f36923a, this.f36924b, deVar, 1));
        return viewO;
    }
}
