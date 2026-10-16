package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahfp {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(defpackage.ajnw r16, defpackage.ajnb r17, int r18, long r19) {
        /*
            r0 = r16
            int r1 = r17.c()
            long r2 = (long) r1
            r10 = r18
            long r6 = (long) r10
            r4 = 0
            defpackage.ahfd.g(r2, r4, r6)
            r1 = r6
            boolean r3 = r0.c
            if (r3 != 0) goto L76
            r3 = 0
            r6 = r3
        L17:
            ajmy r4 = r0.b
            r5 = r17
            r8 = r19
            long r11 = defpackage.ajog.b(r4, r5, r6, r8, r10)
            r8 = -1
            int r3 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r3 == 0) goto L28
            return r11
        L28:
            long r10 = r4.b
            long r12 = r10 - r1
            r14 = 1
            long r12 = r12 + r14
            int r3 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r3 < 0) goto L34
            return r8
        L34:
            int r3 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r3 >= 0) goto L3b
            r14 = r17
            goto L61
        L3b:
            long r10 = r10 - r19
            long r10 = r10 + r14
            long r10 = java.lang.Math.max(r14, r10)
            int r3 = (int) r10
            long r10 = r4.b
            long r10 = r10 - r6
            long r10 = r10 + r14
            long r10 = java.lang.Math.min(r1, r10)
            int r5 = (int) r10
            int r5 = r5 + (-1)
            if (r3 > r5) goto L75
        L50:
            long r10 = r4.b
            long r14 = (long) r5
            long r10 = r10 - r14
            r14 = r17
            boolean r10 = r4.I(r10, r14, r5)
            if (r10 != 0) goto L61
            if (r5 == r3) goto L75
            int r5 = r5 + (-1)
            goto L50
        L61:
            ajoc r3 = r0.a
            r10 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3.hU(r4, r10)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L6e
            return r8
        L6e:
            long r6 = java.lang.Math.max(r6, r12)
            r10 = r18
            goto L17
        L75:
            return r8
        L76:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfp.a(ajnw, ajnb, int, long):long");
    }

    private static final void appendErasedType(StringBuilder sb, aigl aiglVar) {
        sb.append(mapToJvmType(aiglVar));
    }

    public static final String b(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, aise.a);
    }

    public static final byte[] c(String str) {
        byte[] bytes = str.getBytes(aise.a);
        bytes.getClass();
        return bytes;
    }

    public static final String computeJvmDescriptor(agcj agcjVar, boolean z, boolean z2) {
        String strAsString;
        agcjVar.getClass();
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (agcjVar instanceof agbh) {
                strAsString = "<init>";
            } else {
                strAsString = agcjVar.getName().asString();
                strAsString.getClass();
            }
            sb.append(strAsString);
        }
        sb.append("(");
        agdq extensionReceiverParameter = agcjVar.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            aigl type = extensionReceiverParameter.getType();
            type.getClass();
            appendErasedType(sb, type);
        }
        Iterator<agel> it = agcjVar.getValueParameters().iterator();
        while (it.hasNext()) {
            aigl type2 = it.next().getType();
            type2.getClass();
            appendErasedType(sb, type2);
        }
        sb.append(")");
        if (z) {
            if (ahef.hasVoidReturnType(agcjVar)) {
                sb.append("V");
            } else {
                aigl returnType = agcjVar.getReturnType();
                returnType.getClass();
                appendErasedType(sb, returnType);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ String computeJvmDescriptor$default(agcj agcjVar, boolean z, boolean z2, int i, Object obj) {
        return computeJvmDescriptor(agcjVar, 1 == ((z ? 1 : 0) | (i & 1)), z2 | (!((i & 2) == 0)));
    }

    public static final String computeJvmSignature(agav agavVar) {
        agavVar.getClass();
        ahft ahftVar = ahft.INSTANCE;
        if (!ahst.isLocal(agavVar)) {
            agbi containingDeclaration = agavVar.getContainingDeclaration();
            agba agbaVar = containingDeclaration instanceof agba ? (agba) containingDeclaration : null;
            if (agbaVar != null && !agbaVar.getName().isSpecial()) {
                agav original = agavVar.getOriginal();
                agdv agdvVar = original instanceof agdv ? (agdv) original : null;
                if (agdvVar != null) {
                    return ahfo.signature(ahftVar, agbaVar, computeJvmDescriptor$default(agdvVar, false, false, 3, null));
                }
            }
        }
        return null;
    }

    public static final boolean forceSingleValueParameterBoxing(agav agavVar) {
        agcj overriddenBuiltinFunctionWithErasedValueParametersInJava;
        agavVar.getClass();
        if (!(agavVar instanceof agcj)) {
            return false;
        }
        agcj agcjVar = (agcj) agavVar;
        if (affa.f(agcjVar.getName().asString(), "remove") && agcjVar.getValueParameters().size() == 1 && !agtu.isFromJavaOrBuiltins((agax) agavVar)) {
            List<agel> valueParameters = agcjVar.getOriginal().getValueParameters();
            valueParameters.getClass();
            aigl type = ((agel) woy.bN(valueParameters)).getType();
            type.getClass();
            ahew ahewVarMapToJvmType = mapToJvmType(type);
            ahev ahevVar = ahewVarMapToJvmType instanceof ahev ? (ahev) ahewVarMapToJvmType : null;
            if ((ahevVar != null ? ahevVar.getJvmPrimitiveType() : null) != ahwe.INT || (overriddenBuiltinFunctionWithErasedValueParametersInJava = agsb.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(agcjVar)) == null) {
                return false;
            }
            List<agel> valueParameters2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getOriginal().getValueParameters();
            valueParameters2.getClass();
            aigl type2 = ((agel) woy.bN(valueParameters2)).getType();
            type2.getClass();
            ahew ahewVarMapToJvmType2 = mapToJvmType(type2);
            agbi containingDeclaration = overriddenBuiltinFunctionWithErasedValueParametersInJava.getContainingDeclaration();
            containingDeclaration.getClass();
            if (affa.f(ahvz.getFqNameUnsafe(containingDeclaration), afyn.mutableCollection.toUnsafe()) && (ahewVarMapToJvmType2 instanceof aheu) && affa.f(((aheu) ahewVarMapToJvmType2).getInternalName(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String getInternalName(agba agbaVar) {
        agbaVar.getClass();
        ahnd ahndVarMapKotlinToJava = afzq.INSTANCE.mapKotlinToJava(ahvz.getFqNameSafe(agbaVar).toUnsafe());
        if (ahndVarMapKotlinToJava == null) {
            return ahef.computeInternalName$default(agbaVar, null, 2, null);
        }
        String strInternalNameByClassId = ahwd.internalNameByClassId(ahndVarMapKotlinToJava);
        strInternalNameByClassId.getClass();
        return strInternalNameByClassId;
    }

    public static final ahew mapToJvmType(aigl aiglVar) {
        aiglVar.getClass();
        return (ahew) ahef.mapType$default(aiglVar, ahey.INSTANCE, ahfx.DEFAULT, ahfv.INSTANCE, null, null, 32, null);
    }
}
