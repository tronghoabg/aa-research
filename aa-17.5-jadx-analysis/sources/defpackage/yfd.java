package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes.dex */
public abstract class yfd<K, V> extends yfy<K, V> implements Map<K, V>, ycc {
    private static final long serialVersionUID = 912559;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ycc
    public final /* bridge */ /* synthetic */ ycc a() {
        throw null;
    }

    public abstract yfd b();

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ygr values() {
        return b().keySet();
    }

    @Override // defpackage.yfy
    public Object writeReplace() {
        return new yfc(this);
    }
}
