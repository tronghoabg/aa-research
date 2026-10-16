package defpackage;

import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class aeku implements Serializable, aelo {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aeku() {
    }

    @Override // defpackage.aelo
    public /* synthetic */ int a(long j, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        aeec.N();
        return null;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.LongToIntFunction
    public final /* synthetic */ int applyAsInt(long j) {
        return s(j);
    }

    @Override // defpackage.aelo
    public /* synthetic */ int b(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aelo
    public /* synthetic */ Integer c(Object obj) {
        return aeec.J(this, obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        aeec.N();
        return null;
    }

    @Override // defpackage.aeee
    public /* synthetic */ boolean containsKey(Object obj) {
        throw null;
    }

    @Override // defpackage.aelo
    public /* synthetic */ boolean d(long j) {
        throw null;
    }

    @Override // defpackage.aeee
    public /* synthetic */ Object get(Object obj) {
        return c(obj);
    }

    @Override // defpackage.aeee
    public /* synthetic */ int size() {
        return -1;
    }
}
