package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
class xzq implements Serializable, xyk {
    private static final long serialVersionUID = 1;
    final yan a;

    public xzq(yan yanVar) {
        this.a = yanVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    @Override // defpackage.xyk
    public final Object b(Object obj, Callable callable) throws ExecutionException {
        return this.a.c(obj, new xzp(callable));
    }

    Object writeReplace() {
        return new xzr(this.a);
    }
}
