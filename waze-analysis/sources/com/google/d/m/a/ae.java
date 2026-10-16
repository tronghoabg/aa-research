package com.google.d.m.a;

import com.google.d.d.fo;
import j$.util.Objects;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class ae extends j {

    /* renamed from: a, reason: collision with root package name */
    private static final ab f7980a;

    /* renamed from: b, reason: collision with root package name */
    private static final bl f7981b = new bl(ae.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        ab adVar;
        try {
            adVar = new ac();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            adVar = new ad();
        }
        Throwable th3 = th;
        f7980a = adVar;
        if (th3 != null) {
            f7981b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    ae(int i2) {
        this.remainingField = i2;
    }

    final int A() {
        return f7980a.a(this);
    }

    final Set B() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setF = fo.f();
        f(setF);
        f7980a.b(this, setF);
        return (Set) Objects.requireNonNull(this.seenExceptionsField);
    }

    abstract void f(Set set);
}
