package Va;

import android.os.Process;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class O extends Ba {

    /* renamed from: h, reason: collision with root package name */
    public static int f13556h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f13557i = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13558c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13559d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13560e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13561f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13562g;

    public /* synthetic */ O(int i5) {
        this.f13558c = i5;
    }

    public static String b(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 43440)) ^ ((c11 >>> 5) + 51874)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 57730) ^ ((c12 + i11) ^ ((c12 << 4) + 7173))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String d(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-4325221177743454277L));
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.Ba
    public void a(Throwable th) {
        switch (this.f13558c) {
            case 0:
                f13557i = (f13556h + 41) % 128;
                C1051la c1051laA = V.A((V) this.f13562g);
                String str = (String) this.f13560e;
                if (c1051laA != null) {
                    Cb.g(new Da(c1051laA, str, EnumC0911b0.f14016f, 6));
                }
                String strIntern = b(16 - TextUtils.getCapsMode("", 0, 0), "矧퉋꛳瞮\ue077忪鈓繩푒三\ueed6쿛妼濫器\u07b9").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d("쿾\ue260钛䜯祭⯖\ude24\uf04aꊚ唾݈㦙\uec3b鹇냿挵ᕅ쟥啕걓廠焈⍓헱蠀멎泾Ἒ\u31e7", 11689 - (Process.myTid() >> 22)).intern());
                sb2.append(str);
                Ab.p(strIntern, sb2.toString(), th, true, true, true);
                int i5 = f13556h + 69;
                f13557i = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            default:
                super.a(th);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02b4  */
    @Override // Va.Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.O.c():void");
    }

    public O(V v2, B7 b72, String str, String str2) {
        this.f13558c = 0;
        this.f13562g = v2;
        this.f13559d = b72;
        this.f13560e = str;
        this.f13561f = str2;
    }
}
