package androidx.tracing;

import h.g.b.o;

/* compiled from: WazeSource */
@DelicateTracingApi
/* loaded from: classes4.dex */
public final class EventMetadataCloseable {
    public AutoCloseable closeable;
    public EventMetadata metadata;
    public PropagationToken propagationToken;

    public /* synthetic */ EventMetadataCloseable(EmptyEventMetadata emptyEventMetadata, EmptyCloseable emptyCloseable, PropagationUnsupportedToken propagationUnsupportedToken, int i2, o oVar) {
        this((i2 & 1) != 0 ? EmptyEventMetadata.INSTANCE : emptyEventMetadata, (i2 & 2) != 0 ? EmptyCloseable.INSTANCE : emptyCloseable, (i2 & 4) != 0 ? PropagationUnsupportedToken.INSTANCE : propagationUnsupportedToken);
    }

    public EventMetadataCloseable(EventMetadata eventMetadata, AutoCloseable autoCloseable, PropagationToken propagationToken) {
        this.metadata = eventMetadata;
        this.closeable = autoCloseable;
        this.propagationToken = propagationToken;
    }

    public EventMetadataCloseable() {
        this(null, null, null, 7, null);
    }
}
