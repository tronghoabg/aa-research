package C4;

import L4.t;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final h f1791c = new h(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1792a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1793b;

    public /* synthetic */ i(Object obj, int i5) {
        this.f1792a = i5;
        this.f1793b = obj;
    }

    @Override // C4.g
    public void a() {
        switch (this.f1792a) {
            case 2:
                ((t) this.f1793b).b();
                break;
        }
    }

    @Override // C4.g
    public Object b() {
        switch (this.f1792a) {
            case 1:
                return this.f1793b;
            case 2:
                t tVar = (t) this.f1793b;
                tVar.reset();
                return tVar;
            default:
                return e();
        }
    }

    public ParcelFileDescriptor e() throws IOException, ErrnoException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ((i) this.f1793b).f1793b;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e7) {
            throw new IOException(e7);
        }
    }

    public i() {
        this.f1792a = 0;
        this.f1793b = new HashMap();
    }

    public i(InputStream inputStream, F4.f fVar) {
        this.f1792a = 2;
        t tVar = new t(inputStream, fVar);
        this.f1793b = tVar;
        tVar.mark(5242880);
    }

    public i(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1792a = 4;
        this.f1793b = new i(parcelFileDescriptor, 3);
    }

    private final void c() {
    }

    private final void d() {
    }
}
