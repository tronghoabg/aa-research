package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class e0 implements s8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f50384a;

    /* renamed from: b, reason: collision with root package name */
    public Object f50385b;

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void u(Object obj) {
        if (this.f50384a) {
            return;
        }
        this.f50384a = true;
        this.f50385b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return this.f50384a;
    }

    @Override // j$.util.stream.t5
    public /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    @Override // j$.util.stream.t5
    public /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }
}
