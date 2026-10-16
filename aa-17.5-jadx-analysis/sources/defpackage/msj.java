package defpackage;

import android.os.Bundle;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class msj extends kmh {
    private float a = BitmapDescriptorFactory.HUE_RED;
    private EnumSet b;
    private cjb c;

    public msj() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(msi.class);
        enumSetNoneOf.getClass();
        this.b = enumSetNoneOf;
        this.c = cjb.a;
    }

    @Override // defpackage.kmh
    public final void a(bux buxVar, int i) {
        int i2;
        msj msjVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1787748071);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            msjVar = this;
            msjVar.b(awd.c(cfy.e, 1.0f), this.a, this.b, this.c, buxVarC, ((i2 << 15) & 458752) | 390);
        } else {
            msjVar = this;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(msjVar, i, 8);
        }
    }

    public final void b(cfy cfyVar, float f, EnumSet enumSet, cjb cjbVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-33916316);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.B(-72057594037927936L) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(enumSet) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cjbVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            boolean zE = ((i2 & 112) == 32) | ((57344 & i2) == 16384) | buxVarC.E(enumSet);
            boolean z = (i2 & 896) == 256;
            Object objS = bvvVar.S();
            if ((z | zE) || objS == buw.a) {
                objS = new azw(f, cjbVar, enumSet, 3);
                bvvVar.ad(objS);
            }
            afp.z(cfyVar, (afec) objS, buxVarC, i2 & 14);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gzt(this, cfyVar, f, enumSet, cjbVar, i, 2);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getFloat("extra_corner_radius");
            ArrayList<Integer> integerArrayList = arguments.getIntegerArrayList("extra_rounded_corners");
            if (integerArrayList != null) {
                EnumSet enumSetNoneOf = EnumSet.noneOf(msi.class);
                enumSetNoneOf.getClass();
                this.b = enumSetNoneOf;
                Iterator<Integer> it = integerArrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Integer next = it.next();
                    EnumSet enumSet = this.b;
                    afdf afdfVar = msi.e;
                    next.getClass();
                    enumSet.add(afdfVar.get(next.intValue()));
                }
            }
            this.c = new cjb(arguments.getFloat("extra_inset_left", BitmapDescriptorFactory.HUE_RED), arguments.getFloat("extra_inset_top", BitmapDescriptorFactory.HUE_RED), arguments.getFloat("extra_inset_right", BitmapDescriptorFactory.HUE_RED), arguments.getFloat("extra_inset_bottom", BitmapDescriptorFactory.HUE_RED));
        }
    }
}
