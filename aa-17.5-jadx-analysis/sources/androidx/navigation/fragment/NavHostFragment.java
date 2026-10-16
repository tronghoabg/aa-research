package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.aezr;
import defpackage.aezy;
import defpackage.afdr;
import defpackage.ebh;
import defpackage.euu;
import defpackage.evs;
import defpackage.ewl;
import defpackage.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 12\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u00062"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroid/support/v4/app/Fragment;", "Landroidx/navigation/NavHost;", "<init>", "()V", "navHostController", "Landroidx/navigation/NavHostController;", "getNavHostController$navigation_fragment", "()Landroidx/navigation/NavHostController;", "navHostController$delegate", "Lkotlin/Lazy;", "viewParent", "Landroid/view/View;", "graphId", "", "defaultNavHost", "", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateNavHostController", "onCreateNavController", "createFragmentNavigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "containerId", "getContainerId", "()I", "onViewCreated", "view", "onInflate", "attrs", "Landroid/util/AttributeSet;", "onSaveInstanceState", "outState", "onDestroyView", "Companion", "navigation-fragment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {
    public int a;
    private final aezr b = new aezy(new afdr() { // from class: ewi
        @Override // defpackage.afdr
        public final Object invoke() {
            ept lifecycle;
            NavHostFragment navHostFragment = this.a;
            Context context = navHostFragment.getContext();
            if (context == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            }
            final euu euuVar = new euu(context);
            ewp ewpVar = euuVar.b;
            if (!affa.f(navHostFragment, ewpVar.h)) {
                eqa eqaVar = ewpVar.h;
                if (eqaVar != null && (lifecycle = eqaVar.getLifecycle()) != null) {
                    lifecycle.d(ewpVar.j);
                }
                ewpVar.h = navHostFragment;
                navHostFragment.getLifecycle().c(ewpVar.j);
            }
            ert viewModelStore = navHostFragment.getViewModelStore();
            viewModelStore.getClass();
            if (ewpVar.r == null) {
                if (!ewpVar.e.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                ewpVar.r = new evn(new ncp(viewModelStore, esa.a));
            }
            evq evqVarD = euuVar.d();
            Context contextRequireContext = navHostFragment.requireContext();
            bt childFragmentManager = navHostFragment.getChildFragmentManager();
            childFragmentManager.getClass();
            evqVarD.c(new ewb(contextRequireContext, childFragmentManager));
            evq evqVarD2 = euuVar.d();
            Context contextRequireContext2 = navHostFragment.requireContext();
            bt childFragmentManager2 = navHostFragment.getChildFragmentManager();
            childFragmentManager2.getClass();
            evqVarD2.c(new ewh(contextRequireContext2, childFragmentManager2, navHostFragment.a()));
            Bundle bundleA = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
            if (bundleA != null) {
                bundleA.setClassLoader(euuVar.a.getClassLoader());
                ewpVar.c = fbb.f(bundleA, "android-support-nav:controller:navigatorState") ? fbb.b(bundleA, "android-support-nav:controller:navigatorState") : null;
                ewpVar.d = fbb.f(bundleA, "android-support-nav:controller:backStack") ? (Bundle[]) fbb.d(bundleA, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
                Map map = ewpVar.g;
                map.clear();
                if (fbb.f(bundleA, "android-support-nav:controller:backStackDestIds") && fbb.f(bundleA, "android-support-nav:controller:backStackIds")) {
                    int[] iArrI = fbb.i(bundleA, "android-support-nav:controller:backStackDestIds");
                    List listE = fbb.e(bundleA, "android-support-nav:controller:backStackIds");
                    int length = iArrI.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        ewpVar.f.put(Integer.valueOf(iArrI[i]), !affa.f(listE.get(i2), "") ? (String) listE.get(i2) : null);
                        i++;
                        i2 = i3;
                    }
                }
                if (fbb.f(bundleA, "android-support-nav:controller:backStackStates")) {
                    for (String str : fbb.e(bundleA, "android-support-nav:controller:backStackStates")) {
                        if (fbb.f(bundleA, "android-support-nav:controller:backStackStates:".concat(String.valueOf(str)))) {
                            List listD = fbb.d(bundleA, "android-support-nav:controller:backStackStates:".concat(String.valueOf(str)));
                            afaz afazVar = new afaz(listD.size());
                            Iterator it = listD.iterator();
                            while (it.hasNext()) {
                                afazVar.addLast(new erb((Bundle) it.next()));
                            }
                            map.put(str, afazVar);
                        }
                    }
                }
                boolean z = bundleA.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                Boolean boolValueOf = (z || !bundleA.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : null;
                euuVar.d = boolValueOf != null ? boolValueOf.booleanValue() : false;
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new fbd() { // from class: ewj
                @Override // defpackage.fbd
                public final Bundle a() {
                    Bundle bundleZ;
                    ArrayList arrayList = new ArrayList();
                    Bundle bundleZ2 = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                    euu euuVar2 = euuVar;
                    ewp ewpVar2 = euuVar2.b;
                    Bundle bundle = ewpVar2.c;
                    if (bundle != null && fbb.f(bundle, "android-support-nav:controller:navigatorState:names")) {
                        for (String str2 : fbb.e(bundle, "android-support-nav:controller:navigatorState:names")) {
                            if (fbb.f(bundle, str2)) {
                                Bundle bundleB = fbb.b(bundle, str2);
                                arrayList.add(str2);
                                fbh.a(bundleZ2, str2, bundleB);
                            }
                        }
                    }
                    for (Map.Entry entry : ewpVar2.k.b().entrySet()) {
                        String str3 = (String) entry.getKey();
                        Bundle bundleE = ((evp) entry.getValue()).e();
                        if (bundleE != null) {
                            if (!arrayList.contains(str3)) {
                                arrayList.add(str3);
                            }
                            fbh.a(bundleZ2, str3, bundleE);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        bundleZ = null;
                    } else {
                        bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                        fbh.e(bundleZ2, "android-support-nav:controller:navigatorState:names", arrayList);
                        fbh.a(bundleZ, "android-support-nav:controller:navigatorState", bundleZ2);
                    }
                    afaz afazVar2 = ewpVar2.e;
                    if (!afazVar2.isEmpty()) {
                        if (bundleZ == null) {
                            bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = afazVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new erb((euq) it2.next()).E());
                        }
                        fbh.b(bundleZ, "android-support-nav:controller:backStack", arrayList2);
                    } else if (ewpVar2.d != null) {
                        if (bundleZ == null) {
                            bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                        }
                        Bundle[] bundleArr = ewpVar2.d;
                        bundleArr.getClass();
                        fbh.b(bundleZ, "android-support-nav:controller:backStack", woy.df(bundleArr));
                    }
                    Map map2 = ewpVar2.f;
                    if (!map2.isEmpty()) {
                        if (bundleZ == null) {
                            bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                        }
                        int[] iArr = new int[map2.size()];
                        ArrayList arrayList3 = new ArrayList();
                        int i4 = 0;
                        for (Map.Entry entry2 : map2.entrySet()) {
                            int iIntValue = ((Number) entry2.getKey()).intValue();
                            String str4 = (String) entry2.getValue();
                            int i5 = i4 + 1;
                            iArr[i4] = iIntValue;
                            if (str4 == null) {
                                str4 = "";
                            }
                            arrayList3.add(str4);
                            i4 = i5;
                        }
                        bundleZ.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                        fbh.e(bundleZ, "android-support-nav:controller:backStackIds", arrayList3);
                    }
                    Map map3 = ewpVar2.g;
                    if (!map3.isEmpty()) {
                        if (bundleZ == null) {
                            bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Map.Entry entry3 : map3.entrySet()) {
                            String str5 = (String) entry3.getKey();
                            afaz afazVar3 = (afaz) entry3.getValue();
                            arrayList4.add(str5);
                            ArrayList arrayList5 = new ArrayList();
                            Iterator<E> it3 = afazVar3.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(((erb) it3.next()).E());
                            }
                            fbh.b(bundleZ, "android-support-nav:controller:backStackStates:".concat(String.valueOf(str5)), arrayList5);
                        }
                        fbh.e(bundleZ, "android-support-nav:controller:backStackStates", arrayList4);
                    }
                    if (euuVar2.d) {
                        if (bundleZ == null) {
                            bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                        }
                        bundleZ.putBoolean("android-support-nav:controller:deepLinkHandled", euuVar2.d);
                    }
                    if (bundleZ != null) {
                        return bundleZ;
                    }
                    Bundle bundle2 = Bundle.EMPTY;
                    bundle2.getClass();
                    return bundle2;
                }
            });
            Bundle bundleA2 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
            if (bundleA2 != null) {
                navHostFragment.a = bundleA2.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new ewk(navHostFragment, 0));
            int i4 = navHostFragment.a;
            if (i4 != 0) {
                ewpVar.k(euuVar.c().a(i4), null);
                return euuVar;
            }
            Bundle arguments = navHostFragment.getArguments();
            int i5 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i5 != 0) {
                ewpVar.k(euuVar.c().a(i5), bundle);
            }
            return euuVar;
        }
    });
    private View c;
    private boolean d;

    public static final euu b(Fragment fragment) {
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).c();
            }
            Fragment fragment2 = parentFragment.getParentFragmentManager().p;
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).c();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return ebh.i(view);
        }
        throw new IllegalStateException(a.bm(fragment, "Fragment ", " does not have a NavController set"));
    }

    public final int a() {
        int id = getId();
        return (id == 0 || id == -1) ? R.id.nav_host_fragment_container : id;
    }

    public final euu c() {
        return (euu) this.b.a();
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (this.d) {
            w wVar = new w(getParentFragmentManager());
            wVar.l(this);
            wVar.i(false, true);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        c();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.d = true;
            w wVar = new w(getParentFragmentManager());
            wVar.l(this);
            wVar.i(false, true);
        }
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(a());
        return fragmentContainerView;
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.c;
        if (view != null && ebh.i(view) == c()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.c = null;
    }

    @Override // android.support.v4.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, evs.b);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.a = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ewl.c);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        bundle.getClass();
        if (this.d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(a.bm(view, "created host view ", " is not a ViewGroup"));
        }
        view.setTag(R.id.nav_controller_view_tag, c());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.c = view2;
            view2.getClass();
            if (view2.getId() == getId()) {
                View view3 = this.c;
                view3.getClass();
                view3.setTag(R.id.nav_controller_view_tag, c());
            }
        }
    }
}
