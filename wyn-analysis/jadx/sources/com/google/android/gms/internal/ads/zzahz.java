package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
final class zzahz implements zzahs {
    public final zzgwt zza;
    private final int zzb;

    private zzahz(int i5, zzgwt zzgwtVar) {
        this.zzb = i5;
        this.zza = zzgwtVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzahz zzb(int i5, zzeu zzeuVar) {
        zzahs zzaiaVar;
        String str;
        zzgwq zzgwqVar = new zzgwq();
        int iZze = zzeuVar.zze();
        int iZzc = -2;
        while (zzeuVar.zzd() > 8) {
            int iZzC = zzeuVar.zzC();
            int iZzg = zzeuVar.zzg() + zzeuVar.zzC();
            zzeuVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzaia zzaiaVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc == 2) {
                            zzeuVar.zzk(4);
                            int iZzC2 = zzeuVar.zzC();
                            int iZzC3 = zzeuVar.zzC();
                            zzeuVar.zzk(4);
                            int iZzC4 = zzeuVar.zzC();
                            switch (iZzC4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                AbstractC1593a.v(new StringBuilder(String.valueOf(iZzC4).length() + 44), "Ignoring track with unsupported compression ", iZzC4, "StreamFormatChunk");
                            } else {
                                zzt zztVar = new zzt();
                                zztVar.zzv(iZzC2);
                                zztVar.zzw(iZzC3);
                                zztVar.zzo(str);
                                zzaiaVar2 = new zzaia(zztVar.zzP());
                            }
                        } else if (iZzc == 1) {
                            int iZzu = zzeuVar.zzu();
                            String str2 = iZzu != 1 ? iZzu != 85 ? iZzu != 255 ? iZzu != 8192 ? iZzu != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int iZzu2 = zzeuVar.zzu();
                                int iZzC5 = zzeuVar.zzC();
                                zzeuVar.zzk(6);
                                int iZzC6 = zzfm.zzC(zzeuVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                int iZzu3 = zzeuVar.zzd() > 0 ? zzeuVar.zzu() : 0;
                                zzt zztVar2 = new zzt();
                                zztVar2.zzo(str2);
                                zztVar2.zzG(iZzu2);
                                zztVar2.zzI(iZzC5);
                                if (str2.equals("audio/raw") && iZzC6 != 0) {
                                    zztVar2.zzJ(iZzC6);
                                }
                                if (str2.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                    byte[] bArr = new byte[iZzu3];
                                    zzeuVar.zzm(bArr, 0, iZzu3);
                                    zztVar2.zzr(zzgwt.zzj(bArr));
                                }
                                zzaiaVar = new zzaia(zztVar2.zzP());
                                break;
                            } else {
                                AbstractC1593a.v(new StringBuilder(String.valueOf(iZzu).length() + 43), "Ignoring track with unsupported format tag ", iZzu, "StreamFormatChunk");
                            }
                        } else {
                            zzeh.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfm.zzU(iZzc)));
                        }
                        zzaiaVar = zzaiaVar2;
                        break;
                    case 1751742049:
                        zzaiaVar = zzahw.zzb(zzeuVar);
                        break;
                    case 1752331379:
                        zzaiaVar = zzahx.zzb(zzeuVar);
                        break;
                    case 1852994675:
                        zzaiaVar = zzaib.zzb(zzeuVar);
                        break;
                    default:
                        zzaiaVar = zzaiaVar2;
                        break;
                }
            } else {
                zzaiaVar = zzb(zzeuVar.zzC(), zzeuVar);
            }
            if (zzaiaVar != null) {
                if (zzaiaVar.zza() == 1752331379) {
                    iZzc = ((zzahx) zzaiaVar).zzc();
                }
                zzgwqVar.zzf(zzaiaVar);
            }
            zzeuVar.zzh(iZzg);
            zzeuVar.zzf(iZze);
        }
        return new zzahz(i5, zzgwqVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return this.zzb;
    }

    public final zzahs zzc(Class cls) {
        zzgwt zzgwtVar = this.zza;
        int size = zzgwtVar.size();
        int i5 = 0;
        while (i5 < size) {
            zzahs zzahsVar = (zzahs) zzgwtVar.get(i5);
            i5++;
            if (zzahsVar.getClass() == cls) {
                return zzahsVar;
            }
        }
        return null;
    }
}
