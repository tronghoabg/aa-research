package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahfy {
    public static final String a(int i) {
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final void b(ajna ajnaVar, int i, afeg afegVar) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            char cX = (char) ajnaVar.x();
            long j2 = j - 4;
            long jX = ajnaVar.x() & 65535;
            if (j2 < jX) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            ajnaVar.z(jX);
            ajmy ajmyVar = ((ajnw) ajnaVar).b;
            long j3 = ajmyVar.b;
            afegVar.invoke(Integer.valueOf(cX), Long.valueOf(jX));
            long j4 = (ajmyVar.b + jX) - j3;
            if (j4 < 0) {
                throw new IOException(a.bp(cX, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                ajmyVar.A(j4);
            }
            j = j2 - jX;
        }
    }

    public static final <T> T boxTypeIfNeeded(ahex<T> ahexVar, T t, boolean z) {
        ahexVar.getClass();
        t.getClass();
        return z ? ahexVar.boxType(t) : t;
    }

    public static final boolean c(ajnr ajnrVar) {
        int iA = ajoi.a(ajnrVar);
        return !afyh.e((iA != -1 ? ajnrVar.b.j(iA + 1, -1234567890) : (ajnrVar.c() == null || ajnrVar.b.c() != 2) ? ajnrVar.b : ajnb.a).i(), ".class", true);
    }

    public static final <T> T mapBuiltInType(aiiz aiizVar, ailw ailwVar, ahex<T> ahexVar, ahfx ahfxVar) {
        aiizVar.getClass();
        ailwVar.getClass();
        ahexVar.getClass();
        ahfxVar.getClass();
        aimd aimdVarTypeConstructor = aiizVar.typeConstructor(ailwVar);
        if (aiizVar.isClassTypeConstructor(aimdVarTypeConstructor)) {
            afyi primitiveType = aiizVar.getPrimitiveType(aimdVarTypeConstructor);
            if (primitiveType != null) {
                T tCreatePrimitiveType = ahexVar.createPrimitiveType(primitiveType);
                boolean z = true;
                if (!aiizVar.isNullableType(ailwVar) && !ahdd.hasEnhancedNullability(aiizVar, ailwVar)) {
                    z = false;
                }
                return (T) boxTypeIfNeeded(ahexVar, tCreatePrimitiveType, z);
            }
            afyi primitiveArrayType = aiizVar.getPrimitiveArrayType(aimdVarTypeConstructor);
            if (primitiveArrayType != null) {
                return ahexVar.createFromString("[" + ahwe.get(primitiveArrayType).getDesc());
            }
            if (aiizVar.isUnderKotlinPackage(aimdVarTypeConstructor)) {
                ahnh classFqNameUnsafe = aiizVar.getClassFqNameUnsafe(aimdVarTypeConstructor);
                ahnd ahndVarMapKotlinToJava = classFqNameUnsafe != null ? afzq.INSTANCE.mapKotlinToJava(classFqNameUnsafe) : null;
                if (ahndVarMapKotlinToJava != null) {
                    if (!ahfxVar.getKotlinCollectionsToJavaCollections()) {
                        List<afzp> mutabilityMappings = afzq.INSTANCE.getMutabilityMappings();
                        if (!(mutabilityMappings instanceof Collection) || !mutabilityMappings.isEmpty()) {
                            Iterator<T> it = mutabilityMappings.iterator();
                            while (it.hasNext()) {
                                if (affa.f(((afzp) it.next()).getJavaClass(), ahndVarMapKotlinToJava)) {
                                }
                            }
                        }
                    }
                    String strInternalNameByClassId = ahwd.internalNameByClassId(ahndVarMapKotlinToJava);
                    strInternalNameByClassId.getClass();
                    return ahexVar.createObjectType(strInternalNameByClassId);
                }
            }
        }
        return null;
    }
}
