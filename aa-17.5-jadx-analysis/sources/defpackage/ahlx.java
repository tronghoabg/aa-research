package defpackage;

/* loaded from: classes3.dex */
public final class ahlx extends ahok implements ahph {
    private int bitField0_;
    private ahls field_ = ahls.getDefaultInstance();
    private ahlv syntheticMethod_ = ahlv.getDefaultInstance();
    private ahlv getter_ = ahlv.getDefaultInstance();
    private ahlv setter_ = ahlv.getDefaultInstance();
    private ahlv delegateMethod_ = ahlv.getDefaultInstance();

    private ahlx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahlx create() {
        return new ahlx();
    }

    @Override // defpackage.ahpf
    public ahly build() {
        ahly ahlyVarBuildPartial = buildPartial();
        if (ahlyVarBuildPartial.isInitialized()) {
            return ahlyVarBuildPartial;
        }
        throw newUninitializedMessageException(ahlyVarBuildPartial);
    }

    public ahly buildPartial() {
        ahly ahlyVar = new ahly(this);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahlyVar.field_ = this.field_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahlyVar.syntheticMethod_ = this.syntheticMethod_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahlyVar.getter_ = this.getter_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahlyVar.setter_ = this.setter_;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ahlyVar.delegateMethod_ = this.delegateMethod_;
        ahlyVar.bitField0_ = i2;
        return ahlyVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahlx mo86clone() {
        ahlx ahlxVarCreate = create();
        ahlxVarCreate.mergeFrom(buildPartial());
        return ahlxVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahly getDefaultInstanceForType() {
        return ahly.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return true;
    }

    public ahlx mergeDelegateMethod(ahlv ahlvVar) {
        if ((this.bitField0_ & 16) == 16 && this.delegateMethod_ != ahlv.getDefaultInstance()) {
            ahlu ahluVarNewBuilder = ahlv.newBuilder(this.delegateMethod_);
            ahluVarNewBuilder.mergeFrom(ahlvVar);
            ahlvVar = ahluVarNewBuilder.buildPartial();
        }
        this.delegateMethod_ = ahlvVar;
        this.bitField0_ |= 16;
        return this;
    }

    public ahlx mergeField(ahls ahlsVar) {
        if ((this.bitField0_ & 1) == 1 && this.field_ != ahls.getDefaultInstance()) {
            ahlr ahlrVarNewBuilder = ahls.newBuilder(this.field_);
            ahlrVarNewBuilder.mergeFrom(ahlsVar);
            ahlsVar = ahlrVarNewBuilder.buildPartial();
        }
        this.field_ = ahlsVar;
        this.bitField0_ |= 1;
        return this;
    }

    public ahlx mergeFrom(ahly ahlyVar) {
        if (ahlyVar == ahly.getDefaultInstance()) {
            return this;
        }
        if (ahlyVar.hasField()) {
            mergeField(ahlyVar.getField());
        }
        if (ahlyVar.hasSyntheticMethod()) {
            mergeSyntheticMethod(ahlyVar.getSyntheticMethod());
        }
        if (ahlyVar.hasGetter()) {
            mergeGetter(ahlyVar.getGetter());
        }
        if (ahlyVar.hasSetter()) {
            mergeSetter(ahlyVar.getSetter());
        }
        if (ahlyVar.hasDelegateMethod()) {
            mergeDelegateMethod(ahlyVar.getDelegateMethod());
        }
        setUnknownFields(getUnknownFields().concat(ahlyVar.unknownFields));
        return this;
    }

    public ahlx mergeGetter(ahlv ahlvVar) {
        if ((this.bitField0_ & 4) == 4 && this.getter_ != ahlv.getDefaultInstance()) {
            ahlu ahluVarNewBuilder = ahlv.newBuilder(this.getter_);
            ahluVarNewBuilder.mergeFrom(ahlvVar);
            ahlvVar = ahluVarNewBuilder.buildPartial();
        }
        this.getter_ = ahlvVar;
        this.bitField0_ |= 4;
        return this;
    }

    public ahlx mergeSetter(ahlv ahlvVar) {
        if ((this.bitField0_ & 8) == 8 && this.setter_ != ahlv.getDefaultInstance()) {
            ahlu ahluVarNewBuilder = ahlv.newBuilder(this.setter_);
            ahluVarNewBuilder.mergeFrom(ahlvVar);
            ahlvVar = ahluVarNewBuilder.buildPartial();
        }
        this.setter_ = ahlvVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahlx mergeSyntheticMethod(ahlv ahlvVar) {
        if ((this.bitField0_ & 2) == 2 && this.syntheticMethod_ != ahlv.getDefaultInstance()) {
            ahlu ahluVarNewBuilder = ahlv.newBuilder(this.syntheticMethod_);
            ahluVarNewBuilder.mergeFrom(ahlvVar);
            ahlvVar = ahluVarNewBuilder.buildPartial();
        }
        this.syntheticMethod_ = ahlvVar;
        this.bitField0_ |= 2;
        return this;
    }

    public ahlx setDelegateMethod(ahlv ahlvVar) {
        ahlvVar.getClass();
        this.delegateMethod_ = ahlvVar;
        this.bitField0_ |= 16;
        return this;
    }

    public ahlx setField(ahls ahlsVar) {
        ahlsVar.getClass();
        this.field_ = ahlsVar;
        this.bitField0_ |= 1;
        return this;
    }

    public ahlx setGetter(ahlv ahlvVar) {
        ahlvVar.getClass();
        this.getter_ = ahlvVar;
        this.bitField0_ |= 4;
        return this;
    }

    public ahlx setSetter(ahlv ahlvVar) {
        ahlvVar.getClass();
        this.setter_ = ahlvVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahlx setSyntheticMethod(ahlv ahlvVar) {
        ahlvVar.getClass();
        this.syntheticMethod_ = ahlvVar;
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
    public defpackage.ahlx mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahly> r0 = defpackage.ahly.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahly r2 = (defpackage.ahly) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahly r3 = (defpackage.ahly) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahlx.mergeFrom(ahoc, ahog):ahlx");
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
        mergeFrom((ahly) ahoqVar);
        return this;
    }
}
