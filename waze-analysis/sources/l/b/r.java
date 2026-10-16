package l.b;

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
/* loaded from: classes9.dex */
public final class r extends du<r, j> implements fj {
    private static final r DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    private static volatile fo<r> PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    private int eventCase_ = 0;
    private Object event_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        if (this.eventCase_ == 2) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        if (this.eventCase_ == 1) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnd(o oVar) {
        Objects.requireNonNull(oVar);
        if (this.eventCase_ == 2 && this.event_ != o.getDefaultInstance()) {
            l lVarNewBuilder = o.newBuilder((o) this.event_);
            lVarNewBuilder.mergeFrom((l) oVar);
            oVar = lVarNewBuilder.buildPartial();
        }
        this.event_ = oVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStart(q qVar) {
        Objects.requireNonNull(qVar);
        if (this.eventCase_ == 1 && this.event_ != q.getDefaultInstance()) {
            p pVarNewBuilder = q.newBuilder((q) this.event_);
            pVarNewBuilder.mergeFrom((p) qVar);
            qVar = pVarNewBuilder.buildPartial();
        }
        this.event_ = qVar;
        this.eventCase_ = 1;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(v vVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(o oVar) {
        Objects.requireNonNull(oVar);
        this.event_ = oVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(q qVar) {
        Objects.requireNonNull(qVar);
        this.event_ = qVar;
        this.eventCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"event_", "eventCase_", q.class, o.class});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public o getEnd() {
        return this.eventCase_ == 2 ? (o) this.event_ : o.getDefaultInstance();
    }

    public k getEventCase() {
        int i2 = this.eventCase_;
        if (i2 == 0) {
            return k.f55778c;
        }
        if (i2 == 1) {
            return k.f55776a;
        }
        if (i2 != 2) {
            return null;
        }
        return k.f55777b;
    }

    public q getStart() {
        return this.eventCase_ == 1 ? (q) this.event_ : q.getDefaultInstance();
    }

    public boolean hasEnd() {
        return this.eventCase_ == 2;
    }

    public boolean hasStart() {
        return this.eventCase_ == 1;
    }

    public static j newBuilder(r rVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(v vVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(z zVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(z zVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
