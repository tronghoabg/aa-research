package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class f2 implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50397a;

    public /* synthetic */ f2(int i2) {
        this.f50397a = i2;
    }

    private final void accept$j$$util$stream$Node$OfDouble$0(double d2) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$0(double d2) {
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d2) {
        int i2 = this.f50397a;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f50397a) {
        }
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }
}
