package com.waze.settings.e.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.config.ConfigValues;
import com.waze.search.v2.p;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.f.a.e f37132a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.g.a.a f37133b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37134c;

    public f(com.waze.settings.f.a.e eVar, com.waze.settings.g.a.a aVar, p pVar, com.waze.shared_infra.i.e eVar2) {
        x.f(eVar, "hovSettingsDataSource");
        x.f(aVar, "licensePlateSettingsDataSource");
        x.f(pVar, "config");
        x.f(eVar2, "logger");
        this.f37132a = eVar;
        this.f37133b = aVar;
        this.f37134c = eVar2;
    }

    @Override // com.waze.settings.e.a.e
    public final d a(String str) {
        Object next;
        x.f(str, TtmlNode.ATTR_ID);
        Iterator<E> it = b.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((b) next).a(), str)) {
                break;
            }
        }
        b bVar = (b) next;
        if (bVar != null) {
            return new c(bVar);
        }
        String strA = this.f37132a.a(str);
        if (true == o.G(strA)) {
            strA = str;
        }
        return new a(str, strA);
    }

    @Override // com.waze.settings.e.a.e
    public final String b() {
        String strB = ConfigValues.CONFIG_VALUE_HNC_LEARN_MORE_URL.b();
        x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.settings.e.a.e
    public final String c() {
        return this.f37133b.a();
    }

    @Override // com.waze.settings.e.a.e
    public final List d() {
        List listF = com.waze.settings.f.a.e.f();
        List listE = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (listF.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.waze.settings.e.a.e
    public final List e() {
        String strB = ConfigValues.CONFIG_VALUE_HNC_PERMIT_IDS.b();
        x.e(strB, "getValue(...)");
        com.waze.perf.p pVar = new com.waze.perf.p(13);
        x.f(strB, "<this>");
        x.f(pVar, "mapper");
        List listAe = o.ae(strB, new char[]{'|'});
        ArrayList arrayList = new ArrayList(i.q(listAe, 10));
        Iterator it = listAe.iterator();
        while (it.hasNext()) {
            arrayList.add(o.v((String) pVar.invoke((String) it.next())).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() != 0) {
                arrayList2.add(obj);
            }
        }
        return i.aa(arrayList2);
    }

    @Override // com.waze.settings.e.a.e
    public final void f() {
        List listAq = i.aq(com.waze.settings.f.a.e.f());
        listAq.removeAll(e());
        com.waze.settings.f.a.e.g(listAq);
    }

    @Override // com.waze.settings.e.a.e
    public final void g() {
        this.f37132a.e();
    }

    @Override // com.waze.settings.e.a.e
    public final void h(String str) {
        x.f(str, "permitId");
        if (e().contains(str)) {
            List listAq = i.aq(com.waze.settings.f.a.e.f());
            listAq.removeAll(e());
            listAq.add(str);
            com.waze.settings.f.a.e.g(listAq);
            return;
        }
        this.f37134c.b("Permit " + str + " isn't part of HNC permit list, ignoring. (" + e() + ")");
    }

    @Override // com.waze.settings.e.a.e
    public final void i(String str) {
        x.f(str, "value");
        this.f37133b.c(str);
    }

    @Override // com.waze.settings.e.a.e
    public final boolean j() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_HNC_FEATURE_ENABLED.b();
        x.e(boolB, "getValue(...)");
        if (!boolB.booleanValue()) {
            return false;
        }
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_LICENSE_PLATE_FEATURE_ENABLED.b();
        x.e(boolB2, "getValue(...)");
        return boolB2.booleanValue() && !e().isEmpty();
    }
}
