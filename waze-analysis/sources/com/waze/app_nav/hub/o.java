package com.waze.app_nav.hub;

import android.content.Intent;
import com.waze.cr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15361c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f15362d;

    public /* synthetic */ o(com.waze.an.d.d dVar, com.waze.an.a.u uVar, h.g.a.a aVar, int i2) {
        this.f15362d = i2;
        this.f15361c = dVar;
        this.f15359a = uVar;
        this.f15360b = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.waze.cr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.waze.cr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f15362d) {
            case 0:
                af afVar = (af) this.f15359a;
                com.waze.shared_infra.i.e eVarC = afVar.al().c();
                Object obj = this.f15360b;
                Objects.toString(obj);
                eVarC.e("popup dismissed model=".concat(obj.toString()));
                ((com.waze.app_nav.hub.b.i) this.f15361c).b(false);
                afVar.al().b().c((com.waze.app_nav.hub.b.k) obj);
                break;
            case 1:
                this.f15359a.setValue(Boolean.valueOf(false));
                ((com.waze.t.c.k) this.f15361c).a().c();
                this.f15360b.invoke(com.waze.t.c.o.f40869b);
                break;
            case 2:
                this.f15359a.setValue(Boolean.valueOf(false));
                ((com.waze.t.c.k) this.f15361c).a().f();
                this.f15360b.invoke(com.waze.t.c.o.f40869b);
                break;
            case 3:
                int i2 = com.waze.z.a.c.q.f45886a;
                Object obj2 = this.f15361c;
                this.f15360b.invoke(this.f15359a, obj2);
                break;
            case 4:
                int i3 = com.waze.z.a.c.q.f45886a;
                Object obj3 = this.f15361c;
                this.f15360b.invoke(this.f15359a, obj3);
                break;
            case 5:
                if (((AtomicBoolean) this.f15360b).compareAndSet(false, true)) {
                    Object obj4 = this.f15361c;
                    ((com.waze.ab.f) this.f15359a).f((com.waze.messages.c) obj4, com.waze.ac.j.f13858f);
                }
                break;
            case 6:
                Object obj5 = this.f15360b;
                int i4 = com.waze.google_assistant.n.f24227a;
                String str = (String) obj5;
                boolean zM = h.n.o.m(str, "home", true);
                ?? r3 = this.f15361c;
                if (zM) {
                    r3.c();
                } else if (h.n.o.m(str, "work", true)) {
                    r3.d();
                } else {
                    r3.e(str, com.waze.ad.c.b.b((Intent) this.f15359a));
                }
                break;
            case 7:
                Object obj6 = this.f15359a;
                int i5 = com.waze.google_assistant.n.f24227a;
                this.f15361c.e((String) this.f15360b, com.waze.ad.c.b.b((Intent) obj6));
                break;
            case 8:
                ((com.waze.an.d.d) this.f15361c).a((com.waze.an.a.u) this.f15359a);
                ?? r5 = this.f15360b;
                if (r5 != 0) {
                    r5.invoke();
                }
                break;
            default:
                ((com.waze.an.d.d) this.f15361c).a((com.waze.an.a.u) this.f15359a);
                ?? r52 = this.f15360b;
                if (r52 != 0) {
                    r52.invoke();
                }
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ o(af afVar, com.waze.app_nav.hub.b.k kVar, com.waze.app_nav.hub.b.i iVar, int i2) {
        this.f15362d = i2;
        this.f15359a = afVar;
        this.f15360b = kVar;
        this.f15361c = iVar;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i2) {
        this.f15362d = i2;
        this.f15361c = obj;
        this.f15360b = obj2;
        this.f15359a = obj3;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i2, byte[] bArr) {
        this.f15362d = i2;
        this.f15360b = obj;
        this.f15359a = obj2;
        this.f15361c = obj3;
    }

    public /* synthetic */ o(String str, cr crVar, Intent intent, int i2) {
        this.f15362d = i2;
        this.f15360b = str;
        this.f15361c = crVar;
        this.f15359a = intent;
    }
}
