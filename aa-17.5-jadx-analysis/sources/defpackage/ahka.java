package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahka extends ahol<ahkb, ahka> implements ahph {
    private int bitField0_;
    private int flags_;
    private int name_;
    private int typeId_;
    private int varargElementTypeId_;
    private ahjn type_ = ahjn.getDefaultInstance();
    private ahjn varargElementType_ = ahjn.getDefaultInstance();
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;
    private ahgu annotationParameterDefaultValue_ = ahgu.getDefaultInstance();

    private ahka() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahka create() {
        return new ahka();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 64) != 64) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 64;
        }
    }

    public ahka addAllAnnotation(Iterable<? extends ahgx> iterable) {
        ensureAnnotationIsMutable();
        ahns.addAll(iterable, this.annotation_);
        return this;
    }

    @Override // defpackage.ahpf
    public ahkb build() {
        ahkb ahkbVarBuildPartial = buildPartial();
        if (ahkbVarBuildPartial.isInitialized()) {
            return ahkbVarBuildPartial;
        }
        throw newUninitializedMessageException(ahkbVarBuildPartial);
    }

    public ahkb buildPartial() {
        ahkb ahkbVar = new ahkb(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahkbVar.flags_ = this.flags_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahkbVar.name_ = this.name_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahkbVar.type_ = this.type_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahkbVar.typeId_ = this.typeId_;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ahkbVar.varargElementType_ = this.varargElementType_;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        ahkbVar.varargElementTypeId_ = this.varargElementTypeId_;
        if ((this.bitField0_ & 64) == 64) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -65;
        }
        ahkbVar.annotation_ = this.annotation_;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        ahkbVar.annotationParameterDefaultValue_ = this.annotationParameterDefaultValue_;
        ahkbVar.bitField0_ = i2;
        return ahkbVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahka mo86clone() {
        ahka ahkaVarCreate = create();
        ahkaVarCreate.mergeFrom(buildPartial());
        return ahkaVarCreate;
    }

    public ahgx getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public ahgu getAnnotationParameterDefaultValue() {
        return this.annotationParameterDefaultValue_;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahkb getDefaultInstanceForType() {
        return ahkb.getDefaultInstance();
    }

    public ahjn getType() {
        return this.type_;
    }

    public ahjn getVarargElementType() {
        return this.varargElementType_;
    }

    public boolean hasAnnotationParameterDefaultValue() {
        return (this.bitField0_ & 128) == 128;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasVarargElementType() {
        return (this.bitField0_ & 16) == 16;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (!hasName()) {
            return false;
        }
        if (hasType() && !getType().isInitialized()) {
            return false;
        }
        if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
            return false;
        }
        for (int i = 0; i < getAnnotationCount(); i++) {
            if (!getAnnotation(i).isInitialized()) {
                return false;
            }
        }
        return (!hasAnnotationParameterDefaultValue() || getAnnotationParameterDefaultValue().isInitialized()) && extensionsAreInitialized();
    }

    public ahka mergeAnnotationParameterDefaultValue(ahgu ahguVar) {
        if ((this.bitField0_ & 128) == 128 && this.annotationParameterDefaultValue_ != ahgu.getDefaultInstance()) {
            ahgr ahgrVarNewBuilder = ahgu.newBuilder(this.annotationParameterDefaultValue_);
            ahgrVarNewBuilder.mergeFrom(ahguVar);
            ahguVar = ahgrVarNewBuilder.buildPartial();
        }
        this.annotationParameterDefaultValue_ = ahguVar;
        this.bitField0_ |= 128;
        return this;
    }

    public ahka mergeFrom(ahkb ahkbVar) {
        if (ahkbVar == ahkb.getDefaultInstance()) {
            return this;
        }
        if (ahkbVar.hasFlags()) {
            setFlags(ahkbVar.getFlags());
        }
        if (ahkbVar.hasName()) {
            setName(ahkbVar.getName());
        }
        if (ahkbVar.hasType()) {
            mergeType(ahkbVar.getType());
        }
        if (ahkbVar.hasTypeId()) {
            setTypeId(ahkbVar.getTypeId());
        }
        if (ahkbVar.hasVarargElementType()) {
            mergeVarargElementType(ahkbVar.getVarargElementType());
        }
        if (ahkbVar.hasVarargElementTypeId()) {
            setVarargElementTypeId(ahkbVar.getVarargElementTypeId());
        }
        if (!ahkbVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahkbVar.annotation_;
                this.bitField0_ &= -65;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahkbVar.annotation_);
            }
        }
        if (ahkbVar.hasAnnotationParameterDefaultValue()) {
            mergeAnnotationParameterDefaultValue(ahkbVar.getAnnotationParameterDefaultValue());
        }
        mergeExtensionFields(ahkbVar);
        setUnknownFields(getUnknownFields().concat(ahkbVar.unknownFields));
        return this;
    }

    public ahka mergeType(ahjn ahjnVar) {
        if ((this.bitField0_ & 4) == 4 && this.type_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.type_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.type_ = ahjnVar;
        this.bitField0_ |= 4;
        return this;
    }

    public ahka mergeVarargElementType(ahjn ahjnVar) {
        if ((this.bitField0_ & 16) == 16 && this.varargElementType_ != ahjn.getDefaultInstance()) {
            ahjm ahjmVarNewBuilder = ahjn.newBuilder(this.varargElementType_);
            ahjmVarNewBuilder.mergeFrom(ahjnVar);
            ahjnVar = ahjmVarNewBuilder.buildPartial();
        }
        this.varargElementType_ = ahjnVar;
        this.bitField0_ |= 16;
        return this;
    }

    public ahka setAnnotationParameterDefaultValue(ahgu ahguVar) {
        ahguVar.getClass();
        this.annotationParameterDefaultValue_ = ahguVar;
        this.bitField0_ |= 128;
        return this;
    }

    public ahka setFlags(int i) {
        this.bitField0_ |= 1;
        this.flags_ = i;
        return this;
    }

    public ahka setName(int i) {
        this.bitField0_ |= 2;
        this.name_ = i;
        return this;
    }

    public ahka setType(ahjn ahjnVar) {
        ahjnVar.getClass();
        this.type_ = ahjnVar;
        this.bitField0_ |= 4;
        return this;
    }

    public ahka setTypeId(int i) {
        this.bitField0_ |= 8;
        this.typeId_ = i;
        return this;
    }

    public ahka setVarargElementType(ahjn ahjnVar) {
        ahjnVar.getClass();
        this.varargElementType_ = ahjnVar;
        this.bitField0_ |= 16;
        return this;
    }

    public ahka setVarargElementTypeId(int i) {
        this.bitField0_ |= 32;
        this.varargElementTypeId_ = i;
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
    public defpackage.ahka mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahkb> r0 = defpackage.ahkb.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahkb r2 = (defpackage.ahkb) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahkb r3 = (defpackage.ahkb) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahka.mergeFrom(ahoc, ahog):ahka");
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
        mergeFrom((ahkb) ahoqVar);
        return this;
    }
}
