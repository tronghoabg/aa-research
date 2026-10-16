package u0;

import N.C0744s;
import N.InterfaceC0742p;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class M0 implements InterfaceC0742p, InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final C4188n f46155a;

    /* renamed from: b, reason: collision with root package name */
    public final C0744s f46156b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46157c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1451o f46158d;

    /* renamed from: e, reason: collision with root package name */
    public V.d f46159e = K.f46131a;

    public M0(C4188n c4188n, C0744s c0744s) {
        this.f46155a = c4188n;
        this.f46156b = c0744s;
    }

    @Override // N.InterfaceC0742p
    public final boolean a() {
        return this.f46156b.f7920r;
    }

    @Override // N.InterfaceC0742p
    public final void b(V.d content) {
        AbstractC3340k.e(content, "content");
        this.f46155a.setOnViewTreeOwnersAvailable(new A.W(25, this, content));
    }

    @Override // N.InterfaceC0742p
    public final void dispose() {
        if (!this.f46157c) {
            this.f46157c = true;
            this.f46155a.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC1451o abstractC1451o = this.f46158d;
            if (abstractC1451o != null) {
                abstractC1451o.c(this);
            }
        }
        this.f46156b.dispose();
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        if (enumC1449m == EnumC1449m.ON_DESTROY) {
            dispose();
        } else {
            if (enumC1449m != EnumC1449m.ON_CREATE || this.f46157c) {
                return;
            }
            b(this.f46159e);
        }
    }
}
