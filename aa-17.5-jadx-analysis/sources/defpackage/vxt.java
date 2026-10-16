package defpackage;

import android.R;
import java.util.Random;

/* loaded from: classes.dex */
public final class vxt {
    public final int c;
    public final short[] a = new short[256];
    public final short[] b = new short[256];
    public long d = 0;

    public vxt(Random random) {
        this.c = (random.nextInt() & (-33686019)) | R.attr.cacheColorHint;
    }
}
