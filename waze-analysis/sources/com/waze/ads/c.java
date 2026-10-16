package com.waze.ads;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.runtime.DisposableEffectScope;
import com.waze.a.z;
import com.waze.car_lib.o.ae;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.cq;
import com.waze.car_lib.screens.al;
import com.waze.car_lib.screens.cf;
import com.waze.car_lib.screens.core.n;
import com.waze.car_lib.screens.o;
import com.waze.car_lib.screens.q;
import com.waze.l.v;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.search.h.y;
import com.waze.search.t;
import h.ab;
import h.g.b.an;
import h.g.b.ap;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13945c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f13946d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i2) {
        this.f13946d = i2;
        this.f13943a = obj;
        this.f13944b = obj2;
        this.f13945c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.waze.ht, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v10, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.foundation.gestures.ScrollScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26, types: [com.waze.main_screen.u.b.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v47, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v50, types: [androidx.compose.runtime.MutableFloatState, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        BluetoothAdapter adapter;
        Object[] objArr = 0;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        switch (this.f13946d) {
            case 0:
                break;
            case 1:
                x.f((ActivityResult) obj, "it");
                Object systemService = ((Context) this.f13943a).getSystemService("bluetooth");
                BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
                boolean z = (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null || !adapter.isEnabled()) ? false : true;
                Object obj2 = this.f13945c;
                this.f13944b.invoke(Boolean.valueOf(z));
                ((v) obj2).l();
                break;
            case 2:
                com.waze.o.d.b.b.c cVar = (com.waze.o.d.b.b.c) obj;
                Context context = (Context) this.f13943a;
                x.c(cVar);
                o oVar = new o(c3 == true ? 1 : 0);
                Object obj3 = this.f13944b;
                n nVar = (n) this.f13945c;
                nVar.q(ae.g(context, cVar, oVar, new al(nVar, obj3, c2 == true ? 1 : 0)));
                break;
            case 3:
                cq cqVar = (cq) obj;
                Context context2 = (Context) this.f13943a;
                x.c(cqVar);
                Object obj4 = this.f13944b;
                n nVar2 = (n) this.f13945c;
                nVar2.q(dh.v(context2, cqVar, new q(nVar2, obj4, 3), new o(4)));
                break;
            case 4:
                String str = (String) obj;
                x.f(str, "it");
                ((cf) this.f13943a).n().a(new z(this.f13945c, str, this.f13944b, 12, (boolean[]) null));
                break;
            case 5:
                x.f((DisposableEffectScope) obj, "$this$DisposableEffect");
                com.waze.ad.a aVar = new com.waze.ad.a((com.waze.t.c.k) this.f13944b, (Context) this.f13943a, c4 == true ? 1 : 0);
                ?? r7 = this.f13945c;
                r7.getLifecycle().addObserver(aVar);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                Boolean bool = (Boolean) obj;
                int i2 = SideMenuAutoCompleteRecycler.Q;
                ?? r0 = this.f13945c;
                if (bool != null && bool.booleanValue()) {
                    r0.a(null);
                    break;
                } else {
                    r0.a(new t().g((String) this.f13944b).a((Context) this.f13943a));
                    break;
                }
            case 12:
                com.waze.menus.a.a.c cVar2 = (com.waze.menus.a.a.c) obj;
                x.f(cVar2, "link");
                this.f13944b.invoke(this.f13943a, cVar2);
                this.f13945c.invoke();
                break;
            case 13:
                x.f((Context) obj, "it");
                Object obj5 = this.f13944b;
                Object obj6 = this.f13943a;
                break;
            case 14:
                break;
            case 15:
                AnimationScope animationScope = (AnimationScope) obj;
                x.f(animationScope, "$this$animateDecay");
                float fFloatValue = ((Number) animationScope.getValue()).floatValue();
                an anVar = (an) this.f13945c;
                float f2 = fFloatValue - anVar.f48102a;
                float fScrollBy = this.f13943a.scrollBy(f2);
                anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
                ((an) this.f13944b).f48102a = ((Number) animationScope.getVelocity()).floatValue();
                if (Math.abs(f2 - fScrollBy) > 0.5f) {
                    animationScope.cancelAnimation();
                }
                break;
            case 16:
                Boolean bool2 = (Boolean) obj;
                if (bool2 == null || !bool2.booleanValue()) {
                    y yVar = (y) this.f13944b;
                    t tVarG = new t().g(yVar.c());
                    if (yVar.b() != null) {
                        tVarG.c(yVar.b());
                    }
                    if (yVar.a() != null) {
                        tVarG.d(yVar.a());
                    }
                    ((ActivityResultLauncher) this.f13945c).launch(tVarG.a((Context) this.f13943a));
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                ap apVar = (ap) this.f13944b;
                long j2 = jLongValue - apVar.f48104a;
                apVar.f48104a = jLongValue;
                ?? r8 = this.f13943a;
                r8.setFloatValue(com.waze.br.c.d.g(r8) + ((j2 / 1.0E9f) * 8.3333f * ((Number) this.f13945c.getValue()).floatValue()));
                break;
        }
        return ab.f48028a;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i2, byte[] bArr) {
        this.f13946d = i2;
        this.f13945c = obj;
        this.f13943a = obj2;
        this.f13944b = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i2, char[] cArr) {
        this.f13946d = i2;
        this.f13943a = obj;
        this.f13945c = obj2;
        this.f13944b = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i2, int[] iArr) {
        this.f13946d = i2;
        this.f13944b = obj;
        this.f13943a = obj2;
        this.f13945c = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i2, short[] sArr) {
        this.f13946d = i2;
        this.f13945c = obj;
        this.f13944b = obj2;
        this.f13943a = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i2, boolean[] zArr) {
        this.f13946d = i2;
        this.f13944b = obj;
        this.f13945c = obj2;
        this.f13943a = obj3;
    }
}
