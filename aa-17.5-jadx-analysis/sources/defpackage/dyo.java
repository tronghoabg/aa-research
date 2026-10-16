package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class dyo extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dyr c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyo(boolean z, dyr dyrVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = z;
        this.c = dyrVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return this.d != 0 ? new dyo(this.b, this.c, afckVar, 1, null) : new dyo(this.b, this.c, afckVar, 0);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.d != 0) {
            afcr afcrVar = afcr.a;
            int i = this.a;
            woy.dF(obj);
            if (i == 0) {
                boolean z = this.b;
                Log.i(dyr.b, "LCS_SL: updateLocalCallSilence: isSilenced=[" + z + "]");
                dyr dyrVar = this.c;
                Boolean boolValueOf = Boolean.valueOf(z);
                this.a = 1;
                if (dyrVar.d.invoke(boolValueOf, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
        } else {
            woy.dF(obj);
            boolean z2 = this.b;
            Log.i(dyr.b, "LCS_SL: updateCanUserUpdateSilence: state=[" + z2 + "]");
            dyr dyrVar2 = this.c;
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            this.a = 1;
            if (dyrVar2.e.invoke(boolValueOf2, this) == afcrVar2) {
                return afcrVar2;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((dyo) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((dyo) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyo(boolean z, dyr dyrVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = z;
        this.c = dyrVar;
    }
}
