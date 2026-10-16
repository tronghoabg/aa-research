package defpackage;

/* loaded from: classes3.dex */
public final class ahlr extends ahok implements ahph {
    private int bitField0_;
    private int desc_;
    private int name_;

    private ahlr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahlr create() {
        return new ahlr();
    }

    @Override // defpackage.ahpf
    public ahls build() {
        ahls ahlsVarBuildPartial = buildPartial();
        if (ahlsVarBuildPartial.isInitialized()) {
            return ahlsVarBuildPartial;
        }
        throw newUninitializedMessageException(ahlsVarBuildPartial);
    }

    public ahls buildPartial() {
        ahls ahlsVar = new ahls(this);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahlsVar.name_ = this.name_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahlsVar.desc_ = this.desc_;
        ahlsVar.bitField0_ = i2;
        return ahlsVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahlr mo86clone() {
        ahlr ahlrVarCreate = create();
        ahlrVarCreate.mergeFrom(buildPartial());
        return ahlrVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahls getDefaultInstanceForType() {
        return ahls.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return true;
    }

    public ahlr mergeFrom(ahls ahlsVar) {
        if (ahlsVar == ahls.getDefaultInstance()) {
            return this;
        }
        if (ahlsVar.hasName()) {
            setName(ahlsVar.getName());
        }
        if (ahlsVar.hasDesc()) {
            setDesc(ahlsVar.getDesc());
        }
        setUnknownFields(getUnknownFields().concat(ahlsVar.unknownFields));
        return this;
    }

    public ahlr setDesc(int i) {
        this.bitField0_ |= 2;
        this.desc_ = i;
        return this;
    }

    public ahlr setName(int i) {
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
    public defpackage.ahlr mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahls> r0 = defpackage.ahls.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahls r2 = (defpackage.ahls) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahls r3 = (defpackage.ahls) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahlr.mergeFrom(ahoc, ahog):ahlr");
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
        mergeFrom((ahls) ahoqVar);
        return this;
    }
}
