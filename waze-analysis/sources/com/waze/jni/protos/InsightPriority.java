package com.waze.jni.protos;

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
/* loaded from: classes6.dex */
public final class InsightPriority extends du<InsightPriority, Builder> implements InsightPriorityOrBuilder {
    private static final InsightPriority DEFAULT_INSTANCE;
    private static volatile fo<InsightPriority> PARSER = null;
    public static final int PREEMPTIVE_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean preemptive_;
    private int value_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.InsightPriority$1, reason: invalid class name */
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
    public final class Builder extends dm<InsightPriority, Builder> implements InsightPriorityOrBuilder {
        private Builder() {
            super(InsightPriority.DEFAULT_INSTANCE);
        }

        public Builder clearPreemptive() {
            copyOnWrite();
            ((InsightPriority) this.instance).clearPreemptive();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((InsightPriority) this.instance).clearValue();
            return this;
        }

        @Override // com.waze.jni.protos.InsightPriorityOrBuilder
        public boolean getPreemptive() {
            return ((InsightPriority) this.instance).getPreemptive();
        }

        @Override // com.waze.jni.protos.InsightPriorityOrBuilder
        public int getValue() {
            return ((InsightPriority) this.instance).getValue();
        }

        public Builder setPreemptive(boolean z) {
            copyOnWrite();
            ((InsightPriority) this.instance).setPreemptive(z);
            return this;
        }

        public Builder setValue(int i2) {
            copyOnWrite();
            ((InsightPriority) this.instance).setValue(i2);
            return this;
        }
    }

    static {
        InsightPriority insightPriority = new InsightPriority();
        DEFAULT_INSTANCE = insightPriority;
        du.registerDefaultInstance(InsightPriority.class, insightPriority);
    }

    private InsightPriority() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreemptive() {
        this.preemptive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static InsightPriority getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static InsightPriority parseDelimitedFrom(InputStream inputStream) {
        return (InsightPriority) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InsightPriority parseFrom(v vVar) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<InsightPriority> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreemptive(boolean z) {
        this.preemptive_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"value_", "preemptive_"});
        }
        if (iOrdinal == 3) {
            return new InsightPriority();
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
        fo<InsightPriority> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (InsightPriority.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.InsightPriorityOrBuilder
    public boolean getPreemptive() {
        return this.preemptive_;
    }

    @Override // com.waze.jni.protos.InsightPriorityOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(InsightPriority insightPriority) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(insightPriority);
    }

    public static InsightPriority parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (InsightPriority) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static InsightPriority parseFrom(v vVar, de deVar) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static InsightPriority parseFrom(z zVar) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static InsightPriority parseFrom(z zVar, de deVar) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static InsightPriority parseFrom(InputStream inputStream) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InsightPriority parseFrom(InputStream inputStream, de deVar) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static InsightPriority parseFrom(ByteBuffer byteBuffer) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InsightPriority parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static InsightPriority parseFrom(byte[] bArr) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InsightPriority parseFrom(byte[] bArr, de deVar) {
        return (InsightPriority) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
