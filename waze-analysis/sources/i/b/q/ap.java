package i.b.q;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ap extends dm<aq, ap> implements fj {
    /* synthetic */ ap(byte[] bArr) {
        super(aq.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((aq) this.instance).setFilterPredictions(false);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((aq) this.instance).setGetDestinationSuggestions(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((aq) this.instance).setGetTopSuggestionLeaveNow(z);
    }

    public final void d() {
        copyOnWrite();
        ((aq) this.instance).setReturnUnverifiedCalendarEvents(false);
    }

    private ap() {
        throw null;
    }
}
