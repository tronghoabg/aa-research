package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class qso extends defpackage.qsk {
    boolean m;
    boolean n;
    public defpackage.kwv p;
    public final defpackage.eqi l = new defpackage.eqi(this, true);
    boolean o = true;

    public qso() {
        getSavedStateRegistry().c("android:support:lifecycle", new defpackage.bi((android.content.ContextWrapper) this, 5));
        fM(new defpackage.qsm(this, 1));
        this.i.add(new defpackage.qsm(this, 0));
        this.f.a(new defpackage.eo(this, 3));
    }

    private static java.lang.String l(android.view.View view) {
        java.lang.String resourcePackageName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(view)));
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
            sb.append(java.lang.Integer.toHexString(id));
            android.content.res.Resources resources = view.getResources();
            if (id != 0 && resources != null) {
                int i = (-16777216) & id;
                if (i == 16777216) {
                    resourcePackageName = "android";
                } else if (i != 2130706432) {
                    try {
                        resourcePackageName = resources.getResourcePackageName(id);
                    } catch (android.content.res.Resources.NotFoundException unused) {
                    }
                } else {
                    resourcePackageName = "app";
                }
                java.lang.String resourceTypeName = resources.getResourceTypeName(id);
                java.lang.String resourceEntryName = resources.getResourceEntryName(id);
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

    private static boolean m(defpackage.bt btVar, defpackage.epx epxVar) {
        boolean zM = false;
        for (android.support.v4.app.Fragment fragment : btVar.l()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zM |= m(fragment.getChildFragmentManager(), epxVar);
                }
                if (fragment.getLifecycle().a().a(defpackage.epx.d)) {
                    ((defpackage.eqi) fragment.getLifecycle()).f(epxVar);
                    zM = true;
                }
            }
        }
        return zM;
    }

    @Override // defpackage.qsk, defpackage.qrd
    public final void G() {
        super.G();
        this.p.ab();
        this.l.e(defpackage.epw.ON_DESTROY);
    }

    @Override // defpackage.qsk, defpackage.qrd
    public void I() {
        super.I();
        this.n = false;
        this.p.ac();
        this.l.e(defpackage.epw.ON_PAUSE);
    }

    @Override // defpackage.qrd
    public final void J() {
        this.l.e(defpackage.epw.ON_RESUME);
        this.p.ad();
    }

    @Override // defpackage.qsk, defpackage.qrd
    public final void K() {
        this.p.ag();
        super.K();
        this.n = true;
        this.p.ai();
    }

    @Override // defpackage.qrd
    public final void L(android.content.Context context) {
        attachBaseContext(context);
        this.p = new defpackage.kwv(new defpackage.qsn(this, this));
    }

    public final defpackage.bt S() {
        return this.p.X();
    }

    public final void T(java.lang.String str, java.io.PrintWriter printWriter, android.view.View view) {
        android.view.ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(l(view));
        if ((view instanceof android.view.ViewGroup) && (childCount = (viewGroup = (android.view.ViewGroup) view).getChildCount()) > 0) {
            for (int i = 0; i < childCount; i++) {
                T(str.concat("  "), printWriter, viewGroup.getChildAt(i));
            }
        }
    }

    public final void U() {
        while (m(S(), defpackage.epx.c)) {
        }
    }

    @Override // defpackage.qsk, defpackage.qrd
    public void a(android.os.Bundle bundle) {
        if (getBaseContext() == null) {
            throw new java.lang.IllegalStateException("Context not attached to CarActivity");
        }
        if (A().getFactory() == null) {
            A().setFactory(this);
        }
        super.a(bundle);
        this.l.e(defpackage.epw.ON_CREATE);
        this.p.aa();
    }

    @Override // defpackage.qsk, defpackage.qrd
    public void h() {
        this.p.ag();
        super.h();
        this.o = false;
        if (!this.m) {
            this.m = true;
            this.p.Z();
        }
        this.p.ai();
        this.l.e(defpackage.epw.ON_START);
        this.p.ae();
    }

    @Override // defpackage.qsk, defpackage.qrd
    public void j() {
        super.j();
        this.o = true;
        U();
        this.p.af();
        this.l.e(defpackage.epw.ON_STOP);
    }

    @Override // defpackage.qrd, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewY = this.p.Y(null, str, context, attributeSet);
        if (viewY == null) {
            return null;
        }
        return viewY;
    }
}
