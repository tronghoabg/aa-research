package defpackage;

/* loaded from: classes.dex */
public final class ysa {
    public int a = 0;
    public int b = -1;
    protected final Object[] c;
    public final StringBuilder d;
    public int e;
    private final yqq f;

    protected ysa(yqq yqqVar, Object[] objArr, StringBuilder sb) {
        yqqVar.getClass();
        this.f = yqqVar;
        this.e = 0;
        objArr.getClass();
        this.c = objArr;
        this.d = sb;
    }

    public static void c(StringBuilder sb, Object obj, String str) {
        String strA;
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        try {
            strA = ypr.c(obj);
        } catch (RuntimeException e) {
            strA = ypr.a(obj, e);
        }
        sb.append(strA);
        sb.append("]");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.ypo r20, java.lang.StringBuilder r21) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysa.e(ypo, java.lang.StringBuilder):void");
    }

    public final ysb a() {
        return this.f.a;
    }

    public final String b() {
        return this.f.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r7, defpackage.ypk r8, defpackage.ypl r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysa.d(java.lang.Object, ypk, ypl):void");
    }
}
