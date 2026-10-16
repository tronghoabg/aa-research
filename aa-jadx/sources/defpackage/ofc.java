package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ofc implements defpackage.off {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable b;
    private final /* synthetic */ int c;

    public /* synthetic */ ofc(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall.Details details, int i) {
        this.c = i;
        this.a = carCall;
        this.b = details;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.off
    public final void a(defpackage.omf omfVar) {
        int i = this.c;
        if (i == 0) {
            omfVar.k((com.google.android.apps.auto.components.telecom.call.CarCall) this.a, (com.google.android.apps.auto.components.telecom.call.CarCall.Details) this.b);
            return;
        }
        if (i == 1) {
            omfVar.l((com.google.android.apps.auto.components.telecom.call.CarCall) this.b, (com.google.android.apps.auto.components.telecom.call.CarCall) this.a);
            return;
        }
        if (i == 2) {
            omfVar.i((com.google.android.apps.auto.components.telecom.call.CarCall) this.b, this.a);
        } else {
            if (i == 3) {
                omfVar.h((com.google.android.apps.auto.components.telecom.call.CarCall) this.b, this.a);
                return;
            }
            ?? r1 = this.a;
            if (i != 4) {
                omfVar.g((com.google.android.apps.auto.components.telecom.call.CarCall) this.b, r1);
            } else {
                omfVar.n((com.google.android.apps.auto.components.telecom.call.CarCall) this.b, (java.lang.String) r1);
            }
        }
    }

    public /* synthetic */ ofc(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.lang.Object obj, int i) {
        this.c = i;
        this.b = carCall;
        this.a = obj;
    }
}
