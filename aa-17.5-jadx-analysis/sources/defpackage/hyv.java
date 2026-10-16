package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hyv implements hyu {
    private final /* synthetic */ int a;

    public hyv(int i) {
        this.a = i;
    }

    @Override // defpackage.hyu
    public final Class a() {
        return this.a != 0 ? ParcelFileDescriptor.class : InputStream.class;
    }

    @Override // defpackage.hyu
    public final /* synthetic */ Object b(File file) throws FileNotFoundException {
        return this.a != 0 ? ParcelFileDescriptor.open(file, 268435456) : new FileInputStream(file);
    }

    @Override // defpackage.hyu
    public final /* synthetic */ void c(Object obj) throws IOException {
        if (this.a != 0) {
            ((ParcelFileDescriptor) obj).close();
        } else {
            ((InputStream) obj).close();
        }
    }
}
