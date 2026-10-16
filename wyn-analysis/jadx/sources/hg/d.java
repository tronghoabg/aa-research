package hg;

import com.google.android.gms.common.api.f;
import j$.util.function.IntUnaryOperator$CC;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.util.function.IntUnaryOperator;

/* loaded from: classes5.dex */
public abstract class d extends b {
    static {
        OpenOption[] openOptionArr = ig.a.f36960a;
    }

    public d() {
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: hg.c
            public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i5) {
                this.f36435a.getClass();
                if (i5 <= Integer.MAX_VALUE) {
                    return i5;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i5), Integer.valueOf(f.API_PRIORITY_OTHER)));
            }

            public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
            }
        };
    }
}
