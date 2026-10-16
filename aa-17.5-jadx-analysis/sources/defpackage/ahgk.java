package defpackage;

import java.security.AccessControlException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ahgk implements ahfg {
    private static final Map<ahnd, ahga> HEADER_KINDS;
    private static boolean IGNORE_OLD_METADATA;
    private int[] metadataVersionArray = null;
    private String extraString = null;
    private int extraInt = 0;
    private String packageName = null;
    private String[] data = null;
    private String[] strings = null;
    private String[] incompatibleData = null;
    private ahga headerKind = null;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        try {
            IGNORE_OLD_METADATA = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            IGNORE_OLD_METADATA = false;
        }
        HashMap map = new HashMap();
        HEADER_KINDS = map;
        map.put(ahnd.topLevel(new ahnf("kotlin.jvm.internal.KotlinClass")), ahga.CLASS);
        map.put(ahnd.topLevel(new ahnf("kotlin.jvm.internal.KotlinFileFacade")), ahga.FILE_FACADE);
        map.put(ahnd.topLevel(new ahnf("kotlin.jvm.internal.KotlinMultifileClass")), ahga.MULTIFILE_CLASS);
        map.put(ahnd.topLevel(new ahnf("kotlin.jvm.internal.KotlinMultifileClassPart")), ahga.MULTIFILE_CLASS_PART);
        map.put(ahnd.topLevel(new ahnf("kotlin.jvm.internal.KotlinSyntheticClass")), ahga.SYNTHETIC_CLASS);
    }

    private boolean shouldHaveData() {
        ahga ahgaVar;
        return this.headerKind == ahga.CLASS || (ahgaVar = this.headerKind) == ahga.FILE_FACADE || ahgaVar == ahga.MULTIFILE_CLASS_PART;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r11.data == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ahgb createHeader(defpackage.ahlc r12) {
        /*
            r11 = this;
            ahga r0 = r11.headerKind
            r1 = 0
            if (r0 == 0) goto L46
            int[] r0 = r11.metadataVersionArray
            if (r0 != 0) goto La
            goto L46
        La:
            ahlc r4 = new ahlc
            int[] r0 = r11.metadataVersionArray
            int r2 = r11.extraInt
            r2 = r2 & 8
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            r4.<init>(r0, r2)
            boolean r12 = r4.isCompatible(r12)
            if (r12 != 0) goto L27
            java.lang.String[] r12 = r11.data
            r11.incompatibleData = r12
            r11.data = r1
            goto L32
        L27:
            boolean r12 = r11.shouldHaveData()
            if (r12 == 0) goto L32
            java.lang.String[] r12 = r11.data
            if (r12 != 0) goto L32
            goto L46
        L32:
            ahgb r2 = new ahgb
            ahga r3 = r11.headerKind
            java.lang.String[] r5 = r11.data
            java.lang.String[] r6 = r11.incompatibleData
            java.lang.String[] r7 = r11.strings
            java.lang.String r8 = r11.extraString
            int r9 = r11.extraInt
            java.lang.String r10 = r11.packageName
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgk.createHeader(ahlc):ahgb");
    }

    public ahgb createHeaderWithDefaultMetadataVersion() {
        return createHeader(ahlc.INSTANCE);
    }

    @Override // defpackage.ahfg
    public ahfe visitAnnotation(ahnd ahndVar, agdx agdxVar) {
        ahga ahgaVar;
        if (ahndVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(1);
        }
        ahgc ahgcVar = null;
        if (ahndVar.asSingleFqName().equals(agti.METADATA_FQ_NAME)) {
            return new ahgg(this, ahgcVar);
        }
        if (IGNORE_OLD_METADATA || this.headerKind != null || (ahgaVar = HEADER_KINDS.get(ahndVar)) == null) {
            return null;
        }
        this.headerKind = ahgaVar;
        return new ahgj(this, ahgcVar);
    }

    @Override // defpackage.ahfg
    public void visitEnd() {
    }
}
