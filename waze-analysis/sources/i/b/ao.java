package i.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends du<ao, an> implements fj {
    public static final int ARGUMENTS_FIELD_NUMBER = 2;
    private static final ao DEFAULT_INSTANCE;
    private static volatile fo<ao> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private eo<String> arguments_ = emptyProtobufList();

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllArguments(Iterable<String> iterable) {
        ensureArgumentsIsMutable();
        com.google.v.c.addAll(iterable, this.arguments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArguments(String str) {
        Objects.requireNonNull(str);
        ensureArgumentsIsMutable();
        this.arguments_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArgumentsBytes(com.google.v.v vVar) {
        ensureArgumentsIsMutable();
        this.arguments_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArguments() {
        this.arguments_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -2;
        this.text_ = getDefaultInstance().getText();
    }

    private void ensureArgumentsIsMutable() {
        eo<String> eoVar = this.arguments_;
        if (eoVar.c()) {
            return;
        }
        this.arguments_ = du.mutableCopy(eoVar);
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArguments(int i2, String str) {
        Objects.requireNonNull(str);
        ensureArgumentsIsMutable();
        this.arguments_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        this.text_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"bitField0_", "text_", "arguments_"});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getArguments(int i2) {
        return this.arguments_.get(i2);
    }

    public com.google.v.v getArgumentsBytes(int i2) {
        return com.google.v.v.s(this.arguments_.get(i2));
    }

    public int getArgumentsCount() {
        return this.arguments_.size();
    }

    public List<String> getArgumentsList() {
        return this.arguments_;
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static an newBuilder(ao aoVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
