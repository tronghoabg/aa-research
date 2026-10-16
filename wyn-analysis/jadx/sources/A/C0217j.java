package A;

import N.C0718d;
import N.K0;
import android.graphics.Bitmap;
import cg.C1609A;
import cg.C1610B;
import ef.EnumC2526j;
import g4.C2700a;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.Headers;
import okhttp3.Response;

/* renamed from: A.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217j implements K0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f166b;

    /* renamed from: c, reason: collision with root package name */
    public long f167c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f168d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f169e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f170f;

    /* renamed from: g, reason: collision with root package name */
    public Object f171g;

    public C0217j(C1610B c1610b) throws NumberFormatException, EOFException {
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        this.f169e = Fe.c.y(enumC2526j, new C2700a(this, 0));
        this.f170f = Fe.c.y(enumC2526j, new C2700a(this, 1));
        this.f166b = Long.parseLong(c1610b.readUtf8LineStrict(Long.MAX_VALUE));
        this.f167c = Long.parseLong(c1610b.readUtf8LineStrict(Long.MAX_VALUE));
        this.f168d = Integer.parseInt(c1610b.readUtf8LineStrict(Long.MAX_VALUE)) > 0;
        int i5 = Integer.parseInt(c1610b.readUtf8LineStrict(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i10 = 0; i10 < i5; i10++) {
            String utf8LineStrict = c1610b.readUtf8LineStrict(Long.MAX_VALUE);
            Bitmap.Config config = k4.e.f39264a;
            int iV0 = Bf.k.v0(utf8LineStrict, ':', 0, 6);
            if (iV0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(utf8LineStrict).toString());
            }
            String strSubstring = utf8LineStrict.substring(0, iV0);
            AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String name = Bf.k.V0(strSubstring).toString();
            String strSubstring2 = utf8LineStrict.substring(iV0 + 1);
            AbstractC3340k.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            AbstractC3340k.e(name, "name");
            Headers.f42269b.getClass();
            Headers.Companion.a(name);
            builder.c(name, strSubstring2);
        }
        this.f171g = builder.d();
    }

    public void a(C1609A c1609a) {
        c1609a.writeDecimalLong(this.f166b);
        c1609a.writeByte(10);
        c1609a.writeDecimalLong(this.f167c);
        c1609a.writeByte(10);
        c1609a.writeDecimalLong(this.f168d ? 1L : 0L);
        c1609a.writeByte(10);
        Headers headers = (Headers) this.f171g;
        c1609a.writeDecimalLong(headers.size());
        c1609a.writeByte(10);
        int size = headers.size();
        for (int i5 = 0; i5 < size; i5++) {
            c1609a.writeUtf8(headers.c(i5));
            c1609a.writeUtf8(": ");
            c1609a.writeUtf8(headers.f(i5));
            c1609a.writeByte(10);
        }
    }

    @Override // N.K0
    public Object getValue() {
        return ((N.Y) this.f170f).getValue();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.internal.n, tf.l] */
    public String toString() {
        switch (this.f165a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("AnimationState(value=");
                sb2.append(((N.Y) this.f170f).getValue());
                sb2.append(", velocity=");
                sb2.append(((AbstractC3343n) ((S3.e) this.f169e).f10942c).invoke((AbstractC0221n) this.f171g));
                sb2.append(", isRunning=");
                sb2.append(this.f168d);
                sb2.append(", lastFrameTimeNanos=");
                sb2.append(this.f166b);
                sb2.append(", finishedTimeNanos=");
                return AbstractC0213f.e(sb2, this.f167c, ')');
            default:
                return super.toString();
        }
    }

    public C0217j(Response response) {
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        this.f169e = Fe.c.y(enumC2526j, new C2700a(this, 0));
        this.f170f = Fe.c.y(enumC2526j, new C2700a(this, 1));
        this.f166b = response.k;
        this.f167c = response.f42405l;
        this.f168d = response.f42399e != null;
        this.f171g = response.f42400f;
    }

    public C0217j(S3.e typeConverter, Object obj, AbstractC0221n abstractC0221n, long j8, long j10, boolean z2) {
        AbstractC3340k.e(typeConverter, "typeConverter");
        this.f169e = typeConverter;
        this.f170f = C0718d.G(obj, N.P.f7730f);
        this.f171g = abstractC0221n != null ? AbstractC0226t.c(abstractC0221n) : AbstractC0226t.f(typeConverter, obj);
        this.f166b = j8;
        this.f167c = j10;
        this.f168d = z2;
    }
}
