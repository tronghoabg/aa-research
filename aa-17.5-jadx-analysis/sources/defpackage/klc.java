package defpackage;

/* loaded from: classes2.dex */
public final class klc implements kld {
    private final /* synthetic */ int c;
    public static final klc b = new klc(1);
    public static final klc a = new klc(0);

    private klc(int i) {
        this.c = i;
    }

    @Override // defpackage.kld
    public final /* synthetic */ int a(Number number, Number number2) {
        return this.c != 0 ? Float.compare(number.floatValue(), number2.floatValue()) : affa.c(number.longValue(), number2.longValue());
    }

    @Override // defpackage.kld
    public final /* synthetic */ Number b(Number number, int i) {
        return this.c != 0 ? Float.valueOf(number.floatValue() + i) : Long.valueOf(number.longValue() + i);
    }

    @Override // defpackage.kld
    public final /* synthetic */ Number c(Number number, Number number2, Number number3) {
        return this.c != 0 ? Float.valueOf(afpt.d(number.floatValue(), number2.floatValue(), number3.floatValue())) : Long.valueOf(afpt.j(number.longValue(), number2.longValue(), number3.longValue()));
    }

    @Override // defpackage.kld
    public final /* synthetic */ Number d(kjz kjzVar) {
        return this.c != 0 ? Float.valueOf(((kjt) kjzVar.b).b) : Long.valueOf(((kjx) kjzVar.b).b);
    }

    @Override // defpackage.kld
    public final /* synthetic */ Number e(kjz kjzVar) {
        return this.c != 0 ? Float.valueOf(((kjt) kjzVar.b).a) : Long.valueOf(((kjx) kjzVar.b).a);
    }
}
