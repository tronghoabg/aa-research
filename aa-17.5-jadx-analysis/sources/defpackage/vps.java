package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class vps extends vpu {
    public final xyc a;
    private final xyc b;

    public vps(final long j) {
        if (j <= -100 || j >= 100) {
            final int i = 2;
            this.a = wub.L(new xyc() { // from class: vpr
                @Override // defpackage.xyc
                public final Object gu() {
                    int i2 = i;
                    if (i2 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i2 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
            this.b = wub.L(new vks(this, i));
        } else {
            final int i2 = 1;
            this.b = wub.L(new xyc() { // from class: vpr
                @Override // defpackage.xyc
                public final Object gu() {
                    int i22 = i2;
                    if (i22 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i22 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
            final int i3 = 0;
            this.a = wub.L(new xyc() { // from class: vpr
                @Override // defpackage.xyc
                public final Object gu() {
                    int i22 = i3;
                    if (i22 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i22 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
        }
    }

    @Override // defpackage.vpu
    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.gu();
    }

    @Override // defpackage.vpu
    public final String b() {
        return (String) this.a.gu();
    }
}
