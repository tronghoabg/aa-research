package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class akfa implements akfn, akfl {
    private final int a;

    public akfa(int i) {
        this.a = i;
    }

    @Override // defpackage.akfl
    public final int a() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.akfn
    public final int b() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.akfl
    public final int c(akfh akfhVar, CharSequence charSequence, int i) {
        Map map = akci.a;
        String str = null;
        for (String str2 : map.keySet()) {
            if (akfe.c(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                str = str2;
            }
        }
        if (str == null) {
            return ~i;
        }
        akfhVar.f((akcl) map.get(str));
        return i + str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    @Override // defpackage.akfn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Appendable r3, long r4, defpackage.akcd r6, int r7, defpackage.akcl r8, java.util.Locale r9) throws java.io.IOException {
        /*
            r2 = this;
            if (r8 != 0) goto L6
            java.lang.String r2 = ""
            goto L87
        L6:
            long r6 = (long) r7
            long r4 = r4 - r6
            int r2 = r2.a
            r6 = 0
            if (r2 == 0) goto L4b
            if (r9 != 0) goto L13
            java.util.Locale r9 = java.util.Locale.getDefault()
        L13:
            java.lang.String r2 = r8.g(r4)
            if (r2 != 0) goto L1d
            java.lang.String r2 = r8.c
            goto L87
        L1d:
            akfu r7 = defpackage.akcl.d
            boolean r0 = r7 instanceof defpackage.akfu
            r1 = 0
            if (r0 == 0) goto L34
            java.lang.String r2 = r8.c
            boolean r0 = r8.l(r4)
            java.lang.String[] r2 = r7.b(r9, r2, r0)
            if (r2 != 0) goto L31
            goto L3c
        L31:
            r2 = r2[r1]
            goto L40
        L34:
            java.lang.String r0 = r8.c
            java.lang.String[] r2 = r7.a(r9, r0, r2)
            if (r2 != 0) goto L3e
        L3c:
            r2 = r6
            goto L40
        L3e:
            r2 = r2[r1]
        L40:
            if (r2 != 0) goto L87
            int r2 = r8.a(r4)
            java.lang.String r2 = defpackage.akcl.h(r2)
            goto L87
        L4b:
            if (r9 != 0) goto L51
            java.util.Locale r9 = java.util.Locale.getDefault()
        L51:
            java.lang.String r2 = r8.g(r4)
            if (r2 != 0) goto L5a
            java.lang.String r2 = r8.c
            goto L87
        L5a:
            akfu r7 = defpackage.akcl.d
            boolean r0 = r7 instanceof defpackage.akfu
            r1 = 1
            if (r0 == 0) goto L71
            java.lang.String r2 = r8.c
            boolean r0 = r8.l(r4)
            java.lang.String[] r2 = r7.b(r9, r2, r0)
            if (r2 != 0) goto L6e
            goto L79
        L6e:
            r2 = r2[r1]
            goto L7d
        L71:
            java.lang.String r0 = r8.c
            java.lang.String[] r2 = r7.a(r9, r0, r2)
            if (r2 != 0) goto L7b
        L79:
            r2 = r6
            goto L7d
        L7b:
            r2 = r2[r1]
        L7d:
            if (r2 != 0) goto L87
            int r2 = r8.a(r4)
            java.lang.String r2 = defpackage.akcl.h(r2)
        L87:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfa.d(java.lang.Appendable, long, akcd, int, akcl, java.util.Locale):void");
    }
}
