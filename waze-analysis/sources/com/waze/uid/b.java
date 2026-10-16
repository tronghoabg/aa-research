package com.waze.uid;

import android.app.Application;
import android.content.Context;
import com.waze.main.navigate.EventOnRoute;
import com.waze.navigate.location_preview.an;
import com.waze.view.navbar.EventsOnRouteView;
import h.g.b.ar;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44134a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44135b;

    public /* synthetic */ b(int i2) {
        this.f44135b = i2;
        this.f44134a = "    ";
    }

    /* JADX WARN: Type inference failed for: r12v16, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v29, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object, kotlinx.b.a.q] */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        Object objA;
        boolean z = false;
        switch (this.f44135b) {
            case 0:
                break;
            case 1:
                String str = (String) obj;
                h.g.b.x.f(str, "it");
                this.f44134a.setValue(str);
                break;
            case 2:
                String str2 = (String) obj;
                h.g.b.x.f(str2, "it");
                this.f44134a.setValue(str2);
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ?? r12 = this.f44134a;
                if (zBooleanValue) {
                    r12.invoke(new com.waze.search.e.c(true));
                } else {
                    r12.invoke(new com.waze.search.e.c(false));
                }
                break;
            case 4:
                Object obj2 = this.f44134a;
                ((EventsOnRouteView) obj2).post(new com.google.firebase.messaging.m(obj2, (EventOnRoute[]) obj, 11, z ? 1 : 0));
                break;
            case 5:
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                this.f44134a.invoke(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                break;
            case 7:
                h.g.b.x.f(obj, "it");
                break;
            case 8:
                break;
            case 9:
                String str3 = (String) obj;
                h.g.b.x.f(str3, "it");
                boolean zG = h.n.o.G(str3);
                Object obj3 = this.f44134a;
                if (!zG) {
                    break;
                } else if (str3.length() >= ((String) obj3).length()) {
                }
                break;
            case 10:
                String str4 = (String) obj;
                h.g.b.x.f(str4, "line");
                break;
            case 11:
                Throwable th = (Throwable) obj;
                int i2 = kotlinx.coroutines.e.r.f51912a;
                try {
                    Throwable th2 = (Throwable) this.f44134a.invoke(th);
                    boolean zN = h.g.b.x.n(th.getMessage(), th2.getMessage());
                    objA = th2;
                    if (!zN) {
                        boolean zN2 = h.g.b.x.n(th2.getMessage(), th.toString());
                        objA = th2;
                        if (!zN2) {
                            objA = null;
                        }
                    }
                } catch (Throwable th3) {
                    objA = e.b.c.a(th3);
                }
                break;
            case 12:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                ?? r122 = this.f44134a;
                sb.append(r122.c(iIntValue));
                sb.append(": ");
                sb.append(r122.g(iIntValue).d());
                break;
            case 13:
                h.g.b.x.f((List) obj, "it");
                break;
            case 14:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar, "$this$module");
                an anVar = new an(this.f44134a, 9);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i3 = ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(Application.class), null, anVar, cVar, listH));
                aVar.f(eVar);
                com.waze.web.r.q(new org.a.d.c.d(aVar, eVar), new h.g.b.m(Context.class));
                break;
            default:
                org.a.d.g.a aVar2 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar2, "$this$module");
                an anVar2 = new an(this.f44134a, 10);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56382a;
                List listH2 = h.a.i.h();
                int i4 = ar.f48106a;
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(bVar2, new h.g.b.m(Context.class), null, anVar2, cVar2, listH2));
                aVar2.f(eVar2);
                new org.a.d.c.d(aVar2, eVar2);
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ b(int i2, byte[] bArr) {
        this.f44135b = i2;
        this.f44134a = "";
    }

    public /* synthetic */ b(Object obj, int i2) {
        this.f44135b = i2;
        this.f44134a = obj;
    }
}
