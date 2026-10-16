package defpackage;

import java.util.Date;

/* loaded from: classes2.dex */
public final class ajyb extends ajyc implements ajuu {
    private static final long serialVersionUID = -7744598295706617057L;
    public int[] a;
    public boolean b;

    @Override // defpackage.ajyc
    public final Object clone() throws CloneNotSupportedException {
        ajyb ajybVar = (ajyb) super.clone();
        int[] iArr = this.a;
        if (iArr != null) {
            ajybVar.a = (int[]) iArr.clone();
        }
        return ajybVar;
    }

    @Override // defpackage.ajyc, defpackage.ajui
    public final boolean g(Date date) {
        return this.b || super.g(date);
    }

    @Override // defpackage.ajyc, defpackage.ajui
    public final int[] i() {
        return this.a;
    }
}
