package Q3;

import A7.V0;
import android.content.Context;
import ff.o;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final b7.k f9829a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9830b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9831c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f9832d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9833e;

    public f(Context context, b7.k kVar) {
        this.f9829a = kVar;
        Context applicationContext = context.getApplicationContext();
        AbstractC3340k.d(applicationContext, "context.applicationContext");
        this.f9830b = applicationContext;
        this.f9831c = new Object();
        this.f9832d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(P3.b listener) {
        AbstractC3340k.e(listener, "listener");
        synchronized (this.f9831c) {
            if (this.f9832d.remove(listener) && this.f9832d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f9831c) {
            Object obj2 = this.f9833e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f9833e = obj;
                ((V0) this.f9829a.f19398d).execute(new C8.d(26, o.S0(this.f9832d), this));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
