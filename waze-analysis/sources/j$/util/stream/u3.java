package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u3 extends x3 implements r5 {

    /* renamed from: h, reason: collision with root package name */
    public final int[] f50630h;

    public u3(u3 u3Var, Spliterator spliterator, long j2, long j3) {
        super(u3Var, spliterator, j2, j3, u3Var.f50630h.length);
        this.f50630h = u3Var.f50630h;
    }

    @Override // j$.util.stream.x3
    public final x3 a(Spliterator spliterator, long j2, long j3) {
        return new u3(this, spliterator, j2, j3);
    }

    @Override // j$.util.stream.x3, j$.util.stream.t5
    public final void accept(int i2) {
        int i3 = this.f50684f;
        if (i3 >= this.f50685g) {
            throw new IndexOutOfBoundsException(Integer.toString(i3));
        }
        int[] iArr = this.f50630h;
        this.f50684f = i3 + 1;
        iArr[i3] = i2;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.r5
    public final /* synthetic */ void m(Integer num) {
        d4.g(this, num);
    }

    public u3(Spliterator spliterator, a aVar, int[] iArr) {
        super(spliterator, aVar, iArr.length);
        this.f50630h = iArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        m((Integer) obj);
    }
}
