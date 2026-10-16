package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.eeh;
import defpackage.exl;
import defpackage.exm;
import defpackage.exn;
import defpackage.exo;
import defpackage.exy;
import defpackage.eyc;
import defpackage.eyd;
import defpackage.eyh;
import defpackage.ie;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class Preference implements Comparable<Preference> {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public PreferenceGroup G;
    public exo H;
    public exy I;
    private boolean J;
    private List K;
    private boolean L;
    private exn M;
    private final View.OnClickListener N;
    private CharSequence a;
    private Bundle b;
    private boolean c;
    private boolean d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    public final Context j;
    public eyd k;
    public long l;
    public boolean m;
    public exl n;
    public exm o;
    public int p;
    public CharSequence q;
    public int r;
    public Drawable s;
    public String t;
    public Intent u;
    public String v;
    public boolean w;
    public boolean x;
    public Object y;
    public boolean z;

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Alert.DURATION_SHOW_INDEFINITELY;
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
        this.E = R.layout.preference;
        this.N = new ie(this, 3);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eyh.g, i, i2);
        this.r = dlz.n(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.t = dlz.r(typedArrayObtainStyledAttributes, 26, 6);
        this.q = dlz.p(typedArrayObtainStyledAttributes, 34, 4);
        this.a = dlz.p(typedArrayObtainStyledAttributes, 33, 7);
        this.p = dlz.w(typedArrayObtainStyledAttributes, 28, 8);
        this.v = dlz.r(typedArrayObtainStyledAttributes, 22, 13);
        this.E = dlz.n(typedArrayObtainStyledAttributes, 27, 3, R.layout.preference);
        this.F = dlz.n(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.c = dlz.s(typedArrayObtainStyledAttributes, 21, 2, true);
        this.d = dlz.s(typedArrayObtainStyledAttributes, 30, 5, true);
        this.x = dlz.s(typedArrayObtainStyledAttributes, 29, 1, true);
        this.e = dlz.r(typedArrayObtainStyledAttributes, 19, 10);
        this.h = dlz.s(typedArrayObtainStyledAttributes, 16, 16, this.d);
        this.i = dlz.s(typedArrayObtainStyledAttributes, 17, 17, this.d);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.y = f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.y = f(typedArrayObtainStyledAttributes, 11);
        }
        this.J = dlz.s(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.A = zHasValue;
        if (zHasValue) {
            this.B = dlz.s(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.C = dlz.s(typedArrayObtainStyledAttributes, 24, 15, false);
        this.z = dlz.s(typedArrayObtainStyledAttributes, 25, 25, true);
        this.D = dlz.s(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
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

    public final void A(eyd eydVar) {
        this.k = eydVar;
        if (!this.m) {
            this.l = eydVar.a();
        }
        if (R()) {
            eyd eydVar2 = this.k;
            if ((eydVar2 != null ? eydVar2.c() : null).contains(this.t)) {
                h(null);
                return;
            }
        }
        Object obj = this.y;
        if (obj != null) {
            h(obj);
        }
    }

    public void B() {
        M();
    }

    public final void C() {
        Intent intent;
        eyc eycVar;
        if (Q() && this.d) {
            c();
            exm exmVar = this.o;
            if (exmVar == null || !exmVar.b()) {
                eyd eydVar = this.k;
                if ((eydVar == null || (eycVar = eydVar.c) == null || !eycVar.i(this)) && (intent = this.u) != null) {
                    this.j.startActivity(intent);
                }
            }
        }
    }

    public final void D() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        Preference preferenceR = r(this.e);
        if (preferenceR != null) {
            if (preferenceR.K == null) {
                preferenceR.K = new ArrayList();
            }
            preferenceR.K.add(this);
            S(preferenceR.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.e + "\" not found for preference \"" + this.t + "\" (title: \"" + ((Object) this.q) + "\"");
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

    public final void H(exo exoVar) {
        this.H = exoVar;
        d();
    }

    public final void I(int i) {
        J(this.j.getString(i));
    }

    public final void J(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void K(boolean z) {
        if (this.z != z) {
            this.z = z;
            exy exyVar = this.I;
            if (exyVar != null) {
                exyVar.s();
            }
        }
    }

    public final void L(SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void M() {
        Preference preferenceR;
        List list;
        String str = this.e;
        if (str == null || (preferenceR = r(str)) == null || (list = preferenceR.K) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean N(Object obj) {
        exl exlVar = this.n;
        return exlVar == null || exlVar.a(this, obj);
    }

    protected final boolean O(boolean z) {
        return !R() ? z : this.k.c().getBoolean(this.t, z);
    }

    public final boolean P() {
        return !TextUtils.isEmpty(this.t);
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

    protected final void U(String str) {
        if (R() && !TextUtils.equals(str, s(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putString(this.t, str);
            L(editorB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.eyg r10) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(eyg):void");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.p;
        int i2 = preference2.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference2.q;
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
        exy exyVar = this.I;
        if (exyVar == null || (iIndexOf = exyVar.a.indexOf(this)) == -1) {
            return;
        }
        exyVar.b.c(iIndexOf, 1, this);
    }

    protected Parcelable e() {
        this.L = true;
        return BaseSavedState.EMPTY_STATE;
    }

    public long eT() {
        return this.l;
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    protected void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable != BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public void gO(View view) {
        C();
    }

    public boolean j() {
        return !Q();
    }

    public CharSequence m() {
        exo exoVar = this.H;
        return exoVar != null ? exoVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.H != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final int p(int i) {
        return !R() ? i : this.k.c().getInt(this.t, i);
    }

    public final Bundle q() {
        Bundle bundle = this.b;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.b = bundle2;
        return bundle2;
    }

    protected final Preference r(String str) {
        eyd eydVar = this.k;
        if (eydVar == null) {
            return null;
        }
        return eydVar.d(str);
    }

    protected final String s(String str) {
        return !R() ? str : this.k.c().getString(this.t, str);
    }

    public final Set t(Set set) {
        return !R() ? set : this.k.c().getStringSet(this.t, set);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceM = m();
        if (!TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    final void u(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.G != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.G = preferenceGroup;
    }

    public void v(Bundle bundle) {
        Parcelable parcelable;
        if (!P() || (parcelable = bundle.getParcelable(this.t)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void w(Bundle bundle) {
        if (P()) {
            this.L = false;
            Parcelable parcelableE = e();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableE != null) {
                bundle.putParcelable(this.t, parcelableE);
            }
        }
    }

    public void x(boolean z) {
        List list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).S(z);
        }
    }

    protected final void y() {
        exy exyVar = this.I;
        if (exyVar != null) {
            exyVar.s();
        }
    }

    public void z() {
        D();
    }

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new eeh(5);

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dlz.l(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context) {
        this(context, null);
    }
}
