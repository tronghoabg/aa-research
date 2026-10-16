package androidx.preference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceGroup extends androidx.preference.Preference {
    public final defpackage.aba a;
    public final java.util.List b;
    public int c;
    private final android.os.Handler d;
    private boolean e;
    private int f;
    private boolean g;
    private final java.lang.Runnable h;

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.a = new defpackage.aba(0);
        this.d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.e = true;
        this.f = 0;
        this.g = false;
        this.c = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.h = new defpackage.eaw(this, 12, null);
        this.b = new java.util.ArrayList();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyn.i, i, 0);
        this.e = defpackage.dmh.s(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            V(defpackage.dmh.w(typedArrayObtainStyledAttributes, 1, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.M();
        this.g = false;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).B();
        }
    }

    public final void V(int i) {
        if (i != Integer.MAX_VALUE && !P()) {
            android.util.Log.e("PreferenceGroup", java.lang.String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.c = i;
    }

    public boolean W() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    public final void X(androidx.preference.Preference preference) {
        long jA;
        java.util.List list = this.b;
        if (list.contains(preference)) {
            return;
        }
        if (preference.t != null) {
            androidx.preference.PreferenceGroup preferenceGroup = this;
            while (true) {
                androidx.preference.PreferenceGroup preferenceGroup2 = preferenceGroup.G;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            java.lang.String str = preference.t;
            if (preferenceGroup.l(str) != null) {
                android.util.Log.e("PreferenceGroup", defpackage.a.bp(str, "Found duplicated key: \"", "\". This can cause unintended behaviour, please use unique keys for every preference."));
            }
        }
        if (preference.p == Integer.MAX_VALUE) {
            if (this.e) {
                int i = this.f;
                this.f = i + 1;
                preference.F(i);
            }
            if (preference instanceof androidx.preference.PreferenceGroup) {
                ((androidx.preference.PreferenceGroup) preference).e = this.e;
            }
        }
        int iBinarySearch = java.util.Collections.binarySearch(list, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        preference.T(j());
        synchronized (this) {
            this.b.add(iBinarySearch, preference);
        }
        defpackage.eyj eyjVar = this.k;
        java.lang.String str2 = preference.t;
        if (str2 != null) {
            defpackage.aba abaVar = this.a;
            if (abaVar.containsKey(str2)) {
                jA = ((java.lang.Long) abaVar.get(str2)).longValue();
                abaVar.remove(str2);
            } else {
                jA = eyjVar.a();
            }
        } else {
            jA = eyjVar.a();
        }
        preference.l = jA;
        preference.m = true;
        try {
            preference.A(eyjVar);
            preference.m = false;
            preference.u(this);
            if (this.g) {
                preference.z();
            }
            y();
        } catch (java.lang.Throwable th) {
            preference.m = false;
            throw th;
        }
    }

    public final void Y(androidx.preference.Preference preference) {
        synchronized (this) {
            super.M();
            if (preference.G == this) {
                preference.u(null);
            }
            if (this.b.remove(preference)) {
                java.lang.String str = preference.t;
                if (str != null) {
                    this.a.put(str, java.lang.Long.valueOf(preference.eb()));
                    android.os.Handler handler = this.d;
                    java.lang.Runnable runnable = this.h;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.g) {
                    preference.B();
                }
            }
        }
        y();
    }

    @Override // androidx.preference.Preference
    protected final android.os.Parcelable e() {
        return new androidx.preference.PreferenceGroup.SavedState(super.e(), this.c);
    }

    @Override // androidx.preference.Preference
    protected final void g(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.PreferenceGroup.SavedState.class)) {
            super.g(parcelable);
            return;
        }
        androidx.preference.PreferenceGroup.SavedState savedState = (androidx.preference.PreferenceGroup.SavedState) parcelable;
        this.c = savedState.a;
        super.g(savedState.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final androidx.preference.Preference l(java.lang.CharSequence charSequence) {
        androidx.preference.Preference preferenceL;
        if (charSequence == null) {
            throw new java.lang.IllegalArgumentException("Key cannot be null");
        }
        if (android.text.TextUtils.equals(this.t, charSequence)) {
            return this;
        }
        int iK = k();
        for (int i = 0; i < iK; i++) {
            androidx.preference.Preference preferenceO = o(i);
            if (android.text.TextUtils.equals(preferenceO.t, charSequence)) {
                return preferenceO;
            }
            if ((preferenceO instanceof androidx.preference.PreferenceGroup) && (preferenceL = ((androidx.preference.PreferenceGroup) preferenceO).l(charSequence)) != null) {
                return preferenceL;
            }
        }
        return null;
    }

    public final androidx.preference.Preference o(int i) {
        return (androidx.preference.Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void v(android.os.Bundle bundle) {
        super.v(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).v(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void w(android.os.Bundle bundle) {
        super.w(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).w(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void x(boolean z) {
        super.x(z);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).T(z);
        }
    }

    @Override // androidx.preference.Preference
    public final void z() {
        super.D();
        this.g = true;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).z();
        }
    }

    public static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.PreferenceGroup.SavedState> CREATOR = new defpackage.eep(6);
        final int a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(android.os.Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
