package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhn extends ahok implements ahph {
    private int bitField0_;
    private ahhr effectType_ = ahhr.RETURNS_CONSTANT;
    private List<ahic> effectConstructorArgument_ = Collections.EMPTY_LIST;
    private ahic conclusionOfConditionalEffect_ = ahic.getDefaultInstance();
    private ahht kind_ = ahht.AT_MOST_ONCE;
    private ahhp conditionKind_ = ahhp.CONCLUSION_CONDITION;

    private ahhn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahhn create() {
        return new ahhn();
    }

    private void ensureEffectConstructorArgumentIsMutable() {
        if ((this.bitField0_ & 2) != 2) {
            this.effectConstructorArgument_ = new ArrayList(this.effectConstructorArgument_);
            this.bitField0_ |= 2;
        }
    }

    @Override // defpackage.ahpf
    public ahhu build() {
        ahhu ahhuVarBuildPartial = buildPartial();
        if (ahhuVarBuildPartial.isInitialized()) {
            return ahhuVarBuildPartial;
        }
        throw newUninitializedMessageException(ahhuVarBuildPartial);
    }

    public ahhu buildPartial() {
        ahhu ahhuVar = new ahhu(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahhuVar.effectType_ = this.effectType_;
        if ((this.bitField0_ & 2) == 2) {
            this.effectConstructorArgument_ = DesugarCollections.unmodifiableList(this.effectConstructorArgument_);
            this.bitField0_ &= -3;
        }
        ahhuVar.effectConstructorArgument_ = this.effectConstructorArgument_;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        ahhuVar.conclusionOfConditionalEffect_ = this.conclusionOfConditionalEffect_;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        ahhuVar.kind_ = this.kind_;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        ahhuVar.conditionKind_ = this.conditionKind_;
        ahhuVar.bitField0_ = i2;
        return ahhuVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahhn mo86clone() {
        ahhn ahhnVarCreate = create();
        ahhnVarCreate.mergeFrom(buildPartial());
        return ahhnVarCreate;
    }

    public ahic getConclusionOfConditionalEffect() {
        return this.conclusionOfConditionalEffect_;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahhu getDefaultInstanceForType() {
        return ahhu.getDefaultInstance();
    }

    public ahic getEffectConstructorArgument(int i) {
        return this.effectConstructorArgument_.get(i);
    }

    public int getEffectConstructorArgumentCount() {
        return this.effectConstructorArgument_.size();
    }

    public boolean hasConclusionOfConditionalEffect() {
        return (this.bitField0_ & 4) == 4;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
            if (!getEffectConstructorArgument(i).isInitialized()) {
                return false;
            }
        }
        return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
    }

    public ahhn mergeConclusionOfConditionalEffect(ahic ahicVar) {
        if ((this.bitField0_ & 4) == 4 && this.conclusionOfConditionalEffect_ != ahic.getDefaultInstance()) {
            ahhz ahhzVarNewBuilder = ahic.newBuilder(this.conclusionOfConditionalEffect_);
            ahhzVarNewBuilder.mergeFrom(ahicVar);
            ahicVar = ahhzVarNewBuilder.buildPartial();
        }
        this.conclusionOfConditionalEffect_ = ahicVar;
        this.bitField0_ |= 4;
        return this;
    }

    public ahhn mergeFrom(ahhu ahhuVar) {
        if (ahhuVar == ahhu.getDefaultInstance()) {
            return this;
        }
        if (ahhuVar.hasEffectType()) {
            setEffectType(ahhuVar.getEffectType());
        }
        if (!ahhuVar.effectConstructorArgument_.isEmpty()) {
            if (this.effectConstructorArgument_.isEmpty()) {
                this.effectConstructorArgument_ = ahhuVar.effectConstructorArgument_;
                this.bitField0_ &= -3;
            } else {
                ensureEffectConstructorArgumentIsMutable();
                this.effectConstructorArgument_.addAll(ahhuVar.effectConstructorArgument_);
            }
        }
        if (ahhuVar.hasConclusionOfConditionalEffect()) {
            mergeConclusionOfConditionalEffect(ahhuVar.getConclusionOfConditionalEffect());
        }
        if (ahhuVar.hasKind()) {
            setKind(ahhuVar.getKind());
        }
        if (ahhuVar.hasConditionKind()) {
            setConditionKind(ahhuVar.getConditionKind());
        }
        setUnknownFields(getUnknownFields().concat(ahhuVar.unknownFields));
        return this;
    }

    public ahhn setConditionKind(ahhp ahhpVar) {
        ahhpVar.getClass();
        this.bitField0_ |= 16;
        this.conditionKind_ = ahhpVar;
        return this;
    }

    public ahhn setEffectType(ahhr ahhrVar) {
        ahhrVar.getClass();
        this.bitField0_ |= 1;
        this.effectType_ = ahhrVar;
        return this;
    }

    public ahhn setKind(ahht ahhtVar) {
        ahhtVar.getClass();
        this.bitField0_ |= 8;
        this.kind_ = ahhtVar;
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
    public defpackage.ahhn mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahhu> r0 = defpackage.ahhu.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahhu r2 = (defpackage.ahhu) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahhu r3 = (defpackage.ahhu) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhn.mergeFrom(ahoc, ahog):ahhn");
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
        mergeFrom((ahhu) ahoqVar);
        return this;
    }
}
