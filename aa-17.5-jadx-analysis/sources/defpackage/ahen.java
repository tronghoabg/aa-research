package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahen {
    public ahyv components;
    public static final ahem Companion = new ahem(null);
    private static final Set<ahga> KOTLIN_CLASS = woy.aO(ahga.CLASS);
    private static final Set<ahga> KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART = woy.di(new ahga[]{ahga.FILE_FACADE, ahga.MULTIFILE_CLASS_PART});
    private static final ahlc KOTLIN_1_1_EAP_METADATA_VERSION = new ahlc(1, 1, 2);
    private static final ahlc KOTLIN_1_3_M1_METADATA_VERSION = new ahlc(1, 1, 11);
    private static final ahlc KOTLIN_1_3_RC_METADATA_VERSION = new ahlc(1, 1, 13);

    private final aibu getAbiStability(ahfj ahfjVar) {
        return getComponents().getConfiguration().getAllowUnstableDependencies() ? aibu.STABLE : ahfjVar.getClassHeader().isUnstableJvmIrBinary() ? aibu.UNSTABLE : aibu.STABLE;
    }

    private final ahzk<ahlc> getIncompatibility(ahfj ahfjVar) {
        if (getSkipMetadataVersionCheck() || ahfjVar.getClassHeader().getMetadataVersion().isCompatible(getOwnMetadataVersion())) {
            return null;
        }
        return new ahzk<>(ahfjVar.getClassHeader().getMetadataVersion(), ahlc.INSTANCE, getOwnMetadataVersion(), getOwnMetadataVersion().lastSupportedVersionWithThisLanguageVersion(ahfjVar.getClassHeader().getMetadataVersion().isStrictSemantics()), ahfjVar.getLocation());
    }

    private final ahlc getOwnMetadataVersion() {
        return getComponents().getConfiguration().getMetadataVersion();
    }

    private final boolean getSkipMetadataVersionCheck() {
        return getComponents().getConfiguration().getSkipMetadataVersionCheck();
    }

    private final boolean isCompiledWith13M1(ahfj ahfjVar) {
        return !getComponents().getConfiguration().getSkipPrereleaseCheck() && ahfjVar.getClassHeader().isPreRelease() && affa.f(ahfjVar.getClassHeader().getMetadataVersion(), KOTLIN_1_3_M1_METADATA_VERSION);
    }

    private final boolean isPreReleaseInvisible(ahfj ahfjVar) {
        return (getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (ahfjVar.getClassHeader().isPreRelease() || affa.f(ahfjVar.getClassHeader().getMetadataVersion(), KOTLIN_1_1_EAP_METADATA_VERSION))) || isCompiledWith13M1(ahfjVar);
    }

    private final String[] readData(ahfj ahfjVar, Set<? extends ahga> set) {
        ahgb classHeader = ahfjVar.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null || !set.contains(classHeader.getKind())) {
            return null;
        }
        return data;
    }

    public final ahxe createKotlinPackagePartScope(agdc agdcVar, ahfj ahfjVar) {
        aezu<ahmo, ahim> packageDataFrom;
        agdcVar.getClass();
        ahfjVar.getClass();
        String[] data = readData(ahfjVar, KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART);
        if (data != null) {
            String[] strings = ahfjVar.getClassHeader().getStrings();
            try {
            } catch (Throwable th) {
                if (getSkipMetadataVersionCheck() || ahfjVar.getClassHeader().getMetadataVersion().isCompatible(getOwnMetadataVersion())) {
                    throw th;
                }
                packageDataFrom = null;
            }
            if (strings != null) {
                try {
                    packageDataFrom = ahmt.readPackageDataFrom(data, strings);
                    if (packageDataFrom != null) {
                        ahmo ahmoVar = (ahmo) packageDataFrom.a;
                        ahim ahimVar = (ahim) packageDataFrom.b;
                        aher aherVar = new aher(ahfjVar, ahimVar, ahmoVar, getIncompatibility(ahfjVar), isPreReleaseInvisible(ahfjVar), getAbiStability(ahfjVar));
                        return new aict(agdcVar, ahimVar, ahmoVar, ahfjVar.getClassHeader().getMetadataVersion(), aherVar, getComponents(), a.bt(agdcVar, aherVar, "scope for ", " in "), ahel.INSTANCE);
                    }
                } catch (ahou e) {
                    throw new IllegalStateException("Could not read data from " + ahfjVar.getLocation(), e);
                }
            }
        }
        return null;
    }

    public final ahyv getComponents() {
        ahyv ahyvVar = this.components;
        if (ahyvVar != null) {
            return ahyvVar;
        }
        affa.d("components");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ahym readClassData$org_jetbrains_kotlin_descriptors_jvm(ahfj ahfjVar) {
        String[] strings;
        aezu<ahmo, ahhc> classDataFrom;
        ahfjVar.getClass();
        String[] data = readData(ahfjVar, KOTLIN_CLASS);
        List list = null;
        Object[] objArr = 0;
        if (data != null && (strings = ahfjVar.getClassHeader().getStrings()) != null) {
            try {
                try {
                    classDataFrom = ahmt.readClassDataFrom(data, strings);
                } catch (ahou e) {
                    throw new IllegalStateException("Could not read data from " + ahfjVar.getLocation(), e);
                }
            } catch (Throwable th) {
                if (getSkipMetadataVersionCheck() || ahfjVar.getClassHeader().getMetadataVersion().isCompatible(getOwnMetadataVersion())) {
                    throw th;
                }
                classDataFrom = null;
            }
            if (classDataFrom != null) {
                return new ahym((ahmo) classDataFrom.a, (ahhc) classDataFrom.b, ahfjVar.getClassHeader().getMetadataVersion(), new ahfl(ahfjVar, getIncompatibility(ahfjVar), new aidc(isPreReleaseInvisible(ahfjVar), list, 2, objArr == true ? 1 : 0), getAbiStability(ahfjVar)));
            }
        }
        return null;
    }

    public final agba resolveClass(ahfj ahfjVar) {
        ahfjVar.getClass();
        ahym classData$org_jetbrains_kotlin_descriptors_jvm = readClassData$org_jetbrains_kotlin_descriptors_jvm(ahfjVar);
        if (classData$org_jetbrains_kotlin_descriptors_jvm == null) {
            return null;
        }
        return getComponents().getClassDeserializer().deserializeClass(ahfjVar.getClassId(), classData$org_jetbrains_kotlin_descriptors_jvm);
    }

    public final void setComponents(ahei aheiVar) {
        aheiVar.getClass();
        setComponents(aheiVar.getComponents());
    }

    public final void setComponents(ahyv ahyvVar) {
        ahyvVar.getClass();
        this.components = ahyvVar;
    }
}
