package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class mrw implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ mrw(int i) {
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

    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7 A[RETURN] */
    @Override // java.util.function.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean test(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrw.test(java.lang.Object):boolean");
    }
}
