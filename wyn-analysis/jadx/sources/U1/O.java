package U1;

import java.util.ArrayList;
import k2.AbstractC3144a;
import k2.C3142D;

/* loaded from: classes.dex */
public final class O implements H {

    /* renamed from: a, reason: collision with root package name */
    public final C3142D f11971a;

    /* renamed from: d, reason: collision with root package name */
    public int f11974d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11975e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11973c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f11972b = new Object();

    public O(AbstractC3144a abstractC3144a, boolean z2) {
        this.f11971a = new C3142D(abstractC3144a, z2);
    }

    @Override // U1.H
    public final N1.N a() {
        return this.f11971a.f38898o;
    }

    @Override // U1.H
    public final Object getUid() {
        return this.f11972b;
    }
}
