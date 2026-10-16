package I4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: I4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619d implements C4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5330a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5331b;

    public /* synthetic */ C0619d(Object obj, int i5) {
        this.f5330a = i5;
        this.f5331b = obj;
    }

    @Override // C4.e
    public final void a() {
        int i5 = this.f5330a;
    }

    @Override // C4.e
    public final Class b() {
        switch (this.f5330a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f5331b.getClass();
        }
    }

    @Override // C4.e
    public final void cancel() {
        int i5 = this.f5330a;
    }

    @Override // C4.e
    public final int d() {
        switch (this.f5330a) {
        }
        return 1;
    }

    @Override // C4.e
    public final void e(com.bumptech.glide.d dVar, C4.d dVar2) {
        switch (this.f5330a) {
            case 0:
                try {
                    dVar2.i(Y4.c.a((File) this.f5331b));
                    break;
                } catch (IOException e7) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e7);
                    }
                    dVar2.c(e7);
                    return;
                }
            default:
                dVar2.i(this.f5331b);
                break;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
