package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
final class ajbh extends aizp implements aizz {
    public ajbh(int i) {
        super(1, Alert.DURATION_SHOW_INDEFINITELY, 2);
        c(Integer.valueOf(i));
    }

    @Override // defpackage.aizz
    public final /* bridge */ /* synthetic */ Object b() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) h()).intValue());
        }
        return numValueOf;
    }

    public final void p(int i) {
        synchronized (this) {
            c(Integer.valueOf(((Number) h()).intValue() + i));
        }
    }
}
