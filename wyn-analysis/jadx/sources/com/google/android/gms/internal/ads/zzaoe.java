package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaoe implements zzans {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzanx zzg;
    private final zzanw zzh;
    private final zzaod zzi;
    private Bitmap zzj;

    public zzaoe(List list) {
        zzeu zzeuVar = new zzeu((byte[]) list.get(0));
        int iZzt = zzeuVar.zzt();
        int iZzt2 = zzeuVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzanx(719, 575, 0, 719, 0, 575);
        this.zzh = new zzanw(0, zzd(), zze(), zzf());
        this.zzi = new zzaod(iZzt, iZzt2);
    }

    private static zzanw zzb(zzet zzetVar, int i5) {
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i10 = 8;
        int iZzj5 = zzetVar.zzj(8);
        zzetVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i11 = i5 - 2;
        while (i11 > 0) {
            int iZzj6 = zzetVar.zzj(i10);
            int iZzj7 = zzetVar.zzj(i10);
            int[] iArr = (iZzj7 & 128) != 0 ? iArrZzd : (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzetVar.zzj(i10);
                iZzj4 = zzetVar.zzj(i10);
                iZzj = zzetVar.zzj(i10);
                iZzj2 = zzetVar.zzj(i10);
                i11 -= 6;
            } else {
                int iZzj8 = zzetVar.zzj(6) << 2;
                int iZzj9 = zzetVar.zzj(4) << 4;
                i11 -= 4;
                iZzj = zzetVar.zzj(4) << 4;
                iZzj2 = zzetVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d3 = iZzj3;
            String str = zzfm.zza;
            double d5 = iZzj4 - 128;
            double d10 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) ((1.402d * d5) + d3), 255)), Math.max(0, Math.min((int) ((d3 - (0.34414d * d10)) - (d5 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d10 * 1.772d) + d3), 255)));
            iZzj5 = iZzj5;
            i10 = 8;
        }
        return new zzanw(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzany zzc(zzet zzetVar) {
        byte[] bArr;
        int iZzj = zzetVar.zzj(16);
        zzetVar.zzh(4);
        int iZzj2 = zzetVar.zzj(2);
        boolean zZzi = zzetVar.zzi();
        zzetVar.zzh(1);
        byte[] bArr2 = zzfm.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzetVar.zzj(16);
                int iZzj4 = zzetVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzetVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzetVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzany(iZzj, zZzi, bArr2, bArr);
        }
        zzetVar.zzh(zzetVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzany(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i5 = 1; i5 < 16; i5++) {
            int i10 = i5 & 4;
            int i11 = i5 & 2;
            int i12 = i5 & 1;
            if (i5 < 8) {
                iArr[i5] = zzg(255, 1 != i12 ? 0 : 255, i11 != 0 ? 255 : 0, i10 != 0 ? 255 : 0);
            } else {
                iArr[i5] = zzg(255, 1 != i12 ? 0 : 127, i11 != 0 ? 127 : 0, i10 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            if (i5 < 8) {
                iArr[i5] = zzg(63, 1 != (i5 & 1) ? 0 : 255, (i5 & 2) != 0 ? 255 : 0, (i5 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i5 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i10 == 0) {
                    iArr[i5] = zzg(255, (1 != (i5 & 1) ? 0 : 85) + ((i5 & 16) != 0 ? 170 : 0), ((i5 & 2) != 0 ? 85 : 0) + ((i5 & 32) != 0 ? 170 : 0), ((i5 & 4) == 0 ? 0 : 85) + ((i5 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i5] = zzg(127, (1 != (i5 & 1) ? 0 : 85) + ((i5 & 16) != 0 ? 170 : 0), ((i5 & 2) != 0 ? 85 : 0) + ((i5 & 32) != 0 ? 170 : 0), ((i5 & 4) == 0 ? 0 : 85) + ((i5 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i5] = zzg(255, (1 != (i5 & 1) ? 0 : 43) + 127 + ((i5 & 16) != 0 ? 85 : 0), ((i5 & 2) != 0 ? 43 : 0) + 127 + ((i5 & 32) != 0 ? 85 : 0), ((i5 & 4) == 0 ? 0 : 43) + 127 + ((i5 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i5] = zzg(255, (1 != (i5 & 1) ? 0 : 43) + ((i5 & 16) != 0 ? 85 : 0), ((i5 & 2) != 0 ? 43 : 0) + ((i5 & 32) != 0 ? 85 : 0), ((i5 & 4) == 0 ? 0 : 43) + ((i5 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i5, int i10, int i11, int i12) {
        return (i5 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzh(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoe.zzh(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzi(int i5, int i10, zzet zzetVar) {
        byte[] bArr = new byte[i5];
        for (int i11 = 0; i11 < i5; i11++) {
            bArr[i11] = (byte) zzetVar.zzj(i10);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i5, int i10, zzanr zzanrVar, zzdu zzduVar) {
        boolean z2;
        zzank zzankVar;
        Canvas canvas;
        char c10;
        char c11;
        char c12;
        int i11;
        zzaod zzaodVar;
        Canvas canvas2;
        int i12;
        int i13;
        int i14;
        zzaob zzaobVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i15;
        int iZzj5;
        zzet zzetVar = new zzet(bArr, i5 + i10);
        zzetVar.zzf(i5);
        while (true) {
            z2 = true;
            if (zzetVar.zzc() >= 48 && zzetVar.zzj(8) == 15) {
                zzaod zzaodVar2 = this.zzi;
                int iZzj6 = zzetVar.zzj(8);
                int iZzj7 = zzetVar.zzj(16);
                int iZzj8 = zzetVar.zzj(16);
                int iZze = zzetVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzetVar.zzc()) {
                    zzeh.zzc("DvbParser", "Data field length exceeds limit");
                    zzetVar.zzh(zzetVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzaodVar2.zza) {
                                zzanz zzanzVar = zzaodVar2.zzi;
                                int iZzj9 = zzetVar.zzj(8);
                                int iZzj10 = zzetVar.zzj(4);
                                int iZzj11 = zzetVar.zzj(2);
                                zzetVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i16 = iZzj8 - 2; i16 > 0; i16 -= 6) {
                                    int iZzj12 = zzetVar.zzj(8);
                                    zzetVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzaoa(zzetVar.zzj(16), zzetVar.zzj(16)));
                                }
                                zzanz zzanzVar2 = new zzanz(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzanzVar2.zzb != 0) {
                                    zzaodVar2.zzi = zzanzVar2;
                                    zzaodVar2.zzc.clear();
                                    zzaodVar2.zzd.clear();
                                    zzaodVar2.zze.clear();
                                    break;
                                } else if (zzanzVar != null) {
                                    if (zzanzVar.zza != zzanzVar2.zza) {
                                        zzaodVar2.zzi = zzanzVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzanz zzanzVar3 = zzaodVar2.zzi;
                            if (iZzj7 == zzaodVar2.zza && zzanzVar3 != null) {
                                int iZzj13 = zzetVar.zzj(8);
                                zzetVar.zzh(4);
                                boolean zZzi = zzetVar.zzi();
                                zzetVar.zzh(3);
                                int iZzj14 = zzetVar.zzj(16);
                                int iZzj15 = zzetVar.zzj(16);
                                int iZzj16 = zzetVar.zzj(3);
                                int iZzj17 = zzetVar.zzj(3);
                                zzetVar.zzh(2);
                                int iZzj18 = zzetVar.zzj(8);
                                int iZzj19 = zzetVar.zzj(8);
                                int iZzj20 = zzetVar.zzj(4);
                                int iZzj21 = zzetVar.zzj(2);
                                zzetVar.zzh(2);
                                int i17 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i17 > 0) {
                                    int iZzj22 = zzetVar.zzj(16);
                                    int iZzj23 = zzetVar.zzj(2);
                                    int iZzj24 = zzetVar.zzj(2);
                                    int iZzj25 = zzetVar.zzj(12);
                                    zzetVar.zzh(4);
                                    int iZzj26 = zzetVar.zzj(12);
                                    int i18 = i17 - 6;
                                    if (iZzj23 == 1) {
                                        i17 -= 8;
                                        iZzj = zzetVar.zzj(8);
                                        iZzj2 = zzetVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i17 -= 8;
                                        iZzj = zzetVar.zzj(8);
                                        iZzj2 = zzetVar.zzj(8);
                                    } else {
                                        i17 = i18;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzaoc(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzaob zzaobVar2 = new zzaob(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzanzVar3.zzb == 0 && (zzaobVar = (zzaob) zzaodVar2.zzc.get(zzaobVar2.zza)) != null) {
                                    int i19 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzaobVar.zzj;
                                        if (i19 < sparseArray3.size()) {
                                            zzaobVar2.zzj.put(sparseArray3.keyAt(i19), (zzaoc) sparseArray3.valueAt(i19));
                                            i19++;
                                        }
                                    }
                                }
                                zzaodVar2.zzc.put(zzaobVar2.zza, zzaobVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzaodVar2.zza) {
                                zzanw zzanwVarZzb = zzb(zzetVar, iZzj8);
                                zzaodVar2.zzd.put(zzanwVarZzb.zza, zzanwVarZzb);
                                break;
                            } else if (iZzj7 == zzaodVar2.zzb) {
                                zzanw zzanwVarZzb2 = zzb(zzetVar, iZzj8);
                                zzaodVar2.zzf.put(zzanwVarZzb2.zza, zzanwVarZzb2);
                                break;
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzaodVar2.zza) {
                                zzany zzanyVarZzc = zzc(zzetVar);
                                zzaodVar2.zze.put(zzanyVarZzc.zza, zzanyVarZzc);
                                break;
                            } else if (iZzj7 == zzaodVar2.zzb) {
                                zzany zzanyVarZzc2 = zzc(zzetVar);
                                zzaodVar2.zzg.put(zzanyVarZzc2.zza, zzanyVarZzc2);
                                break;
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzaodVar2.zza) {
                                zzetVar.zzh(4);
                                boolean zZzi2 = zzetVar.zzi();
                                zzetVar.zzh(3);
                                int iZzj27 = zzetVar.zzj(16);
                                int iZzj28 = zzetVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzetVar.zzj(16);
                                    iZzj3 = zzetVar.zzj(16);
                                    iZzj5 = zzetVar.zzj(16);
                                    iZzj4 = zzetVar.zzj(16);
                                    i15 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i15 = 0;
                                    iZzj5 = 0;
                                }
                                zzaodVar2.zzh = new zzanx(iZzj27, iZzj28, i15, iZzj3, iZzj5, iZzj4);
                                break;
                            }
                            break;
                    }
                    zzetVar.zzo(iZze - zzetVar.zze());
                }
            }
        }
        zzaod zzaodVar3 = this.zzi;
        zzanz zzanzVar4 = zzaodVar3.zzi;
        if (zzanzVar4 == null) {
            zzankVar = new zzank(zzgwt.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzanx zzanxVar = zzaodVar3.zzh;
            if (zzanxVar == null) {
                zzanxVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzanxVar.zza + 1 != bitmap.getWidth() || zzanxVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzanxVar.zza + 1, zzanxVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzanzVar4.zzc;
            int i20 = 0;
            while (i20 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzaoa zzaoaVar = (zzaoa) sparseArray4.valueAt(i20);
                zzaob zzaobVar3 = (zzaob) zzaodVar3.zzc.get(sparseArray4.keyAt(i20));
                int i21 = zzaoaVar.zza + zzanxVar.zzc;
                int i22 = zzaoaVar.zzb + zzanxVar.zze;
                int i23 = zzaobVar3.zzc;
                int i24 = i21 + i23;
                boolean z10 = z2;
                int iMin = Math.min(i24, zzanxVar.zzd);
                int i25 = zzaobVar3.zzd;
                int i26 = i22 + i25;
                canvas3.clipRect(i21, i22, iMin, Math.min(i26, zzanxVar.zzf));
                int i27 = zzaobVar3.zzf;
                zzanw zzanwVar = (zzanw) zzaodVar3.zzd.get(i27);
                if (zzanwVar == null && (zzanwVar = (zzanw) zzaodVar3.zzf.get(i27)) == null) {
                    zzanwVar = this.zzh;
                }
                SparseArray sparseArray5 = zzaobVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i28 = i20;
                int i29 = 0;
                while (i29 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i29);
                    int i30 = i29;
                    zzaoc zzaocVar = (zzaoc) sparseArray5.valueAt(i29);
                    SparseArray sparseArray7 = sparseArray5;
                    zzany zzanyVar = (zzany) zzaodVar3.zze.get(iKeyAt);
                    if (zzanyVar == null) {
                        zzanyVar = (zzany) zzaodVar3.zzg.get(iKeyAt);
                    }
                    if (zzanyVar != null) {
                        Paint paint = zzanyVar.zzb ? null : this.zzd;
                        i13 = i23;
                        int i31 = zzaobVar3.zze;
                        zzaodVar = zzaodVar3;
                        int i32 = zzaocVar.zza + i21;
                        int i33 = i22 + zzaocVar.zzb;
                        canvas2 = canvas3;
                        i12 = i21;
                        int[] iArr = i31 == 3 ? zzanwVar.zzd : i31 == 2 ? zzanwVar.zzc : zzanwVar.zzb;
                        i14 = i24;
                        zzh(zzanyVar.zzc, iArr, i31, i32, i33, paint, canvas2);
                        zzh(zzanyVar.zzd, iArr, i31, i32, i33 + 1, paint, canvas2);
                    } else {
                        zzaodVar = zzaodVar3;
                        canvas2 = canvas3;
                        i12 = i21;
                        i13 = i23;
                        i14 = i24;
                    }
                    i21 = i12;
                    i24 = i14;
                    i29 = i30 + 1;
                    i23 = i13;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzaodVar3 = zzaodVar;
                }
                zzaod zzaodVar4 = zzaodVar3;
                Canvas canvas4 = canvas3;
                int i34 = i21;
                int i35 = i23;
                int i36 = i24;
                float f10 = i22;
                float f11 = i34;
                if (zzaobVar3.zzb) {
                    int i37 = zzaobVar3.zze;
                    if (i37 == 3) {
                        i11 = zzanwVar.zzd[zzaobVar3.zzg];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i11 = i37 == 2 ? zzanwVar.zzc[zzaobVar3.zzh] : zzanwVar.zzb[zzaobVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i11);
                    float f12 = i36;
                    c11 = c12;
                    c10 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f11, f10, f12, i26, paint2);
                } else {
                    canvas = canvas4;
                    c10 = 3;
                    c11 = 2;
                }
                zzcx zzcxVar = new zzcx();
                zzcxVar.zzc(Bitmap.createBitmap(this.zzj, i34, i22, i35, i25));
                float f13 = zzanxVar.zza;
                zzcxVar.zzi(f11 / f13);
                zzcxVar.zzj(0);
                float f14 = zzanxVar.zzb;
                zzcxVar.zzf(f10 / f14, 0);
                zzcxVar.zzg(0);
                zzcxVar.zzm(i35 / f13);
                zzcxVar.zzn(i25 / f14);
                arrayList.add(zzcxVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i20 = i28 + 1;
                z2 = z10;
                zzaodVar3 = zzaodVar4;
                sparseArray4 = sparseArray6;
            }
            zzankVar = new zzank(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzduVar.zza(zzankVar);
    }
}
