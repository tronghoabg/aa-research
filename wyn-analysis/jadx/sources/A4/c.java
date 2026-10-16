package A4;

import R8.v;
import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f322b;

    /* renamed from: c, reason: collision with root package name */
    public b f323c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f321a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f324d = 0;

    public final boolean a() {
        return this.f323c.f312b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f322b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f323c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < 6; i5++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f323c.f316f = this.f322b.getShort();
            this.f323c.f317g = this.f322b.getShort();
            int iC = c();
            b bVar = this.f323c;
            bVar.f318h = (iC & 128) != 0;
            bVar.f319i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f323c.f320j = c();
            b bVar2 = this.f323c;
            c();
            bVar2.getClass();
            if (this.f323c.f318h && !a()) {
                b bVar3 = this.f323c;
                bVar3.f311a = e(bVar3.f319i);
                b bVar4 = this.f323c;
                bVar4.k = bVar4.f311a[bVar4.f320j];
            }
        } else {
            this.f323c.f312b = 1;
        }
        if (!a()) {
            boolean z2 = false;
            while (!z2 && !a() && this.f323c.f313c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f323c.f314d = new a();
                        c();
                        int iC4 = c();
                        a aVar = this.f323c.f314d;
                        int i10 = (iC4 & 28) >> 2;
                        aVar.f307g = i10;
                        if (i10 == 0) {
                            aVar.f307g = 1;
                        }
                        aVar.f306f = (iC4 & 1) != 0;
                        short s10 = this.f322b.getShort();
                        if (s10 < 2) {
                            s10 = 10;
                        }
                        a aVar2 = this.f323c.f314d;
                        aVar2.f309i = s10 * 10;
                        aVar2.f308h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = 0;
                        while (true) {
                            bArr = this.f321a;
                            if (i11 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i11]);
                            i11++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b5 = bArr[1];
                                    byte b10 = bArr[2];
                                    this.f323c.getClass();
                                }
                                if (this.f324d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    b bVar5 = this.f323c;
                    if (bVar5.f314d == null) {
                        bVar5.f314d = new a();
                    }
                    bVar5.f314d.f301a = this.f322b.getShort();
                    this.f323c.f314d.f302b = this.f322b.getShort();
                    this.f323c.f314d.f303c = this.f322b.getShort();
                    this.f323c.f314d.f304d = this.f322b.getShort();
                    int iC5 = c();
                    boolean z10 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    a aVar3 = this.f323c.f314d;
                    aVar3.f305e = (iC5 & 64) != 0;
                    if (z10) {
                        aVar3.k = e(iPow);
                    } else {
                        aVar3.k = null;
                    }
                    this.f323c.f314d.f310j = this.f322b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f323c;
                        bVar6.f313c++;
                        bVar6.f315e.add(bVar6.f314d);
                    }
                } else if (iC2 != 59) {
                    this.f323c.f312b = 1;
                } else {
                    z2 = true;
                }
            }
            b bVar7 = this.f323c;
            if (bVar7.f313c < 0) {
                bVar7.f312b = 1;
            }
        }
        return this.f323c;
    }

    public final int c() {
        try {
            return this.f322b.get() & ForkServer.ERROR;
        } catch (Exception unused) {
            this.f323c.f312b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f324d = iC;
        if (iC <= 0) {
            return;
        }
        int i5 = 0;
        int i10 = 0;
        while (true) {
            try {
                i10 = this.f324d;
                if (i5 >= i10) {
                    return;
                }
                i10 -= i5;
                this.f322b.get(this.f321a, i5, i10);
                i5 += i10;
            } catch (Exception e7) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbH = v.h("Error Reading Block n: ", i5, " count: ", i10, " blockSize: ");
                    sbH.append(this.f324d);
                    Log.d("GifHeaderParser", sbH.toString(), e7);
                }
                this.f323c.f312b = 1;
                return;
            }
        }
    }

    public final int[] e(int i5) {
        byte[] bArr = new byte[i5 * 3];
        int[] iArr = null;
        try {
            this.f322b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i5) {
                int i12 = bArr[i11] & ForkServer.ERROR;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & ForkServer.ERROR;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | (-16777216) | (bArr[i13] & ForkServer.ERROR);
                i10 = i15;
            }
            return iArr;
        } catch (BufferUnderflowException e7) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e7);
            }
            this.f323c.f312b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f322b.position(Math.min(this.f322b.position() + iC, this.f322b.limit()));
        } while (iC > 0);
    }
}
