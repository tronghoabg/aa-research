package com.waze.app_nav.a;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.cg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u extends az {

    /* renamed from: a, reason: collision with root package name */
    private final v f15162a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar) {
        super(null);
        h.g.b.x.f(vVar, "controller");
        this.f15162a = vVar;
    }

    public final v a() {
        return this.f15162a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f15162a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        ad adVar = (ad) obj;
        h.g.b.x.f(adVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(adVar, ab.f15099a)) {
            return;
        }
        if (!(adVar instanceof ac)) {
            if (h.g.b.x.n(adVar, z.f15165a)) {
                D(w.f15163a);
                return;
            } else {
                if (!h.g.b.x.n(adVar, aa.f15098a)) {
                    throw new h.i();
                }
                D(x.f15164a);
                return;
            }
        }
        u uVar = this;
        ac acVar = (ac) adVar;
        String strA = acVar.a();
        String strB = acVar.b();
        if (strB == null) {
            strB = "MAP";
        }
        h.g.b.x.f(strA, "model");
        h.g.b.x.f(strB, TtmlNode.ATTR_TTS_ORIGIN);
        cg cgVar = new cg();
        Bundle bundle = new Bundle();
        bundle.putString("model", strA);
        bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, strB);
        cgVar.setArguments(bundle);
        uVar.J(cgVar, true);
    }
}
