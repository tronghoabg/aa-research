package i.b.q;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ae extends du<ae, ab> implements fj {
    public static final int CALENDAR_EVENT_INFO_FIELD_NUMBER = 4;
    private static final ae DEFAULT_INSTANCE;
    public static final int MEETINGID_FIELD_NUMBER = 1;
    public static final int MEETINGNAME_FIELD_NUMBER = 3;
    private static volatile fo<ae> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.waze.bg.c.b calendarEventInfo_;
    private String meetingId_ = "";
    private String meetingName_ = "";
    private int type_;

    static {
        ae aeVar = new ae();
        DEFAULT_INSTANCE = aeVar;
        du.registerDefaultInstance(ae.class, aeVar);
    }

    private ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalendarEventInfo() {
        this.calendarEventInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingId() {
        this.bitField0_ &= -2;
        this.meetingId_ = getDefaultInstance().getMeetingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingName() {
        this.bitField0_ &= -5;
        this.meetingName_ = getDefaultInstance().getMeetingName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 0;
    }

    public static ae getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCalendarEventInfo(com.waze.bg.c.b bVar) {
        Objects.requireNonNull(bVar);
        com.waze.bg.c.b bVar2 = this.calendarEventInfo_;
        if (bVar2 != null && bVar2 != com.waze.bg.c.b.getDefaultInstance()) {
            com.waze.bg.c.a aVarNewBuilder = com.waze.bg.c.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.waze.bg.c.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.calendarEventInfo_ = bVar;
        this.bitField0_ |= 8;
    }

    public static ab newBuilder() {
        return (ab) DEFAULT_INSTANCE.createBuilder();
    }

    public static ae parseDelimitedFrom(InputStream inputStream) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(com.google.v.v vVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ae> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalendarEventInfo(com.waze.bg.c.b bVar) {
        Objects.requireNonNull(bVar);
        this.calendarEventInfo_ = bVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.meetingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingIdBytes(com.google.v.v vVar) {
        this.meetingId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.meetingName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingNameBytes(com.google.v.v vVar) {
        this.meetingName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ad adVar) {
        this.type_ = adVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "meetingId_", "type_", ac.f49231a, "meetingName_", "calendarEventInfo_"});
        }
        if (iOrdinal == 3) {
            return new ae();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ab(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ae> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ae.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.c.b getCalendarEventInfo() {
        com.waze.bg.c.b bVar = this.calendarEventInfo_;
        return bVar == null ? com.waze.bg.c.b.getDefaultInstance() : bVar;
    }

    public String getMeetingId() {
        return this.meetingId_;
    }

    public com.google.v.v getMeetingIdBytes() {
        return com.google.v.v.s(this.meetingId_);
    }

    public String getMeetingName() {
        return this.meetingName_;
    }

    public com.google.v.v getMeetingNameBytes() {
        return com.google.v.v.s(this.meetingName_);
    }

    public ad getType() {
        ad adVarA = ad.a(this.type_);
        return adVarA == null ? ad.UNKNOWN : adVarA;
    }

    public boolean hasCalendarEventInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMeetingId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMeetingName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ab newBuilder(ae aeVar) {
        return (ab) DEFAULT_INSTANCE.createBuilder(aeVar);
    }

    public static ae parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(com.google.v.v vVar, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ae parseFrom(com.google.v.z zVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ae parseFrom(com.google.v.z zVar, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ae parseFrom(InputStream inputStream) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(InputStream inputStream, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(ByteBuffer byteBuffer) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ae parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ae parseFrom(byte[] bArr) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ae parseFrom(byte[] bArr, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
