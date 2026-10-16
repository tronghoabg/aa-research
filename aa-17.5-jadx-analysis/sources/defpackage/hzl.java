package defpackage;

/* loaded from: classes2.dex */
public final class hzl implements hzh {
    public static final hzl a = new hzl(2, null);
    private final /* synthetic */ int b;

    public hzl(int i) {
        this.b = i;
    }

    @Override // defpackage.hzh
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            return true;
        }
        return obj.toString().startsWith("data:image");
    }

    @Override // defpackage.hzh
    public final ncp b(Object obj, int i, int i2, hum humVar) {
        int i3 = this.b;
        if (i3 != 0) {
            return i3 != 1 ? new ncp(new ifj(obj), new hzo(obj, 0)) : new ncp(new ifj(obj), new hyn(obj.toString()));
        }
        return null;
    }

    @Deprecated
    public hzl(int i, char[] cArr) {
        this.b = i;
    }
}
