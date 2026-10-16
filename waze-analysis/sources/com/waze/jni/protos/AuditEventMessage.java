package com.waze.jni.protos;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AuditEventMessage extends du<AuditEventMessage, Builder> implements AuditEventMessageOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final AuditEventMessage DEFAULT_INSTANCE;
    public static final int DISPLAYSTRINGS_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<AuditEventMessage> PARSER = null;
    public static final int SELECTEDOPTION_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int context_;
    private int name_;
    private int value_;
    private int displayStringsMemoizedSerializedSize = -1;
    private String selectedOption_ = "";
    private ek displayStrings_ = emptyIntList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.AuditEventMessage$1, reason: invalid class name */
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
    public final class Builder extends dm<AuditEventMessage, Builder> implements AuditEventMessageOrBuilder {
        private Builder() {
            super(AuditEventMessage.DEFAULT_INSTANCE);
        }

        public Builder addAllDisplayStrings(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((AuditEventMessage) this.instance).addAllDisplayStrings(iterable);
            return this;
        }

        public Builder addDisplayStrings(int i2) {
            copyOnWrite();
            ((AuditEventMessage) this.instance).addDisplayStrings(i2);
            return this;
        }

        public Builder clearContext() {
            copyOnWrite();
            ((AuditEventMessage) this.instance).clearContext();
            return this;
        }

        public Builder clearDisplayStrings() {
            copyOnWrite();
            ((AuditEventMessage) this.instance).clearDisplayStrings();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((AuditEventMessage) this.instance).clearName();
            return this;
        }

        public Builder clearSelectedOption() {
            copyOnWrite();
            ((AuditEventMessage) this.instance).clearSelectedOption();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((AuditEventMessage) this.instance).clearValue();
            return this;
        }

        @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
        public int getContext() {
            return ((AuditEventMessage) this.instance).getContext();
        }

        @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
        public int getDisplayStrings(int i2) {
            return ((AuditEventMessage) this.instance).getDisplayStrings(i2);
        }

        @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
        public int getDisplayStringsCount() {
            return ((AuditEventMessage) this.instance).getDisplayStringsCount();
        }

        @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
        public List<Integer> getDisplayStringsList() {
            return DesugarCollections.unmodifiableList(((AuditEventMessage) this.instance).getDisplayStringsList());
        }

        @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
        public int getName() {
            return ((AuditEventMessage) this.instance).getName();
        }

        @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
        public String getSelectedOption() {
            return ((AuditEventMessage) this.instance).getSelectedOption();
        }

        @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
        public v getSelectedOptionBytes() {
            return ((AuditEventMessage) this.instance).getSelectedOptionBytes();
        }

        @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
        public int getValue() {
            return ((AuditEventMessage) this.instance).getValue();
        }

        public Builder setContext(int i2) {
            copyOnWrite();
            ((AuditEventMessage) this.instance).setContext(i2);
            return this;
        }

        public Builder setDisplayStrings(int i2, int i3) {
            copyOnWrite();
            ((AuditEventMessage) this.instance).setDisplayStrings(i2, i3);
            return this;
        }

        public Builder setName(int i2) {
            copyOnWrite();
            ((AuditEventMessage) this.instance).setName(i2);
            return this;
        }

        public Builder setSelectedOption(String str) {
            copyOnWrite();
            ((AuditEventMessage) this.instance).setSelectedOption(str);
            return this;
        }

        public Builder setSelectedOptionBytes(v vVar) {
            copyOnWrite();
            ((AuditEventMessage) this.instance).setSelectedOptionBytes(vVar);
            return this;
        }

        public Builder setValue(int i2) {
            copyOnWrite();
            ((AuditEventMessage) this.instance).setValue(i2);
            return this;
        }
    }

    static {
        AuditEventMessage auditEventMessage = new AuditEventMessage();
        DEFAULT_INSTANCE = auditEventMessage;
        du.registerDefaultInstance(AuditEventMessage.class, auditEventMessage);
    }

    private AuditEventMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplayStrings(Iterable<? extends Integer> iterable) {
        ensureDisplayStringsIsMutable();
        c.addAll(iterable, this.displayStrings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayStrings(int i2) {
        ensureDisplayStringsIsMutable();
        this.displayStrings_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayStrings() {
        this.displayStrings_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedOption() {
        this.selectedOption_ = getDefaultInstance().getSelectedOption();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    private void ensureDisplayStringsIsMutable() {
        ek ekVar = this.displayStrings_;
        if (ekVar.c()) {
            return;
        }
        this.displayStrings_ = du.mutableCopy(ekVar);
    }

    public static AuditEventMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuditEventMessage parseDelimitedFrom(InputStream inputStream) {
        return (AuditEventMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditEventMessage parseFrom(v vVar) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AuditEventMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayStrings(int i2, int i3) {
        ensureDisplayStringsIsMutable();
        this.displayStrings_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(int i2) {
        this.name_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedOption(String str) {
        Objects.requireNonNull(str);
        this.selectedOption_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedOptionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.selectedOption_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i2) {
        this.value_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004Ȉ\u0005'", new Object[]{"name_", "context_", "value_", "selectedOption_", "displayStrings_"});
        }
        if (iOrdinal == 3) {
            return new AuditEventMessage();
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
        fo<AuditEventMessage> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AuditEventMessage.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
    public int getContext() {
        return this.context_;
    }

    @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
    public int getDisplayStrings(int i2) {
        return this.displayStrings_.d(i2);
    }

    @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
    public int getDisplayStringsCount() {
        return this.displayStrings_.size();
    }

    @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
    public List<Integer> getDisplayStringsList() {
        return this.displayStrings_;
    }

    @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
    public int getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
    public String getSelectedOption() {
        return this.selectedOption_;
    }

    @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
    public v getSelectedOptionBytes() {
        return v.s(this.selectedOption_);
    }

    @Override // com.waze.jni.protos.AuditEventMessageOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(AuditEventMessage auditEventMessage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(auditEventMessage);
    }

    public static AuditEventMessage parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AuditEventMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AuditEventMessage parseFrom(v vVar, de deVar) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AuditEventMessage parseFrom(z zVar) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AuditEventMessage parseFrom(z zVar, de deVar) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AuditEventMessage parseFrom(InputStream inputStream) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditEventMessage parseFrom(InputStream inputStream, de deVar) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AuditEventMessage parseFrom(ByteBuffer byteBuffer) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuditEventMessage parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AuditEventMessage parseFrom(byte[] bArr) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuditEventMessage parseFrom(byte[] bArr, de deVar) {
        return (AuditEventMessage) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
