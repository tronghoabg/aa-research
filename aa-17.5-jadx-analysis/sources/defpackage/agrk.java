package defpackage;

import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class agrk {
    public static final agrk INSTANCE = new agrk();

    private agrk() {
    }

    private final void checkMetadataVersionForRead(Metadata metadata, boolean z) {
        if (metadata.mv().length == 0) {
            throw new IllegalArgumentException("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
        }
        throwIfNotCompatible$org_jetbrains_kotlin_kotlin_metadata_jvm(new ahlc(metadata.mv(), (metadata.xi() & 8) != 0), z);
    }

    private final boolean isLessThan14(Metadata metadata) {
        return new agqo(metadata.mv()).compareTo(new agqo(1, 4, 0)) < 0;
    }

    public final agnq readKmClass$org_jetbrains_kotlin_kotlin_metadata_jvm(Metadata metadata) {
        metadata.getClass();
        aezu<ahmo, ahhc> classDataFrom = ahmt.readClassDataFrom(agrc.requireNotEmpty(metadata), metadata.d2());
        Object obj = classDataFrom.a;
        return agpo.toKmClass$default((ahhc) classDataFrom.b, (ahmo) obj, isLessThan14(metadata), null, 4, null);
    }

    public final agoh readKmLambda$org_jetbrains_kotlin_kotlin_metadata_jvm(Metadata metadata) {
        metadata.getClass();
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        aezu<ahmo, ahif> functionDataFrom = ahmt.readFunctionDataFrom(strArrD1, metadata.d2());
        return agpo.toKmLambda((ahif) functionDataFrom.b, (ahmo) functionDataFrom.a, isLessThan14(metadata));
    }

    public final agoi readKmPackage$org_jetbrains_kotlin_kotlin_metadata_jvm(Metadata metadata) {
        metadata.getClass();
        aezu<ahmo, ahim> packageDataFrom = ahmt.readPackageDataFrom(agrc.requireNotEmpty(metadata), metadata.d2());
        Object obj = packageDataFrom.a;
        return agpo.toKmPackage$default((ahim) packageDataFrom.b, (ahmo) obj, isLessThan14(metadata), null, 4, null);
    }

    public final agqx readMetadataImpl$org_jetbrains_kotlin_kotlin_metadata_jvm(Metadata metadata, boolean z) {
        metadata.getClass();
        checkMetadataVersionForRead(metadata, z);
        try {
            int iK = metadata.k();
            return iK != 1 ? iK != 2 ? iK != 3 ? iK != 4 ? iK != 5 ? new agqw(metadata, z) : new agqu(metadata, z) : new agqt(metadata, z) : new agqv(metadata, z) : new agqs(metadata, z) : new agqq(metadata, z);
        } catch (Throwable th) {
            if ((th instanceof IllegalArgumentException) || (th instanceof VirtualMachineError) || (th instanceof ThreadDeath)) {
                throw th;
            }
            throw new agmq("Exception occurred when reading Kotlin metadata", th);
        }
    }

    public final void throwIfNotCompatible$org_jetbrains_kotlin_kotlin_metadata_jvm(ahlc ahlcVar, boolean z) {
        String string;
        ahlcVar.getClass();
        boolean zIsAtLeast = ahlcVar.isAtLeast(1, 1, 0);
        if (z ? zIsAtLeast : ahlcVar.isCompatibleWithCurrentCompilerVersion()) {
            return;
        }
        if (zIsAtLeast) {
            StringBuilder sb = new StringBuilder("while maximum supported version is ");
            sb.append(ahlcVar.isStrictSemantics() ? ahlc.INSTANCE : ahlc.INSTANCE_NEXT);
            sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
            string = sb.toString();
        } else {
            string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
        }
        throw new IllegalArgumentException("Provided Metadata instance has version " + ahlcVar + ", " + string);
    }
}
