package com.google.android.gms.internal.ads;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzavu implements zzawl {
    public static final /* synthetic */ zzavu zza;
    public static final /* synthetic */ zzavu zzb;
    public static final /* synthetic */ zzavu zzc;
    public static final /* synthetic */ zzavu zzd;
    public static final /* synthetic */ zzavu zze;
    public static final /* synthetic */ zzavu zzf;
    public static final /* synthetic */ zzavu zzg;
    public static final /* synthetic */ zzavu zzh;
    public static final /* synthetic */ zzavu zzi;
    public static final /* synthetic */ zzavu zzj;
    public static final /* synthetic */ zzavu zzk;
    public static final /* synthetic */ zzavu zzl;
    public static final /* synthetic */ zzavu zzm;
    public static final /* synthetic */ zzavu zzn;
    public static final /* synthetic */ zzavu zzo;
    public static final /* synthetic */ zzavu zzp;
    private final /* synthetic */ int zzq;

    static {
        int i5 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i10 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i11 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i12 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i13 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i14 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i15 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i16 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i17 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i18 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i19 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i20 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        zzp = new zzavu((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        zzo = new zzavu((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        zzn = new zzavu(i20);
        zzm = new zzavu(i11);
        zzl = new zzavu(i12);
        zzk = new zzavu(i13);
        zzj = new zzavu(i10);
        zzi = new zzavu(i14);
        zzh = new zzavu(i15);
        zzg = new zzavu(i16);
        zzf = new zzavu(i5);
        zze = new zzavu(i17);
        zzd = new zzavu(i18);
        zzc = new zzavu(i19);
        zzb = new zzavu(1);
        zza = new zzavu(0);
    }

    private /* synthetic */ zzavu(int i5) {
        this.zzq = i5;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) throws zzawr {
        zzavd zzavdVar;
        zzawt zzawtVarZzc;
        int i5 = ((((~603123090) & 1079339320) | 204100681) + ((603123090 & 1131784560) | 52466888)) - 1316176740;
        int i10 = 1216803069 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzawo) obj).zza();
                                case 1:
                                    try {
                                        zzawk zzawkVar = ((zzawo) obj).zzb;
                                        long jZzm = zzawkVar.zzc().zzm();
                                        zzawt zzawtVarZzc2 = zzawkVar.zzc();
                                        List listZzo = zzawtVarZzc2.zzo();
                                        if (jZzm < 0) {
                                            jZzm += listZzo.size();
                                        }
                                        if (jZzm < 0 || jZzm >= listZzo.size()) {
                                            throw new zzawr();
                                        }
                                        listZzo.remove((int) jZzm);
                                        zzawkVar.zzb(zzawtVarZzc2);
                                        return Optional.empty();
                                    } catch (zzawr unused) {
                                        zzavdVar = zzavd.zzI;
                                        break;
                                    }
                                    break;
                                case 2:
                                    zzawo zzawoVar = (zzawo) obj;
                                    zzawk zzawkVar2 = zzawoVar.zzb;
                                    zzawt zzawtVarZzc3 = zzawkVar2.zzc();
                                    zzavx zzavxVarZzn = zzawkVar2.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzawtVarZzc3.zzk(byteArrayOutputStream);
                                    zzawoVar.zzb.zzb(zzawt.zzd(zzavxVarZzn.zzd(zzavx.zze(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzawo zzawoVar2 = (zzawo) obj;
                                    zzawk zzawkVar3 = zzawoVar2.zzb;
                                    zzawt zzawtVarZzc4 = zzawkVar3.zzc();
                                    zzavx zzavxVarZzn2 = zzawkVar3.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzavt.zzb(zzawtVarZzc4.zzm(), new zzaws(byteArrayOutputStream2, i5 ^ i10), false);
                                    zzawoVar2.zzb.zzb(zzawt.zzd(zzavxVarZzn2.zzd(zzavx.zze(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzawo zzawoVar3 = (zzawo) obj;
                                    zzawoVar3.zzb.zze(-(zzawoVar3.zzc.zzb().zzb + zzawoVar3.zzd.zze()), zzawoVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzawk zzawkVar4 = ((zzawo) obj).zzb;
                                    zzawkVar4.zzb(zzawt.zzb(zzawkVar4.zzc().zzm() << ((int) zzawkVar4.zzc().zzm())));
                                    return Optional.empty();
                                case 6:
                                    zzawk zzawkVar5 = ((zzawo) obj).zzb;
                                    zzawkVar5.zzb(zzawt.zzb(zzawkVar5.zzc().zzm() >>> ((int) zzawkVar5.zzc().zzm())));
                                    return Optional.empty();
                                case 7:
                                    zzawk zzawkVar6 = ((zzawo) obj).zzb;
                                    zzawkVar6.zzb(zzawt.zzc(zzawkVar6.zzc().zzq() - zzawkVar6.zzc().zzq()));
                                    return Optional.empty();
                                case 8:
                                    zzawk zzawkVar7 = ((zzawo) obj).zzb;
                                    zzawkVar7.zzb(zzawt.zzb(zzawkVar7.zzc().zzm() - zzawkVar7.zzc().zzm()));
                                    return Optional.empty();
                                case 9:
                                    zzawo zzawoVar4 = (zzawo) obj;
                                    zzawk zzawkVar8 = zzawoVar4.zzb;
                                    long jZzm2 = zzawkVar8.zzc().zzm();
                                    zzawt zzawtVarZzc5 = zzawkVar8.zzc();
                                    zzawk zzawkVar9 = zzawoVar4.zzb;
                                    zzawt zzawtVarZzd = zzawkVar9.zzd(jZzm2);
                                    zzawkVar9.zze(jZzm2, zzawtVarZzc5);
                                    zzawkVar9.zzb(zzawtVarZzd);
                                    return Optional.empty();
                                case 10:
                                    zzawo zzawoVar5 = (zzawo) obj;
                                    zzawk zzawkVar10 = zzawoVar5.zzb;
                                    long jZzm3 = zzawoVar5.zzc.zzb().zzb + zzawkVar10.zzc().zzm();
                                    zzawt zzawtVarZzc6 = zzawkVar10.zzc();
                                    zzawk zzawkVar11 = zzawoVar5.zzb;
                                    long j8 = -jZzm3;
                                    zzawt zzawtVarZzd2 = zzawkVar11.zzd(j8);
                                    zzawkVar11.zze(j8, zzawtVarZzc6);
                                    zzawkVar11.zzb(zzawtVarZzd2);
                                    return Optional.empty();
                                case 11:
                                    zzawo zzawoVar6 = (zzawo) obj;
                                    long jZze = zzawoVar6.zzc.zzb().zzb + zzawoVar6.zzd.zze();
                                    zzawt zzawtVarZzc7 = zzawoVar6.zzb.zzc();
                                    zzawk zzawkVar12 = zzawoVar6.zzb;
                                    long j10 = -jZze;
                                    zzawt zzawtVarZzd3 = zzawkVar12.zzd(j10);
                                    zzawkVar12.zze(j10, zzawtVarZzc7);
                                    zzawkVar12.zzb(zzawtVarZzd3);
                                    return Optional.empty();
                                case 12:
                                    zzawo zzawoVar7 = (zzawo) obj;
                                    long jZzm4 = zzawoVar7.zzb.zzc().zzm();
                                    try {
                                        zzawk zzawkVar13 = zzawoVar7.zzb;
                                        int i11 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i12 = 1478326644 % 593443203;
                                        if (jZzm4 == 0) {
                                            zzawtVarZzc = zzawkVar13.zzc();
                                        } else {
                                            int iZza = zzawkVar13.zza(jZzm4);
                                            zzawkVar13.zzb += i11 ^ i12;
                                            zzawtVarZzc = (zzawt) zzawkVar13.zza.remove(iZza);
                                        }
                                        zzawkVar13.zzb(zzawtVarZzc);
                                        return Optional.empty();
                                    } catch (zzawi unused2) {
                                        zzavdVar = zzavd.zzg;
                                        break;
                                    }
                                case 13:
                                    zzawo zzawoVar8 = (zzawo) obj;
                                    try {
                                        zzawk zzawkVar14 = zzawoVar8.zzb;
                                        long jZzm5 = zzawkVar14.zzc().zzm();
                                        long jZzm6 = zzawkVar14.zzc().zzm();
                                        zzawh zzawhVar = zzawoVar8.zzc;
                                        zzawc zzawcVar = zzawoVar8.zzd;
                                        zzawhVar.zza(zzawcVar.zzb(), jZzm6, zzawhVar.zzb().zzb);
                                        zzawcVar.zza(jZzm5);
                                        return Optional.empty();
                                    } catch (zzawa | zzawb unused3) {
                                        zzavdVar = zzavd.zzr;
                                        break;
                                    } catch (zzawf unused4) {
                                        zzavdVar = zzavd.zzB;
                                        break;
                                    } catch (zzawg unused5) {
                                        zzavdVar = zzavd.zzw;
                                        break;
                                    }
                                case 14:
                                    zzawo zzawoVar9 = (zzawo) obj;
                                    try {
                                        zzawoVar9.zzb.zzb(zzawt.zzg(zzawoVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzawq unused6) {
                                        zzavdVar = zzavd.zzp;
                                        break;
                                    }
                                default:
                                    try {
                                        zzawk zzawkVar15 = ((zzawo) obj).zzb;
                                        Iterator it = zzawkVar15.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzawkVar15.zzb((zzawt) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzawj unused7) {
                                        zzavdVar = zzavd.zza;
                                        break;
                                    }
                            }
                        } catch (zzawg | zzawi unused8) {
                            zzavdVar = zzavd.zzx;
                        }
                    } catch (zzawi unused9) {
                        zzavdVar = zzavd.zzh;
                    }
                } catch (zzavz | zzawb | zzawq unused10) {
                    zzavdVar = zzavd.zzy;
                }
            } catch (zzawj e7) {
                e = e7;
                throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzawq unused11) {
            zzavdVar = zzavd.zzk;
        } catch (IOException e10) {
            e = e10;
            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(zzavdVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
