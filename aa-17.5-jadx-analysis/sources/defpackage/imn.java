package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.view.Surface;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class imn implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ imn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [iyk, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ina inaVar = (ina) this.a;
                jdr jdrVar = inaVar.Z.j;
                jkg jkgVar = (jkg) obj;
                if (jdrVar instanceof jen) {
                    jen jenVar = (jen) jdrVar;
                    jenVar.t(jkgVar.a);
                    jenVar.s(jkgVar.c);
                    if (inaVar.h) {
                        return;
                    }
                    jenVar.u(jkgVar.b);
                    return;
                }
                return;
            case 1:
                byte[] byteArray = ((Bundle) this.a).getByteArray("activity_layout_config");
                if (byteArray == null) {
                    throw new IllegalStateException("ProjectionLifecycleService must pass a CarActivityLayoutConfig");
                }
                CarActivityLayoutConfig carActivityLayoutConfig = (CarActivityLayoutConfig) spu.h(byteArray, CarActivityLayoutConfig.CREATOR);
                eqy.e(carActivityLayoutConfig);
                eqy.f(carActivityLayoutConfig);
                return;
            case 2:
                ((iny) this.a).a = (ComponentName) obj;
                return;
            case 3:
                yph yphVar = ipb.E;
                ((ipi) obj).b((Surface) this.a);
                return;
            case 4:
                this.a.c((Duration) obj);
                return;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                abnp abnpVar = (abnp) this.a;
                abnpVar.t();
                yxb yxbVar = (yxb) abnpVar.b;
                yxb yxbVar2 = yxb.a;
                yxbVar.b |= 524288;
                yxbVar.t = iIntValue;
                return;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                abnp abnpVar2 = (abnp) this.a;
                abnpVar2.t();
                yxb yxbVar3 = (yxb) abnpVar2.b;
                yxb yxbVar4 = yxb.a;
                yxbVar3.b |= 1048576;
                yxbVar3.u = zBooleanValue;
                return;
            case 7:
                int iIntValue2 = ((Integer) obj).intValue();
                abnp abnpVar3 = (abnp) this.a;
                abnpVar3.t();
                yxb yxbVar5 = (yxb) abnpVar3.b;
                yxb yxbVar6 = yxb.a;
                yxbVar5.b |= 2097152;
                yxbVar5.v = iIntValue2;
                return;
            case 8:
                int i = ohz.a;
                int i2 = ((yyf) obj).l;
                abnp abnpVar4 = (abnp) this.a;
                abnpVar4.t();
                yxb yxbVar7 = (yxb) abnpVar4.b;
                yxb yxbVar8 = yxb.a;
                yxbVar7.b |= 4194304;
                yxbVar7.w = i2;
                return;
            case 9:
                yph yphVar2 = oid.a;
                yzj yzjVarS = aclh.s((UUID) obj);
                abnp abnpVar5 = (abnp) this.a;
                abnpVar5.t();
                yxb yxbVar9 = (yxb) abnpVar5.b;
                yxb yxbVar10 = yxb.a;
                yzjVarS.getClass();
                yxbVar9.ag = yzjVarS;
                yxbVar9.d |= 32;
                return;
            case 10:
                long jLongValue = ((Long) obj).longValue();
                abnp abnpVar6 = (abnp) this.a;
                abnpVar6.t();
                yxv yxvVar = (yxv) abnpVar6.b;
                yxv yxvVar2 = yxv.a;
                yxvVar.b |= 1;
                yxvVar.c = jLongValue;
                return;
            default:
                long jLongValue2 = ((Long) obj).longValue();
                abnp abnpVar7 = (abnp) this.a;
                abnpVar7.t();
                yxv yxvVar3 = (yxv) abnpVar7.b;
                yxv yxvVar4 = yxv.a;
                yxvVar3.b |= 2;
                yxvVar3.d = jLongValue2;
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
