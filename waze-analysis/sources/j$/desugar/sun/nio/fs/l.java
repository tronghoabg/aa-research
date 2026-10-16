package j$.desugar.sun.nio.fs;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.nio.file.Path;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.util.Iterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final g f49670a;

    /* renamed from: b, reason: collision with root package name */
    public final File[] f49671b;

    /* renamed from: c, reason: collision with root package name */
    public int f49672c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f49673d;

    public l(m mVar, Path path, g gVar) {
        this.f49673d = mVar;
        File[] fileArrListFiles = path.toFile().listFiles();
        this.f49671b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.f49670a = gVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o next() {
        o oVar;
        do {
            int i2 = this.f49672c;
            File[] fileArr = this.f49671b;
            if (i2 >= fileArr.length) {
                return null;
            }
            this.f49672c = i2 + 1;
            oVar = new o(this.f49673d.f49675f, fileArr[i2].getPath(), this.f49673d.f49674e, DomExceptionUtils.SEPARATOR);
            try {
            } catch (IOException e2) {
                throw new DirectoryIteratorException(e2);
            }
        } while (!this.f49670a.mo37425accept((g) oVar));
        return oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.f49672c--;
        return true;
    }
}
