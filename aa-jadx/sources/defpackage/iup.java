package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iup {
    private final defpackage.ygw a;
    private final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong(Long.MAX_VALUE);
    private final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);
    private final long[] d;
    private final int e;

    public iup(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("At least one interval boundary must be provided.");
        }
        for (int i = 1; i < list.size(); i++) {
            if (((java.lang.Long) list.get(i)).longValue() <= ((java.lang.Long) list.get(i - 1)).longValue()) {
                throw new java.lang.IllegalArgumentException("Interval boundaries must be strictly increasing.");
            }
        }
        this.e = list.size() + 1;
        int i2 = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        for (int i3 = 0; i3 < this.e; i3++) {
            ygrVar.i(new java.util.concurrent.atomic.AtomicInteger(0));
        }
        this.a = ygrVar.g();
        this.d = new long[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.d[i4] = ((java.lang.Long) list.get(i4)).longValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j$.util.Optional a() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.b;
        if (atomicLong.get() != Long.MAX_VALUE) {
            java.util.concurrent.atomic.AtomicLong atomicLong2 = this.c;
            if (atomicLong2.get() != Long.MIN_VALUE) {
                defpackage.abor aborVarN = defpackage.yzv.a.n();
                long j = atomicLong.get();
                aborVarN.t();
                defpackage.yzv yzvVar = (defpackage.yzv) aborVarN.b;
                yzvVar.b |= 1;
                yzvVar.d = j;
                long j2 = atomicLong2.get();
                aborVarN.t();
                defpackage.yzv yzvVar2 = (defpackage.yzv) aborVarN.b;
                yzvVar2.b |= 2;
                yzvVar2.e = j2;
                int i = 0;
                while (true) {
                    int i2 = this.e;
                    if (i >= i2) {
                        return j$.util.Optional.of((defpackage.yzv) aborVarN.q());
                    }
                    defpackage.abor aborVarN2 = defpackage.yzw.a.n();
                    int i3 = ((java.util.concurrent.atomic.AtomicInteger) this.a.get(i)).get();
                    aborVarN2.t();
                    defpackage.yzw yzwVar = (defpackage.yzw) aborVarN2.b;
                    yzwVar.b |= 4;
                    yzwVar.e = i3;
                    if (i > 0) {
                        long j3 = this.d[i - 1];
                        aborVarN2.t();
                        defpackage.yzw yzwVar2 = (defpackage.yzw) aborVarN2.b;
                        yzwVar2.b |= 1;
                        yzwVar2.c = j3;
                    }
                    if (i < i2 - 1) {
                        long j4 = this.d[i];
                        aborVarN2.t();
                        defpackage.yzw yzwVar3 = (defpackage.yzw) aborVarN2.b;
                        yzwVar3.b |= 2;
                        yzwVar3.d = j4;
                    }
                    defpackage.yzw yzwVar4 = (defpackage.yzw) aborVarN2.q();
                    aborVarN.t();
                    defpackage.yzv yzvVar3 = (defpackage.yzv) aborVarN.b;
                    yzwVar4.getClass();
                    defpackage.abpj abpjVar = yzvVar3.c;
                    if (!abpjVar.c()) {
                        yzvVar3.c = defpackage.abox.I(abpjVar);
                    }
                    yzvVar3.c.add(yzwVar4);
                    i++;
                }
            }
        }
        return j$.util.Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j$.util.Optional b() {
        long j = this.b.get();
        long j2 = this.c.get();
        if (j == Long.MAX_VALUE || j2 == Long.MIN_VALUE) {
            return j$.util.Optional.empty();
        }
        defpackage.abor aborVarN = defpackage.zat.a.n();
        aborVarN.t();
        defpackage.zat zatVar = (defpackage.zat) aborVarN.b;
        zatVar.b |= 1;
        zatVar.d = j;
        aborVarN.t();
        defpackage.zat zatVar2 = (defpackage.zat) aborVarN.b;
        zatVar2.b |= 2;
        zatVar2.e = j2;
        int i = 0;
        while (true) {
            int i2 = this.e;
            if (i >= i2) {
                return j$.util.Optional.of((defpackage.zat) aborVarN.q());
            }
            defpackage.abor aborVarN2 = defpackage.zau.a.n();
            int i3 = ((java.util.concurrent.atomic.AtomicInteger) this.a.get(i)).get();
            aborVarN2.t();
            defpackage.zau zauVar = (defpackage.zau) aborVarN2.b;
            zauVar.b |= 4;
            zauVar.e = i3;
            if (i > 0) {
                long j3 = this.d[i - 1];
                aborVarN2.t();
                defpackage.zau zauVar2 = (defpackage.zau) aborVarN2.b;
                zauVar2.b |= 1;
                zauVar2.c = j3;
            }
            if (i < i2 - 1) {
                long j4 = this.d[i];
                aborVarN2.t();
                defpackage.zau zauVar3 = (defpackage.zau) aborVarN2.b;
                zauVar3.b |= 2;
                zauVar3.d = j4;
            }
            defpackage.zau zauVar4 = (defpackage.zau) aborVarN2.q();
            aborVarN.t();
            defpackage.zat zatVar3 = (defpackage.zat) aborVarN.b;
            zauVar4.getClass();
            defpackage.abpj abpjVar = zatVar3.c;
            if (!abpjVar.c()) {
                zatVar3.c = defpackage.abox.I(abpjVar);
            }
            zatVar3.c.add(zauVar4);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(final long j, int i) {
        if (i <= 0) {
            return;
        }
        final int i2 = 1;
        j$.util.concurrent.atomic.DesugarAtomicLong.updateAndGet(this.b, new java.util.function.LongUnaryOperator() { // from class: iuo
            public final /* synthetic */ java.util.function.LongUnaryOperator andThen(java.util.function.LongUnaryOperator longUnaryOperator) {
                return i2 != 0 ? j$.util.function.LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator) : j$.util.function.LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
            }

            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j2) {
                int i3 = i2;
                long j3 = j;
                return i3 != 0 ? java.lang.Math.min(j2, j3) : java.lang.Math.max(j2, j3);
            }

            public final /* synthetic */ java.util.function.LongUnaryOperator compose(java.util.function.LongUnaryOperator longUnaryOperator) {
                return i2 != 0 ? j$.util.function.LongUnaryOperator$CC.$default$compose(this, longUnaryOperator) : j$.util.function.LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
            }
        });
        final int i3 = 0;
        j$.util.concurrent.atomic.DesugarAtomicLong.updateAndGet(this.c, new java.util.function.LongUnaryOperator() { // from class: iuo
            public final /* synthetic */ java.util.function.LongUnaryOperator andThen(java.util.function.LongUnaryOperator longUnaryOperator) {
                return i3 != 0 ? j$.util.function.LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator) : j$.util.function.LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
            }

            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j2) {
                int i4 = i3;
                long j3 = j;
                return i4 != 0 ? java.lang.Math.min(j2, j3) : java.lang.Math.max(j2, j3);
            }

            public final /* synthetic */ java.util.function.LongUnaryOperator compose(java.util.function.LongUnaryOperator longUnaryOperator) {
                return i3 != 0 ? j$.util.function.LongUnaryOperator$CC.$default$compose(this, longUnaryOperator) : j$.util.function.LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
            }
        });
        int iBinarySearch = java.util.Arrays.binarySearch(this.d, j);
        ((java.util.concurrent.atomic.AtomicInteger) this.a.get(iBinarySearch < 0 ? (-iBinarySearch) - 1 : iBinarySearch + 1)).addAndGet(i);
    }
}
