package com.bumptech.glide.b;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f2777b;

    /* renamed from: c, reason: collision with root package name */
    private c f2778c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f2776a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f2779d = 0;

    private final int d() {
        try {
            return this.f2777b.get() & 255;
        } catch (Exception unused) {
            this.f2778c.f2765b = 1;
            return 0;
        }
    }

    private final int e() {
        return this.f2777b.getShort();
    }

    private final void f() {
        int iD = d();
        this.f2779d = iD;
        if (iD <= 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                i3 = this.f2779d;
                if (i2 >= i3) {
                    return;
                }
                i3 -= i2;
                this.f2777b.get(this.f2776a, i2, i3);
                i2 += i3;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.f2779d, e2);
                }
                this.f2778c.f2765b = 1;
                return;
            }
        }
    }

    private final void g() {
        int iD;
        do {
            iD = d();
            this.f2777b.position(Math.min(this.f2777b.position() + iD, this.f2777b.limit()));
        } while (iD > 0);
    }

    private final boolean h() {
        return this.f2778c.f2765b != 0;
    }

    private final int[] i(int i2) {
        int[] iArr;
        byte[] bArr = new byte[i2 * 3];
        try {
            this.f2777b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                try {
                    int i6 = bArr[i4] & 255;
                    int i7 = i4 + 2;
                    i4 += 3;
                    int i8 = i3 + 1;
                    iArr[i3] = ((bArr[i5] & 255) << 8) | (i6 << 16) | (-16777216) | (bArr[i7] & 255);
                    i3 = i8;
                } catch (BufferUnderflowException e2) {
                    e = e2;
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
                    }
                    this.f2778c.f2765b = 1;
                    return iArr;
                }
            }
            return iArr;
        } catch (BufferUnderflowException e3) {
            e = e3;
            iArr = null;
        }
    }

    public final c a() {
        if (this.f2777b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (!h()) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 6; i2++) {
                sb.append((char) d());
            }
            boolean zStartsWith = sb.toString().startsWith("GIF");
            c cVar = this.f2778c;
            if (zStartsWith) {
                cVar.f2769f = e();
                this.f2778c.f2770g = e();
                int iD = d();
                c cVar2 = this.f2778c;
                cVar2.f2771h = (iD & 128) != 0;
                cVar2.f2772i = (int) Math.pow(2.0d, (iD & 7) + 1);
                this.f2778c.f2773j = d();
                this.f2778c.f2774k = d();
                if (this.f2778c.f2771h && !h()) {
                    c cVar3 = this.f2778c;
                    cVar3.f2764a = i(cVar3.f2772i);
                    c cVar4 = this.f2778c;
                    cVar4.f2775l = cVar4.f2764a[cVar4.f2773j];
                }
            } else {
                cVar.f2765b = 1;
            }
            if (!h()) {
                while (!h()) {
                    int i3 = this.f2778c.f2766c;
                    int iD2 = d();
                    if (iD2 == 33) {
                        int iD3 = d();
                        if (iD3 == 1) {
                            g();
                        } else if (iD3 == 249) {
                            this.f2778c.f2767d = new b();
                            d();
                            int iD4 = d();
                            b bVar = this.f2778c.f2767d;
                            int i4 = (iD4 & 28) >> 2;
                            bVar.f2759g = i4;
                            if (i4 == 0) {
                                bVar.f2759g = 1;
                            }
                            bVar.f2758f = 1 == (iD4 & 1);
                            int iE = e();
                            if (iE < 2) {
                                iE = 10;
                            }
                            b bVar2 = this.f2778c.f2767d;
                            bVar2.f2761i = iE * 10;
                            bVar2.f2760h = d();
                            d();
                        } else if (iD3 == 254) {
                            g();
                        } else if (iD3 != 255) {
                            g();
                        } else {
                            f();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i5 = 0; i5 < 11; i5++) {
                                sb2.append((char) this.f2776a[i5]);
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    f();
                                    byte[] bArr = this.f2776a;
                                    if (bArr[0] == 1) {
                                        this.f2778c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                    }
                                    if (this.f2779d > 0) {
                                    }
                                } while (!h());
                            } else {
                                g();
                            }
                        }
                    } else if (iD2 == 44) {
                        c cVar5 = this.f2778c;
                        if (cVar5.f2767d == null) {
                            cVar5.f2767d = new b();
                        }
                        cVar5.f2767d.f2753a = e();
                        this.f2778c.f2767d.f2754b = e();
                        this.f2778c.f2767d.f2755c = e();
                        this.f2778c.f2767d.f2756d = e();
                        int iD5 = d();
                        int i6 = iD5 & 128;
                        int iPow = (int) Math.pow(2.0d, (iD5 & 7) + 1);
                        b bVar3 = this.f2778c.f2767d;
                        bVar3.f2757e = (iD5 & 64) != 0;
                        if (i6 != 0) {
                            bVar3.f2763k = i(iPow);
                        } else {
                            bVar3.f2763k = null;
                        }
                        this.f2778c.f2767d.f2762j = this.f2777b.position();
                        d();
                        g();
                        if (!h()) {
                            c cVar6 = this.f2778c;
                            cVar6.f2766c++;
                            cVar6.f2768e.add(cVar6.f2767d);
                        }
                    } else {
                        if (iD2 == 59) {
                            break;
                        }
                        this.f2778c.f2765b = 1;
                    }
                }
                c cVar7 = this.f2778c;
                if (cVar7.f2766c < 0) {
                    cVar7.f2765b = 1;
                }
            }
        }
        return this.f2778c;
    }

    public final void b() {
        this.f2777b = null;
        this.f2778c = null;
    }

    public final void c(ByteBuffer byteBuffer) {
        this.f2777b = null;
        Arrays.fill(this.f2776a, (byte) 0);
        this.f2778c = new c();
        this.f2779d = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f2777b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f2777b.order(ByteOrder.LITTLE_ENDIAN);
    }
}
