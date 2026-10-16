package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class e4 extends d4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f50387h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f50388i;

    public e4(k7 k7Var, LongBinaryOperator longBinaryOperator, long j2) {
        this.f50387h = longBinaryOperator;
        this.f50388i = j2;
    }

    @Override // j$.util.stream.d4
    public final y4 Q() {
        return new w4(this.f50388i, this.f50387h);
    }
}
