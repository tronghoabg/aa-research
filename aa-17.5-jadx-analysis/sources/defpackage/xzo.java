package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class xzo extends xzq implements xys {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzo(xyp xypVar, xyr xyrVar) {
        super(new yan(xypVar, xyrVar));
        xyrVar.getClass();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    @Override // defpackage.xwx
    public final Object a(Object obj) {
        return c(obj);
    }

    public final Object c(Object obj) {
        try {
            yan yanVar = this.a;
            return yanVar.c(obj, yanVar.r);
        } catch (ExecutionException e) {
            throw new zhl(e.getCause());
        }
    }

    @Override // defpackage.xzq
    Object writeReplace() {
        return new xzm(this.a);
    }
}
