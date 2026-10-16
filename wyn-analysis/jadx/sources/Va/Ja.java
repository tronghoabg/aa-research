package Va;

import android.view.View;

/* loaded from: classes4.dex */
public final class Ja extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13456c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Ia f13457d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ C1052lb f13458e;

    public /* synthetic */ Ja(int i5) {
        this.f13456c = i5;
    }

    @Override // Va.Ba
    public final void c() {
        String str;
        switch (this.f13456c) {
            case 0:
                C1052lb c1052lb = this.f13458e;
                int i5 = c1052lb != null ? ((Aa) c1052lb.f14374c).f13191a : -1;
                Ia ia2 = this.f13457d;
                StringBuilder sb2 = new StringBuilder();
                int i10 = 0;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 69;
                char[] charArray = "ᙅಬ놷쁶湵쁶떻퉁嘳剻욃㜜礗氂啹⎔࢛\udbf1뇚㰫뿴괆ꛑ죚⮞\uf4f2烜\udb69\u16ff澋鬐\uecd3怃欟톫\ued51⓴톘욃㜜㐲ᶎ놷쁶➿덋鴱\ue925繍\ud88b源ꠑ뇚㰫뿴괆풊ᖝ쁵䮡鶸ꖬ\ud85d⮫喹\ud996ᐏ\uf29d듘\ue132".toCharArray();
                synchronized (Ab.f13198F) {
                    try {
                        char[] cArr = new char[charArray.length];
                        Ab.f13197E = 0;
                        char[] cArr2 = new char[2];
                        while (true) {
                            int i11 = Ab.f13197E;
                            if (i11 < charArray.length) {
                                cArr2[i10] = charArray[i11];
                                char c10 = 1;
                                cArr2[1] = charArray[i11 + 1];
                                int i12 = 58224;
                                int i13 = i10;
                                while (i13 < 16) {
                                    char c11 = cArr2[c10];
                                    char c12 = cArr2[i10];
                                    char c13 = c10;
                                    int i14 = i10;
                                    char c14 = (char) (c11 - (((c12 >>> 5) + 17131) ^ ((c12 + i12) ^ ((c12 << 4) + 643))));
                                    cArr2[c13] = c14;
                                    cArr2[i14] = (char) (c12 - (((c14 >>> 5) + 4375) ^ ((c14 + i12) ^ ((c14 << 4) + 2952))));
                                    i12 -= 40503;
                                    i13++;
                                    i10 = i14;
                                    c10 = c13;
                                }
                                int i15 = i10;
                                int i16 = Ab.f13197E;
                                cArr[i16] = cArr2[i15];
                                cArr[i16 + 1] = cArr2[c10];
                                Ab.f13197E = i16 + 2;
                                i10 = i15;
                            } else {
                                str = new String(cArr, i10, iCombineMeasuredStates);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                sb2.append(str.intern());
                sb2.append(i5);
                ia2.b(c1052lb, sb2.toString());
                return;
            default:
                this.f13457d.c(this.f13458e);
                return;
        }
    }
}
