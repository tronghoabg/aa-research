package com.waze.jni.protos.network;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.network.TransactionStatsMessage;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ResultStructMessage extends du<ResultStructMessage, Builder> implements ResultStructMessageOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int ANALYTICS_FIELD_NUMBER = 9;
    public static final int BODY_FIELD_NUMBER = 3;
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int DEEPLINK_FIELD_NUMBER = 5;
    private static final ResultStructMessage DEFAULT_INSTANCE;
    public static final int ERRORCODE_FIELD_NUMBER = 10;
    public static final int HIDECLOSEBUTTON_FIELD_NUMBER = 7;
    private static volatile fo<ResultStructMessage> PARSER = null;
    public static final int SHOWASTOAST_FIELD_NUMBER = 6;
    public static final int STATS_FIELD_NUMBER = 11;
    public static final int TERMINAL_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int code_;
    private boolean hideCloseButton_;
    private boolean showAsToast_;
    private TransactionStatsMessage stats_;
    private boolean terminal_;
    private String title_ = "";
    private String body_ = "";
    private String action_ = "";
    private String deepLink_ = "";
    private String analytics_ = "";
    private String errorCode_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.network.ResultStructMessage$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ResultStructMessage resultStructMessage = new ResultStructMessage();
        DEFAULT_INSTANCE = resultStructMessage;
        du.registerDefaultInstance(ResultStructMessage.class, resultStructMessage);
    }

    private ResultStructMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = getDefaultInstance().getAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnalytics() {
        this.analytics_ = getDefaultInstance().getAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeepLink() {
        this.deepLink_ = getDefaultInstance().getDeepLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = getDefaultInstance().getErrorCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideCloseButton() {
        this.hideCloseButton_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowAsToast() {
        this.showAsToast_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStats() {
        this.stats_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTerminal() {
        this.terminal_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static ResultStructMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStats(TransactionStatsMessage transactionStatsMessage) {
        Objects.requireNonNull(transactionStatsMessage);
        TransactionStatsMessage transactionStatsMessage2 = this.stats_;
        if (transactionStatsMessage2 != null && transactionStatsMessage2 != TransactionStatsMessage.getDefaultInstance()) {
            TransactionStatsMessage.Builder builderNewBuilder = TransactionStatsMessage.newBuilder(transactionStatsMessage2);
            builderNewBuilder.mergeFrom((TransactionStatsMessage.Builder) transactionStatsMessage);
            transactionStatsMessage = builderNewBuilder.buildPartial();
        }
        this.stats_ = transactionStatsMessage;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResultStructMessage parseDelimitedFrom(InputStream inputStream) {
        return (ResultStructMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResultStructMessage parseFrom(v vVar) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ResultStructMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(String str) {
        Objects.requireNonNull(str);
        this.action_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.action_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalytics(String str) {
        Objects.requireNonNull(str);
        this.analytics_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.analytics_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(String str) {
        Objects.requireNonNull(str);
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.body_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i2) {
        this.code_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeepLink(String str) {
        Objects.requireNonNull(str);
        this.deepLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeepLinkBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deepLink_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(String str) {
        Objects.requireNonNull(str);
        this.errorCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCodeBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorCode_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideCloseButton(boolean z) {
        this.hideCloseButton_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowAsToast(boolean z) {
        this.showAsToast_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStats(TransactionStatsMessage transactionStatsMessage) {
        Objects.requireNonNull(transactionStatsMessage);
        this.stats_ = transactionStatsMessage;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTerminal(boolean z) {
        this.terminal_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007\u0007\b\u0007\tȈ\nȈ\u000bဉ\u0000", new Object[]{"bitField0_", "code_", "title_", "body_", "action_", "deepLink_", "showAsToast_", "hideCloseButton_", "terminal_", "analytics_", "errorCode_", "stats_"});
        }
        if (iOrdinal == 3) {
            return new ResultStructMessage();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ResultStructMessage> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ResultStructMessage.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public String getAction() {
        return this.action_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public v getActionBytes() {
        return v.s(this.action_);
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public String getAnalytics() {
        return this.analytics_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public v getAnalyticsBytes() {
        return v.s(this.analytics_);
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public String getBody() {
        return this.body_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public v getBodyBytes() {
        return v.s(this.body_);
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public String getDeepLink() {
        return this.deepLink_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public v getDeepLinkBytes() {
        return v.s(this.deepLink_);
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public String getErrorCode() {
        return this.errorCode_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public v getErrorCodeBytes() {
        return v.s(this.errorCode_);
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public boolean getHideCloseButton() {
        return this.hideCloseButton_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public boolean getShowAsToast() {
        return this.showAsToast_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public TransactionStatsMessage getStats() {
        TransactionStatsMessage transactionStatsMessage = this.stats_;
        return transactionStatsMessage == null ? TransactionStatsMessage.getDefaultInstance() : transactionStatsMessage;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public boolean getTerminal() {
        return this.terminal_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
    public boolean hasStats() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ResultStructMessage resultStructMessage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(resultStructMessage);
    }

    public static ResultStructMessage parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ResultStructMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ResultStructMessage parseFrom(v vVar, de deVar) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ResultStructMessage parseFrom(z zVar) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ResultStructMessage parseFrom(z zVar, de deVar) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ResultStructMessage parseFrom(InputStream inputStream) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResultStructMessage parseFrom(InputStream inputStream, de deVar) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ResultStructMessage parseFrom(ByteBuffer byteBuffer) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ResultStructMessage parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<ResultStructMessage, Builder> implements ResultStructMessageOrBuilder {
        private Builder() {
            super(ResultStructMessage.DEFAULT_INSTANCE);
        }

        public Builder clearAction() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearAction();
            return this;
        }

        public Builder clearAnalytics() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearAnalytics();
            return this;
        }

        public Builder clearBody() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearBody();
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearCode();
            return this;
        }

        public Builder clearDeepLink() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearDeepLink();
            return this;
        }

        public Builder clearErrorCode() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearErrorCode();
            return this;
        }

        public Builder clearHideCloseButton() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearHideCloseButton();
            return this;
        }

        public Builder clearShowAsToast() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearShowAsToast();
            return this;
        }

        public Builder clearStats() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearStats();
            return this;
        }

        public Builder clearTerminal() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearTerminal();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ResultStructMessage) this.instance).clearTitle();
            return this;
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public String getAction() {
            return ((ResultStructMessage) this.instance).getAction();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public v getActionBytes() {
            return ((ResultStructMessage) this.instance).getActionBytes();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public String getAnalytics() {
            return ((ResultStructMessage) this.instance).getAnalytics();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public v getAnalyticsBytes() {
            return ((ResultStructMessage) this.instance).getAnalyticsBytes();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public String getBody() {
            return ((ResultStructMessage) this.instance).getBody();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public v getBodyBytes() {
            return ((ResultStructMessage) this.instance).getBodyBytes();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public int getCode() {
            return ((ResultStructMessage) this.instance).getCode();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public String getDeepLink() {
            return ((ResultStructMessage) this.instance).getDeepLink();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public v getDeepLinkBytes() {
            return ((ResultStructMessage) this.instance).getDeepLinkBytes();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public String getErrorCode() {
            return ((ResultStructMessage) this.instance).getErrorCode();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public v getErrorCodeBytes() {
            return ((ResultStructMessage) this.instance).getErrorCodeBytes();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public boolean getHideCloseButton() {
            return ((ResultStructMessage) this.instance).getHideCloseButton();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public boolean getShowAsToast() {
            return ((ResultStructMessage) this.instance).getShowAsToast();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public TransactionStatsMessage getStats() {
            return ((ResultStructMessage) this.instance).getStats();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public boolean getTerminal() {
            return ((ResultStructMessage) this.instance).getTerminal();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public String getTitle() {
            return ((ResultStructMessage) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public v getTitleBytes() {
            return ((ResultStructMessage) this.instance).getTitleBytes();
        }

        @Override // com.waze.jni.protos.network.ResultStructMessageOrBuilder
        public boolean hasStats() {
            return ((ResultStructMessage) this.instance).hasStats();
        }

        public Builder mergeStats(TransactionStatsMessage transactionStatsMessage) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).mergeStats(transactionStatsMessage);
            return this;
        }

        public Builder setAction(String str) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setAction(str);
            return this;
        }

        public Builder setActionBytes(v vVar) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setActionBytes(vVar);
            return this;
        }

        public Builder setAnalytics(String str) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setAnalytics(str);
            return this;
        }

        public Builder setAnalyticsBytes(v vVar) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setAnalyticsBytes(vVar);
            return this;
        }

        public Builder setBody(String str) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setBody(str);
            return this;
        }

        public Builder setBodyBytes(v vVar) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setBodyBytes(vVar);
            return this;
        }

        public Builder setCode(int i2) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setCode(i2);
            return this;
        }

        public Builder setDeepLink(String str) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setDeepLink(str);
            return this;
        }

        public Builder setDeepLinkBytes(v vVar) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setDeepLinkBytes(vVar);
            return this;
        }

        public Builder setErrorCode(String str) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setErrorCode(str);
            return this;
        }

        public Builder setErrorCodeBytes(v vVar) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setErrorCodeBytes(vVar);
            return this;
        }

        public Builder setHideCloseButton(boolean z) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setHideCloseButton(z);
            return this;
        }

        public Builder setShowAsToast(boolean z) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setShowAsToast(z);
            return this;
        }

        public Builder setStats(TransactionStatsMessage.Builder builder) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setStats(builder.build());
            return this;
        }

        public Builder setTerminal(boolean z) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setTerminal(z);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setTitleBytes(vVar);
            return this;
        }

        public Builder setStats(TransactionStatsMessage transactionStatsMessage) {
            copyOnWrite();
            ((ResultStructMessage) this.instance).setStats(transactionStatsMessage);
            return this;
        }
    }

    public static ResultStructMessage parseFrom(byte[] bArr) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResultStructMessage parseFrom(byte[] bArr, de deVar) {
        return (ResultStructMessage) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
