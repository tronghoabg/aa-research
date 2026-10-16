package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.common.api.f;

/* loaded from: classes4.dex */
abstract class zbkn extends zbjz {
    final CharSequence zbb;
    int zbc = 0;
    int zbd = f.API_PRIORITY_OTHER;

    public zbkn(zbko zbkoVar, CharSequence charSequence) {
        this.zbb = charSequence;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjz
    public final /* bridge */ /* synthetic */ Object zba() {
        int iZbc;
        int i5 = this.zbc;
        while (true) {
            int i10 = this.zbc;
            if (i10 == -1) {
                zbb();
                return null;
            }
            int iZbd = zbd(i10);
            if (iZbd == -1) {
                iZbd = this.zbb.length();
                this.zbc = -1;
                iZbc = -1;
            } else {
                iZbc = zbc(iZbd);
                this.zbc = iZbc;
            }
            if (iZbc != i5) {
                if (i5 < iZbd) {
                    this.zbb.charAt(i5);
                }
                if (i5 < iZbd) {
                    this.zbb.charAt(iZbd - 1);
                }
                int i11 = this.zbd;
                if (i11 == 1) {
                    iZbd = this.zbb.length();
                    this.zbc = -1;
                    if (iZbd > i5) {
                        this.zbb.charAt(iZbd - 1);
                    }
                } else {
                    this.zbd = i11 - 1;
                }
                return this.zbb.subSequence(i5, iZbd).toString();
            }
            int i12 = iZbc + 1;
            this.zbc = i12;
            if (i12 > this.zbb.length()) {
                this.zbc = -1;
            }
        }
    }

    public abstract int zbc(int i5);

    public abstract int zbd(int i5);
}
