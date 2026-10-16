package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class exv extends Fragment implements eyc, eya, eyb, exd {
    public eyd a;
    public RecyclerView b;
    private boolean d;
    private boolean e;
    private final exr c = new exr(this);
    private int f = R.layout.preference_list_fragment;
    private final Handler g = new exq(this, Looper.getMainLooper());
    private final Runnable h = new elt(this, 6, null);

    private final void k() {
        if (this.a == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    @Override // defpackage.exd
    public final Preference a(CharSequence charSequence) {
        eyd eydVar = this.a;
        if (eydVar == null) {
            return null;
        }
        return eydVar.d(charSequence);
    }

    public final PreferenceScreen b() {
        eyd eydVar = this.a;
        if (eydVar == null) {
            return null;
        }
        return eydVar.b;
    }

    public final void c(int i) {
        k();
        g(this.a.e(requireContext(), i, b()));
    }

    final void d() {
        PreferenceScreen preferenceScreenB = b();
        if (preferenceScreenB != null) {
            this.b.Z(new exy(preferenceScreenB));
            preferenceScreenB.z();
        }
    }

    public abstract void e(Bundle bundle, String str);

    @Override // defpackage.eya
    public final void f(Preference preference) {
        ao exkVar;
        boolean zA = false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof exs) {
                zA = ((exs) parentFragment).a();
            }
        }
        if (!zA && (getContext() instanceof exs)) {
            zA = ((exs) getContext()).a();
        }
        if (zA) {
            return;
        }
        if (!((getActivity() instanceof exs) && ((exs) getActivity()).a()) && getParentFragmentManager().f("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.t;
                exkVar = new exf();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                exkVar.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.t;
                exkVar = new exi();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                exkVar.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.t;
                exkVar = new exk();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                exkVar.setArguments(bundle3);
            }
            exkVar.setTargetFragment(this, 0);
            exkVar.e(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void g(PreferenceScreen preferenceScreen) {
        eyd eydVar;
        PreferenceScreen preferenceScreen2;
        if (preferenceScreen == null || preferenceScreen == (preferenceScreen2 = (eydVar = this.a).b)) {
            return;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.B();
        }
        eydVar.b = preferenceScreen;
        this.d = true;
        if (this.e) {
            Handler handler = this.g;
            if (handler.hasMessages(1)) {
                return;
            }
            handler.obtainMessage(1).sendToTarget();
        }
    }

    public final void h(int i, String str) throws Resources.NotFoundException {
        k();
        PreferenceScreen preferenceScreenE = this.a.e(requireContext(), i, null);
        PreferenceScreen preferenceScreen = preferenceScreenE;
        if (str != null) {
            Preference preferenceL = preferenceScreenE.l(str);
            boolean z = preferenceL instanceof PreferenceScreen;
            preferenceScreen = preferenceL;
            if (!z) {
                throw new IllegalArgumentException(a.bq(str, "Preference object with key ", " is not a PreferenceScreen"));
            }
        }
        g(preferenceScreen);
    }

    @Override // defpackage.eyc
    public boolean i(Preference preference) {
        if (preference.v == null) {
            return false;
        }
        boolean zA = false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof ext) {
                zA = ((ext) parentFragment).a();
            }
        }
        if (!zA && (getContext() instanceof ext)) {
            zA = ((ext) getContext()).a();
        }
        if (!zA && (!(getActivity() instanceof ext) || !((ext) getActivity()).a())) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            bt parentFragmentManager = getParentFragmentManager();
            Bundle bundleQ = preference.q();
            Fragment fragmentA = parentFragmentManager.i().a(requireActivity().getClassLoader(), preference.v);
            fragmentA.setArguments(bundleQ);
            fragmentA.setTargetFragment(this, 0);
            w wVar = new w(parentFragmentManager);
            wVar.q(((View) requireView().getParent()).getId(), fragmentA, null);
            wVar.n(null);
            wVar.i(false, true);
        }
        return true;
    }

    @Override // defpackage.eyb
    public final void j() {
        boolean zA = false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof exu) {
                zA = ((exu) parentFragment).a();
            }
        }
        if (!zA && (getContext() instanceof exu)) {
            zA = ((exu) getContext()).a();
        }
        if (zA || !(getActivity() instanceof exu)) {
            return;
        }
        ((exu) getActivity()).a();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        eyd eydVar = new eyd(requireContext());
        this.a = eydVar;
        eydVar.e = this;
        e(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, eyh.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(0, this.f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            requireContext();
            recyclerView.ab(new LinearLayoutManager(1));
            recyclerView.Y(new eyf(recyclerView));
        }
        if (recyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.b = recyclerView;
        exr exrVar = this.c;
        recyclerView.aw(exrVar);
        if (drawable != null) {
            exrVar.b = drawable.getIntrinsicHeight();
        } else {
            exrVar.b = 0;
        }
        exrVar.a = drawable;
        exv exvVar = exrVar.d;
        exvVar.b.M();
        if (dimensionPixelSize != -1) {
            exrVar.b = dimensionPixelSize;
            exvVar.b.M();
        }
        exrVar.c = z;
        if (this.b.getParent() == null) {
            viewGroup2.addView(this.b);
        }
        this.g.post(this.h);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        Handler handler = this.g;
        handler.removeCallbacks(this.h);
        handler.removeMessages(1);
        if (this.d) {
            this.b.Z(null);
            PreferenceScreen preferenceScreenB = b();
            if (preferenceScreenB != null) {
                preferenceScreenB.B();
            }
        }
        this.b = null;
        super.onDestroyView();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public void m117x22bc4f96(Bundle bundle) {
        PreferenceScreen preferenceScreenB = b();
        if (preferenceScreenB != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenB.w(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        eyd eydVar = this.a;
        eydVar.c = this;
        eydVar.d = this;
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        super.onStop();
        eyd eydVar = this.a;
        eydVar.c = null;
        eydVar.d = null;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenB;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenB = b()) != null) {
            preferenceScreenB.v(bundle2);
        }
        if (this.d) {
            d();
        }
        this.e = true;
    }
}
