package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class kxo implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ kxo(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0129 A[RETURN] */
    @Override // java.util.function.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean test(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxo.test(java.lang.Object):boolean");
    }
}
