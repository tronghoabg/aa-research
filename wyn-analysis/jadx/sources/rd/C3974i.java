package rd;

import R8.v;
import cg.C1609A;
import cg.C1618g;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.Closeable;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* renamed from: rd.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3974i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C1609A f44790a;

    /* renamed from: b, reason: collision with root package name */
    public final C1618g f44791b;

    /* renamed from: c, reason: collision with root package name */
    public final C3969d f44792c;

    /* renamed from: d, reason: collision with root package name */
    public int f44793d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44794e;

    public C3974i(C1609A c1609a) {
        this.f44790a = c1609a;
        C1618g c1618g = new C1618g();
        this.f44791b = c1618g;
        C3969d c3969d = new C3969d();
        c3969d.f44774e = new C3967b[8];
        c3969d.f44771b = 7;
        c3969d.f44773d = c1618g;
        this.f44792c = c3969d;
        this.f44793d = Http2.INITIAL_MAX_FRAME_SIZE;
    }

    public final void a(int i5, int i10, byte b5, byte b10) {
        Logger logger = C3975j.f44795a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC3972g.a(false, i5, i10, b5, b10));
        }
        int i11 = this.f44793d;
        if (i10 > i11) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(v.e(i11, i10, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i5) != 0) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "reserved bit set: "));
        }
        C1609A c1609a = this.f44790a;
        c1609a.writeByte((i10 >>> 16) & 255);
        c1609a.writeByte((i10 >>> 8) & 255);
        c1609a.writeByte(i10 & 255);
        c1609a.writeByte(b5 & ForkServer.ERROR);
        c1609a.writeByte(b10 & ForkServer.ERROR);
        c1609a.d(i5 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r18, int r19, java.util.ArrayList r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rd.C3974i.b(boolean, int, java.util.ArrayList):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f44794e = true;
        this.f44790a.close();
    }
}
