package i.b.g;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends du<g, f> implements fj {
    private static final g DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile fo<g> PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private n message_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = null;
        this.bitField0_ &= -2;
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessage(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.message_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            k kVarNewBuilder = n.newBuilder(nVar2);
            kVarNewBuilder.mergeFrom((k) nVar);
            nVar = kVarNewBuilder.buildPartial();
        }
        this.message_ = nVar;
        this.bitField0_ |= 1;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(n nVar) {
        Objects.requireNonNull(nVar);
        this.message_ = nVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"bitField0_", "message_"});
            case 3:
                return new g();
            case 4:
                return new f(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<g> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (g.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public n getMessage() {
        n nVar = this.message_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(v vVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(z zVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
