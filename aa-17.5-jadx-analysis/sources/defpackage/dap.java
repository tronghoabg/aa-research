package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.car.app.model.Alert;
import com.google.android.libraries.handwriting.gui.UIHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class dap {
    public static final void a(View view, float[] fArr, Matrix matrix, int[] iArr) {
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        cjn.e(fArr, matrix);
    }

    public static final void b(View view) {
        view.setForceDarkAllowed(false);
    }

    public static final boolean c(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    public static final View d(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(w(view, R.id.view_tree_lifecycle_owner), w(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (e(view) == null) {
                i++;
                Object objH = ebe.h(view);
                View view4 = view2;
                view2 = view;
                view = objH instanceof View ? (View) objH : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final day e(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (day) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.dct f(android.content.res.Resources.Theme r38, android.content.res.Resources r39, android.content.res.XmlResourceParser r40, int r41) throws org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dap.f(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):dct");
    }

    public static final cng g(Resources.Theme theme, Resources resources, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        XmlResourceParser xml = resources.getXml(i);
        a.an(xml);
        return f(theme, resources, xml, typedValue.changingConfigurations).a;
    }

    public static final int h(float f) {
        return (int) Math.ceil(f);
    }

    public static final float i(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = dgj.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText(UIHandler.ContinuousWritingQueue.PLACEHOLDER);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && dgu.a[paragraphAlignment.ordinal()] == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static final float j(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = dgj.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText(UIHandler.ContinuousWritingQueue.PLACEHOLDER);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && dgu.a[paragraphAlignment.ordinal()] == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static final StaticLayout k(dgf dgfVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(dgfVar.a, 0, dgfVar.b, dgfVar.c, dgfVar.d);
        builderObtain.setTextDirection(dgfVar.e);
        builderObtain.setAlignment(dgfVar.f);
        builderObtain.setMaxLines(dgfVar.g);
        builderObtain.setEllipsize(dgfVar.h);
        builderObtain.setEllipsizedWidth(dgfVar.i);
        builderObtain.setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f);
        builderObtain.setIncludePad(false);
        builderObtain.setBreakStrategy(dgfVar.k);
        builderObtain.setHyphenationFrequency(0);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(dgfVar.j);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        if (Build.VERSION.SDK_INT >= 33) {
            builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(dgfVar.l).setLineBreakWordStyle(0).build());
        }
        if (Build.VERSION.SDK_INT >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021c A[EDGE_INSN: B:168:0x021c->B:108:0x021c BREAK  A[LOOP:3: B:91:0x01d2->B:105:0x0209], EDGE_INSN: B:169:0x021c->B:108:0x021c BREAK  A[LOOP:3: B:91:0x01d2->B:105:0x0209], EDGE_INSN: B:174:0x021c->B:108:0x021c BREAK  A[LOOP:5: B:138:0x028c->B:152:0x02c4], EDGE_INSN: B:175:0x021c->B:108:0x021c BREAK  A[LOOP:5: B:138:0x028c->B:152:0x02c4], PHI: r16 r22
  0x021c: PHI (r16v4 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v7 int), (r16v7 int), (r16v9 int) binds: [B:107:0x021a, B:132:0x026a, B:135:0x0273, B:174:0x021c, B:175:0x021c, B:168:0x021c, B:169:0x021c, B:60:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x021c: PHI (r22v3 dgc[]) = (r22v1 dgc[]), (r22v1 dgc[]), (r22v1 dgc[]), (r22v1 dgc[]), (r22v1 dgc[]), (r22v5 dgc[]), (r22v5 dgc[]), (r22v6 dgc[]) binds: [B:107:0x021a, B:132:0x026a, B:135:0x0273, B:174:0x021c, B:175:0x021c, B:168:0x021c, B:169:0x021c, B:60:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int l(defpackage.dgi r20, android.text.Layout r21, defpackage.okv r22, int r23, android.graphics.RectF r24, defpackage.dgo r25, defpackage.afeg r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dap.l(dgi, android.text.Layout, okv, int, android.graphics.RectF, dgo, afeg, boolean):int");
    }

    public static final deu m(djv djvVar) {
        return djvVar.a.e(djvVar.b);
    }

    public static final deu n(djv djvVar, int i) {
        long j = djvVar.b;
        int iC = dfv.c(j);
        int iC2 = dfv.c(j);
        int length = iC2 + i;
        if (((i ^ length) & (iC2 ^ length)) < 0) {
            length = djvVar.a().length();
        }
        return djvVar.a.subSequence(iC, Math.min(length, djvVar.a().length()));
    }

    public static final deu o(djv djvVar, int i) {
        long j = djvVar.b;
        int iD = dfv.d(j);
        int i2 = iD - i;
        if (((i ^ iD) & (iD ^ i2)) < 0) {
            i2 = 0;
        }
        return djvVar.a.subSequence(Math.max(0, i2), dfv.d(j));
    }

    public static final void p(String str, char[] cArr, int i, int i2, int i3) {
        str.getClass();
        str.getChars(i2, i3, cArr, i);
    }

    public static final void q(String str, char[] cArr, int i) {
        p(str, cArr, i, 0, str.length());
    }

    public static final long r(long j, long j2) {
        int iB;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (4294967295L & j2);
        int iD = dfv.d(j);
        int iC = dfv.c(j);
        if ((Math.min(i3, i4) < Math.max(i, i2)) && (Math.min(i, i2) < Math.max(i3, i4))) {
            if (dfv.g(j2, j)) {
                iD = dfv.d(j2);
                iC = iD;
            } else {
                if (dfv.g(j, j2)) {
                    iB = dfv.b(j2);
                } else {
                    int iMin = Math.min(i3, i4);
                    if (iD >= Math.max(i3, i4) || iMin > iD) {
                        iC = dfv.d(j2);
                    } else {
                        iD = dfv.d(j2);
                        iB = dfv.b(j2);
                    }
                }
                iC -= iB;
            }
        } else if (iC > dfv.d(j2)) {
            iD -= dfv.b(j2);
            iB = dfv.b(j2);
            iC -= iB;
        }
        return czz.t(iD, iC);
    }

    public static final boolean s(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }

    public static final boolean t(cjb cjbVar, float f, float f2) {
        if (f > cjbVar.d || cjbVar.b > f) {
            return false;
        }
        return f2 <= cjbVar.e && cjbVar.c <= f2;
    }

    public static final String u(dic dicVar, Context context) {
        float fB;
        dlf.w(context);
        int iAj = a.aj(context);
        if (iAj == 0) {
            return dlz.c(dicVar.a, null, null, null, new cyo(11), 31);
        }
        List list = dicVar.a;
        int size = list.size();
        String strConcat = "";
        boolean z = false;
        for (int i = 0; i < size; i++) {
            dhz dhzVar = (dhz) list.get(i);
            if (affa.f(dhzVar.a(), "wght")) {
                fB = afpt.d(dhzVar.b() + iAj, 1.0f, 1000.0f);
                z = true;
            } else {
                fB = dhzVar.b();
            }
            if (i != 0) {
                Objects.toString(strConcat);
                strConcat = strConcat.concat(",");
            }
            strConcat = ((Object) strConcat) + "'" + dhzVar.a() + "' " + fB;
        }
        if (z) {
            return strConcat;
        }
        float fD = afpt.d(iAj + 400.0f, 1.0f, 1000.0f);
        if (!list.isEmpty()) {
            Objects.toString(strConcat);
            strConcat = strConcat.concat(",");
        }
        return ((Object) strConcat) + "'wght' " + fD;
    }

    public static /* synthetic */ dhr v(kwp kwpVar, dio dioVar, die dieVar, int i) {
        dic dicVar = new dic(new dhz[0]);
        List list = dicVar.a;
        if (list.size() > 1) {
            int size = list.size() - 1;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                String strA = ((dhz) list.get(i2)).a();
                i2++;
                if (strA.compareTo(((dhz) list.get(i2)).a()) > 0) {
                    dhz[] dhzVarArr = (dhz[]) woy.cc(list, new azl(7)).toArray(new dhz[0]);
                    dicVar = new dic((dhz[]) Arrays.copyOf(dhzVarArr, dhzVarArr.length));
                    break;
                }
            }
        }
        return new dip((String) kwpVar.a, dioVar, dieVar, i, dicVar);
    }

    private static final int w(View view, int i) {
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        int i3 = 0;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!affa.f(tag, obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i2 = i3;
            }
            i3++;
            Object objH = ebe.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return i2;
    }

    private static final float x(int i, int i2, float[] fArr) {
        int i3 = i - i2;
        return fArr[i3 + i3 + 1];
    }

    private static final boolean y(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }
}
