package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

/* loaded from: classes.dex */
public class afux extends affx {
    public static void clearCaches() {
        afjc.clearCaches();
        afud.clearModuleByClassLoaderCache();
    }

    private static afrj getOwner(afeq afeqVar) {
        afhg owner = afeqVar.getOwner();
        return owner instanceof afrj ? (afrj) owner : afmo.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$mutableProperty0$1(String str, afrj afrjVar, afff afffVar, String str2) throws NoSuchFieldException {
        aisj aisjVarD = afrj.LOCAL_PROPERTY_SIGNATURE.d(str);
        if (aisjVarD != null) {
            return afrjVar.createLocalProperty(Integer.parseInt((String) aisjVarD.a().get(1)), str);
        }
        if ((afrjVar instanceof afqw) && afrjVar.getJClass().getAnnotation(Metadata.class) == null) {
            Field fieldFindJavaField = afrjVar.findJavaField(afffVar.getName());
            if (Modifier.isStatic(fieldFindJavaField.getModifiers())) {
                return new afog(afrjVar, fieldFindJavaField, afffVar.getBoundReceiver(), afpq.EMPTY);
            }
        }
        if (!(afrjVar instanceof afrt)) {
            return new afkx(afrjVar, str2, str, afffVar.getBoundReceiver());
        }
        return new afsj(afrjVar, str, afffVar.getBoundReceiver(), afrjVar.findPropertyMetadata(str2, str), afpq.EMPTY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$mutableProperty1$3(afrj afrjVar, String str, String str2, affg affgVar) {
        if (!(afrjVar instanceof afrt)) {
            return new afla(afrjVar, str, str2, affgVar.getBoundReceiver());
        }
        return new afsm(afrjVar, str2, affgVar.getBoundReceiver(), afrjVar.findPropertyMetadata(str, str2), afpq.EMPTY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$property0$0(String str, afrj afrjVar, affl afflVar, String str2) {
        aisj aisjVarD = afrj.LOCAL_PROPERTY_SIGNATURE.d(str);
        if (aisjVarD != null) {
            return afrjVar.createLocalProperty(Integer.parseInt((String) aisjVarD.a().get(1)), str);
        }
        if ((afrjVar instanceof afqw) && afrjVar.getJClass().getAnnotation(Metadata.class) == null) {
            try {
                Field fieldFindJavaField = afrjVar.findJavaField(afflVar.getName());
                if (Modifier.isStatic(fieldFindJavaField.getModifiers())) {
                    return new afox(afrjVar, fieldFindJavaField, afflVar.getBoundReceiver(), afpq.EMPTY);
                }
            } catch (Exception unused) {
                if (str.equals("getEntries()Lkotlin/enums/EnumEntries;")) {
                    return new afnt((afqw) afrjVar);
                }
            }
        }
        if (!(afrjVar instanceof afrt)) {
            return new aflz(afrjVar, str2, str, afflVar.getBoundReceiver());
        }
        return new aftm(afrjVar, str, afflVar.getBoundReceiver(), afrjVar.findPropertyMetadata(str2, str), afpq.EMPTY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$property1$2(afrj afrjVar, String str, String str2, affm affmVar) {
        if (!(afrjVar instanceof afrt)) {
            return new afmd(afrjVar, str, str2, affmVar.getBoundReceiver());
        }
        return new aftq(afrjVar, str2, affmVar.getBoundReceiver(), afrjVar.findPropertyMetadata(str, str2), afpq.EMPTY);
    }

    @Override // defpackage.affx
    public afhe createKotlinClass(Class cls) {
        return new afqw(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affx
    public afhh function(afex afexVar) throws NoSuchMethodException, IOException, SecurityException {
        afrj owner = getOwner(afexVar);
        String name = afexVar.getName();
        String signature = afexVar.getSignature();
        if (!afvn.getUseK1Implementation()) {
            boolean z = false;
            if ((owner instanceof afqw) && owner.getJClass().getAnnotation(Metadata.class) == null && !afjs.isMappedBuiltin((afhe) owner)) {
                z = true;
            }
            if (name.equals("<init>")) {
                if (z) {
                    return new afny(owner, owner.findJavaConstructor(signature), afexVar.getBoundReceiver());
                }
                return new afsb(owner, signature, afexVar.getBoundReceiver(), owner.findConstructorMetadata(signature));
            }
            if (z) {
                Method methodFindJavaMethod = owner.findJavaMethod(name, signature);
                if (Modifier.isStatic(methodFindJavaMethod.getModifiers())) {
                    return new afok(owner, methodFindJavaMethod, afexVar.getBoundReceiver(), afpq.EMPTY);
                }
            } else if (owner instanceof afrt) {
                return new afst(owner, signature, afexVar.getBoundReceiver(), owner.findFunctionMetadata(name, signature), afpq.EMPTY);
            }
        }
        return new afku(owner, name, signature, afexVar.getBoundReceiver());
    }

    @Override // defpackage.affx
    public afhe getOrCreateKotlinClass(Class cls) {
        return afjc.getOrCreateKotlinClass(cls);
    }

    @Override // defpackage.affx
    public afhg getOrCreateKotlinPackage(Class cls, String str) {
        return afjc.getOrCreateKotlinPackage(cls);
    }

    @Override // defpackage.affx
    public afib mutableCollectionType(afib afibVar) {
        return airf.createMutableCollectionKType(afibVar);
    }

    @Override // defpackage.affx
    public afhk mutableProperty0(afff afffVar) {
        afrj owner = getOwner(afffVar);
        String name = afffVar.getName();
        String signature = afffVar.getSignature();
        return !afvn.getUseK1Implementation() ? new aftx(name, new afuu(signature, owner, afffVar, name)) : new afkx(owner, name, signature, afffVar.getBoundReceiver());
    }

    @Override // defpackage.affx
    public afhm mutableProperty1(affg affgVar) {
        afrj owner = getOwner(affgVar);
        String name = affgVar.getName();
        String signature = affgVar.getSignature();
        return !afvn.getUseK1Implementation() ? new afty(name, new afuw(owner, name, signature, affgVar)) : new afla(owner, name, signature, affgVar.getBoundReceiver());
    }

    @Override // defpackage.affx
    public afho mutableProperty2(affi affiVar) {
        return new afld(getOwner(affiVar), affiVar.getName(), affiVar.getSignature());
    }

    @Override // defpackage.affx
    public afib nothingType(afib afibVar) {
        return airf.createNothingType(afibVar);
    }

    @Override // defpackage.affx
    public afib platformType(afib afibVar, afib afibVar2) {
        return airf.createPlatformKType(afibVar, afibVar2, false);
    }

    @Override // defpackage.affx
    public afhv property0(affl afflVar) {
        afrj owner = getOwner(afflVar);
        String name = afflVar.getName();
        String signature = afflVar.getSignature();
        return !afvn.getUseK1Implementation() ? new aftz(name, new afut(signature, owner, afflVar, name)) : new aflz(owner, name, signature, afflVar.getBoundReceiver());
    }

    @Override // defpackage.affx
    public afhx property1(affm affmVar) {
        afrj owner = getOwner(affmVar);
        String name = affmVar.getName();
        String signature = affmVar.getSignature();
        return !afvn.getUseK1Implementation() ? new afua(name, new afuv(owner, name, signature, affmVar)) : new afmd(owner, name, signature, affmVar.getBoundReceiver());
    }

    @Override // defpackage.affx
    public afhz property2(affo affoVar) {
        return new afmh(getOwner(affoVar), affoVar.getName(), affoVar.getSignature());
    }

    @Override // defpackage.affx
    public String renderLambdaToString(afew afewVar) {
        afewVar.getClass();
        Metadata metadata = (Metadata) afewVar.getClass().getAnnotation(Metadata.class);
        afku afkuVar = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                aezu<ahmo, ahif> functionDataFrom = ahmt.readFunctionDataFrom(strArrD1, metadata.d2());
                ahmo ahmoVar = (ahmo) functionDataFrom.a;
                ahif ahifVar = (ahif) functionDataFrom.b;
                ahlc ahlcVar = new ahlc(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = afewVar.getClass();
                afit afitVar = afit.a;
                ahjy typeTable = ahifVar.getTypeTable();
                typeTable.getClass();
                afkuVar = new afku(afmo.INSTANCE, (agdv) afvu.deserializeToDescriptor(cls, afitVar, ahifVar, ahmoVar, new ahlh(typeTable), ahlcVar, afis.a), null, 4, null);
            }
        }
        return afkuVar != null ? afvf.INSTANCE.renderLambda(afkuVar) : super.renderLambdaToString(afewVar);
    }

    @Override // defpackage.affx
    public afib typeOf(afhf afhfVar, List<afid> list, boolean z) {
        return afhfVar instanceof afer ? afjc.getOrCreateKType(((afer) afhfVar).getJClass(), list, z) : afik.h(afhfVar, list, z, Collections.EMPTY_LIST);
    }

    @Override // defpackage.affx
    public afic typeParameter(Object obj, String str, afie afieVar, boolean z) {
        List<afic> typeParameters;
        if (obj instanceof afhe) {
            typeParameters = ((afhe) obj).getTypeParameters();
        } else {
            if (!(obj instanceof afhd)) {
                Objects.toString(obj);
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: ".concat(String.valueOf(obj)));
            }
            typeParameters = ((afhd) obj).getTypeParameters();
        }
        for (afic aficVar : typeParameters) {
            if (aficVar.getName().equals(str)) {
                return aficVar;
            }
        }
        throw new IllegalArgumentException(a.by(obj, str, "Type parameter ", " is not found in container: "));
    }

    @Override // defpackage.affx
    public afhe getOrCreateKotlinClass(Class cls, String str) {
        return afjc.getOrCreateKotlinClass(cls);
    }

    @Override // defpackage.affx
    public afhe createKotlinClass(Class cls, String str) {
        return new afqw(cls);
    }

    @Override // defpackage.affx
    public void setUpperBounds(afic aficVar, List<afib> list) {
    }

    @Override // defpackage.affx
    public String renderLambdaToString(affe affeVar) {
        return renderLambdaToString((afew) affeVar);
    }
}
