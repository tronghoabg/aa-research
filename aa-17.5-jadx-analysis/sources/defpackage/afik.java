package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afik {
    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            name.getClass();
            return name;
        }
        airp airpVarF = afrg.f(type, afij.a);
        String name2 = ((Class) afrg.i(airpVarF)).getName();
        return String.valueOf(name2).concat(afyh.d("[]", afrg.g(airpVarF)));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.reflect.Type b(defpackage.afib r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afik.b(afib, boolean):java.lang.reflect.Type");
    }

    public static final Type c(afib afibVar) {
        Type javaType;
        afibVar.getClass();
        return (!(afibVar instanceof affb) || (javaType = ((affb) afibVar).getJavaType()) == null) ? b(afibVar, false) : javaType;
    }

    public static final afid d(afib afibVar) {
        afibVar.getClass();
        return new afid(afie.b, afibVar);
    }

    public static final afid e(afib afibVar) {
        afibVar.getClass();
        return new afid(afie.c, afibVar);
    }

    public static final afid f(afib afibVar) {
        afibVar.getClass();
        return new afid(afie.a, afibVar);
    }

    public static final boolean g(afib afibVar, afib afibVar2) {
        afibVar.getClass();
        afibVar2.getClass();
        if (afvn.getUseK1Implementation()) {
            return aimr.isSubtypeOf(((aiqp) afibVar).getType(), ((aiqp) afibVar2).getType());
        }
        return aier.isSubtypeOf$default(aier.INSTANCE, new aiic(false, false, false, false, aird.INSTANCE, aifd.INSTANCE, aiff.INSTANCE), (aiqc) afibVar, (aiqc) afibVar2, false, 8, null);
    }

    public static final afib h(afhf afhfVar, List list, boolean z, List list2) {
        afhfVar.getClass();
        list.getClass();
        list2.getClass();
        return i(afhfVar, list, z, list2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final afib i(afhf afhfVar, List list, boolean z, List list2, afhe afheVar) {
        agbd descriptor;
        Object aiipVar;
        list2.getClass();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!afvn.getUseK1Implementation()) {
            afhe afheVar2 = afhfVar instanceof afhe ? (afhe) afhfVar : null;
            List<afic> listAllTypeParameters = afheVar2 != null ? aiqj.allTypeParameters(afheVar2) : null;
            if (listAllTypeParameters == null) {
                listAllTypeParameters = afbe.a;
            }
            j(listAllTypeParameters.size(), list.size());
            return new aire(afhfVar, list, z, list2, null, false, false, false, afheVar, null, sk.AUDIO_CONTENT_BUFFER_SIZE, null);
        }
        if (afhfVar instanceof afqw) {
            descriptor = afheVar != null ? afzr.INSTANCE.convertReadOnlyToMutable(((afqw) afhfVar).getDescriptor()) : ((afqw) afhfVar).getDescriptor();
        } else {
            if (!(afhfVar instanceof afrv)) {
                throw new aftw("Cannot create type for an unsupported classifier: " + afhfVar + " (" + afhfVar.getClass() + ')');
            }
            descriptor = ((afrv) afhfVar).getDescriptor();
        }
        j(descriptor.getTypeConstructor().getParameters().size(), list.size());
        aiid typeConstructor = descriptor.getTypeConstructor();
        typeConstructor.getClass();
        List<agee> parameters = typeConstructor.getParameters();
        parameters.getClass();
        aihr empty = aihr.Companion.getEmpty();
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = 2;
            if (!it.hasNext()) {
                return new aiqp(aigq.simpleType$default(empty, typeConstructor, arrayList, z, (aiju) null, 16, (Object) null), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
            }
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            afid afidVar = (afid) next;
            aiqp aiqpVar = (aiqp) afidVar.c;
            aigl type = aiqpVar != null ? aiqpVar.getType() : null;
            afie afieVar = afidVar.b;
            if (afieVar == null) {
                agee ageeVar = parameters.get(i);
                ageeVar.getClass();
                aiipVar = new aihd(ageeVar);
            } else {
                int iOrdinal = afieVar.ordinal();
                if (iOrdinal == 0) {
                    aijg aijgVar = aijg.INVARIANT;
                    type.getClass();
                    aiipVar = new aiip(aijgVar, type);
                } else if (iOrdinal == 1) {
                    aijg aijgVar2 = aijg.IN_VARIANCE;
                    type.getClass();
                    aiipVar = new aiip(aijgVar2, type);
                } else {
                    if (iOrdinal != 2) {
                        throw new aezs();
                    }
                    aijg aijgVar3 = aijg.OUT_VARIANCE;
                    type.getClass();
                    aiipVar = new aiip(aijgVar3, type);
                }
            }
            arrayList.add(aiipVar);
            i = i3;
        }
    }

    public static final void j(int i, int i2) {
        if (i != i2) {
            throw new IllegalArgumentException(a.bB(i2, i, "Class declares ", " type parameters, but ", " were provided."));
        }
    }

    public static /* synthetic */ afib k(afhf afhfVar, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = afbe.a;
        }
        return h(afhfVar, list, z & ((i & 2) == 0), afbe.a);
    }

    private static final Type l(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(woy.bp(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m((afid) it.next()));
            }
            return new afii(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(woy.bp(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m((afid) it2.next()));
            }
            return new afii(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeL = l(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(woy.bp(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m((afid) it3.next()));
        }
        return new afii(cls, typeL, arrayList3);
    }

    private static final Type m(afid afidVar) {
        afie afieVar = afidVar.b;
        if (afieVar == null) {
            return afil.a;
        }
        afib afibVar = afidVar.c;
        afibVar.getClass();
        int iOrdinal = afieVar.ordinal();
        if (iOrdinal == 0) {
            return b(afibVar, true);
        }
        if (iOrdinal == 1) {
            return new afil(null, b(afibVar, true));
        }
        if (iOrdinal == 2) {
            return new afil(b(afibVar, true), null);
        }
        throw new aezs();
    }
}
