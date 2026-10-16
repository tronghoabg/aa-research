package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.projection.gearhead.R;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class dnm extends oc {
    public afdr a;
    public dnk b;
    public final dnj c;
    private final View d;
    private final float e;
    private boolean f;

    public dnm(afdr afdrVar, dnk dnkVar, View view, dlr dlrVar, dlg dlgVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        this.a = afdrVar;
        this.b = dnkVar;
        this.d = view;
        this.e = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        ebh.d(window, true);
        window.setGravity(17);
        dnj dnjVar = new dnj(getContext(), window);
        setTitle(this.b.a);
        Objects.toString(uuid);
        dnjVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        dnjVar.setClipChildren(false);
        dnjVar.setElevation(dlgVar.eA(8.0f));
        dnjVar.setOutlineProvider(new dnl());
        this.c = dnjVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView(dnjVar);
        ecw.e(dnjVar, ecw.d(view));
        eee.k(dnjVar, eee.j(view));
        ebi.k(dnjVar, ebi.j(view));
        a(this.a, this.b, dlrVar, dlgVar);
        bii biiVarR = r();
        ddz ddzVar = new ddz(this, 12);
        biiVarR.getClass();
        biiVarR.x(this, new oq(ddzVar));
    }

    private static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof dnj) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    public final void a(afdr afdrVar, dnk dnkVar, dlr dlrVar, dlg dlgVar) {
        int i;
        this.a = afdrVar;
        this.b = dnkVar;
        int i2 = dnkVar.d;
        boolean zC = dnb.c(this.d);
        Window window = getWindow();
        window.getClass();
        window.setFlags(true != zC ? -8193 : 8192, 8192);
        int iOrdinal = dlrVar.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                throw new aezs();
            }
            i = 1;
        }
        dnj dnjVar = this.c;
        dnjVar.setLayoutDirection(i);
        boolean z = (dnjVar.d && dnjVar.b && dnjVar.c) ? false : true;
        dnjVar.b = true;
        dnjVar.c = true;
        if (z) {
            Window window2 = dnjVar.a;
            if (window2.getAttributes().width != -2 || !dnjVar.d) {
                window2.setLayout(-2, -2);
                dnjVar.d = true;
            }
        }
        setCanceledOnTouchOutside(true);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(android.R.color.transparent);
            if (Build.VERSION.SDK_INT >= 31) {
                float f = dnkVar.b;
                if (!Float.isNaN(Float.NaN)) {
                    dnh.a.a(window3, dlgVar.eF(Float.NaN));
                }
                float f2 = dnkVar.c;
                if (!Float.isNaN(Float.NaN)) {
                    window3.setBackgroundBlurRadius(dlgVar.eF(Float.NaN));
                }
            }
            if (!Float.isNaN(Float.NaN)) {
                window3.setDimAmount(Float.NaN);
            }
            window3.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.a.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r10 != 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 != 3) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            float r1 = r10.getX()
            float r1 = java.lang.Math.abs(r1)
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 3
            r4 = 0
            r5 = 1
            if (r1 > 0) goto L6a
            float r1 = r10.getY()
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L6a
            dnj r1 = r9.c
            android.view.View r2 = r1.getChildAt(r4)
            if (r2 != 0) goto L2b
            goto L6a
        L2b:
            int r6 = r1.getLeft()
            int r7 = r2.getLeft()
            int r6 = r6 + r7
            int r7 = r2.getWidth()
            int r7 = r7 + r6
            int r1 = r1.getTop()
            int r8 = r2.getTop()
            int r1 = r1 + r8
            int r2 = r2.getHeight()
            int r2 = r2 + r1
            float r8 = r10.getX()
            int r8 = defpackage.afgi.k(r8)
            if (r6 > r8) goto L6a
            if (r8 > r7) goto L6a
            float r6 = r10.getY()
            int r6 = defpackage.afgi.k(r6)
            if (r1 > r6) goto L6a
            if (r6 > r2) goto L6a
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L75
            if (r10 == r5) goto L75
            if (r10 == r3) goto L75
            goto L84
        L6a:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L85
            if (r10 == r5) goto L78
            if (r10 == r3) goto L75
            goto L84
        L75:
            r9.f = r4
            return r0
        L78:
            boolean r10 = r9.f
            if (r10 == 0) goto L84
            afdr r10 = r9.a
            r10.invoke()
            r9.f = r4
            return r5
        L84:
            return r0
        L85:
            r9.f = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnm.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
