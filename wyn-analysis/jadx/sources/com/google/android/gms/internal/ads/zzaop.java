package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
final class zzaop {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzaov zzf;
    public final String zzg;
    public final String zzh;
    public final zzaop zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzaop(String str, String str2, long j8, long j10, zzaov zzaovVar, String[] strArr, String str3, String str4, zzaop zzaopVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaovVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j8;
        this.zze = j10;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaopVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzaop zza(String str) {
        return new zzaop(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", StringUtils.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtils.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzaop zzb(String str, long j8, long j10, zzaov zzaovVar, String[] strArr, String str2, String str3, zzaop zzaopVar) {
        return new zzaop(str, null, j8, j10, zzaovVar, strArr, str2, str3, zzaopVar);
    }

    private final void zzi(TreeSet treeSet, boolean z2) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        if (z2 || zEquals || ("div".equals(str) && this.zzh != null)) {
            long j8 = this.zzd;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
            long j10 = this.zze;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.zzm != null) {
            for (int i5 = 0; i5 < this.zzm.size(); i5++) {
                zzaop zzaopVar = (zzaop) this.zzm.get(i5);
                boolean z10 = true;
                if (!z2 && !zEquals) {
                    z10 = false;
                }
                zzaopVar.zzi(treeSet, z10);
            }
        }
    }

    private final void zzj(long j8, String str, List list) {
        String str2;
        String str3 = this.zzg;
        boolean zEquals = "".equals(str3);
        boolean zZzc = zzc(j8);
        if (true != zEquals) {
            str = str3;
        }
        if (zZzc && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i5 = 0; i5 < zzf(); i5++) {
            zze(i5).zzj(j8, str, list);
        }
    }

    private final void zzk(long j8, boolean z2, String str, Map map) {
        long j10;
        boolean z10;
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if (ExternalParsersConfigReaderMetKeys.METADATA_TAG.equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z2) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z2) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j8)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzcx) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i5 = 0; i5 < zzf(); i5++) {
                zzaop zzaopVarZze = zze(i5);
                if (z2 || zEquals) {
                    j10 = j8;
                    z10 = true;
                } else {
                    j10 = j8;
                    z10 = false;
                }
                zzaopVarZze.zzk(j10, z10, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzcx) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcx zzcxVar = new zzcx();
            zzcxVar.zza(new SpannableStringBuilder());
            map.put(str, zzcxVar);
        }
        CharSequence charSequenceZzb = ((zzcx) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzm(long r20, java.util.Map r22, java.util.Map r23, java.lang.String r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaop.zzm(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    public final boolean zzc(long j8) {
        long j10 = this.zzd;
        if (j10 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j10 = -9223372036854775807L;
        }
        if (j10 <= j8 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j10 != -9223372036854775807L || j8 >= this.zze) {
            return j10 <= j8 && j8 < this.zze;
        }
        return true;
    }

    public final void zzd(zzaop zzaopVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaopVar);
    }

    public final zzaop zze(int i5) {
        List list = this.zzm;
        if (list != null) {
            return (zzaop) list.get(i5);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i5 = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i5] = ((Long) it.next()).longValue();
            i5++;
        }
        return jArr;
    }

    public final List zzh(long j8, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j8, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j8, false, str, treeMap);
        zzm(j8, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Pair pair = (Pair) arrayList.get(i5);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzaot zzaotVar = (zzaot) map2.get(pair.first);
                zzaotVar.getClass();
                zzcx zzcxVar = new zzcx();
                zzcxVar.zzc(bitmapDecodeByteArray);
                zzcxVar.zzi(zzaotVar.zzb);
                zzcxVar.zzj(0);
                zzcxVar.zzf(zzaotVar.zzc, 0);
                zzcxVar.zzg(zzaotVar.zze);
                zzcxVar.zzm(zzaotVar.zzf);
                zzcxVar.zzn(zzaotVar.zzg);
                zzcxVar.zzo(zzaotVar.zzj);
                arrayList2.add(zzcxVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzaot zzaotVar2 = (zzaot) map2.get(entry.getKey());
            zzaotVar2.getClass();
            zzcx zzcxVar2 = (zzcx) entry.getValue();
            CharSequence charSequenceZzb = zzcxVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzaon zzaonVar : (zzaon[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzaon.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaonVar), spannableStringBuilder.getSpanEnd(zzaonVar), (CharSequence) "");
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
                i10 = i11;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n' && spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i16 = 0;
            while (i16 < spannableStringBuilder.length() - 1) {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ' && spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
                i16 = i17;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcxVar2.zzf(zzaotVar2.zzc, zzaotVar2.zzd);
            zzcxVar2.zzg(zzaotVar2.zze);
            zzcxVar2.zzi(zzaotVar2.zzb);
            zzcxVar2.zzm(zzaotVar2.zzf);
            zzcxVar2.zzl(zzaotVar2.zzi, zzaotVar2.zzh);
            zzcxVar2.zzo(zzaotVar2.zzj);
            arrayList2.add(zzcxVar2.zzr());
        }
        return arrayList2;
    }
}
