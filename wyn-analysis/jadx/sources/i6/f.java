package i6;

import A7.AbstractC0279p0;
import J5.y;
import android.text.SpannableStringBuilder;
import com.applovin.shadow.okio.Utf8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class f extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Y4.b f36858g = new Y4.b();

    /* renamed from: h, reason: collision with root package name */
    public final y f36859h = new y(6);

    /* renamed from: i, reason: collision with root package name */
    public int f36860i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f36861j;
    public final e[] k;

    /* renamed from: l, reason: collision with root package name */
    public e f36862l;

    /* renamed from: m, reason: collision with root package name */
    public List f36863m;

    /* renamed from: n, reason: collision with root package name */
    public List f36864n;

    /* renamed from: o, reason: collision with root package name */
    public y f36865o;

    /* renamed from: p, reason: collision with root package name */
    public int f36866p;

    public f(int i5, List list) {
        this.f36861j = i5 == -1 ? 1 : i5;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b5 = ((byte[]) list.get(0))[0];
        }
        this.k = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.k[i10] = new e();
        }
        this.f36862l = this.k[0];
    }

    @Override // i6.h
    public final i e() {
        List list = this.f36863m;
        this.f36864n = list;
        list.getClass();
        return new i(0, list);
    }

    @Override // i6.h
    public final void f(g gVar) {
        ByteBuffer byteBuffer = gVar.f4917d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        Y4.b bVar = this.f36858g;
        bVar.y(iLimit, bArrArray);
        while (bVar.a() >= 3) {
            int iQ = bVar.q();
            int i5 = iQ & 3;
            boolean z2 = (iQ & 4) == 4;
            byte bQ = (byte) bVar.q();
            byte bQ2 = (byte) bVar.q();
            if (i5 == 2 || i5 == 3) {
                if (z2) {
                    if (i5 == 3) {
                        i();
                        int i10 = (bQ & 192) >> 6;
                        int i11 = this.f36860i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            k();
                            AbstractC4256a.E("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f36860i + " current=" + i10);
                        }
                        this.f36860i = i10;
                        int i12 = bQ & Utf8.REPLACEMENT_BYTE;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        y yVar = new y(i10, i12, 4);
                        this.f36865o = yVar;
                        yVar.f5698e = 1;
                        yVar.f5695b[0] = bQ2;
                    } else {
                        AbstractC4256a.e(i5 == 2);
                        y yVar2 = this.f36865o;
                        if (yVar2 == null) {
                            AbstractC4256a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = yVar2.f5695b;
                            int i13 = yVar2.f5698e;
                            int i14 = i13 + 1;
                            yVar2.f5698e = i14;
                            bArr[i13] = bQ;
                            yVar2.f5698e = i13 + 2;
                            bArr[i14] = bQ2;
                        }
                    }
                    y yVar3 = this.f36865o;
                    if (yVar3.f5698e == (yVar3.f5697d * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // i6.h, H5.d
    public final void flush() {
        super.flush();
        this.f36863m = null;
        this.f36864n = null;
        this.f36866p = 0;
        this.f36862l = this.k[0];
        k();
        this.f36865o = null;
    }

    @Override // i6.h
    public final boolean h() {
        return this.f36863m != this.f36864n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i() {
        boolean z2;
        char c10;
        int i5;
        y yVar = this.f36865o;
        if (yVar == null) {
            return;
        }
        int i10 = 2;
        if (yVar.f5698e != (yVar.f5697d * 2) - 1) {
            AbstractC4256a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f36865o.f5697d * 2) - 1) + ", but current index is " + this.f36865o.f5698e + " (sequence number " + this.f36865o.f5696c + ");");
        }
        y yVar2 = this.f36865o;
        byte[] bArr = yVar2.f5695b;
        int i11 = yVar2.f5698e;
        y yVar3 = this.f36859h;
        yVar3.o(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (yVar3.b() > 0) {
                int i12 = 3;
                int i13 = yVar3.i(3);
                int i14 = yVar3.i(5);
                if (i13 == 7) {
                    yVar3.t(i10);
                    i13 = yVar3.i(6);
                    if (i13 < 7) {
                        AbstractC0279p0.u(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        AbstractC4256a.E("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f36861j) {
                    yVar3.u(i14);
                } else {
                    int iG = (i14 * 8) + yVar3.g();
                    while (yVar3.g() < iG) {
                        int i15 = yVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 == i12) {
                                        this.f36863m = j();
                                    } else if (i15 != 8) {
                                        switch (i15) {
                                            case 12:
                                                k();
                                                break;
                                            case 13:
                                                this.f36862l.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i15 < 17 || i15 > 23) {
                                                    if (i15 < 24 || i15 > 31) {
                                                        AbstractC0279p0.u(i15, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        AbstractC4256a.E("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                        yVar3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC4256a.E("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                    yVar3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f36862l.f36838b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i5 = i10;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f36862l.a((char) 9835);
                                } else {
                                    this.f36862l.a((char) (i15 & 255));
                                }
                                i5 = i10;
                                z10 = true;
                            } else {
                                if (i15 <= 159) {
                                    e[] eVarArr = this.k;
                                    switch (i15) {
                                        case 128:
                                        case EMPTY_TPAT_ERROR_VALUE:
                                        case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case STORE_REGION_CODE_ERROR_VALUE:
                                        case INVALID_CONFIG_RESPONSE_VALUE:
                                            z2 = true;
                                            int i16 = i15 - 128;
                                            if (this.f36866p != i16) {
                                                this.f36866p = i16;
                                                this.f36862l = eVarArr[i16];
                                                break;
                                            }
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            z2 = true;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (yVar3.h()) {
                                                    e eVar = eVarArr[8 - i17];
                                                    eVar.f36837a.clear();
                                                    eVar.f36838b.clear();
                                                    eVar.f36851p = -1;
                                                    eVar.f36852q = -1;
                                                    eVar.f36853r = -1;
                                                    eVar.f36855t = -1;
                                                    eVar.f36857v = 0;
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (yVar3.h()) {
                                                    eVarArr[8 - i18].f36840d = true;
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case CONFIG_REFRESH_FAILED_VALUE:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (yVar3.h()) {
                                                    eVarArr[8 - i19].f36840d = false;
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 139:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (yVar3.h()) {
                                                    eVarArr[8 - i20].f36840d = !r2.f36840d;
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 140:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (yVar3.h()) {
                                                    eVarArr[8 - i21].d();
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 141:
                                            yVar3.t(8);
                                            z2 = true;
                                            break;
                                        case 142:
                                            z2 = true;
                                            break;
                                        case 143:
                                            k();
                                            z2 = true;
                                            break;
                                        case 144:
                                            if (!this.f36862l.f36839c) {
                                                yVar3.t(16);
                                                z2 = true;
                                                break;
                                            } else {
                                                yVar3.i(4);
                                                yVar3.i(2);
                                                yVar3.i(2);
                                                boolean zH = yVar3.h();
                                                boolean zH2 = yVar3.h();
                                                yVar3.i(3);
                                                yVar3.i(3);
                                                this.f36862l.e(zH, zH2);
                                                z2 = true;
                                            }
                                        case 145:
                                            if (this.f36862l.f36839c) {
                                                int iC = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                                int iC2 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                                yVar3.t(2);
                                                e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), 0);
                                                this.f36862l.f(iC, iC2);
                                            } else {
                                                yVar3.t(24);
                                            }
                                            z2 = true;
                                            break;
                                        case 146:
                                            if (this.f36862l.f36839c) {
                                                yVar3.t(4);
                                                int i22 = yVar3.i(4);
                                                yVar3.t(2);
                                                yVar3.i(6);
                                                e eVar2 = this.f36862l;
                                                if (eVar2.f36857v != i22) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f36857v = i22;
                                            } else {
                                                yVar3.t(16);
                                            }
                                            z2 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0279p0.u(i15, "Invalid C1 command: ", "Cea708Decoder");
                                            z2 = true;
                                            break;
                                        case 151:
                                            if (this.f36862l.f36839c) {
                                                int iC3 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                                yVar3.i(2);
                                                e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), 0);
                                                yVar3.h();
                                                yVar3.h();
                                                yVar3.i(2);
                                                yVar3.i(2);
                                                int i23 = yVar3.i(2);
                                                yVar3.t(8);
                                                e eVar3 = this.f36862l;
                                                eVar3.f36850o = iC3;
                                                eVar3.f36847l = i23;
                                            } else {
                                                yVar3.t(32);
                                            }
                                            z2 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i24 = i15 - 152;
                                            e eVar4 = eVarArr[i24];
                                            yVar3.t(i10);
                                            boolean zH3 = yVar3.h();
                                            boolean zH4 = yVar3.h();
                                            yVar3.h();
                                            int i25 = yVar3.i(i12);
                                            boolean zH5 = yVar3.h();
                                            int i26 = yVar3.i(7);
                                            int i27 = yVar3.i(8);
                                            int i28 = yVar3.i(4);
                                            int i29 = yVar3.i(4);
                                            yVar3.t(i10);
                                            yVar3.i(6);
                                            yVar3.t(i10);
                                            int i30 = yVar3.i(3);
                                            int i31 = yVar3.i(3);
                                            eVar4.f36839c = true;
                                            eVar4.f36840d = zH3;
                                            eVar4.k = zH4;
                                            eVar4.f36841e = i25;
                                            eVar4.f36842f = zH5;
                                            eVar4.f36843g = i26;
                                            eVar4.f36844h = i27;
                                            eVar4.f36845i = i28;
                                            int i32 = i29 + 1;
                                            if (eVar4.f36846j != i32) {
                                                eVar4.f36846j = i32;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f36837a;
                                                    if ((zH4 && arrayList.size() >= eVar4.f36846j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && eVar4.f36848m != i30) {
                                                eVar4.f36848m = i30;
                                                int i33 = i30 - 1;
                                                int i34 = e.f36829C[i33];
                                                boolean z11 = e.f36828B[i33];
                                                int i35 = e.f36836z[i33];
                                                int i36 = e.f36827A[i33];
                                                int i37 = e.f36835y[i33];
                                                eVar4.f36850o = i34;
                                                eVar4.f36847l = i37;
                                            }
                                            if (i31 != 0 && eVar4.f36849n != i31) {
                                                eVar4.f36849n = i31;
                                                int i38 = i31 - 1;
                                                int i39 = e.f36831E[i38];
                                                int i40 = e.f36830D[i38];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f36833w, e.f36832F[i38]);
                                            }
                                            if (this.f36866p != i24) {
                                                this.f36866p = i24;
                                                this.f36862l = eVarArr[i24];
                                            }
                                            z2 = true;
                                            break;
                                    }
                                } else {
                                    z2 = true;
                                    if (i15 <= 255) {
                                        this.f36862l.a((char) (i15 & 255));
                                    } else {
                                        AbstractC0279p0.u(i15, "Invalid base command: ", "Cea708Decoder");
                                        i5 = 2;
                                        c10 = 7;
                                    }
                                }
                                z10 = z2;
                                i5 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                            z2 = true;
                        } else {
                            z2 = true;
                            int i41 = yVar3.i(8);
                            if (i41 <= 31) {
                                c10 = 7;
                                if (i41 > 7) {
                                    if (i41 <= 15) {
                                        yVar3.t(8);
                                    } else if (i41 <= 23) {
                                        yVar3.t(16);
                                    } else if (i41 <= 31) {
                                        yVar3.t(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (i41 <= 127) {
                                    if (i41 == 32) {
                                        this.f36862l.a(' ');
                                    } else if (i41 == 33) {
                                        this.f36862l.a((char) 160);
                                    } else if (i41 == 37) {
                                        this.f36862l.a((char) 8230);
                                    } else if (i41 == 42) {
                                        this.f36862l.a((char) 352);
                                    } else if (i41 == 44) {
                                        this.f36862l.a((char) 338);
                                    } else if (i41 == 63) {
                                        this.f36862l.a((char) 376);
                                    } else if (i41 == 57) {
                                        this.f36862l.a((char) 8482);
                                    } else if (i41 == 58) {
                                        this.f36862l.a((char) 353);
                                    } else if (i41 == 60) {
                                        this.f36862l.a((char) 339);
                                    } else if (i41 != 61) {
                                        switch (i41) {
                                            case 48:
                                                this.f36862l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f36862l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f36862l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f36862l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f36862l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f36862l.a((char) 8226);
                                                break;
                                            default:
                                                switch (i41) {
                                                    case 118:
                                                        this.f36862l.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f36862l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f36862l.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f36862l.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f36862l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f36862l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f36862l.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f36862l.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f36862l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f36862l.a((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC0279p0.u(i41, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f36862l.a((char) 8480);
                                    }
                                    z10 = true;
                                } else if (i41 > 159) {
                                    i5 = 2;
                                    if (i41 <= 255) {
                                        if (i41 == 160) {
                                            this.f36862l.a((char) 13252);
                                        } else {
                                            AbstractC0279p0.u(i41, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f36862l.a('_');
                                        }
                                        z10 = true;
                                    } else {
                                        AbstractC0279p0.u(i41, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i41 <= 135) {
                                    yVar3.t(32);
                                } else if (i41 <= 143) {
                                    yVar3.t(40);
                                } else if (i41 <= 159) {
                                    i5 = 2;
                                    yVar3.t(2);
                                    yVar3.t(yVar3.i(6) * 8);
                                }
                            }
                            i5 = 2;
                        }
                        i12 = 3;
                        i10 = i5;
                    }
                }
            }
        }
        if (z10) {
            this.f36863m = j();
        }
        this.f36865o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.f.j():java.util.List");
    }

    public final void k() {
        for (int i5 = 0; i5 < 8; i5++) {
            this.k[i5].d();
        }
    }
}
