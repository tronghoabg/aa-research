package androidx.media3.common;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class FrameInfo {
    public final Format format;
    public final long offsetToAddUs;

    public FrameInfo(Format format, long j2) {
        an.m(format.colorInfo != null, "format colorInfo must be set");
        int i2 = format.width;
        an.o(i2 > 0, "format width must be positive, but is: %s", i2);
        int i3 = format.height;
        an.o(i3 > 0, "format height must be positive, but is: %s", i3);
        this.format = format;
        this.offsetToAddUs = j2;
    }
}
