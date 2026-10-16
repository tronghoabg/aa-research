package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahhk implements defpackage.ahgg {
    private static final java.util.Map<defpackage.ahod, defpackage.ahha> HEADER_KINDS;
    private static boolean IGNORE_OLD_METADATA;
    private int[] metadataVersionArray = null;
    private java.lang.String extraString = null;
    private int extraInt = 0;
    private java.lang.String packageName = null;
    private java.lang.String[] data = null;
    private java.lang.String[] strings = null;
    private java.lang.String[] incompatibleData = null;
    private defpackage.ahha headerKind = null;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        try {
            IGNORE_OLD_METADATA = "true".equals(java.lang.System.getProperty("kotlin.ignore.old.metadata"));
        } catch (java.security.AccessControlException unused) {
            IGNORE_OLD_METADATA = false;
        }
        java.util.HashMap map = new java.util.HashMap();
        HEADER_KINDS = map;
        map.put(defpackage.ahod.topLevel(new defpackage.ahof("kotlin.jvm.internal.KotlinClass")), defpackage.ahha.CLASS);
        map.put(defpackage.ahod.topLevel(new defpackage.ahof("kotlin.jvm.internal.KotlinFileFacade")), defpackage.ahha.FILE_FACADE);
        map.put(defpackage.ahod.topLevel(new defpackage.ahof("kotlin.jvm.internal.KotlinMultifileClass")), defpackage.ahha.MULTIFILE_CLASS);
        map.put(defpackage.ahod.topLevel(new defpackage.ahof("kotlin.jvm.internal.KotlinMultifileClassPart")), defpackage.ahha.MULTIFILE_CLASS_PART);
        map.put(defpackage.ahod.topLevel(new defpackage.ahof("kotlin.jvm.internal.KotlinSyntheticClass")), defpackage.ahha.SYNTHETIC_CLASS);
    }

    private boolean shouldHaveData() {
        defpackage.ahha ahhaVar;
        return this.headerKind == defpackage.ahha.CLASS || (ahhaVar = this.headerKind) == defpackage.ahha.FILE_FACADE || ahhaVar == defpackage.ahha.MULTIFILE_CLASS_PART;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r11.data == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ahhb createHeader(defpackage.ahmc r12) {
        /*
            r11 = this;
            ahha r0 = r11.headerKind
            r1 = 0
            if (r0 == 0) goto L46
            int[] r0 = r11.metadataVersionArray
            if (r0 != 0) goto La
            goto L46
        La:
            ahmc r4 = new ahmc
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
            ahhb r2 = new ahhb
            ahha r3 = r11.headerKind
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhk.createHeader(ahmc):ahhb");
    }

    public defpackage.ahhb createHeaderWithDefaultMetadataVersion() {
        return createHeader(defpackage.ahmc.INSTANCE);
    }

    @Override // defpackage.ahgg
    public defpackage.ahge visitAnnotation(defpackage.ahod ahodVar, defpackage.agex agexVar) {
        defpackage.ahha ahhaVar;
        if (ahodVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agexVar == null) {
            $$$reportNull$$$0(1);
        }
        defpackage.ahhc ahhcVar = null;
        if (ahodVar.asSingleFqName().equals(defpackage.agui.METADATA_FQ_NAME)) {
            return new defpackage.ahhg(this);
        }
        if (IGNORE_OLD_METADATA || this.headerKind != null || (ahhaVar = HEADER_KINDS.get(ahodVar)) == null) {
            return null;
        }
        this.headerKind = ahhaVar;
        return new defpackage.ahhj(this);
    }

    @Override // defpackage.ahgg
    public void visitEnd() {
    }
}
