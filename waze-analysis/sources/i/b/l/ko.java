package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ko extends com.google.v.du<ko, kk> implements com.google.v.fj {
    private static final ko DEFAULT_INSTANCE;
    public static final int EMAIL_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ko> PARSER;
    private com.google.v.eo<km> emailInfo_ = emptyProtobufList();

    static {
        ko koVar = new ko();
        DEFAULT_INSTANCE = koVar;
        com.google.v.du.registerDefaultInstance(ko.class, koVar);
    }

    private ko() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEmailInfo(Iterable<? extends km> iterable) {
        ensureEmailInfoIsMutable();
        com.google.v.c.addAll(iterable, this.emailInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEmailInfo(int i2, km kmVar) {
        Objects.requireNonNull(kmVar);
        ensureEmailInfoIsMutable();
        this.emailInfo_.add(i2, kmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailInfo() {
        this.emailInfo_ = emptyProtobufList();
    }

    private void ensureEmailInfoIsMutable() {
        com.google.v.eo<km> eoVar = this.emailInfo_;
        if (eoVar.c()) {
            return;
        }
        this.emailInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ko getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kk newBuilder() {
        return (kk) DEFAULT_INSTANCE.createBuilder();
    }

    public static ko parseDelimitedFrom(InputStream inputStream) {
        return (ko) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ko parseFrom(com.google.v.v vVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ko> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEmailInfo(int i2) {
        ensureEmailInfoIsMutable();
        this.emailInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailInfo(int i2, km kmVar) {
        Objects.requireNonNull(kmVar);
        ensureEmailInfoIsMutable();
        this.emailInfo_.set(i2, kmVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"emailInfo_", km.class});
        }
        if (iOrdinal == 3) {
            return new ko();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ko> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ko.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public km getEmailInfo(int i2) {
        return this.emailInfo_.get(i2);
    }

    public int getEmailInfoCount() {
        return this.emailInfo_.size();
    }

    public List<km> getEmailInfoList() {
        return this.emailInfo_;
    }

    public kn getEmailInfoOrBuilder(int i2) {
        return this.emailInfo_.get(i2);
    }

    public List<? extends kn> getEmailInfoOrBuilderList() {
        return this.emailInfo_;
    }

    public static kk newBuilder(ko koVar) {
        return (kk) DEFAULT_INSTANCE.createBuilder(koVar);
    }

    public static ko parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ko) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ko parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ko parseFrom(com.google.v.z zVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ko parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEmailInfo(km kmVar) {
        Objects.requireNonNull(kmVar);
        ensureEmailInfoIsMutable();
        this.emailInfo_.add(kmVar);
    }

    public static ko parseFrom(InputStream inputStream) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ko parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ko parseFrom(ByteBuffer byteBuffer) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ko parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ko parseFrom(byte[] bArr) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ko parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ko) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
