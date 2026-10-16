package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class vsp {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public vsp(File file, String str) {
        this.a = file;
        this.d = str;
    }

    public final int a() {
        if (c()) {
            return this.b;
        }
        return 0;
    }

    public final File b() {
        File file = this.e;
        if (file != null) {
            return file;
        }
        File file2 = new File(this.a, this.d.concat("_crash_counter_storage.pb"));
        this.e = file2;
        return file2;
    }

    public final boolean c() throws IOException {
        if (this.c) {
            return true;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            try {
                this.b = ((vsx) abnv.z(vsx.a, fileInputStream, abnj.a())).c;
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            this.b = 0;
        } catch (IOException e) {
            ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9809)).u("failed to read counter from disk.");
            return false;
        }
        this.c = true;
        return true;
    }
}
