package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzaoy {
    private boolean zzd;
    private boolean zze;
    private int[] zzf;
    private int zzg;
    private int zzh;
    private Rect zzi;
    private long zzb = -9223372036854775807L;
    private long zzc = -9223372036854775807L;
    private final int[] zza = new int[4];
    private int zzj = -1;
    private int zzk = -1;

    private static int zzg(int[] iArr, int i5) {
        if (i5 >= iArr.length) {
            i5 = 0;
        }
        return iArr[i5];
    }

    private static int zzh(int i5, int i10) {
        return (i5 & 16777215) | ((i10 * 17) << 24);
    }

    private final void zzi(zzet zzetVar, boolean z2, Rect rect, int[] iArr) {
        int i5;
        int i10;
        int i11 = !z2 ? 1 : 0;
        int iWidth = rect.width();
        int i12 = i11 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i13 = 0;
            do {
                int iZzj = 0;
                for (int i14 = 1; iZzj < i14 && i14 <= 64; i14 <<= 2) {
                    if (zzetVar.zzc() < 4) {
                        i5 = -1;
                        i10 = 0;
                        break;
                    }
                    iZzj = (iZzj << 4) | zzetVar.zzj(4);
                }
                i5 = iZzj & 3;
                i10 = iZzj < 4 ? iWidth : iZzj >> 2;
                int iMin = Math.min(i10, iWidth - i13);
                if (iMin > 0) {
                    int i15 = i12 + iMin;
                    Arrays.fill(iArr, i12, i15, this.zza[i5]);
                    i13 += iMin;
                    i12 = i15;
                }
            } while (i13 < iWidth);
            i11 += 2;
            if (i11 >= iHeight) {
                return;
            }
            i12 = i11 * iWidth;
            zzetVar.zzm();
        }
    }

    public final void zza(String str) {
        int i5;
        String strTrim = str.trim();
        String str2 = zzfm.zza;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] strArrSplit = str3.substring(9).split(",", -1);
                this.zzf = new int[strArrSplit.length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int[] iArr = this.zzf;
                    try {
                        i5 = Integer.parseInt(strArrSplit[i10].trim(), 16);
                    } catch (RuntimeException e7) {
                        zzeh.zzd("VobsubParser", "Parsing color failed", e7);
                        i5 = 0;
                    }
                    iArr[i10] = i5;
                }
            } else if (str3.startsWith("size: ")) {
                String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    StringBuilder sb2 = new StringBuilder(str3.length() + 36);
                    sb2.append("Ignoring malformed IDX size line: '");
                    sb2.append(str3);
                    sb2.append("'");
                    zzeh.zzc("VobsubParser", sb2.toString());
                } else {
                    try {
                        this.zzg = Integer.parseInt(strArrSplit2[0]);
                        this.zzh = Integer.parseInt(strArrSplit2[1]);
                        this.zzd = true;
                    } catch (RuntimeException e10) {
                        zzeh.zzd("VobsubParser", "Parsing IDX failed", e10);
                    }
                }
            }
        }
    }

    public final zzcy zzb(zzeu zzeuVar) {
        Rect rect;
        if (this.zzf == null || !this.zzd || !this.zze || (rect = this.zzi) == null || this.zzj == -1 || this.zzk == -1 || rect.width() < 2 || this.zzi.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzi;
        int[] iArr = new int[rect2.height() * rect2.width()];
        zzet zzetVar = new zzet();
        zzeuVar.zzh(this.zzj);
        zzetVar.zza(zzeuVar);
        zzi(zzetVar, true, rect2, iArr);
        zzeuVar.zzh(this.zzk);
        zzetVar.zza(zzeuVar);
        zzi(zzetVar, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcx zzcxVar = new zzcx();
        zzcxVar.zzc(bitmapCreateBitmap);
        zzcxVar.zzi(rect2.left / this.zzg);
        zzcxVar.zzj(0);
        zzcxVar.zzf(rect2.top / this.zzh, 0);
        zzcxVar.zzg(0);
        zzcxVar.zzm(rect2.width() / this.zzg);
        zzcxVar.zzn(rect2.height() / this.zzh);
        return zzcxVar.zzr();
    }

    public final void zzc() {
        this.zzb = -9223372036854775807L;
        this.zzc = -9223372036854775807L;
        this.zze = false;
        this.zzi = null;
        this.zzj = -1;
        this.zzk = -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:25:0x005a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:103)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0069. Please report as an issue. */
    public final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzeu r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoy.zzd(com.google.android.gms.internal.ads.zzeu):void");
    }

    public final /* synthetic */ long zze() {
        return this.zzb;
    }

    public final /* synthetic */ long zzf() {
        return this.zzc;
    }
}
