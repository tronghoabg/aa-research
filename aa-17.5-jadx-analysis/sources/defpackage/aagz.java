package defpackage;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes3.dex */
final class aagz implements FileFilter {
    private final /* synthetic */ int a;

    public aagz(int i) {
        this.a = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = this.a;
        return i != 0 ? i != 1 ? file.isFile() && file.getName().startsWith("tile") && !file.getName().endsWith("_0_0_0") : file.isFile() && file.getName().startsWith("config") : file.isFile() && file.getName().startsWith("tile") && file.getName().endsWith("_0_0_0");
    }

    public final String toString() {
        int i = this.a;
        return i != 0 ? i != 1 ? "NON_ROOT_TILE_FILE_FILTER" : "PANO_FILE_FILTER" : "ROOT_TILE_FILE_FILTER";
    }
}
