package i.b.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends du<o, m> implements p {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final o DEFAULT_INSTANCE;
    public static final int INT_VALUE_FIELD_NUMBER = 5;
    public static final int LAST_MODIFIED_FIELD_NUMBER = 3;
    public static final int LONG_VALUE_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<o> PARSER = null;
    public static final int SCOPE_FIELD_NUMBER = 2;
    public static final int SET_FIELD_NUMBER = 8;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private long lastModified_;
    private int scope_;
    private Object value_;
    private int valueCase_ = 0;
    private String name_ = "";
    private int set_ = 1;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.valueCase_ == 4) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntValue() {
        if (this.valueCase_ == 5) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastModified() {
        this.bitField0_ &= -9;
        this.lastModified_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongValue() {
        if (this.valueCase_ == 6) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScope() {
        this.bitField0_ &= -3;
        this.scope_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSet() {
        this.bitField0_ &= -5;
        this.set_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.valueCase_ == 7) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(com.google.v.v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.valueCase_ = 4;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntValue(int i2) {
        this.valueCase_ = 5;
        this.value_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastModified(long j2) {
        this.bitField0_ |= 8;
        this.lastModified_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongValue(long j2) {
        this.valueCase_ = 6;
        this.value_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScope(q qVar) {
        this.scope_ = qVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSet(s sVar) {
        this.set_ = sVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 7;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(com.google.v.v vVar) {
        this.value_ = vVar.u();
        this.valueCase_ = 7;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0003\u0004:\u0000\u00057\u0000\u00065\u0000\u0007;\u0000\b᠌\u0002", new Object[]{"value_", "valueCase_", "bitField0_", "name_", "scope_", r.f48496b, "lastModified_", "set_", r.f48495a});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new m(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBoolValue() {
        if (this.valueCase_ == 4) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public int getIntValue() {
        if (this.valueCase_ == 5) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long getLastModified() {
        return this.lastModified_;
    }

    public long getLongValue() {
        if (this.valueCase_ == 6) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public q getScope() {
        q qVarA = q.a(this.scope_);
        return qVarA == null ? q.ACCOUNT : qVarA;
    }

    public s getSet() {
        s sVarA = s.a(this.set_);
        return sVarA == null ? s.USER_PREFERENCES : sVarA;
    }

    public String getStringValue() {
        return this.valueCase_ == 7 ? (String) this.value_ : "";
    }

    public com.google.v.v getStringValueBytes() {
        return com.google.v.v.s(this.valueCase_ == 7 ? (String) this.value_ : "");
    }

    public n getValueCase() {
        int i2 = this.valueCase_;
        if (i2 == 0) {
            return n.f48489e;
        }
        if (i2 == 4) {
            return n.f48485a;
        }
        if (i2 == 5) {
            return n.f48486b;
        }
        if (i2 == 6) {
            return n.f48487c;
        }
        if (i2 != 7) {
            return null;
        }
        return n.f48488d;
    }

    public boolean hasBoolValue() {
        return this.valueCase_ == 4;
    }

    public boolean hasIntValue() {
        return this.valueCase_ == 5;
    }

    public boolean hasLastModified() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLongValue() {
        return this.valueCase_ == 6;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasScope() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSet() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasStringValue() {
        return this.valueCase_ == 7;
    }

    public static m newBuilder(o oVar) {
        return (m) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(com.google.v.v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(com.google.v.z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(com.google.v.z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
