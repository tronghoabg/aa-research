package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jj extends com.google.v.du<jj, jf> implements jk {
    public static final int CALL_RATE_FIELD_NUMBER = 8;
    public static final int CONTACT_CATEGORY_FIELD_NUMBER = 10;
    private static final jj DEFAULT_INSTANCE;
    public static final int FLAG_FIELD_NUMBER = 7;
    public static final int IS_SHARED_NUMBER_FIELD_NUMBER = 5;
    public static final int LABEL_FIELD_NUMBER = 3;
    public static final int LANGUAGE_FIELD_NUMBER = 4;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 12773310;
    public static final int METADATA_FIELD_NUMBER = 500;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<jj> PARSER = null;
    public static final int PHONE_NUMBER_FIELD_NUMBER = 9;
    public static final int SERVICE_LOCATION_FEATURE_FIELD_NUMBER = 11;
    public static final int TYPE_FIELD_NUMBER = 2;
    private static final com.google.v.el<jh> flag_converter_ = new ee(5);
    public static final com.google.v.ds<com.google.w.n.a.b, jj> messageSetExtension;
    private int bitField0_;
    private int contactCategory_;
    private boolean isSharedNumber_;
    private ce metadata_;
    private com.google.p.a.a.b number_;
    private com.google.m.a.a.d phoneNumber_;
    private int type_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<eh> label_ = emptyProtobufList();
    private com.google.v.eo<String> language_ = emptyProtobufList();
    private com.google.v.ek flag_ = emptyIntList();
    private com.google.v.eo<fe> callRate_ = emptyProtobufList();
    private com.google.v.eo<bw> serviceLocationFeature_ = emptyProtobufList();

    static {
        jj jjVar = new jj();
        DEFAULT_INSTANCE = jjVar;
        com.google.v.du.registerDefaultInstance(jj.class, jjVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, jj.class);
    }

    private jj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCallRate(Iterable<? extends fe> iterable) {
        ensureCallRateIsMutable();
        com.google.v.c.addAll(iterable, this.callRate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFlag(Iterable<? extends jh> iterable) {
        ensureFlagIsMutable();
        Iterator<? extends jh> it = iterable.iterator();
        while (it.hasNext()) {
            this.flag_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabel(Iterable<? extends eh> iterable) {
        ensureLabelIsMutable();
        com.google.v.c.addAll(iterable, this.label_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLanguage(Iterable<String> iterable) {
        ensureLanguageIsMutable();
        com.google.v.c.addAll(iterable, this.language_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServiceLocationFeature(Iterable<? extends bw> iterable) {
        ensureServiceLocationFeatureIsMutable();
        com.google.v.c.addAll(iterable, this.serviceLocationFeature_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCallRate(int i2, fe feVar) {
        Objects.requireNonNull(feVar);
        ensureCallRateIsMutable();
        this.callRate_.add(i2, feVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFlag(jh jhVar) {
        Objects.requireNonNull(jhVar);
        ensureFlagIsMutable();
        this.flag_.i(jhVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabel(int i2, eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureLabelIsMutable();
        this.label_.add(i2, ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguage(String str) {
        Objects.requireNonNull(str);
        ensureLanguageIsMutable();
        this.language_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguageBytes(com.google.v.v vVar) {
        ensureLanguageIsMutable();
        this.language_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServiceLocationFeature(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureServiceLocationFeatureIsMutable();
        this.serviceLocationFeature_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallRate() {
        this.callRate_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContactCategory() {
        this.bitField0_ &= -17;
        this.contactCategory_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlag() {
        this.flag_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSharedNumber() {
        this.bitField0_ &= -9;
        this.isSharedNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhoneNumber() {
        this.phoneNumber_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceLocationFeature() {
        this.serviceLocationFeature_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -5;
        this.type_ = 0;
    }

    private void ensureCallRateIsMutable() {
        com.google.v.eo<fe> eoVar = this.callRate_;
        if (eoVar.c()) {
            return;
        }
        this.callRate_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureFlagIsMutable() {
        com.google.v.ek ekVar = this.flag_;
        if (ekVar.c()) {
            return;
        }
        this.flag_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureLabelIsMutable() {
        com.google.v.eo<eh> eoVar = this.label_;
        if (eoVar.c()) {
            return;
        }
        this.label_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureLanguageIsMutable() {
        com.google.v.eo<String> eoVar = this.language_;
        if (eoVar.c()) {
            return;
        }
        this.language_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureServiceLocationFeatureIsMutable() {
        com.google.v.eo<bw> eoVar = this.serviceLocationFeature_;
        if (eoVar.c()) {
            return;
        }
        this.serviceLocationFeature_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static jj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNumber(com.google.p.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.p.a.a.b bVar2 = this.number_;
        if (bVar2 != null && bVar2 != com.google.p.a.a.b.getDefaultInstance()) {
            com.google.p.a.a.a aVarNewBuilder = com.google.p.a.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.p.a.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.number_ = bVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePhoneNumber(com.google.m.a.a.d dVar) {
        Objects.requireNonNull(dVar);
        com.google.m.a.a.d dVar2 = this.phoneNumber_;
        if (dVar2 != null && dVar2 != com.google.m.a.a.d.getDefaultInstance()) {
            com.google.m.a.a.a aVarNewBuilder = com.google.m.a.a.d.newBuilder(dVar2);
            aVarNewBuilder.mergeFrom((com.google.m.a.a.a) dVar);
            dVar = aVarNewBuilder.buildPartial();
        }
        this.phoneNumber_ = dVar;
        this.bitField0_ |= 2;
    }

    public static jf newBuilder() {
        return (jf) DEFAULT_INSTANCE.createBuilder();
    }

    public static jj parseDelimitedFrom(InputStream inputStream) {
        return (jj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jj parseFrom(com.google.v.v vVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCallRate(int i2) {
        ensureCallRateIsMutable();
        this.callRate_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabel(int i2) {
        ensureLabelIsMutable();
        this.label_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeServiceLocationFeature(int i2) {
        ensureServiceLocationFeatureIsMutable();
        this.serviceLocationFeature_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallRate(int i2, fe feVar) {
        Objects.requireNonNull(feVar);
        ensureCallRateIsMutable();
        this.callRate_.set(i2, feVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContactCategory(jg jgVar) {
        this.contactCategory_ = jgVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlag(int i2, jh jhVar) {
        Objects.requireNonNull(jhVar);
        ensureFlagIsMutable();
        this.flag_.e(i2, jhVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSharedNumber(boolean z) {
        this.bitField0_ |= 8;
        this.isSharedNumber_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(int i2, eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureLabelIsMutable();
        this.label_.set(i2, ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(int i2, String str) {
        Objects.requireNonNull(str);
        ensureLanguageIsMutable();
        this.language_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(com.google.p.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.number_ = bVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneNumber(com.google.m.a.a.d dVar) {
        Objects.requireNonNull(dVar);
        this.phoneNumber_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceLocationFeature(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureServiceLocationFeatureIsMutable();
        this.serviceLocationFeature_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ji jiVar) {
        this.type_ = jiVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001Ǵ\u000b\u0000\u0005\u0003\u0001ဉ\u0000\u0002᠌\u0002\u0003Л\u0004\u001a\u0005ဇ\u0003\u0007ࠞ\b\u001b\tᐉ\u0001\n᠌\u0004\u000bЛǴဉ\u0005", new Object[]{"bitField0_", "number_", "type_", hs.s, "label_", eh.class, "language_", "isSharedNumber_", "flag_", hs.r, "callRate_", fe.class, "phoneNumber_", "contactCategory_", hs.q, "serviceLocationFeature_", bw.class, "metadata_"});
            case 3:
                return new jj();
            case 4:
                return new jf(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<jj> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (jj.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public fe getCallRate(int i2) {
        return this.callRate_.get(i2);
    }

    public int getCallRateCount() {
        return this.callRate_.size();
    }

    public List<fe> getCallRateList() {
        return this.callRate_;
    }

    public ff getCallRateOrBuilder(int i2) {
        return this.callRate_.get(i2);
    }

    public List<? extends ff> getCallRateOrBuilderList() {
        return this.callRate_;
    }

    public jg getContactCategory() {
        jg jgVarA = jg.a(this.contactCategory_);
        return jgVarA == null ? jg.CONTACT_CATEGORY_UNSPECIFIED : jgVarA;
    }

    public jh getFlag(int i2) {
        jh jhVarA = jh.a(this.flag_.d(i2));
        return jhVarA == null ? jh.FLAG_NO_COLD_CALLS : jhVarA;
    }

    public int getFlagCount() {
        return this.flag_.size();
    }

    public List<jh> getFlagList() {
        return new com.google.v.em(this.flag_, flag_converter_);
    }

    public boolean getIsSharedNumber() {
        return this.isSharedNumber_;
    }

    public eh getLabel(int i2) {
        return this.label_.get(i2);
    }

    public int getLabelCount() {
        return this.label_.size();
    }

    public List<eh> getLabelList() {
        return this.label_;
    }

    public ei getLabelOrBuilder(int i2) {
        return this.label_.get(i2);
    }

    public List<? extends ei> getLabelOrBuilderList() {
        return this.label_;
    }

    public String getLanguage(int i2) {
        return this.language_.get(i2);
    }

    public com.google.v.v getLanguageBytes(int i2) {
        return com.google.v.v.s(this.language_.get(i2));
    }

    public int getLanguageCount() {
        return this.language_.size();
    }

    public List<String> getLanguageList() {
        return this.language_;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    @Deprecated
    public com.google.p.a.a.b getNumber() {
        com.google.p.a.a.b bVar = this.number_;
        return bVar == null ? com.google.p.a.a.b.getDefaultInstance() : bVar;
    }

    public com.google.m.a.a.d getPhoneNumber() {
        com.google.m.a.a.d dVar = this.phoneNumber_;
        return dVar == null ? com.google.m.a.a.d.getDefaultInstance() : dVar;
    }

    public bw getServiceLocationFeature(int i2) {
        return this.serviceLocationFeature_.get(i2);
    }

    public int getServiceLocationFeatureCount() {
        return this.serviceLocationFeature_.size();
    }

    public List<bw> getServiceLocationFeatureList() {
        return this.serviceLocationFeature_;
    }

    public bx getServiceLocationFeatureOrBuilder(int i2) {
        return this.serviceLocationFeature_.get(i2);
    }

    public List<? extends bx> getServiceLocationFeatureOrBuilderList() {
        return this.serviceLocationFeature_;
    }

    public ji getType() {
        ji jiVarA = ji.a(this.type_);
        return jiVarA == null ? ji.VOICE : jiVarA;
    }

    public boolean hasContactCategory() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsSharedNumber() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPhoneNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static jf newBuilder(jj jjVar) {
        return (jf) DEFAULT_INSTANCE.createBuilder(jjVar);
    }

    public static jj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jj parseFrom(com.google.v.z zVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCallRate(fe feVar) {
        Objects.requireNonNull(feVar);
        ensureCallRateIsMutable();
        this.callRate_.add(feVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabel(eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureLabelIsMutable();
        this.label_.add(ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServiceLocationFeature(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureServiceLocationFeatureIsMutable();
        this.serviceLocationFeature_.add(bwVar);
    }

    public static jj parseFrom(InputStream inputStream) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jj parseFrom(ByteBuffer byteBuffer) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jj parseFrom(byte[] bArr) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
