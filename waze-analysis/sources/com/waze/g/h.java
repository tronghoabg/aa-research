package com.waze.g;

import com.waze.NativeManager;
import com.waze.ifs.ui.z;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements com.waze.shared_infra.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final bn f24001a = ck.b(com.waze.shared_infra.a.a.f37761a);

    public h() {
        NativeManager.registerOnAppStartedEvent(new f(this, 0));
        z.a().b(new g(this, 0));
    }

    static final void b(h hVar) {
        hVar.f24001a.e(com.waze.shared_infra.a.a.f37762b);
    }

    static final void c(h hVar) {
        hVar.f24001a.e(com.waze.shared_infra.a.a.f37763c);
    }

    @Override // com.waze.shared_infra.a.b
    public final /* synthetic */ ch a() {
        return this.f24001a;
    }
}
