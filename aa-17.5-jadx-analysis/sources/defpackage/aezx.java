package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class aezx implements Serializable, aezr {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(aezx.class, Object.class, "c");
    private volatile afdr b;
    private volatile Object c = afag.a;

    public aezx(afdr afdrVar) {
        this.b = afdrVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new aezo(a());
    }

    @Override // defpackage.aezr
    public final Object a() {
        Object obj = this.c;
        afag afagVar = afag.a;
        if (obj != afagVar) {
            return obj;
        }
        afdr afdrVar = this.b;
        if (afdrVar != null) {
            Object objInvoke = afdrVar.invoke();
            if (a.i(a, this, afagVar, objInvoke)) {
                this.b = null;
                return objInvoke;
            }
        }
        return this.c;
    }

    @Override // defpackage.aezr
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.c != afag.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
