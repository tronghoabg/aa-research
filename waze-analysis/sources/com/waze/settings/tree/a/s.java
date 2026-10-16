package com.waze.settings.tree.a;

import com.waze.settings.bg;
import com.waze.settings.bh;
import com.waze.settings.bi;
import com.waze.settings.tree.views.WazeSettingsView;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37494a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f37495b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f37496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(n nVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37496c = i2;
        this.f37495b = nVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f37496c;
        if (i2 == 0) {
            s sVar = new s((WazeSettingsView) this.f37495b, eVar, 0);
            sVar.f37494a = obj;
            return sVar;
        }
        Object obj2 = this.f37495b;
        if (i2 != 1) {
            s sVar2 = new s((z) obj2, eVar, 2);
            sVar2.f37494a = obj;
            return sVar2;
        }
        s sVar3 = new s((n) obj2, eVar, 1);
        sVar3.f37494a = obj;
        return sVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f37496c;
        return i2 != 0 ? i2 != 1 ? ((s) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((s) create((com.waze.settings.c) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((s) create((String) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        List listF;
        int i2 = this.f37496c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            String str = (String) this.f37494a;
            int length = str.length();
            Object obj2 = this.f37495b;
            if (length == 0) {
                ((WazeSettingsView) obj2).G();
            } else {
                WazeSettingsView wazeSettingsView = (WazeSettingsView) obj2;
                wazeSettingsView.m();
                wazeSettingsView.P(str);
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            n.f((n) this.f37495b, (com.waze.settings.c) this.f37494a);
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        h.k kVar = (h.k) this.f37494a;
        bi biVar = (bi) kVar.a();
        String str2 = (String) kVar.b();
        if (biVar instanceof bh) {
            listF = h.a.i.d(new t((z) this.f37495b, com.waze.ui.ad.b.d("LOADING")));
        } else {
            if (!(biVar instanceof bg)) {
                throw new h.i();
            }
            listF = z.f((z) this.f37495b, ((bg) biVar).a(), str2);
        }
        ((com.waze.settings.tree.g) this.f37495b).B(listF);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(z zVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37496c = i2;
        this.f37495b = zVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(WazeSettingsView wazeSettingsView, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37496c = i2;
        this.f37495b = wazeSettingsView;
    }
}
