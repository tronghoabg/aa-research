package defpackage;

import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class zwd implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ zwd(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        if (i == 0) {
            return new ackh();
        }
        if (i == 1) {
            return ((Map.Entry) obj).getValue();
        }
        trv trvVar = (trv) obj;
        abdl abdlVar = trvVar.a.c;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        abnh abnhVar = aaez.a;
        abdlVar.j(abnhVar);
        Object objJ = abdlVar.w.j(abnhVar.d);
        int i2 = ((aaey) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).d;
        abnh abnhVar2 = abhi.a;
        abdlVar.j(abnhVar2);
        Object objJ2 = abdlVar.w.j(abnhVar2.d);
        abhm abhmVar = ((abhh) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2))).c;
        if (abhmVar == null) {
            abhmVar = abhm.a;
        }
        abnh abnhVar3 = abdn.v;
        abdlVar.j(abnhVar3);
        Object objJ3 = abdlVar.w.j(abnhVar3.d);
        return new aacw(trvVar, i2, too.l(abhmVar.c, abhmVar.d), ((abdp) (objJ3 == null ? abnhVar3.b : abnhVar3.c(objJ3))).c);
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
