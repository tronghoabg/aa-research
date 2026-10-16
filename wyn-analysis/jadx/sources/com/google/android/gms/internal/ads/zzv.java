package com.google.android.gms.internal.ads;

import A.AbstractC0213f;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.ads.BuildConfig;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzv {
    public static final /* synthetic */ int zzQ = 0;
    public final float zzA;
    public final int zzB;
    public final float zzC;
    public final byte[] zzD;
    public final int zzE;
    public final zzi zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public final int zzL;
    public final int zzM;
    public final int zzN;
    public final int zzO;
    public final int zzP;
    private int zzR;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzap zzl;
    public final Object zzm;
    public final String zzn;
    public final String zzo;
    public final String zzp;
    public final int zzq;
    public final int zzr;
    public final List zzs;
    public final zzq zzt;
    public final long zzu;
    public final boolean zzv;
    public final int zzw;
    public final int zzx;
    public final int zzy;
    public final int zzz;

    static {
        new zzv(new zzt());
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
    }

    public /* synthetic */ zzv(zzt zztVar, byte[] bArr) {
        this(zztVar);
    }

    public static String zze(zzv zzvVar) {
        String str;
        int i5;
        int i10;
        StringBuilder sbJ = N0.a.j("id=");
        sbJ.append(zzvVar.zza);
        sbJ.append(", mimeType=");
        sbJ.append(zzvVar.zzp);
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            sbJ.append(", container=");
            sbJ.append(str2);
        }
        String str3 = zzvVar.zzn;
        if (str3 != null) {
            sbJ.append(", primaryGroupId=");
            sbJ.append(str3);
        }
        int i11 = zzvVar.zzj;
        if (i11 != -1) {
            sbJ.append(", bitrate=");
            sbJ.append(i11);
        }
        String str4 = zzvVar.zzk;
        if (str4 != null) {
            sbJ.append(", codecs=");
            sbJ.append(str4);
        }
        zzq zzqVar = zzvVar.zzt;
        if (zzqVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < zzqVar.zzb; i12++) {
                UUID uuid = zzqVar.zza(i12).zza;
                if (uuid.equals(zzg.zzb)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zzg.zzc)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzg.zze)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzg.zzd)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzg.zza)) {
                    linkedHashSet.add("universal");
                } else {
                    String string = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(string);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sbJ.append(", drm=[");
            zzgtl.zzb(sbJ, linkedHashSet, ",");
            sbJ.append(']');
        }
        int i13 = zzvVar.zzw;
        if (i13 != -1 && (i10 = zzvVar.zzx) != -1) {
            N0.a.l(i13, i10, ", res=", "x", sbJ);
        }
        int i14 = zzvVar.zzy;
        if (i14 != -1 && (i5 = zzvVar.zzz) != -1) {
            N0.a.l(i14, i5, ", decRes=", "x", sbJ);
        }
        float f10 = zzvVar.zzC;
        int i15 = zzhad.zza;
        double d3 = f10;
        if (Math.copySign((-1.0d) + d3, 1.0d) > 0.001d && d3 != 1.0d && (!Double.isNaN(d3) || !Double.isNaN(1.0d))) {
            sbJ.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str5 = zzfm.zza;
            sbJ.append(String.format(Locale.US, "%.3f", objArr));
        }
        zzi zziVar = zzvVar.zzF;
        if (zziVar != null && (zziVar.zze() || zziVar.zzf())) {
            sbJ.append(", color=");
            sbJ.append(zziVar.zzg());
        }
        float f11 = zzvVar.zzA;
        if (f11 != -1.0f) {
            sbJ.append(", fps=");
            sbJ.append(f11);
        }
        int i16 = zzvVar.zzG;
        if (i16 != -1) {
            sbJ.append(", maxSubLayers=");
            sbJ.append(i16);
        }
        int i17 = zzvVar.zzH;
        if (i17 != -1) {
            sbJ.append(", channels=");
            sbJ.append(i17);
        }
        int i18 = zzvVar.zzI;
        if (i18 != -1) {
            sbJ.append(", channel_mask=");
            sbJ.append(i18);
        }
        int i19 = zzvVar.zzJ;
        if (i19 != -1) {
            sbJ.append(", sample_rate=");
            sbJ.append(i19);
        }
        String str6 = zzvVar.zzd;
        if (str6 != null) {
            sbJ.append(", language=");
            sbJ.append(str6);
        }
        List list = zzvVar.zzc;
        if (!list.isEmpty()) {
            sbJ.append(", labels=[");
            zzgtl.zzb(sbJ, zzgxt.zzc(list, zzu.zza), ",");
            sbJ.append("]");
        }
        int i20 = zzvVar.zze;
        if (i20 != 0) {
            sbJ.append(", selectionFlags=[");
            String str7 = zzfm.zza;
            ArrayList arrayList = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i20 & 2) != 0) {
                arrayList.add("forced");
            }
            zzgtl.zzb(sbJ, arrayList, ",");
            sbJ.append("]");
        }
        int i21 = zzvVar.zzf;
        if (i21 != 0) {
            sbJ.append(", roleFlags=[");
            int i22 = i21 & 32768;
            String str8 = zzfm.zza;
            ArrayList arrayList2 = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i21 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i21 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i21 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i21 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i21 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i21 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i21 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i21 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i21 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i21 & Segment.SHARE_MINIMUM) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i21 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i21 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i21 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i21 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if (i22 != 0) {
                arrayList2.add("auxiliary");
            }
            zzgtl.zzb(sbJ, arrayList2, ",");
            sbJ.append("]");
        }
        if ((i21 & 32768) != 0) {
            sbJ.append(", auxiliaryTrackType=");
            int i23 = zzvVar.zzg;
            String str9 = zzfm.zza;
            if (i23 == 0) {
                str = "undefined";
            } else if (i23 == 1) {
                str = "original";
            } else if (i23 == 2) {
                str = "depth-linear";
            } else if (i23 == 3) {
                str = "depth-inverse";
            } else {
                if (i23 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbJ.append(str);
        }
        return sbJ.toString();
    }

    public final boolean equals(Object obj) {
        int i5;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzv.class == obj.getClass()) {
            zzv zzvVar = (zzv) obj;
            int i10 = this.zzR;
            if ((i10 == 0 || (i5 = zzvVar.zzR) == 0 || i10 == i5) && this.zze == zzvVar.zze && this.zzf == zzvVar.zzf && this.zzg == zzvVar.zzg && this.zzh == zzvVar.zzh && this.zzi == zzvVar.zzi && this.zzq == zzvVar.zzq && this.zzu == zzvVar.zzu && this.zzw == zzvVar.zzw && this.zzx == zzvVar.zzx && this.zzy == zzvVar.zzy && this.zzz == zzvVar.zzz && this.zzB == zzvVar.zzB && this.zzE == zzvVar.zzE && this.zzG == zzvVar.zzG && this.zzH == zzvVar.zzH && this.zzI == zzvVar.zzI && this.zzJ == zzvVar.zzJ && this.zzK == zzvVar.zzK && this.zzL == zzvVar.zzL && this.zzM == zzvVar.zzM && this.zzN == zzvVar.zzN && this.zzP == zzvVar.zzP && Float.compare(this.zzA, zzvVar.zzA) == 0 && Float.compare(this.zzC, zzvVar.zzC) == 0 && Objects.equals(this.zza, zzvVar.zza) && Objects.equals(this.zzb, zzvVar.zzb) && this.zzc.equals(zzvVar.zzc) && Objects.equals(this.zzk, zzvVar.zzk) && Objects.equals(this.zzn, zzvVar.zzn) && Objects.equals(this.zzo, zzvVar.zzo) && Objects.equals(this.zzp, zzvVar.zzp) && Objects.equals(this.zzd, zzvVar.zzd) && Arrays.equals(this.zzD, zzvVar.zzD) && Objects.equals(this.zzl, zzvVar.zzl) && Objects.equals(this.zzF, zzvVar.zzF) && Objects.equals(this.zzt, zzvVar.zzt) && zzd(zzvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzR;
        if (i5 != 0) {
            return i5;
        }
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = this.zzc.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.zzd;
        int iHashCode3 = ((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzap zzapVar = this.zzl;
        int iHashCode5 = iHashCode4 + (zzapVar == null ? 0 : zzapVar.hashCode());
        String str5 = this.zzn;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzo;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int iC = ((((((((((((((((((((((AbstractC0213f.c(this.zzC, (AbstractC0213f.c(this.zzA, (((((((((((((iHashCode7 + (this.zzp != null ? r0.hashCode() : 0)) * 31) + this.zzq) * 31) + ((int) this.zzu)) * 31) + this.zzw) * 31) + this.zzx) * 31) + this.zzy) * 31) + this.zzz) * 31, 31) + this.zzB) * 31, 31) + this.zzE) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) + this.zzJ) * 31) + this.zzK) * 31) + this.zzL) * 31) + this.zzM) * 31) + this.zzN) * 31) - 1) * 31) - 1) * 31) + this.zzP;
        this.zzR = iC;
        return iC;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzF);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzo;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzp;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zzk;
        int length5 = String.valueOf(str5).length();
        int i5 = this.zzj;
        int length6 = String.valueOf(i5).length();
        String str6 = this.zzd;
        int length7 = String.valueOf(str6).length();
        int i10 = this.zzw;
        int length8 = String.valueOf(i10).length();
        int i11 = this.zzx;
        int length9 = String.valueOf(i11).length();
        float f10 = this.zzA;
        int length10 = String.valueOf(f10).length();
        int length11 = strValueOf.length();
        int i12 = this.zzH;
        int length12 = String.valueOf(i12).length();
        int i13 = this.zzI;
        int length13 = String.valueOf(i13).length();
        int i14 = this.zzJ;
        StringBuilder sb2 = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i14).length() + 2);
        AbstractC3256n.p(sb2, "Format(", str, ", ", str2);
        AbstractC3256n.p(sb2, ", ", str3, ", ", str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i5);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append(", ");
        sb2.append(strValueOf);
        sb2.append("], [");
        sb2.append(i12);
        N0.a.l(i13, i14, ", ", ", ", sb2);
        sb2.append("])");
        return sb2.toString();
    }

    public final zzt zza() {
        return new zzt(this, null);
    }

    public final zzv zzb(int i5) {
        zzt zztVar = new zzt(this, null);
        zztVar.zzO(i5);
        return new zzv(zztVar);
    }

    public final int zzc() {
        int i5;
        int i10 = this.zzw;
        if (i10 == -1 || (i5 = this.zzx) == -1) {
            return -1;
        }
        return i10 * i5;
    }

    public final boolean zzd(zzv zzvVar) {
        List list = this.zzs;
        int size = list.size();
        List list2 = zzvVar.zzs;
        if (size != list2.size()) {
            return false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!Arrays.equals((byte[]) list.get(i5), (byte[]) list2.get(i5))) {
                return false;
            }
        }
        return true;
    }

    private zzv(zzt zztVar) {
        boolean z2;
        String str;
        this.zza = zztVar.zzQ();
        String strZzi = zzfm.zzi(zztVar.zzT());
        this.zzd = strZzi;
        if (zztVar.zzS().isEmpty() && zztVar.zzR() != null) {
            this.zzc = zzgwt.zzj(new zzx(strZzi, zztVar.zzR()));
            this.zzb = zztVar.zzR();
        } else if (!zztVar.zzS().isEmpty() && zztVar.zzR() == null) {
            this.zzc = zztVar.zzS();
            List listZzS = zztVar.zzS();
            Iterator it = listZzS.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzx) listZzS.get(0)).zzb;
                    break;
                }
                zzx zzxVar = (zzx) it.next();
                if (TextUtils.equals(zzxVar.zza, strZzi)) {
                    str = zzxVar.zzb;
                    break;
                }
            }
            this.zzb = str;
        } else if (zztVar.zzS().isEmpty() && zztVar.zzR() == null) {
            z2 = true;
            zzgtr.zzi(z2);
            this.zzc = zztVar.zzS();
            this.zzb = zztVar.zzR();
        } else {
            for (int i5 = 0; i5 < zztVar.zzS().size(); i5++) {
                if (((zzx) zztVar.zzS().get(i5)).zzb.equals(zztVar.zzR())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            zzgtr.zzi(z2);
            this.zzc = zztVar.zzS();
            this.zzb = zztVar.zzR();
        }
        this.zze = zztVar.zzU();
        zzgtr.zzj(zztVar.zzW() == 0 || (zztVar.zzV() & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zztVar.zzV();
        this.zzg = zztVar.zzW();
        int iZzX = zztVar.zzX();
        this.zzh = iZzX;
        int iZzY = zztVar.zzY();
        this.zzi = iZzY;
        this.zzj = iZzY != -1 ? iZzY : iZzX;
        this.zzk = zztVar.zzZ();
        this.zzl = zztVar.zzaa();
        this.zzm = null;
        this.zzn = zztVar.zzab();
        this.zzo = zztVar.zzac();
        this.zzp = zztVar.zzad();
        this.zzq = zztVar.zzae();
        this.zzr = zztVar.zzaf();
        this.zzs = zztVar.zzag() == null ? Collections.EMPTY_LIST : zztVar.zzag();
        zzq zzqVarZzah = zztVar.zzah();
        this.zzt = zzqVarZzah;
        this.zzu = zztVar.zzai();
        this.zzv = zztVar.zzaj();
        this.zzw = zztVar.zzak();
        this.zzx = zztVar.zzal();
        this.zzy = zztVar.zzam();
        this.zzz = zztVar.zzan();
        this.zzA = zztVar.zzao();
        this.zzB = zztVar.zzap() == -1 ? 0 : zztVar.zzap();
        this.zzC = zztVar.zzaq() == -1.0f ? 1.0f : zztVar.zzaq();
        this.zzD = zztVar.zzar();
        this.zzE = zztVar.zzas();
        this.zzF = zztVar.zzat();
        this.zzG = zztVar.zzau();
        int iZzav = zztVar.zzav();
        this.zzH = iZzav;
        int iZzaw = zztVar.zzaw();
        this.zzI = iZzaw;
        if (iZzav != -1 && iZzaw != -1 && Integer.bitCount(iZzaw) != iZzav) {
            throw new IllegalStateException(zzgui.zzd("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(iZzav), Integer.valueOf(iZzaw)));
        }
        this.zzJ = zztVar.zzax();
        this.zzK = zztVar.zzay();
        this.zzL = zztVar.zzaz() == -1 ? 0 : zztVar.zzaz();
        this.zzM = zztVar.zzaA() != -1 ? zztVar.zzaA() : 0;
        this.zzN = zztVar.zzaB();
        this.zzO = zztVar.zzaC();
        if (zztVar.zzaD() != 0 || zzqVarZzah == null) {
            this.zzP = zztVar.zzaD();
        } else {
            this.zzP = 1;
        }
    }
}
