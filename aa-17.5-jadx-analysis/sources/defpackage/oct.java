package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.List;
import j$.util.OptionalDouble;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class oct {
    public final Object a;

    public oct(yip yipVar) {
        ykc ykcVar;
        yipVar.f(xwt.a);
        int i = ykc.k;
        yje yjeVarC = yipVar.c();
        yje yjeVar = yje.a;
        if (yjeVarC == yjeVar && yipVar.d() == yjeVar) {
            ykcVar = new ykc(yipVar, yjh.b);
        } else {
            yje yjeVarC2 = yipVar.c();
            yje yjeVar2 = yje.b;
            if (yjeVarC2 != yjeVar2 || yipVar.d() != yjeVar) {
                woy.O(yipVar.d() != yjeVar2, "Map cannot have both weak and dummy values");
                throw new AssertionError();
            }
            ykcVar = new ykc(yipVar, yjh.d);
        }
        this.a = ykcVar;
    }

    public static oct b() {
        return (oct) mki.a.b(oct.class, new ocr(0));
    }

    public static final qw f(qn qnVar, String str) {
        return new thj(qnVar, new mep(), new mcm(str, 8));
    }

    public static final void g(qn qnVar, kqt kqtVar, yzz yzzVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzy.ar).l());
        lvl.C(new thj(qnVar, new mey(), new lyb(qnVar, kqtVar, 3, null)));
    }

    public final void A(xgq xgqVar) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xfz xfzVar = (xfz) abnpVar.b;
        xfz xfzVar2 = xfz.a;
        xfzVar.d = xgqVar;
        xfzVar.b |= 2;
    }

    public final void B(xgq xgqVar) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xfz xfzVar = (xfz) abnpVar.b;
        xfz xfzVar2 = xfz.a;
        xfzVar.e = xgqVar;
        xfzVar.b |= 4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List C() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public final void D(xdo xdoVar) {
        ((ArrayList) this.a).add(xdoVar);
    }

    public final void E(xdo xdoVar, int i) {
        ((ArrayList) this.a).set(i, xdoVar);
    }

    public final oco a(noh nohVar, ocd ocdVar) throws qrz, qsa {
        mki.a.g();
        sab sabVarU = ols.u(kio.b().e());
        sabVarU.getClass();
        Point point = (Point) kgq.c(new kiz(sabVarU, 8), "Gh.TooltipManager", yzz.TOOLTIP_MANAGER_CONTEXT, yzy.lQ, true, "Car no longer connected.", new Object[0]);
        Size size = new Size(point.x, point.y);
        Context contextC = ocdVar.c();
        FrameLayout frameLayout = new FrameLayout(contextC);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view = new View(contextC);
        CarWindowLayoutParams carWindowLayoutParams = nohVar.l;
        int i = carWindowLayoutParams.b;
        int i2 = carWindowLayoutParams.c;
        int i3 = carWindowLayoutParams.h;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2, i3);
        layoutParams.leftMargin = carWindowLayoutParams.d;
        layoutParams.topMargin = carWindowLayoutParams.e;
        layoutParams.rightMargin = carWindowLayoutParams.f;
        layoutParams.bottomMargin = carWindowLayoutParams.g;
        layoutParams.gravity = i3;
        frameLayout.addView(view, layoutParams);
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size.getHeight(), Integer.MIN_VALUE));
        frameLayout.layout(0, 0, size.getWidth(), size.getHeight());
        return new oco(nohVar, (mcd) this.a, ocdVar, size, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    public final yfq c(okz okzVar) {
        ArrayList arrayList = new ArrayList();
        EnumSet enumSetNoneOf = EnumSet.noneOf(yxo.class);
        for (oky okyVar : okzVar.b) {
            yxo yxoVarB = yxo.b(okyVar.d);
            if (yxoVarB == null) {
                yxoVarB = yxo.DETECTOR_TYPE_UNSPECIFIED;
            }
            enumSetNoneOf.add(yxoVarB);
            ?? r3 = this.a;
            yxo yxoVarB2 = yxo.b(okyVar.d);
            if (yxoVarB2 == null) {
                yxoVarB2 = yxo.DETECTOR_TYPE_UNSPECIFIED;
            }
            ojj ojjVar = (ojj) r3.get(yxoVarB2);
            if (ojjVar != null) {
                arrayList.add(new ojh(ojjVar, okyVar));
            }
        }
        ynp ynpVarListIterator = ((yfq) ((ylx) this.a).values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            ojj ojjVar2 = (ojj) ynpVarListIterator.next();
            if (!enumSetNoneOf.contains(ojjVar2.c) && (ojjVar2.d() == 2 || ojjVar2.e())) {
                arrayList.add(ojjVar2.a());
            }
        }
        List.EL.sort(arrayList, Comparator.CC.comparing(new nsb(10), new ail(19)));
        return yfq.o(arrayList);
    }

    public final mrz d(ComponentName componentName, Intent intent) {
        if (componentName == null) {
            return null;
        }
        return new mrz(GhIcon.j(componentName), new mon((Context) this.a, componentName).c(), intent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.animation.TimeInterpolator, java.lang.Object] */
    public final float e(float f) {
        return this.a.getInterpolation(f);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ovc] */
    public final void h() {
        Log.d("CSL.CarRegionController", " requestIncreaseContentArea");
        try {
            this.a.e();
        } catch (RemoteException e) {
            Log.e("CSL.CarRegionController", "Error requesting to close overlays", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ovc] */
    public final boolean i() {
        Log.d("CSL.CarRegionController", " canIncreaseContentArea");
        try {
            return this.a.f();
        } catch (RemoteException e) {
            Log.e("CSL.CarRegionController", "Error checking if overlays can be closed", e);
            return false;
        }
    }

    public final String j(Object obj) {
        String string = obj.toString();
        boolean z = false;
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    z = true;
                    break;
                }
                int iCodePointAt = string.codePointAt(iCharCount);
                if (!Character.isLetterOrDigit(iCodePointAt)) {
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        woy.S(z, "Invalid key: %s", string);
        return ((String) this.a).concat(String.valueOf(String.valueOf(obj)));
    }

    @ResultIgnorabilityUnspecified
    public final Pattern k(String str) {
        acjs acjsVar = (acjs) this.a;
        Pattern pattern = (Pattern) acjsVar.c(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        acjsVar.d(str, patternCompile);
        return patternCompile;
    }

    public final Type l(Type type) {
        type.getClass();
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            zdp zdpVar = (zdp) this.a;
            return zdpVar.a(typeVariable, new zdo(typeVariable, zdpVar));
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return zek.c(l(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new zej(m(wildcardType.getLowerBounds()), m(wildcardType.getUpperBounds()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type ownerType = parameterizedType.getOwnerType();
        Type typeL = ownerType == null ? null : l(ownerType);
        Type typeL2 = l(parameterizedType.getRawType());
        Type[] typeArrM = m(parameterizedType.getActualTypeArguments());
        Class cls = (Class) typeL2;
        if (typeL == null) {
            return new zeg(zec.c.a(cls), cls, typeArrM);
        }
        woy.S(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new zeg(typeL, cls, typeArrM);
    }

    public final Type[] m(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = l(typeArr[i]);
        }
        return typeArr2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void n(ylp ylpVar) {
        woy.S(!ylpVar.b(), "range must not be empty, but was %s", ylpVar);
        this.a.add(ylpVar);
    }

    public final /* synthetic */ xgq o() {
        abnv abnvVarQ = ((abnp) this.a).q();
        abnvVarQ.getClass();
        return (xgq) abnvVarQ;
    }

    public final void p(boolean z) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgq xgqVar = (xgq) abnpVar.b;
        xgq xgqVar2 = xgq.a;
        xgqVar.b = 3;
        xgqVar.c = Boolean.valueOf(z);
    }

    public final void q(float f) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgq xgqVar = (xgq) abnpVar.b;
        xgq xgqVar2 = xgq.a;
        xgqVar.b = 2;
        xgqVar.c = Float.valueOf(f);
    }

    public final void r(xgo xgoVar) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgq xgqVar = (xgq) abnpVar.b;
        xgq xgqVar2 = xgq.a;
        xgqVar.c = xgoVar;
        xgqVar.b = 6;
    }

    public final void s(int i) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgq xgqVar = (xgq) abnpVar.b;
        xgq xgqVar2 = xgq.a;
        xgqVar.b = 1;
        xgqVar.c = Integer.valueOf(i);
    }

    public final /* synthetic */ xgk t() {
        abnv abnvVarQ = ((abnp) this.a).q();
        abnvVarQ.getClass();
        return (xgk) abnvVarQ;
    }

    public final void u(xgm xgmVar) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgk xgkVar = (xgk) abnpVar.b;
        xgk xgkVar2 = xgk.a;
        xgkVar.c = xgmVar.a();
        xgkVar.b |= 1;
    }

    public final /* synthetic */ void v(Iterable iterable) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgk xgkVar = (xgk) abnpVar.b;
        xgk xgkVar2 = xgk.a;
        abod abodVar = xgkVar.h;
        if (!abodVar.c()) {
            xgkVar.h = abnv.G(abodVar);
        }
        abmc.i(iterable, xgkVar.h);
    }

    public final void w(int i) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgk xgkVar = (xgk) abnpVar.b;
        xgk xgkVar2 = xgk.a;
        xgkVar.e = aclh.c(i);
        xgkVar.b |= 4;
    }

    public final void x(int i) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgk xgkVar = (xgk) abnpVar.b;
        xgk xgkVar2 = xgk.a;
        xgkVar.g = aclh.f(i);
        xgkVar.b |= 8;
    }

    public final void y(int i) {
        abnp abnpVar = (abnp) this.a;
        abnpVar.t();
        xgk xgkVar = (xgk) abnpVar.b;
        xgk xgkVar2 = xgk.a;
        xgkVar.d = i - 2;
        xgkVar.b |= 2;
    }

    public final /* synthetic */ void z() {
        DesugarCollections.unmodifiableList(((xgk) ((abnp) this.a).b).h).getClass();
    }

    public oct(Object obj) {
        this.a = obj;
    }

    public oct(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public oct(byte[] bArr) {
        this.a = new thp(new thn(new lti(20)), mec.a);
    }

    public oct(byte[] bArr, char[] cArr) {
        this.a = new zdp();
    }

    public oct(char[] cArr) {
        this.a = "crashloop_startup_dirty_file";
    }

    public oct(short[] sArr) {
        this.a = "Metadata_";
    }

    public oct(int i) {
        this.a = new acjs(i);
    }

    public oct(Context context) {
        this.a = mjv.r(context, true);
    }

    public oct(Context context, byte[] bArr) {
        this.a = context.getApplicationContext();
    }

    public oct(Context context, char[] cArr) {
        StrictMode.ThreadPolicy threadPolicyB = zrr.a.b();
        try {
            this.a = context.getSharedPreferences("com.google.maps.api.android.lib6.impl.PREFERENCES_FILE", 0);
        } finally {
            zrr.a.d(threadPolicyB);
        }
    }

    public oct(ouz ouzVar) {
        try {
            this.a = ouzVar == null ? Collections.EMPTY_LIST : ouzVar.e();
        } catch (RemoteException e) {
            throw new IllegalStateException("Error querying capabilities", e);
        }
    }

    public oct(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public oct(String str, byte[] bArr) {
        this.a = a.bq(str, "[", "] ");
    }

    public oct(char[] cArr, byte[] bArr) {
        this.a = new Stack();
        new Handler();
    }

    public oct(byte[] bArr, byte[] bArr2) {
        this.a = new lvl();
        OptionalDouble.empty();
    }

    public oct(aezk aezkVar) {
        this.a = new lvl();
        new pke(xvy.a, aezkVar);
    }

    public oct(Matcher matcher) {
        matcher.getClass();
        this.a = matcher;
    }

    public oct(char[] cArr, char[] cArr2) {
        this.a = new ArrayList();
    }

    public oct() {
        this.a = new mcd();
    }
}
