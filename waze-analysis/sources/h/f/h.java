package h.f;

import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f48079a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f48080b;

    /* renamed from: c, reason: collision with root package name */
    private File[] f48081c;

    /* renamed from: d, reason: collision with root package name */
    private int f48082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, File file) {
        super(file);
        x.f(file, "rootDir");
        this.f48079a = iVar;
    }

    @Override // h.f.j
    public final File a() {
        h.g.a.p pVar;
        if (!this.f48080b) {
            this.f48080b = true;
            return b();
        }
        File[] fileArr = this.f48081c;
        if (fileArr != null && this.f48082d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = b().listFiles();
            this.f48081c = fileArrListFiles;
            if (fileArrListFiles == null && (pVar = this.f48079a.f48083a.f48088c) != null) {
                pVar.invoke(b(), new a(b()));
            }
            fileArr = this.f48081c;
            if (fileArr == null || fileArr.length == 0) {
                return null;
            }
        }
        x.c(fileArr);
        int i2 = this.f48082d;
        this.f48082d = i2 + 1;
        return fileArr[i2];
    }
}
