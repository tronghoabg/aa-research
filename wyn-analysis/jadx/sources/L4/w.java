package L4;

import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes.dex */
public final class w implements E4.B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6935a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6936b;

    public w(byte[] bArr) {
        gc.b.k(bArr, "Argument must not be null");
        this.f6936b = bArr;
    }

    @Override // E4.B
    public final void a() {
        int i5 = this.f6935a;
    }

    @Override // E4.B
    public final Class b() {
        switch (this.f6935a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return ((File) this.f6936b).getClass();
        }
    }

    @Override // E4.B
    public final Object get() {
        switch (this.f6935a) {
            case 0:
                return (Bitmap) this.f6936b;
            case 1:
                return (byte[]) this.f6936b;
            default:
                return (File) this.f6936b;
        }
    }

    @Override // E4.B
    public final int getSize() {
        switch (this.f6935a) {
            case 0:
                return Y4.m.c((Bitmap) this.f6936b);
            case 1:
                return ((byte[]) this.f6936b).length;
            default:
                return 1;
        }
    }

    public w(File file) {
        gc.b.k(file, "Argument must not be null");
        this.f6936b = file;
    }

    public w(Bitmap bitmap) {
        this.f6936b = bitmap;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
