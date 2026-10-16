package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2942d2 implements IntFunction, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38169a;

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i5 = this.f38169a;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f38169a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i5) {
        switch (this.f38169a) {
            case 0:
                return new Object[i5];
            case 1:
                return new Integer[i5];
            case 2:
                return new Long[i5];
            case 3:
                return new Double[i5];
            case 4:
            case 5:
            default:
                return new Double[i5];
            case 6:
                return new Integer[i5];
            case 7:
                return new Integer[i5];
            case 8:
                return new Long[i5];
            case 9:
                return new Long[i5];
            case 10:
                return new Double[i5];
        }
    }
}
