package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aaic implements java.io.FileFilter {
    private final /* synthetic */ int a;

    public aaic(int i) {
        this.a = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(java.io.File file) {
        int i = this.a;
        if (i == 0) {
            return file.isFile() && file.getName().startsWith("tile") && file.getName().endsWith("_0_0_0");
        }
        if (i != 1) {
            return file.isFile() && file.getName().startsWith("tile") && !file.getName().endsWith("_0_0_0");
        }
        return file.isFile() && file.getName().startsWith("config");
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? "NON_ROOT_TILE_FILE_FILTER" : "PANO_FILE_FILTER";
        }
        return "ROOT_TILE_FILE_FILTER";
    }
}
