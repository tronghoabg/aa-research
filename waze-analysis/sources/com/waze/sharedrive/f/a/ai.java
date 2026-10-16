package com.waze.sharedrive.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai extends du<ai, j> implements fj {
    private static final ai DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<ai> PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 3;
    public static final int URL_FOR_SHARE_FIELD_NUMBER = 2;
    private int bitField0_;
    private n destination_;
    private String name_ = "";
    private String urlForShare_ = "";
    private eo<ag> participants_ = emptyProtobufList();

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParticipants(Iterable<? extends ag> iterable) {
        ensureParticipantsIsMutable();
        com.google.v.c.addAll(iterable, this.participants_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(int i2, ag agVar) {
        Objects.requireNonNull(agVar);
        ensureParticipantsIsMutable();
        this.participants_.add(i2, agVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipants() {
        this.participants_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlForShare() {
        this.urlForShare_ = getDefaultInstance().getUrlForShare();
    }

    private void ensureParticipantsIsMutable() {
        eo<ag> eoVar = this.participants_;
        if (eoVar.c()) {
            return;
        }
        this.participants_ = du.mutableCopy(eoVar);
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.destination_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            k kVarNewBuilder = n.newBuilder(nVar2);
            kVarNewBuilder.mergeFrom((k) nVar);
            nVar = kVarNewBuilder.buildPartial();
        }
        this.destination_ = nVar;
        this.bitField0_ |= 1;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParticipants(int i2) {
        ensureParticipantsIsMutable();
        this.participants_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(n nVar) {
        Objects.requireNonNull(nVar);
        this.destination_ = nVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipants(int i2, ag agVar) {
        Objects.requireNonNull(agVar);
        ensureParticipantsIsMutable();
        this.participants_.set(i2, agVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlForShare(String str) {
        Objects.requireNonNull(str);
        this.urlForShare_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlForShareBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.urlForShare_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "name_", "urlForShare_", "participants_", ag.class, "destination_"});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public n getDestination() {
        n nVar = this.destination_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public ag getParticipants(int i2) {
        return this.participants_.get(i2);
    }

    public int getParticipantsCount() {
        return this.participants_.size();
    }

    public List<ag> getParticipantsList() {
        return this.participants_;
    }

    public ah getParticipantsOrBuilder(int i2) {
        return this.participants_.get(i2);
    }

    public List<? extends ah> getParticipantsOrBuilderList() {
        return this.participants_;
    }

    public String getUrlForShare() {
        return this.urlForShare_;
    }

    public com.google.v.v getUrlForShareBytes() {
        return com.google.v.v.s(this.urlForShare_);
    }

    public boolean hasDestination() {
        return (this.bitField0_ & 1) != 0;
    }

    public static j newBuilder(ai aiVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(ag agVar) {
        Objects.requireNonNull(agVar);
        ensureParticipantsIsMutable();
        this.participants_.add(agVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
