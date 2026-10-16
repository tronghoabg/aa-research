package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes.dex */
public class lv {
    public static void l(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    static void m(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof no) {
                editorInfo.hintText = ((no) parent).a();
                return;
            }
        }
    }

    public static Object n(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void o(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0077, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(defpackage.cio r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv.p(cio):void");
    }

    public static boolean q(int i) {
        return i == 1 || i == 2;
    }

    public static cfy r(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new chs(afecVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:55:0x00a2, B:58:0x00ab, B:61:0x00b3, B:64:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(defpackage.ciu r10, int r11, defpackage.afec r12) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv.s(ciu, int, afec):java.lang.Object");
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, ml mlVar) {
        ((ma) view.getLayoutParams()).fP();
        rect.set(0, 0, 0, 0);
    }

    public void b(Canvas canvas, RecyclerView recyclerView) {
    }

    public void i(Canvas canvas, RecyclerView recyclerView) {
    }
}
