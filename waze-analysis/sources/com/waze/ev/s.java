package com.waze.ev;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.copilot.a.ae;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s implements n {

    /* renamed from: a, reason: collision with root package name */
    private final List f23717a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f23718b;

    /* renamed from: c, reason: collision with root package name */
    private final af f23719c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f23720d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f23721e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f23722f;

    /* renamed from: g, reason: collision with root package name */
    private final b f23723g;

    /* renamed from: h, reason: collision with root package name */
    private final ae f23724h;

    public s(List list, b bVar, ae aeVar, com.waze.shared_infra.i.e eVar, ab abVar) {
        x.f(list, "allConnectors");
        x.f(bVar, "configDataSource");
        x.f(aeVar, "networkDataSource");
        x.f(eVar, "logger");
        x.f(abVar, "dispatcher");
        this.f23717a = list;
        this.f23723g = bVar;
        this.f23724h = aeVar;
        this.f23718b = eVar;
        this.f23719c = aj.e(abVar);
        final int i2 = 1;
        this.f23720d = h.g.a(new h.g.a.a(this) { // from class: com.waze.ev.o

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f23705a;

            {
                this.f23705a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i3 = i2;
                s sVar = this.f23705a;
                return i3 != 0 ? s.p(sVar) : s.o(sVar);
            }
        });
        this.f23721e = aeVar.b();
        final int i3 = 0;
        this.f23722f = h.g.a(new h.g.a.a(this) { // from class: com.waze.ev.o

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f23705a;

            {
                this.f23705a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i32 = i3;
                s sVar = this.f23705a;
                return i32 != 0 ? s.p(sVar) : s.o(sVar);
            }
        });
    }

    static final ch o(s sVar) {
        return sVar.f23723g.d();
    }

    static final ch p(s sVar) {
        b bVar = sVar.f23723g;
        boolean zBooleanValue = ((Boolean) bVar.d().d()).booleanValue();
        String str = (String) bVar.e().d();
        List list = sVar.f23717a;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) it.next()).d());
        }
        m mVar = new m(zBooleanValue, com.waze.ac.e.c(sVar.f23718b, str, arrayList), h.a.i.h());
        kotlinx.coroutines.b.k kVarS = ai.s(bVar.d(), bVar.e(), bVar.f(), sVar.f23724h.b(), new r(sVar, null));
        af afVar = sVar.f23719c;
        int i2 = bz.f51630a;
        return ai.V(kVarS, afVar, by.b(), mVar);
    }

    private final void r(Set set) {
        b bVar = this.f23723g;
        ch chVarE = bVar.e();
        bVar.h(h.a.i.aM(h.a.i.ak(set), "|", null, null, 0, null, 62));
        this.f23718b.a("Changing EV selected connectors config from " + chVarE + " to " + bVar.e());
    }

    @Override // com.waze.ev.n
    public final f a(String str) {
        Object next;
        x.f(str, TtmlNode.ATTR_ID);
        Iterator it = this.f23717a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((f) next).d(), str)) {
                break;
            }
        }
        return (f) next;
    }

    @Override // com.waze.ev.n
    public final g b(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        List list = (List) this.f23721e.d();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (x.n(((g) next).a(), str)) {
                obj = next;
                break;
            }
        }
        return (g) obj;
    }

    @Override // com.waze.ev.n
    public final l c(float f2) {
        b bVar = this.f23723g;
        if (f2 >= bVar.c()) {
            return k.f23700a;
        }
        if (f2 >= bVar.b()) {
            return j.f23699a;
        }
        if (f2 >= bVar.a()) {
            return i.f23698a;
        }
        if (f2 <= 0.0f) {
            return null;
        }
        return h.f23697a;
    }

    @Override // com.waze.ev.n
    public final List d() {
        return this.f23717a;
    }

    @Override // com.waze.ev.n
    public final Set e() {
        Set setAt;
        Set<String> setB = ((m) g().d()).b();
        ArrayList arrayList = new ArrayList();
        for (String str : setB) {
            f fVarA = a(str);
            if (fVarA != null) {
                Set setQ = e.c.d.a.q(str);
                Set setE = fVarA.e();
                x.f(setQ, "<this>");
                x.f(setE, "other");
                setAt = h.a.i.at(setQ);
                h.a.i.aD(setAt, setE);
            } else {
                setAt = null;
            }
            if (setAt != null) {
                arrayList.add(setAt);
            }
        }
        return h.a.i.au(h.a.i.r(arrayList));
    }

    @Override // com.waze.ev.n
    public final ch f() {
        return this.f23721e;
    }

    @Override // com.waze.ev.n
    public final ch g() {
        return (ch) this.f23720d.getValue();
    }

    @Override // com.waze.ev.n
    public final ch h() {
        return (ch) this.f23722f.getValue();
    }

    @Override // com.waze.ev.n
    public final void i(String str, boolean z) {
        x.f(str, "connectorId");
        Set setAt = h.a.i.at(((m) g().d()).b());
        setAt.add(str);
        this.f23718b.a("Selected connectors after adding " + str + ": " + setAt);
        r(setAt);
        if (z) {
            this.f23723g.g(true);
        }
    }

    @Override // com.waze.ev.n
    public final void j(String str, boolean z) {
        x.f(str, "evNetworkName");
        List listAq = h.a.i.aq(((m) g().d()).a());
        listAq.add(str);
        aj.z(this.f23719c, null, null, new p(this, listAq, z, null), 3);
    }

    @Override // com.waze.ev.n
    public final void k(String str) {
        x.f(str, "connectorId");
        Set setAt = h.a.i.at(((m) g().d()).b());
        setAt.remove(str);
        this.f23718b.a("Selected connectors after removing " + str + ": " + setAt);
        r(setAt);
    }

    @Override // com.waze.ev.n
    public final void l(String str) {
        x.f(str, "evNetworkName");
        List listAq = h.a.i.aq(((m) g().d()).a());
        listAq.remove(str);
        aj.z(this.f23719c, null, null, new q(this, listAq, null), 3);
    }

    @Override // com.waze.ev.n
    public final void m(boolean z) {
        b bVar = this.f23723g;
        ch chVarD = bVar.d();
        bVar.g(z);
        this.f23718b.a("Changing has EV car config from " + chVarD + " to " + z);
    }
}
