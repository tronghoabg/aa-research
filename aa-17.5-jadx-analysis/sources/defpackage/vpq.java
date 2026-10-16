package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class vpq extends vpu {
    public final xyc a;
    private final xyc b = wub.L(new vdv(this, 6));

    public vpq(final double d) {
        this.a = wub.L(new xyc() { // from class: vpp
            @Override // defpackage.xyc
            public final Object gu() {
                return String.format(Locale.US, "%.1e", Double.valueOf(d));
            }
        });
    }

    @Override // defpackage.vpu
    public final /* bridge */ /* synthetic */ Object a() {
        return (Double) this.b.gu();
    }

    @Override // defpackage.vpu
    public final String b() {
        return (String) this.a.gu();
    }
}
