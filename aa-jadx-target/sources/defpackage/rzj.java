package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rzj extends defpackage.rip {
    final /* synthetic */ defpackage.rzk a;

    public rzj(defpackage.rzk rzkVar) {
        this.a = rzkVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        try {
            java.lang.String action = intent.getAction();
            if (action == null) {
                return;
            }
            int iHashCode = action.hashCode();
            if (iHashCode == -625334656) {
                if (action.equals("com.google.android.gms.car.FIRST_ACTIVITY")) {
                    int iOrdinal = ((defpackage.rsm) defpackage.omv.f(intent, defpackage.rsm.values())).ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3 || iOrdinal == 4) {
                            this.a.h();
                            return;
                        } else if (iOrdinal != 8) {
                            return;
                        }
                    }
                    this.a.g();
                    return;
                }
                return;
            }
            if (iHashCode == -203776308) {
                if (action.equals("com.google.android.gms.car.PROJECTION_ENDED")) {
                    this.a.g();
                }
            } else if (iHashCode == 1449022483 && action.equals("com.google.android.gms.car.PROJECTION_STARTED")) {
                int iOrdinal2 = ((defpackage.rsq) defpackage.omv.f(intent, defpackage.rsq.values())).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        this.a.g();
                        return;
                    } else if (iOrdinal2 != 2) {
                        return;
                    }
                }
                this.a.h();
            }
        } catch (defpackage.rsn e) {
            defpackage.rzk.a.h().ai(8583).M("received %s with invalid state: %s", intent.getAction(), e.getMessage());
        }
    }
}
