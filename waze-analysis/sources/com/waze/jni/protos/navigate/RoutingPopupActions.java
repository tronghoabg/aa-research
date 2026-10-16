package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingPopupActions extends du<RoutingPopupActions, Builder> implements RoutingPopupActionsOrBuilder {
    private static final RoutingPopupActions DEFAULT_INSTANCE;
    private static volatile fo<RoutingPopupActions> PARSER = null;
    public static final int POPUP_ID_FIELD_NUMBER = 3;
    public static final int POPUP_KEY_FIELD_NUMBER = 4;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 1;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 2;
    private String primaryAction_ = "";
    private String secondaryAction_ = "";
    private String popupId_ = "";
    private String popupKey_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.RoutingPopupActions$1, reason: invalid class name */
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
    public final class Builder extends dm<RoutingPopupActions, Builder> implements RoutingPopupActionsOrBuilder {
        private Builder() {
            super(RoutingPopupActions.DEFAULT_INSTANCE);
        }

        public Builder clearPopupId() {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).clearPopupId();
            return this;
        }

        public Builder clearPopupKey() {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).clearPopupKey();
            return this;
        }

        public Builder clearPrimaryAction() {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).clearPrimaryAction();
            return this;
        }

        public Builder clearSecondaryAction() {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).clearSecondaryAction();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
        public String getPopupId() {
            return ((RoutingPopupActions) this.instance).getPopupId();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
        public v getPopupIdBytes() {
            return ((RoutingPopupActions) this.instance).getPopupIdBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
        public String getPopupKey() {
            return ((RoutingPopupActions) this.instance).getPopupKey();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
        public v getPopupKeyBytes() {
            return ((RoutingPopupActions) this.instance).getPopupKeyBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
        public String getPrimaryAction() {
            return ((RoutingPopupActions) this.instance).getPrimaryAction();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
        public v getPrimaryActionBytes() {
            return ((RoutingPopupActions) this.instance).getPrimaryActionBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
        public String getSecondaryAction() {
            return ((RoutingPopupActions) this.instance).getSecondaryAction();
        }

        @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
        public v getSecondaryActionBytes() {
            return ((RoutingPopupActions) this.instance).getSecondaryActionBytes();
        }

        public Builder setPopupId(String str) {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).setPopupId(str);
            return this;
        }

        public Builder setPopupIdBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).setPopupIdBytes(vVar);
            return this;
        }

        public Builder setPopupKey(String str) {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).setPopupKey(str);
            return this;
        }

        public Builder setPopupKeyBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).setPopupKeyBytes(vVar);
            return this;
        }

        public Builder setPrimaryAction(String str) {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).setPrimaryAction(str);
            return this;
        }

        public Builder setPrimaryActionBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).setPrimaryActionBytes(vVar);
            return this;
        }

        public Builder setSecondaryAction(String str) {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).setSecondaryAction(str);
            return this;
        }

        public Builder setSecondaryActionBytes(v vVar) {
            copyOnWrite();
            ((RoutingPopupActions) this.instance).setSecondaryActionBytes(vVar);
            return this;
        }
    }

    static {
        RoutingPopupActions routingPopupActions = new RoutingPopupActions();
        DEFAULT_INSTANCE = routingPopupActions;
        du.registerDefaultInstance(RoutingPopupActions.class, routingPopupActions);
    }

    private RoutingPopupActions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopupId() {
        this.popupId_ = getDefaultInstance().getPopupId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopupKey() {
        this.popupKey_ = getDefaultInstance().getPopupKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryAction() {
        this.primaryAction_ = getDefaultInstance().getPrimaryAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryAction() {
        this.secondaryAction_ = getDefaultInstance().getSecondaryAction();
    }

    public static RoutingPopupActions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RoutingPopupActions parseDelimitedFrom(InputStream inputStream) {
        return (RoutingPopupActions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingPopupActions parseFrom(v vVar) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RoutingPopupActions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupId(String str) {
        Objects.requireNonNull(str);
        this.popupId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.popupId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupKey(String str) {
        Objects.requireNonNull(str);
        this.popupKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupKeyBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.popupKey_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryAction(String str) {
        Objects.requireNonNull(str);
        this.primaryAction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryActionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.primaryAction_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryAction(String str) {
        Objects.requireNonNull(str);
        this.secondaryAction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryActionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.secondaryAction_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"primaryAction_", "secondaryAction_", "popupId_", "popupKey_"});
        }
        if (iOrdinal == 3) {
            return new RoutingPopupActions();
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
        fo<RoutingPopupActions> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RoutingPopupActions.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
    public String getPopupId() {
        return this.popupId_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
    public v getPopupIdBytes() {
        return v.s(this.popupId_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
    public String getPopupKey() {
        return this.popupKey_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
    public v getPopupKeyBytes() {
        return v.s(this.popupKey_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
    public String getPrimaryAction() {
        return this.primaryAction_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
    public v getPrimaryActionBytes() {
        return v.s(this.primaryAction_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
    public String getSecondaryAction() {
        return this.secondaryAction_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingPopupActionsOrBuilder
    public v getSecondaryActionBytes() {
        return v.s(this.secondaryAction_);
    }

    public static Builder newBuilder(RoutingPopupActions routingPopupActions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routingPopupActions);
    }

    public static RoutingPopupActions parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RoutingPopupActions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingPopupActions parseFrom(v vVar, de deVar) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RoutingPopupActions parseFrom(z zVar) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RoutingPopupActions parseFrom(z zVar, de deVar) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RoutingPopupActions parseFrom(InputStream inputStream) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingPopupActions parseFrom(InputStream inputStream, de deVar) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingPopupActions parseFrom(ByteBuffer byteBuffer) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RoutingPopupActions parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RoutingPopupActions parseFrom(byte[] bArr) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RoutingPopupActions parseFrom(byte[] bArr, de deVar) {
        return (RoutingPopupActions) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
