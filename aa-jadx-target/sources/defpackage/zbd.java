package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zbd implements java.io.Serializable, defpackage.abpb, defpackage.zba, defpackage.zbb, defpackage.zbc {
    public static final defpackage.zbd sm = new defpackage.zbd(-1, "UNRECOGNIZED");
    public final java.lang.String sn;
    private final int so;

    public zbd(int i, java.lang.String str) {
        this.so = i;
        this.sn = str;
    }

    public static defpackage.zbd b(int i) {
        defpackage.zbd zbdVar;
        defpackage.zbd zbdVarDb = defpackage.ysr.db(i);
        if (zbdVarDb != null) {
            return zbdVarDb;
        }
        defpackage.zbd zbdVarDa = defpackage.ysr.da(i);
        if (zbdVarDa != null) {
            return zbdVarDa;
        }
        if (i == 15950) {
            zbdVar = defpackage.zbc.Mu;
        } else if (i == 15951) {
            zbdVar = defpackage.zbc.Mv;
        } else if (i == 16311) {
            zbdVar = defpackage.zbc.Nd;
        } else if (i != 16312) {
            switch (i) {
                case 15500:
                    zbdVar = defpackage.zbc.LX;
                    break;
                case 15501:
                    zbdVar = defpackage.zbc.LY;
                    break;
                case 15502:
                    zbdVar = defpackage.zbc.LZ;
                    break;
                case 15503:
                    zbdVar = defpackage.zbc.Ma;
                    break;
                case 15504:
                    zbdVar = defpackage.zbc.Mb;
                    break;
                case 15505:
                    zbdVar = defpackage.zbc.Mc;
                    break;
                default:
                    switch (i) {
                        case 15600:
                            zbdVar = defpackage.zbc.Md;
                            break;
                        case 15700:
                            zbdVar = defpackage.zbc.Me;
                            break;
                        case 15710:
                            zbdVar = defpackage.zbc.Mf;
                            break;
                        case 15711:
                            zbdVar = defpackage.zbc.Mg;
                            break;
                        case 15712:
                            zbdVar = defpackage.zbc.Mh;
                            break;
                        case 15713:
                            zbdVar = defpackage.zbc.Mi;
                            break;
                        case 15714:
                            zbdVar = defpackage.zbc.Mj;
                            break;
                        case 15715:
                            zbdVar = defpackage.zbc.Mk;
                            break;
                        case 15716:
                            zbdVar = defpackage.zbc.Ml;
                            break;
                        case 15717:
                            zbdVar = defpackage.zbc.Mm;
                            break;
                        case 15718:
                            zbdVar = defpackage.zbc.Mn;
                            break;
                        case 15719:
                            zbdVar = defpackage.zbc.Mo;
                            break;
                        case 15800:
                            zbdVar = defpackage.zbc.Mp;
                            break;
                        case 16315:
                            zbdVar = defpackage.zbc.Nf;
                            break;
                        case 16316:
                            zbdVar = defpackage.zbc.Ng;
                            break;
                        case 16317:
                            zbdVar = defpackage.zbc.Nh;
                            break;
                        case 16318:
                            zbdVar = defpackage.zbc.Ni;
                            break;
                        case 16319:
                            zbdVar = defpackage.zbc.Nj;
                            break;
                        case 16320:
                            zbdVar = defpackage.zbc.Nk;
                            break;
                        case 16321:
                            zbdVar = defpackage.zbc.Nl;
                            break;
                        case 16322:
                            zbdVar = defpackage.zbc.Nm;
                            break;
                        case 16323:
                            zbdVar = defpackage.zbc.Nn;
                            break;
                        case 16324:
                            zbdVar = defpackage.zbc.No;
                            break;
                        case 16325:
                            zbdVar = defpackage.zbc.Np;
                            break;
                        case 16326:
                            zbdVar = defpackage.zbc.Nq;
                            break;
                        case 16327:
                            zbdVar = defpackage.zbc.Nr;
                            break;
                        case 16328:
                            zbdVar = defpackage.zbc.Ns;
                            break;
                        case 16329:
                            zbdVar = defpackage.zbc.Nt;
                            break;
                        case 16330:
                            zbdVar = defpackage.zbc.Nu;
                            break;
                        case 16331:
                            zbdVar = defpackage.zbc.Nv;
                            break;
                        case 16332:
                            zbdVar = defpackage.zbc.Nw;
                            break;
                        case 16333:
                            zbdVar = defpackage.zbc.Nx;
                            break;
                        case 16334:
                            zbdVar = defpackage.zbc.Ny;
                            break;
                        case 16335:
                            zbdVar = defpackage.zbc.Nz;
                            break;
                        case 16336:
                            zbdVar = defpackage.zbc.NA;
                            break;
                        case 16337:
                            zbdVar = defpackage.zbc.NB;
                            break;
                        case 16338:
                            zbdVar = defpackage.zbc.NC;
                            break;
                        case 16339:
                            zbdVar = defpackage.zbc.ND;
                            break;
                        case 16400:
                            zbdVar = defpackage.zbc.NE;
                            break;
                        case 16401:
                            zbdVar = defpackage.zbc.NF;
                            break;
                        case 16402:
                            zbdVar = defpackage.zbc.NG;
                            break;
                        default:
                            switch (i) {
                                case 15900:
                                    zbdVar = defpackage.zbc.Mq;
                                    break;
                                case 15901:
                                    zbdVar = defpackage.zbc.Mr;
                                    break;
                                case 15902:
                                    zbdVar = defpackage.zbc.Ms;
                                    break;
                                case 15903:
                                    zbdVar = defpackage.zbc.Mt;
                                    break;
                                default:
                                    switch (i) {
                                        case 16100:
                                            zbdVar = defpackage.zbc.Mw;
                                            break;
                                        case 16101:
                                            zbdVar = defpackage.zbc.Mx;
                                            break;
                                        case 16102:
                                            zbdVar = defpackage.zbc.My;
                                            break;
                                        default:
                                            switch (i) {
                                                case 16150:
                                                    zbdVar = defpackage.zbc.Mz;
                                                    break;
                                                case 16151:
                                                    zbdVar = defpackage.zbc.MA;
                                                    break;
                                                case 16152:
                                                    zbdVar = defpackage.zbc.MB;
                                                    break;
                                                case 16153:
                                                    zbdVar = defpackage.zbc.MC;
                                                    break;
                                                case 16154:
                                                    zbdVar = defpackage.zbc.MD;
                                                    break;
                                                case 16155:
                                                    zbdVar = defpackage.zbc.ME;
                                                    break;
                                                case 16156:
                                                    zbdVar = defpackage.zbc.MF;
                                                    break;
                                                case 16157:
                                                    zbdVar = defpackage.zbc.MG;
                                                    break;
                                                case 16158:
                                                    zbdVar = defpackage.zbc.MH;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 16200:
                                                            zbdVar = defpackage.zbc.MI;
                                                            break;
                                                        case 16201:
                                                            zbdVar = defpackage.zbc.MJ;
                                                            break;
                                                        case 16202:
                                                            zbdVar = defpackage.zbc.MK;
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 16211:
                                                                    zbdVar = defpackage.zbc.ML;
                                                                    break;
                                                                case 16212:
                                                                    zbdVar = defpackage.zbc.MM;
                                                                    break;
                                                                case 16213:
                                                                    zbdVar = defpackage.zbc.MN;
                                                                    break;
                                                                case 16214:
                                                                    zbdVar = defpackage.zbc.MO;
                                                                    break;
                                                                case 16215:
                                                                    zbdVar = defpackage.zbc.MP;
                                                                    break;
                                                                case 16216:
                                                                    zbdVar = defpackage.zbc.MQ;
                                                                    break;
                                                                case 16217:
                                                                    zbdVar = defpackage.zbc.MR;
                                                                    break;
                                                                case 16218:
                                                                    zbdVar = defpackage.zbc.MS;
                                                                    break;
                                                                case 16219:
                                                                    zbdVar = defpackage.zbc.MT;
                                                                    break;
                                                                case 16220:
                                                                    zbdVar = defpackage.zbc.MU;
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 16300:
                                                                            zbdVar = defpackage.zbc.MV;
                                                                            break;
                                                                        case 16301:
                                                                            zbdVar = defpackage.zbc.MW;
                                                                            break;
                                                                        case 16302:
                                                                            zbdVar = defpackage.zbc.MX;
                                                                            break;
                                                                        case 16303:
                                                                            zbdVar = defpackage.zbc.MY;
                                                                            break;
                                                                        case 16304:
                                                                            zbdVar = defpackage.zbc.MZ;
                                                                            break;
                                                                        case 16305:
                                                                            zbdVar = defpackage.zbc.Na;
                                                                            break;
                                                                        case 16306:
                                                                            zbdVar = defpackage.zbc.Nb;
                                                                            break;
                                                                        case 16307:
                                                                            zbdVar = defpackage.zbc.Nc;
                                                                            break;
                                                                        default:
                                                                            zbdVar = null;
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            zbdVar = defpackage.zbc.Ne;
        }
        if (zbdVar != null) {
            return zbdVar;
        }
        return null;
    }

    @Override // defpackage.abpb
    public final int a() {
        if (this != sm) {
            return this.so;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.so);
    }
}
