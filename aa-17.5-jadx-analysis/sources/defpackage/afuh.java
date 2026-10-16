package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afuh {
    public static final <R> R callAnnotationConstructor(afue<? extends R> afueVar, Map<afhr, ? extends Object> map) throws afim, NegativeArraySizeException {
        Object objDefaultEmptyArray;
        afueVar.getClass();
        map.getClass();
        List<afhr> parameters = afueVar.getParameters();
        ArrayList arrayList = new ArrayList(woy.bp(parameters, 10));
        for (afhr afhrVar : parameters) {
            if (map.containsKey(afhrVar)) {
                objDefaultEmptyArray = map.get(afhrVar);
                if (objDefaultEmptyArray == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + afhrVar + ')');
                }
            } else if (afhrVar.isOptional()) {
                objDefaultEmptyArray = null;
            } else {
                if (!afhrVar.isVararg()) {
                    Objects.toString(afhrVar);
                    throw new IllegalArgumentException("No argument provided for a required parameter: ".concat(String.valueOf(afhrVar)));
                }
                objDefaultEmptyArray = defaultEmptyArray(afhrVar.getType());
            }
            arrayList.add(objDefaultEmptyArray);
        }
        afwf<?> callerWithDefaults = afueVar.getCallerWithDefaults();
        if (callerWithDefaults == null) {
            Objects.toString(afueVar);
            throw new aftw("This callable does not support a default call: ".concat(afueVar.toString()));
        }
        try {
            return (R) callerWithDefaults.call(arrayList.toArray(new Object[0]));
        } catch (IllegalAccessException e) {
            throw new afim(e);
        }
    }

    public static final <R> R callDefaultMethod(afue<? extends R> afueVar, Map<afhr, ? extends Object> map, afck afckVar) throws afim {
        afueVar.getClass();
        map.getClass();
        List<afhr> parameters = afueVar.getParameters();
        boolean z = false;
        if (parameters.isEmpty()) {
            try {
                return (R) afueVar.getCaller().call(afueVar.isSuspend() ? new afck[]{afckVar} : new afck[0]);
            } catch (IllegalAccessException e) {
                throw new afim(e);
            }
        }
        int size = parameters.size() + (afueVar.isSuspend() ? 1 : 0);
        Object[] absentArguments = afueVar.getAbsentArguments();
        if (afueVar.isSuspend()) {
            absentArguments[parameters.size()] = afckVar;
        }
        int i = 0;
        for (afhr afhrVar : parameters) {
            if (map.containsKey(afhrVar)) {
                absentArguments[afhrVar.getIndex()] = map.get(afhrVar);
            } else if (afhrVar.isOptional()) {
                int i2 = (i / 32) + size;
                Object obj = absentArguments[i2];
                obj.getClass();
                absentArguments[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!afhrVar.isVararg()) {
                Objects.toString(afhrVar);
                throw new IllegalArgumentException("No argument provided for a required parameter: ".concat(String.valueOf(afhrVar)));
            }
            if (afhrVar.getKind() == afhq.d || afhrVar.getKind() == afhq.b) {
                i++;
            }
        }
        if (!z) {
            try {
                afwf<?> caller = afueVar.getCaller();
                Object[] objArrCopyOf = Arrays.copyOf(absentArguments, size);
                objArrCopyOf.getClass();
                return (R) caller.call(objArrCopyOf);
            } catch (IllegalAccessException e2) {
                throw new afim(e2);
            }
        }
        afwf<?> callerWithDefaults = afueVar.getCallerWithDefaults();
        if (callerWithDefaults == null) {
            Objects.toString(afueVar);
            throw new aftw("This callable does not support a default call: ".concat(afueVar.toString()));
        }
        try {
            return (R) callerWithDefaults.call(absentArguments);
        } catch (IllegalAccessException e3) {
            throw new afim(e3);
        }
    }

    private static final Object coerceToExpectedReceiverType(Object obj, afue<?> afueVar) {
        Class<?> inlineClass;
        if ((afueVar instanceof afun) && afxm.isUnderlyingPropertyOfValueClass((afun) afueVar)) {
            return obj;
        }
        Iterator<T> it = afueVar.getAllParameters().iterator();
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((afhr) next).getKind() != afhq.d) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            }
        }
        obj2 = null;
        afhr afhrVar = (afhr) obj2;
        afib type = afhrVar != null ? afhrVar.getType() : null;
        return (type == null || (inlineClass = afxm.toInlineClass(type)) == null) ? obj : afxm.getInlineClassUnboxMethod(inlineClass, afueVar).invoke(obj, null);
    }

    public static final Object[] computeAbsentArguments(afue<?> afueVar) {
        int i;
        afueVar.getClass();
        List<afhr> parameters = afueVar.getParameters();
        int size = parameters.size() + (afueVar.isSuspend() ? 1 : 0);
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (afhr afhrVar : parameters) {
                if (afhrVar.getKind() == afhq.d || afhrVar.getKind() == afhq.b) {
                    i++;
                    if (i < 0) {
                        woy.bn();
                    }
                }
            }
        }
        int i2 = (i + 31) / 32;
        Object[] objArr = new Object[size + i2 + 1];
        for (afhr afhrVar2 : parameters) {
            if (afhrVar2.isOptional() && !afvu.isInlineClassType(afhrVar2.getType())) {
                int index = afhrVar2.getIndex();
                afib type = afhrVar2.getType();
                type.getClass();
                objArr[index] = afvu.defaultPrimitiveValue(afik.c(type));
            } else if (afhrVar2.isVararg()) {
                objArr[afhrVar2.getIndex()] = defaultEmptyArray(afhrVar2.getType());
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[size + i3] = 0;
        }
        return objArr;
    }

    private static final Object defaultEmptyArray(afib afibVar) throws NegativeArraySizeException {
        Class clsH = affa.h(afir.f(afibVar));
        if (clsH.isArray()) {
            Object objNewInstance = Array.newInstance(clsH.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new aftw("Cannot instantiate the default empty array of type " + clsH.getSimpleName() + ", because it is not an array type");
    }

    public static final Object getBoundReceiver(afue<?> afueVar) {
        afueVar.getClass();
        return coerceToExpectedReceiverType(afueVar.getRawBoundReceiver(), afueVar);
    }

    public static final boolean isAnnotationConstructor(afue<?> afueVar) {
        afueVar.getClass();
        return isConstructor(afueVar) && afueVar.getContainer().getJClass().isAnnotation();
    }

    public static final boolean isBound(afue<?> afueVar) {
        afueVar.getClass();
        return afueVar.getRawBoundReceiver() != afeq.NO_RECEIVER;
    }

    public static final boolean isConstructor(afue<?> afueVar) {
        afueVar.getClass();
        return affa.f(afueVar.getName(), "<init>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> afue<R> unbindAllReceivers(afue<? extends R> afueVar) {
        afueVar.getClass();
        return !isBound(afueVar) ? afueVar : afueVar.shallowCopy(afueVar.getContainer(), afueVar.getOverriddenStorage());
    }
}
