package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahil extends ahol implements ahph {
    private int bitField0_;
    private List<ahif> function_ = Collections.EMPTY_LIST;
    private List<ahis> property_ = Collections.EMPTY_LIST;
    private List<ahjq> typeAlias_ = Collections.EMPTY_LIST;
    private ahjy typeTable_ = ahjy.getDefaultInstance();
    private ahkl versionRequirementTable_ = ahkl.getDefaultInstance();

    private ahil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahil create() {
        return new ahil();
    }

    private void ensureFunctionIsMutable() {
        if ((this.bitField0_ & 1) != 1) {
            this.function_ = new ArrayList(this.function_);
            this.bitField0_ |= 1;
        }
    }

    private void ensurePropertyIsMutable() {
        if ((this.bitField0_ & 2) != 2) {
            this.property_ = new ArrayList(this.property_);
            this.bitField0_ |= 2;
        }
    }

    private void ensureTypeAliasIsMutable() {
        if ((this.bitField0_ & 4) != 4) {
            this.typeAlias_ = new ArrayList(this.typeAlias_);
            this.bitField0_ |= 4;
        }
    }

    @Override // defpackage.ahpf
    public ahim build() {
        ahim ahimVarBuildPartial = buildPartial();
        if (ahimVarBuildPartial.isInitialized()) {
            return ahimVarBuildPartial;
        }
        throw newUninitializedMessageException(ahimVarBuildPartial);
    }

    public ahim buildPartial() {
        ahim ahimVar = new ahim(this, (ahgm) null);
        int i = this.bitField0_;
        if ((i & 1) == 1) {
            this.function_ = DesugarCollections.unmodifiableList(this.function_);
            this.bitField0_ &= -2;
        }
        ahimVar.function_ = this.function_;
        if ((this.bitField0_ & 2) == 2) {
            this.property_ = DesugarCollections.unmodifiableList(this.property_);
            this.bitField0_ &= -3;
        }
        ahimVar.property_ = this.property_;
        if ((this.bitField0_ & 4) == 4) {
            this.typeAlias_ = DesugarCollections.unmodifiableList(this.typeAlias_);
            this.bitField0_ &= -5;
        }
        ahimVar.typeAlias_ = this.typeAlias_;
        int i2 = (i & 8) != 8 ? 0 : 1;
        ahimVar.typeTable_ = this.typeTable_;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        ahimVar.versionRequirementTable_ = this.versionRequirementTable_;
        ahimVar.bitField0_ = i2;
        return ahimVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahil mo86clone() {
        ahil ahilVarCreate = create();
        ahilVarCreate.mergeFrom(buildPartial());
        return ahilVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahim getDefaultInstanceForType() {
        return ahim.getDefaultInstance();
    }

    public ahif getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public ahis getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public ahjq getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public ahjy getTypeTable() {
        return this.typeTable_;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 8) == 8;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        for (int i = 0; i < getFunctionCount(); i++) {
            if (!getFunction(i).isInitialized()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getPropertyCount(); i2++) {
            if (!getProperty(i2).isInitialized()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
            if (!getTypeAlias(i3).isInitialized()) {
                return false;
            }
        }
        return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
    }

    public ahil mergeFrom(ahim ahimVar) {
        if (ahimVar == ahim.getDefaultInstance()) {
            return this;
        }
        if (!ahimVar.function_.isEmpty()) {
            if (this.function_.isEmpty()) {
                this.function_ = ahimVar.function_;
                this.bitField0_ &= -2;
            } else {
                ensureFunctionIsMutable();
                this.function_.addAll(ahimVar.function_);
            }
        }
        if (!ahimVar.property_.isEmpty()) {
            if (this.property_.isEmpty()) {
                this.property_ = ahimVar.property_;
                this.bitField0_ &= -3;
            } else {
                ensurePropertyIsMutable();
                this.property_.addAll(ahimVar.property_);
            }
        }
        if (!ahimVar.typeAlias_.isEmpty()) {
            if (this.typeAlias_.isEmpty()) {
                this.typeAlias_ = ahimVar.typeAlias_;
                this.bitField0_ &= -5;
            } else {
                ensureTypeAliasIsMutable();
                this.typeAlias_.addAll(ahimVar.typeAlias_);
            }
        }
        if (ahimVar.hasTypeTable()) {
            mergeTypeTable(ahimVar.getTypeTable());
        }
        if (ahimVar.hasVersionRequirementTable()) {
            mergeVersionRequirementTable(ahimVar.getVersionRequirementTable());
        }
        mergeExtensionFields(ahimVar);
        setUnknownFields(getUnknownFields().concat(ahimVar.unknownFields));
        return this;
    }

    public ahil mergeTypeTable(ahjy ahjyVar) {
        if ((this.bitField0_ & 8) == 8 && this.typeTable_ != ahjy.getDefaultInstance()) {
            ahjx ahjxVarNewBuilder = ahjy.newBuilder(this.typeTable_);
            ahjxVarNewBuilder.mergeFrom(ahjyVar);
            ahjyVar = ahjxVarNewBuilder.buildPartial();
        }
        this.typeTable_ = ahjyVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahil mergeVersionRequirementTable(ahkl ahklVar) {
        if ((this.bitField0_ & 16) == 16 && this.versionRequirementTable_ != ahkl.getDefaultInstance()) {
            ahkk ahkkVarNewBuilder = ahkl.newBuilder(this.versionRequirementTable_);
            ahkkVarNewBuilder.mergeFrom(ahklVar);
            ahklVar = ahkkVarNewBuilder.buildPartial();
        }
        this.versionRequirementTable_ = ahklVar;
        this.bitField0_ |= 16;
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
    public defpackage.ahil mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahim> r0 = defpackage.ahim.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahim r2 = (defpackage.ahim) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahim r3 = (defpackage.ahim) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahil.mergeFrom(ahoc, ahog):ahil");
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
        mergeFrom((ahim) ahoqVar);
        return this;
    }
}
