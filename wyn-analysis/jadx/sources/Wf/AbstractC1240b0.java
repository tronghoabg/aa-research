package Wf;

import A7.AbstractC0279p0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Wf.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1240b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor[] f15576a = new SerialDescriptor[0];

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f15577b = new KSerializer[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15578c = new Object();

    public static final F a(String str, KSerializer kSerializer) {
        return new F(str, new G(kSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC1253k) {
            return ((InterfaceC1253k) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.d());
        int iD = serialDescriptor.d();
        for (int i5 = 0; i5 < iD; i5++) {
            hashSet.add(serialDescriptor.e(i5));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f15576a : serialDescriptorArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer d(kotlin.reflect.KClass r16, kotlinx.serialization.KSerializer... r17) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wf.AbstractC1240b0.d(kotlin.reflect.KClass, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static final Sf.a e(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        AbstractC3340k.e(values, "values");
        C1266y c1266y = new C1266y(str, values.length);
        int length = values.length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            Enum r52 = values[i5];
            int i11 = i10 + 1;
            String strName = (String) ff.m.x0(i10, strArr);
            if (strName == null) {
                strName = r52.name();
            }
            c1266y.j(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) ff.m.x0(i10, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    AbstractC3340k.e(annotation, "annotation");
                    int i12 = c1266y.f15588d;
                    List[] listArr = c1266y.f15590f;
                    List arrayList = listArr[i12];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[c1266y.f15588d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i5++;
            i10 = i11;
        }
        Sf.a aVar = new Sf.a(str, values);
        aVar.f11116c = c1266y;
        return aVar;
    }

    public static final int f(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        AbstractC3340k.e(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.h().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iD = serialDescriptor.d();
        int i5 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i10 = iD - 1;
            int i11 = i5 * 31;
            String strH = serialDescriptor.g(serialDescriptor.d() - iD).h();
            if (strH != null) {
                iHashCode2 = strH.hashCode();
            }
            i5 = i11 + iHashCode2;
            iD = i10;
        }
        int iD2 = serialDescriptor.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i5) * 31) + iHashCode3;
            }
            int i12 = iD2 - 1;
            int i13 = iHashCode3 * 31;
            S3.f kind = serialDescriptor.g(serialDescriptor.d() - iD2).getKind();
            iHashCode3 = i13 + (kind != null ? kind.hashCode() : 0);
            iD2 = i12;
        }
    }

    public static final KSerializer g(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i5 = 0; i5 < length; i5++) {
                    clsArr2[i5] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                throw e7;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e7.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean h(KClass kClass) {
        AbstractC3340k.e(kClass, "<this>");
        return Fe.b.y(kClass).isInterface();
    }

    public static final KClass i(KType kType) {
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static final void j(KClass kClass) {
        AbstractC3340k.e(kClass, "<this>");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        throw new Sf.f(AbstractC0279p0.l("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void k(int i5, int i10, SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i5) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(descriptor.e(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.h();
        AbstractC3340k.e(serialName, "serialName");
        throw new Sf.b(arrayList, arrayList.size() == 1 ? AbstractC3256n.h(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    public static final void l(String str, KClass baseClass) {
        String string;
        AbstractC3340k.e(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            string = AbstractC3256n.f('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbR = AbstractC0279p0.r("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC3256n.p(sbR, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbR.append(baseClass.getSimpleName());
            sbR.append("' has to be sealed and '@Serializable'.");
            string = sbR.toString();
        }
        throw new Sf.f(string);
    }

    public static final String m(SerialDescriptor serialDescriptor) {
        return ff.o.w0(android.support.v4.media.session.b.u0(0, serialDescriptor.d()), ", ", serialDescriptor.h() + '(', ")", new Af.r(serialDescriptor, 11), 24);
    }
}
