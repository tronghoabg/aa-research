package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhz extends ahok implements ahph {
    private int bitField0_;
    private int flags_;
    private int isInstanceTypeId_;
    private int valueParameterReference_;
    private ahib constantValue_ = ahib.TRUE;
    private ahjn isInstanceType_ = ahjn.getDefaultInstance();
    private List<ahic> andArgument_ = Collections.EMPTY_LIST;
    private List<ahic> orArgument_ = Collections.EMPTY_LIST;

    private ahhz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahhz create() {
        return new ahhz();
    }

    private void ensureAndArgumentIsMutable() {
        if ((this.bitField0_ & 32) != 32) {
            this.andArgument_ = new ArrayList(this.andArgument_);
            this.bitField0_ |= 32;
        }
    }

    private void ensureOrArgumentIsMutable() {
        if ((this.bitField0_ & 64) != 64) {
            this.orArgument_ = new ArrayList(this.orArgument_);
            this.bitField0_ |= 64;
        }
    }

    @Override // defpackage.ahpf
    public ahic build() {
        ahic ahicVarBuildPartial = buildPartial();
        if (ahicVarBuildPartial.isInitialized()) {
            return ahicVarBuildPartial;
        }
        throw newUninitializedMessageException(ahicVarBuildPartial);
    }

    public ahic buildPartial() {
        ahic ahicVar = new ahic(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahicVar.flags_ = this.flags_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahicVar.valueParameterReference_ = this.valueParameterReference_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahicVar.constantValue_ = this.constantValue_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahicVar.isInstanceType_ = this.isInstanceType_;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ahicVar.isInstanceTypeId_ = this.isInstanceTypeId_;
        if ((this.bitField0_ & 32) == 32) {
            this.andArgument_ = DesugarCollections.unmodifiableList(this.andArgument_);
            this.bitField0_ &= -33;
        }
        ahicVar.andArgument_ = this.andArgument_;
        if ((this.bitField0_ & 64) == 64) {
            this.orArgument_ = DesugarCollections.unmodifiableList(this.orArgument_);
            this.bitField0_ &= -65;
        }
        ahicVar.orArgument_ = this.orArgument_;
        ahicVar.bitField0_ = i2;
        return ahicVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahhz mo86clone() {
        ahhz ahhzVarCreate = create();
        ahhzVarCreate.mergeFrom(buildPartial());
        return ahhzVarCreate;
    }

    public ahic getAndArgument(int i) {
        return this.andArgument_.get(i);
    }

    public int getAndArgumentCount() {
        return this.andArgument_.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahic getDefaultInstanceForType() {
        return ahic.getDefaultInstance();
    }

    public ahjn getIsInstanceType() {
        return this.isInstanceType_;
    }

    public ahic getOrArgument(int i) {
        return this.orArgument_.get(i);
    }

    public int getOrArgumentCount() {
        return this.orArgument_.size();
    }

    public boolean hasIsInstanceType() {
        return (this.bitField0_ & 8) == 8;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
            return false;
        }
        for (int i = 0; i < getAndArgumentCount(); i++) {
            if (!getAndArgument(i).isInitialized()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
            if (!getOrArgument(i2).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public ahhz mergeFrom(ahic ahicVar) {
        if (ahicVar == ahic.getDefaultInstance()) {
            return this;
        }
        if (ahicVar.hasFlags()) {
            setFlags(ahicVar.getFlags());
        }
        if (ahicVar.hasValueParameterReference()) {
            setValueParameterReference(ahicVar.getValueParameterReference());
        }
        if (ahicVar.hasConstantValue()) {
            setConstantValue(ahicVar.getConstantValue());
        }
        if (ahicVar.hasIsInstanceType()) {
            mergeIsInstanceType(ahicVar.getIsInstanceType());
        }
        if (ahicVar.hasIsInstanceTypeId()) {
            setIsInstanceTypeId(ahicVar.getIsInstanceTypeId());
        }
        if (!ahicVar.andArgument_.isEmpty()) {
            if (this.andArgument_.isEmpty()) {
                this.andArgument_ = ahicVar.andArgument_;
                this.bitField0_ &= -33;
            } else {
                ensureAndArgumentIsMutable();
                this.andArgument_.addAll(ahicVar.andArgument_);
            }
        }
        if (!ahicVar.orArgument_.isEmpty()) {
            if (this.orArgument_.isEmpty()) {
                this.orArgument_ = ahicVar.orArgument_;
                this.bitField0_ &= -65;
            } else {
                ensureOrArgumentIsMutable();
                this.orArgument_.addAll(ahicVar.orArgument_);
            }
        }
        setUnknownFields(getUnknownFields().concat(ahicVar.unknownFields));
        return this;
    }

    public ahhz mergeIsInstanceType(ahjn ahjnVar) {
        if ((this.bitField0_ & 8) == 8 && this.isInstanceType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.isInstanceType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.isInstanceType_ = ahjnVar;
        this.bitField0_ |= 8;
        return this;
    }

    public ahhz setConstantValue(ahib ahibVar) {
        ahibVar.getClass();
        this.bitField0_ |= 4;
        this.constantValue_ = ahibVar;
        return this;
    }

    public ahhz setFlags(int i) {
        this.bitField0_ |= 1;
        this.flags_ = i;
        return this;
    }

    public ahhz setIsInstanceTypeId(int i) {
        this.bitField0_ |= 16;
        this.isInstanceTypeId_ = i;
        return this;
    }

    public ahhz setValueParameterReference(int i) {
        this.bitField0_ |= 2;
        this.valueParameterReference_ = i;
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
    public defpackage.ahhz mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahic> r0 = defpackage.ahic.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahic r2 = (defpackage.ahic) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahic r3 = (defpackage.ahic) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhz.mergeFrom(ahoc, ahog):ahhz");
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
        mergeFrom((ahic) ahoqVar);
        return this;
    }
}
