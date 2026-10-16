package defpackage;

/* loaded from: classes3.dex */
public abstract class xws implements xwx {
    public transient xws b;

    @Override // defpackage.xwx
    @Deprecated
    public final Object a(Object obj) {
        return b(obj);
    }

    public Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        return c(obj);
    }

    protected abstract Object c(Object obj);
}
