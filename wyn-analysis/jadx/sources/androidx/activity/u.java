package androidx.activity;

import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class u implements InterfaceC1455t, c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1451o f17737a;

    /* renamed from: b, reason: collision with root package name */
    public final o f17738b;

    /* renamed from: c, reason: collision with root package name */
    public v f17739c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f17740d;

    public u(w wVar, AbstractC1451o abstractC1451o, o onBackPressedCallback) {
        AbstractC3340k.e(onBackPressedCallback, "onBackPressedCallback");
        this.f17740d = wVar;
        this.f17737a = abstractC1451o;
        this.f17738b = onBackPressedCallback;
        abstractC1451o.a(this);
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f17737a.c(this);
        this.f17738b.f17725b.remove(this);
        v vVar = this.f17739c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f17739c = null;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        if (enumC1449m != EnumC1449m.ON_START) {
            if (enumC1449m != EnumC1449m.ON_STOP) {
                if (enumC1449m == EnumC1449m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                v vVar = this.f17739c;
                if (vVar != null) {
                    vVar.cancel();
                    return;
                }
                return;
            }
        }
        w wVar = this.f17740d;
        o onBackPressedCallback = this.f17738b;
        wVar.getClass();
        AbstractC3340k.e(onBackPressedCallback, "onBackPressedCallback");
        wVar.f17744b.addLast(onBackPressedCallback);
        v vVar2 = new v(wVar, onBackPressedCallback);
        onBackPressedCallback.f17725b.add(vVar2);
        wVar.d();
        onBackPressedCallback.f17726c = new S8.d(0, wVar, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
        this.f17739c = vVar2;
    }
}
