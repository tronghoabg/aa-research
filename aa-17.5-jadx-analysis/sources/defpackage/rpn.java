package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class rpn implements pr {
    private final /* synthetic */ int a;

    @Override // defpackage.pr
    public final Object a(Object obj) {
        if (this.a != 0) {
            return Boolean.valueOf(((Integer) obj).intValue() == 2);
        }
        return Boolean.valueOf(((Integer) obj).intValue() != 0);
    }
}
