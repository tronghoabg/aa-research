package com.waze.uid.state_impl.email;

import android.content.ComponentCallbacks;
import android.support.v4.app.av;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import com.waze.NativeManager;
import h.g.b.ar;
import kotlinx.b.c.br;
import kotlinx.b.c.ca;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class n implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44655a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44656b;

    public /* synthetic */ n(Object obj, int i2) {
        this.f44656b = i2;
        this.f44655a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Object, java.util.List] */
    @Override // h.g.a.a
    public final Object invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        switch (this.f44656b) {
            case 0:
                return r.c((r) this.f44655a);
            case 1:
                return r.b((r) this.f44655a);
            case 2:
                return s.a((s) this.f44655a);
            case 3:
                return s.b((s) this.f44655a);
            case 4:
                return ac.a((ac) this.f44655a);
            case 5:
                return ac.b((ac) this.f44655a);
            case 6:
                ((com.waze.uid.e.f) this.f44655a).o(com.waze.uid.state_impl.g.l.f44685a);
                return h.ab.f48028a;
            case 7:
                org.a.d.a.a aVar = (org.a.d.a.a) this.f44655a;
                if (aVar instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) aVar).l();
                    int i2 = ar.f48106a;
                    mVar = new h.g.b.m(NativeManager.class);
                } else {
                    bVarC = aVar.getKoin().a().c();
                    int i3 = ar.f48106a;
                    mVar = new h.g.b.m(NativeManager.class);
                }
                return (NativeManager) bVarC.a(mVar, null, null);
            case 8:
                return Boolean.valueOf(((e.a.k) this.f44655a).i());
            case 9:
                return h.g.b.o.v((Object[]) this.f44655a);
            case 10:
                return this.f44655a;
            case 11:
                int i4 = kotlinx.b.o.f51264a;
                return ((h.l.s) this.f44655a.get(0)).b();
            case 12:
                int i5 = kotlinx.b.o.f51264a;
                return ((h.l.s) this.f44655a.get(0)).b();
            case 13:
                return ((h.l.s) this.f44655a.get(0)).b();
            case 14:
                Object obj = this.f44655a;
                return Integer.valueOf(ca.a((kotlinx.b.a.q) obj, ((br) obj).o()));
            case 15:
                return this.f44655a;
            case 16:
                Object obj2 = this.f44655a;
                h.g.b.x.f(obj2, "<this>");
                if (!(obj2 instanceof org.a.a.b.a)) {
                    throw new IllegalStateException("Activity should implement AndroidScopeComponent");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) obj2;
                org.a.d.k.b bVarD = k.a.k.i(componentCallbacks).d(org.a.b.c.a.c(obj2));
                return bVarD == null ? org.a.b.b.d.d(componentCallbacks, (LifecycleOwner) obj2) : bVarD;
            case 17:
                Object obj3 = this.f44655a;
                h.g.b.x.f(obj3, "<this>");
                if (!(obj3 instanceof org.a.a.b.a)) {
                    throw new IllegalStateException("Activity should implement AndroidScopeComponent");
                }
                ComponentActivity componentActivity = (ComponentActivity) obj3;
                org.a.b.b.a aVar2 = new org.a.b.b.a(componentActivity, 1);
                int i6 = ar.f48106a;
                org.a.b.b.e eVar = (org.a.b.b.e) new ViewModelLazy(new h.g.b.m(org.a.b.b.e.class), new org.a.b.b.a(componentActivity, 0), aVar2, new org.a.b.b.a(componentActivity, 2)).getValue();
                if (eVar.a() == null) {
                    eVar.b(k.a.k.i((ComponentCallbacks) obj3).c(org.a.b.c.a.c(obj3), org.a.b.c.a.d(obj3), null));
                }
                org.a.d.k.b bVarA = eVar.a();
                h.g.b.x.c(bVarA);
                return bVarA;
            case 18:
                Object obj4 = this.f44655a;
                h.g.b.x.f(obj4, "<this>");
                if (!(obj4 instanceof org.a.a.b.a)) {
                    throw new IllegalStateException("Fragment should implement AndroidScopeComponent");
                }
                ComponentCallbacks componentCallbacks2 = (ComponentCallbacks) obj4;
                org.a.d.k.b bVarD2 = k.a.k.i(componentCallbacks2).d(org.a.b.c.a.c(obj4));
                if (bVarD2 == null) {
                    bVarD2 = org.a.b.b.d.d(componentCallbacks2, (LifecycleOwner) obj4);
                }
                av avVarRequireActivity = ((android.support.v4.app.ar) obj4).requireActivity();
                h.g.b.x.e(avVarRequireActivity, "requireActivity(...)");
                av avVar = avVarRequireActivity;
                h.g.b.x.f(avVar, "<this>");
                org.a.d.k.b bVarD3 = k.a.k.i(avVar).d(org.a.b.c.a.c(avVar));
                if (bVarD3 != null) {
                    bVarD2.i(bVarD3);
                    return bVarD2;
                }
                bVarD2.n().c("Fragment '" + obj4 + "' can't be linked to parent activity scope");
                return bVarD2;
            case 19:
                return (org.a.d.h.a) this.f44655a;
            default:
                return "| >> parameters " + this.f44655a + " ";
        }
    }
}
