package androidx.tracing;

import androidx.camera.video.AudioStats;
import h.g.b.o;

/* compiled from: WazeSource */
@DelicateTracingApi
/* loaded from: classes4.dex */
public final class MetadataEntry {
    public boolean booleanValue;
    public double doubleValue;
    public long longValue;
    public String name;
    public String stringValue;
    public int type;

    public /* synthetic */ MetadataEntry(String str, int i2, boolean z, long j2, double d2, String str2, int i3, o oVar) {
        this(1 == (i3 & 1) ? null : str, (i3 & 2) != 0 ? 0 : i2, z & ((i3 & 4) == 0), (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d2, (i3 & 32) != 0 ? "" : str2);
    }

    public final void reset() {
        this.name = null;
        this.type = 0;
        this.booleanValue = false;
        this.longValue = 0L;
        this.doubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.stringValue = "";
    }

    public MetadataEntry(String str, int i2, boolean z, long j2, double d2, String str2) {
        this.name = str;
        this.type = i2;
        this.booleanValue = z;
        this.longValue = j2;
        this.doubleValue = d2;
        this.stringValue = str2;
    }

    public MetadataEntry() {
        this(null, 0, false, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, null, 63, null);
    }
}
