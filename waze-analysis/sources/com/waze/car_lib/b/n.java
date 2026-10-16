package com.waze.car_lib.b;

import android.content.Context;
import com.waze.jni.protos.map.MapPopupNativeInfo;
import com.waze.map.b.dw;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class n implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19111a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19112b;

    public /* synthetic */ n(Object obj, int i2) {
        this.f19112b = i2;
        this.f19111a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v24, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r7v44, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f19112b) {
            case 0:
                break;
            case 1:
                this.f19111a.a((h.ab) obj);
                break;
            case 2:
                this.f19111a.a((Boolean) obj);
                break;
            case 3:
                this.f19111a.a((String) obj);
                break;
            case 4:
                h.g.b.x.f((String) obj, "it");
                ((com.waze.map.canvas.bn) this.f19111a).b().invoke();
                break;
            case 5:
                com.waze.copilot.data.b.k.g((kotlinx.coroutines.a.ag) this.f19111a, (com.waze.install.ah) obj);
                break;
            case 6:
                kotlinx.coroutines.a.ab.e((kotlinx.coroutines.a.ag) this.f19111a, (dw) obj);
                break;
            case 7:
                break;
            case 8:
                com.waze.map.main.p pVar = (com.waze.map.main.p) obj;
                h.g.b.x.f(pVar, "fragment");
                pVar.u((com.waze.map.main.a) this.f19111a);
                break;
            case 9:
                this.f19111a.invoke((com.waze.map.b.s) obj);
                break;
            case 10:
                this.f19111a.invoke((com.waze.map.b.v) obj);
                break;
            case 11:
                this.f19111a.a((MapPopupNativeInfo.DetailsPopupInfo) obj);
                break;
            case 12:
                this.f19111a.a((MapPopupNativeInfo.DetailsPopupInfo) obj);
                break;
            case 13:
                Context context = (Context) obj;
                int i2 = com.waze.map.c.f.f28470a;
                h.g.b.x.f(context, "context");
                break;
            case 14:
                com.waze.av.b.aa aaVar = (com.waze.av.b.aa) obj;
                h.g.b.x.f(aaVar, "it");
                break;
            case 15:
                com.waze.av.b.aa aaVar2 = (com.waze.av.b.aa) obj;
                h.g.b.x.f(aaVar2, "it");
                List listC = aaVar2.c();
                if ((listC instanceof Collection) && listC.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        if (((com.waze.av.b.h) it.next()).a() == ((com.waze.av.b.h) this.f19111a).a()) {
                        }
                    }
                    z = true;
                }
                break;
            case 16:
                com.waze.av.b.aa aaVar3 = (com.waze.av.b.aa) obj;
                h.g.b.x.f(aaVar3, "it");
                List listD = aaVar3.d();
                if ((listD instanceof Collection) && listD.isEmpty()) {
                    z = true;
                } else {
                    Iterator it2 = listD.iterator();
                    while (it2.hasNext()) {
                        if (h.g.b.x.n((com.waze.av.b.y) it2.next(), this.f19111a)) {
                        }
                    }
                    z = true;
                }
                break;
            case 17:
                com.waze.av.d.g gVar = (com.waze.av.d.g) obj;
                h.g.b.x.f(gVar, "it");
                break;
            case 18:
                Boolean bool = (Boolean) obj;
                this.f19111a.a(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                break;
            case 19:
                com.waze.modules.navigation.ao aoVar = (com.waze.modules.navigation.ao) obj;
                h.g.b.x.f(aoVar, "newParams");
                this.f19111a.invoke(aoVar);
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = this.f19111a;
                ((com.waze.modules.navigation.bk) obj2).f30397a.a("navigateCallback:rc=" + iIntValue);
                ((com.waze.shared_infra.coordinators.s) obj2).H(new com.waze.modules.navigation.bl(com.waze.modules.navigation.al.f30301a));
                break;
        }
        return h.ab.f48028a;
    }
}
