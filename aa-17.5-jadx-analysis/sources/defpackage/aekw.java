package defpackage;

import j$.util.function.LongUnaryOperator$CC;
import java.io.Serializable;
import java.util.function.Function;
import java.util.function.LongUnaryOperator;

/* loaded from: classes3.dex */
public abstract class aekw implements Serializable, aemj {
    private static final long serialVersionUID = -4940583368468432370L;
    public long a;

    protected aekw() {
    }

    @Override // defpackage.aemj
    public long a() {
        return this.a;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ long applyAsLong(long j) {
        return t(j);
    }

    @Override // defpackage.aemj
    public /* synthetic */ long b(long j, long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aemj
    public /* synthetic */ long c(long j) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
    }

    @Override // defpackage.aeee
    public /* synthetic */ boolean containsKey(Object obj) {
        throw null;
    }

    @Override // defpackage.aemj
    public /* synthetic */ Long d(Object obj) {
        return adqq.aW(this, obj);
    }

    @Override // defpackage.aemj
    public /* synthetic */ boolean e(long j) {
        throw null;
    }

    @Override // defpackage.aeee
    public /* synthetic */ Object get(Object obj) {
        return d(obj);
    }

    @Override // defpackage.aeee
    public /* synthetic */ int size() {
        return -1;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        aeec.u();
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        aeec.u();
        return null;
    }
}
