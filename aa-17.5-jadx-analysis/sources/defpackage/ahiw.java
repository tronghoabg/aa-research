package defpackage;

/* loaded from: classes3.dex */
public final class ahiw extends ahok implements ahph {
    private int bitField0_;
    private int shortName_;
    private int parentQualifiedName_ = -1;
    private ahiy kind_ = ahiy.PACKAGE;

    private ahiw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahiw create() {
        return new ahiw();
    }

    @Override // defpackage.ahpf
    public ahiz build() {
        ahiz ahizVarBuildPartial = buildPartial();
        if (ahizVarBuildPartial.isInitialized()) {
            return ahizVarBuildPartial;
        }
        throw newUninitializedMessageException(ahizVarBuildPartial);
    }

    public ahiz buildPartial() {
        ahiz ahizVar = new ahiz(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahizVar.parentQualifiedName_ = this.parentQualifiedName_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahizVar.shortName_ = this.shortName_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahizVar.kind_ = this.kind_;
        ahizVar.bitField0_ = i2;
        return ahizVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahiw mo86clone() {
        ahiw ahiwVarCreate = create();
        ahiwVarCreate.mergeFrom(buildPartial());
        return ahiwVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahiz getDefaultInstanceForType() {
        return ahiz.getDefaultInstance();
    }

    public boolean hasShortName() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return hasShortName();
    }

    public ahiw mergeFrom(ahiz ahizVar) {
        if (ahizVar == ahiz.getDefaultInstance()) {
            return this;
        }
        if (ahizVar.hasParentQualifiedName()) {
            setParentQualifiedName(ahizVar.getParentQualifiedName());
        }
        if (ahizVar.hasShortName()) {
            setShortName(ahizVar.getShortName());
        }
        if (ahizVar.hasKind()) {
            setKind(ahizVar.getKind());
        }
        setUnknownFields(getUnknownFields().concat(ahizVar.unknownFields));
        return this;
    }

    public ahiw setKind(ahiy ahiyVar) {
        ahiyVar.getClass();
        this.bitField0_ |= 4;
        this.kind_ = ahiyVar;
        return this;
    }

    public ahiw setParentQualifiedName(int i) {
        this.bitField0_ |= 1;
        this.parentQualifiedName_ = i;
        return this;
    }

    public ahiw setShortName(int i) {
        this.bitField0_ |= 2;
        this.shortName_ = i;
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
    public defpackage.ahiw mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahiz> r0 = defpackage.ahiz.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahiz r2 = (defpackage.ahiz) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahiz r3 = (defpackage.ahiz) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahiw.mergeFrom(ahoc, ahog):ahiw");
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
        mergeFrom((ahiz) ahoqVar);
        return this;
    }
}
