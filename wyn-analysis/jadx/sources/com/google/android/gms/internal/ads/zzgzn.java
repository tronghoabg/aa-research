package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
class zzgzn extends zzgzo {
    private volatile zzgzo zza;
    final zzgzj zzb;
    final Character zzc;

    public zzgzn(zzgzj zzgzjVar, Character ch) {
        this.zzb = zzgzjVar;
        boolean z2 = true;
        if (ch != null && zzgzjVar.zze('=')) {
            z2 = false;
        }
        zzgtr.zzf(z2, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgzn) {
            zzgzn zzgznVar = (zzgzn) obj;
            if (this.zzb.equals(zzgznVar.zzb) && Objects.equals(this.zzc, zzgznVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzgzj zzgzjVar = this.zzb;
        sb2.append(zzgzjVar);
        if (8 % zzgzjVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public void zza(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException {
        int i11 = 0;
        zzgtr.zzo(0, i10, bArr.length);
        while (i11 < i10) {
            int i12 = this.zzb.zzd;
            zze(appendable, bArr, i11, Math.min(i12, i10 - i11));
            i11 += i12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public int zzb(byte[] bArr, CharSequence charSequence) throws zzgzm {
        int i5;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgzj zzgzjVar = this.zzb;
        if (!zzgzjVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgzm(N0.a.d(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i5 = zzgzjVar.zzc;
                if (i12 >= i5) {
                    break;
                }
                jZzc <<= zzgzjVar.zzb;
                if (i10 + i12 < charSequenceZzg.length()) {
                    jZzc |= zzgzjVar.zzc(charSequenceZzg.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzgzjVar.zzd;
            int i15 = i13 * zzgzjVar.zzb;
            int i16 = (i14 - 1) * 8;
            while (i16 >= (i14 * 8) - i15) {
                bArr[i11] = (byte) ((jZzc >>> i16) & 255);
                i16 -= 8;
                i11++;
            }
            i10 += i5;
        }
        return i11;
    }

    public zzgzo zzc(zzgzj zzgzjVar, Character ch) {
        return new zzgzn(zzgzjVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public final int zzd(int i5) {
        zzgzj zzgzjVar = this.zzb;
        return zzgzjVar.zzc * zzhag.zzb(i5, zzgzjVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException {
        zzgtr.zzo(i5, i5 + i10, bArr.length);
        zzgzj zzgzjVar = this.zzb;
        int i11 = zzgzjVar.zzd;
        int i12 = 0;
        zzgtr.zza(i10 <= i11);
        long j8 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            j8 = (j8 | (bArr[i5 + i13] & ForkServer.ERROR)) << 8;
        }
        int i14 = (i10 + 1) * 8;
        int i15 = zzgzjVar.zzb;
        while (i12 < i10 * 8) {
            appendable.append(zzgzjVar.zza(zzgzjVar.zza & ((int) (j8 >>> ((i14 - i15) - i12)))));
            i12 += i15;
        }
        if (this.zzc != null) {
            while (i12 < i11 * 8) {
                appendable.append('=');
                i12 += i15;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public final int zzf(int i5) {
        return (int) (((this.zzb.zzb * i5) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public final zzgzo zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public final zzgzo zzi() {
        zzgzo zzgzoVarZzc = this.zza;
        if (zzgzoVarZzc == null) {
            zzgzj zzgzjVar = this.zzb;
            zzgzj zzgzjVarZzd = zzgzjVar.zzd();
            zzgzoVarZzc = zzgzjVarZzd == zzgzjVar ? this : zzc(zzgzjVarZzd, this.zzc);
            this.zza = zzgzoVarZzc;
        }
        return zzgzoVarZzc;
    }

    public zzgzn(String str, String str2, Character ch) {
        this(new zzgzj(str, str2.toCharArray()), ch);
    }
}
