package com.google.android.libraries.assistant.appintegration.proto;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class VoicePlateStateChangedParams extends du<VoicePlateStateChangedParams, Builder> implements VoicePlateStateChangedParamsOrBuilder {
    public static final int DASHBOARD_MODE_FIELD_NUMBER = 4;
    private static final VoicePlateStateChangedParams DEFAULT_INSTANCE;
    public static final int DESIRED_PADDING_ON_SCREEN_PIXEL_FIELD_NUMBER = 5;
    public static final int HIDE_SYSTEM_NAVIGATION_BAR_FIELD_NUMBER = 7;
    private static volatile fo<VoicePlateStateChangedParams> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int VOICE_PLATE_HEIGHT_PIXEL_FIELD_NUMBER = 2;
    public static final int VOICE_PLATE_MODE_FIELD_NUMBER = 6;
    public static final int VOICE_PLATE_STATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int dashboardMode_;
    private int desiredPaddingOnScreenPixel_;
    private int voicePlateHeightPixel_;
    private int voicePlateMode_;
    private int voicePlateState_;
    private String source_ = "";
    private boolean hideSystemNavigationBar_ = true;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams$1, reason: invalid class name */
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
    public final class Builder extends dm<VoicePlateStateChangedParams, Builder> implements VoicePlateStateChangedParamsOrBuilder {
        private Builder() {
            super(VoicePlateStateChangedParams.DEFAULT_INSTANCE);
        }

        public Builder clearDashboardMode() {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).clearDashboardMode();
            return this;
        }

        public Builder clearDesiredPaddingOnScreenPixel() {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).clearDesiredPaddingOnScreenPixel();
            return this;
        }

        public Builder clearHideSystemNavigationBar() {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).clearHideSystemNavigationBar();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).clearSource();
            return this;
        }

        public Builder clearVoicePlateHeightPixel() {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).clearVoicePlateHeightPixel();
            return this;
        }

        public Builder clearVoicePlateMode() {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).clearVoicePlateMode();
            return this;
        }

        public Builder clearVoicePlateState() {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).clearVoicePlateState();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public DashboardMode getDashboardMode() {
            return ((VoicePlateStateChangedParams) this.instance).getDashboardMode();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public int getDesiredPaddingOnScreenPixel() {
            return ((VoicePlateStateChangedParams) this.instance).getDesiredPaddingOnScreenPixel();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public boolean getHideSystemNavigationBar() {
            return ((VoicePlateStateChangedParams) this.instance).getHideSystemNavigationBar();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public String getSource() {
            return ((VoicePlateStateChangedParams) this.instance).getSource();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public v getSourceBytes() {
            return ((VoicePlateStateChangedParams) this.instance).getSourceBytes();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public int getVoicePlateHeightPixel() {
            return ((VoicePlateStateChangedParams) this.instance).getVoicePlateHeightPixel();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public VoicePlateMode getVoicePlateMode() {
            return ((VoicePlateStateChangedParams) this.instance).getVoicePlateMode();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public VoicePlateState getVoicePlateState() {
            return ((VoicePlateStateChangedParams) this.instance).getVoicePlateState();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public boolean hasDashboardMode() {
            return ((VoicePlateStateChangedParams) this.instance).hasDashboardMode();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public boolean hasDesiredPaddingOnScreenPixel() {
            return ((VoicePlateStateChangedParams) this.instance).hasDesiredPaddingOnScreenPixel();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public boolean hasHideSystemNavigationBar() {
            return ((VoicePlateStateChangedParams) this.instance).hasHideSystemNavigationBar();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public boolean hasSource() {
            return ((VoicePlateStateChangedParams) this.instance).hasSource();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public boolean hasVoicePlateHeightPixel() {
            return ((VoicePlateStateChangedParams) this.instance).hasVoicePlateHeightPixel();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public boolean hasVoicePlateMode() {
            return ((VoicePlateStateChangedParams) this.instance).hasVoicePlateMode();
        }

        @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
        public boolean hasVoicePlateState() {
            return ((VoicePlateStateChangedParams) this.instance).hasVoicePlateState();
        }

        public Builder setDashboardMode(DashboardMode dashboardMode) {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).setDashboardMode(dashboardMode);
            return this;
        }

        public Builder setDesiredPaddingOnScreenPixel(int i2) {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).setDesiredPaddingOnScreenPixel(i2);
            return this;
        }

        public Builder setHideSystemNavigationBar(boolean z) {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).setHideSystemNavigationBar(z);
            return this;
        }

        public Builder setSource(String str) {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).setSource(str);
            return this;
        }

        public Builder setSourceBytes(v vVar) {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).setSourceBytes(vVar);
            return this;
        }

        public Builder setVoicePlateHeightPixel(int i2) {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).setVoicePlateHeightPixel(i2);
            return this;
        }

        public Builder setVoicePlateMode(VoicePlateMode voicePlateMode) {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).setVoicePlateMode(voicePlateMode);
            return this;
        }

        public Builder setVoicePlateState(VoicePlateState voicePlateState) {
            copyOnWrite();
            ((VoicePlateStateChangedParams) this.instance).setVoicePlateState(voicePlateState);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum DashboardMode implements eg {
        DASHBOARD_MODE_UNKNOWN(0),
        DASHBOARD_MODE_COLLAPSED(1),
        DASHBOARD_MODE_MINI(2),
        DASHBOARD_MODE_EXPANDED(3),
        DASHBOARD_MODE_FULL_SCREEN(4);

        public static final int DASHBOARD_MODE_COLLAPSED_VALUE = 1;
        public static final int DASHBOARD_MODE_EXPANDED_VALUE = 3;
        public static final int DASHBOARD_MODE_FULL_SCREEN_VALUE = 4;
        public static final int DASHBOARD_MODE_MINI_VALUE = 2;
        public static final int DASHBOARD_MODE_UNKNOWN_VALUE = 0;
        private static final eh<DashboardMode> internalValueMap = new eh<DashboardMode>() { // from class: com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams.DashboardMode.1
            @Override // com.google.v.eh
            public DashboardMode findValueByNumber(int i2) {
                return DashboardMode.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class DashboardModeVerifier implements ei {
            static final ei INSTANCE = new DashboardModeVerifier();

            private DashboardModeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return DashboardMode.forNumber(i2) != null;
            }
        }

        DashboardMode(int i2) {
            this.value = i2;
        }

        public static DashboardMode forNumber(int i2) {
            if (i2 == 0) {
                return DASHBOARD_MODE_UNKNOWN;
            }
            if (i2 == 1) {
                return DASHBOARD_MODE_COLLAPSED;
            }
            if (i2 == 2) {
                return DASHBOARD_MODE_MINI;
            }
            if (i2 == 3) {
                return DASHBOARD_MODE_EXPANDED;
            }
            if (i2 != 4) {
                return null;
            }
            return DASHBOARD_MODE_FULL_SCREEN;
        }

        public static eh<DashboardMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return DashboardModeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public enum VoicePlateMode implements eg {
        VOICE_PLATE_MODE_UNKNOWN(0),
        VOICE_PLATE_MODE_DEFAULT(1),
        VOICE_PLATE_MODE_MINI(2),
        VOICE_PLATE_MODE_MORRIS(3);

        public static final int VOICE_PLATE_MODE_DEFAULT_VALUE = 1;
        public static final int VOICE_PLATE_MODE_MINI_VALUE = 2;
        public static final int VOICE_PLATE_MODE_MORRIS_VALUE = 3;
        public static final int VOICE_PLATE_MODE_UNKNOWN_VALUE = 0;
        private static final eh<VoicePlateMode> internalValueMap = new eh<VoicePlateMode>() { // from class: com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams.VoicePlateMode.1
            @Override // com.google.v.eh
            public VoicePlateMode findValueByNumber(int i2) {
                return VoicePlateMode.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class VoicePlateModeVerifier implements ei {
            static final ei INSTANCE = new VoicePlateModeVerifier();

            private VoicePlateModeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return VoicePlateMode.forNumber(i2) != null;
            }
        }

        VoicePlateMode(int i2) {
            this.value = i2;
        }

        public static VoicePlateMode forNumber(int i2) {
            if (i2 == 0) {
                return VOICE_PLATE_MODE_UNKNOWN;
            }
            if (i2 == 1) {
                return VOICE_PLATE_MODE_DEFAULT;
            }
            if (i2 == 2) {
                return VOICE_PLATE_MODE_MINI;
            }
            if (i2 != 3) {
                return null;
            }
            return VOICE_PLATE_MODE_MORRIS;
        }

        public static eh<VoicePlateMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return VoicePlateModeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public enum VoicePlateState implements eg {
        VOICE_PLATE_STATE_UNKNOWN(0),
        VOICE_PLATE_STATE_OPENED(1),
        VOICE_PLATE_STATE_CHAT_HEAD(2),
        VOICE_PLATE_STATE_CLOSED(3);

        public static final int VOICE_PLATE_STATE_CHAT_HEAD_VALUE = 2;
        public static final int VOICE_PLATE_STATE_CLOSED_VALUE = 3;
        public static final int VOICE_PLATE_STATE_OPENED_VALUE = 1;
        public static final int VOICE_PLATE_STATE_UNKNOWN_VALUE = 0;
        private static final eh<VoicePlateState> internalValueMap = new eh<VoicePlateState>() { // from class: com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams.VoicePlateState.1
            @Override // com.google.v.eh
            public VoicePlateState findValueByNumber(int i2) {
                return VoicePlateState.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class VoicePlateStateVerifier implements ei {
            static final ei INSTANCE = new VoicePlateStateVerifier();

            private VoicePlateStateVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return VoicePlateState.forNumber(i2) != null;
            }
        }

        VoicePlateState(int i2) {
            this.value = i2;
        }

        public static VoicePlateState forNumber(int i2) {
            if (i2 == 0) {
                return VOICE_PLATE_STATE_UNKNOWN;
            }
            if (i2 == 1) {
                return VOICE_PLATE_STATE_OPENED;
            }
            if (i2 == 2) {
                return VOICE_PLATE_STATE_CHAT_HEAD;
            }
            if (i2 != 3) {
                return null;
            }
            return VOICE_PLATE_STATE_CLOSED;
        }

        public static eh<VoicePlateState> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return VoicePlateStateVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        VoicePlateStateChangedParams voicePlateStateChangedParams = new VoicePlateStateChangedParams();
        DEFAULT_INSTANCE = voicePlateStateChangedParams;
        du.registerDefaultInstance(VoicePlateStateChangedParams.class, voicePlateStateChangedParams);
    }

    private VoicePlateStateChangedParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDashboardMode() {
        this.bitField0_ &= -9;
        this.dashboardMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesiredPaddingOnScreenPixel() {
        this.bitField0_ &= -17;
        this.desiredPaddingOnScreenPixel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideSystemNavigationBar() {
        this.bitField0_ &= -65;
        this.hideSystemNavigationBar_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.bitField0_ &= -5;
        this.source_ = getDefaultInstance().getSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoicePlateHeightPixel() {
        this.bitField0_ &= -3;
        this.voicePlateHeightPixel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoicePlateMode() {
        this.bitField0_ &= -33;
        this.voicePlateMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoicePlateState() {
        this.bitField0_ &= -2;
        this.voicePlateState_ = 0;
    }

    public static VoicePlateStateChangedParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VoicePlateStateChangedParams parseDelimitedFrom(InputStream inputStream) {
        return (VoicePlateStateChangedParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoicePlateStateChangedParams parseFrom(v vVar) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VoicePlateStateChangedParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDashboardMode(DashboardMode dashboardMode) {
        this.dashboardMode_ = dashboardMode.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesiredPaddingOnScreenPixel(int i2) {
        this.bitField0_ |= 16;
        this.desiredPaddingOnScreenPixel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideSystemNavigationBar(boolean z) {
        this.bitField0_ |= 64;
        this.hideSystemNavigationBar_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.source_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceBytes(v vVar) {
        this.source_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePlateHeightPixel(int i2) {
        this.bitField0_ |= 2;
        this.voicePlateHeightPixel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePlateMode(VoicePlateMode voicePlateMode) {
        this.voicePlateMode_ = voicePlateMode.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePlateState(VoicePlateState voicePlateState) {
        this.voicePlateState_ = voicePlateState.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005င\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"bitField0_", "voicePlateState_", VoicePlateState.internalGetVerifier(), "voicePlateHeightPixel_", "source_", "dashboardMode_", DashboardMode.internalGetVerifier(), "desiredPaddingOnScreenPixel_", "voicePlateMode_", VoicePlateMode.internalGetVerifier(), "hideSystemNavigationBar_"});
        }
        if (iOrdinal == 3) {
            return new VoicePlateStateChangedParams();
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
        fo<VoicePlateStateChangedParams> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VoicePlateStateChangedParams.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public DashboardMode getDashboardMode() {
        DashboardMode dashboardModeForNumber = DashboardMode.forNumber(this.dashboardMode_);
        return dashboardModeForNumber == null ? DashboardMode.DASHBOARD_MODE_UNKNOWN : dashboardModeForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public int getDesiredPaddingOnScreenPixel() {
        return this.desiredPaddingOnScreenPixel_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public boolean getHideSystemNavigationBar() {
        return this.hideSystemNavigationBar_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public String getSource() {
        return this.source_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public v getSourceBytes() {
        return v.s(this.source_);
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public int getVoicePlateHeightPixel() {
        return this.voicePlateHeightPixel_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public VoicePlateMode getVoicePlateMode() {
        VoicePlateMode voicePlateModeForNumber = VoicePlateMode.forNumber(this.voicePlateMode_);
        return voicePlateModeForNumber == null ? VoicePlateMode.VOICE_PLATE_MODE_UNKNOWN : voicePlateModeForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public VoicePlateState getVoicePlateState() {
        VoicePlateState voicePlateStateForNumber = VoicePlateState.forNumber(this.voicePlateState_);
        return voicePlateStateForNumber == null ? VoicePlateState.VOICE_PLATE_STATE_UNKNOWN : voicePlateStateForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public boolean hasDashboardMode() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public boolean hasDesiredPaddingOnScreenPixel() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public boolean hasHideSystemNavigationBar() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public boolean hasSource() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public boolean hasVoicePlateHeightPixel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public boolean hasVoicePlateMode() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParamsOrBuilder
    public boolean hasVoicePlateState() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(VoicePlateStateChangedParams voicePlateStateChangedParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(voicePlateStateChangedParams);
    }

    public static VoicePlateStateChangedParams parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VoicePlateStateChangedParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoicePlateStateChangedParams parseFrom(v vVar, de deVar) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VoicePlateStateChangedParams parseFrom(z zVar) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VoicePlateStateChangedParams parseFrom(z zVar, de deVar) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static VoicePlateStateChangedParams parseFrom(InputStream inputStream) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoicePlateStateChangedParams parseFrom(InputStream inputStream, de deVar) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoicePlateStateChangedParams parseFrom(ByteBuffer byteBuffer) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VoicePlateStateChangedParams parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static VoicePlateStateChangedParams parseFrom(byte[] bArr) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VoicePlateStateChangedParams parseFrom(byte[] bArr, de deVar) {
        return (VoicePlateStateChangedParams) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
