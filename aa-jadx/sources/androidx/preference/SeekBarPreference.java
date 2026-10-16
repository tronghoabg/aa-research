package androidx.preference;

/* JADX INFO: loaded from: classes2.dex */
public class SeekBarPreference extends androidx.preference.Preference {
    private final boolean J;
    private final android.widget.SeekBar.OnSeekBarChangeListener K;
    private final android.view.View.OnKeyListener L;
    public int a;
    public int b;
    public boolean c;
    public android.widget.SeekBar d;
    public final boolean e;
    public final boolean f;
    private int g;
    private int h;
    private android.widget.TextView i;

    public static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.SeekBarPreference.SavedState> CREATOR = new defpackage.eep(7);
        int a;
        int b;
        int c;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.google.android.projection.gearhead.R.attr.seekBarPreferenceStyle, 0);
        this.K = new defpackage.eyo(this);
        this.L = new defpackage.jzw(this, 1);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyn.k, com.google.android.projection.gearhead.R.attr.seekBarPreferenceStyle, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.b;
        i = i < i2 ? i2 : i;
        if (i != this.g) {
            this.g = i;
            d();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.h) {
            this.h = java.lang.Math.min(this.g - this.b, java.lang.Math.abs(i3));
            d();
        }
        this.e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.J = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void o(int i, boolean z) {
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.a) {
            this.a = i;
            l(i);
            if (R() && i != p(~i)) {
                android.content.SharedPreferences.Editor editorB = this.k.b();
                editorB.putInt(this.t, i);
                super.L(editorB);
            }
            if (z) {
                d();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.eym eymVar) {
        super.a(eymVar);
        eymVar.a.setOnKeyListener(this.L);
        this.d = (android.widget.SeekBar) eymVar.E(com.google.android.projection.gearhead.R.id.seekbar);
        android.widget.TextView textView = (android.widget.TextView) eymVar.E(com.google.android.projection.gearhead.R.id.seekbar_value);
        this.i = textView;
        if (this.J) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        android.widget.SeekBar seekBar = this.d;
        if (seekBar == null) {
            android.util.Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.K);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        android.widget.SeekBar seekBar2 = this.d;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.h = seekBar2.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        l(this.a);
        this.d.setEnabled(Q());
    }

    @Override // androidx.preference.Preference
    protected final android.os.Parcelable e() {
        android.os.Parcelable parcelableE = super.e();
        if (this.x) {
            return parcelableE;
        }
        androidx.preference.SeekBarPreference.SavedState savedState = new androidx.preference.SeekBarPreference.SavedState(parcelableE);
        savedState.a = this.a;
        savedState.b = this.b;
        savedState.c = this.g;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final java.lang.Object f(android.content.res.TypedArray typedArray, int i) {
        return java.lang.Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected final void g(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.SeekBarPreference.SavedState.class)) {
            super.g(parcelable);
            return;
        }
        androidx.preference.SeekBarPreference.SavedState savedState = (androidx.preference.SeekBarPreference.SavedState) parcelable;
        super.g(savedState.getSuperState());
        this.a = savedState.a;
        this.b = savedState.b;
        this.g = savedState.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected final void h(java.lang.Object obj) {
        if (obj == null) {
            obj = 0;
        }
        o(p(((java.lang.Integer) obj).intValue()), true);
    }

    public final void k(android.widget.SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            if (N(java.lang.Integer.valueOf(progress))) {
                o(progress, false);
            } else {
                seekBar.setProgress(this.a - this.b);
                l(this.a);
            }
        }
    }

    public final void l(int i) {
        android.widget.TextView textView = this.i;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(i));
        }
    }
}
