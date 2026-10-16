package androidx.media3.exoplayer;

import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface RenderersFactory {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.RenderersFactory$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Renderer $default$createSecondaryRenderer(RenderersFactory renderersFactory, Renderer renderer, Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
            return null;
        }
    }

    Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput);

    Renderer createSecondaryRenderer(Renderer renderer, Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput);
}
