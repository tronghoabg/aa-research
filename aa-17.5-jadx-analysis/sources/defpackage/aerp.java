package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class aerp<K> extends aeqk<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final Object a;

    protected aerp(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aeqk, defpackage.aeee
    public final boolean containsKey(Object obj) {
        return Objects.equals(this.a, obj);
    }

    @Override // defpackage.aern
    public final int o(Object obj) {
        Objects.equals(this.a, obj);
        return 0;
    }

    @Override // defpackage.aeqk, defpackage.aeee
    public final int size() {
        return 1;
    }

    public final Object clone() {
        return this;
    }
}
