package j$.util.function;

import java.util.function.Function;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f50238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f50239c;

    public /* synthetic */ d(Function function, Function function2, int i2) {
        this.f50237a = i2;
        this.f50238b = function;
        this.f50239c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f50237a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f50237a) {
            case 0:
                return this.f50239c.apply(this.f50238b.apply(obj));
            default:
                return this.f50238b.apply(this.f50239c.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f50237a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
