package qf;

import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f44263b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f44264c;

    /* renamed from: d, reason: collision with root package name */
    public int f44265d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f44267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File rootDir) {
        super(rootDir);
        AbstractC3340k.e(rootDir, "rootDir");
        this.f44267f = fVar;
    }

    @Override // qf.g
    public final File a() {
        boolean z2 = this.f44266e;
        File file = this.f44275a;
        f fVar = this.f44267f;
        if (!z2 && this.f44264c == null) {
            fVar.f44274b.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f44264c = fileArrListFiles;
            if (fileArrListFiles == null) {
                fVar.f44274b.getClass();
                this.f44266e = true;
            }
        }
        File[] fileArr = this.f44264c;
        if (fileArr != null && this.f44265d < fileArr.length) {
            AbstractC3340k.b(fileArr);
            int i5 = this.f44265d;
            this.f44265d = i5 + 1;
            return fileArr[i5];
        }
        if (this.f44263b) {
            fVar.f44274b.getClass();
            return null;
        }
        this.f44263b = true;
        return file;
    }
}
