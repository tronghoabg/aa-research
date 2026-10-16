package k1;

import Yf.AbstractC1300f;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import b1.C1494c;
import ba.C1521a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1300f f38812a;

    /* renamed from: b, reason: collision with root package name */
    public List f38813b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f38814c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f38815d;

    public d0(AbstractC1300f abstractC1300f) {
        super(abstractC1300f.f16856b);
        this.f38815d = new HashMap();
        this.f38812a = abstractC1300f;
    }

    public final g0 a(WindowInsetsAnimation windowInsetsAnimation) {
        g0 g0Var = (g0) this.f38815d.get(windowInsetsAnimation);
        if (g0Var == null) {
            g0Var = new g0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                g0Var.f38830a = new e0(windowInsetsAnimation);
            }
            this.f38815d.put(windowInsetsAnimation, g0Var);
        }
        return g0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f38812a.a(a(windowInsetsAnimation));
        this.f38815d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f38812a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f38814c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f38814c = arrayList2;
            this.f38813b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationG = c0.g(list.get(size));
            g0 g0VarA = a(windowInsetsAnimationG);
            g0VarA.f38830a.d(windowInsetsAnimationG.getFraction());
            this.f38814c.add(g0VarA);
        }
        return this.f38812a.c(v0.g(null, windowInsets), this.f38813b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C1521a c1521aD = this.f38812a.d(a(windowInsetsAnimation), new C1521a(bounds));
        c1521aD.getClass();
        com.applovin.impl.sdk.z.C();
        return com.applovin.impl.sdk.z.h(((C1494c) c1521aD.f19414b).d(), ((C1494c) c1521aD.f19415c).d());
    }
}
