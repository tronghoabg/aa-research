package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmptyThreadTrack extends ThreadTrack {
    public EmptyThreadTrack(EmptyProcessTrack emptyProcessTrack) {
        super(-1L, "Empty Thread", emptyProcessTrack);
    }
}
