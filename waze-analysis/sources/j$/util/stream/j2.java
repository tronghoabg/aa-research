package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class j2 implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50466a;

    public /* synthetic */ j2(int i2) {
        this.f50466a = i2;
    }

    private final void accept$j$$util$stream$Node$OfLong$0(long j2) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfLong$0(long j2) {
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j2) {
        int i2 = this.f50466a;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f50466a) {
        }
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
