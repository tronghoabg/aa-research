package defpackage;

import com.google.android.gms.car.display.CarRegionGroup;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig;
import com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class eqy {
    public static final eqj a(eqj eqjVar) {
        eql eqlVar;
        eqjVar.getClass();
        affq affqVar = new affq();
        affqVar.a = true;
        if (eqjVar.o()) {
            affqVar.a = false;
            eqlVar = new eql(eqjVar.e());
        } else {
            eqlVar = new eql();
        }
        eqlVar.r(eqjVar, new kko(new erl(eqlVar, affqVar, 2, (byte[]) null), 1));
        return eqlVar;
    }

    public static final eqj b(eqj eqjVar, afec afecVar) {
        eqjVar.getClass();
        afecVar.getClass();
        eql eqlVar = eqjVar.o() ? new eql(afecVar.invoke(eqjVar.e())) : new eql();
        eqlVar.r(eqjVar, new kko(new erl(eqlVar, afecVar, 0, (byte[]) null), 1));
        return eqlVar;
    }

    public static final eqj c(eqj eqjVar, afec afecVar) {
        eqj eqjVar2;
        eqjVar.getClass();
        afecVar.getClass();
        affv affvVar = new affv();
        eql eqlVar = (eqjVar.o() && (eqjVar2 = (eqj) afecVar.invoke(eqjVar.e())) != null && eqjVar2.o()) ? new eql(eqjVar2.e()) : new eql();
        eql eqlVar2 = eqlVar;
        eqlVar2.r(eqjVar, new kko(new acg((Object) afecVar, (Object) affvVar, (Object) eqlVar2, 15, (byte[]) null), 1));
        return eqlVar2;
    }

    public static final erm d(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()));
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (erm) objNewInstance;
            } catch (IllegalAccessException e) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
            } catch (InstantiationException e2) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
            }
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(CarActivityLayoutConfig carActivityLayoutConfig) {
        int i;
        woy.aa(!carActivityLayoutConfig.a().isEmpty(), "There must be at least one display");
        yfq yfqVarA = carActivityLayoutConfig.a();
        int size = yfqVarA.size();
        int i2 = 0;
        while (i2 < size) {
            CarDisplayLayoutConfig carDisplayLayoutConfig = (CarDisplayLayoutConfig) yfqVarA.get(i2);
            woy.aa(!carDisplayLayoutConfig.a().isEmpty(), "Each display must contain at least 1 region");
            yfq yfqVarA2 = carDisplayLayoutConfig.a();
            int size2 = yfqVarA2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size2) {
                    CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (CarActivityRegionLayoutConfig) yfqVarA2.get(i3);
                    CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                    woy.ad(carActivityRegionLayoutConfig.b != null, "Fallback intent is null for %s", carRegionId);
                    woy.ad(carActivityRegionLayoutConfig.a != null, "Initial intent is null for %s", carRegionId);
                    i3++;
                }
            }
            i2 = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(CarActivityLayoutConfig carActivityLayoutConfig) {
        int i;
        int i2 = 0;
        yy yyVar = new yy(0);
        yy yyVar2 = new yy(0);
        yez yezVar = new yez(null);
        yfq yfqVarA = carActivityLayoutConfig.a();
        int size = yfqVarA.size();
        int i3 = 0;
        while (i3 < size) {
            yfq yfqVarA2 = ((CarDisplayLayoutConfig) yfqVarA.get(i3)).a();
            int size2 = yfqVarA2.size();
            int i4 = i2;
            while (true) {
                i = i3 + 1;
                if (i4 < size2) {
                    CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (CarActivityRegionLayoutConfig) yfqVarA2.get(i4);
                    CarRegionGroup carRegionGroup = carActivityRegionLayoutConfig.e;
                    if (carRegionGroup != null) {
                        CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                        Set<CarRegionId> setG = yezVar.c(carRegionGroup);
                        if (!setG.isEmpty()) {
                            for (CarRegionId carRegionId2 : setG) {
                                if (yyVar.contains(carRegionId2)) {
                                    woy.ag(carActivityRegionLayoutConfig.a.getComponent() == null ? 1 : i2, "There can be at most one region with a non null component on its initial intent. Group %s has both %s and %s", carRegionGroup, carRegionId, carRegionId2);
                                }
                                if (yyVar2.contains(carRegionId2)) {
                                    woy.ag(carActivityRegionLayoutConfig.b.getComponent() == null, "There can be at most one region with a non null component on its fallback intent. Group %s has both %s and %s", carRegionGroup, carRegionId, carRegionId2);
                                }
                                i2 = 0;
                            }
                        }
                        if (carActivityRegionLayoutConfig.a.getComponent() != null) {
                            yyVar.add(carRegionId);
                        }
                        if (carActivityRegionLayoutConfig.b.getComponent() != null) {
                            yyVar2.add(carRegionId);
                        }
                        yezVar.t(carRegionGroup, carRegionId);
                    }
                    i4++;
                    i2 = 0;
                }
            }
            i3 = i;
        }
    }

    public static boolean g(int i) {
        int i2 = (int) acqy.a.gu().i();
        return i2 != -1 && i >= i2;
    }
}
