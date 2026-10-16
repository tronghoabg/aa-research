package com.google.android.recaptcha.internal;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
class zzhy extends zzhz {
    final zzhv zza;
    final Character zzb;

    public zzhy(zzhv zzhvVar, Character ch) {
        this.zza = zzhvVar;
        if (ch != null && zzhvVar.zzd('=')) {
            throw new IllegalArgumentException(zzha.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhy) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zza.equals(zzhyVar.zza) && Objects.equals(this.zzb, zzhyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzb);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public int zza(byte[] bArr, CharSequence charSequence) throws zzhx {
        zzhv zzhvVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzhx(AbstractC3256n.g(charSequenceZze.length(), "Invalid input length "));
        }
        int i5 = 0;
        int i10 = 0;
        while (i5 < charSequenceZze.length()) {
            long jZzb = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zzhvVar = this.zza;
                if (i11 >= zzhvVar.zzc) {
                    break;
                }
                jZzb <<= zzhvVar.zzb;
                if (i5 + i11 < charSequenceZze.length()) {
                    jZzb |= this.zza.zzb(charSequenceZze.charAt(i12 + i5));
                    i12++;
                }
                i11++;
            }
            int i13 = zzhvVar.zzd;
            int i14 = i12 * zzhvVar.zzb;
            int i15 = (i13 - 1) * 8;
            while (i15 >= (i13 * 8) - i14) {
                bArr[i10] = (byte) ((jZzb >>> i15) & 255);
                i15 -= 8;
                i10++;
            }
            i5 += this.zza.zzc;
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public void zzb(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException {
        int i11 = 0;
        zzgx.zzd(0, i10, bArr.length);
        while (i11 < i10) {
            zzf(appendable, bArr, i11, Math.min(this.zza.zzd, i10 - i11));
            i11 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final int zzc(int i5) {
        return (int) (((this.zza.zzb * i5) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final int zzd(int i5) {
        zzhv zzhvVar = this.zza;
        return zzhvVar.zzc * zzib.zza(i5, zzhvVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
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

    public final void zzf(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException {
        zzgx.zzd(i5, i5 + i10, bArr.length);
        int i11 = 0;
        zzgx.zza(i10 <= this.zza.zzd);
        long j8 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j8 = (j8 | (bArr[i5 + i12] & ForkServer.ERROR)) << 8;
        }
        int i13 = (i10 + 1) * 8;
        zzhv zzhvVar = this.zza;
        while (i11 < i10 * 8) {
            long j10 = j8 >>> ((i13 - zzhvVar.zzb) - i11);
            zzhv zzhvVar2 = this.zza;
            appendable.append(zzhvVar2.zza(((int) j10) & zzhvVar2.zza));
            i11 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i11 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i11 += this.zza.zzb;
            }
        }
    }

    public zzhy(String str, String str2, Character ch) {
        this(new zzhv(str, str2.toCharArray()), ch);
    }
}
