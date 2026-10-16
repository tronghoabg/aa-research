package defpackage;

import android.content.ComponentName;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class ddw implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ ddw(int i) {
        this.a = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean zK = true;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return (cgh) obj;
            case 1:
                return (cgf) obj;
            case 2:
                Float f = (Float) obj;
                ((Float) obj2).floatValue();
                return f;
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 5:
                return (ddo) obj;
            case 6:
                return (String) obj;
            case 7:
                return (afak) obj;
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 9:
                return (ckv) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                return (afak) obj;
            case 12:
                return (afak) obj;
            case 13:
                return (cgm) obj;
            case 14:
                return obj == null ? obj2 : obj;
            case 15:
                wci wciVar = (wci) obj;
                Throwable cancellationException = (Throwable) obj2;
                wciVar.getClass();
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ((aitm) wciVar.b).b(cancellationException);
                return afak.a;
            case 16:
                long jIntValue = ((Integer) obj).intValue();
                Duration duration = (Duration) obj2;
                duration.getClass();
                long millis = duration.toMillis();
                return millis > 0 ? wub.al(Math.min(jIntValue, millis)) : wub.al(jIntValue);
            case 17:
                nsv nsvVar = (nsv) obj;
                ComponentName componentName = (ComponentName) obj2;
                nsvVar.getClass();
                if (nsvVar != nsv.a) {
                    zK = nsr.c().b().K();
                } else if (componentName == null || !lem.a().i(mpl.b(componentName)) || !nsr.c().b().K()) {
                    zK = false;
                }
                return Boolean.valueOf(zK);
            case 18:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean zBooleanValue = bool2.booleanValue();
                yph yphVar = njw.a;
                bool.getClass();
                boolean z = (bool.booleanValue() || zBooleanValue) ? false : true;
                yop yopVarL = njw.a.l();
                Boolean boolValueOf = Boolean.valueOf(z);
                yopVarL.R("setting assistant mic enabled state to: %s, hasCall: %s, isDisabled: %s", boolValueOf, bool, bool2);
                return boolValueOf;
            case 19:
                nnl nnlVar = (nnl) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                yph yphVar2 = nnu.a;
                if (!zBooleanValue2 || affa.f(nnlVar, nnl.a)) {
                    return nnlVar;
                }
                nnu.a.l().u("Disabling rail widget main action");
                nnlVar.getClass();
                ngv ngvVar = new ngv(15);
                nnk nnkVar = nnlVar.b;
                nnk nnkVar2 = new nnk(nnkVar.a, nnkVar.c, ngvVar);
                ngv ngvVar2 = new ngv(16);
                return new nnl(nnkVar2, nnlVar.c, nnlVar.d, nnlVar.e, nnlVar.f, nnlVar.g, nnlVar.h, nnlVar.i, nnlVar.j, nnlVar.k, nnlVar.s, nnlVar.t, nnlVar.l, nnlVar.m, ngvVar2, nnlVar.o, nnlVar.p, nnlVar.q, nnlVar.r, nnlVar.u);
            default:
                nnl nnlVar2 = (nnl) obj;
                nnl nnlVar3 = (nnl) obj2;
                yph yphVar3 = nnu.a;
                nnlVar2.getClass();
                if (!affa.f(nnl.a, nnlVar2) && nnlVar3 != null) {
                    ComponentName componentName2 = nnlVar2.r;
                    if (!affa.f(nnlVar3.r, componentName2)) {
                        int size = woy.da(new nnk[]{nnlVar2.o, nnlVar2.p, nnlVar2.q}).size();
                        int i3 = nnlVar2.u - 1;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                i = 2;
                            } else if (i3 != 2) {
                                i = -1;
                            }
                            ((ohs) mki.a.i(ohs.class)).p(yzz.RAIL_WIDGET, yzy.kV, componentName2, i, size);
                        } else {
                            i2 = 4;
                        }
                        i = i2;
                        ((ohs) mki.a.i(ohs.class)).p(yzz.RAIL_WIDGET, yzy.kV, componentName2, i, size);
                    }
                }
                return nnlVar2;
        }
    }
}
