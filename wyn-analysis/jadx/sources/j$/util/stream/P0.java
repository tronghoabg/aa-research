package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
final class P0 extends R0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(AbstractC2929b abstractC2929b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i5) {
        super(abstractC2929b, spliterator, longFunction, binaryOperator);
        this.k = i5;
    }

    @Override // j$.util.stream.R0, j$.util.stream.AbstractC2944e
    protected final AbstractC2944e e(Spliterator spliterator) {
        switch (this.k) {
        }
        return new R0(this, spliterator);
    }

    @Override // j$.util.stream.R0, j$.util.stream.AbstractC2944e
    protected final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
        }
        return a();
    }
}
