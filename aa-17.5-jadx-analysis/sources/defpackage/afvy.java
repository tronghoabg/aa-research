package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afvy implements afwf {
    private final afvw callMode;
    private final List<Object> defaultValues;
    private final List<Class<?>> erasedParameterTypes;
    private final Class<?> jClass;
    private final List<Method> methods;
    private final List<String> parameterNames;
    private final List<Type> parameterTypes;

    public afvy(Class<?> cls, List<String> list, afvw afvwVar, afvx afvxVar, List<Method> list2) {
        cls.getClass();
        list.getClass();
        afvwVar.getClass();
        afvxVar.getClass();
        list2.getClass();
        this.jClass = cls;
        this.parameterNames = list;
        this.callMode = afvwVar;
        this.methods = list2;
        ArrayList arrayList = new ArrayList(woy.bp(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        List<Method> list3 = this.methods;
        ArrayList arrayList2 = new ArrayList(woy.bp(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> wrapperByPrimitive = agkc.getWrapperByPrimitive(returnType);
            if (wrapperByPrimitive != null) {
                returnType = wrapperByPrimitive;
            }
            arrayList2.add(returnType);
        }
        this.erasedParameterTypes = arrayList2;
        List<Method> list4 = this.methods;
        ArrayList arrayList3 = new ArrayList(woy.bp(list4, 10));
        Iterator<T> it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == afvw.POSITIONAL_CALL && afvxVar == afvx.JAVA && !woy.bV(this.parameterNames, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            Object obj = objArr[i];
            int i3 = i2 + 1;
            Object objTransformKotlinToJvm = (obj == null && this.callMode == afvw.CALL_BY_NAME) ? this.defaultValues.get(i2) : afwd.transformKotlinToJvm(obj, this.erasedParameterTypes.get(i2));
            if (objTransformKotlinToJvm == null) {
                afwd.throwIllegalArgumentType(i2, this.parameterNames.get(i2), this.erasedParameterTypes.get(i2));
                throw new aezp();
            }
            arrayList.add(objTransformKotlinToJvm);
            i++;
            i2 = i3;
        }
        return afwd.createAnnotationInstance(this.jClass, woy.bc(woy.ci(this.parameterNames, arrayList)), this.methods);
    }

    @Override // defpackage.afwf
    public /* bridge */ void checkArguments(int i) {
        default$checkArguments(i);
    }

    public void default$checkArguments(int i) {
        if (afxf.getArity(this) != i) {
            throw new IllegalArgumentException(a.ck(this, i));
        }
    }

    public boolean default$isBoundInstanceCallWithValueClasses() {
        return false;
    }

    public Void getMember() {
        return null;
    }

    @Override // defpackage.afwf
    public List<Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // defpackage.afwf
    public Type getReturnType() {
        return this.jClass;
    }

    @Override // defpackage.afwf
    public /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return false;
    }

    @Override // defpackage.afwf
    /* renamed from: getMember */
    public /* bridge */ /* synthetic */ Member mo61getMember() {
        return null;
    }

    public /* bridge */ void checkArguments(Object[] objArr) {
        default$checkArguments(objArr);
    }

    public void default$checkArguments(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr.length);
    }

    public /* synthetic */ afvy(Class cls, List list, afvw afvwVar, afvx afvxVar, List list2, int i, afeu afeuVar) {
        if ((i & 16) != 0) {
            list2 = new ArrayList(woy.bp(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), null));
            }
        }
        this(cls, list, afvwVar, afvxVar, list2);
    }
}
