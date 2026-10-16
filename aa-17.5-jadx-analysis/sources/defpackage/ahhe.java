package defpackage;

/* loaded from: classes3.dex */
public final class ahhe extends ahok implements ahph {
    private int bitField0_;
    private ahoa data_ = ahoa.EMPTY;
    private int pluginId_;

    private ahhe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahhe create() {
        return new ahhe();
    }

    @Override // defpackage.ahpf
    public ahhf build() {
        ahhf ahhfVarBuildPartial = buildPartial();
        if (ahhfVarBuildPartial.isInitialized()) {
            return ahhfVarBuildPartial;
        }
        throw newUninitializedMessageException(ahhfVarBuildPartial);
    }

    public ahhf buildPartial() {
        ahhf ahhfVar = new ahhf(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahhfVar.pluginId_ = this.pluginId_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahhfVar.data_ = this.data_;
        ahhfVar.bitField0_ = i2;
        return ahhfVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahhe mo86clone() {
        ahhe ahheVarCreate = create();
        ahheVarCreate.mergeFrom(buildPartial());
        return ahheVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahhf getDefaultInstanceForType() {
        return ahhf.getDefaultInstance();
    }

    public boolean hasData() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasPluginId() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return hasPluginId() && hasData();
    }

    public ahhe mergeFrom(ahhf ahhfVar) {
        if (ahhfVar == ahhf.getDefaultInstance()) {
            return this;
        }
        if (ahhfVar.hasPluginId()) {
            setPluginId(ahhfVar.getPluginId());
        }
        if (ahhfVar.hasData()) {
            setData(ahhfVar.getData());
        }
        setUnknownFields(getUnknownFields().concat(ahhfVar.unknownFields));
        return this;
    }

    public ahhe setData(ahoa ahoaVar) {
        ahoaVar.getClass();
        this.bitField0_ |= 2;
        this.data_ = ahoaVar;
        return this;
    }

    public ahhe setPluginId(int i) {
        this.bitField0_ |= 1;
        this.pluginId_ = i;
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
    public defpackage.ahhe mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahhf> r0 = defpackage.ahhf.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahhf r2 = (defpackage.ahhf) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahhf r3 = (defpackage.ahhf) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhe.mergeFrom(ahoc, ahog):ahhe");
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
        mergeFrom((ahhf) ahoqVar);
        return this;
    }
}
