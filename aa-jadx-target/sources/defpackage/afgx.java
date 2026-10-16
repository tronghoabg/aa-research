package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class afgx {
    private static final java.lang.String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public afgx() {
    }

    public static void a(java.lang.Object obj, java.util.ArrayList arrayList) {
        java.lang.Object[] objArr;
        int length;
        if (obj != null && (length = (objArr = (java.lang.Object[]) obj).length) > 0) {
            arrayList.ensureCapacity(arrayList.size() + length);
            java.util.Collections.addAll(arrayList, objArr);
        }
    }

    public static void b(aivj aivjVar, defpackage.afdk afdkVar, boolean z) {
        java.lang.Object objN = aivjVar.n();
        java.lang.Throwable thQ = aivjVar.q(objN);
        java.lang.Object afavVar = thQ != null ? new defpackage.afav(thQ) : aivjVar.m(objN);
        if (!z) {
            afdkVar.w(afavVar);
            return;
        }
        ajda ajdaVar = (ajda) afdkVar;
        defpackage.afdk afdkVar2 = ajdaVar.b;
        java.lang.Object obj = ajdaVar.d;
        defpackage.afdo afdoVarGT = afdkVar2.gT();
        java.lang.Object objB = ajeb.b(afdoVarGT, obj);
        aixo aixoVarC = objB != ajeb.a ? aius.c(afdkVar2, afdoVarGT, objB) : null;
        try {
            afdkVar2.w(afavVar);
            if (aixoVarC == null || aixoVarC.S()) {
            }
        } finally {
            if (aixoVarC == null || aixoVarC.S()) {
                ajeb.c(afdoVarGT, objB);
            }
        }
    }

    public static boolean c(int i) {
        return i == 1 || i == 2;
    }

    public defpackage.afie createKotlinClass(java.lang.Class cls) {
        return new affs(cls);
    }

    public defpackage.afie getOrCreateKotlinClass(java.lang.Class cls) {
        return new affs(cls);
    }

    public defpackage.afig getOrCreateKotlinPackage(java.lang.Class cls, java.lang.String str) {
        return new afgk(cls, str);
    }

    public afjb mutableCollectionType(afjb afjbVar) {
        afhb afhbVar = (afhb) afjbVar;
        return new afhb(afjbVar.getClassifier(), afjbVar.getArguments(), afhbVar.a, afhbVar.b | 2);
    }

    public afjb nothingType(afjb afjbVar) {
        afhb afhbVar = (afhb) afjbVar;
        return new afhb(afjbVar.getClassifier(), afjbVar.getArguments(), afhbVar.a, afhbVar.b | 4);
    }

    public afjb platformType(afjb afjbVar, afjb afjbVar2) {
        return new afhb(afjbVar.getClassifier(), afjbVar.getArguments(), afjbVar2, ((afhb) afjbVar).b);
    }

    public java.lang.String renderLambdaToString(defpackage.affw affwVar) {
        java.lang.String string = affwVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(KOTLIN_JVM_FUNCTIONS) ? string.substring(21) : string;
    }

    public void setUpperBounds(afjc afjcVar, java.util.List<afjb> list) {
        afha afhaVar = (afha) afjcVar;
        list.getClass();
        if (afhaVar.a != null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(afhaVar, "Upper bounds of type parameter '", "' have already been initialized."));
        }
        afhaVar.a = list;
    }

    public afjb typeOf(defpackage.afif afifVar, java.util.List<afjd> list, boolean z) {
        afifVar.getClass();
        list.getClass();
        return new afhb(afifVar, list, (afjb) null, z ? 1 : 0);
    }

    public afjc typeParameter(java.lang.Object obj, java.lang.String str, afje afjeVar, boolean z) {
        return new afha(obj, str, afjeVar);
    }

    public afgx(byte[] bArr) {
    }

    public defpackage.afie createKotlinClass(java.lang.Class cls, java.lang.String str) {
        return new affs(cls);
    }

    public defpackage.afie getOrCreateKotlinClass(java.lang.Class cls, java.lang.String str) {
        return new affs(cls);
    }

    public defpackage.afih function(defpackage.affx affxVar) {
        return affxVar;
    }

    public afik mutableProperty0(afgf afgfVar) {
        return afgfVar;
    }

    public defpackage.afim mutableProperty1(defpackage.afgg afggVar) {
        return afggVar;
    }

    public afio mutableProperty2(afgi afgiVar) {
        return afgiVar;
    }

    public defpackage.afiv property0(defpackage.afgl afglVar) {
        return afglVar;
    }

    public defpackage.afix property1(defpackage.afgm afgmVar) {
        return afgmVar;
    }

    public defpackage.afiz property2(defpackage.afgo afgoVar) {
        return afgoVar;
    }

    public java.lang.String renderLambdaToString(defpackage.afge afgeVar) {
        return renderLambdaToString((defpackage.affw) afgeVar);
    }
}
