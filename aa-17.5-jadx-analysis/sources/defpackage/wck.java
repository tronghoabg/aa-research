package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wck implements zfk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wck(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, zgp] */
    @Override // defpackage.zfk
    public final zgp a(Object obj) {
        if (this.c != 0) {
            sia siaVar = (sia) obj;
            ?? r0 = this.b;
            if (siaVar != null) {
                return r0;
            }
            zgp zgpVar = ((shr) this.a).k;
            return zgpVar == null ? zgl.a : zgpVar;
        }
        int i = ((way) obj).a;
        if ((i == 29501 || i == 29537 || i == 29538 || i == 29539 || i == 29540 || i == 29541 || i == 29542 || i == 29543 || i == 29544 || i == 29547) && ((wdm) this.b).b()) {
            ((wcq) this.a).b();
        }
        return zgl.a;
    }
}
