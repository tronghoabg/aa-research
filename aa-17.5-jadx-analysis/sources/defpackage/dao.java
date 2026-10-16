package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.TypedValue;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dao {
    public static final void a(View view, int i, boolean z) {
        view.setFocusable(1);
        view.setDefaultFocusHighlightEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    public static final cmw b(int i, bux buxVar, int i2) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) buxVar.f(daa.b);
        Resources resources = (Resources) buxVar.f(daa.c);
        lds ldsVar = (lds) buxVar.f(daa.e);
        synchronized (ldsVar) {
            Object obj = ldsVar.a;
            typedValue = (TypedValue) ((zh) obj).a(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                ((zh) obj).h(i, typedValue);
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && afyh.C(charSequence, ".xml")) {
            buxVar.v(-1771798434);
            Resources.Theme theme = context.getTheme();
            int i3 = typedValue.changingConfigurations;
            kwp kwpVar = (kwp) buxVar.f(daa.d);
            dcu dcuVar = new dcu(theme, i);
            ?? r2 = kwpVar.a;
            WeakReference weakReference = (WeakReference) ((HashMap) r2).get(dcuVar);
            dct dctVarF = weakReference != null ? (dct) weakReference.get() : null;
            if (dctVarF == null) {
                XmlResourceParser xml = resources.getXml(i);
                a.an(xml);
                if (!affa.f(xml.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                dctVarF = dap.f(theme, resources, xml, i3);
                r2.put(dcuVar, new WeakReference(dctVarF));
            }
            con conVarD = czz.D(dctVarF.a, buxVar);
            buxVar.o();
            return conVarD;
        }
        buxVar.v(-1771643000);
        Object theme2 = context.getTheme();
        boolean zC = buxVar.C(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !buxVar.A(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zC2 = zC | z | buxVar.C(theme2);
        Object objG = buxVar.g();
        if (zC2 || objG == buw.a) {
            try {
                objG = vh.e(resources, i);
                buxVar.x(objG);
            } catch (Exception e) {
                Objects.toString(charSequence);
                throw new dcv("Error attempting to load resource: ".concat(String.valueOf(charSequence)), e);
            }
        }
        cmu cmuVar = new cmu((cjj) objG);
        buxVar.o();
        return cmuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final bxn c(View view) {
        afco afcoVar;
        bwz bwzVar;
        aan aanVar = dco.a;
        afcp afcpVar = afcp.a;
        aezr aezrVar = dag.a;
        if (a.Z()) {
            afcoVar = (afco) dag.a.a();
        } else {
            afcoVar = (afco) dag.b.get();
            if (afcoVar == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        afco afcoVarPlus = afcoVar.plus(afcpVar);
        bwj bwjVar = (bwj) afcoVarPlus.get(bwj.b);
        if (bwjVar != null) {
            bwz bwzVar2 = new bwz(bwjVar);
            bwzVar2.b();
            bwzVar = bwzVar2;
        } else {
            bwzVar = 0;
        }
        affv affvVar = new affv();
        afco dbtVar = (cga) afcoVarPlus.get(cga.a);
        if (dbtVar == null) {
            dbtVar = new dbt(view.getContext().getApplicationContext());
            affvVar.a = dbtVar;
        }
        if (bwzVar != 0) {
            afcpVar = bwzVar;
        }
        afco afcoVarPlus2 = afcoVarPlus.plus(afcpVar).plus(dbtVar);
        bxn bxnVar = new bxn(afcoVarPlus2);
        bxnVar.D();
        aitx aitxVarB = ahni.b(afcoVarPlus2);
        eqa eqaVarD = ecw.d(view);
        ept lifecycle = eqaVarD != null ? eqaVarD.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new dcj(view, bxnVar, 0));
            lifecycle.c(new dcl(aitxVarB, bwzVar, bxnVar, affvVar));
            return bxnVar;
        }
        Objects.toString(view);
        crt.a("ViewTreeLifecycleOwner not found from ".concat(String.valueOf(view)));
        throw new aezp();
    }

    public static final boolean d(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final Rect e(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    o(textPaint2, charSequence, i, iNextSpanTransition, rect2);
                    rect.right += rect2.width();
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        o(textPaint, charSequence, i, i2, rect3);
        return rect3;
    }

    public static final int f(Layout layout, int i) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        return ((lineStart == i || layout.getLineEnd(lineForOffset) == i) && lineStart == i) ? lineForOffset - 1 : lineForOffset;
    }

    public static final dfw g(dfw dfwVar, dlr dlrVar) {
        int i;
        int i2;
        dfm dfmVar = dfwVar.b;
        dkx dkxVar = dfmVar.a;
        long j = dfn.a;
        dkx dkxVarD = dkxVar.d(new dba(5));
        long j2 = dfmVar.b;
        dlu[] dluVarArr = dlt.a;
        if ((j2 & 1095216660480L) == 0) {
            j2 = dfn.a;
        }
        die dieVar = dfmVar.c;
        if (dieVar == null) {
            dieVar = die.k;
        }
        die dieVar2 = dieVar;
        dhx dhxVar = dfmVar.d;
        dhx dhxVar2 = new dhx(dhxVar != null ? dhxVar.a : 0);
        dhy dhyVar = dfmVar.e;
        dhy dhyVar2 = new dhy(dhyVar != null ? dhyVar.a : 65535);
        dhs dhsVar = dfmVar.f;
        if (dhsVar == null) {
            dhsVar = dhs.e;
        }
        dhs dhsVar2 = dhsVar;
        String str = dfmVar.g;
        long j3 = dfmVar.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = dfn.b;
        }
        long j4 = j3;
        dkm dkmVar = dfmVar.i;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = dkmVar != null ? dkmVar.a : 0.0f;
        if (true != Float.isNaN(f2)) {
            f = f2;
        }
        dkm dkmVar2 = new dkm(f);
        dky dkyVar = dfmVar.j;
        if (dkyVar == null) {
            dkyVar = dky.a;
        }
        dky dkyVar2 = dkyVar;
        dkd dkdVarA = dfmVar.k;
        if (dkdVarA == null) {
            dkd dkdVar = dkd.a;
            dkdVarA = dke.a.a();
        }
        dkd dkdVar2 = dkdVarA;
        long j5 = dfmVar.l;
        if (j5 == 16) {
            j5 = dfn.c;
        }
        long j6 = j5;
        dku dkuVar = dfmVar.m;
        if (dkuVar == null) {
            dkuVar = dku.a;
        }
        dku dkuVar2 = dkuVar;
        cku ckuVar = dfmVar.n;
        if (ckuVar == null) {
            ckuVar = cku.a;
        }
        cku ckuVar2 = ckuVar;
        czz czzVar = dfmVar.p;
        if (czzVar == null) {
            czzVar = cmf.a;
        }
        czz czzVar2 = czzVar;
        if (str == null) {
            str = "";
        }
        dfm dfmVar2 = new dfm(dkxVarD, j2, dieVar2, dhxVar2, dhyVar2, dhsVar2, str, j4, dkmVar2, dkyVar2, dkdVar2, j6, dkuVar2, ckuVar2, czzVar2);
        dfg dfgVar = dfwVar.c;
        int i3 = dfgVar.a;
        int i4 = i3 == 0 ? 5 : i3;
        int i5 = dfgVar.b;
        long j7 = dfh.a;
        if (i5 == 3) {
            int iOrdinal = dlrVar.ordinal();
            if (iOrdinal == 0) {
                i2 = 4;
                i = i2;
            } else {
                if (iOrdinal != 1) {
                    throw new aezs();
                }
                i = 5;
            }
        } else if (i5 == 0) {
            int iOrdinal2 = dlrVar.ordinal();
            if (iOrdinal2 == 0) {
                i = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new aezs();
                }
                i2 = 2;
                i = i2;
            }
        } else {
            i = i5;
        }
        long j8 = dfgVar.c;
        if ((j8 & 1095216660480L) == 0) {
            j8 = dfh.a;
        }
        long j9 = j8;
        dkz dkzVar = dfgVar.d;
        if (dkzVar == null) {
            dkzVar = dkz.a;
        }
        dkz dkzVar2 = dkzVar;
        dfj dfjVar = dfgVar.e;
        dks dksVar = dfgVar.f;
        int i6 = dfgVar.g;
        if (i6 == 0) {
            i6 = 66305;
        }
        int i7 = i6;
        dla dlaVar = dfgVar.i;
        if (dlaVar == null) {
            dlaVar = dla.a;
        }
        return new dfw(dfmVar2, new dfg(i4, i, j9, dkzVar2, dfjVar, dksVar, i7, 1, dlaVar), dfwVar.d);
    }

    public static final Typeface h(String str, die dieVar, int i) {
        if (i == 0) {
            if (affa.f(dieVar, die.k) && (str == null || str.length() == 0)) {
                return Typeface.DEFAULT;
            }
            i = 0;
        }
        if (i == 0 && affa.f(dieVar, die.n) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), dieVar.o, 1 == i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r0 != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(int r4, java.lang.Object r5, defpackage.dhr r6, defpackage.die r7, int r8) {
        /*
            boolean r0 = r5 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            goto L3d
        L5:
            r0 = r4 & 1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            die r0 = r6.c()
            boolean r0 = defpackage.affa.f(r0, r7)
            if (r0 != 0) goto L29
            die r0 = defpackage.die.f
            int r3 = r7.compareTo(r0)
            if (r3 < 0) goto L29
            die r3 = r6.c()
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            r4 = r4 & 2
            if (r4 == 0) goto L37
            int r4 = r6.b()
            if (r8 != r4) goto L35
            goto L37
        L35:
            r4 = r1
            goto L38
        L37:
            r4 = r2
        L38:
            if (r4 != 0) goto L3e
            if (r0 == 0) goto L3d
            goto L47
        L3d:
            return r5
        L3e:
            if (r0 != 0) goto L47
            die r7 = r6.c()
            int r7 = r7.o
            goto L49
        L47:
            int r7 = r7.o
        L49:
            if (r4 == 0) goto L4e
            if (r8 != r1) goto L55
            goto L56
        L4e:
            int r4 = r6.b()
            if (r4 != r1) goto L55
            goto L56
        L55:
            r1 = r2
        L56:
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            android.graphics.Typeface r4 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r5, r7, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dao.i(int, java.lang.Object, dhr, die, int):java.lang.Object");
    }

    public static /* synthetic */ dhr j(int i) {
        return new dii(i, die.k, 0, new dic(new dhz[0]));
    }

    public static final dhs k(dhr... dhrVarArr) {
        List listAsList = Arrays.asList(dhrVarArr);
        listAsList.getClass();
        return new dhv(listAsList);
    }

    public static /* synthetic */ dhr l(String str, die dieVar, int i) {
        return new dhq(str, dieVar, i, new dic(new dhz[0]));
    }

    public static final wci m(Context context) {
        return new wci(new lds(context), new dhh(Build.VERSION.SDK_INT >= 31 ? dif.a.a(context) : 0), dhu.a, new dhw(dhu.b, afcp.a));
    }

    public static /* synthetic */ bym n(wci wciVar, dhs dhsVar, die dieVar, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            dieVar = die.k;
        }
        int i4 = i & ((i3 & 4) != 0 ? 0 : 1);
        if ((i3 & 8) != 0) {
            i2 = 65535;
        }
        if (1 == (i3 & 1)) {
            dhsVar = null;
        }
        return wciVar.f(dhsVar, dieVar, i4, i2);
    }

    private static final void o(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(charSequence, i, i2, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
        }
    }
}
