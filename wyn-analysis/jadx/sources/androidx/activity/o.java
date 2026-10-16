package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17724a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f17725b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public C3338i f17726c;

    public o(boolean z2) {
        this.f17724a = z2;
    }

    public void a() {
    }

    public abstract void b();

    public void c(b backEvent) {
        AbstractC3340k.e(backEvent, "backEvent");
    }

    public void d(b backEvent) {
        AbstractC3340k.e(backEvent, "backEvent");
    }

    public final void e() {
        Iterator it = this.f17725b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.i, tf.a] */
    public final void f(boolean z2) {
        this.f17724a = z2;
        ?? r12 = this.f17726c;
        if (r12 != 0) {
            r12.invoke();
        }
    }
}
