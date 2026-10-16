package com.waze.jni.protos.nav_connect;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavConnectState extends du<NavConnectState, Builder> implements NavConnectStateOrBuilder {
    public static final int ACTIVE_FIELD_NUMBER = 4;
    private static final NavConnectState DEFAULT_INSTANCE;
    public static final int INACTIVE_FIELD_NUMBER = 1;
    private static volatile fo<NavConnectState> PARSER = null;
    public static final int PAUSED_FIELD_NUMBER = 5;
    public static final int PENDING_TOKEN_VALIDATION_FIELD_NUMBER = 2;
    public static final int PENDING_USER_CONSENT_FIELD_NUMBER = 3;
    private int stateCase_ = 0;
    private Object state_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.nav_connect.NavConnectState$1, reason: invalid class name */
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

    /* compiled from: WazeSource */
    public interface ActiveOrBuilder extends fj {
        String getExternalTripToken();

        v getExternalTripTokenBytes();

        NavConnectPartnerAppInfo getPartnerAppInfo();

        boolean hasPartnerAppInfo();
    }

    /* compiled from: WazeSource */
    public interface InactiveOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface PausedOrBuilder extends fj {
        String getExternalTripToken();

        v getExternalTripTokenBytes();

        NavConnectPartnerAppInfo getPartnerAppInfo();

        boolean hasPartnerAppInfo();
    }

    /* compiled from: WazeSource */
    public interface PendingTokenValidationOrBuilder extends fj {
        String getExternalTripToken();

        v getExternalTripTokenBytes();
    }

    /* compiled from: WazeSource */
    public interface PendingUserConsentOrBuilder extends fj {
        String getExternalTripToken();

        v getExternalTripTokenBytes();

        PendingUserConsent.InvalidationReason getInvalidationReason();

        int getInvalidationReasonValue();

        NavConnectPartnerAppInfo getPartnerAppInfo();

        boolean hasPartnerAppInfo();
    }

    /* compiled from: WazeSource */
    public enum StateCase {
        INACTIVE(1),
        PENDING_TOKEN_VALIDATION(2),
        PENDING_USER_CONSENT(3),
        ACTIVE(4),
        PAUSED(5),
        STATE_NOT_SET(0);

        private final int value;

        StateCase(int i2) {
            this.value = i2;
        }

        public static StateCase forNumber(int i2) {
            if (i2 == 0) {
                return STATE_NOT_SET;
            }
            if (i2 == 1) {
                return INACTIVE;
            }
            if (i2 == 2) {
                return PENDING_TOKEN_VALIDATION;
            }
            if (i2 == 3) {
                return PENDING_USER_CONSENT;
            }
            if (i2 == 4) {
                return ACTIVE;
            }
            if (i2 != 5) {
                return null;
            }
            return PAUSED;
        }

        public int getNumber() {
            return this.value;
        }
    }

    static {
        NavConnectState navConnectState = new NavConnectState();
        DEFAULT_INSTANCE = navConnectState;
        du.registerDefaultInstance(NavConnectState.class, navConnectState);
    }

    private NavConnectState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActive() {
        if (this.stateCase_ == 4) {
            this.stateCase_ = 0;
            this.state_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInactive() {
        if (this.stateCase_ == 1) {
            this.stateCase_ = 0;
            this.state_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaused() {
        if (this.stateCase_ == 5) {
            this.stateCase_ = 0;
            this.state_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPendingTokenValidation() {
        if (this.stateCase_ == 2) {
            this.stateCase_ = 0;
            this.state_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPendingUserConsent() {
        if (this.stateCase_ == 3) {
            this.stateCase_ = 0;
            this.state_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.stateCase_ = 0;
        this.state_ = null;
    }

    public static NavConnectState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActive(Active active) {
        Objects.requireNonNull(active);
        if (this.stateCase_ == 4 && this.state_ != Active.getDefaultInstance()) {
            Active.Builder builderNewBuilder = Active.newBuilder((Active) this.state_);
            builderNewBuilder.mergeFrom((Active.Builder) active);
            active = builderNewBuilder.buildPartial();
        }
        this.state_ = active;
        this.stateCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInactive(Inactive inactive) {
        Objects.requireNonNull(inactive);
        if (this.stateCase_ == 1 && this.state_ != Inactive.getDefaultInstance()) {
            Inactive.Builder builderNewBuilder = Inactive.newBuilder((Inactive) this.state_);
            builderNewBuilder.mergeFrom((Inactive.Builder) inactive);
            inactive = builderNewBuilder.buildPartial();
        }
        this.state_ = inactive;
        this.stateCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePaused(Paused paused) {
        Objects.requireNonNull(paused);
        if (this.stateCase_ == 5 && this.state_ != Paused.getDefaultInstance()) {
            Paused.Builder builderNewBuilder = Paused.newBuilder((Paused) this.state_);
            builderNewBuilder.mergeFrom((Paused.Builder) paused);
            paused = builderNewBuilder.buildPartial();
        }
        this.state_ = paused;
        this.stateCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePendingTokenValidation(PendingTokenValidation pendingTokenValidation) {
        Objects.requireNonNull(pendingTokenValidation);
        if (this.stateCase_ == 2 && this.state_ != PendingTokenValidation.getDefaultInstance()) {
            PendingTokenValidation.Builder builderNewBuilder = PendingTokenValidation.newBuilder((PendingTokenValidation) this.state_);
            builderNewBuilder.mergeFrom((PendingTokenValidation.Builder) pendingTokenValidation);
            pendingTokenValidation = builderNewBuilder.buildPartial();
        }
        this.state_ = pendingTokenValidation;
        this.stateCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePendingUserConsent(PendingUserConsent pendingUserConsent) {
        Objects.requireNonNull(pendingUserConsent);
        if (this.stateCase_ == 3 && this.state_ != PendingUserConsent.getDefaultInstance()) {
            PendingUserConsent.Builder builderNewBuilder = PendingUserConsent.newBuilder((PendingUserConsent) this.state_);
            builderNewBuilder.mergeFrom((PendingUserConsent.Builder) pendingUserConsent);
            pendingUserConsent = builderNewBuilder.buildPartial();
        }
        this.state_ = pendingUserConsent;
        this.stateCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavConnectState parseDelimitedFrom(InputStream inputStream) {
        return (NavConnectState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavConnectState parseFrom(v vVar) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavConnectState> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActive(Active active) {
        Objects.requireNonNull(active);
        this.state_ = active;
        this.stateCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInactive(Inactive inactive) {
        Objects.requireNonNull(inactive);
        this.state_ = inactive;
        this.stateCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaused(Paused paused) {
        Objects.requireNonNull(paused);
        this.state_ = paused;
        this.stateCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingTokenValidation(PendingTokenValidation pendingTokenValidation) {
        Objects.requireNonNull(pendingTokenValidation);
        this.state_ = pendingTokenValidation;
        this.stateCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingUserConsent(PendingUserConsent pendingUserConsent) {
        Objects.requireNonNull(pendingUserConsent);
        this.state_ = pendingUserConsent;
        this.stateCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"state_", "stateCase_", Inactive.class, PendingTokenValidation.class, PendingUserConsent.class, Active.class, Paused.class});
        }
        if (iOrdinal == 3) {
            return new NavConnectState();
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
        fo<NavConnectState> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavConnectState.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public Active getActive() {
        return this.stateCase_ == 4 ? (Active) this.state_ : Active.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public Inactive getInactive() {
        return this.stateCase_ == 1 ? (Inactive) this.state_ : Inactive.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public Paused getPaused() {
        return this.stateCase_ == 5 ? (Paused) this.state_ : Paused.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public PendingTokenValidation getPendingTokenValidation() {
        return this.stateCase_ == 2 ? (PendingTokenValidation) this.state_ : PendingTokenValidation.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public PendingUserConsent getPendingUserConsent() {
        return this.stateCase_ == 3 ? (PendingUserConsent) this.state_ : PendingUserConsent.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public StateCase getStateCase() {
        return StateCase.forNumber(this.stateCase_);
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public boolean hasActive() {
        return this.stateCase_ == 4;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public boolean hasInactive() {
        return this.stateCase_ == 1;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public boolean hasPaused() {
        return this.stateCase_ == 5;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public boolean hasPendingTokenValidation() {
        return this.stateCase_ == 2;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
    public boolean hasPendingUserConsent() {
        return this.stateCase_ == 3;
    }

    /* compiled from: WazeSource */
    public final class Active extends du<Active, Builder> implements ActiveOrBuilder {
        private static final Active DEFAULT_INSTANCE;
        public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 2;
        private static volatile fo<Active> PARSER = null;
        public static final int PARTNER_APP_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private String externalTripToken_ = "";
        private NavConnectPartnerAppInfo partnerAppInfo_;

        static {
            Active active = new Active();
            DEFAULT_INSTANCE = active;
            du.registerDefaultInstance(Active.class, active);
        }

        private Active() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalTripToken() {
            this.externalTripToken_ = getDefaultInstance().getExternalTripToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPartnerAppInfo() {
            this.partnerAppInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static Active getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
            Objects.requireNonNull(navConnectPartnerAppInfo);
            NavConnectPartnerAppInfo navConnectPartnerAppInfo2 = this.partnerAppInfo_;
            if (navConnectPartnerAppInfo2 != null && navConnectPartnerAppInfo2 != NavConnectPartnerAppInfo.getDefaultInstance()) {
                NavConnectPartnerAppInfo.Builder builderNewBuilder = NavConnectPartnerAppInfo.newBuilder(navConnectPartnerAppInfo2);
                builderNewBuilder.mergeFrom((NavConnectPartnerAppInfo.Builder) navConnectPartnerAppInfo);
                navConnectPartnerAppInfo = builderNewBuilder.buildPartial();
            }
            this.partnerAppInfo_ = navConnectPartnerAppInfo;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Active parseDelimitedFrom(InputStream inputStream) {
            return (Active) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Active parseFrom(v vVar) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Active> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalTripToken(String str) {
            Objects.requireNonNull(str);
            this.externalTripToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalTripTokenBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.externalTripToken_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
            Objects.requireNonNull(navConnectPartnerAppInfo);
            this.partnerAppInfo_ = navConnectPartnerAppInfo;
            this.bitField0_ |= 1;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "partnerAppInfo_", "externalTripToken_"});
            }
            if (iOrdinal == 3) {
                return new Active();
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
            fo<Active> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Active.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.ActiveOrBuilder
        public String getExternalTripToken() {
            return this.externalTripToken_;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.ActiveOrBuilder
        public v getExternalTripTokenBytes() {
            return v.s(this.externalTripToken_);
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.ActiveOrBuilder
        public NavConnectPartnerAppInfo getPartnerAppInfo() {
            NavConnectPartnerAppInfo navConnectPartnerAppInfo = this.partnerAppInfo_;
            return navConnectPartnerAppInfo == null ? NavConnectPartnerAppInfo.getDefaultInstance() : navConnectPartnerAppInfo;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.ActiveOrBuilder
        public boolean hasPartnerAppInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Active active) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(active);
        }

        public static Active parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Active) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Active parseFrom(v vVar, de deVar) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Active parseFrom(z zVar) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Active parseFrom(z zVar, de deVar) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Active parseFrom(InputStream inputStream) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Active parseFrom(InputStream inputStream, de deVar) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Active parseFrom(ByteBuffer byteBuffer) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Active parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<Active, Builder> implements ActiveOrBuilder {
            private Builder() {
                super(Active.DEFAULT_INSTANCE);
            }

            public Builder clearExternalTripToken() {
                copyOnWrite();
                ((Active) this.instance).clearExternalTripToken();
                return this;
            }

            public Builder clearPartnerAppInfo() {
                copyOnWrite();
                ((Active) this.instance).clearPartnerAppInfo();
                return this;
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.ActiveOrBuilder
            public String getExternalTripToken() {
                return ((Active) this.instance).getExternalTripToken();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.ActiveOrBuilder
            public v getExternalTripTokenBytes() {
                return ((Active) this.instance).getExternalTripTokenBytes();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.ActiveOrBuilder
            public NavConnectPartnerAppInfo getPartnerAppInfo() {
                return ((Active) this.instance).getPartnerAppInfo();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.ActiveOrBuilder
            public boolean hasPartnerAppInfo() {
                return ((Active) this.instance).hasPartnerAppInfo();
            }

            public Builder mergePartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                copyOnWrite();
                ((Active) this.instance).mergePartnerAppInfo(navConnectPartnerAppInfo);
                return this;
            }

            public Builder setExternalTripToken(String str) {
                copyOnWrite();
                ((Active) this.instance).setExternalTripToken(str);
                return this;
            }

            public Builder setExternalTripTokenBytes(v vVar) {
                copyOnWrite();
                ((Active) this.instance).setExternalTripTokenBytes(vVar);
                return this;
            }

            public Builder setPartnerAppInfo(NavConnectPartnerAppInfo.Builder builder) {
                copyOnWrite();
                ((Active) this.instance).setPartnerAppInfo(builder.build());
                return this;
            }

            public Builder setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                copyOnWrite();
                ((Active) this.instance).setPartnerAppInfo(navConnectPartnerAppInfo);
                return this;
            }
        }

        public static Active parseFrom(byte[] bArr) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Active parseFrom(byte[] bArr, de deVar) {
            return (Active) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Inactive extends du<Inactive, Builder> implements InactiveOrBuilder {
        private static final Inactive DEFAULT_INSTANCE;
        private static volatile fo<Inactive> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Inactive, Builder> implements InactiveOrBuilder {
            private Builder() {
                super(Inactive.DEFAULT_INSTANCE);
            }
        }

        static {
            Inactive inactive = new Inactive();
            DEFAULT_INSTANCE = inactive;
            du.registerDefaultInstance(Inactive.class, inactive);
        }

        private Inactive() {
        }

        public static Inactive getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Inactive parseDelimitedFrom(InputStream inputStream) {
            return (Inactive) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Inactive parseFrom(v vVar) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Inactive> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Inactive();
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
            fo<Inactive> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Inactive.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(Inactive inactive) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(inactive);
        }

        public static Inactive parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Inactive) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Inactive parseFrom(v vVar, de deVar) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Inactive parseFrom(z zVar) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Inactive parseFrom(z zVar, de deVar) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Inactive parseFrom(InputStream inputStream) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Inactive parseFrom(InputStream inputStream, de deVar) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Inactive parseFrom(ByteBuffer byteBuffer) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Inactive parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Inactive parseFrom(byte[] bArr) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Inactive parseFrom(byte[] bArr, de deVar) {
            return (Inactive) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Paused extends du<Paused, Builder> implements PausedOrBuilder {
        private static final Paused DEFAULT_INSTANCE;
        public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 2;
        private static volatile fo<Paused> PARSER = null;
        public static final int PARTNER_APP_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private String externalTripToken_ = "";
        private NavConnectPartnerAppInfo partnerAppInfo_;

        static {
            Paused paused = new Paused();
            DEFAULT_INSTANCE = paused;
            du.registerDefaultInstance(Paused.class, paused);
        }

        private Paused() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalTripToken() {
            this.externalTripToken_ = getDefaultInstance().getExternalTripToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPartnerAppInfo() {
            this.partnerAppInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static Paused getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
            Objects.requireNonNull(navConnectPartnerAppInfo);
            NavConnectPartnerAppInfo navConnectPartnerAppInfo2 = this.partnerAppInfo_;
            if (navConnectPartnerAppInfo2 != null && navConnectPartnerAppInfo2 != NavConnectPartnerAppInfo.getDefaultInstance()) {
                NavConnectPartnerAppInfo.Builder builderNewBuilder = NavConnectPartnerAppInfo.newBuilder(navConnectPartnerAppInfo2);
                builderNewBuilder.mergeFrom((NavConnectPartnerAppInfo.Builder) navConnectPartnerAppInfo);
                navConnectPartnerAppInfo = builderNewBuilder.buildPartial();
            }
            this.partnerAppInfo_ = navConnectPartnerAppInfo;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Paused parseDelimitedFrom(InputStream inputStream) {
            return (Paused) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Paused parseFrom(v vVar) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Paused> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalTripToken(String str) {
            Objects.requireNonNull(str);
            this.externalTripToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalTripTokenBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.externalTripToken_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
            Objects.requireNonNull(navConnectPartnerAppInfo);
            this.partnerAppInfo_ = navConnectPartnerAppInfo;
            this.bitField0_ |= 1;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "partnerAppInfo_", "externalTripToken_"});
            }
            if (iOrdinal == 3) {
                return new Paused();
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
            fo<Paused> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Paused.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PausedOrBuilder
        public String getExternalTripToken() {
            return this.externalTripToken_;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PausedOrBuilder
        public v getExternalTripTokenBytes() {
            return v.s(this.externalTripToken_);
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PausedOrBuilder
        public NavConnectPartnerAppInfo getPartnerAppInfo() {
            NavConnectPartnerAppInfo navConnectPartnerAppInfo = this.partnerAppInfo_;
            return navConnectPartnerAppInfo == null ? NavConnectPartnerAppInfo.getDefaultInstance() : navConnectPartnerAppInfo;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PausedOrBuilder
        public boolean hasPartnerAppInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Paused paused) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(paused);
        }

        public static Paused parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Paused) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Paused parseFrom(v vVar, de deVar) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Paused parseFrom(z zVar) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Paused parseFrom(z zVar, de deVar) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Paused parseFrom(InputStream inputStream) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Paused parseFrom(InputStream inputStream, de deVar) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Paused parseFrom(ByteBuffer byteBuffer) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Paused parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<Paused, Builder> implements PausedOrBuilder {
            private Builder() {
                super(Paused.DEFAULT_INSTANCE);
            }

            public Builder clearExternalTripToken() {
                copyOnWrite();
                ((Paused) this.instance).clearExternalTripToken();
                return this;
            }

            public Builder clearPartnerAppInfo() {
                copyOnWrite();
                ((Paused) this.instance).clearPartnerAppInfo();
                return this;
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PausedOrBuilder
            public String getExternalTripToken() {
                return ((Paused) this.instance).getExternalTripToken();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PausedOrBuilder
            public v getExternalTripTokenBytes() {
                return ((Paused) this.instance).getExternalTripTokenBytes();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PausedOrBuilder
            public NavConnectPartnerAppInfo getPartnerAppInfo() {
                return ((Paused) this.instance).getPartnerAppInfo();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PausedOrBuilder
            public boolean hasPartnerAppInfo() {
                return ((Paused) this.instance).hasPartnerAppInfo();
            }

            public Builder mergePartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                copyOnWrite();
                ((Paused) this.instance).mergePartnerAppInfo(navConnectPartnerAppInfo);
                return this;
            }

            public Builder setExternalTripToken(String str) {
                copyOnWrite();
                ((Paused) this.instance).setExternalTripToken(str);
                return this;
            }

            public Builder setExternalTripTokenBytes(v vVar) {
                copyOnWrite();
                ((Paused) this.instance).setExternalTripTokenBytes(vVar);
                return this;
            }

            public Builder setPartnerAppInfo(NavConnectPartnerAppInfo.Builder builder) {
                copyOnWrite();
                ((Paused) this.instance).setPartnerAppInfo(builder.build());
                return this;
            }

            public Builder setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                copyOnWrite();
                ((Paused) this.instance).setPartnerAppInfo(navConnectPartnerAppInfo);
                return this;
            }
        }

        public static Paused parseFrom(byte[] bArr) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Paused parseFrom(byte[] bArr, de deVar) {
            return (Paused) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class PendingTokenValidation extends du<PendingTokenValidation, Builder> implements PendingTokenValidationOrBuilder {
        private static final PendingTokenValidation DEFAULT_INSTANCE;
        public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 1;
        private static volatile fo<PendingTokenValidation> PARSER;
        private String externalTripToken_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<PendingTokenValidation, Builder> implements PendingTokenValidationOrBuilder {
            private Builder() {
                super(PendingTokenValidation.DEFAULT_INSTANCE);
            }

            public Builder clearExternalTripToken() {
                copyOnWrite();
                ((PendingTokenValidation) this.instance).clearExternalTripToken();
                return this;
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingTokenValidationOrBuilder
            public String getExternalTripToken() {
                return ((PendingTokenValidation) this.instance).getExternalTripToken();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingTokenValidationOrBuilder
            public v getExternalTripTokenBytes() {
                return ((PendingTokenValidation) this.instance).getExternalTripTokenBytes();
            }

            public Builder setExternalTripToken(String str) {
                copyOnWrite();
                ((PendingTokenValidation) this.instance).setExternalTripToken(str);
                return this;
            }

            public Builder setExternalTripTokenBytes(v vVar) {
                copyOnWrite();
                ((PendingTokenValidation) this.instance).setExternalTripTokenBytes(vVar);
                return this;
            }
        }

        static {
            PendingTokenValidation pendingTokenValidation = new PendingTokenValidation();
            DEFAULT_INSTANCE = pendingTokenValidation;
            du.registerDefaultInstance(PendingTokenValidation.class, pendingTokenValidation);
        }

        private PendingTokenValidation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalTripToken() {
            this.externalTripToken_ = getDefaultInstance().getExternalTripToken();
        }

        public static PendingTokenValidation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PendingTokenValidation parseDelimitedFrom(InputStream inputStream) {
            return (PendingTokenValidation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PendingTokenValidation parseFrom(v vVar) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<PendingTokenValidation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalTripToken(String str) {
            Objects.requireNonNull(str);
            this.externalTripToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalTripTokenBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.externalTripToken_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"externalTripToken_"});
            }
            if (iOrdinal == 3) {
                return new PendingTokenValidation();
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
            fo<PendingTokenValidation> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (PendingTokenValidation.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingTokenValidationOrBuilder
        public String getExternalTripToken() {
            return this.externalTripToken_;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingTokenValidationOrBuilder
        public v getExternalTripTokenBytes() {
            return v.s(this.externalTripToken_);
        }

        public static Builder newBuilder(PendingTokenValidation pendingTokenValidation) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(pendingTokenValidation);
        }

        public static PendingTokenValidation parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (PendingTokenValidation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PendingTokenValidation parseFrom(v vVar, de deVar) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static PendingTokenValidation parseFrom(z zVar) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static PendingTokenValidation parseFrom(z zVar, de deVar) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static PendingTokenValidation parseFrom(InputStream inputStream) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PendingTokenValidation parseFrom(InputStream inputStream, de deVar) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PendingTokenValidation parseFrom(ByteBuffer byteBuffer) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PendingTokenValidation parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static PendingTokenValidation parseFrom(byte[] bArr) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PendingTokenValidation parseFrom(byte[] bArr, de deVar) {
            return (PendingTokenValidation) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class PendingUserConsent extends du<PendingUserConsent, Builder> implements PendingUserConsentOrBuilder {
        private static final PendingUserConsent DEFAULT_INSTANCE;
        public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 2;
        public static final int INVALIDATION_REASON_FIELD_NUMBER = 3;
        private static volatile fo<PendingUserConsent> PARSER = null;
        public static final int PARTNER_APP_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private String externalTripToken_ = "";
        private int invalidationReason_;
        private NavConnectPartnerAppInfo partnerAppInfo_;

        /* compiled from: WazeSource */
        public enum InvalidationReason implements eg {
            ABSENT(0),
            VERSION_MISMATCH(1),
            EXPIRED(2),
            UNRECOGNIZED(-1);

            public static final int ABSENT_VALUE = 0;
            public static final int EXPIRED_VALUE = 2;
            public static final int VERSION_MISMATCH_VALUE = 1;
            private static final eh<InvalidationReason> internalValueMap = new eh<InvalidationReason>() { // from class: com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsent.InvalidationReason.1
                @Override // com.google.v.eh
                public InvalidationReason findValueByNumber(int i2) {
                    return InvalidationReason.forNumber(i2);
                }
            };
            private final int value;

            /* compiled from: WazeSource */
            final class InvalidationReasonVerifier implements ei {
                static final ei INSTANCE = new InvalidationReasonVerifier();

                private InvalidationReasonVerifier() {
                }

                @Override // com.google.v.ei
                public boolean isInRange(int i2) {
                    return InvalidationReason.forNumber(i2) != null;
                }
            }

            InvalidationReason(int i2) {
                this.value = i2;
            }

            public static InvalidationReason forNumber(int i2) {
                if (i2 == 0) {
                    return ABSENT;
                }
                if (i2 == 1) {
                    return VERSION_MISMATCH;
                }
                if (i2 != 2) {
                    return null;
                }
                return EXPIRED;
            }

            public static eh<InvalidationReason> internalGetValueMap() {
                return internalValueMap;
            }

            public static ei internalGetVerifier() {
                return InvalidationReasonVerifier.INSTANCE;
            }

            @Override // com.google.v.eg
            public final int getNumber() {
                return this == UNRECOGNIZED ? ep.b() : this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.value);
            }
        }

        static {
            PendingUserConsent pendingUserConsent = new PendingUserConsent();
            DEFAULT_INSTANCE = pendingUserConsent;
            du.registerDefaultInstance(PendingUserConsent.class, pendingUserConsent);
        }

        private PendingUserConsent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalTripToken() {
            this.externalTripToken_ = getDefaultInstance().getExternalTripToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInvalidationReason() {
            this.invalidationReason_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPartnerAppInfo() {
            this.partnerAppInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static PendingUserConsent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
            Objects.requireNonNull(navConnectPartnerAppInfo);
            NavConnectPartnerAppInfo navConnectPartnerAppInfo2 = this.partnerAppInfo_;
            if (navConnectPartnerAppInfo2 != null && navConnectPartnerAppInfo2 != NavConnectPartnerAppInfo.getDefaultInstance()) {
                NavConnectPartnerAppInfo.Builder builderNewBuilder = NavConnectPartnerAppInfo.newBuilder(navConnectPartnerAppInfo2);
                builderNewBuilder.mergeFrom((NavConnectPartnerAppInfo.Builder) navConnectPartnerAppInfo);
                navConnectPartnerAppInfo = builderNewBuilder.buildPartial();
            }
            this.partnerAppInfo_ = navConnectPartnerAppInfo;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PendingUserConsent parseDelimitedFrom(InputStream inputStream) {
            return (PendingUserConsent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PendingUserConsent parseFrom(v vVar) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<PendingUserConsent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalTripToken(String str) {
            Objects.requireNonNull(str);
            this.externalTripToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalTripTokenBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.externalTripToken_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInvalidationReason(InvalidationReason invalidationReason) {
            this.invalidationReason_ = invalidationReason.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInvalidationReasonValue(int i2) {
            this.invalidationReason_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
            Objects.requireNonNull(navConnectPartnerAppInfo);
            this.partnerAppInfo_ = navConnectPartnerAppInfo;
            this.bitField0_ |= 1;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f", new Object[]{"bitField0_", "partnerAppInfo_", "externalTripToken_", "invalidationReason_"});
            }
            if (iOrdinal == 3) {
                return new PendingUserConsent();
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
            fo<PendingUserConsent> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (PendingUserConsent.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
        public String getExternalTripToken() {
            return this.externalTripToken_;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
        public v getExternalTripTokenBytes() {
            return v.s(this.externalTripToken_);
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
        public InvalidationReason getInvalidationReason() {
            InvalidationReason invalidationReasonForNumber = InvalidationReason.forNumber(this.invalidationReason_);
            return invalidationReasonForNumber == null ? InvalidationReason.UNRECOGNIZED : invalidationReasonForNumber;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
        public int getInvalidationReasonValue() {
            return this.invalidationReason_;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
        public NavConnectPartnerAppInfo getPartnerAppInfo() {
            NavConnectPartnerAppInfo navConnectPartnerAppInfo = this.partnerAppInfo_;
            return navConnectPartnerAppInfo == null ? NavConnectPartnerAppInfo.getDefaultInstance() : navConnectPartnerAppInfo;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
        public boolean hasPartnerAppInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(PendingUserConsent pendingUserConsent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(pendingUserConsent);
        }

        public static PendingUserConsent parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (PendingUserConsent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PendingUserConsent parseFrom(v vVar, de deVar) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static PendingUserConsent parseFrom(z zVar) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static PendingUserConsent parseFrom(z zVar, de deVar) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static PendingUserConsent parseFrom(InputStream inputStream) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PendingUserConsent parseFrom(InputStream inputStream, de deVar) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PendingUserConsent parseFrom(ByteBuffer byteBuffer) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PendingUserConsent parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<PendingUserConsent, Builder> implements PendingUserConsentOrBuilder {
            private Builder() {
                super(PendingUserConsent.DEFAULT_INSTANCE);
            }

            public Builder clearExternalTripToken() {
                copyOnWrite();
                ((PendingUserConsent) this.instance).clearExternalTripToken();
                return this;
            }

            public Builder clearInvalidationReason() {
                copyOnWrite();
                ((PendingUserConsent) this.instance).clearInvalidationReason();
                return this;
            }

            public Builder clearPartnerAppInfo() {
                copyOnWrite();
                ((PendingUserConsent) this.instance).clearPartnerAppInfo();
                return this;
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
            public String getExternalTripToken() {
                return ((PendingUserConsent) this.instance).getExternalTripToken();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
            public v getExternalTripTokenBytes() {
                return ((PendingUserConsent) this.instance).getExternalTripTokenBytes();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
            public InvalidationReason getInvalidationReason() {
                return ((PendingUserConsent) this.instance).getInvalidationReason();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
            public int getInvalidationReasonValue() {
                return ((PendingUserConsent) this.instance).getInvalidationReasonValue();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
            public NavConnectPartnerAppInfo getPartnerAppInfo() {
                return ((PendingUserConsent) this.instance).getPartnerAppInfo();
            }

            @Override // com.waze.jni.protos.nav_connect.NavConnectState.PendingUserConsentOrBuilder
            public boolean hasPartnerAppInfo() {
                return ((PendingUserConsent) this.instance).hasPartnerAppInfo();
            }

            public Builder mergePartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                copyOnWrite();
                ((PendingUserConsent) this.instance).mergePartnerAppInfo(navConnectPartnerAppInfo);
                return this;
            }

            public Builder setExternalTripToken(String str) {
                copyOnWrite();
                ((PendingUserConsent) this.instance).setExternalTripToken(str);
                return this;
            }

            public Builder setExternalTripTokenBytes(v vVar) {
                copyOnWrite();
                ((PendingUserConsent) this.instance).setExternalTripTokenBytes(vVar);
                return this;
            }

            public Builder setInvalidationReason(InvalidationReason invalidationReason) {
                copyOnWrite();
                ((PendingUserConsent) this.instance).setInvalidationReason(invalidationReason);
                return this;
            }

            public Builder setInvalidationReasonValue(int i2) {
                copyOnWrite();
                ((PendingUserConsent) this.instance).setInvalidationReasonValue(i2);
                return this;
            }

            public Builder setPartnerAppInfo(NavConnectPartnerAppInfo.Builder builder) {
                copyOnWrite();
                ((PendingUserConsent) this.instance).setPartnerAppInfo(builder.build());
                return this;
            }

            public Builder setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                copyOnWrite();
                ((PendingUserConsent) this.instance).setPartnerAppInfo(navConnectPartnerAppInfo);
                return this;
            }
        }

        public static PendingUserConsent parseFrom(byte[] bArr) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PendingUserConsent parseFrom(byte[] bArr, de deVar) {
            return (PendingUserConsent) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(NavConnectState navConnectState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navConnectState);
    }

    public static NavConnectState parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavConnectState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavConnectState parseFrom(v vVar, de deVar) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavConnectState parseFrom(z zVar) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavConnectState parseFrom(z zVar, de deVar) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavConnectState parseFrom(InputStream inputStream) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavConnectState parseFrom(InputStream inputStream, de deVar) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavConnectState parseFrom(ByteBuffer byteBuffer) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavConnectState parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavConnectState, Builder> implements NavConnectStateOrBuilder {
        private Builder() {
            super(NavConnectState.DEFAULT_INSTANCE);
        }

        public Builder clearActive() {
            copyOnWrite();
            ((NavConnectState) this.instance).clearActive();
            return this;
        }

        public Builder clearInactive() {
            copyOnWrite();
            ((NavConnectState) this.instance).clearInactive();
            return this;
        }

        public Builder clearPaused() {
            copyOnWrite();
            ((NavConnectState) this.instance).clearPaused();
            return this;
        }

        public Builder clearPendingTokenValidation() {
            copyOnWrite();
            ((NavConnectState) this.instance).clearPendingTokenValidation();
            return this;
        }

        public Builder clearPendingUserConsent() {
            copyOnWrite();
            ((NavConnectState) this.instance).clearPendingUserConsent();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((NavConnectState) this.instance).clearState();
            return this;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public Active getActive() {
            return ((NavConnectState) this.instance).getActive();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public Inactive getInactive() {
            return ((NavConnectState) this.instance).getInactive();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public Paused getPaused() {
            return ((NavConnectState) this.instance).getPaused();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public PendingTokenValidation getPendingTokenValidation() {
            return ((NavConnectState) this.instance).getPendingTokenValidation();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public PendingUserConsent getPendingUserConsent() {
            return ((NavConnectState) this.instance).getPendingUserConsent();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public StateCase getStateCase() {
            return ((NavConnectState) this.instance).getStateCase();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public boolean hasActive() {
            return ((NavConnectState) this.instance).hasActive();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public boolean hasInactive() {
            return ((NavConnectState) this.instance).hasInactive();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public boolean hasPaused() {
            return ((NavConnectState) this.instance).hasPaused();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public boolean hasPendingTokenValidation() {
            return ((NavConnectState) this.instance).hasPendingTokenValidation();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectStateOrBuilder
        public boolean hasPendingUserConsent() {
            return ((NavConnectState) this.instance).hasPendingUserConsent();
        }

        public Builder mergeActive(Active active) {
            copyOnWrite();
            ((NavConnectState) this.instance).mergeActive(active);
            return this;
        }

        public Builder mergeInactive(Inactive inactive) {
            copyOnWrite();
            ((NavConnectState) this.instance).mergeInactive(inactive);
            return this;
        }

        public Builder mergePaused(Paused paused) {
            copyOnWrite();
            ((NavConnectState) this.instance).mergePaused(paused);
            return this;
        }

        public Builder mergePendingTokenValidation(PendingTokenValidation pendingTokenValidation) {
            copyOnWrite();
            ((NavConnectState) this.instance).mergePendingTokenValidation(pendingTokenValidation);
            return this;
        }

        public Builder mergePendingUserConsent(PendingUserConsent pendingUserConsent) {
            copyOnWrite();
            ((NavConnectState) this.instance).mergePendingUserConsent(pendingUserConsent);
            return this;
        }

        public Builder setActive(Active.Builder builder) {
            copyOnWrite();
            ((NavConnectState) this.instance).setActive(builder.build());
            return this;
        }

        public Builder setInactive(Inactive.Builder builder) {
            copyOnWrite();
            ((NavConnectState) this.instance).setInactive(builder.build());
            return this;
        }

        public Builder setPaused(Paused.Builder builder) {
            copyOnWrite();
            ((NavConnectState) this.instance).setPaused(builder.build());
            return this;
        }

        public Builder setPendingTokenValidation(PendingTokenValidation.Builder builder) {
            copyOnWrite();
            ((NavConnectState) this.instance).setPendingTokenValidation(builder.build());
            return this;
        }

        public Builder setPendingUserConsent(PendingUserConsent.Builder builder) {
            copyOnWrite();
            ((NavConnectState) this.instance).setPendingUserConsent(builder.build());
            return this;
        }

        public Builder setActive(Active active) {
            copyOnWrite();
            ((NavConnectState) this.instance).setActive(active);
            return this;
        }

        public Builder setInactive(Inactive inactive) {
            copyOnWrite();
            ((NavConnectState) this.instance).setInactive(inactive);
            return this;
        }

        public Builder setPaused(Paused paused) {
            copyOnWrite();
            ((NavConnectState) this.instance).setPaused(paused);
            return this;
        }

        public Builder setPendingTokenValidation(PendingTokenValidation pendingTokenValidation) {
            copyOnWrite();
            ((NavConnectState) this.instance).setPendingTokenValidation(pendingTokenValidation);
            return this;
        }

        public Builder setPendingUserConsent(PendingUserConsent pendingUserConsent) {
            copyOnWrite();
            ((NavConnectState) this.instance).setPendingUserConsent(pendingUserConsent);
            return this;
        }
    }

    public static NavConnectState parseFrom(byte[] bArr) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavConnectState parseFrom(byte[] bArr, de deVar) {
        return (NavConnectState) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
