package com.waze.sharedrive.e;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38331a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f38332b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f38333c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f38334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(at atVar, com.waze.modules.navigation.ao aoVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38334d = i2;
        this.f38332b = atVar;
        this.f38333c = aoVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f38334d != 0) {
            return new al((p) this.f38333c, (String) this.f38332b, eVar, 1);
        }
        return new al((at) this.f38332b, (com.waze.modules.navigation.ao) this.f38333c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f38334d != 0 ? ((al) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((al) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f38334d == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f38331a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f38332b;
                Object obj3 = this.f38333c;
                this.f38331a = 1;
                obj = ((at) obj2).f38357f.b((com.waze.modules.navigation.ao) obj3).a().c(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.waze.modules.navigation.al alVar = (com.waze.modules.navigation.al) obj;
            at atVar = (at) this.f38332b;
            com.waze.shared_infra.i.e eVar = atVar.f38358g;
            Objects.toString(alVar);
            eVar.e("becomeDriver: startNavigation finished with reason: ".concat(String.valueOf(alVar)));
            if (alVar == com.waze.modules.navigation.al.f30301a) {
                atVar.n.e(true);
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        try {
            if (this.f38331a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                final Context context = (Context) ((p) this.f38333c).f38552b.get();
                if (context == null) {
                    return null;
                }
                float f2 = context.getResources().getDisplayMetrics().density;
                float f3 = 54.0f * f2;
                final int i2 = (int) (f2 * 58.0f);
                final int i3 = (int) f3;
                final String str = (String) this.f38332b;
                this.f38331a = 1;
                obj = kotlinx.coroutines.bo.a(h.c.k.f48060a, new h.g.a.a() { // from class: com.waze.sharedrive.e.o
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return (Bitmap) ((com.bumptech.glide.z) com.bumptech.glide.c.e(context).b().g(str).u()).l(i3, i2).get();
                    }
                }, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            }
            return (Bitmap) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(p pVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38334d = i2;
        this.f38333c = pVar;
        this.f38332b = str;
    }
}
