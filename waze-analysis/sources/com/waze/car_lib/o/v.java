package com.waze.car_lib.o;

import android.view.View;
import com.waze.settings.bk;
import com.waze.settings.de;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.r f20493a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(String str, com.waze.ui.ac.n nVar, String str2, h.g.a.r rVar) {
        super(str, bk.f36871a, str2, nVar, null, null, null, 480);
        h.g.b.x.f(rVar, "screenGenerator");
        this.f20493a = rVar;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final h.g.a.r c() {
        return this.f20493a;
    }
}
