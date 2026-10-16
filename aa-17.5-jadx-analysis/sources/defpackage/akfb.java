package defpackage;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
final class akfb implements akfn, akfl {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public akfb(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    private static final int e(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int iMin = Math.min(charSequence.length() - i, i2); iMin > 0; iMin--) {
            char cCharAt = charSequence.charAt(i + i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // defpackage.akfl
    public final int a() {
        return b();
    }

    @Override // defpackage.akfn
    public final int b() {
        int i = true != this.c ? 6 : 7;
        String str = this.a;
        return (str == null || str.length() <= i) ? i : str.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    @Override // defpackage.akfl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.akfh r11, java.lang.CharSequence r12, int r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfb.c(akfh, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        int i2;
        int i3;
        if (akclVar == null) {
            return;
        }
        boolean z = false;
        if (i == 0) {
            String str = this.a;
            if (str != null) {
                appendable.append(str);
                return;
            }
            i = 0;
        }
        if (i >= 0) {
            appendable.append('+');
        } else {
            appendable.append('-');
            i = -i;
        }
        int i4 = i / 3600000;
        akfj.b(appendable, i4, 2);
        int i5 = i - (i4 * 3600000);
        if (i5 == 0) {
            i5 = 0;
        }
        boolean z2 = this.c;
        if (z2) {
            appendable.append(':');
        }
        int i6 = i5 / 60000;
        akfj.b(appendable, i6, 2);
        int i7 = this.d;
        if (i7 == 2 || (i2 = i5 - (i6 * 60000)) == 0) {
            return;
        }
        int i8 = i2 / 1000;
        if (z2) {
            appendable.append(':');
            z = true;
        }
        akfj.b(appendable, i8, 2);
        if (i7 == 3 || (i3 = i2 - (i8 * 1000)) == 0) {
            return;
        }
        if (z) {
            appendable.append('.');
        }
        akfj.b(appendable, i3, 3);
    }
}
