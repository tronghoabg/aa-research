package ad;

import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import uc.C4271h;
import uc.C4278o;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* renamed from: ad.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1357b implements InterfaceC1455t, InterfaceC4279p, InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public C4271h f17562a;

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        this.f17562a = null;
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        this.f17562a = (C4271h) interfaceC4270g;
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        String str = c4278o.f46759a;
        str.getClass();
        if (str.equals("stop")) {
            androidx.lifecycle.J.f18589i.f18595f.c(this);
        } else if (str.equals("start")) {
            androidx.lifecycle.J.f18589i.f18595f.a(this);
        } else {
            ((tc.g) interfaceC4280q).c();
        }
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        C4271h c4271h;
        C4271h c4271h2;
        if (enumC1449m == EnumC1449m.ON_START && (c4271h2 = this.f17562a) != null) {
            c4271h2.a("foreground");
        } else {
            if (enumC1449m != EnumC1449m.ON_STOP || (c4271h = this.f17562a) == null) {
                return;
            }
            c4271h.a("background");
        }
    }
}
