package r9;

import a2.C1323c;
import androidx.fragment.app.X;
import com.google.protobuf.ByteString;
import java.util.HashMap;
import n9.C3610e;
import p7.AbstractC3772b;
import w9.InterfaceC4396o;

/* loaded from: classes4.dex */
public final class t extends AbstractC3772b {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f44664e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f44665f;

    /* renamed from: g, reason: collision with root package name */
    public final C1323c f44666g;

    /* renamed from: h, reason: collision with root package name */
    public final u f44667h;

    /* renamed from: i, reason: collision with root package name */
    public final Y2.B f44668i;

    /* renamed from: j, reason: collision with root package name */
    public final X2.j f44669j;
    public z k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f44670l;

    public t() {
        ByteString byteString = ByteString.EMPTY;
        this.f44664e = new HashMap();
        this.f44666g = new C1323c(25);
        this.f44667h = new u(this);
        this.f44668i = new Y2.B((byte) 0, 23);
        X2.j jVar = new X2.j(27, false);
        jVar.f16075b = s9.g.f45372a;
        this.f44669j = jVar;
        this.f44665f = new HashMap();
    }

    @Override // p7.AbstractC3772b
    public final w B() {
        return new X(12);
    }

    @Override // p7.AbstractC3772b
    public final z D() {
        return this.k;
    }

    @Override // p7.AbstractC3772b
    public final InterfaceC3940A E() {
        return this.f44669j;
    }

    @Override // p7.AbstractC3772b
    public final Q G() {
        return this.f44667h;
    }

    @Override // p7.AbstractC3772b
    public final boolean J() {
        return this.f44670l;
    }

    @Override // p7.AbstractC3772b
    public final Object O(String str, InterfaceC4396o interfaceC4396o) {
        this.k.j();
        try {
            return interfaceC4396o.get();
        } finally {
            this.k.i();
        }
    }

    @Override // p7.AbstractC3772b
    public final void P(String str, Runnable runnable) {
        this.k.j();
        try {
            runnable.run();
        } finally {
            this.k.i();
        }
    }

    @Override // p7.AbstractC3772b
    public final void S() {
        A6.c.z(this.f44670l, "MemoryPersistence shutdown without start", new Object[0]);
        this.f44670l = false;
    }

    @Override // p7.AbstractC3772b
    public final void T() {
        A6.c.z(!this.f44670l, "MemoryPersistence double-started!", new Object[0]);
        this.f44670l = true;
    }

    @Override // p7.AbstractC3772b
    public final InterfaceC3944a u() {
        return this.f44668i;
    }

    @Override // p7.AbstractC3772b
    public final InterfaceC3945b x(C3610e c3610e) {
        HashMap map = this.f44665f;
        r rVar = (r) map.get(c3610e);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r();
        map.put(c3610e, rVar2);
        return rVar2;
    }

    @Override // p7.AbstractC3772b
    public final InterfaceC3949f y(C3610e c3610e) {
        return this.f44666g;
    }

    @Override // p7.AbstractC3772b
    public final v z(C3610e c3610e, InterfaceC3949f interfaceC3949f) {
        HashMap map = this.f44664e;
        C3961s c3961s = (C3961s) map.get(c3610e);
        if (c3961s != null) {
            return c3961s;
        }
        C3961s c3961s2 = new C3961s(this);
        map.put(c3610e, c3961s2);
        return c3961s2;
    }
}
