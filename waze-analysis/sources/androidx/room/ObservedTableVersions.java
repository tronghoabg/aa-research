package androidx.room;

import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import java.util.Set;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ObservedTableVersions {
    private final bn<int[]> versions;

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.ObservedTableVersions$collect$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ObservedTableVersions.this.collect(null, this);
        }
    }

    public ObservedTableVersions(int i2) {
        this.versions = ck.b(new int[i2]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.b.l<? super int[]> r5, h.c.e<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.room.ObservedTableVersions.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.ObservedTableVersions$collect$1 r0 = (androidx.room.ObservedTableVersions.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.ObservedTableVersions$collect$1 r0 = new androidx.room.ObservedTableVersions$collect$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r6)
            goto L3d
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.bn<int[]> r4 = r4.versions
            r0.label = r3
            java.lang.Object r4 = r4.collect(r5, r0)
            if (r4 != r1) goto L3d
            return r1
        L3d:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableVersions.collect(kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }

    public final void increment(Set<Integer> set) {
        Object objD;
        int[] iArr;
        x.f(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        bn<int[]> bnVar = this.versions;
        do {
            objD = bnVar.d();
            int[] iArr2 = (int[]) objD;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = set.contains(Integer.valueOf(i2)) ? iArr2[i2] + 1 : iArr2[i2];
            }
        } while (!bnVar.f(objD, iArr));
    }
}
