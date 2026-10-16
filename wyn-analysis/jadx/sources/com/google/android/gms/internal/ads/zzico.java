package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import Va.M6;
import com.applovin.shadow.okio.Segment;
import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzico implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzibw zzc = zzibw.LEGACY_STRICT;
    private final char[] zzd = new char[Segment.SHARE_MINIMUM];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zziby.zza = new zzicn();
    }

    public zzico(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private final boolean zzn(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x013d, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013f, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0141, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x014d, code lost:
    
        r0.append(r4, r2, r3);
        r11.zze = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ee, code lost:
    
        throw zzv("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.zze, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzo(char r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzico.zzo(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        zzt();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzp() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.zze
            int r3 = r3 + r2
            int r4 = r5.zzf
            if (r3 >= r4) goto L4c
            char[] r4 = r5.zzd
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.zzt()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.zzr(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.zzd
            int r4 = r5.zze
            r1.append(r3, r4, r2)
            int r3 = r5.zze
            int r3 = r3 + r2
            r5.zze = r3
            r2 = 1
            boolean r2 = r5.zzr(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.zzd
            java.lang.String r2 = new java.lang.String
            int r3 = r5.zze
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.zzd
            int r3 = r5.zze
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.zze
            int r1 = r1 + r0
            r5.zze = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzico.zzp():java.lang.String");
    }

    private final void zzq(int i5) throws zzicr {
        int i10 = this.zzl;
        if (i10 - 1 >= 1280) {
            String strZzl = zzl();
            throw new zzicr(wg.b.c(new StringBuilder(strZzl.length() + 26), "Nesting limit 1280 reached", strZzl));
        }
        int[] iArr = this.zzk;
        if (i10 == iArr.length) {
            int i11 = i10 + i10;
            this.zzk = Arrays.copyOf(iArr, i11);
            this.zzn = Arrays.copyOf(this.zzn, i11);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i11);
        }
        int[] iArr2 = this.zzk;
        int i12 = this.zzl;
        this.zzl = i12 + 1;
        iArr2[i12] = i5;
    }

    private final boolean zzr(int i5) throws IOException {
        int i10;
        int i11 = this.zzh;
        int i12 = this.zze;
        this.zzh = i11 - i12;
        char[] cArr = this.zzd;
        int i13 = this.zzf;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.zzf = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i15 = this.zzf;
            int i16 = reader.read(cArr, i15, 1024 - i15);
            if (i16 == -1) {
                return false;
            }
            i10 = this.zzf + i16;
            this.zzf = i10;
            if (this.zzg == 0 && this.zzh == 0 && i10 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i5++;
            }
        } while (i10 < i5);
        return true;
    }

    private final int zzs(boolean z2) throws IOException {
        int i5;
        int i10 = this.zze;
        int i11 = this.zzf;
        while (true) {
            if (i10 == i11) {
                this.zze = i10;
                if (!zzr(1)) {
                    if (z2) {
                        throw new EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i10 = this.zze;
                i11 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.zzg++;
                this.zzh = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.zze = i12;
                    if (i12 == i11) {
                        this.zze = i10;
                        boolean zZzr = zzr(2);
                        this.zze++;
                        if (!zZzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i13 = this.zze;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.zze = i13 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i14 = this.zze;
                            if (cArr[i14] != '\n') {
                                while (i5 < 2) {
                                    i5 = cArr[this.zze + i5] == "*/".charAt(i5) ? i5 + 1 : 0;
                                }
                                i10 = this.zze + 2;
                                i11 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i14 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c11 != '/') {
                            return 47;
                        }
                        this.zze = i13 + 1;
                        zzu();
                        i10 = this.zze;
                        i11 = this.zzf;
                    }
                } else {
                    if (c10 != '#') {
                        this.zze = i12;
                        return c10;
                    }
                    this.zze = i12;
                    zzt();
                    zzu();
                    i10 = this.zze;
                    i11 = this.zzf;
                }
            }
            i10 = i12;
        }
    }

    private final void zzt() throws zzicr {
        if (this.zzc != zzibw.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() throws IOException {
        char c10;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i5 = this.zze;
            int i10 = i5 + 1;
            this.zze = i10;
            c10 = cArr[i5];
            if (c10 == '\n') {
                this.zzg++;
                this.zzh = i10;
                return;
            }
        } while (c10 != '\r');
    }

    private final zzicr zzv(String str) throws zzicr {
        String strZzl = zzl();
        throw new zzicr(M6.t(new StringBuilder(str.length() + strZzl.length() + 79), str, strZzl, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    private final IllegalStateException zzw(String str) throws IOException {
        int iZzm = zzm();
        String strZza = zzicp.zza(zzm());
        String strZzl = zzl();
        int iG = AbstractC0279p0.g(str.length() + 18, strZzl.length(), strZza);
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iZzm == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb2 = new StringBuilder(strConcat.length() + iG + 5);
        AbstractC3256n.p(sb2, "Expected ", str, " but was ", strZza);
        return new IllegalStateException(M6.t(sb2, strZzl, "\nSee ", strConcat));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final String toString() {
        return "zzico".concat(zzl());
    }

    public final void zza(zzibw zzibwVar) {
        Objects.requireNonNull(zzibwVar);
        this.zzc = zzibwVar;
    }

    public final void zzb() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 4) {
            throw zzw("END_ARRAY");
        }
        int i5 = this.zzl;
        this.zzl = i5 - 1;
        int[] iArr = this.zzn;
        int i10 = i5 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.zza = 0;
    }

    public final void zzd() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 2) {
            throw zzw("END_OBJECT");
        }
        int i5 = this.zzl;
        int i10 = i5 - 1;
        this.zzl = i10;
        this.zzm[i10] = null;
        int[] iArr = this.zzn;
        int i11 = i5 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.zza = 0;
    }

    public final boolean zzf() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        return (iZzg == 2 || iZzg == 4 || iZzg == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a2, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01de, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x022c, code lost:
    
        if (zzn(r1) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0247, code lost:
    
        if (r3 == 0) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzico.zzg():int");
    }

    public final String zzh() throws IOException {
        String strZzo;
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 14) {
            strZzo = zzp();
        } else if (iZzg == 12) {
            strZzo = zzo('\'');
        } else {
            if (iZzg != 13) {
                throw zzw("a name");
            }
            strZzo = zzo('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = strZzo;
        return strZzo;
    }

    public final String zzi() throws IOException {
        String string;
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 10) {
            string = zzp();
        } else if (iZzg == 8) {
            string = zzo('\'');
        } else if (iZzg == 9) {
            string = zzo('\"');
        } else if (iZzg == 11) {
            string = null;
        } else if (iZzg == 15) {
            string = Long.toString(this.zzi);
        } else {
            if (iZzg != 16) {
                throw zzw("a string");
            }
            String str = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            string = str;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i5 = this.zzl - 1;
        iArr[i5] = iArr[i5] + 1;
        return string;
    }

    public final boolean zzj() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i5 = this.zzl - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (iZzg != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i10 = this.zzl - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public final void zzk() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 7) {
            throw zzw("null");
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i5 = this.zzl - 1;
        iArr[i5] = iArr[i5] + 1;
    }

    public final String zzl() {
        int i5 = this.zzg + 1;
        int i10 = this.zze - this.zzh;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < this.zzl; i11++) {
            int i12 = this.zzk[i11];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.zzn[i11];
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.zzm[i11];
                    if (str != null) {
                        sb2.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(N0.a.d(i12, "Unknown scope value: ", new StringBuilder(String.valueOf(i12).length() + 21)));
            }
        }
        int i14 = i10 + 1;
        String string = sb2.toString();
        int length = String.valueOf(i5).length();
        int length2 = String.valueOf(i14).length();
        StringBuilder sb3 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        N0.a.l(i5, i14, " at line ", " column ", sb3);
        return wg.b.c(sb3, " path ", string);
    }

    public final int zzm() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        switch (iZzg) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
