package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh extends com.google.v.du<bh, bc> implements com.google.v.fj {
    public static final int ALLOWANCE_FIELD_NUMBER = 4;
    public static final int CAN_ENTER_FIELD_NUMBER = 2;
    public static final int CAN_EXIT_FIELD_NUMBER = 3;
    private static final bh DEFAULT_INSTANCE;
    public static final int ENTRY_RULE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<bh> PARSER = null;
    public static final int QUALIFIER_TEXT_FIELD_NUMBER = 6;
    private int allowance_;
    private int bitField0_;
    private boolean canEnter_;
    private boolean canExit_;
    private com.google.v.eo<bf> entryRule_ = emptyProtobufList();
    private com.google.v.eo<dv> qualifierText_ = emptyProtobufList();

    static {
        bh bhVar = new bh();
        DEFAULT_INSTANCE = bhVar;
        com.google.v.du.registerDefaultInstance(bh.class, bhVar);
    }

    private bh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntryRule(Iterable<? extends bf> iterable) {
        ensureEntryRuleIsMutable();
        com.google.v.c.addAll(iterable, this.entryRule_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQualifierText(Iterable<? extends dv> iterable) {
        ensureQualifierTextIsMutable();
        com.google.v.c.addAll(iterable, this.qualifierText_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntryRule(int i2, bf bfVar) {
        Objects.requireNonNull(bfVar);
        ensureEntryRuleIsMutable();
        this.entryRule_.add(i2, bfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualifierText(int i2, dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensureQualifierTextIsMutable();
        this.qualifierText_.add(i2, dvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowance() {
        this.bitField0_ &= -2;
        this.allowance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanEnter() {
        this.bitField0_ &= -3;
        this.canEnter_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanExit() {
        this.bitField0_ &= -5;
        this.canExit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryRule() {
        this.entryRule_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQualifierText() {
        this.qualifierText_ = emptyProtobufList();
    }

    private void ensureEntryRuleIsMutable() {
        com.google.v.eo<bf> eoVar = this.entryRule_;
        if (eoVar.c()) {
            return;
        }
        this.entryRule_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureQualifierTextIsMutable() {
        com.google.v.eo<dv> eoVar = this.qualifierText_;
        if (eoVar.c()) {
            return;
        }
        this.qualifierText_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bc newBuilder() {
        return (bc) DEFAULT_INSTANCE.createBuilder();
    }

    public static bh parseDelimitedFrom(InputStream inputStream) {
        return (bh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bh parseFrom(com.google.v.v vVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntryRule(int i2) {
        ensureEntryRuleIsMutable();
        this.entryRule_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeQualifierText(int i2) {
        ensureQualifierTextIsMutable();
        this.qualifierText_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowance(bd bdVar) {
        this.allowance_ = bdVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanEnter(boolean z) {
        this.bitField0_ |= 2;
        this.canEnter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanExit(boolean z) {
        this.bitField0_ |= 4;
        this.canExit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryRule(int i2, bf bfVar) {
        Objects.requireNonNull(bfVar);
        ensureEntryRuleIsMutable();
        this.entryRule_.set(i2, bfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualifierText(int i2, dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensureQualifierTextIsMutable();
        this.qualifierText_.set(i2, dvVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0002\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0000\u0005\u001b\u0006\u001b", new Object[]{"bitField0_", "canEnter_", "canExit_", "allowance_", c.f11207k, "entryRule_", bf.class, "qualifierText_", dv.class});
        }
        if (iOrdinal == 3) {
            return new bh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bd getAllowance() {
        bd bdVarA = bd.a(this.allowance_);
        return bdVarA == null ? bd.ENTER_AND_EXIT : bdVarA;
    }

    @Deprecated
    public boolean getCanEnter() {
        return this.canEnter_;
    }

    @Deprecated
    public boolean getCanExit() {
        return this.canExit_;
    }

    public bf getEntryRule(int i2) {
        return this.entryRule_.get(i2);
    }

    public int getEntryRuleCount() {
        return this.entryRule_.size();
    }

    public List<bf> getEntryRuleList() {
        return this.entryRule_;
    }

    public bg getEntryRuleOrBuilder(int i2) {
        return this.entryRule_.get(i2);
    }

    public List<? extends bg> getEntryRuleOrBuilderList() {
        return this.entryRule_;
    }

    public dv getQualifierText(int i2) {
        return this.qualifierText_.get(i2);
    }

    public int getQualifierTextCount() {
        return this.qualifierText_.size();
    }

    public List<dv> getQualifierTextList() {
        return this.qualifierText_;
    }

    public dw getQualifierTextOrBuilder(int i2) {
        return this.qualifierText_.get(i2);
    }

    public List<? extends dw> getQualifierTextOrBuilderList() {
        return this.qualifierText_;
    }

    public boolean hasAllowance() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasCanEnter() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasCanExit() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bc newBuilder(bh bhVar) {
        return (bc) DEFAULT_INSTANCE.createBuilder(bhVar);
    }

    public static bh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bh parseFrom(com.google.v.z zVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntryRule(bf bfVar) {
        Objects.requireNonNull(bfVar);
        ensureEntryRuleIsMutable();
        this.entryRule_.add(bfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualifierText(dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensureQualifierTextIsMutable();
        this.qualifierText_.add(dvVar);
    }

    public static bh parseFrom(InputStream inputStream) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bh parseFrom(ByteBuffer byteBuffer) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bh parseFrom(byte[] bArr) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
