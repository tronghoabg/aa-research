package defpackage;

/* loaded from: classes3.dex */
public final class ahgp extends ahok implements ahph {
    private int bitField0_;
    private int nameId_;
    private ahgu value_ = ahgu.getDefaultInstance();

    private ahgp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahgp create() {
        return new ahgp();
    }

    @Override // defpackage.ahpf
    public ahgv build() {
        ahgv ahgvVarBuildPartial = buildPartial();
        if (ahgvVarBuildPartial.isInitialized()) {
            return ahgvVarBuildPartial;
        }
        throw newUninitializedMessageException(ahgvVarBuildPartial);
    }

    public ahgv buildPartial() {
        ahgv ahgvVar = new ahgv(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahgvVar.nameId_ = this.nameId_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahgvVar.value_ = this.value_;
        ahgvVar.bitField0_ = i2;
        return ahgvVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahgp mo86clone() {
        ahgp ahgpVarCreate = create();
        ahgpVarCreate.mergeFrom(buildPartial());
        return ahgpVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahgv getDefaultInstanceForType() {
        return ahgv.getDefaultInstance();
    }

    public ahgu getValue() {
        return this.value_;
    }

    public boolean hasNameId() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return hasNameId() && hasValue() && getValue().isInitialized();
    }

    public ahgp mergeFrom(ahgv ahgvVar) {
        if (ahgvVar == ahgv.getDefaultInstance()) {
            return this;
        }
        if (ahgvVar.hasNameId()) {
            setNameId(ahgvVar.getNameId());
        }
        if (ahgvVar.hasValue()) {
            mergeValue(ahgvVar.getValue());
        }
        setUnknownFields(getUnknownFields().concat(ahgvVar.unknownFields));
        return this;
    }

    public ahgp mergeValue(ahgu ahguVar) {
        if ((this.bitField0_ & 2) == 2 && this.value_ != ahgu.getDefaultInstance()) {
            ahgr ahgrVarNewBuilder = ahgu.newBuilder(this.value_);
            ahgrVarNewBuilder.mergeFrom(ahguVar);
            ahguVar = ahgrVarNewBuilder.buildPartial();
        }
        this.value_ = ahguVar;
        this.bitField0_ |= 2;
        return this;
    }

    public ahgp setNameId(int i) {
        this.bitField0_ |= 1;
        this.nameId_ = i;
        return this;
    }

    public ahgp setValue(ahgu ahguVar) {
        ahguVar.getClass();
        this.value_ = ahguVar;
        this.bitField0_ |= 2;
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
    public defpackage.ahgp mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahgv> r0 = defpackage.ahgv.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahgv r2 = (defpackage.ahgv) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahgv r3 = (defpackage.ahgv) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgp.mergeFrom(ahoc, ahog):ahgp");
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
        mergeFrom((ahgv) ahoqVar);
        return this;
    }
}
