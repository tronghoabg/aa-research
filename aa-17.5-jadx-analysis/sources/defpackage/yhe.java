package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class yhe extends ybz implements Serializable {
    private static final long serialVersionUID = 912559;

    public static yni o(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        return new ynl(obj, obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract yfy g();

    /* renamed from: h */
    public abstract yfy k();

    @Override // defpackage.ynj
    public /* bridge */ /* synthetic */ Map k() {
        throw null;
    }

    public final ygr l() {
        return (ygr) super.c();
    }

    public final ygr m() {
        return g().keySet();
    }

    public final ygr n() {
        return k().keySet();
    }

    abstract Object writeReplace();
}
