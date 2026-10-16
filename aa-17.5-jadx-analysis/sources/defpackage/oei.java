package defpackage;

import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final /* synthetic */ class oei implements oel {
    public final /* synthetic */ Object a;
    public final /* synthetic */ AbstractSafeParcelable b;
    private final /* synthetic */ int c;

    public /* synthetic */ oei(CarCall carCall, CarCall.Details details, int i) {
        this.c = i;
        this.a = carCall;
        this.b = details;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.oel
    public final void a(ebf ebfVar) {
        int i = this.c;
        if (i == 0) {
            ebfVar.u((CarCall) this.a, (CarCall.Details) this.b);
            return;
        }
        if (i == 1) {
            ebfVar.v((CarCall) this.b, (CarCall) this.a);
            return;
        }
        if (i == 2) {
            ebfVar.s((CarCall) this.b, this.a);
        } else {
            if (i == 3) {
                ebfVar.r((CarCall) this.b, this.a);
                return;
            }
            ?? r1 = this.a;
            if (i != 4) {
                ebfVar.q((CarCall) this.b, r1);
            } else {
                ebfVar.x((CarCall) this.b, (String) r1);
            }
        }
    }

    public /* synthetic */ oei(CarCall carCall, Object obj, int i) {
        this.c = i;
        this.b = carCall;
        this.a = obj;
    }
}
