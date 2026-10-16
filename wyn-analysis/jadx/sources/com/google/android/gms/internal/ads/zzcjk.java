package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcjk extends zzcjh {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = DesugarCollections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcjk(zzchu zzchuVar) {
        super(zzchuVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfzu.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i10 = G6.L.f4523b;
            H6.l.f("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i11 = G6.L.f4523b;
        H6.l.f("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfzu.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x03ce, code lost:
    
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03d6, code lost:
    
        if (H6.l.j(3) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03d8, code lost:
    
        r0 = r11.format(r5);
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r33).length());
        r4.append(r18);
        r4.append(r0);
        r4.append(" bytes from ");
        r4.append(r33);
        H6.l.a(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x040a, code lost:
    
        r15.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0415, code lost:
    
        if (r7.isFile() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0417, code lost:
    
        r7.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0423, code lost:
    
        r7.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzcjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(final java.lang.String r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjk.zze(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzl() {
        this.zzh = true;
    }
}
