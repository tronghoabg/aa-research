package defpackage;

import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicLong;
import j$.util.function.LongUnaryOperator$CC;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* loaded from: classes.dex */
public final class iuh {
    private final yfq a;
    private final AtomicLong b = new AtomicLong(Long.MAX_VALUE);
    private final AtomicLong c = new AtomicLong(Long.MIN_VALUE);
    private final long[] d;
    private final int e;

    public iuh(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one interval boundary must be provided.");
        }
        for (int i = 1; i < list.size(); i++) {
            if (((Long) list.get(i)).longValue() <= ((Long) list.get(i - 1)).longValue()) {
                throw new IllegalArgumentException("Interval boundaries must be strictly increasing.");
            }
        }
        this.e = list.size() + 1;
        int i2 = yfq.d;
        yfl yflVar = new yfl(4);
        for (int i3 = 0; i3 < this.e; i3++) {
            yflVar.i(new AtomicInteger(0));
        }
        this.a = yflVar.g();
        this.d = new long[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.d[i4] = ((Long) list.get(i4)).longValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional a() {
        AtomicLong atomicLong = this.b;
        if (atomicLong.get() != Long.MAX_VALUE) {
            AtomicLong atomicLong2 = this.c;
            if (atomicLong2.get() != Long.MIN_VALUE) {
                abnp abnpVarN = yyq.a.n();
                long j = atomicLong.get();
                abnpVarN.t();
                yyq yyqVar = (yyq) abnpVarN.b;
                yyqVar.b |= 1;
                yyqVar.d = j;
                long j2 = atomicLong2.get();
                abnpVarN.t();
                yyq yyqVar2 = (yyq) abnpVarN.b;
                yyqVar2.b |= 2;
                yyqVar2.e = j2;
                int i = 0;
                while (true) {
                    int i2 = this.e;
                    if (i >= i2) {
                        return Optional.of((yyq) abnpVarN.q());
                    }
                    abnp abnpVarN2 = yyr.a.n();
                    int i3 = ((AtomicInteger) this.a.get(i)).get();
                    abnpVarN2.t();
                    yyr yyrVar = (yyr) abnpVarN2.b;
                    yyrVar.b |= 4;
                    yyrVar.e = i3;
                    if (i > 0) {
                        long j3 = this.d[i - 1];
                        abnpVarN2.t();
                        yyr yyrVar2 = (yyr) abnpVarN2.b;
                        yyrVar2.b |= 1;
                        yyrVar2.c = j3;
                    }
                    if (i < i2 - 1) {
                        long j4 = this.d[i];
                        abnpVarN2.t();
                        yyr yyrVar3 = (yyr) abnpVarN2.b;
                        yyrVar3.b |= 2;
                        yyrVar3.d = j4;
                    }
                    yyr yyrVar4 = (yyr) abnpVarN2.q();
                    abnpVarN.t();
                    yyq yyqVar3 = (yyq) abnpVarN.b;
                    yyrVar4.getClass();
                    aboh abohVar = yyqVar3.c;
                    if (!abohVar.c()) {
                        yyqVar3.c = abnv.I(abohVar);
                    }
                    yyqVar3.c.add(yyrVar4);
                    i++;
                }
            }
        }
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional b() {
        long j = this.b.get();
        long j2 = this.c.get();
        if (j == Long.MAX_VALUE || j2 == Long.MIN_VALUE) {
            return Optional.empty();
        }
        abnp abnpVarN = yzo.a.n();
        abnpVarN.t();
        yzo yzoVar = (yzo) abnpVarN.b;
        yzoVar.b |= 1;
        yzoVar.d = j;
        abnpVarN.t();
        yzo yzoVar2 = (yzo) abnpVarN.b;
        yzoVar2.b |= 2;
        yzoVar2.e = j2;
        int i = 0;
        while (true) {
            int i2 = this.e;
            if (i >= i2) {
                return Optional.of((yzo) abnpVarN.q());
            }
            abnp abnpVarN2 = yzp.a.n();
            int i3 = ((AtomicInteger) this.a.get(i)).get();
            abnpVarN2.t();
            yzp yzpVar = (yzp) abnpVarN2.b;
            yzpVar.b |= 4;
            yzpVar.e = i3;
            if (i > 0) {
                long j3 = this.d[i - 1];
                abnpVarN2.t();
                yzp yzpVar2 = (yzp) abnpVarN2.b;
                yzpVar2.b |= 1;
                yzpVar2.c = j3;
            }
            if (i < i2 - 1) {
                long j4 = this.d[i];
                abnpVarN2.t();
                yzp yzpVar3 = (yzp) abnpVarN2.b;
                yzpVar3.b |= 2;
                yzpVar3.d = j4;
            }
            yzp yzpVar4 = (yzp) abnpVarN2.q();
            abnpVarN.t();
            yzo yzoVar3 = (yzo) abnpVarN.b;
            yzpVar4.getClass();
            aboh abohVar = yzoVar3.c;
            if (!abohVar.c()) {
                yzoVar3.c = abnv.I(abohVar);
            }
            yzoVar3.c.add(yzpVar4);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(final long j, int i) {
        if (i <= 0) {
            return;
        }
        final int i2 = 1;
        DesugarAtomicLong.updateAndGet(this.b, new LongUnaryOperator() { // from class: iug
            public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                return i2 != 0 ? LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator) : LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
            }

            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j2) {
                int i3 = i2;
                long j3 = j;
                return i3 != 0 ? Math.min(j2, j3) : Math.max(j2, j3);
            }

            public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                return i2 != 0 ? LongUnaryOperator$CC.$default$compose(this, longUnaryOperator) : LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
            }
        });
        final int i3 = 0;
        DesugarAtomicLong.updateAndGet(this.c, new LongUnaryOperator() { // from class: iug
            public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                return i3 != 0 ? LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator) : LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
            }

            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j2) {
                int i32 = i3;
                long j3 = j;
                return i32 != 0 ? Math.min(j2, j3) : Math.max(j2, j3);
            }

            public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                return i3 != 0 ? LongUnaryOperator$CC.$default$compose(this, longUnaryOperator) : LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
            }
        });
        int iBinarySearch = Arrays.binarySearch(this.d, j);
        ((AtomicInteger) this.a.get(iBinarySearch < 0 ? (-iBinarySearch) - 1 : iBinarySearch + 1)).addAndGet(i);
    }
}
