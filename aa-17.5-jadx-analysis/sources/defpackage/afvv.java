package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class afvv {
    private final int identityHashCode;
    private final WeakReference<ClassLoader> ref;
    private ClassLoader temporaryStrongRef;

    public afvv(ClassLoader classLoader) {
        classLoader.getClass();
        this.ref = new WeakReference<>(classLoader);
        this.identityHashCode = System.identityHashCode(classLoader);
        this.temporaryStrongRef = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof afvv) && this.ref.get() == ((afvv) obj).ref.get();
    }

    public int hashCode() {
        return this.identityHashCode;
    }

    public final void setTemporaryStrongRef(ClassLoader classLoader) {
        this.temporaryStrongRef = classLoader;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = this.ref.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
