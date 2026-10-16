package j$.util.function;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f37882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f37883c;

    public /* synthetic */ c(Function function, Function function2, int i5) {
        this.f37881a = i5;
        this.f37882b = function;
        this.f37883c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f37881a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f37881a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f37881a) {
            case 0:
                return this.f37883c.apply(this.f37882b.apply(obj));
            default:
                return this.f37882b.apply(this.f37883c.apply(obj));
        }
    }
}
