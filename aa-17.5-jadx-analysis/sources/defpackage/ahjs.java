package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahjs extends ahol implements ahph {
    private int bitField0_;
    private int id_;
    private int name_;
    private boolean reified_;
    private ahju variance_ = ahju.INV;
    private List<ahjn> upperBound_ = Collections.EMPTY_LIST;
    private List<Integer> upperBoundId_ = Collections.EMPTY_LIST;
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;

    private ahjs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahjs create() {
        return new ahjs();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 64) != 64) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 64;
        }
    }

    private void ensureUpperBoundIdIsMutable() {
        if ((this.bitField0_ & 32) != 32) {
            this.upperBoundId_ = new ArrayList(this.upperBoundId_);
            this.bitField0_ |= 32;
        }
    }

    private void ensureUpperBoundIsMutable() {
        if ((this.bitField0_ & 16) != 16) {
            this.upperBound_ = new ArrayList(this.upperBound_);
            this.bitField0_ |= 16;
        }
    }

    public ahjs addAnnotation(ahgx ahgxVar) {
        ahgxVar.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(ahgxVar);
        return this;
    }

    public ahjs addUpperBound(ahjn ahjnVar) {
        ahjnVar.getClass();
        ensureUpperBoundIsMutable();
        this.upperBound_.add(ahjnVar);
        return this;
    }

    @Override // defpackage.ahpf
    public ahjv build() {
        ahjv ahjvVarBuildPartial = buildPartial();
        if (ahjvVarBuildPartial.isInitialized()) {
            return ahjvVarBuildPartial;
        }
        throw newUninitializedMessageException(ahjvVarBuildPartial);
    }

    public ahjv buildPartial() {
        ahjv ahjvVar = new ahjv(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahjvVar.id_ = this.id_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahjvVar.name_ = this.name_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahjvVar.reified_ = this.reified_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahjvVar.variance_ = this.variance_;
        if ((this.bitField0_ & 16) == 16) {
            this.upperBound_ = DesugarCollections.unmodifiableList(this.upperBound_);
            this.bitField0_ &= -17;
        }
        ahjvVar.upperBound_ = this.upperBound_;
        if ((this.bitField0_ & 32) == 32) {
            this.upperBoundId_ = DesugarCollections.unmodifiableList(this.upperBoundId_);
            this.bitField0_ &= -33;
        }
        ahjvVar.upperBoundId_ = this.upperBoundId_;
        if ((this.bitField0_ & 64) == 64) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -65;
        }
        ahjvVar.annotation_ = this.annotation_;
        ahjvVar.bitField0_ = i2;
        return ahjvVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahjs mo86clone() {
        ahjs ahjsVarCreate = create();
        ahjsVarCreate.mergeFrom(buildPartial());
        return ahjsVarCreate;
    }

    public ahgx getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahjv getDefaultInstanceForType() {
        return ahjv.getDefaultInstance();
    }

    public ahjn getUpperBound(int i) {
        return this.upperBound_.get(i);
    }

    public int getUpperBoundCount() {
        return this.upperBound_.size();
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (!hasId() || !hasName()) {
            return false;
        }
        for (int i = 0; i < getUpperBoundCount(); i++) {
            if (!getUpperBound(i).isInitialized()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
            if (!getAnnotation(i2).isInitialized()) {
                return false;
            }
        }
        return extensionsAreInitialized();
    }

    public ahjs mergeFrom(ahjv ahjvVar) {
        if (ahjvVar == ahjv.getDefaultInstance()) {
            return this;
        }
        if (ahjvVar.hasId()) {
            setId(ahjvVar.getId());
        }
        if (ahjvVar.hasName()) {
            setName(ahjvVar.getName());
        }
        if (ahjvVar.hasReified()) {
            setReified(ahjvVar.getReified());
        }
        if (ahjvVar.hasVariance()) {
            setVariance(ahjvVar.getVariance());
        }
        if (!ahjvVar.upperBound_.isEmpty()) {
            if (this.upperBound_.isEmpty()) {
                this.upperBound_ = ahjvVar.upperBound_;
                this.bitField0_ &= -17;
            } else {
                ensureUpperBoundIsMutable();
                this.upperBound_.addAll(ahjvVar.upperBound_);
            }
        }
        if (!ahjvVar.upperBoundId_.isEmpty()) {
            if (this.upperBoundId_.isEmpty()) {
                this.upperBoundId_ = ahjvVar.upperBoundId_;
                this.bitField0_ &= -33;
            } else {
                ensureUpperBoundIdIsMutable();
                this.upperBoundId_.addAll(ahjvVar.upperBoundId_);
            }
        }
        if (!ahjvVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahjvVar.annotation_;
                this.bitField0_ &= -65;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahjvVar.annotation_);
            }
        }
        mergeExtensionFields(ahjvVar);
        setUnknownFields(getUnknownFields().concat(ahjvVar.unknownFields));
        return this;
    }

    public ahjs setId(int i) {
        this.bitField0_ |= 1;
        this.id_ = i;
        return this;
    }

    public ahjs setName(int i) {
        this.bitField0_ |= 2;
        this.name_ = i;
        return this;
    }

    public ahjs setReified(boolean z) {
        this.bitField0_ |= 4;
        this.reified_ = z;
        return this;
    }

    public ahjs setVariance(ahju ahjuVar) {
        ahjuVar.getClass();
        this.bitField0_ |= 8;
        this.variance_ = ahjuVar;
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
    public defpackage.ahjs mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahjv> r0 = defpackage.ahjv.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahjv r2 = (defpackage.ahjv) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahjv r3 = (defpackage.ahjv) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjs.mergeFrom(ahoc, ahog):ahjs");
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
        mergeFrom((ahjv) ahoqVar);
        return this;
    }
}
