package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class afpl extends afpn {
    private final agdn descriptor;
    private final ahld nameResolver;
    private final ahis proto;
    private final ahly signature;
    private final String string;
    private final ahlh typeTable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpl(agdn agdnVar, ahis ahisVar, ahly ahlyVar, ahld ahldVar, ahlh ahlhVar) {
        String strConcat;
        super(null);
        agdnVar.getClass();
        ahisVar.getClass();
        ahlyVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        this.descriptor = agdnVar;
        this.proto = ahisVar;
        this.signature = ahlyVar;
        this.nameResolver = ahldVar;
        this.typeTable = ahlhVar;
        if (ahlyVar.hasGetter()) {
            strConcat = String.valueOf(ahldVar.getString(ahlyVar.getGetter().getName())).concat(String.valueOf(ahldVar.getString(ahlyVar.getGetter().getDesc())));
        } else {
            ahml jvmFieldSignature = ahmt.INSTANCE.getJvmFieldSignature(ahisVar, ahldVar, ahlhVar, false | (!((8 & 8) == 0)));
            if (jvmFieldSignature == null) {
                Objects.toString(agdnVar);
                throw new aftw("No field signature for property: ".concat(String.valueOf(agdnVar)));
            }
            String strComponent1 = jvmFieldSignature.component1();
            strConcat = agth.getterName(strComponent1) + getManglingSuffix() + "()" + jvmFieldSignature.component2();
        }
        this.string = strConcat;
    }

    private final String getManglingSuffix() {
        String string;
        agbi containingDeclaration = this.descriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        if (affa.f(this.descriptor.getVisibility(), agcb.INTERNAL) && (containingDeclaration instanceof aibt)) {
            ahhc classProto = ((aibt) containingDeclaration).getClassProto();
            ahop<ahhc, Integer> ahopVar = ahmh.classModuleName;
            ahopVar.getClass();
            Integer num = (Integer) ahlf.getExtensionOrNull(classProto, ahopVar);
            if (num == null || (string = this.nameResolver.getString(num.intValue())) == null) {
                string = "main";
            }
            return "$" + ahnl.sanitizeAsJavaIdentifier(string);
        }
        if (!affa.f(this.descriptor.getVisibility(), agcb.PRIVATE) || !(containingDeclaration instanceof agdc)) {
            return "";
        }
        agdn agdnVar = this.descriptor;
        agdnVar.getClass();
        aibv containerSource = ((aicu) agdnVar).getContainerSource();
        if (!(containerSource instanceof aher)) {
            return "";
        }
        aher aherVar = (aher) containerSource;
        if (aherVar.getFacadeClassName() == null) {
            return "";
        }
        return "$" + aherVar.getSimpleName().asString();
    }

    @Override // defpackage.afpn
    public String asString() {
        return this.string;
    }

    public final agdn getDescriptor() {
        return this.descriptor;
    }

    public final ahld getNameResolver() {
        return this.nameResolver;
    }

    public final ahis getProto() {
        return this.proto;
    }

    public final ahly getSignature() {
        return this.signature;
    }

    public final ahlh getTypeTable() {
        return this.typeTable;
    }
}
