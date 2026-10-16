package defpackage;

/* loaded from: classes3.dex */
public final class aiay extends aggu implements aiax {
    private final aibv containerSource;
    private final ahld nameResolver;
    private final ahhi proto;
    private final ahlh typeTable;
    private final ahln versionRequirementTable;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public aiay(defpackage.agba r8, defpackage.agbh r9, defpackage.agfk r10, boolean r11, defpackage.agaw r12, defpackage.ahhi r13, defpackage.ahld r14, defpackage.ahlh r15, defpackage.ahln r16, defpackage.aibv r17, defpackage.agdx r18) {
        /*
            r7 = this;
            r8.getClass()
            r10.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            r15.getClass()
            r16.getClass()
            if (r18 != 0) goto L21
            agdx r0 = defpackage.agdx.NO_SOURCE
            r6 = r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r7
            goto L29
        L21:
            r6 = r18
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
        L29:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.proto = r13
            r7.nameResolver = r14
            r7.typeTable = r15
            r1 = r16
            r7.versionRequirementTable = r1
            r1 = r17
            r7.containerSource = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiay.<init>(agba, agbh, agfk, boolean, agaw, ahhi, ahld, ahlh, ahln, aibv, agdx):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aggu, defpackage.aghm
    public aiay createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        agbiVar.getClass();
        agawVar.getClass();
        agfkVar.getClass();
        agdxVar.getClass();
        aiay aiayVar = new aiay((agba) agbiVar, (agbh) agcjVar, agfkVar, this.isPrimary, agawVar, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), agdxVar);
        aiayVar.setHasStableParameterNames(hasStableParameterNames());
        return aiayVar;
    }

    @Override // defpackage.aibw
    public aibv getContainerSource() {
        return this.containerSource;
    }

    @Override // defpackage.aibw
    public ahld getNameResolver() {
        return this.nameResolver;
    }

    @Override // defpackage.aibw
    public ahlh getTypeTable() {
        return this.typeTable;
    }

    public ahln getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    @Override // defpackage.aghm, defpackage.agco
    public boolean isExternal() {
        return false;
    }

    @Override // defpackage.aghm, defpackage.agcj
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.aghm, defpackage.agcj
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.aghm, defpackage.agcj
    public boolean isTailrec() {
        return false;
    }

    @Override // defpackage.aibw
    public ahhi getProto() {
        return this.proto;
    }

    public /* synthetic */ aiay(agba agbaVar, agbh agbhVar, agfk agfkVar, boolean z, agaw agawVar, ahhi ahhiVar, ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, aibv aibvVar, agdx agdxVar, int i, afeu afeuVar) {
        this(agbaVar, agbhVar, agfkVar, z, agawVar, ahhiVar, ahldVar, ahlhVar, ahlnVar, aibvVar, (i & 1024) != 0 ? null : agdxVar);
    }
}
