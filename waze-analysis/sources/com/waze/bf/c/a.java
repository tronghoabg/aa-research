package com.waze.bf.c;

import com.waze.MainActivity;
import com.waze.b.u;
import com.waze.ig;
import com.waze.kn;
import com.waze.lm;
import com.waze.shared_infra.i.h;
import h.ab;
import h.c.e;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f16297a;

    a(b bVar) {
        this.f16297a = bVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
        u uVarA = ((com.waze.bf.a.a) obj).a();
        h.h("UiReadyToShowPrivacyConsentBump - showing pending request");
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            eVarE.runOnUiThread(new ig(uVarA, 4));
        } else {
            MainActivity.B(new kn(uVarA, 0));
        }
        this.f16297a.f16298a.b();
        return ab.f48028a;
    }
}
