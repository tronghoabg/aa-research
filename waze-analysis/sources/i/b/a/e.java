package i.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends du<e, d> implements f {
    private static final e DEFAULT_INSTANCE;
    private static volatile fo<e> PARSER = null;
    public static final int TEMPLATE_PARAMETER_FIELD_NUMBER = 2;
    public static final int TEXT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private eo<String> templateParameter_ = emptyProtobufList();
    private int textId_;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTemplateParameter(Iterable<String> iterable) {
        ensureTemplateParameterIsMutable();
        com.google.v.c.addAll(iterable, this.templateParameter_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTemplateParameter(String str) {
        Objects.requireNonNull(str);
        ensureTemplateParameterIsMutable();
        this.templateParameter_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTemplateParameterBytes(v vVar) {
        ensureTemplateParameterIsMutable();
        this.templateParameter_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemplateParameter() {
        this.templateParameter_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextId() {
        this.bitField0_ &= -2;
        this.textId_ = 0;
    }

    private void ensureTemplateParameterIsMutable() {
        eo<String> eoVar = this.templateParameter_;
        if (eoVar.c()) {
            return;
        }
        this.templateParameter_ = du.mutableCopy(eoVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemplateParameter(int i2, String str) {
        Objects.requireNonNull(str);
        ensureTemplateParameterIsMutable();
        this.templateParameter_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextId(int i2) {
        this.bitField0_ |= 1;
        this.textId_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001a", new Object[]{"bitField0_", "textId_", "templateParameter_"});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getTemplateParameter(int i2) {
        return this.templateParameter_.get(i2);
    }

    public v getTemplateParameterBytes(int i2) {
        return v.s(this.templateParameter_.get(i2));
    }

    public int getTemplateParameterCount() {
        return this.templateParameter_.size();
    }

    public List<String> getTemplateParameterList() {
        return this.templateParameter_;
    }

    public int getTextId() {
        return this.textId_;
    }

    public boolean hasTextId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static d newBuilder(e eVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
