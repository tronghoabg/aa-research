package defpackage;

/* loaded from: classes3.dex */
public final class aicv extends agio implements aiax {
    private final aibv containerSource;
    private final ahld nameResolver;
    private final ahif proto;
    private final ahlh typeTable;
    private final ahln versionRequirementTable;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public aicv(defpackage.agbi r8, defpackage.agdv r9, defpackage.agfk r10, defpackage.ahnj r11, defpackage.agaw r12, defpackage.ahif r13, defpackage.ahld r14, defpackage.ahlh r15, defpackage.ahln r16, defpackage.aibv r17, defpackage.agdx r18) {
        /*
            r7 = this;
            r8.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            r15.getClass()
            r16.getClass()
            if (r18 != 0) goto L24
            agdx r0 = defpackage.agdx.NO_SOURCE
            r6 = r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r7
            goto L2c
        L24:
            r6 = r18
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
        L2c:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicv.<init>(agbi, agdv, agfk, ahnj, agaw, ahif, ahld, ahlh, ahln, aibv, agdx):void");
    }

    @Override // defpackage.agio, defpackage.aghm
    protected aghm createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        ahnj ahnjVar2;
        agbiVar.getClass();
        agawVar.getClass();
        agfkVar.getClass();
        agdxVar.getClass();
        agdv agdvVar = (agdv) agcjVar;
        if (ahnjVar == null) {
            ahnj name = getName();
            name.getClass();
            ahnjVar2 = name;
        } else {
            ahnjVar2 = ahnjVar;
        }
        aicv aicvVar = new aicv(agbiVar, agdvVar, agfkVar, ahnjVar2, agawVar, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), agdxVar);
        aicvVar.setHasStableParameterNames(hasStableParameterNames());
        return aicvVar;
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

    @Override // defpackage.aibw
    public ahif getProto() {
        return this.proto;
    }

    public /* synthetic */ aicv(agbi agbiVar, agdv agdvVar, agfk agfkVar, ahnj ahnjVar, agaw agawVar, ahif ahifVar, ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, aibv aibvVar, agdx agdxVar, int i, afeu afeuVar) {
        this(agbiVar, agdvVar, agfkVar, ahnjVar, agawVar, ahifVar, ahldVar, ahlhVar, ahlnVar, aibvVar, (i & 1024) != 0 ? null : agdxVar);
    }
}
