package defpackage;

/* loaded from: classes3.dex */
public final class ahji extends ahok implements ahph {
    private int bitField0_;
    private int typeId_;
    private ahjk projection_ = ahjk.INV;
    private ahjn type_ = ahjn.getDefaultInstance();

    private ahji() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahji create() {
        return new ahji();
    }

    @Override // defpackage.ahpf
    public ahjl build() {
        ahjl ahjlVarBuildPartial = buildPartial();
        if (ahjlVarBuildPartial.isInitialized()) {
            return ahjlVarBuildPartial;
        }
        throw newUninitializedMessageException(ahjlVarBuildPartial);
    }

    public ahjl buildPartial() {
        ahjl ahjlVar = new ahjl(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahjlVar.projection_ = this.projection_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahjlVar.type_ = this.type_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahjlVar.typeId_ = this.typeId_;
        ahjlVar.bitField0_ = i2;
        return ahjlVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahji mo86clone() {
        ahji ahjiVarCreate = create();
        ahjiVarCreate.mergeFrom(buildPartial());
        return ahjiVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahjl getDefaultInstanceForType() {
        return ahjl.getDefaultInstance();
    }

    public ahjn getType() {
        return this.type_;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return !hasType() || getType().isInitialized();
    }

    public ahji mergeFrom(ahjl ahjlVar) {
        if (ahjlVar == ahjl.getDefaultInstance()) {
            return this;
        }
        if (ahjlVar.hasProjection()) {
            setProjection(ahjlVar.getProjection());
        }
        if (ahjlVar.hasType()) {
            mergeType(ahjlVar.getType());
        }
        if (ahjlVar.hasTypeId()) {
            setTypeId(ahjlVar.getTypeId());
        }
        setUnknownFields(getUnknownFields().concat(ahjlVar.unknownFields));
        return this;
    }

    public ahji mergeType(ahjn ahjnVar) {
        if ((this.bitField0_ & 2) == 2 && this.type_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.type_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.type_ = ahjnVar;
        this.bitField0_ |= 2;
        return this;
    }

    public ahji setProjection(ahjk ahjkVar) {
        ahjkVar.getClass();
        this.bitField0_ |= 1;
        this.projection_ = ahjkVar;
        return this;
    }

    public ahji setType(ahjn ahjnVar) {
        ahjnVar.getClass();
        this.type_ = ahjnVar;
        this.bitField0_ |= 2;
        return this;
    }

    public ahji setTypeId(int i) {
        this.bitField0_ |= 4;
        this.typeId_ = i;
        return this;
    }

    private void maybeForceBuilderInitialization() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    @Override // defpackage.ahns, defpackage.ahpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ahji mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahjl> r0 = defpackage.ahjl.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahjl r2 = (defpackage.ahjl) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            if (r2 == 0) goto Ld
            r1.mergeFrom(r2)
        Ld:
            return r1
        Le:
            r2 = move-exception
            goto L1a
        L10:
            r2 = move-exception
            ahpg r3 = r2.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Le
            ahjl r3 = (defpackage.ahjl) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L20
            r1.mergeFrom(r3)
        L20:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.mergeFrom(ahoc, ahog):ahji");
    }

    @Override // defpackage.ahns, defpackage.ahpf
    public /* bridge */ /* synthetic */ ahns mergeFrom(ahoc ahocVar, ahog ahogVar) throws Throwable {
        mergeFrom(ahocVar, ahogVar);
        return this;
    }

    @Override // defpackage.ahns, defpackage.ahpf
    public /* bridge */ /* synthetic */ ahpf mergeFrom(ahoc ahocVar, ahog ahogVar) throws Throwable {
        mergeFrom(ahocVar, ahogVar);
        return this;
    }

    @Override // defpackage.ahok
    public /* bridge */ /* synthetic */ ahok mergeFrom(ahoq ahoqVar) {
        mergeFrom((ahjl) ahoqVar);
        return this;
    }
}
