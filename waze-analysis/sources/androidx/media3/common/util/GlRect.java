package androidx.media3.common.util;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GlRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public GlRect(int i2, int i3, int i4, int i5) {
        boolean z = false;
        if (i2 <= i4 && i3 <= i5) {
            z = true;
        }
        an.l(z);
        this.left = i2;
        this.bottom = i3;
        this.right = i4;
        this.top = i5;
    }

    public GlRect(int i2, int i3) {
        this(0, 0, i2, i3);
    }
}
