package defpackage;

/* loaded from: classes3.dex */
public final class ahlu extends ahok implements ahph {
    private int bitField0_;
    private int desc_;
    private int name_;

    private ahlu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahlu create() {
        return new ahlu();
    }

    @Override // defpackage.ahpf
    public ahlv build() {
        ahlv ahlvVarBuildPartial = buildPartial();
        if (ahlvVarBuildPartial.isInitialized()) {
            return ahlvVarBuildPartial;
        }
        throw newUninitializedMessageException(ahlvVarBuildPartial);
    }

    public ahlv buildPartial() {
        ahlv ahlvVar = new ahlv(this);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahlvVar.name_ = this.name_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahlvVar.desc_ = this.desc_;
        ahlvVar.bitField0_ = i2;
        return ahlvVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahlu mo86clone() {
        ahlu ahluVarCreate = create();
        ahluVarCreate.mergeFrom(buildPartial());
        return ahluVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahlv getDefaultInstanceForType() {
        return ahlv.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return true;
    }

    public ahlu mergeFrom(ahlv ahlvVar) {
        if (ahlvVar == ahlv.getDefaultInstance()) {
            return this;
        }
        if (ahlvVar.hasName()) {
            setName(ahlvVar.getName());
        }
        if (ahlvVar.hasDesc()) {
            setDesc(ahlvVar.getDesc());
        }
        setUnknownFields(getUnknownFields().concat(ahlvVar.unknownFields));
        return this;
    }

    public ahlu setDesc(int i) {
        this.bitField0_ |= 2;
        this.desc_ = i;
        return this;
    }

    public ahlu setName(int i) {
        this.bitField0_ |= 1;
        this.name_ = i;
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
    public defpackage.ahlu mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahlv> r0 = defpackage.ahlv.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahlv r2 = (defpackage.ahlv) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahlv r3 = (defpackage.ahlv) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahlu.mergeFrom(ahoc, ahog):ahlu");
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
        mergeFrom((ahlv) ahoqVar);
        return this;
    }
}
