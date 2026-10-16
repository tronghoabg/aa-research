package h.f;

import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f48073a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f48074b;

    /* renamed from: c, reason: collision with root package name */
    private File[] f48075c;

    /* renamed from: d, reason: collision with root package name */
    private int f48076d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f48077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, File file) {
        super(file);
        x.f(file, "rootDir");
        this.f48073a = iVar;
    }

    @Override // h.f.j
    public final File a() {
        int i2;
        if (!this.f48077e && this.f48075c == null) {
            File[] fileArrListFiles = b().listFiles();
            this.f48075c = fileArrListFiles;
            if (fileArrListFiles == null) {
                h.g.a.p pVar = this.f48073a.f48083a.f48088c;
                if (pVar != null) {
                    pVar.invoke(b(), new a(b()));
                }
                this.f48077e = true;
            }
        }
        File[] fileArr = this.f48075c;
        if (fileArr != null && (i2 = this.f48076d) < fileArr.length) {
            this.f48076d = i2 + 1;
            return fileArr[i2];
        }
        if (this.f48074b) {
            return null;
        }
        this.f48074b = true;
        return b();
    }
}
