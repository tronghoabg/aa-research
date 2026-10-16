package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class affx {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public static void a(Object obj, ArrayList arrayList) {
        Object[] objArr;
        int length;
        if (obj != null && (length = (objArr = (Object[]) obj).length) > 0) {
            arrayList.ensureCapacity(arrayList.size() + length);
            Collections.addAll(arrayList, objArr);
        }
    }

    public static Object b(aivh aivhVar, afck afckVar) {
        aivhVar.s(null);
        return aivhVar.n(afckVar);
    }

    public static aiuo c(aivh aivhVar, boolean z, aivk aivkVar) {
        return aivhVar instanceof aivo ? ((aivo) aivhVar).G(z, aivkVar) : aivhVar.q(aivkVar.c(), z, new nwy(aivkVar, 2, (char[]) null));
    }

    public static aivh d(afco afcoVar) {
        aivh aivhVar = (aivh) afcoVar.get(aivh.d);
        if (aivhVar != null) {
            return aivhVar;
        }
        Objects.toString(afcoVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(afcoVar)));
    }

    public static void e(afco afcoVar, CancellationException cancellationException) {
        aivh aivhVar = (aivh) afcoVar.get(aivh.d);
        if (aivhVar != null) {
            aivhVar.s(cancellationException);
        }
    }

    public static void f(afco afcoVar) {
        aivh aivhVar = (aivh) afcoVar.get(aivh.d);
        if (aivhVar != null) {
            g(aivhVar);
        }
    }

    public static void g(aivh aivhVar) {
        if (!aivhVar.t()) {
            throw aivhVar.o();
        }
    }

    public static boolean h(afco afcoVar) {
        aivh aivhVar = (aivh) afcoVar.get(aivh.d);
        if (aivhVar != null) {
            return aivhVar.t();
        }
        return true;
    }

    public static void i(aivh aivhVar, String str) {
        aivhVar.s(aije.a(str, null));
    }

    public static void j(aiuk aiukVar, afck afckVar, boolean z) {
        Object objN = aiukVar.n();
        Throwable thQ = aiukVar.q(objN);
        Object aezvVar = thQ != null ? new aezv(thQ) : aiukVar.m(objN);
        if (!z) {
            afckVar.w(aezvVar);
            return;
        }
        ajca ajcaVar = (ajca) afckVar;
        afck afckVar2 = ajcaVar.b;
        Object obj = ajcaVar.d;
        afco afcoVarHH = afckVar2.hH();
        Object objB = ajdb.b(afcoVarHH, obj);
        aiwp aiwpVarC = objB != ajdb.a ? aits.c(afckVar2, afcoVarHH, objB) : null;
        try {
            afckVar2.w(aezvVar);
            if (aiwpVarC == null || aiwpVarC.S()) {
                ajdb.c(afcoVarHH, objB);
            }
        } catch (Throwable th) {
            if (aiwpVarC == null || aiwpVarC.S()) {
                ajdb.c(afcoVarHH, objB);
            }
            throw th;
        }
    }

    public static boolean k(int i) {
        return i == 1 || i == 2;
    }

    public afhe createKotlinClass(Class cls) {
        return new afes(cls);
    }

    public afhe getOrCreateKotlinClass(Class cls) {
        return new afes(cls);
    }

    public afhg getOrCreateKotlinPackage(Class cls, String str) {
        return new affk(cls, str);
    }

    public afib mutableCollectionType(afib afibVar) {
        afgb afgbVar = (afgb) afibVar;
        return new afgb(afibVar.getClassifier(), afibVar.getArguments(), afgbVar.a, afgbVar.b | 2);
    }

    public afib nothingType(afib afibVar) {
        afgb afgbVar = (afgb) afibVar;
        return new afgb(afibVar.getClassifier(), afibVar.getArguments(), afgbVar.a, afgbVar.b | 4);
    }

    public afib platformType(afib afibVar, afib afibVar2) {
        return new afgb(afibVar.getClassifier(), afibVar.getArguments(), afibVar2, ((afgb) afibVar).b);
    }

    public String renderLambdaToString(afew afewVar) {
        String string = afewVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(KOTLIN_JVM_FUNCTIONS) ? string.substring(21) : string;
    }

    public void setUpperBounds(afic aficVar, List<afib> list) {
        afga afgaVar = (afga) aficVar;
        list.getClass();
        if (afgaVar.a != null) {
            throw new IllegalStateException(a.bm(afgaVar, "Upper bounds of type parameter '", "' have already been initialized."));
        }
        afgaVar.a = list;
    }

    public afib typeOf(afhf afhfVar, List<afid> list, boolean z) {
        afhfVar.getClass();
        list.getClass();
        return new afgb(afhfVar, list, null, z ? 1 : 0);
    }

    public afic typeParameter(Object obj, String str, afie afieVar, boolean z) {
        return new afga(obj, str, afieVar);
    }

    public afhe createKotlinClass(Class cls, String str) {
        return new afes(cls);
    }

    public afhe getOrCreateKotlinClass(Class cls, String str) {
        return new afes(cls);
    }

    public afhh function(afex afexVar) {
        return afexVar;
    }

    public afhk mutableProperty0(afff afffVar) {
        return afffVar;
    }

    public afhm mutableProperty1(affg affgVar) {
        return affgVar;
    }

    public afho mutableProperty2(affi affiVar) {
        return affiVar;
    }

    public afhv property0(affl afflVar) {
        return afflVar;
    }

    public afhx property1(affm affmVar) {
        return affmVar;
    }

    public afhz property2(affo affoVar) {
        return affoVar;
    }

    public String renderLambdaToString(affe affeVar) {
        return renderLambdaToString((afew) affeVar);
    }
}
