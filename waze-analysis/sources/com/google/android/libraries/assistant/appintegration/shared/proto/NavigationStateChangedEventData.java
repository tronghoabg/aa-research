package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.proto.NavigationState;
import com.google.android.libraries.assistant.appintegration.proto.NightModeStatus;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationStateChangedEventData extends du<NavigationStateChangedEventData, Builder> implements NavigationStateChangedEventDataOrBuilder {
    private static final NavigationStateChangedEventData DEFAULT_INSTANCE;
    public static final int FROM_FRAGMENT_PAUSE_FIELD_NUMBER = 4;
    public static final int GOT_MORRIS_ELIGIBLE_FIELD_NUMBER = 3;
    public static final int NAVIGATION_STATE_FIELD_NUMBER = 1;
    public static final int NIGHT_MODE_STATUS_FIELD_NUMBER = 2;
    private static volatile fo<NavigationStateChangedEventData> PARSER;
    private int bitField0_;
    private boolean fromFragmentPause_;
    private boolean gotMorrisEligible_;
    private int navigationState_;
    private int nightModeStatus_;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventData$1, reason: invalid class name */
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
    public final class Builder extends dm<NavigationStateChangedEventData, Builder> implements NavigationStateChangedEventDataOrBuilder {
        private Builder() {
            super(NavigationStateChangedEventData.DEFAULT_INSTANCE);
        }

        public Builder clearFromFragmentPause() {
            copyOnWrite();
            ((NavigationStateChangedEventData) this.instance).clearFromFragmentPause();
            return this;
        }

        public Builder clearGotMorrisEligible() {
            copyOnWrite();
            ((NavigationStateChangedEventData) this.instance).clearGotMorrisEligible();
            return this;
        }

        public Builder clearNavigationState() {
            copyOnWrite();
            ((NavigationStateChangedEventData) this.instance).clearNavigationState();
            return this;
        }

        public Builder clearNightModeStatus() {
            copyOnWrite();
            ((NavigationStateChangedEventData) this.instance).clearNightModeStatus();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
        public boolean getFromFragmentPause() {
            return ((NavigationStateChangedEventData) this.instance).getFromFragmentPause();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
        public boolean getGotMorrisEligible() {
            return ((NavigationStateChangedEventData) this.instance).getGotMorrisEligible();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
        public NavigationState getNavigationState() {
            return ((NavigationStateChangedEventData) this.instance).getNavigationState();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
        public NightModeStatus getNightModeStatus() {
            return ((NavigationStateChangedEventData) this.instance).getNightModeStatus();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
        public boolean hasFromFragmentPause() {
            return ((NavigationStateChangedEventData) this.instance).hasFromFragmentPause();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
        public boolean hasGotMorrisEligible() {
            return ((NavigationStateChangedEventData) this.instance).hasGotMorrisEligible();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
        public boolean hasNavigationState() {
            return ((NavigationStateChangedEventData) this.instance).hasNavigationState();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
        public boolean hasNightModeStatus() {
            return ((NavigationStateChangedEventData) this.instance).hasNightModeStatus();
        }

        public Builder setFromFragmentPause(boolean z) {
            copyOnWrite();
            ((NavigationStateChangedEventData) this.instance).setFromFragmentPause(z);
            return this;
        }

        public Builder setGotMorrisEligible(boolean z) {
            copyOnWrite();
            ((NavigationStateChangedEventData) this.instance).setGotMorrisEligible(z);
            return this;
        }

        public Builder setNavigationState(NavigationState navigationState) {
            copyOnWrite();
            ((NavigationStateChangedEventData) this.instance).setNavigationState(navigationState);
            return this;
        }

        public Builder setNightModeStatus(NightModeStatus nightModeStatus) {
            copyOnWrite();
            ((NavigationStateChangedEventData) this.instance).setNightModeStatus(nightModeStatus);
            return this;
        }
    }

    static {
        NavigationStateChangedEventData navigationStateChangedEventData = new NavigationStateChangedEventData();
        DEFAULT_INSTANCE = navigationStateChangedEventData;
        du.registerDefaultInstance(NavigationStateChangedEventData.class, navigationStateChangedEventData);
    }

    private NavigationStateChangedEventData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromFragmentPause() {
        this.bitField0_ &= -9;
        this.fromFragmentPause_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGotMorrisEligible() {
        this.bitField0_ &= -5;
        this.gotMorrisEligible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationState() {
        this.bitField0_ &= -2;
        this.navigationState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNightModeStatus() {
        this.bitField0_ &= -3;
        this.nightModeStatus_ = 0;
    }

    public static NavigationStateChangedEventData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationStateChangedEventData parseDelimitedFrom(InputStream inputStream) {
        return (NavigationStateChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationStateChangedEventData parseFrom(v vVar) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationStateChangedEventData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromFragmentPause(boolean z) {
        this.bitField0_ |= 8;
        this.fromFragmentPause_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotMorrisEligible(boolean z) {
        this.bitField0_ |= 4;
        this.gotMorrisEligible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationState(NavigationState navigationState) {
        this.navigationState_ = navigationState.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightModeStatus(NightModeStatus nightModeStatus) {
        this.nightModeStatus_ = nightModeStatus.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "navigationState_", NavigationState.internalGetVerifier(), "nightModeStatus_", NightModeStatus.internalGetVerifier(), "gotMorrisEligible_", "fromFragmentPause_"});
        }
        if (iOrdinal == 3) {
            return new NavigationStateChangedEventData();
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
        fo<NavigationStateChangedEventData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationStateChangedEventData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
    public boolean getFromFragmentPause() {
        return this.fromFragmentPause_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
    public boolean getGotMorrisEligible() {
        return this.gotMorrisEligible_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
    public NavigationState getNavigationState() {
        NavigationState navigationStateForNumber = NavigationState.forNumber(this.navigationState_);
        return navigationStateForNumber == null ? NavigationState.UNKNOWN : navigationStateForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
    public NightModeStatus getNightModeStatus() {
        NightModeStatus nightModeStatusForNumber = NightModeStatus.forNumber(this.nightModeStatus_);
        return nightModeStatusForNumber == null ? NightModeStatus.NIGHT_MODE_STATUS_UNKNOWN : nightModeStatusForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
    public boolean hasFromFragmentPause() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
    public boolean hasGotMorrisEligible() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
    public boolean hasNavigationState() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NavigationStateChangedEventDataOrBuilder
    public boolean hasNightModeStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(NavigationStateChangedEventData navigationStateChangedEventData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationStateChangedEventData);
    }

    public static NavigationStateChangedEventData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationStateChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationStateChangedEventData parseFrom(v vVar, de deVar) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationStateChangedEventData parseFrom(z zVar) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationStateChangedEventData parseFrom(z zVar, de deVar) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavigationStateChangedEventData parseFrom(InputStream inputStream) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationStateChangedEventData parseFrom(InputStream inputStream, de deVar) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationStateChangedEventData parseFrom(ByteBuffer byteBuffer) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationStateChangedEventData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NavigationStateChangedEventData parseFrom(byte[] bArr) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationStateChangedEventData parseFrom(byte[] bArr, de deVar) {
        return (NavigationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
