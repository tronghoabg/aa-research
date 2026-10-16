package defpackage;

/* loaded from: classes3.dex */
public final class ahkd extends ahok implements ahph {
    private int bitField0_;
    private int errorCode_;
    private int message_;
    private int versionFull_;
    private int version_;
    private ahkf level_ = ahkf.ERROR;
    private ahkh versionKind_ = ahkh.LANGUAGE_VERSION;

    private ahkd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahkd create() {
        return new ahkd();
    }

    @Override // defpackage.ahpf
    public ahki build() {
        ahki ahkiVarBuildPartial = buildPartial();
        if (ahkiVarBuildPartial.isInitialized()) {
            return ahkiVarBuildPartial;
        }
        throw newUninitializedMessageException(ahkiVarBuildPartial);
    }

    public ahki buildPartial() {
        ahki ahkiVar = new ahki(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahkiVar.version_ = this.version_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahkiVar.versionFull_ = this.versionFull_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahkiVar.level_ = this.level_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahkiVar.errorCode_ = this.errorCode_;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ahkiVar.message_ = this.message_;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        ahkiVar.versionKind_ = this.versionKind_;
        ahkiVar.bitField0_ = i2;
        return ahkiVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahkd mo86clone() {
        ahkd ahkdVarCreate = create();
        ahkdVarCreate.mergeFrom(buildPartial());
        return ahkdVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahki getDefaultInstanceForType() {
        return ahki.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return true;
    }

    public ahkd mergeFrom(ahki ahkiVar) {
        if (ahkiVar == ahki.getDefaultInstance()) {
            return this;
        }
        if (ahkiVar.hasVersion()) {
            setVersion(ahkiVar.getVersion());
        }
        if (ahkiVar.hasVersionFull()) {
            setVersionFull(ahkiVar.getVersionFull());
        }
        if (ahkiVar.hasLevel()) {
            setLevel(ahkiVar.getLevel());
        }
        if (ahkiVar.hasErrorCode()) {
            setErrorCode(ahkiVar.getErrorCode());
        }
        if (ahkiVar.hasMessage()) {
            setMessage(ahkiVar.getMessage());
        }
        if (ahkiVar.hasVersionKind()) {
            setVersionKind(ahkiVar.getVersionKind());
        }
        setUnknownFields(getUnknownFields().concat(ahkiVar.unknownFields));
        return this;
    }

    public ahkd setErrorCode(int i) {
        this.bitField0_ |= 8;
        this.errorCode_ = i;
        return this;
    }

    public ahkd setLevel(ahkf ahkfVar) {
        ahkfVar.getClass();
        this.bitField0_ |= 4;
        this.level_ = ahkfVar;
        return this;
    }

    public ahkd setMessage(int i) {
        this.bitField0_ |= 16;
        this.message_ = i;
        return this;
    }

    public ahkd setVersion(int i) {
        this.bitField0_ |= 1;
        this.version_ = i;
        return this;
    }

    public ahkd setVersionFull(int i) {
        this.bitField0_ |= 2;
        this.versionFull_ = i;
        return this;
    }

    public ahkd setVersionKind(ahkh ahkhVar) {
        ahkhVar.getClass();
        this.bitField0_ |= 32;
        this.versionKind_ = ahkhVar;
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
    public defpackage.ahkd mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahki> r0 = defpackage.ahki.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahki r2 = (defpackage.ahki) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahki r3 = (defpackage.ahki) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkd.mergeFrom(ahoc, ahog):ahkd");
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
        mergeFrom((ahki) ahoqVar);
        return this;
    }
}
