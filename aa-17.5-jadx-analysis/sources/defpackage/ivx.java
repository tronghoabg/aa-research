package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ivx implements jjn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jjn
    public final String a() {
        String str;
        String str2;
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            synchronized (((ivw) obj).a) {
                str2 = String.format("PowerBasedLimiter{lowPower=%b, interactive=%b}", Boolean.valueOf(((ivw) obj).b), Boolean.valueOf(((ivw) obj).c));
            }
            return str2;
        }
        synchronized (((ivy) obj).c) {
            str = String.format("RestrictionLevelLimiter{level=%s}", ((ivy) obj).d.name());
        }
        return str;
    }
}
