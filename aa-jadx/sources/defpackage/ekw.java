package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ekw implements defpackage.ekj {
    public final defpackage.ekm a;
    public final java.lang.String b;
    public final java.lang.Object[] c;
    private final int d;

    public ekw(defpackage.ekm ekmVar, java.lang.String str, java.lang.Object[] objArr) {
        this.a = ekmVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // defpackage.ekj
    public final defpackage.ekm a() {
        return this.a;
    }

    @Override // defpackage.ekj
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.ekj
    public final int c() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
