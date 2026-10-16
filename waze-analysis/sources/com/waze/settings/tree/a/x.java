package com.waze.settings.tree.a;

import android.view.View;
import com.waze.network.f.ak;
import com.waze.settings.de;
import java.util.Map;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends com.waze.settings.tree.d.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f37505a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(Map.Entry entry, String str, z zVar, String str2, com.waze.ui.ac.n nVar) {
        super(str2, nVar, null, null, null, null, 60);
        this.f37505a = zVar;
        f(h.g.b.x.n(entry.getKey(), str));
    }

    @Override // com.waze.settings.tree.d.g, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        z zVar = this.f37505a;
        View viewO = super.O(deVar);
        ai.m(ai.K(ai.y(new r(zVar.c().A(), 2)), new w(viewO, null)), ak.q(deVar));
        return viewO;
    }
}
