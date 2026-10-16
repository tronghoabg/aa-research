package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vqo extends defpackage.vqq {
    public final defpackage.xzi a;
    private final defpackage.xzi b;

    public vqo(final long j) {
        if (j <= -100 || j >= 100) {
            final int i = 2;
            this.a = defpackage.ysr.aQ(new defpackage.xzi() { // from class: vqn
                @Override // defpackage.xzi
                public final java.lang.Object fF() {
                    int i2 = i;
                    if (i2 == 0) {
                        return java.lang.String.valueOf(j);
                    }
                    long j2 = j;
                    return i2 != 1 ? java.lang.String.format(java.util.Locale.US, "%.1e", java.lang.Double.valueOf(j2)) : java.lang.Long.valueOf(j2);
                }
            });
            this.b = defpackage.ysr.aQ(new defpackage.ryo(this, 3));
        } else {
            final int i2 = 1;
            this.b = defpackage.ysr.aQ(new defpackage.xzi() { // from class: vqn
                @Override // defpackage.xzi
                public final java.lang.Object fF() {
                    int i3 = i2;
                    if (i3 == 0) {
                        return java.lang.String.valueOf(j);
                    }
                    long j2 = j;
                    return i3 != 1 ? java.lang.String.format(java.util.Locale.US, "%.1e", java.lang.Double.valueOf(j2)) : java.lang.Long.valueOf(j2);
                }
            });
            final int i3 = 0;
            this.a = defpackage.ysr.aQ(new defpackage.xzi() { // from class: vqn
                @Override // defpackage.xzi
                public final java.lang.Object fF() {
                    int i4 = i3;
                    if (i4 == 0) {
                        return java.lang.String.valueOf(j);
                    }
                    long j2 = j;
                    return i4 != 1 ? java.lang.String.format(java.util.Locale.US, "%.1e", java.lang.Double.valueOf(j2)) : java.lang.Long.valueOf(j2);
                }
            });
        }
    }

    @Override // defpackage.vqq
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return (java.lang.Long) this.b.fF();
    }

    @Override // defpackage.vqq
    public final java.lang.String b() {
        return (java.lang.String) this.a.fF();
    }
}
