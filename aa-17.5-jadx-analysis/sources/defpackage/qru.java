package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class qru extends qrq {
    boolean m;
    boolean n;
    public kwp p;
    public final eqc l = new eqc(this, true);
    boolean o = true;

    public qru() {
        getSavedStateRegistry().c("android:support:lifecycle", new bi((ContextWrapper) this, 5));
        gB(new qrs(this, 1));
        this.i.add(new qrs(this, 0));
        this.f.a(new eo(this, 3));
    }

    private static String l(View view) throws Resources.NotFoundException {
        String resourcePackageName;
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        int visibility = view.getVisibility();
        if (visibility == 0) {
            sb.append('V');
        } else if (visibility == 4) {
            sb.append('I');
        } else if (visibility != 8) {
            sb.append('.');
        } else {
            sb.append('G');
        }
        sb.append(true != view.isFocusable() ? '.' : 'F');
        sb.append(true != view.isEnabled() ? '.' : 'E');
        sb.append(true != view.willNotDraw() ? 'D' : '.');
        sb.append(true != view.isHorizontalScrollBarEnabled() ? '.' : 'H');
        sb.append(true != view.isVerticalScrollBarEnabled() ? '.' : 'V');
        sb.append(true != view.isClickable() ? '.' : 'C');
        sb.append(true != view.isLongClickable() ? '.' : 'L');
        sb.append(' ');
        sb.append(true != view.isFocused() ? '.' : 'F');
        sb.append(true != view.isSelected() ? '.' : 'S');
        sb.append(true == view.isPressed() ? 'P' : '.');
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (id != 0 && resources != null) {
                int i = (-16777216) & id;
                if (i == 16777216) {
                    resourcePackageName = "android";
                } else if (i != 2130706432) {
                    try {
                        resourcePackageName = resources.getResourcePackageName(id);
                    } catch (Resources.NotFoundException unused) {
                    }
                } else {
                    resourcePackageName = CloudRecognizerProtocolStrings.APP;
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                sb.append(" ");
                sb.append(resourcePackageName);
                sb.append(":");
                sb.append(resourceTypeName);
                sb.append("/");
                sb.append(resourceEntryName);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private static boolean m(bt btVar, eps epsVar) {
        boolean zM = false;
        for (Fragment fragment : btVar.l()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zM |= m(fragment.getChildFragmentManager(), epsVar);
                }
                if (fragment.getLifecycle().a().a(eps.d)) {
                    ((eqc) fragment.getLifecycle()).f(epsVar);
                    zM = true;
                }
            }
        }
        return zM;
    }

    @Override // defpackage.qrq, defpackage.qqh
    public final void G() {
        super.G();
        this.p.E();
        this.l.e(epr.ON_DESTROY);
    }

    @Override // defpackage.qrq, defpackage.qqh
    public void I() {
        super.I();
        this.n = false;
        this.p.F();
        this.l.e(epr.ON_PAUSE);
    }

    @Override // defpackage.qqh
    public final void J() {
        this.l.e(epr.ON_RESUME);
        this.p.G();
    }

    @Override // defpackage.qrq, defpackage.qqh
    public final void K() {
        this.p.J();
        super.K();
        this.n = true;
        this.p.L();
    }

    @Override // defpackage.qqh
    public final void L(Context context) {
        attachBaseContext(context);
        this.p = new kwp(new qrt(this, this));
    }

    public final bt S() {
        return this.p.A();
    }

    public final void T(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(l(view));
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            for (int i = 0; i < childCount; i++) {
                T(str.concat("  "), printWriter, viewGroup.getChildAt(i));
            }
        }
    }

    public final void U() {
        while (m(S(), eps.c)) {
        }
    }

    @Override // defpackage.qrq, defpackage.qqh
    public void a(Bundle bundle) {
        if (getBaseContext() == null) {
            throw new IllegalStateException("Context not attached to CarActivity");
        }
        if (A().getFactory() == null) {
            A().setFactory(this);
        }
        super.a(bundle);
        this.l.e(epr.ON_CREATE);
        this.p.D();
    }

    @Override // defpackage.qrq, defpackage.qqh
    public void h() {
        this.p.J();
        super.h();
        this.o = false;
        if (!this.m) {
            this.m = true;
            this.p.C();
        }
        this.p.L();
        this.l.e(epr.ON_START);
        this.p.H();
    }

    @Override // defpackage.qrq, defpackage.qqh
    public void j() {
        super.j();
        this.o = true;
        U();
        this.p.I();
        this.l.e(epr.ON_STOP);
    }

    @Override // defpackage.qqh, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewB = this.p.B(null, str, context, attributeSet);
        if (viewB == null) {
            return null;
        }
        return viewB;
    }
}
