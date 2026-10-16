package I4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z implements q, B4.b {

    /* renamed from: b, reason: collision with root package name */
    public static final z f5379b = new z(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5380a;

    public /* synthetic */ z(int i5) {
        this.f5380a = i5;
    }

    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public Class b() {
        switch (this.f5380a) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // I4.q
    public p d(v vVar) {
        switch (this.f5380a) {
            case 0:
                return A.f5319b;
            case 2:
                return new C0618c(new z(1), 0);
            case 4:
                return new C0618c(new z(3), 0);
            case 6:
                return new A(1);
            case 11:
                return new y(vVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new y(vVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new y(vVar.b(Uri.class, InputStream.class), 0);
            default:
                return new D(vVar.b(f.class, InputStream.class));
        }
    }

    @Override // B4.b
    public boolean g(Object obj, File file, B4.g gVar) throws Throwable {
        try {
            Y4.c.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e7) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e7);
            return false;
        }
    }
}
