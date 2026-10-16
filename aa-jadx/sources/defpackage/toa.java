package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class toa implements java.io.FilenameFilter {
    private final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        int i = this.a;
        if (i == 0) {
            int i2 = defpackage.tob.a;
            return str.startsWith("_google_maps_sdk_crash_count_");
        }
        if (i != 1) {
            return str.endsWith(".feedbackbundle.ready");
        }
        int i3 = defpackage.tob.a;
        return str.startsWith("_google_maps_sdk_crash_count_");
    }
}
