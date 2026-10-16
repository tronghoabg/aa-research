package defpackage;

/* loaded from: classes.dex */
public class affh extends affg {
    public affh(afhg afhgVar, String str, String str2) {
        super(NO_RECEIVER, ((afer) afhgVar).getJClass(), str, str2, !(afhgVar instanceof afhe) ? 1 : 0);
    }

    @Override // defpackage.afhx
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // defpackage.afhm
    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public affh(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public affh(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }
}
