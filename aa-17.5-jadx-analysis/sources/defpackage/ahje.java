package defpackage;

/* loaded from: classes3.dex */
public final class ahje extends ahok implements ahph {
    private int bitField0_;
    private ahpb string_ = ahpa.EMPTY;

    private ahje() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahje create() {
        return new ahje();
    }

    private void ensureStringIsMutable() {
        if ((this.bitField0_ & 1) != 1) {
            this.string_ = new ahpa(this.string_);
            this.bitField0_ |= 1;
        }
    }

    @Override // defpackage.ahpf
    public ahjf build() {
        ahjf ahjfVarBuildPartial = buildPartial();
        if (ahjfVarBuildPartial.isInitialized()) {
            return ahjfVarBuildPartial;
        }
        throw newUninitializedMessageException(ahjfVarBuildPartial);
    }

    public ahjf buildPartial() {
        ahjf ahjfVar = new ahjf(this, (ahgm) null);
        if ((this.bitField0_ & 1) == 1) {
            this.string_ = this.string_.getUnmodifiableView();
            this.bitField0_ &= -2;
        }
        ahjfVar.string_ = this.string_;
        return ahjfVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahje mo86clone() {
        ahje ahjeVarCreate = create();
        ahjeVarCreate.mergeFrom(buildPartial());
        return ahjeVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahjf getDefaultInstanceForType() {
        return ahjf.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return true;
    }

    public ahje mergeFrom(ahjf ahjfVar) {
        if (ahjfVar == ahjf.getDefaultInstance()) {
            return this;
        }
        if (!ahjfVar.string_.isEmpty()) {
            if (this.string_.isEmpty()) {
                this.string_ = ahjfVar.string_;
                this.bitField0_ &= -2;
            } else {
                ensureStringIsMutable();
                this.string_.addAll(ahjfVar.string_);
            }
        }
        setUnknownFields(getUnknownFields().concat(ahjfVar.unknownFields));
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
    public defpackage.ahje mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahjf> r0 = defpackage.ahjf.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahjf r2 = (defpackage.ahjf) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahjf r3 = (defpackage.ahjf) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahje.mergeFrom(ahoc, ahog):ahje");
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
        mergeFrom((ahjf) ahoqVar);
        return this;
    }
}
