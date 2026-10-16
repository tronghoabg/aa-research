package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaly {
    public static void zza(int i5, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzgwt zzgwtVarZzd = zzapVar.zzd(zzfx.class);
            int size = zzgwtVarZzd.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzfx zzfxVar = (zzfx) zzgwtVarZzd.get(i10);
                if (!zzfxVar.zza.equals("com.android.capture.fps") || i5 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfxVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzl(zzapVar2);
        }
    }

    public static void zzb(int i5, zzagt zzagtVar, zzt zztVar) {
        if (i5 == 1 && zzagtVar.zzb()) {
            zztVar.zzK(zzagtVar.zza);
            zztVar.zzL(zzagtVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0285 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:9:0x003b, B:11:0x0046, B:15:0x0055, B:18:0x0061, B:21:0x006e, B:24:0x007b, B:27:0x0088, B:30:0x0096, B:32:0x00a2, B:40:0x00bf, B:41:0x00dd, B:42:0x00ef, B:45:0x00fb, B:48:0x0108, B:51:0x0115, B:54:0x0122, B:57:0x012f, B:60:0x013c, B:63:0x0149, B:65:0x0153, B:67:0x015d, B:69:0x0167, B:73:0x0178, B:75:0x017e, B:77:0x0192, B:78:0x0199, B:80:0x01a0, B:85:0x01ab, B:90:0x01b7, B:134:0x0285, B:91:0x01cc, B:93:0x01d3, B:95:0x01df, B:96:0x01f3, B:109:0x021d, B:112:0x022a, B:115:0x0237, B:118:0x0244, B:121:0x0250, B:124:0x025c, B:127:0x0266, B:130:0x0272, B:133:0x027e, B:135:0x02a2, B:136:0x02a9), top: B:141:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzeu r17) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaly.zzc(com.google.android.gms.internal.ads.zzeu):com.google.android.gms.internal.ads.zzao");
    }

    private static zzajx zzd(int i5, String str, zzeu zzeuVar) {
        int iZzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385) {
            zzeuVar.zzk(8);
            return new zzajx(str, null, zzgwt.zzj(zzeuVar.zzL(iZzB - 16)));
        }
        zzeh.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzgb.zze(i5)));
        return null;
    }

    private static zzajs zze(int i5, String str, zzeu zzeuVar, boolean z2, boolean z10) {
        int iZzf = zzf(zzeuVar);
        if (z10) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z2 ? new zzajx(str, null, zzgwt.zzj(Integer.toString(iZzf))) : new zzajm("und", str, Integer.toString(iZzf));
        }
        zzeh.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzgb.zze(i5)));
        return null;
    }

    private static int zzf(zzeu zzeuVar) {
        int iZzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385) {
            zzeuVar.zzk(8);
            int i5 = iZzB - 16;
            if (i5 == 1) {
                return zzeuVar.zzs();
            }
            if (i5 == 2) {
                return zzeuVar.zzt();
            }
            if (i5 == 3) {
                return zzeuVar.zzx();
            }
            if (i5 == 4 && (zzeuVar.zzn() & 128) == 0) {
                return zzeuVar.zzH();
            }
        }
        zzeh.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzajx zzg(int i5, String str, zzeu zzeuVar) {
        int iZzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385 && iZzB >= 22) {
            zzeuVar.zzk(10);
            int iZzt = zzeuVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt).length());
                sb2.append(iZzt);
                String string = sb2.toString();
                int iZzt2 = zzeuVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iZzt2);
                    string = sb3.toString();
                }
                return new zzajx(str, null, zzgwt.zzj(string));
            }
        }
        zzeh.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzgb.zze(i5)));
        return null;
    }
}
