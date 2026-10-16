package com.waze.view.popups.b;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import java.io.File;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements m {

    /* renamed from: a, reason: collision with root package name */
    private final String f45268a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f45269b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f45270c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f45271d;

    /* renamed from: e, reason: collision with root package name */
    private final af f45272e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f45273f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f45274g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45275h;

    public q(String str, com.waze.app_nav.hub.b.c cVar, com.waze.shared_infra.o.a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(str, "photoFileAbsolutePath");
        h.g.b.x.f(cVar, "popupManager");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(eVar, "logger");
        this.f45268a = str;
        this.f45269b = cVar;
        this.f45270c = aVar;
        this.f45271d = eVar;
        this.f45272e = com.waze.ui.a.l.p(this, "MyParkingPhotoStateHolder");
        bn bnVarB = ck.b(new l(null, null, null));
        this.f45273f = bnVarB;
        this.f45274g = ai.U(bnVarB);
    }

    static final com.waze.app_nav.hub.b.i e(q qVar, Context context) {
        h.g.b.x.f(context, "context");
        com.waze.sharedui.d.b bVar = new com.waze.sharedui.d.b(context, qVar.f45270c.c(R.string.PARKED_PHOTO_SAVED, new Object[0]), R.drawable.bigblue_v_icon);
        bVar.show();
        return com.waze.app_nav.hub.b.m.a(bVar);
    }

    private final void h() {
        aj.z(this.f45272e, av.b(), null, new p(this, null), 2);
    }

    @Override // com.waze.view.popups.b.m
    public final ch a() {
        return this.f45274g;
    }

    @Override // com.waze.view.popups.b.m
    public final void b(h hVar) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        h.g.b.x.f(hVar, NotificationCompat.CATEGORY_EVENT);
        bn bnVar = this.f45273f;
        this.f45271d.a("handle(event=" + hVar + ", state before event: " + bnVar.d() + ")");
        if (h.g.b.x.n(hVar, e.f45255a)) {
            do {
                try {
                    objD = bnVar.d();
                } catch (Throwable th) {
                    e.b.c.a(th);
                    return;
                }
            } while (!bnVar.f(objD, l.a((l) objD, null, null, null, 6)));
            File file = new File(this.f45268a);
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        if (h.g.b.x.n(hVar, g.f45257a)) {
            bn bnVar2 = this.f45273f;
            do {
                objD5 = bnVar2.d();
            } while (!bnVar2.f(objD5, l.a((l) objD5, null, null, new j(this.f45268a), 3)));
            return;
        }
        if (hVar instanceof d) {
            bn bnVar3 = this.f45273f;
            do {
                objD4 = bnVar3.d();
            } while (!bnVar3.f(objD4, l.a((l) objD4, null, null, null, 3)));
            if (((d) hVar).a()) {
                h();
                aj.z(this.f45272e, null, null, new o(this, null), 3);
                return;
            }
            return;
        }
        if (h.g.b.x.n(hVar, f.f45256a)) {
            bn bnVar4 = this.f45273f;
            do {
                objD3 = bnVar4.d();
            } while (!bnVar4.f(objD3, l.a((l) objD3, null, new i(this.f45268a), null, 5)));
        } else {
            if (!h.g.b.x.n(hVar, c.f45253a)) {
                throw new h.i();
            }
            bn bnVar5 = this.f45273f;
            do {
                objD2 = bnVar5.d();
            } while (!bnVar5.f(objD2, l.a((l) objD2, null, null, null, 5)));
        }
    }

    @Override // com.waze.view.popups.b.m
    public final void c() {
        this.f45271d.a("start()");
        if (this.f45275h) {
            return;
        }
        this.f45275h = true;
        h();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f45272e, null);
    }
}
