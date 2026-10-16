package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahgr extends ahok implements ahph {
    private int arrayDimensionCount_;
    private int bitField0_;
    private int classId_;
    private double doubleValue_;
    private int enumValueId_;
    private int flags_;
    private float floatValue_;
    private long intValue_;
    private int stringValue_;
    private ahgt type_ = ahgt.BYTE;
    private ahgx annotation_ = ahgx.getDefaultInstance();
    private List<ahgu> arrayElement_ = Collections.EMPTY_LIST;

    private ahgr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahgr create() {
        return new ahgr();
    }

    private void ensureArrayElementIsMutable() {
        if ((this.bitField0_ & 256) != 256) {
            this.arrayElement_ = new ArrayList(this.arrayElement_);
            this.bitField0_ |= 256;
        }
    }

    public ahgr addArrayElement(ahgr ahgrVar) {
        ensureArrayElementIsMutable();
        this.arrayElement_.add(ahgrVar.build());
        return this;
    }

    @Override // defpackage.ahpf
    public ahgu build() {
        ahgu ahguVarBuildPartial = buildPartial();
        if (ahguVarBuildPartial.isInitialized()) {
            return ahguVarBuildPartial;
        }
        throw newUninitializedMessageException(ahguVarBuildPartial);
    }

    public ahgu buildPartial() {
        ahgu ahguVar = new ahgu(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahguVar.type_ = this.type_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahguVar.intValue_ = this.intValue_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahguVar.floatValue_ = this.floatValue_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahguVar.doubleValue_ = this.doubleValue_;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ahguVar.stringValue_ = this.stringValue_;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        ahguVar.classId_ = this.classId_;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        ahguVar.enumValueId_ = this.enumValueId_;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        ahguVar.annotation_ = this.annotation_;
        if ((this.bitField0_ & 256) == 256) {
            this.arrayElement_ = DesugarCollections.unmodifiableList(this.arrayElement_);
            this.bitField0_ &= -257;
        }
        ahguVar.arrayElement_ = this.arrayElement_;
        if ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            i2 |= 256;
        }
        ahguVar.arrayDimensionCount_ = this.arrayDimensionCount_;
        if ((i & 1024) == 1024) {
            i2 |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
        ahguVar.flags_ = this.flags_;
        ahguVar.bitField0_ = i2;
        return ahguVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahgr mo86clone() {
        ahgr ahgrVarCreate = create();
        ahgrVarCreate.mergeFrom(buildPartial());
        return ahgrVarCreate;
    }

    public ahgx getAnnotation() {
        return this.annotation_;
    }

    public ahgu getArrayElement(int i) {
        return this.arrayElement_.get(i);
    }

    public int getArrayElementCount() {
        return this.arrayElement_.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahgu getDefaultInstanceForType() {
        return ahgu.getDefaultInstance();
    }

    public boolean hasAnnotation() {
        return (this.bitField0_ & 128) == 128;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (hasAnnotation() && !getAnnotation().isInitialized()) {
            return false;
        }
        for (int i = 0; i < getArrayElementCount(); i++) {
            if (!getArrayElement(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public ahgr mergeAnnotation(ahgx ahgxVar) {
        if ((this.bitField0_ & 128) == 128 && this.annotation_ != ahgx.getDefaultInstance()) {
            ahgw ahgwVarNewBuilder = ahgx.newBuilder(this.annotation_);
            ahgwVarNewBuilder.mergeFrom(ahgxVar);
            ahgxVar = ahgwVarNewBuilder.buildPartial();
        }
        this.annotation_ = ahgxVar;
        this.bitField0_ |= 128;
        return this;
    }

    public ahgr mergeFrom(ahgu ahguVar) {
        if (ahguVar == ahgu.getDefaultInstance()) {
            return this;
        }
        if (ahguVar.hasType()) {
            setType(ahguVar.getType());
        }
        if (ahguVar.hasIntValue()) {
            setIntValue(ahguVar.getIntValue());
        }
        if (ahguVar.hasFloatValue()) {
            setFloatValue(ahguVar.getFloatValue());
        }
        if (ahguVar.hasDoubleValue()) {
            setDoubleValue(ahguVar.getDoubleValue());
        }
        if (ahguVar.hasStringValue()) {
            setStringValue(ahguVar.getStringValue());
        }
        if (ahguVar.hasClassId()) {
            setClassId(ahguVar.getClassId());
        }
        if (ahguVar.hasEnumValueId()) {
            setEnumValueId(ahguVar.getEnumValueId());
        }
        if (ahguVar.hasAnnotation()) {
            mergeAnnotation(ahguVar.getAnnotation());
        }
        if (!ahguVar.arrayElement_.isEmpty()) {
            if (this.arrayElement_.isEmpty()) {
                this.arrayElement_ = ahguVar.arrayElement_;
                this.bitField0_ &= -257;
            } else {
                ensureArrayElementIsMutable();
                this.arrayElement_.addAll(ahguVar.arrayElement_);
            }
        }
        if (ahguVar.hasArrayDimensionCount()) {
            setArrayDimensionCount(ahguVar.getArrayDimensionCount());
        }
        if (ahguVar.hasFlags()) {
            setFlags(ahguVar.getFlags());
        }
        setUnknownFields(getUnknownFields().concat(ahguVar.unknownFields));
        return this;
    }

    public ahgr setAnnotation(ahgx ahgxVar) {
        ahgxVar.getClass();
        this.annotation_ = ahgxVar;
        this.bitField0_ |= 128;
        return this;
    }

    public ahgr setArrayDimensionCount(int i) {
        this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        this.arrayDimensionCount_ = i;
        return this;
    }

    public ahgr setClassId(int i) {
        this.bitField0_ |= 32;
        this.classId_ = i;
        return this;
    }

    public ahgr setDoubleValue(double d) {
        this.bitField0_ |= 8;
        this.doubleValue_ = d;
        return this;
    }

    public ahgr setEnumValueId(int i) {
        this.bitField0_ |= 64;
        this.enumValueId_ = i;
        return this;
    }

    public ahgr setFlags(int i) {
        this.bitField0_ |= 1024;
        this.flags_ = i;
        return this;
    }

    public ahgr setFloatValue(float f) {
        this.bitField0_ |= 4;
        this.floatValue_ = f;
        return this;
    }

    public ahgr setIntValue(long j) {
        this.bitField0_ |= 2;
        this.intValue_ = j;
        return this;
    }

    public ahgr setStringValue(int i) {
        this.bitField0_ |= 16;
        this.stringValue_ = i;
        return this;
    }

    public ahgr setType(ahgt ahgtVar) {
        ahgtVar.getClass();
        this.bitField0_ |= 1;
        this.type_ = ahgtVar;
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
    public defpackage.ahgr mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahgu> r0 = defpackage.ahgu.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahgu r2 = (defpackage.ahgu) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahgu r3 = (defpackage.ahgu) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgr.mergeFrom(ahoc, ahog):ahgr");
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
        mergeFrom((ahgu) ahoqVar);
        return this;
    }
}
