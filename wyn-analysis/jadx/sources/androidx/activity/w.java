package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.EnumC1450n;
import androidx.lifecycle.InterfaceC1457v;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f17743a;

    /* renamed from: b, reason: collision with root package name */
    public final ff.l f17744b = new ff.l();

    /* renamed from: c, reason: collision with root package name */
    public o f17745c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f17746d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f17747e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17748f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17749g;

    public w(Runnable runnable) {
        this.f17743a = runnable;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            this.f17746d = i5 >= 34 ? t.f17736a.a(new p(this, 0), new p(this, 1), new q(this, 0), new q(this, 1)) : r.f17731a.a(new q(this, 2));
        }
    }

    public final void a(InterfaceC1457v owner, o onBackPressedCallback) {
        AbstractC3340k.e(owner, "owner");
        AbstractC3340k.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1451o lifecycle = owner.getLifecycle();
        if (lifecycle.b() == EnumC1450n.f18676a) {
            return;
        }
        onBackPressedCallback.f17725b.add(new u(this, lifecycle, onBackPressedCallback));
        d();
        onBackPressedCallback.f17726c = new S8.d(0, this, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        o oVarPrevious;
        o oVar = this.f17745c;
        if (oVar == null) {
            ff.l lVar = this.f17744b;
            ListIterator listIterator = lVar.listIterator(lVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    oVarPrevious = 0;
                    break;
                } else {
                    oVarPrevious = listIterator.previous();
                    if (((o) oVarPrevious).f17724a) {
                        break;
                    }
                }
            }
            oVar = oVarPrevious;
        }
        this.f17745c = null;
        if (oVar != null) {
            oVar.b();
        } else {
            this.f17743a.run();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f17747e;
        OnBackInvokedCallback onBackInvokedCallback = this.f17746d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f17731a;
        if (z2 && !this.f17748f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f17748f = true;
        } else {
            if (z2 || !this.f17748f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f17748f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f17749g;
        ff.l lVar = this.f17744b;
        boolean z10 = false;
        if (!(lVar instanceof Collection) || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((o) it.next()).f17724a) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f17749g = z10;
        if (z10 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z10);
    }
}
