package h.g.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ab extends aa {
    public ab(h.l.e eVar, String str, String str2) {
        super(NO_RECEIVER, ((l) eVar).a(), str, str2, !(eVar instanceof h.l.c) ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().call(obj);
    }

    public ab(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    public ab(Class cls, String str, String str2, int i2) {
        super(NO_RECEIVER, cls, str, str2, i2);
    }
}
