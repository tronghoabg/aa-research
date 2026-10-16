package i3;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f36772a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36773b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36774c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36775d;

    public h(int i5, int i10, long j8, long j10) {
        this.f36772a = i5;
        this.f36773b = i10;
        this.f36774c = j8;
        this.f36775d = j10;
    }

    public static h a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f36772a);
            dataOutputStream.writeInt(this.f36773b);
            dataOutputStream.writeLong(this.f36774c);
            dataOutputStream.writeLong(this.f36775d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f36773b == hVar.f36773b && this.f36774c == hVar.f36774c && this.f36772a == hVar.f36772a && this.f36775d == hVar.f36775d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36773b), Long.valueOf(this.f36774c), Integer.valueOf(this.f36772a), Long.valueOf(this.f36775d));
    }
}
