package w1;

import Ef.E;
import ac.C1346a;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KProperty;
import r7.AbstractC3935e;
import t0.C4068p;
import tf.l;
import u1.C4209G;
import u1.C4216e;
import u1.InterfaceC4213b;
import wf.InterfaceC4406b;
import x1.C4451d;
import x1.C4456i;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4351b implements InterfaceC4406b {

    /* renamed from: a, reason: collision with root package name */
    public final String f47274a;

    /* renamed from: b, reason: collision with root package name */
    public final C1346a f47275b;

    /* renamed from: c, reason: collision with root package name */
    public final l f47276c;

    /* renamed from: d, reason: collision with root package name */
    public final E f47277d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f47278e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C4451d f47279f;

    public C4351b(String name, C1346a c1346a, l lVar, E e7) {
        AbstractC3340k.e(name, "name");
        this.f47274a = name;
        this.f47275b = c1346a;
        this.f47276c = lVar;
        this.f47277d = e7;
        this.f47278e = new Object();
    }

    @Override // wf.InterfaceC4406b
    public final Object getValue(Object obj, KProperty property) {
        C4451d c4451d;
        Context thisRef = (Context) obj;
        AbstractC3340k.e(thisRef, "thisRef");
        AbstractC3340k.e(property, "property");
        C4451d c4451d2 = this.f47279f;
        if (c4451d2 != null) {
            return c4451d2;
        }
        synchronized (this.f47278e) {
            try {
                if (this.f47279f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    InterfaceC4213b dVar = this.f47275b;
                    l lVar = this.f47276c;
                    AbstractC3340k.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    E e7 = this.f47277d;
                    A0.e eVar = new A0.e(6, applicationContext, this);
                    AbstractC3340k.e(migrations, "migrations");
                    C4456i c4456i = C4456i.f47657a;
                    C4068p c4068p = new C4068p(eVar, 7);
                    if (dVar == null) {
                        dVar = new ae.d(14);
                    }
                    this.f47279f = new C4451d(new C4209G(c4068p, c4456i, AbstractC3935e.C(new C4216e(migrations, null)), dVar, e7));
                }
                c4451d = this.f47279f;
                AbstractC3340k.b(c4451d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4451d;
    }
}
