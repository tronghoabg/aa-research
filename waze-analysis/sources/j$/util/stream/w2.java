package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class w2 extends o2 implements l2 {
    @Override // j$.util.stream.l2
    public final Object b() {
        long j2 = this.f50554c;
        if (j2 >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) j2);
        c(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.l2
    public final void c(int i2, Object obj) {
        m2 m2Var = this.f50552a;
        ((l2) m2Var).c(i2, obj);
        ((l2) this.f50553b).c(i2 + ((int) ((l2) m2Var).count()), obj);
    }

    @Override // j$.util.stream.l2
    public final void d(Object obj) {
        ((l2) this.f50552a).d(obj);
        ((l2) this.f50553b).d(obj);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return d4.m(this, intFunction);
    }

    public final String toString() {
        long j2 = this.f50554c;
        return j2 < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f50552a, this.f50553b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j2));
    }
}
