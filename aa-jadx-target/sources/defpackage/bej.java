package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bej extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(aiwg aiwgVar, defpackage.jlj jljVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = aiwgVar;
        this.c = jljVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [asj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [cri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [cri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [dhy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [affg, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.bej((defpackage.cri) this.b, (defpackage.beq) this.c, afdkVar, 0);
            case 1:
                return new defpackage.bej(this.b, this.c, afdkVar, 1, null);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.bej((defpackage.bie) this.c, (defpackage.bil) this.b, afdkVar, 2);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.bej((aiwg) this.b, (defpackage.jlj) this.c, afdkVar, 3);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.bej((defpackage.bin) this.c, (defpackage.affg) this.b, afdkVar, 4);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.bej((defpackage.asj) this.c, (androidx.compose.runtime.snapshots.SnapshotStateList) this.b, afdkVar, 5);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.bej((aizj) this.b, (defpackage.bxj) this.c, afdkVar, 6);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.bej((defpackage.bxt) this.b, (android.view.View) this.c, afdkVar, 7);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.bej((defpackage.dhr) this.c, (defpackage.dhy) this.b, afdkVar, 8);
            default:
                return new defpackage.bej((j$.time.Duration) this.b, (defpackage.tcn) this.c, afdkVar, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0141 A[Catch: all -> 0x015a, TryCatch #1 {all -> 0x015a, blocks: (B:65:0x00fc, B:87:0x0152, B:82:0x0139, B:84:0x0141, B:66:0x0100, B:67:0x0104, B:80:0x0133, B:81:0x0138, B:75:0x011c, B:77:0x012a), top: B:140:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0152 A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #1 {all -> 0x015a, blocks: (B:65:0x00fc, B:87:0x0152, B:82:0x0139, B:84:0x0141, B:66:0x0100, B:67:0x0104, B:80:0x0133, B:81:0x0138, B:75:0x011c, B:77:0x012a), top: B:140:0x00f4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [cri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v26, types: [asj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [dhy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cri, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x014f -> B:87:0x0152). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bej.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 1:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            default:
                return ((defpackage.bej) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(aizj aizjVar, defpackage.bxj bxjVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = aizjVar;
        this.c = bxjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(defpackage.asj asjVar, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.c = asjVar;
        this.b = snapshotStateList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(defpackage.bie bieVar, defpackage.bil bilVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.c = bieVar;
        this.b = bilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(defpackage.bin binVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.c = binVar;
        this.b = affgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(defpackage.bxt bxtVar, android.view.View view, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = bxtVar;
        this.c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(defpackage.cri criVar, defpackage.beq beqVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = criVar;
        this.c = beqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(defpackage.cri criVar, defpackage.beq beqVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.d = i;
        this.b = criVar;
        this.c = beqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(defpackage.dhr dhrVar, defpackage.dhy dhyVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.c = dhrVar;
        this.b = dhyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(j$.time.Duration duration, defpackage.tcn tcnVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = duration;
        this.c = tcnVar;
    }
}
