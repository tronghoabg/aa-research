package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class w3 extends x3 {

    /* renamed from: h, reason: collision with root package name */
    public final Object[] f50657h;

    public w3(w3 w3Var, Spliterator spliterator, long j2, long j3) {
        super(w3Var, spliterator, j2, j3, w3Var.f50657h.length);
        this.f50657h = w3Var.f50657h;
    }

    @Override // j$.util.stream.x3
    public final x3 a(Spliterator spliterator, long j2, long j3) {
        return new w3(this, spliterator, j2, j3);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i2 = this.f50684f;
        if (i2 >= this.f50685g) {
            throw new IndexOutOfBoundsException(Integer.toString(i2));
        }
        Object[] objArr = this.f50657h;
        this.f50684f = i2 + 1;
        objArr[i2] = obj;
    }

    public w3(Spliterator spliterator, a aVar, Object[] objArr) {
        super(spliterator, aVar, objArr.length);
        this.f50657h = objArr;
    }
}
