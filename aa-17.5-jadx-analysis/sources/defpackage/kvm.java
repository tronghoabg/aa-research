package defpackage;

import android.os.Bundle;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
public final /* synthetic */ class kvm implements afei {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kvm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [afei, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cfy, java.lang.Object] */
    @Override // defpackage.afei
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.c;
        Object[] objArr = 0;
        if (i3 == 0) {
            bii biiVar = (bii) obj;
            Integer num = (Integer) obj2;
            int iIntValue = num.intValue();
            bux buxVar = (bux) obj3;
            int iIntValue2 = ((Integer) obj4).intValue();
            biiVar.getClass();
            if ((iIntValue2 & 6) == 0) {
                i = (true != buxVar.C(biiVar) ? 2 : 4) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= true == buxVar.A(iIntValue) ? 32 : 16;
            }
            if (buxVar.I((i & 147) != 146, i & 1)) {
                kvo.b.x(this.a.invoke(biiVar, num, buxVar, Integer.valueOf(i & 126)), bxc.i(2100815937, true, new kvn(this.b, iIntValue, objArr == true ? 1 : 0), buxVar), buxVar, 432);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i3 != 1) {
            Boolean bool = (Boolean) obj3;
            Bundle bundle = (Bundle) obj4;
            bool.getClass();
            boolean zBooleanValue = bool.booleanValue();
            bundle.getClass();
            return new lpf(((lpo) this.b).h, (AaPlaybackState) obj, (lmd) obj2, zBooleanValue, bundle, ((llu) this.a).L());
        }
        tiw tiwVar = (tiw) obj;
        Number number = (Number) obj2;
        bux buxVar2 = (bux) obj3;
        int iIntValue3 = ((Integer) obj4).intValue();
        int i4 = kkz.a;
        tiwVar.getClass();
        number.getClass();
        if ((iIntValue3 & 6) == 0) {
            i2 = (true != ((iIntValue3 & 8) == 0 ? buxVar2.C(tiwVar) : buxVar2.E(tiwVar)) ? 2 : 4) | iIntValue3;
        } else {
            i2 = iIntValue3;
        }
        if ((iIntValue3 & 48) == 0) {
            i2 |= true == ((iIntValue3 & 64) == 0 ? buxVar2.C(number) : buxVar2.E(number)) ? 32 : 16;
        }
        if (buxVar2.I((i2 & 147) != 146, i2 & 1)) {
            Object obj5 = this.b;
            Object obj6 = this.a;
            urg urgVarA = tjh.a(buxVar2);
            String string = number.toString();
            boolean zE = buxVar2.E(urgVarA) | buxVar2.E(obj6) | buxVar2.E(obj5);
            Object objG = buxVar2.g();
            if (zE || objG == buw.a) {
                ah ahVar = new ah(urgVarA, obj6, obj5, 15, (char[]) null);
                buxVar2.x(ahVar);
                objG = ahVar;
            }
            afdr afdrVar = (afdr) objG;
            afdrVar.getClass();
            std.f(tiwVar, string, new tjc(afdrVar), false, null, buxVar2, i2 & 14, 58);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ kvm(lpo lpoVar, lmb lmbVar, int i) {
        this.c = i;
        this.b = lpoVar;
        this.a = lmbVar;
    }
}
