package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.system.Os;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class ebj {
    static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    static View.AccessibilityDelegate fI(View view) {
        return view.getAccessibilityDelegate();
    }

    public static erm g(erq erqVar, afhe afheVar, esc escVar) {
        Class<?> jClass = ((afer) afheVar).getJClass();
        jClass.getClass();
        return erqVar.b(jClass, escVar);
    }

    public static ers h(eru eruVar, erq erqVar, esc escVar) {
        erqVar.getClass();
        escVar.getClass();
        return new ers(eruVar.getViewModelStore(), erqVar, escVar);
    }

    public static cfy j(cfy cfyVar, asf asfVar, float f, afdr afdrVar) {
        cfyVar.getClass();
        asfVar.getClass();
        afdrVar.getClass();
        return asl.J(crh.a(n(cfyVar, f, f, f, f), afak.a, new gix(asfVar, afdrVar, 0)), f, f, f, f);
    }

    public static cfy k(cfy cfyVar, afdr afdrVar) {
        cfyVar.getClass();
        afdrVar.getClass();
        return cfyVar.a(new cfu(new bol(afdrVar, 7)));
    }

    public static cfy l(cfy cfyVar, avp avpVar) {
        cfyVar.getClass();
        return cfyVar.a(new csu(new akh(avpVar, 6)));
    }

    public static cfy m(cfy cfyVar, float f) {
        cfyVar.getClass();
        return cfyVar.a(new csu(new akh(new avr(f, f, f, f), 6)));
    }

    public static cfy n(cfy cfyVar, float f, float f2, float f3, float f4) {
        cfyVar.getClass();
        return cfyVar.a(new csu(new akh(new avr(f, f2, f3, f4), 6)));
    }

    public static cfy o(cfy cfyVar, float f) {
        cfyVar.getClass();
        return n(cfyVar, f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED);
    }

    public static void p(fdk fdkVar, Throwable th) throws Throwable {
        fde fdeVar = fdkVar.d;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        fdh fdhVarA = fdeVar.a;
        fdh fdhVar = fdeVar.b;
        if (fdhVarA == null || fdhVarA.a != id) {
            if (fdhVar == null || fdhVar.a != id) {
                Os.gettid();
                threadCurrentThread.getName();
                fdhVarA = fdeVar.a(id);
                fdeVar.b = fdeVar.a;
                fdeVar.a = fdhVarA;
            } else {
                fdhVarA = fdhVar;
            }
        }
        boolean z = fdhVarA.c.e;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public boolean e() {
        return false;
    }

    public void f() {
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }
}
