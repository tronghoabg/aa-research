package com.waze.settings.f.b;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.NativeManager;
import h.a.i;
import h.c.j;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.f.a.e f37232a;

    /* renamed from: b, reason: collision with root package name */
    private final j f37233b;

    /* renamed from: c, reason: collision with root package name */
    private final af f37234c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f37235d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f37236e;

    public g(com.waze.settings.f.a.e eVar, j jVar) {
        x.f(eVar, "dataSource");
        x.f(jVar, "coroutineContext");
        this.f37232a = eVar;
        this.f37233b = jVar;
        af afVarE = aj.e(jVar);
        this.f37234c = afVarE;
        k kVarD = eVar.d();
        int i2 = bz.f51630a;
        this.f37235d = ai.V(kVarD, afVarE, by.b(), i.h());
        this.f37236e = ai.V(eVar.c(), afVarE, by.b(), i.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(String str) {
        return ((List) this.f37236e.d()).contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(String str) {
        return ((List) this.f37235d.d()).contains(str);
    }

    @Override // com.waze.settings.f.b.b
    public final List a() {
        List<NativeManager.HOVPermitDescriptor> listB = this.f37232a.b();
        ArrayList arrayList = new ArrayList();
        for (NativeManager.HOVPermitDescriptor hOVPermitDescriptor : listB) {
            String str = hOVPermitDescriptor.name;
            a aVar = null;
            if (str != null && str.length() != 0) {
                String str2 = hOVPermitDescriptor.id;
                x.e(str2, TtmlNode.ATTR_ID);
                String str3 = hOVPermitDescriptor.name;
                String str4 = hOVPermitDescriptor.id;
                x.e(str4, TtmlNode.ATTR_ID);
                boolean zI = i(str4);
                String str5 = hOVPermitDescriptor.id;
                x.e(str5, TtmlNode.ATTR_ID);
                aVar = new a(str2, str3, zI, j(str5));
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // com.waze.settings.f.b.b
    public final ch b() {
        k kVarQ = ai.q(this.f37236e, this.f37235d, new c(this, null));
        int i2 = bz.f51630a;
        return ai.V(kVarQ, this.f37234c, by.a(5000L, 2), i.h());
    }

    @Override // com.waze.settings.f.b.b
    public final ch c() {
        f fVar = new f(this.f37236e, this);
        int i2 = bz.f51630a;
        return ai.V(fVar, this.f37234c, by.a(5000L, 2), i.h());
    }

    @Override // com.waze.settings.f.b.b
    public final void d() {
        this.f37232a.e();
    }

    @Override // com.waze.settings.f.b.b
    public final void e(String str, boolean z) {
        x.f(str, TtmlNode.ATTR_ID);
        List list = (List) this.f37236e.d();
        if (z) {
            if (list.contains(str)) {
                return;
            }
            com.waze.settings.f.a.e.g(i.ag(list, str));
        } else if (list.contains(str)) {
            com.waze.settings.f.a.e.g(i.ae(list, str));
        }
    }
}
