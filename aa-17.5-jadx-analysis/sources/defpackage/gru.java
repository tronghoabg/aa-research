package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gru implements gmw {
    public final boolean a;
    public final fzg b;
    public final List c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public gru(boolean z, fzg fzgVar, List list, List list2, boolean z2, boolean z3) {
        list2.getClass();
        this.a = z;
        this.b = fzgVar;
        this.c = list;
        this.d = list2;
        this.e = z2;
        this.f = z3;
    }

    public static /* synthetic */ gru c(gru gruVar, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            z = gruVar.a;
        }
        boolean z2 = z;
        fzg fzgVar = (i & 2) != 0 ? gruVar.b : null;
        if ((i & 4) != 0) {
            list = gruVar.c;
        }
        List list2 = list;
        List list3 = gruVar.d;
        boolean z3 = gruVar.e;
        boolean z4 = gruVar.f;
        list2.getClass();
        return new gru(z2, fzgVar, list2, list3, z3, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:20:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.geu r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.grs
            if (r0 == 0) goto L13
            r0 = r8
            grs r0 = (defpackage.grs) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            grs r0 = new grs
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            afcr r1 = defpackage.afcr.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.d
            gru r7 = r0.h
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.woy.dF(r8)
            goto L74
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.woy.dF(r8)
            java.util.List r8 = r6.c
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.woy.bp(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L4d:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r8.next()
            grr r4 = (defpackage.grr) r4
            r0.a = r7
            r0.b = r2
            r0.c = r8
            r0.h = r6
            r0.d = r2
            r0.g = r3
            r5 = r7
            geu r5 = (defpackage.geu) r5
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 == r1) goto L7e
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L74:
            grr r8 = (defpackage.grr) r8
            r6.add(r8)
            r6 = r7
            r8 = r2
            r2 = r4
            r7 = r5
            goto L4d
        L7e:
            return r1
        L7f:
            r7 = 0
            r8 = 59
            gru r6 = c(r6, r7, r2, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gru.a(geu, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.geu r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.grt
            if (r0 == 0) goto L13
            r0 = r7
            grt r0 = (defpackage.grt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            grt r0 = new grt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            gru r5 = r0.d
            defpackage.woy.dF(r7)
            goto L4d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.woy.dF(r7)
            java.util.List r7 = r5.c
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L59
            java.lang.Object r7 = r7.get(r3)
            grr r7 = (defpackage.grr) r7
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 == r1) goto L58
        L4d:
            java.util.List r6 = defpackage.woy.bg(r7)
            r7 = 59
            gru r5 = c(r5, r3, r6, r7)
            return r5
        L58:
            return r1
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gru.b(geu, afck):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gru)) {
            return false;
        }
        gru gruVar = (gru) obj;
        return this.a == gruVar.a && affa.f(this.b, gruVar.b) && affa.f(this.c, gruVar.c) && affa.f(this.d, gruVar.d) && this.e == gruVar.e && this.f == gruVar.f;
    }

    public final int hashCode() {
        fzg fzgVar = this.b;
        return (((((((((a.f(this.a) * 31) + (fzgVar == null ? 0 : fzgVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a.f(this.e)) * 31) + a.f(this.f);
    }

    public final String toString() {
        return "MenuTemplateInternal(isLoading=" + this.a + ", header=" + this.b + ", sections=" + this.c + ", actions=" + this.d + ", allowAlphabeticalIndexing=" + this.e + ", forceEnableMultiTransactionListLoading=" + this.f + ")";
    }
}
