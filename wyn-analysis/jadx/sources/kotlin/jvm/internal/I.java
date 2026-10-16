package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* loaded from: classes5.dex */
public class I {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public KFunction function(AbstractC3337h abstractC3337h) {
        return abstractC3337h;
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new C3334e(cls);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new u(cls, str);
    }

    public KType mutableCollectionType(KType kType) {
        O o7 = (O) kType;
        KClassifier classifier = kType.getClassifier();
        List<KTypeProjection> arguments = kType.getArguments();
        o7.getClass();
        return new O(classifier, arguments, o7.f39752c | 2);
    }

    public KMutableProperty0 mutableProperty0(AbstractC3344o abstractC3344o) {
        return abstractC3344o;
    }

    public KMutableProperty1 mutableProperty1(q qVar) {
        return qVar;
    }

    public KProperty0 property0(v vVar) {
        return vVar;
    }

    public KProperty1 property1(x xVar) {
        return xVar;
    }

    public KProperty2 property2(z zVar) {
        return zVar;
    }

    public String renderLambdaToString(AbstractC3343n abstractC3343n) {
        return renderLambdaToString((InterfaceC3336g) abstractC3343n);
    }

    public void setUpperBounds(KTypeParameter kTypeParameter, List upperBounds) {
        M m10 = (M) kTypeParameter;
        m10.getClass();
        AbstractC3340k.e(upperBounds, "upperBounds");
        if (m10.f39748e == null) {
            m10.f39748e = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + m10 + "' have already been initialized.").toString());
    }

    public KType typeOf(KClassifier classifier, List arguments, boolean z2) {
        AbstractC3340k.e(classifier, "classifier");
        AbstractC3340k.e(arguments, "arguments");
        return new O(classifier, arguments, z2 ? 1 : 0);
    }

    public KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z2) {
        return new M((KClass) obj, kVariance);
    }

    public String renderLambdaToString(InterfaceC3336g interfaceC3336g) {
        String string = interfaceC3336g.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(KOTLIN_JVM_FUNCTIONS) ? string.substring(21) : string;
    }
}
