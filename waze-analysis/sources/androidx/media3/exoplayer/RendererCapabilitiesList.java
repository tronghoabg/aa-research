package androidx.media3.exoplayer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface RendererCapabilitiesList {

    /* compiled from: WazeSource */
    public interface Factory {
        RendererCapabilitiesList createRendererCapabilitiesList();
    }

    RendererCapabilities[] getRendererCapabilities();

    void release();

    int size();
}
