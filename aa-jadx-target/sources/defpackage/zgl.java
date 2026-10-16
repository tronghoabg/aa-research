package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class zgl extends zga.f {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.zgl.class, java.util.Set.class, "seenExceptionsField");
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.zgl.class, "remainingField");
    volatile int remainingField;
    volatile java.util.Set<java.lang.Throwable> seenExceptionsField = null;

    public zgl(int i) {
        this.remainingField = i;
    }

    public abstract void d(java.util.Set set);
}
