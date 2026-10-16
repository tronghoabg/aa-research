package qf;

import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f44269b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f44270c;

    /* renamed from: d, reason: collision with root package name */
    public int f44271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f44272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File rootDir) {
        super(rootDir);
        AbstractC3340k.e(rootDir, "rootDir");
        this.f44272e = fVar;
    }

    @Override // qf.g
    public final File a() {
        boolean z2 = this.f44269b;
        File file = this.f44275a;
        f fVar = this.f44272e;
        if (!z2) {
            fVar.f44274b.getClass();
            this.f44269b = true;
            return file;
        }
        File[] fileArr = this.f44270c;
        if (fileArr != null && this.f44271d >= fileArr.length) {
            fVar.f44274b.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f44270c = fileArrListFiles;
            if (fileArrListFiles == null) {
                fVar.f44274b.getClass();
            }
            File[] fileArr2 = this.f44270c;
            if (fileArr2 == null || fileArr2.length == 0) {
                fVar.f44274b.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f44270c;
        AbstractC3340k.b(fileArr3);
        int i5 = this.f44271d;
        this.f44271d = i5 + 1;
        return fileArr3[i5];
    }
}
