package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.x;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.q1;
import j$.util.stream.Collectors;
import j$.util.stream.d4;
import j$.util.stream.i7;
import j$.util.stream.o8;
import j$.util.stream.t5;
import j$.util.stream.u7;
import j$.util.stream.w7;
import j$.util.stream.y7;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements x, DirectoryStream.Filter, TemporalAccessor, Predicate, Supplier, LongFunction, Consumer, BooleanSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49664a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f49665b;

    public /* synthetic */ g(int i2, Object obj) {
        this.f49664a = i2;
        this.f49665b = obj;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long D(j$.time.temporal.m mVar) {
        throw new j$.time.temporal.o("Unsupported field: ".concat(String.valueOf(mVar)));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void u(Object obj) {
        int i2 = this.f49664a;
        Object obj2 = this.f49665b;
        switch (i2) {
            case 8:
                ((t5) obj2).u((t5) obj);
                break;
            default:
                ((ArrayList) obj2).add(obj);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49664a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j2) {
        return d4.x(j2, (IntFunction) this.f49665b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean c(j$.time.temporal.m mVar) {
        return false;
    }

    @Override // j$.nio.file.x
    public boolean e(Path path) {
        return ((Pattern) this.f49665b).matcher(path.toString()).matches();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int f(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.a(this, mVar);
    }

    public void g(i7 i7Var) {
        ((EnumMap) this.f49665b).put((EnumMap) i7Var, (i7) 1);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        int i2 = this.f49664a;
        Object obj = this.f49665b;
        switch (i2) {
            case 4:
                return ((j$.util.stream.a) obj).N(0);
            case 5:
                return (Spliterator) obj;
            default:
                Set set = Collectors.f50307a;
                return new q1((CharSequence) obj);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        int i2 = this.f49664a;
        Object obj = this.f49665b;
        switch (i2) {
            case 11:
                u7 u7Var = (u7) obj;
                return u7Var.f50500d.tryAdvance(u7Var.f50501e);
            case 12:
                w7 w7Var = (w7) obj;
                return w7Var.f50500d.tryAdvance(w7Var.f50501e);
            case 13:
                y7 y7Var = (y7) obj;
                return y7Var.f50500d.tryAdvance(y7Var.f50501e);
            default:
                o8 o8Var = (o8) obj;
                return o8Var.f50500d.tryAdvance(o8Var.f50501e);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.d(this, mVar);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f49665b).test(obj);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object x(n nVar) {
        return nVar == j$.time.temporal.n.f50065a ? (ZoneId) this.f49665b : j$.time.temporal.n.c(this, nVar);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* renamed from: accept, reason: collision with other method in class */
    public boolean mo37425accept(Object obj) {
        return ((DirectoryStream.Filter) this.f49665b).mo37425accept(j$.nio.file.a.g(obj));
    }
}
