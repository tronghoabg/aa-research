package com.google.v;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class co extends dq<co, cg> implements fj {
    public static final int CLIENT_LOGGING_FIELD_NUMBER = 11;
    public static final int CLIENT_MAX_TOKENS_FIELD_NUMBER = 30;
    public static final int CLIENT_STREAMING_FIELD_NUMBER = 20;
    public static final int DEADLINE_FIELD_NUMBER = 8;
    private static final co DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int DUPLICATE_SUPPRESSION_FIELD_NUMBER = 9;
    public static final int END_USER_CREDS_REQUESTED_FIELD_NUMBER = 26;
    public static final int FAIL_FAST_FIELD_NUMBER = 10;
    public static final int FEATURES_FIELD_NUMBER = 35;
    public static final int GO_LEGACY_CHANNEL_API_FIELD_NUMBER = 29;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    public static final int LEGACY_CLIENT_INITIAL_TOKENS_FIELD_NUMBER = 24;
    public static final int LEGACY_RESULT_TYPE_FIELD_NUMBER = 23;
    public static final int LEGACY_SERVER_INITIAL_TOKENS_FIELD_NUMBER = 25;
    public static final int LEGACY_STREAM_TYPE_FIELD_NUMBER = 22;
    public static final int LEGACY_TOKEN_UNIT_FIELD_NUMBER = 28;
    public static final int LOG_LEVEL_FIELD_NUMBER = 27;
    private static volatile fo<co> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 7;
    public static final int REQUEST_FORMAT_FIELD_NUMBER = 17;
    public static final int RESPONSE_FORMAT_FIELD_NUMBER = 15;
    public static final int SECURITY_LABEL_FIELD_NUMBER = 19;
    public static final int SECURITY_LEVEL_FIELD_NUMBER = 13;
    public static final int SERVER_LOGGING_FIELD_NUMBER = 12;
    public static final int SERVER_MAX_TOKENS_FIELD_NUMBER = 31;
    public static final int SERVER_REQUIRED_SECURITY_LEVEL_FIELD_NUMBER = 14;
    public static final int SERVER_STREAMING_FIELD_NUMBER = 21;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean clientStreaming_;
    private boolean deprecated_;
    private boolean duplicateSuppression_;
    private boolean endUserCredsRequested_;
    private boolean failFast_;
    private bj features_;
    private boolean goLegacyChannelApi_;
    private int idempotencyLevel_;
    private int protocol_;
    private int requestFormat_;
    private int responseFormat_;
    private int securityLevel_;
    private boolean serverStreaming_;
    private byte memoizedIsInitialized = 2;
    private double deadline_ = -1.0d;
    private int clientLogging_ = 256;
    private int serverLogging_ = 256;
    private int serverRequiredSecurityLevel_ = 3;
    private String securityLabel_ = "";
    private String legacyStreamType_ = "";
    private String legacyResultType_ = "";
    private long legacyClientInitialTokens_ = -1;
    private long legacyServerInitialTokens_ = -1;
    private long clientMaxTokens_ = 16000000;
    private long serverMaxTokens_ = 16000000;
    private int legacyTokenUnit_ = 2;
    private int logLevel_ = 2;
    private eo<cx> uninterpretedOption_ = emptyProtobufList();

    static {
        co coVar = new co();
        DEFAULT_INSTANCE = coVar;
        du.registerDefaultInstance(co.class, coVar);
    }

    private co() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends cx> iterable) {
        ensureUninterpretedOptionIsMutable();
        c.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientLogging() {
        this.bitField0_ &= -33;
        this.clientLogging_ = 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientMaxTokens() {
        this.bitField0_ &= -524289;
        this.clientMaxTokens_ = 16000000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStreaming() {
        this.bitField0_ &= -4097;
        this.clientStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeadline() {
        this.bitField0_ &= -3;
        this.deadline_ = -1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -8388609;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuplicateSuppression() {
        this.bitField0_ &= -5;
        this.duplicateSuppression_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndUserCredsRequested() {
        this.bitField0_ &= -17;
        this.endUserCredsRequested_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailFast() {
        this.bitField0_ &= -9;
        this.failFast_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -33554433;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoLegacyChannelApi() {
        this.bitField0_ &= -65537;
        this.goLegacyChannelApi_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdempotencyLevel() {
        this.bitField0_ &= -16777217;
        this.idempotencyLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyClientInitialTokens() {
        this.bitField0_ &= -131073;
        this.legacyClientInitialTokens_ = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyResultType() {
        this.bitField0_ &= -32769;
        this.legacyResultType_ = getDefaultInstance().getLegacyResultType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyServerInitialTokens() {
        this.bitField0_ &= -262145;
        this.legacyServerInitialTokens_ = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyStreamType() {
        this.bitField0_ &= -16385;
        this.legacyStreamType_ = getDefaultInstance().getLegacyStreamType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyTokenUnit() {
        this.bitField0_ &= -2097153;
        this.legacyTokenUnit_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogLevel() {
        this.bitField0_ &= -4194305;
        this.logLevel_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.bitField0_ &= -2;
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestFormat() {
        this.bitField0_ &= -1025;
        this.requestFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseFormat() {
        this.bitField0_ &= -513;
        this.responseFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecurityLabel() {
        this.bitField0_ &= -2049;
        this.securityLabel_ = getDefaultInstance().getSecurityLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecurityLevel() {
        this.bitField0_ &= -129;
        this.securityLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerLogging() {
        this.bitField0_ &= -65;
        this.serverLogging_ = 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerMaxTokens() {
        this.bitField0_ &= -1048577;
        this.serverMaxTokens_ = 16000000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerRequiredSecurityLevel() {
        this.bitField0_ &= -257;
        this.serverRequiredSecurityLevel_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerStreaming() {
        this.bitField0_ &= -8193;
        this.serverStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        eo<cx> eoVar = this.uninterpretedOption_;
        if (eoVar.c()) {
            return;
        }
        this.uninterpretedOption_ = du.mutableCopy(eoVar);
    }

    public static co getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        bj bjVar2 = this.features_;
        if (bjVar2 != null && bjVar2 != bj.getDefaultInstance()) {
            az azVarNewBuilder = bj.newBuilder(bjVar2);
            azVarNewBuilder.mergeFrom((az) bjVar);
            bjVar = azVarNewBuilder.buildPartial();
        }
        this.features_ = bjVar;
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    public static cg newBuilder() {
        return (cg) DEFAULT_INSTANCE.createBuilder();
    }

    public static co parseDelimitedFrom(InputStream inputStream) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(v vVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<co> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientLogging(int i2) {
        this.bitField0_ |= 32;
        this.clientLogging_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientMaxTokens(long j2) {
        this.bitField0_ |= 524288;
        this.clientMaxTokens_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStreaming(boolean z) {
        this.bitField0_ |= 4096;
        this.clientStreaming_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeadline(double d2) {
        this.bitField0_ |= 2;
        this.deadline_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z) {
        this.bitField0_ |= 8388608;
        this.deprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuplicateSuppression(boolean z) {
        this.bitField0_ |= 4;
        this.duplicateSuppression_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndUserCredsRequested(boolean z) {
        this.bitField0_ |= 16;
        this.endUserCredsRequested_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailFast(boolean z) {
        this.bitField0_ |= 8;
        this.failFast_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoLegacyChannelApi(boolean z) {
        this.bitField0_ |= 65536;
        this.goLegacyChannelApi_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdempotencyLevel(ci ciVar) {
        this.idempotencyLevel_ = ciVar.getNumber();
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyClientInitialTokens(long j2) {
        this.bitField0_ |= 131072;
        this.legacyClientInitialTokens_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyResultType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.legacyResultType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyResultTypeBytes(v vVar) {
        this.legacyResultType_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyServerInitialTokens(long j2) {
        this.bitField0_ |= 262144;
        this.legacyServerInitialTokens_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyStreamType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.legacyStreamType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyStreamTypeBytes(v vVar) {
        this.legacyStreamType_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyTokenUnit(cn cnVar) {
        this.legacyTokenUnit_ = cnVar.getNumber();
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogLevel(cj cjVar) {
        this.logLevel_ = cjVar.getNumber();
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(ck ckVar) {
        this.protocol_ = ckVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestFormat(ch chVar) {
        this.requestFormat_ = chVar.getNumber();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseFormat(ch chVar) {
        this.responseFormat_ = chVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.securityLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityLabelBytes(v vVar) {
        this.securityLabel_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityLevel(cm cmVar) {
        this.securityLevel_ = cmVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerLogging(int i2) {
        this.bitField0_ |= 64;
        this.serverLogging_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerMaxTokens(long j2) {
        this.bitField0_ |= 1048576;
        this.serverMaxTokens_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerRequiredSecurityLevel(cm cmVar) {
        this.serverRequiredSecurityLevel_ = cmVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerStreaming(boolean z) {
        this.bitField0_ |= 8192;
        this.serverStreaming_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i2, cxVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                ei eiVar = cl.f12813a;
                ei eiVar2 = ai.s;
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0007ϧ\u001b\u0000\u0001\u0002\u0007᠌\u0000\bက\u0001\tဇ\u0002\nဇ\u0003\u000bဏ\u0005\fဏ\u0006\r᠌\u0007\u000e᠌\b\u000f᠌\t\u0011᠌\n\u0013ဈ\u000b\u0014ဇ\f\u0015ဇ\r\u0016ဈ\u000e\u0017ဈ\u000f\u0018ဂ\u0011\u0019ဂ\u0012\u001aဇ\u0004\u001b᠌\u0016\u001c᠌\u0015\u001dဇ\u0010\u001eဂ\u0013\u001fဂ\u0014!ဇ\u0017\"᠌\u0018#ᐉ\u0019ϧЛ", new Object[]{"bitField0_", "protocol_", cl.f12814b, "deadline_", "duplicateSuppression_", "failFast_", "clientLogging_", "serverLogging_", "securityLevel_", eiVar, "serverRequiredSecurityLevel_", eiVar, "responseFormat_", eiVar2, "requestFormat_", eiVar2, "securityLabel_", "clientStreaming_", "serverStreaming_", "legacyStreamType_", "legacyResultType_", "legacyClientInitialTokens_", "legacyServerInitialTokens_", "endUserCredsRequested_", "logLevel_", ai.u, "legacyTokenUnit_", cl.f12815c, "goLegacyChannelApi_", "clientMaxTokens_", "serverMaxTokens_", "deprecated_", "idempotencyLevel_", ai.t, "features_", "uninterpretedOption_", cx.class});
            case 3:
                return new co();
            case 4:
                return new cg(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<co> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (co.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public int getClientLogging() {
        return this.clientLogging_;
    }

    public long getClientMaxTokens() {
        return this.clientMaxTokens_;
    }

    public boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    public double getDeadline() {
        return this.deadline_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public boolean getDuplicateSuppression() {
        return this.duplicateSuppression_;
    }

    public boolean getEndUserCredsRequested() {
        return this.endUserCredsRequested_;
    }

    public boolean getFailFast() {
        return this.failFast_;
    }

    public bj getFeatures() {
        bj bjVar = this.features_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public boolean getGoLegacyChannelApi() {
        return this.goLegacyChannelApi_;
    }

    public ci getIdempotencyLevel() {
        ci ciVarA = ci.a(this.idempotencyLevel_);
        return ciVarA == null ? ci.IDEMPOTENCY_UNKNOWN : ciVarA;
    }

    public long getLegacyClientInitialTokens() {
        return this.legacyClientInitialTokens_;
    }

    public String getLegacyResultType() {
        return this.legacyResultType_;
    }

    public v getLegacyResultTypeBytes() {
        return v.s(this.legacyResultType_);
    }

    public long getLegacyServerInitialTokens() {
        return this.legacyServerInitialTokens_;
    }

    public String getLegacyStreamType() {
        return this.legacyStreamType_;
    }

    public v getLegacyStreamTypeBytes() {
        return v.s(this.legacyStreamType_);
    }

    public cn getLegacyTokenUnit() {
        cn cnVarA = cn.a(this.legacyTokenUnit_);
        return cnVarA == null ? cn.BYTEGRACE : cnVarA;
    }

    public cj getLogLevel() {
        cj cjVarA = cj.a(this.logLevel_);
        return cjVarA == null ? cj.LOG_HEADER_AND_NON_PRIVATE_PAYLOAD_INTERNAL : cjVarA;
    }

    public ck getProtocol() {
        ck ckVarA = ck.a(this.protocol_);
        return ckVarA == null ? ck.TCP : ckVarA;
    }

    public ch getRequestFormat() {
        ch chVarA = ch.a(this.requestFormat_);
        return chVarA == null ? ch.UNCOMPRESSED : chVarA;
    }

    public ch getResponseFormat() {
        ch chVarA = ch.a(this.responseFormat_);
        return chVarA == null ? ch.UNCOMPRESSED : chVarA;
    }

    public String getSecurityLabel() {
        return this.securityLabel_;
    }

    public v getSecurityLabelBytes() {
        return v.s(this.securityLabel_);
    }

    public cm getSecurityLevel() {
        cm cmVarA = cm.a(this.securityLevel_);
        return cmVarA == null ? cm.NONE : cmVarA;
    }

    public int getServerLogging() {
        return this.serverLogging_;
    }

    public long getServerMaxTokens() {
        return this.serverMaxTokens_;
    }

    public cm getServerRequiredSecurityLevel() {
        cm cmVarA = cm.a(this.serverRequiredSecurityLevel_);
        return cmVarA == null ? cm.STRONG_PRIVACY_AND_INTEGRITY : cmVarA;
    }

    public boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    public cx getUninterpretedOption(int i2) {
        return this.uninterpretedOption_.get(i2);
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public List<cx> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public cy getUninterpretedOptionOrBuilder(int i2) {
        return this.uninterpretedOption_.get(i2);
    }

    public List<? extends cy> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public boolean hasClientLogging() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClientMaxTokens() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasClientStreaming() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasDeadline() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDeprecated() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasDuplicateSuppression() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEndUserCredsRequested() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFailFast() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFeatures() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasGoLegacyChannelApi() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasIdempotencyLevel() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasLegacyClientInitialTokens() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasLegacyResultType() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasLegacyServerInitialTokens() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasLegacyStreamType() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasLegacyTokenUnit() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasLogLevel() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasProtocol() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRequestFormat() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasResponseFormat() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasSecurityLabel() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasSecurityLevel() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasServerLogging() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasServerMaxTokens() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasServerRequiredSecurityLevel() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasServerStreaming() {
        return (this.bitField0_ & 8192) != 0;
    }

    public static cg newBuilder(co coVar) {
        return (cg) DEFAULT_INSTANCE.createBuilder(coVar);
    }

    public static co parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(v vVar, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static co parseFrom(z zVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static co parseFrom(z zVar, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    public static co parseFrom(InputStream inputStream) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(InputStream inputStream, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(ByteBuffer byteBuffer) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static co parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static co parseFrom(byte[] bArr) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static co parseFrom(byte[] bArr, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
