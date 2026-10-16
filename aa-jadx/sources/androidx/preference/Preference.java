package androidx.preference;

/* JADX INFO: loaded from: classes2.dex */
public class Preference implements java.lang.Comparable<androidx.preference.Preference> {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public androidx.preference.PreferenceGroup G;
    public defpackage.exu H;
    public defpackage.eye I;
    private boolean J;
    private java.util.List K;
    private boolean L;
    private defpackage.ext M;
    private final android.view.View.OnClickListener N;
    private java.lang.CharSequence a;
    private android.os.Bundle b;
    private boolean c;
    private boolean d;
    private java.lang.String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    public final android.content.Context j;
    public defpackage.eyj k;
    public long l;
    public boolean m;
    public defpackage.exr n;
    public defpackage.exs o;
    public int p;
    public java.lang.CharSequence q;
    public int r;
    public android.graphics.drawable.Drawable s;
    public java.lang.String t;
    public android.content.Intent u;
    public java.lang.String v;
    public boolean w;
    public boolean x;
    public java.lang.Object y;
    public boolean z;

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.p = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.c = true;
        this.d = true;
        this.x = true;
        this.f = true;
        this.g = true;
        this.z = true;
        this.h = true;
        this.i = true;
        this.B = true;
        this.J = true;
        this.E = com.google.android.projection.gearhead.R.layout.preference;
        this.N = new defpackage.ViewOnClickListenerC0002if(this, 3);
        this.j = context;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyn.g, i, i2);
        this.r = defpackage.dmh.n(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.t = defpackage.dmh.r(typedArrayObtainStyledAttributes, 26, 6);
        this.q = defpackage.dmh.p(typedArrayObtainStyledAttributes, 34, 4);
        this.a = defpackage.dmh.p(typedArrayObtainStyledAttributes, 33, 7);
        this.p = defpackage.dmh.w(typedArrayObtainStyledAttributes, 28, 8);
        this.v = defpackage.dmh.r(typedArrayObtainStyledAttributes, 22, 13);
        this.E = defpackage.dmh.n(typedArrayObtainStyledAttributes, 27, 3, com.google.android.projection.gearhead.R.layout.preference);
        this.F = defpackage.dmh.n(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.c = defpackage.dmh.s(typedArrayObtainStyledAttributes, 21, 2, true);
        this.d = defpackage.dmh.s(typedArrayObtainStyledAttributes, 30, 5, true);
        this.x = defpackage.dmh.s(typedArrayObtainStyledAttributes, 29, 1, true);
        this.e = defpackage.dmh.r(typedArrayObtainStyledAttributes, 19, 10);
        this.h = defpackage.dmh.s(typedArrayObtainStyledAttributes, 16, 16, this.d);
        this.i = defpackage.dmh.s(typedArrayObtainStyledAttributes, 17, 17, this.d);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.y = f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.y = f(typedArrayObtainStyledAttributes, 11);
        }
        this.J = defpackage.dmh.s(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.A = zHasValue;
        if (zHasValue) {
            this.B = defpackage.dmh.s(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.C = defpackage.dmh.s(typedArrayObtainStyledAttributes, 24, 15, false);
        this.z = defpackage.dmh.s(typedArrayObtainStyledAttributes, 25, 25, true);
        this.D = defpackage.dmh.s(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void k(android.view.View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof android.view.ViewGroup)) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void A(defpackage.eyj eyjVar) {
        this.k = eyjVar;
        if (!this.m) {
            this.l = eyjVar.a();
        }
        if (R()) {
            defpackage.eyj eyjVar2 = this.k;
            if ((eyjVar2 != null ? eyjVar2.c() : null).contains(this.t)) {
                h(null);
                return;
            }
        }
        java.lang.Object obj = this.y;
        if (obj != null) {
            h(obj);
        }
    }

    public void B() {
        M();
    }

    public final void C() {
        android.content.Intent intent;
        defpackage.eyi eyiVar;
        if (Q() && this.d) {
            c();
            defpackage.exs exsVar = this.o;
            if (exsVar == null || !exsVar.b()) {
                defpackage.eyj eyjVar = this.k;
                if ((eyjVar == null || (eyiVar = eyjVar.c) == null || !eyiVar.i(this)) && (intent = this.u) != null) {
                    this.j.startActivity(intent);
                }
            }
        }
    }

    public final void D() {
        if (android.text.TextUtils.isEmpty(this.e)) {
            return;
        }
        androidx.preference.Preference preferenceR = r(this.e);
        if (preferenceR != null) {
            if (preferenceR.K == null) {
                preferenceR.K = new java.util.ArrayList();
            }
            preferenceR.K.add(this);
            S(preferenceR.j());
            return;
        }
        throw new java.lang.IllegalStateException("Dependency \"" + this.e + "\" not found for preference \"" + this.t + "\" (title: \"" + ((java.lang.Object) this.q) + "\"");
    }

    public final void E(boolean z) {
        if (this.c != z) {
            this.c = z;
            x(j());
            d();
        }
    }

    public final void F(int i) {
        if (i != this.p) {
            this.p = i;
            y();
        }
    }

    public final void G(int i) {
        n(this.j.getString(i));
    }

    public final void H(defpackage.exu exuVar) {
        this.H = exuVar;
        d();
    }

    public final void I(int i) {
        J(this.j.getString(i));
    }

    public final void J(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void K(boolean z) {
        if (this.z != z) {
            this.z = z;
            defpackage.eye eyeVar = this.I;
            if (eyeVar != null) {
                eyeVar.s();
            }
        }
    }

    public final void L(android.content.SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void M() {
        androidx.preference.Preference preferenceR;
        java.util.List list;
        java.lang.String str = this.e;
        if (str == null || (preferenceR = r(str)) == null || (list = preferenceR.K) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean N(java.lang.Object obj) {
        defpackage.exr exrVar = this.n;
        return exrVar == null || exrVar.a(this, obj);
    }

    protected final boolean O(boolean z) {
        return !R() ? z : this.k.c().getBoolean(this.t, z);
    }

    public final boolean P() {
        return !android.text.TextUtils.isEmpty(this.t);
    }

    public boolean Q() {
        return this.c && this.f && this.g;
    }

    protected final boolean R() {
        return this.k != null && this.x && P();
    }

    public final void S(boolean z) {
        if (this.f == z) {
            this.f = !z;
            x(j());
            d();
        }
    }

    public final void T(boolean z) {
        if (this.g == z) {
            this.g = !z;
            x(j());
            d();
        }
    }

    protected final void U(java.lang.String str) {
        if (R() && !android.text.TextUtils.equals(str, s(null))) {
            android.content.SharedPreferences.Editor editorB = this.k.b();
            editorB.putString(this.t, str);
            L(editorB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    public void a(defpackage.eym eymVar) {
        java.lang.Integer numValueOf;
        android.graphics.drawable.Drawable drawableE;
        android.view.View view = eymVar.a;
        view.setOnClickListener(this.N);
        view.setId(0);
        android.widget.TextView textView = (android.widget.TextView) eymVar.E(android.R.id.summary);
        if (textView != null) {
            java.lang.CharSequence charSequenceM = m();
            if (android.text.TextUtils.isEmpty(charSequenceM)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceM);
                textView.setVisibility(0);
                numValueOf = java.lang.Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) eymVar.E(android.R.id.title);
        if (textView2 != null) {
            java.lang.CharSequence charSequence = this.q;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.A) {
                    textView2.setSingleLine(this.B);
                }
                if (!this.d && Q() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) eymVar.E(android.R.id.icon);
        if (imageView != null) {
            int i = this.r;
            if (i != 0) {
                drawableE = this.s;
                if (drawableE == null) {
                    drawableE = defpackage.ca.e(this.j, i);
                    this.s = drawableE;
                }
                if (drawableE != null) {
                    imageView.setImageDrawable(drawableE);
                }
            } else if (this.s != null) {
                i = 0;
                drawableE = this.s;
                if (drawableE == null) {
                    drawableE = defpackage.ca.e(this.j, i);
                    this.s = drawableE;
                }
                if (drawableE != null) {
                    imageView.setImageDrawable(drawableE);
                }
            }
            if (this.s != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(true != this.C ? 8 : 4);
            }
        }
        android.view.View viewE = eymVar.E(com.google.android.projection.gearhead.R.id.icon_frame);
        if (viewE == null) {
            viewE = eymVar.E(android.R.id.icon_frame);
        }
        if (viewE != null) {
            if (this.s != null) {
                viewE.setVisibility(0);
            } else {
                viewE.setVisibility(true == this.C ? 4 : 8);
            }
        }
        if (this.J) {
            k(view, Q());
        } else {
            k(view, true);
        }
        boolean z = this.d;
        view.setFocusable(z);
        view.setClickable(z);
        eymVar.u = this.h;
        eymVar.v = this.i;
        boolean z2 = this.D;
        if (z2 && this.M == null) {
            this.M = new defpackage.ext(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.M : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        view.setBackground(null);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(androidx.preference.Preference preference) {
        androidx.preference.Preference preference2 = preference;
        int i = this.p;
        int i2 = preference2.p;
        if (i != i2) {
            return i - i2;
        }
        java.lang.CharSequence charSequence = this.q;
        java.lang.CharSequence charSequence2 = preference2.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.q.toString());
    }

    public void d() {
        int iIndexOf;
        defpackage.eye eyeVar = this.I;
        if (eyeVar == null || (iIndexOf = eyeVar.a.indexOf(this)) == -1) {
            return;
        }
        eyeVar.b.c(iIndexOf, 1, this);
    }

    protected android.os.Parcelable e() {
        this.L = true;
        return androidx.preference.Preference.BaseSavedState.EMPTY_STATE;
    }

    public long eb() {
        return this.l;
    }

    protected java.lang.Object f(android.content.res.TypedArray typedArray, int i) {
        return null;
    }

    public void fZ(android.view.View view) {
        C();
    }

    protected void g(android.os.Parcelable parcelable) {
        this.L = true;
        if (parcelable != androidx.preference.Preference.BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new java.lang.IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        return !Q();
    }

    public java.lang.CharSequence m() {
        defpackage.exu exuVar = this.H;
        return exuVar != null ? exuVar.a(this) : this.a;
    }

    public void n(java.lang.CharSequence charSequence) {
        if (this.H != null) {
            throw new java.lang.IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (android.text.TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final int p(int i) {
        return !R() ? i : this.k.c().getInt(this.t, i);
    }

    public final android.os.Bundle q() {
        android.os.Bundle bundle = this.b;
        if (bundle != null) {
            return bundle;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        this.b = bundle2;
        return bundle2;
    }

    protected final androidx.preference.Preference r(java.lang.String str) {
        defpackage.eyj eyjVar = this.k;
        if (eyjVar == null) {
            return null;
        }
        return eyjVar.d(str);
    }

    protected final java.lang.String s(java.lang.String str) {
        return !R() ? str : this.k.c().getString(this.t, str);
    }

    public final java.util.Set t(java.util.Set set) {
        return !R() ? set : this.k.c().getStringSet(this.t, set);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.CharSequence charSequence = this.q;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        java.lang.CharSequence charSequenceM = m();
        if (!android.text.TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    final void u(androidx.preference.PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.G != null) {
            throw new java.lang.IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.G = preferenceGroup;
    }

    public void v(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (!P() || (parcelable = bundle.getParcelable(this.t)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new java.lang.IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void w(android.os.Bundle bundle) {
        if (P()) {
            this.L = false;
            android.os.Parcelable parcelableE = e();
            if (!this.L) {
                throw new java.lang.IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableE != null) {
                bundle.putParcelable(this.t, parcelableE);
            }
        }
    }

    public void x(boolean z) {
        java.util.List list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((androidx.preference.Preference) list.get(i)).S(z);
        }
    }

    protected final void y() {
        defpackage.eye eyeVar = this.I;
        if (eyeVar != null) {
            eyeVar.s();
        }
    }

    public void z() {
        D();
    }

    public static class BaseSavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.Preference.BaseSavedState> CREATOR = new defpackage.eep(5);

        public BaseSavedState(android.os.Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    protected void c() {
    }

    protected void h(java.lang.Object obj) {
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, defpackage.dmh.l(context, com.google.android.projection.gearhead.R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(android.content.Context context) {
        this(context, null);
    }
}
