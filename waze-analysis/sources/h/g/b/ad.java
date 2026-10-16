package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ad extends ac {
    public ad(h.l.e eVar, String str, String str2) {
        super(NO_RECEIVER, ((l) eVar).a(), str, str2, !(eVar instanceof h.l.c) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public ad(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    public ad(Class cls, String str, String str2, int i2) {
        super(NO_RECEIVER, cls, str, str2, i2);
    }
}
