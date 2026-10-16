package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class wco implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ wco(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return this.d != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.d == 0) {
            wcl wclVar = (wcl) this.b;
            wcq wcqVar = new wcq((wae) this.a, wclVar);
            boolean z = wclVar.c;
            kgx kgxVar = new kgx(wcqVar);
            ((boolean[]) this.c)[0] = true;
            return kgxVar;
        }
        yph yphVar = kox.a;
        int iOrdinal = ((rrx) obj).ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        throw new RuntimeException(null, null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.d != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
