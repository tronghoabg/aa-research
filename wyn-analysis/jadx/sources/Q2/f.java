package Q2;

import J5.y;
import Q1.k;
import Q1.o;
import android.text.SpannableStringBuilder;
import com.applovin.shadow.okio.Utf8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import y3.C4552j;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: h, reason: collision with root package name */
    public final o f9808h = new o();

    /* renamed from: i, reason: collision with root package name */
    public final y f9809i = new y(1);

    /* renamed from: j, reason: collision with root package name */
    public int f9810j = -1;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final e[] f9811l;

    /* renamed from: m, reason: collision with root package name */
    public e f9812m;

    /* renamed from: n, reason: collision with root package name */
    public List f9813n;

    /* renamed from: o, reason: collision with root package name */
    public List f9814o;

    /* renamed from: p, reason: collision with root package name */
    public y f9815p;

    /* renamed from: q, reason: collision with root package name */
    public int f9816q;

    public f(int i5, List list) {
        this.k = i5 == -1 ? 1 : i5;
        if (list != null) {
            byte[] bArr = Q1.a.f9659a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b5 = ((byte[]) list.get(0))[0];
            }
        }
        this.f9811l = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f9811l[i10] = new e();
        }
        this.f9812m = this.f9811l[0];
    }

    @Override // Q2.h
    public final C4552j f() {
        List list = this.f9813n;
        this.f9814o = list;
        list.getClass();
        return new C4552j(list, 21);
    }

    @Override // Q2.h, T1.b
    public final void flush() {
        super.flush();
        this.f9813n = null;
        this.f9814o = null;
        this.f9816q = 0;
        this.f9812m = this.f9811l[0];
        l();
        this.f9815p = null;
    }

    @Override // Q2.h
    public final void g(g gVar) {
        ByteBuffer byteBuffer = gVar.f11358e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        o oVar = this.f9808h;
        oVar.E(iLimit, bArrArray);
        while (oVar.a() >= 3) {
            int iU = oVar.u();
            int i5 = iU & 3;
            boolean z2 = (iU & 4) == 4;
            byte bU = (byte) oVar.u();
            byte bU2 = (byte) oVar.u();
            if (i5 == 2 || i5 == 3) {
                if (z2) {
                    if (i5 == 3) {
                        j();
                        int i10 = (bU & 192) >> 6;
                        int i11 = this.f9810j;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            l();
                            k.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f9810j + " current=" + i10);
                        }
                        this.f9810j = i10;
                        int i12 = bU & Utf8.REPLACEMENT_BYTE;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        y yVar = new y(i10, i12, 2);
                        this.f9815p = yVar;
                        yVar.f5698e = 1;
                        yVar.f5695b[0] = bU2;
                    } else {
                        k.c(i5 == 2);
                        y yVar2 = this.f9815p;
                        if (yVar2 == null) {
                            k.k("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = yVar2.f5695b;
                            int i13 = yVar2.f5698e;
                            int i14 = i13 + 1;
                            yVar2.f5698e = i14;
                            bArr[i13] = bU;
                            yVar2.f5698e = i13 + 2;
                            bArr[i14] = bU2;
                        }
                    }
                    y yVar3 = this.f9815p;
                    if (yVar3.f5698e == (yVar3.f5697d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // Q2.h
    public final boolean i() {
        return this.f9813n != this.f9814o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        boolean z2;
        char c10;
        int i5;
        boolean z10;
        y yVar = this.f9815p;
        if (yVar == null) {
            return;
        }
        int i10 = 2;
        if (yVar.f5698e != (yVar.f5697d * 2) - 1) {
            k.j("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f9815p.f5697d * 2) - 1) + ", but current index is " + this.f9815p.f5698e + " (sequence number " + this.f9815p.f5696c + ");");
        }
        y yVar2 = this.f9815p;
        byte[] bArr = yVar2.f5695b;
        int i11 = yVar2.f5698e;
        y yVar3 = this.f9809i;
        yVar3.o(i11, bArr);
        boolean z11 = false;
        while (true) {
            if (yVar3.b() > 0) {
                int i12 = 3;
                int i13 = yVar3.i(3);
                int i14 = yVar3.i(5);
                if (i13 == 7) {
                    yVar3.t(i10);
                    i13 = yVar3.i(6);
                    if (i13 < 7) {
                        N0.a.o(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        k.w("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.k) {
                    yVar3.u(i14);
                } else {
                    int iG = (i14 * 8) + yVar3.g();
                    while (yVar3.g() < iG) {
                        int i15 = yVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 == i12) {
                                        this.f9813n = k();
                                    } else if (i15 != 8) {
                                        switch (i15) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.f9812m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i15 < 17 || i15 > 23) {
                                                    if (i15 < 24 || i15 > 31) {
                                                        N0.a.o(i15, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        k.w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                        yVar3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    k.w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                    yVar3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f9812m.f9789b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i5 = i10;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f9812m.a((char) 9835);
                                } else {
                                    this.f9812m.a((char) (i15 & 255));
                                }
                                i5 = i10;
                                z11 = true;
                            } else {
                                if (i15 <= 159) {
                                    e[] eVarArr = this.f9811l;
                                    switch (i15) {
                                        case 128:
                                        case EMPTY_TPAT_ERROR_VALUE:
                                        case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case STORE_REGION_CODE_ERROR_VALUE:
                                        case INVALID_CONFIG_RESPONSE_VALUE:
                                            z10 = false;
                                            z2 = true;
                                            int i16 = i15 - 128;
                                            if (this.f9816q != i16) {
                                                this.f9816q = i16;
                                                this.f9812m = eVarArr[i16];
                                                break;
                                            }
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            z2 = true;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (yVar3.h()) {
                                                    e eVar = eVarArr[8 - i17];
                                                    eVar.f9788a.clear();
                                                    eVar.f9789b.clear();
                                                    eVar.f9801o = -1;
                                                    eVar.f9802p = -1;
                                                    eVar.f9803q = -1;
                                                    eVar.f9805s = -1;
                                                    eVar.f9807u = 0;
                                                }
                                            }
                                            z10 = false;
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (yVar3.h()) {
                                                    eVarArr[8 - i18].f9791d = true;
                                                }
                                            }
                                            z2 = true;
                                            z10 = false;
                                            break;
                                        case CONFIG_REFRESH_FAILED_VALUE:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (yVar3.h()) {
                                                    eVarArr[8 - i19].f9791d = false;
                                                }
                                            }
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 139:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (yVar3.h()) {
                                                    eVarArr[8 - i20].f9791d = !r3.f9791d;
                                                }
                                            }
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 140:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (yVar3.h()) {
                                                    eVarArr[8 - i21].d();
                                                }
                                            }
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 141:
                                            yVar3.t(8);
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 142:
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 143:
                                            l();
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 144:
                                            if (!this.f9812m.f9790c) {
                                                yVar3.t(16);
                                                z10 = false;
                                                i12 = 3;
                                                z2 = true;
                                                break;
                                            } else {
                                                yVar3.i(4);
                                                yVar3.i(2);
                                                yVar3.i(2);
                                                boolean zH = yVar3.h();
                                                boolean zH2 = yVar3.h();
                                                i12 = 3;
                                                yVar3.i(3);
                                                yVar3.i(3);
                                                this.f9812m.e(zH, zH2);
                                                z10 = false;
                                                z2 = true;
                                            }
                                        case 145:
                                            if (this.f9812m.f9790c) {
                                                int iC = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                                int iC2 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                                yVar3.t(2);
                                                e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), 0);
                                                this.f9812m.f(iC, iC2);
                                            } else {
                                                yVar3.t(24);
                                            }
                                            z10 = false;
                                            i12 = 3;
                                            z2 = true;
                                            break;
                                        case 146:
                                            if (this.f9812m.f9790c) {
                                                yVar3.t(4);
                                                int i22 = yVar3.i(4);
                                                yVar3.t(2);
                                                yVar3.i(6);
                                                e eVar2 = this.f9812m;
                                                if (eVar2.f9807u != i22) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f9807u = i22;
                                            } else {
                                                yVar3.t(16);
                                            }
                                            z10 = false;
                                            i12 = 3;
                                            z2 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            N0.a.o(i15, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 151:
                                            if (this.f9812m.f9790c) {
                                                int iC3 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                                yVar3.i(2);
                                                e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), 0);
                                                yVar3.h();
                                                yVar3.h();
                                                yVar3.i(2);
                                                yVar3.i(2);
                                                int i23 = yVar3.i(2);
                                                yVar3.t(8);
                                                e eVar3 = this.f9812m;
                                                eVar3.f9800n = iC3;
                                                eVar3.k = i23;
                                            } else {
                                                yVar3.t(32);
                                            }
                                            z10 = false;
                                            i12 = 3;
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
                                            yVar3.t(i10);
                                            int i25 = yVar3.i(i12);
                                            boolean zH4 = yVar3.h();
                                            int i26 = yVar3.i(7);
                                            int i27 = yVar3.i(8);
                                            int i28 = yVar3.i(4);
                                            int i29 = yVar3.i(4);
                                            yVar3.t(i10);
                                            yVar3.t(6);
                                            yVar3.t(i10);
                                            int i30 = yVar3.i(3);
                                            int i31 = yVar3.i(3);
                                            eVar4.f9790c = true;
                                            eVar4.f9791d = zH3;
                                            eVar4.f9792e = i25;
                                            eVar4.f9793f = zH4;
                                            eVar4.f9794g = i26;
                                            eVar4.f9795h = i27;
                                            eVar4.f9796i = i28;
                                            int i32 = i29 + 1;
                                            if (eVar4.f9797j != i32) {
                                                eVar4.f9797j = i32;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f9788a;
                                                    if (arrayList.size() >= eVar4.f9797j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && eVar4.f9798l != i30) {
                                                eVar4.f9798l = i30;
                                                int i33 = i30 - 1;
                                                int i34 = e.f9779B[i33];
                                                boolean z12 = e.f9778A[i33];
                                                int i35 = e.f9786y[i33];
                                                int i36 = e.f9787z[i33];
                                                int i37 = e.f9785x[i33];
                                                eVar4.f9800n = i34;
                                                eVar4.k = i37;
                                            }
                                            if (i31 != 0 && eVar4.f9799m != i31) {
                                                eVar4.f9799m = i31;
                                                int i38 = i31 - 1;
                                                int i39 = e.f9781D[i38];
                                                int i40 = e.f9780C[i38];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f9783v, e.f9782E[i38]);
                                            }
                                            if (this.f9816q != i24) {
                                                this.f9816q = i24;
                                                this.f9812m = eVarArr[i24];
                                            }
                                            z10 = false;
                                            i12 = 3;
                                            z2 = true;
                                            break;
                                    }
                                } else {
                                    z10 = false;
                                    z2 = true;
                                    if (i15 <= 255) {
                                        this.f9812m.a((char) (i15 & 255));
                                    } else {
                                        N0.a.o(i15, "Invalid base command: ", "Cea708Decoder");
                                        i5 = 2;
                                        c10 = 7;
                                    }
                                }
                                z11 = z2;
                                i5 = 2;
                                c10 = 7;
                            }
                            z2 = true;
                            c10 = 7;
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
                                        this.f9812m.a(' ');
                                    } else if (i41 == 33) {
                                        this.f9812m.a((char) 160);
                                    } else if (i41 == 37) {
                                        this.f9812m.a((char) 8230);
                                    } else if (i41 == 42) {
                                        this.f9812m.a((char) 352);
                                    } else if (i41 == 44) {
                                        this.f9812m.a((char) 338);
                                    } else if (i41 == 63) {
                                        this.f9812m.a((char) 376);
                                    } else if (i41 == 57) {
                                        this.f9812m.a((char) 8482);
                                    } else if (i41 == 58) {
                                        this.f9812m.a((char) 353);
                                    } else if (i41 == 60) {
                                        this.f9812m.a((char) 339);
                                    } else if (i41 != 61) {
                                        switch (i41) {
                                            case 48:
                                                this.f9812m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f9812m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f9812m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f9812m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f9812m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f9812m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i41) {
                                                    case 118:
                                                        this.f9812m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f9812m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f9812m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f9812m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f9812m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f9812m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f9812m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f9812m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f9812m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f9812m.a((char) 9484);
                                                        break;
                                                    default:
                                                        N0.a.o(i41, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f9812m.a((char) 8480);
                                    }
                                    z11 = true;
                                } else if (i41 > 159) {
                                    i5 = 2;
                                    if (i41 <= 255) {
                                        if (i41 == 160) {
                                            this.f9812m.a((char) 13252);
                                        } else {
                                            N0.a.o(i41, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f9812m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        N0.a.o(i41, "Invalid extended command: ", "Cea708Decoder");
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
                        i10 = i5;
                    }
                }
            }
        }
        if (z11) {
            this.f9813n = k();
        }
        this.f9815p = null;
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
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.f.k():java.util.List");
    }

    public final void l() {
        for (int i5 = 0; i5 < 8; i5++) {
            this.f9811l[i5].d();
        }
    }
}
