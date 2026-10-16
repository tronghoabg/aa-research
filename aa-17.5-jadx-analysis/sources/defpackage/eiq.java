package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;

/* loaded from: classes2.dex */
final class eiq extends eis {
    public int b;
    private final byte[] j;
    private int k;
    public int d = Alert.DURATION_SHOW_INDEFINITELY;
    public int a = 0;
    public int c = 0;

    public eiq(byte[] bArr) {
        this.j = bArr;
    }

    public final byte a() throws IOException {
        int i = this.c;
        if (i == this.a) {
            throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.j;
        this.c = i + 1;
        return bArr[i];
    }

    @Override // defpackage.eis
    public final double b() throws IOException {
        throw null;
    }

    @Override // defpackage.eis
    public final float c() throws IOException {
        throw null;
    }

    @Override // defpackage.eis
    public final int d() {
        throw null;
    }

    @Override // defpackage.eis
    public final int e(int i) throws ejp {
        throw null;
    }

    public final int f() throws IOException {
        int i;
        int i2 = this.c;
        int i3 = this.a;
        if (i3 != i2) {
            byte[] bArr = this.j;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.c = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.c = i5;
                return i;
            }
        }
        long j = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            j |= (r3 & 127) << i13;
            if ((a() & 128) == 0) {
                return (int) j;
            }
        }
        throw new ejp("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.eis
    public final int g() throws IOException {
        if (this.c == this.a) {
            this.k = 0;
            return 0;
        }
        int iF = f();
        this.k = iF;
        if ((iF >>> 3) != 0) {
            return iF;
        }
        throw new ejp("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.eis
    public final void h(int i) throws ejp {
        if (this.k != i) {
            throw new ejp("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.eis
    public final void i(int i) {
        throw null;
    }

    public final void j(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.a;
            int i3 = this.c;
            if (i <= i2 - i3) {
                this.c = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new ejp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.eis
    public final boolean k() throws IOException {
        throw null;
    }

    @Override // defpackage.eis
    public final boolean l() throws IOException {
        throw null;
    }

    @Override // defpackage.eis
    public final boolean m(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.a - this.c < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new ejp("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.j;
                int i4 = this.c;
                this.c = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new ejp("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            j(8);
            return true;
        }
        if (i2 == 2) {
            j(f());
            return true;
        }
        if (i2 == 3) {
            x();
            h(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            w();
            return false;
        }
        if (i2 != 5) {
            throw new ejo();
        }
        j(4);
        return true;
    }
}
