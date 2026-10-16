package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fnm implements fnk {
    public final eyn a = new fnl();
    private final ezc b;

    public fnm(ezc ezcVar) {
        this.b = ezcVar;
    }

    @Override // defpackage.fnk
    public final List a(String str) {
        str.getClass();
        return (List) ckf.m(this.b, true, false, new bpi(str, 16));
    }

    @Override // defpackage.fnk
    public final boolean b(String str) {
        str.getClass();
        return ((Boolean) ckf.m(this.b, true, false, new bpi(str, 18, (byte[]) null))).booleanValue();
    }

    @Override // defpackage.fnk
    public final void c(sx sxVar) {
        ckf.m(this.b, false, true, new bpi(this, sxVar, 17));
    }
}
