package defpackage;

/* loaded from: classes.dex */
public class affn extends affm {
    public affn(afhg afhgVar, String str, String str2) {
        super(NO_RECEIVER, ((afer) afhgVar).getJClass(), str, str2, !(afhgVar instanceof afhe) ? 1 : 0);
    }

    @Override // defpackage.afhx
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public affn(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public affn(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }
}
