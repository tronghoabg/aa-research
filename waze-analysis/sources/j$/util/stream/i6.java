package j$.util.stream;

import java.util.Comparator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class i6 extends p5 {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f50453b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50454c;

    public i6(t5 t5Var, Comparator comparator) {
        super(t5Var);
        this.f50453b = comparator;
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final boolean o() {
        this.f50454c = true;
        return false;
    }
}
