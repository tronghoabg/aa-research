package com.waze.jni.protos.resources;

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
public final class ResourceDataProto extends du<ResourceDataProto, Builder> implements ResourceDataProtoOrBuilder {
    public static final int BUFFER_FIELD_NUMBER = 1;
    private static final ResourceDataProto DEFAULT_INSTANCE;
    private static volatile fo<ResourceDataProto> PARSER;
    private v buffer_ = v.f13054a;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.resources.ResourceDataProto$1, reason: invalid class name */
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
    public final class Builder extends dm<ResourceDataProto, Builder> implements ResourceDataProtoOrBuilder {
        private Builder() {
            super(ResourceDataProto.DEFAULT_INSTANCE);
        }

        public Builder clearBuffer() {
            copyOnWrite();
            ((ResourceDataProto) this.instance).clearBuffer();
            return this;
        }

        @Override // com.waze.jni.protos.resources.ResourceDataProtoOrBuilder
        public v getBuffer() {
            return ((ResourceDataProto) this.instance).getBuffer();
        }

        public Builder setBuffer(v vVar) {
            copyOnWrite();
            ((ResourceDataProto) this.instance).setBuffer(vVar);
            return this;
        }
    }

    static {
        ResourceDataProto resourceDataProto = new ResourceDataProto();
        DEFAULT_INSTANCE = resourceDataProto;
        du.registerDefaultInstance(ResourceDataProto.class, resourceDataProto);
    }

    private ResourceDataProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuffer() {
        this.buffer_ = getDefaultInstance().getBuffer();
    }

    public static ResourceDataProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceDataProto parseDelimitedFrom(InputStream inputStream) {
        return (ResourceDataProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDataProto parseFrom(v vVar) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ResourceDataProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuffer(v vVar) {
        Objects.requireNonNull(vVar);
        this.buffer_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"buffer_"});
        }
        if (iOrdinal == 3) {
            return new ResourceDataProto();
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
        fo<ResourceDataProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ResourceDataProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.resources.ResourceDataProtoOrBuilder
    public v getBuffer() {
        return this.buffer_;
    }

    public static Builder newBuilder(ResourceDataProto resourceDataProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(resourceDataProto);
    }

    public static ResourceDataProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ResourceDataProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ResourceDataProto parseFrom(v vVar, de deVar) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ResourceDataProto parseFrom(z zVar) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ResourceDataProto parseFrom(z zVar, de deVar) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ResourceDataProto parseFrom(InputStream inputStream) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDataProto parseFrom(InputStream inputStream, de deVar) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ResourceDataProto parseFrom(ByteBuffer byteBuffer) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ResourceDataProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ResourceDataProto parseFrom(byte[] bArr) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceDataProto parseFrom(byte[] bArr, de deVar) {
        return (ResourceDataProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
