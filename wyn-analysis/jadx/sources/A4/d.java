package A4;

import F4.f;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f325a;

    /* renamed from: c, reason: collision with root package name */
    public final S3.c f327c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f328d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f329e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f330f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f331g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f332h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f333i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f334j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public b f335l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f336m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f337n;

    /* renamed from: o, reason: collision with root package name */
    public int f338o;

    /* renamed from: p, reason: collision with root package name */
    public final int f339p;

    /* renamed from: q, reason: collision with root package name */
    public final int f340q;

    /* renamed from: r, reason: collision with root package name */
    public final int f341r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f342s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f326b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f343t = Bitmap.Config.ARGB_8888;

    public d(S3.c cVar, b bVar, ByteBuffer byteBuffer, int i5) {
        this.f327c = cVar;
        this.f335l = new b();
        synchronized (this) {
            try {
                if (i5 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i5);
                }
                int iHighestOneBit = Integer.highestOneBit(i5);
                this.f338o = 0;
                this.f335l = bVar;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f328d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f328d.order(ByteOrder.LITTLE_ENDIAN);
                this.f337n = false;
                Iterator it = bVar.f315e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((a) it.next()).f307g == 3) {
                        this.f337n = true;
                        break;
                    }
                }
                this.f339p = iHighestOneBit;
                int i10 = bVar.f316f;
                this.f341r = i10 / iHighestOneBit;
                int i11 = bVar.f317g;
                this.f340q = i11 / iHighestOneBit;
                this.f333i = (byte[]) ((f) this.f327c.f10937c).e(i10 * i11, byte[].class);
                this.f334j = (int[]) ((f) this.f327c.f10937c).e(this.f341r * this.f340q, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f342s;
        Bitmap bitmapE = ((F4.a) this.f327c.f10936b).e(this.f341r, this.f340q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f343t);
        bitmapE.setHasAlpha(true);
        return bitmapE;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.f335l.f313c <= 0 || this.k < 0) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, frameCount=" + this.f335l.f313c + ", framePointer=" + this.k);
                }
                this.f338o = 1;
            }
            int i5 = this.f338o;
            if (i5 != 1 && i5 != 2) {
                this.f338o = 0;
                if (this.f329e == null) {
                    this.f329e = (byte[]) ((f) this.f327c.f10937c).e(255, byte[].class);
                }
                a aVar = (a) this.f335l.f315e.get(this.k);
                int i10 = this.k - 1;
                a aVar2 = i10 >= 0 ? (a) this.f335l.f315e.get(i10) : null;
                int[] iArr = aVar.k;
                if (iArr == null) {
                    iArr = this.f335l.f311a;
                }
                this.f325a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("d", 3)) {
                        Log.d("d", "No valid color table found for frame #" + this.k);
                    }
                    this.f338o = 1;
                    return null;
                }
                if (aVar.f306f) {
                    System.arraycopy(iArr, 0, this.f326b, 0, iArr.length);
                    int[] iArr2 = this.f326b;
                    this.f325a = iArr2;
                    iArr2[aVar.f308h] = 0;
                    if (aVar.f307g == 2 && this.k == 0) {
                        this.f342s = Boolean.TRUE;
                    }
                }
                return d(aVar, aVar2);
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, status=" + this.f338o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f343t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap d(A4.a r36, A4.a r37) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.d.d(A4.a, A4.a):android.graphics.Bitmap");
    }
}
