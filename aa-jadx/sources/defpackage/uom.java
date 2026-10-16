package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uom {
    final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger h = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger i = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger k = new java.util.concurrent.atomic.AtomicInteger();

    public final java.lang.String toString() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.k;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = this.j;
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = this.i;
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = this.h;
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = this.g;
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = this.f;
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = this.e;
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = this.d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger9 = this.c;
        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = this.b;
        return "Items loaded from sql disk cache: " + this.a.get() + ", items loaded from offroad: " + atomicInteger10.get() + ", items requested from network: " + atomicInteger9.get() + ", items from resourceManager's cache: " + atomicInteger8.get() + ", items received from network: " + atomicInteger7.get() + ", items failed from network: " + atomicInteger6.get() + ", total items requested: " + atomicInteger5.get() + ", items requested but had null url: " + atomicInteger4.get() + ", total items notified: " + atomicInteger3.get() + ", futures completed: " + atomicInteger2.get() + ", futures failed: " + atomicInteger.get();
    }
}
