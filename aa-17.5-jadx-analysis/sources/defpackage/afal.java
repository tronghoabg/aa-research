package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class afal implements Serializable, aezr {
    private afdr a;
    private Object b = afag.a;

    public afal(afdr afdrVar) {
        this.a = afdrVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new aezo(a());
    }

    @Override // defpackage.aezr
    public final Object a() {
        if (this.b == afag.a) {
            afdr afdrVar = this.a;
            afdrVar.getClass();
            this.b = afdrVar.invoke();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.aezr
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.b != afag.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
