package i.b.r.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f extends du<f, a> implements g {
    public static final int DAY_OF_WEEK_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    public static final int HOUR_FIELD_NUMBER = 2;
    public static final int MINUTE_FIELD_NUMBER = 3;
    private static volatile fo<f> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int dayOfWeek_;
    private int hour_;
    private int minute_;
    private int type_ = 1;
    private int source_ = 1;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDayOfWeek() {
        this.bitField0_ &= -2;
        this.dayOfWeek_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHour() {
        this.bitField0_ &= -3;
        this.hour_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinute() {
        this.bitField0_ &= -5;
        this.minute_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.bitField0_ &= -17;
        this.source_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -9;
        this.type_ = 1;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDayOfWeek(b bVar) {
        this.dayOfWeek_ = bVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHour(int i2) {
        this.bitField0_ |= 2;
        this.hour_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinute(int i2) {
        this.bitField0_ |= 4;
        this.minute_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(d dVar) {
        this.source_ = dVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(e eVar) {
        this.type_ = eVar.getNumber();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "dayOfWeek_", c.f49274b, "hour_", "minute_", "type_", c.f49275c, "source_", c.f49273a});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getDayOfWeek() {
        b bVarA = b.a(this.dayOfWeek_);
        return bVarA == null ? b.ALL_WEEK : bVarA;
    }

    public int getHour() {
        return this.hour_;
    }

    public int getMinute() {
        return this.minute_;
    }

    public d getSource() {
        d dVarA = d.a(this.source_);
        return dVarA == null ? d.DEFAULT_PREFERENCE : dVarA;
    }

    public e getType() {
        e eVarA = e.a(this.type_);
        return eVarA == null ? e.ARRIVE_AT : eVarA;
    }

    public boolean hasDayOfWeek() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHour() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMinute() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(f fVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
