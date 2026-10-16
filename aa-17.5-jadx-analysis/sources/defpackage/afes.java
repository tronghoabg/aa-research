package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class afes implements afhe, afer, affd {
    public static final Map a;
    private final Class b;

    static {
        int i = 0;
        List listBi = woy.bi(afdr.class, afec.class, afeg.class, afeh.class, afei.class, afej.class, afek.class, afel.class, afem.class, afen.class, afds.class, afdt.class, afdu.class, afdv.class, afdw.class, afdx.class, afdy.class, afdz.class, afea.class, afeb.class, afed.class, afee.class, afef.class);
        ArrayList arrayList = new ArrayList(woy.bp(listBi, 10));
        for (Object obj : listBi) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            arrayList.add(new aezu((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = woy.bc(arrayList);
    }

    public afes(Class cls) {
        cls.getClass();
        this.b = cls;
    }

    private static final void a() {
        throw new afdp();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afes) && affa.f(affa.i(this), affa.i((afhe) obj));
    }

    @Override // defpackage.affd
    public final GenericDeclaration findJavaDeclaration() {
        return this.b;
    }

    @Override // defpackage.afhc
    public final List<Annotation> getAnnotations() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final Collection<afhh<Object>> getConstructors() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afer
    public final Class<?> getJClass() {
        return this.b;
    }

    @Override // defpackage.afhe
    public final Collection<afhd<?>> getMembers() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final Collection<afhe<?>> getNestedClasses() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final Object getObjectInstance() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final String getQualifiedName() {
        Class cls = this.b;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String name = cls.getName();
            name.getClass();
            String strB = afez.b(name);
            return strB == null ? cls.getCanonicalName() : strB;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive()) {
            String name2 = componentType.getName();
            name2.getClass();
            String strB2 = afez.b(name2);
            if (strB2 != null) {
                strConcat = strB2.concat("Array");
            }
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.afhe
    public final List<afhe<? extends Object>> getSealedSubclasses() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final String getSimpleName() {
        Class cls = this.b;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                simpleName.getClass();
                return afyh.o(simpleName, String.valueOf(enclosingMethod.getName()).concat("$"), simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                simpleName.getClass();
                return afyh.o(simpleName, String.valueOf(enclosingConstructor.getName()).concat("$"), simpleName);
            }
            simpleName.getClass();
            return afyh.N(simpleName, simpleName);
        }
        if (!cls.isArray()) {
            String name = cls.getName();
            name.getClass();
            String strC = afez.c(name);
            return strC == null ? cls.getSimpleName() : strC;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive()) {
            String name2 = componentType.getName();
            name2.getClass();
            String strC2 = afez.c(name2);
            if (strC2 != null) {
                strConcat = strC2.concat("Array");
            }
        }
        return strConcat == null ? "Array" : strConcat;
    }

    @Override // defpackage.afhe
    public final List<afib> getSupertypes() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final List<afic> getTypeParameters() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final afif getVisibility() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final int hashCode() {
        return affa.i(this).hashCode();
    }

    @Override // defpackage.afhe
    public final boolean isAbstract() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final boolean isCompanion() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final boolean isData() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final boolean isFinal() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final boolean isFun() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final boolean isInner() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final boolean isInstance(Object obj) {
        Map map = a;
        map.getClass();
        Class clsI = this.b;
        Integer num = (Integer) map.get(clsI);
        if (num != null) {
            return affz.d(obj, num.intValue());
        }
        if (clsI.isPrimitive()) {
            clsI = affa.i(affa.l(clsI));
        }
        return clsI.isInstance(obj);
    }

    @Override // defpackage.afhe
    public final boolean isOpen() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final boolean isSealed() {
        a();
        throw new aezp();
    }

    @Override // defpackage.afhe
    public final boolean isValue() {
        a();
        throw new aezp();
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat(" (Kotlin reflection is not available)");
    }
}
