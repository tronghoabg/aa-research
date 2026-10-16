package androidx.compose.ui.platform;

import A.W;
import B.C0318i;
import B.F;
import B.z;
import N.AbstractC0723f0;
import N.C0718d;
import N.C0725g0;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.D;
import N.L0;
import N.P;
import N.V;
import V.d;
import V.e;
import W.c;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.wynauto.wyn.R;
import ef.C2515C;
import j.C3070g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.G;
import n3.C3592d;
import n3.f;
import org.jetbrains.annotations.NotNull;
import tf.l;
import u0.C4180j;
import u0.C4188n;
import u0.C4199w;
import u0.C4200x;
import u0.ComponentCallbacks2C4201y;
import u0.O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LN/f0;", "Landroidx/lifecycle/v;", "d", "LN/f0;", "getLocalLifecycleOwner", "()LN/f0;", "LocalLifecycleOwner", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final D f18011a = new D(P.f7727c, C4199w.f46388j);

    /* renamed from: b, reason: collision with root package name */
    public static final L0 f18012b = new L0(C4199w.k);

    /* renamed from: c, reason: collision with root package name */
    public static final L0 f18013c = new L0(C4199w.f46389l);

    /* renamed from: d, reason: collision with root package name */
    public static final L0 f18014d = new L0(C4199w.f46390m);

    /* renamed from: e, reason: collision with root package name */
    public static final L0 f18015e = new L0(C4199w.f46391n);

    /* renamed from: f, reason: collision with root package name */
    public static final L0 f18016f = new L0(C4199w.f46392o);

    public static final void a(C4188n c4188n, d content, C0740o c0740o, int i5) {
        V v2;
        int i10;
        boolean z2;
        LinkedHashMap linkedHashMap;
        boolean z10;
        AbstractC3340k.e(content, "content");
        c0740o.N(1396852028);
        Context context = c4188n.getContext();
        c0740o.M(-492369756);
        Object objF = c0740o.F();
        Object obj = C0732k.f7800a;
        if (objF == obj) {
            objF = C0718d.G(context.getResources().getConfiguration(), P.f7727c);
            c0740o.U(objF);
        }
        c0740o.p(false);
        V v10 = (V) objF;
        c0740o.M(1157296644);
        boolean zE = c0740o.e(v10);
        Object objF2 = c0740o.F();
        if (zE || objF2 == obj) {
            objF2 = new z(v10, 1);
            c0740o.U(objF2);
        }
        c0740o.p(false);
        c4188n.setConfigurationChangeObserver((l) objF2);
        c0740o.M(-492369756);
        Object objF3 = c0740o.F();
        if (objF3 == obj) {
            AbstractC3340k.d(context, "context");
            objF3 = new u0.D(context);
            c0740o.U(objF3);
        }
        c0740o.p(false);
        u0.D d3 = (u0.D) objF3;
        C4180j viewTreeOwners = c4188n.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        c0740o.M(-492369756);
        Object objF4 = c0740o.F();
        f fVar = viewTreeOwners.f46245b;
        if (objF4 == obj) {
            Object parent = c4188n.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View view = (View) parent;
            i10 = 6;
            Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
            String id2 = tag instanceof String ? (String) tag : null;
            if (id2 == null) {
                id2 = String.valueOf(view.getId());
            }
            AbstractC3340k.e(id2, "id");
            String str = c.class.getSimpleName() + ':' + id2;
            C3592d savedStateRegistry = fVar.getSavedStateRegistry();
            Bundle bundleA = savedStateRegistry.a(str);
            if (bundleA != null) {
                linkedHashMap = new LinkedHashMap();
                Set<String> setKeySet = bundleA.keySet();
                v2 = v10;
                AbstractC3340k.d(setKeySet, "this.keySet()");
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    String key = (String) it.next();
                    Iterator it2 = it;
                    ArrayList parcelableArrayList = bundleA.getParcelableArrayList(key);
                    if (parcelableArrayList == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                    }
                    AbstractC3340k.d(key, "key");
                    linkedHashMap.put(key, parcelableArrayList);
                    it = it2;
                    bundleA = bundleA;
                }
            } else {
                v2 = v10;
                linkedHashMap = null;
            }
            L0 l02 = W.f.f14931a;
            W.d dVar = new W.d(linkedHashMap);
            try {
                savedStateRegistry.c(str, new C3070g(dVar, 2));
                z10 = true;
            } catch (IllegalArgumentException unused) {
                z10 = false;
            }
            objF4 = new O(dVar, new u0.P(z10, savedStateRegistry, str));
            c0740o.U(objF4);
            z2 = false;
        } else {
            v2 = v10;
            i10 = 6;
            z2 = false;
        }
        c0740o.p(z2);
        O o7 = (O) objF4;
        C0718d.c(C2515C.f34653a, new F(o7, 19), c0740o);
        AbstractC3340k.d(context, "context");
        Object obj2 = (Configuration) v2.getValue();
        c0740o.M(-485908294);
        c0740o.M(-492369756);
        Object objF5 = c0740o.F();
        if (objF5 == obj) {
            objF5 = new w0.c();
            c0740o.U(objF5);
        }
        c0740o.p(false);
        w0.c cVar = (w0.c) objF5;
        G g9 = new G();
        c0740o.M(-492369756);
        Object objF6 = c0740o.F();
        if (objF6 == obj) {
            c0740o.U(obj2);
        } else {
            obj2 = objF6;
        }
        c0740o.p(false);
        g9.f39740a = obj2;
        c0740o.M(-492369756);
        Object objF7 = c0740o.F();
        if (objF7 == obj) {
            objF7 = new ComponentCallbacks2C4201y(g9, cVar);
            c0740o.U(objF7);
        }
        c0740o.p(false);
        C0718d.c(cVar, new W(22, context, (ComponentCallbacks2C4201y) objF7), c0740o);
        c0740o.p(false);
        Configuration configuration = (Configuration) v2.getValue();
        AbstractC3340k.d(configuration, "configuration");
        C0725g0 c0725g0A = f18011a.a(configuration);
        C0725g0 c0725g0A2 = f18012b.a(context);
        C0725g0 c0725g0A3 = f18014d.a(viewTreeOwners.f46244a);
        C0725g0 c0725g0A4 = f18015e.a(fVar);
        C0725g0 c0725g0A5 = W.f.f14931a.a(o7);
        C0725g0 c0725g0A6 = f18016f.a(c4188n.getView());
        C0725g0 c0725g0A7 = f18013c.a(cVar);
        C0725g0[] c0725g0Arr = new C0725g0[7];
        c0725g0Arr[0] = c0725g0A;
        c0725g0Arr[1] = c0725g0A2;
        c0725g0Arr[2] = c0725g0A3;
        c0725g0Arr[3] = c0725g0A4;
        c0725g0Arr[4] = c0725g0A5;
        c0725g0Arr[5] = c0725g0A6;
        c0725g0Arr[i10] = c0725g0A7;
        C0718d.a(c0725g0Arr, e.b(c0740o, 1471621628, new C4200x(c4188n, d3, content, i5)), c0740o, 56);
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0318i(c4188n, content, i5, i10);
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final AbstractC0723f0 getLocalLifecycleOwner() {
        return f18014d;
    }
}
