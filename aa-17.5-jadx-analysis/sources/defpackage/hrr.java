package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class hrr implements idl {
    private final /* synthetic */ int a;

    public hrr(int i) {
        this.a = i;
    }

    @Override // defpackage.idl
    public final hss a(hrt hrtVar, idg idgVar, idn idnVar, Context context) {
        return this.a != 0 ? new hss(hrtVar, idgVar, idnVar, context) : new jrp(hrtVar, idgVar, idnVar, context);
    }
}
