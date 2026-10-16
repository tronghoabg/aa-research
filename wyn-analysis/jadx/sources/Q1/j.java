package Q1;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final q f9679a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9680b;

    /* renamed from: c, reason: collision with root package name */
    public final h f9681c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f9682d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f9683e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f9684f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9685g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9686h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9687i;

    public j(Looper looper, q qVar, h hVar) {
        this(new CopyOnWriteArraySet(), looper, qVar, hVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f9685g) {
            try {
                if (this.f9686h) {
                    return;
                }
                this.f9682d.add(new i(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f9684f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        s sVar = this.f9680b;
        if (!sVar.f9711a.hasMessages(1)) {
            sVar.getClass();
            r rVarB = s.b();
            rVarB.f9709a = sVar.f9711a.obtainMessage(1);
            sVar.getClass();
            Message message = rVarB.f9709a;
            message.getClass();
            sVar.f9711a.sendMessageAtFrontOfQueue(message);
            rVarB.a();
        }
        ArrayDeque arrayDeque2 = this.f9683e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i5, g gVar) {
        f();
        this.f9684f.add(new Mb.b(new CopyOnWriteArraySet(this.f9682d), i5, gVar, 1));
    }

    public final void d() {
        f();
        synchronized (this.f9685g) {
            this.f9686h = true;
        }
        Iterator it = this.f9682d.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            h hVar = this.f9681c;
            iVar.f9678d = true;
            if (iVar.f9677c) {
                iVar.f9677c = false;
                hVar.b(iVar.f9675a, iVar.f9676b.b());
            }
        }
        this.f9682d.clear();
    }

    public final void e(int i5, g gVar) {
        c(i5, gVar);
        b();
    }

    public final void f() {
        if (this.f9687i) {
            k.g(Thread.currentThread() == this.f9680b.f9711a.getLooper().getThread());
        }
    }

    public j(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, q qVar, h hVar, boolean z2) {
        this.f9679a = qVar;
        this.f9682d = copyOnWriteArraySet;
        this.f9681c = hVar;
        this.f9685g = new Object();
        this.f9683e = new ArrayDeque();
        this.f9684f = new ArrayDeque();
        this.f9680b = qVar.a(looper, new f(this, 0));
        this.f9687i = z2;
    }
}
