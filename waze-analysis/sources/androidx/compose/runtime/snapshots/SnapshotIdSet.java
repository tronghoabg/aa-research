package androidx.compose.runtime.snapshots;

import h.a.i;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.o;
import h.g.b.x;
import h.m.j;
import h.m.k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Long>, a {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    final class AnonymousClass1 extends f implements p<j<? super Long>, e<? super ab>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(j<? super Long> jVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        
            if (r15.a(r9, r18) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
        
            if (r13.a(new java.lang.Long(r4 + r2), r18) != r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
        
            r2 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:19:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:29:0x00b9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b7 -> B:29:0x00b9). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private SnapshotIdSet(long j2, long j3, long j4, long[] jArr) {
        this.upperSet = j2;
        this.lowerSet = j3;
        this.lowerBound = j4;
        this.belowBound = jArr;
    }

    private final SnapshotIdSet fastFold(SnapshotIdSet snapshotIdSet, p<? super SnapshotIdSet, ? super Long, SnapshotIdSet> pVar) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j2 : jArr) {
                snapshotIdSet = pVar.invoke(snapshotIdSet, Long.valueOf(j2));
            }
        }
        if (this.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.lowerSet & (1 << i2)) != 0) {
                    snapshotIdSet = pVar.invoke(snapshotIdSet, Long.valueOf(this.lowerBound + i2));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.upperSet & (1 << i3)) != 0) {
                    snapshotIdSet = pVar.invoke(snapshotIdSet, Long.valueOf(this.lowerBound + i3 + 64));
                }
            }
        }
        return snapshotIdSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.SnapshotIdSet and(androidx.compose.runtime.snapshots.SnapshotIdSet r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.and(androidx.compose.runtime.snapshots.SnapshotIdSet):androidx.compose.runtime.snapshots.SnapshotIdSet");
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        long j2 = snapshotIdSet.lowerBound;
        long j3 = this.lowerBound;
        if (j2 == j3) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~snapshotIdSet.upperSet) & this.upperSet, this.lowerSet & (~snapshotIdSet.lowerSet), j3, jArr2);
            }
        }
        long[] jArr3 = snapshotIdSet.belowBound;
        if (jArr3 != null) {
            for (long j4 : jArr3) {
                this = this.clear(j4);
            }
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((snapshotIdSet.lowerSet & (1 << i2)) != 0) {
                    this = this.clear(snapshotIdSet.lowerBound + i2);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((snapshotIdSet.upperSet & (1 << i3)) != 0) {
                    this = this.clear(snapshotIdSet.lowerBound + i3 + 64);
                }
            }
        }
        return this;
    }

    public final SnapshotIdSet clear(long j2) {
        long[] jArr;
        int iBinarySearch;
        long j3 = this.lowerBound;
        long j4 = j2 - j3;
        if (x.b(j4, 0L) >= 0 && x.b(j4, 64L) < 0) {
            long j5 = 1 << ((int) j4);
            long j6 = this.lowerSet;
            if ((j6 & j5) != 0) {
                return new SnapshotIdSet(this.upperSet, j6 & (~j5), j3, this.belowBound);
            }
        } else if (x.b(j4, 64L) >= 0 && x.b(j4, 128L) < 0) {
            long j7 = 1 << (((int) j4) - 64);
            long j8 = this.upperSet;
            if ((j8 & j7) != 0) {
                return new SnapshotIdSet((~j7) & j8, this.lowerSet, j3, this.belowBound);
            }
        } else if (x.b(j4, 0L) < 0 && (jArr = this.belowBound) != null && (iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, j2)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, iBinarySearch));
        }
        return this;
    }

    public final void fastForEach(l<? super Long, ab> lVar) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j2 : jArr) {
                lVar.invoke(Long.valueOf(j2));
            }
        }
        if (this.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.lowerSet & (1 << i2)) != 0) {
                    lVar.invoke(Long.valueOf(this.lowerBound + i2));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.upperSet & (1 << i3)) != 0) {
                    lVar.invoke(Long.valueOf(this.lowerBound + i3 + 64));
                }
            }
        }
    }

    public final boolean get(long j2) {
        long[] jArr;
        long j3 = j2 - this.lowerBound;
        if (x.b(j3, 0L) < 0 || x.b(j3, 64L) >= 0) {
            if (x.b(j3, 64L) < 0 || x.b(j3, 128L) >= 0) {
                if (x.b(j3, 0L) <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, j2) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j3) - 64)) & this.upperSet) != 0) {
                return true;
            }
        } else if (((1 << ((int) j3)) & this.lowerSet) != 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return k.b(new AnonymousClass1(null)).iterator();
    }

    public final long lowest(long j2) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        if (this.upperSet == 0) {
            return j2;
        }
        return this.lowerBound + 64 + Long.numberOfTrailingZeros(r0);
    }

    public final SnapshotIdSet or(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        long j2 = snapshotIdSet.lowerBound;
        long j3 = this.lowerBound;
        if (j2 == j3) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(snapshotIdSet.upperSet | this.upperSet, this.lowerSet | snapshotIdSet.lowerSet, j3, jArr2);
            }
        }
        int i2 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j4 : jArr3) {
                    snapshotIdSet = snapshotIdSet.set(j4);
                }
            }
            if (this.lowerSet != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if ((this.lowerSet & (1 << i3)) != 0) {
                        snapshotIdSet = snapshotIdSet.set(this.lowerBound + i3);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i2 < 64) {
                    if ((this.upperSet & (1 << i2)) != 0) {
                        snapshotIdSet = snapshotIdSet.set(this.lowerBound + i2 + 64);
                    }
                    i2++;
                }
            }
            return snapshotIdSet;
        }
        long[] jArr4 = snapshotIdSet.belowBound;
        if (jArr4 != null) {
            for (long j5 : jArr4) {
                this = this.set(j5);
            }
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((snapshotIdSet.lowerSet & (1 << i4)) != 0) {
                    this = this.set(snapshotIdSet.lowerBound + i4);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            while (i2 < 64) {
                if ((snapshotIdSet.upperSet & (1 << i2)) != 0) {
                    this = this.set(snapshotIdSet.lowerBound + i2 + 64);
                }
                i2++;
            }
        }
        return this;
    }

    public final SnapshotIdSet set(long j2) {
        long j3;
        long[] array;
        long j4;
        long j5 = this.lowerBound;
        long j6 = j2 - j5;
        long j7 = 0;
        if (x.b(j6, 0L) >= 0 && x.b(j6, 64L) < 0) {
            long j8 = 1 << ((int) j6);
            long j9 = this.lowerSet;
            if ((j9 & j8) == 0) {
                return new SnapshotIdSet(this.upperSet, j9 | j8, j5, this.belowBound);
            }
        } else if (x.b(j6, 64L) >= 0 && x.b(j6, 128L) < 0) {
            long j10 = 1 << (((int) j6) - 64);
            long j11 = this.upperSet;
            if ((j11 & j10) == 0) {
                return new SnapshotIdSet(j10 | j11, this.lowerSet, j5, this.belowBound);
            }
        } else if (x.b(j6, 128L) < 0) {
            long[] jArr = this.belowBound;
            if (jArr == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, j5, new long[]{j2});
            }
            int iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, j2);
            if (iBinarySearch < 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr, -(iBinarySearch + 1), j2));
            }
        } else if (!get(j2)) {
            long j12 = this.upperSet;
            long j13 = this.lowerSet;
            long j14 = j12;
            long j15 = this.lowerBound;
            long j16 = ((j2 + 1) / 64) * 64;
            if (x.b(j16, 0L) < 0) {
                j16 = 9223372036854775680L;
            }
            long j17 = j13;
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j18 = j15;
            while (true) {
                if (x.b(j18, j16) >= 0) {
                    j3 = j18;
                    break;
                }
                if (j17 != j7) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    j4 = j7;
                    for (int i2 = 0; i2 < 64; i2++) {
                        if ((j17 & (1 << i2)) != j4) {
                            snapshotIdArrayBuilder.add(i2 + j18);
                        }
                    }
                } else {
                    j4 = j7;
                }
                if (j14 == j4) {
                    j17 = j4;
                    j3 = j16;
                    break;
                }
                j18 += 64;
                j17 = j14;
                j7 = j4;
                j14 = j7;
            }
            if (snapshotIdArrayBuilder == null || (array = snapshotIdArrayBuilder.toArray()) == null) {
                array = this.belowBound;
            }
            return new SnapshotIdSet(j14, j17, j3, array).set(j2);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        SnapshotIdSet snapshotIdSet = this;
        ArrayList arrayList = new ArrayList(i.q(snapshotIdSet, 10));
        Iterator<Long> it = snapshotIdSet.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
