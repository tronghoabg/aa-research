package io.flutter.view;

import A.AbstractC0213f;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public String f37224A;

    /* renamed from: D, reason: collision with root package name */
    public int f37227D;

    /* renamed from: E, reason: collision with root package name */
    public int f37228E;

    /* renamed from: F, reason: collision with root package name */
    public int f37229F;

    /* renamed from: G, reason: collision with root package name */
    public int f37230G;

    /* renamed from: H, reason: collision with root package name */
    public float f37231H;

    /* renamed from: I, reason: collision with root package name */
    public String f37232I;

    /* renamed from: J, reason: collision with root package name */
    public String f37233J;

    /* renamed from: K, reason: collision with root package name */
    public float f37234K;
    public float L;

    /* renamed from: M, reason: collision with root package name */
    public float f37235M;

    /* renamed from: N, reason: collision with root package name */
    public float f37236N;

    /* renamed from: O, reason: collision with root package name */
    public float[] f37237O;

    /* renamed from: P, reason: collision with root package name */
    public h f37238P;

    /* renamed from: S, reason: collision with root package name */
    public ArrayList f37241S;

    /* renamed from: T, reason: collision with root package name */
    public f f37242T;

    /* renamed from: U, reason: collision with root package name */
    public f f37243U;

    /* renamed from: W, reason: collision with root package name */
    public float[] f37245W;

    /* renamed from: Y, reason: collision with root package name */
    public float[] f37247Y;

    /* renamed from: Z, reason: collision with root package name */
    public Rect f37248Z;

    /* renamed from: a, reason: collision with root package name */
    public final l f37249a;

    /* renamed from: c, reason: collision with root package name */
    public int f37251c;

    /* renamed from: d, reason: collision with root package name */
    public int f37252d;

    /* renamed from: e, reason: collision with root package name */
    public int f37253e;

    /* renamed from: f, reason: collision with root package name */
    public int f37254f;

    /* renamed from: g, reason: collision with root package name */
    public int f37255g;

    /* renamed from: h, reason: collision with root package name */
    public int f37256h;

    /* renamed from: i, reason: collision with root package name */
    public int f37257i;

    /* renamed from: j, reason: collision with root package name */
    public int f37258j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public float f37259l;

    /* renamed from: m, reason: collision with root package name */
    public float f37260m;

    /* renamed from: n, reason: collision with root package name */
    public float f37261n;

    /* renamed from: o, reason: collision with root package name */
    public String f37262o;

    /* renamed from: p, reason: collision with root package name */
    public String f37263p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f37264q;

    /* renamed from: r, reason: collision with root package name */
    public String f37265r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f37266s;

    /* renamed from: t, reason: collision with root package name */
    public String f37267t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f37268u;

    /* renamed from: v, reason: collision with root package name */
    public String f37269v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f37270w;

    /* renamed from: x, reason: collision with root package name */
    public String f37271x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f37272y;

    /* renamed from: z, reason: collision with root package name */
    public String f37273z;

    /* renamed from: b, reason: collision with root package name */
    public int f37250b = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f37225B = -1;

    /* renamed from: C, reason: collision with root package name */
    public boolean f37226C = false;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f37239Q = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f37240R = new ArrayList();

    /* renamed from: V, reason: collision with root package name */
    public boolean f37244V = true;

    /* renamed from: X, reason: collision with root package name */
    public boolean f37246X = true;

    public h(l lVar) {
        this.f37249a = lVar;
    }

    public static boolean a(h hVar, e eVar) {
        return (hVar.f37252d & eVar.f37217a) != 0;
    }

    public static CharSequence b(h hVar) {
        CharSequence[] charSequenceArr = {d(hVar.f37265r, hVar.f37266s), hVar.e(), d(hVar.f37271x, hVar.f37272y)};
        CharSequence charSequenceConcat = null;
        for (int i5 = 0; i5 < 3; i5++) {
            CharSequence charSequence = charSequenceArr[i5];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static SpannableString d(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                int iF = AbstractC0213f.f(jVar.f37276c);
                if (iF == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f37274a, jVar.f37275b, 0);
                } else if (iF == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((g) jVar).f37223d)), jVar.f37274a, jVar.f37275b, 0);
                } else if (iF == 2) {
                    spannableString.setSpan(new URLSpan(((k) jVar).f37277d), jVar.f37274a, jVar.f37275b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList g(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i5 = byteBuffer.getInt();
        if (i5 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = byteBuffer.getInt();
            int i12 = byteBuffer.getInt();
            int i13 = AbstractC0213f.g(3)[byteBuffer.getInt()];
            int iF = AbstractC0213f.f(i13);
            if (iF == 0) {
                byteBuffer.getInt();
                i iVar = new i();
                iVar.f37274a = i11;
                iVar.f37275b = i12;
                iVar.f37276c = i13;
                arrayList.add(iVar);
            } else if (iF == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                g gVar = new g();
                gVar.f37274a = i11;
                gVar.f37275b = i12;
                gVar.f37276c = i13;
                gVar.f37223d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f10 = fArr[3];
        fArr[0] = fArr[0] / f10;
        fArr[1] = fArr[1] / f10;
        fArr[2] = fArr[2] / f10;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f37239Q.iterator();
        while (it.hasNext()) {
            ((h) it.next()).c(arrayList);
        }
    }

    public final SpannableString e() {
        ArrayList arrayList = this.f37264q;
        String str = this.f37224A;
        if (str != null && str.length() > 0) {
            arrayList = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
            k kVar = new k();
            kVar.f37274a = 0;
            kVar.f37275b = this.f37263p.length();
            kVar.f37277d = this.f37224A;
            kVar.f37276c = 3;
            arrayList.add(kVar);
        }
        return d(this.f37263p, arrayList);
    }

    public final String f() {
        String str;
        if (h(13) && (str = this.f37263p) != null && !str.isEmpty()) {
            return this.f37263p;
        }
        Iterator it = this.f37239Q.iterator();
        while (it.hasNext()) {
            String strF = ((h) it.next()).f();
            if (strF != null && !strF.isEmpty()) {
                return strF;
            }
        }
        return null;
    }

    public final boolean h(int i5) {
        return (com.google.android.gms.internal.consent_sdk.a.l(i5) & this.f37251c) != 0;
    }

    public final h i(float[] fArr, boolean z2) {
        float f10 = fArr[3];
        boolean z10 = false;
        float f11 = fArr[0] / f10;
        float f12 = fArr[1] / f10;
        if (f11 < this.f37234K || f11 >= this.f37235M || f12 < this.L || f12 >= this.f37236N) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f37240R.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!hVar.h(14)) {
                if (hVar.f37244V) {
                    hVar.f37244V = false;
                    if (hVar.f37245W == null) {
                        hVar.f37245W = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f37245W, 0, hVar.f37237O, 0)) {
                        Arrays.fill(hVar.f37245W, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f37245W, 0, fArr3, 0);
                h hVarI = hVar.i(fArr2, z2);
                if (hVarI != null) {
                    return hVarI;
                }
                fArr = fArr3;
            }
        }
        if (z2 && this.f37257i != -1) {
            z10 = true;
        }
        if (j() || z10) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        if (h(12)) {
            return false;
        }
        if (h(22)) {
            return true;
        }
        int i5 = this.f37252d;
        int i10 = l.f37278z;
        if ((i5 & (-61)) != 0 || (this.f37251c & 10682871) != 0) {
            return true;
        }
        String str = this.f37263p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f37265r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f37271x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f37246X) {
            z2 = true;
        }
        if (z2) {
            if (this.f37247Y == null) {
                this.f37247Y = new float[16];
            }
            if (this.f37237O == null) {
                this.f37237O = new float[16];
            }
            Matrix.multiplyMM(this.f37247Y, 0, fArr, 0, this.f37237O, 0);
            float[] fArr2 = {this.f37234K, this.L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f37247Y, fArr2);
            fArr2[0] = this.f37235M;
            fArr2[1] = this.L;
            k(fArr4, this.f37247Y, fArr2);
            fArr2[0] = this.f37235M;
            fArr2[1] = this.f37236N;
            k(fArr5, this.f37247Y, fArr2);
            fArr2[0] = this.f37234K;
            fArr2[1] = this.f37236N;
            k(fArr6, this.f37247Y, fArr2);
            if (this.f37248Z == null) {
                this.f37248Z = new Rect();
            }
            this.f37248Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f37246X = false;
        }
        Iterator it = this.f37239Q.iterator();
        int i5 = -1;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            hVar.f37225B = i5;
            i5 = hVar.f37250b;
            hVar.l(this.f37247Y, hashSet, z2);
        }
    }
}
