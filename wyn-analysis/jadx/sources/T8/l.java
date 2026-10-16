package T8;

import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes4.dex */
public final class l implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f11808c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f11809a;

    /* renamed from: b, reason: collision with root package name */
    public k f11810b;

    public l(File file) {
        this.f11809a = file;
    }

    @Override // T8.c
    public final void a() throws IOException {
        R8.g.b(this.f11810b, "There was a problem closing the Crashlytics log file.");
        this.f11810b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // T8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.io.File r0 = r7.f11809a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L3a
        Lc:
            r7.c()
            T8.k r0 = r7.f11810b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.D()
            byte[] r0 = new byte[r0]
            T8.k r4 = r7.f11810b     // Catch: java.io.IOException -> L29
            T8.e r5 = new T8.e     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.h(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L31:
            A.x r4 = new A.x
            r3 = r3[r2]
            r5 = 10
            r4.<init>(r0, r3, r5)
        L3a:
            if (r4 != 0) goto L3e
            r3 = r1
            goto L49
        L3e:
            int r0 = r4.f187b
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f188c
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L49:
            if (r3 == 0) goto L53
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = T8.l.f11808c
            r0.<init>(r3, r1)
            return r0
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T8.l.b():java.lang.String");
    }

    public final void c() {
        File file = this.f11809a;
        if (this.f11810b == null) {
            try {
                this.f11810b = new k(file);
            } catch (IOException e7) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e7);
            }
        }
    }

    @Override // T8.c
    public final void e(long j8, String str) {
        c();
        if (this.f11810b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - Http2.INITIAL_MAX_FRAME_SIZE);
            }
            this.f11810b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j8), str.replaceAll("\r", StringUtils.SPACE).replaceAll("\n", StringUtils.SPACE)).getBytes(f11808c));
            while (!this.f11810b.i() && this.f11810b.D() > 65536) {
                this.f11810b.y();
            }
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e7);
        }
    }
}
