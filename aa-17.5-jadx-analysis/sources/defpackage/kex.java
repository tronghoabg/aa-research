package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class kex {
    public final Object a;
    public final Object b;
    public final Object c;

    public kex(Context context) {
        Drawable[][] drawableArr = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 3);
        this.a = drawableArr;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRowBackgroundSimple, R.attr.templateRowBackgroundSimple, R.attr.templateRowBackgroundTop, R.attr.templateRowBackgroundMiddle, R.attr.templateRowBackgroundBottom, R.attr.templateRowBackgroundTopBottom, R.attr.templateRowBackgroundTopLeft, R.attr.templateRowBackgroundMiddle, R.attr.templateRowBackgroundBottomLeft, R.attr.templateRowBackgroundTopBottomLeft, R.attr.templateRowBackgroundTopRight, R.attr.templateRowBackgroundMiddle, R.attr.templateRowBackgroundBottomRight, R.attr.templateRowBackgroundTopBottomRight});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        drawable.getClass();
        this.c = drawable;
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(1);
        drawable2.getClass();
        this.b = drawable2;
        Drawable[] drawableArr2 = drawableArr[0];
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(2);
        drawable3.getClass();
        drawableArr2[2] = drawable3;
        Drawable[] drawableArr3 = drawableArr[1];
        Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(3);
        drawable4.getClass();
        drawableArr3[2] = drawable4;
        Drawable[] drawableArr4 = drawableArr[2];
        Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(4);
        drawable5.getClass();
        drawableArr4[2] = drawable5;
        Drawable[] drawableArr5 = drawableArr[3];
        Drawable drawable6 = typedArrayObtainStyledAttributes.getDrawable(5);
        drawable6.getClass();
        drawableArr5[2] = drawable6;
        Drawable[] drawableArr6 = drawableArr[0];
        Drawable drawable7 = typedArrayObtainStyledAttributes.getDrawable(6);
        drawable7.getClass();
        drawableArr6[0] = drawable7;
        Drawable[] drawableArr7 = drawableArr[1];
        Drawable drawable8 = typedArrayObtainStyledAttributes.getDrawable(7);
        drawable8.getClass();
        drawableArr7[0] = drawable8;
        Drawable[] drawableArr8 = drawableArr[2];
        Drawable drawable9 = typedArrayObtainStyledAttributes.getDrawable(8);
        drawable9.getClass();
        drawableArr8[0] = drawable9;
        Drawable[] drawableArr9 = drawableArr[3];
        Drawable drawable10 = typedArrayObtainStyledAttributes.getDrawable(9);
        drawable10.getClass();
        drawableArr9[0] = drawable10;
        Drawable[] drawableArr10 = drawableArr[0];
        Drawable drawable11 = typedArrayObtainStyledAttributes.getDrawable(10);
        drawable11.getClass();
        drawableArr10[1] = drawable11;
        Drawable[] drawableArr11 = drawableArr[1];
        Drawable drawable12 = typedArrayObtainStyledAttributes.getDrawable(11);
        drawable12.getClass();
        drawableArr11[1] = drawable12;
        Drawable[] drawableArr12 = drawableArr[2];
        Drawable drawable13 = typedArrayObtainStyledAttributes.getDrawable(12);
        drawable13.getClass();
        drawableArr12[1] = drawable13;
        Drawable[] drawableArr13 = drawableArr[3];
        Drawable drawable14 = typedArrayObtainStyledAttributes.getDrawable(13);
        drawable14.getClass();
        drawableArr13[1] = drawable14;
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final Locale i() {
        Locale locale = Locale.getDefault();
        locale.getClass();
        return locale;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable a(boolean r4, boolean r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r4 == 0) goto La
            if (r5 == 0) goto L9
            r4 = 3
            goto L13
        L9:
            r5 = r2
        La:
            if (r4 == 0) goto Le
            r4 = r2
            goto L13
        Le:
            if (r5 == 0) goto L12
            r4 = r0
            goto L13
        L12:
            r4 = r1
        L13:
            if (r6 == 0) goto L19
            if (r7 == 0) goto L18
            goto L20
        L18:
            r7 = r2
        L19:
            if (r6 == 0) goto L1d
            r0 = r2
            goto L20
        L1d:
            if (r7 == 0) goto L29
            r0 = r1
        L20:
            java.lang.Object r3 = r3.a
            android.graphics.drawable.Drawable[][] r3 = (android.graphics.drawable.Drawable[][]) r3
            r3 = r3[r4]
            r3 = r3[r0]
            return r3
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Horizontal middle background not supported"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kex.a(boolean, boolean, boolean, boolean):android.graphics.drawable.Drawable");
    }

    public final Drawable b(boolean z) {
        return (Drawable) (z ? this.b : this.c);
    }

    public final boolean c(Class cls, Class cls2) {
        return ((Class) this.c).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void d(lvg lvgVar) {
        if (lvgVar == null) {
            return;
        }
        lyl lylVarA = lyl.a.a();
        Long l = (Long) lylVarA.d.get(this.c);
        if (l == null || l.longValue() != lvgVar.e) {
            return;
        }
        this.a.run();
    }

    public final void e() {
        lnm.m().i((ajmd) this.b);
    }

    public final void f() {
        lnm.m().j((ajmd) this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final zgp g() {
        return zfb.f(this.a, new rgf(new oin(18), 6), this.c);
    }

    public final Locale h() {
        return vja.s((Context) this.b);
    }

    public final synchronized void j(long j, zqr zqrVar) {
        try {
            try {
                url urlVar = (url) ((ConcurrentHashMap) this.a).remove(Long.valueOf(j));
                urlVar.getClass();
                urlVar.b().execute(new rdz(this, urlVar, zqrVar, 20, (char[]) null));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Object k() {
        abcs abcsVar = (abcs) ((abnp) this.a).q();
        scz sczVar = (scz) this.b;
        Object obj = sczVar.b ? sczVar.d : null;
        urg urgVar = (urg) this.c;
        return new urh(abcsVar, (Ctry) urgVar.b, (urv) obj, (rjr) ((rjg) urgVar.a).b);
    }

    public final abnr l(trm trmVar) {
        uxc uxcVarE = ((scz) this.b).e(trmVar);
        abnr abnrVar = (abnr) abcn.a.n();
        abnrVar.t();
        abcn abcnVar = (abcn) abnrVar.b;
        abcnVar.b |= 2;
        abcnVar.d = uxcVarE.a;
        return abnrVar;
    }

    public kex(abnr abnrVar, scz sczVar, urg urgVar) {
        this.a = abnrVar;
        this.b = sczVar;
        this.c = urgVar;
    }

    public kex(IconCompat iconCompat, String str, afdr afdrVar) {
        this.c = iconCompat;
        this.b = str;
        this.a = afdrVar;
    }

    public kex(Class cls, Class cls2, huo huoVar) {
        this.c = cls;
        this.a = cls2;
        this.b = huoVar;
    }

    public kex(String str, lla llaVar, List list) {
        this.a = str;
        this.b = llaVar;
        this.c = list;
    }

    public kex(lwb lwbVar, Runnable runnable) {
        this.c = lwbVar;
        this.a = runnable;
        this.b = new ajmd(this, null);
    }

    public kex(byte[] bArr) {
        this.c = "f";
        this.a = "g";
        this.b = "h";
    }

    public kex(byte[] bArr, byte[] bArr2) {
        this.a = "e";
        this.c = "f";
        this.b = "g";
    }

    public kex(char[] cArr) {
        this.a = "s";
        this.c = "t";
        this.b = "u";
    }

    public kex(aezk aezkVar) {
        this.a = new ConcurrentHashMap();
        this.b = wub.L(new uai(aezkVar, 19));
        this.c = wub.L(new uai(aezkVar, 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kzt] */
    public kex(Context context, kqt kqtVar, IconCompat iconCompat) {
        this.b = iconCompat;
        yfq yfqVar = kqtVar.b;
        yfqVar.getClass();
        ArrayList arrayList = new ArrayList();
        ynp ynpVarListIterator = yfqVar.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            kqz kqzVar = (kqz) ynpVarListIterator.next();
            kqzVar.getClass();
            String str = kqtVar.a;
            str.getClass();
            byte[] kztVar = null;
            if (!afyh.v(kqzVar.a) && kqzVar.c != null && kqzVar.d != null) {
                kztVar = new kzt(kqzVar.a, (IconCompat) this.b, lxt.a(kqzVar, str, null), new kku(context, kqzVar, 14, kztVar), null);
            }
            if (kztVar != null) {
                arrayList.add(kztVar);
            }
        }
        afco afcoVar = tby.a;
        this.a = new eqm(arrayList);
        String str2 = kqtVar.a;
        str2.getClass();
        this.c = str2;
    }

    public kex(Context context, byte[] bArr) {
        context.getClass();
        this.b = context;
        htm htmVar = new htm((xyc) new vdv(this, 1));
        uzf uzfVar = new uzf(htmVar);
        char[] cArr = null;
        ((uzz) htmVar.a).k(new uze((Object) htmVar, (Object) this, (Object) uzfVar, 1, cArr));
        ((uzz) htmVar.a).l(new uze((Object) htmVar, (Object) this, (Object) uzfVar, 0, cArr));
        this.c = htmVar;
        this.a = htmVar.a;
    }

    public kex(jst jstVar, jtf jtfVar) {
        this.c = jstVar;
        this.a = jtfVar;
        sw swVar = new sw();
        swVar.e("unused");
        swVar.d(new gec(this, 6));
        this.b = swVar.a();
    }

    public kex() {
        this.c = "e";
        this.b = "f";
        this.a = "g";
    }

    public kex(Context context, zgs zgsVar) {
        context.getClass();
        this.b = context;
        this.c = zgsVar;
        zgp zgpVarSubmit = zgsVar.submit(new flt(this, 18));
        zgpVarSubmit.getClass();
        this.a = zgpVarSubmit;
    }

    public kex(ScheduledExecutorService scheduledExecutorService, jty jtyVar) {
        this.c = new Handler(Looper.getMainLooper());
        this.a = scheduledExecutorService;
        this.b = jtyVar;
    }
}
