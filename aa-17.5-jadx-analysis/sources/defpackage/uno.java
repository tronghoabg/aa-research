package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class uno {
    final AtomicInteger a = new AtomicInteger();
    final AtomicInteger b = new AtomicInteger();
    final AtomicInteger c = new AtomicInteger();
    final AtomicInteger d = new AtomicInteger();
    final AtomicInteger e = new AtomicInteger();
    final AtomicInteger f = new AtomicInteger();
    final AtomicInteger g = new AtomicInteger();
    final AtomicInteger h = new AtomicInteger();
    final AtomicInteger i = new AtomicInteger();
    final AtomicInteger j = new AtomicInteger();
    final AtomicInteger k = new AtomicInteger();

    public final String toString() {
        AtomicInteger atomicInteger = this.k;
        AtomicInteger atomicInteger2 = this.j;
        AtomicInteger atomicInteger3 = this.i;
        AtomicInteger atomicInteger4 = this.h;
        AtomicInteger atomicInteger5 = this.g;
        AtomicInteger atomicInteger6 = this.f;
        AtomicInteger atomicInteger7 = this.e;
        AtomicInteger atomicInteger8 = this.d;
        AtomicInteger atomicInteger9 = this.c;
        AtomicInteger atomicInteger10 = this.b;
        return "Items loaded from sql disk cache: " + this.a.get() + ", items loaded from offroad: " + atomicInteger10.get() + ", items requested from network: " + atomicInteger9.get() + ", items from resourceManager's cache: " + atomicInteger8.get() + ", items received from network: " + atomicInteger7.get() + ", items failed from network: " + atomicInteger6.get() + ", total items requested: " + atomicInteger5.get() + ", items requested but had null url: " + atomicInteger4.get() + ", total items notified: " + atomicInteger3.get() + ", futures completed: " + atomicInteger2.get() + ", futures failed: " + atomicInteger.get();
    }
}
