package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
final class ryo extends rht {
    final /* synthetic */ ryp a;

    public ryo(ryp rypVar) {
        this.a = rypVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        try {
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            int iHashCode = action.hashCode();
            if (iHashCode == -625334656) {
                if (action.equals("com.google.android.gms.car.FIRST_ACTIVITY")) {
                    int iOrdinal = ((rrs) ols.J(intent, rrs.values())).ordinal();
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
                int iOrdinal2 = ((rrw) ols.J(intent, rrw.values())).ordinal();
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
        } catch (rrt e) {
            ryp.a.h().ai(8558).M("received %s with invalid state: %s", intent.getAction(), e.getMessage());
        }
    }
}
