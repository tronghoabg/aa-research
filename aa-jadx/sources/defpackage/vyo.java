package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vyo {
    public final int c;
    public final short[] a = new short[256];
    public final short[] b = new short[256];
    public long d = 0;

    public vyo(java.util.Random random) {
        this.c = (random.nextInt() & (-33686019)) | android.R.attr.cacheColorHint;
    }
}
