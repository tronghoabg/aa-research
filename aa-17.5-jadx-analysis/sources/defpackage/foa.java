package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class foa implements fnz {
    private final ezc a;

    public foa(ezc ezcVar) {
        this.a = ezcVar;
    }

    @Override // defpackage.fnz
    public final List a(String str) {
        return (List) ckf.m(this.a, true, false, new fnv(str, 2, (byte[]) null));
    }
}
