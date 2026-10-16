package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class l0 implements r8, s8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50492a;

    public l0(boolean z) {
        this.f50492a = z;
    }

    @Override // j$.util.stream.r8
    public final Object a(a aVar, Spliterator spliterator) {
        aVar.Q(spliterator, this);
        return null;
    }

    public /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.r8
    public final Object b(a aVar, Spliterator spliterator) {
        if (this.f50492a) {
            new m0(aVar, spliterator, this).invoke();
            return null;
        }
        new n0(aVar, spliterator, aVar.R(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.r8
    public final int c() {
        if (this.f50492a) {
            return 0;
        }
        return j7.r;
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return null;
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    public /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    public /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }
}
