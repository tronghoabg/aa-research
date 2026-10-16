package i.b.q;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aq extends du<aq, ap> implements fj {
    private static final aq DEFAULT_INSTANCE;
    public static final int FILTERPREDICTIONS_FIELD_NUMBER = 1;
    public static final int GETDESTINATIONSUGGESTIONS_FIELD_NUMBER = 3;
    public static final int GET_TOP_SUGGESTION_LEAVE_NOW_FIELD_NUMBER = 5;
    private static volatile fo<aq> PARSER = null;
    public static final int RETURN_UNVERIFIED_CALENDAR_EVENTS_FIELD_NUMBER = 4;
    public static final int SHOULDSIMULATEPREDICTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean filterPredictions_;
    private boolean getDestinationSuggestions_;
    private boolean getTopSuggestionLeaveNow_;
    private boolean returnUnverifiedCalendarEvents_;
    private boolean shouldSimulatePredictions_;

    static {
        aq aqVar = new aq();
        DEFAULT_INSTANCE = aqVar;
        du.registerDefaultInstance(aq.class, aqVar);
    }

    private aq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilterPredictions() {
        this.bitField0_ &= -2;
        this.filterPredictions_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetDestinationSuggestions() {
        this.bitField0_ &= -5;
        this.getDestinationSuggestions_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetTopSuggestionLeaveNow() {
        this.bitField0_ &= -17;
        this.getTopSuggestionLeaveNow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnUnverifiedCalendarEvents() {
        this.bitField0_ &= -9;
        this.returnUnverifiedCalendarEvents_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldSimulatePredictions() {
        this.bitField0_ &= -3;
        this.shouldSimulatePredictions_ = false;
    }

    public static aq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
    }

    public static aq parseDelimitedFrom(InputStream inputStream) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(com.google.v.v vVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterPredictions(boolean z) {
        this.bitField0_ |= 1;
        this.filterPredictions_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetDestinationSuggestions(boolean z) {
        this.bitField0_ |= 4;
        this.getDestinationSuggestions_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetTopSuggestionLeaveNow(boolean z) {
        this.bitField0_ |= 16;
        this.getTopSuggestionLeaveNow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnUnverifiedCalendarEvents(boolean z) {
        this.bitField0_ |= 8;
        this.returnUnverifiedCalendarEvents_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldSimulatePredictions(boolean z) {
        this.bitField0_ |= 2;
        this.shouldSimulatePredictions_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "filterPredictions_", "shouldSimulatePredictions_", "getDestinationSuggestions_", "returnUnverifiedCalendarEvents_", "getTopSuggestionLeaveNow_"});
        }
        if (iOrdinal == 3) {
            return new aq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ap(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getFilterPredictions() {
        return this.filterPredictions_;
    }

    public boolean getGetDestinationSuggestions() {
        return this.getDestinationSuggestions_;
    }

    public boolean getGetTopSuggestionLeaveNow() {
        return this.getTopSuggestionLeaveNow_;
    }

    public boolean getReturnUnverifiedCalendarEvents() {
        return this.returnUnverifiedCalendarEvents_;
    }

    public boolean getShouldSimulatePredictions() {
        return this.shouldSimulatePredictions_;
    }

    public boolean hasFilterPredictions() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGetDestinationSuggestions() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGetTopSuggestionLeaveNow() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasReturnUnverifiedCalendarEvents() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasShouldSimulatePredictions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ap newBuilder(aq aqVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(aqVar);
    }

    public static aq parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(com.google.v.v vVar, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aq parseFrom(com.google.v.z zVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aq parseFrom(com.google.v.z zVar, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aq parseFrom(InputStream inputStream) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(InputStream inputStream, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(ByteBuffer byteBuffer) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aq parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aq parseFrom(byte[] bArr) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aq parseFrom(byte[] bArr, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
