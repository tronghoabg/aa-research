package n3;

import android.os.Bundle;
import androidx.lifecycle.C1446j;
import j.C3070g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import s.C3982b;
import s.C3983c;
import s.C3986f;

/* renamed from: n3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3592d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f40905b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f40906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40907d;

    /* renamed from: e, reason: collision with root package name */
    public C3070g f40908e;

    /* renamed from: a, reason: collision with root package name */
    public final C3986f f40904a = new C3986f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f40909f = true;

    public final Bundle a(String key) {
        AbstractC3340k.e(key, "key");
        if (!this.f40907d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f40906c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f40906c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f40906c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f40906c = null;
        return bundle2;
    }

    public final InterfaceC3591c b() {
        String str;
        InterfaceC3591c interfaceC3591c;
        Iterator it = this.f40904a.iterator();
        do {
            C3982b c3982b = (C3982b) it;
            if (!c3982b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c3982b.next();
            AbstractC3340k.d(components, "components");
            str = (String) components.getKey();
            interfaceC3591c = (InterfaceC3591c) components.getValue();
        } while (!AbstractC3340k.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC3591c;
    }

    public final void c(String str, InterfaceC3591c provider) {
        Object obj;
        AbstractC3340k.e(provider, "provider");
        C3986f c3986f = this.f40904a;
        C3983c c3983cA = c3986f.a(str);
        if (c3983cA != null) {
            obj = c3983cA.f44815b;
        } else {
            C3983c c3983c = new C3983c(str, provider);
            c3986f.f44824d++;
            C3983c c3983c2 = c3986f.f44822b;
            if (c3983c2 == null) {
                c3986f.f44821a = c3983c;
                c3986f.f44822b = c3983c;
            } else {
                c3983c2.f44816c = c3983c;
                c3983c.f44817d = c3983c2;
                c3986f.f44822b = c3983c;
            }
            obj = null;
        }
        if (((InterfaceC3591c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() throws NoSuchMethodException, SecurityException {
        if (!this.f40909f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C3070g c3070g = this.f40908e;
        if (c3070g == null) {
            c3070g = new C3070g(this);
        }
        this.f40908e = c3070g;
        try {
            C1446j.class.getDeclaredConstructor(new Class[0]);
            C3070g c3070g2 = this.f40908e;
            if (c3070g2 != null) {
                ((LinkedHashSet) c3070g2.f38462b).add(C1446j.class.getName());
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + C1446j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
