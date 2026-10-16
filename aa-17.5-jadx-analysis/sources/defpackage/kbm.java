package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class kbm implements gtt {
    private final eqm a;
    private final eqj b;

    public kbm() {
        eqm eqmVar = new eqm(false);
        this.a = eqmVar;
        this.b = eqmVar;
    }

    @Override // defpackage.gtt
    public final eqj a() {
        return this.b;
    }

    @Override // defpackage.gtt
    public final void b(Intent intent) {
        intent.getClass();
        eqm eqmVar = this.a;
        Object objE = eqmVar.e();
        if (objE == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        eqmVar.m(Boolean.valueOf(intent.getBooleanExtra("com.google.android.gms.car.EXTRA_SHOW_TURN_CARD", ((Boolean) objE).booleanValue())));
    }
}
