package com.waze.reports;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.VenueServices;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd extends android.support.v4.app.ar {

    /* renamed from: a, reason: collision with root package name */
    private static VenueServices f33680a;

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f33681b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap f33682c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private HashSet f33683d;

    /* renamed from: e, reason: collision with root package name */
    private ViewGroup f33684e;

    /* renamed from: f, reason: collision with root package name */
    private View f33685f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f33686g = com.waze.shared_infra.o.b.a();

    public static String b(ed edVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < edVar.f33906b.getServicesCount(); i2++) {
            String str2 = (String) edVar.I().get(i2);
            HashMap map = f33681b;
            synchronized (map) {
                str = (String) map.get(str2);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    public static List f(List list) {
        if (f33680a == null) {
            return new ArrayList(list);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : f33680a.ids) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void i() {
        VenueServices venueServices = f33680a;
        if (venueServices == null || venueServices.count == 0) {
            NativeManager.Post(new bb(2));
        }
    }

    public final void h(HashSet hashSet) {
        this.f33683d = hashSet;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null || !bundle.containsKey(String.valueOf(getClass().getName()).concat(".mSetServiceIds"))) {
            return;
        }
        this.f33683d = new HashSet(bundle.getStringArrayList(String.valueOf(getClass().getName()).concat(".mSetServiceIds")));
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        NativeManager.getInstance();
        i();
        int i2 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.edit_place_services, viewGroup, false);
        this.f33685f = viewInflate;
        TitleBar titleBar = (TitleBar) viewInflate.findViewById(R.id.theTitleBar);
        titleBar.c(this.f33686g.c(R.string.SERVICES, new Object[0]));
        titleBar.h(R.drawable.confirm_icon);
        titleBar.n(new b(this, 14));
        titleBar.m(new com.waze.mywaze.f(this, 2));
        this.f33684e = (ViewGroup) this.f33685f.findViewById(R.id.editServicesLinesContainer);
        if (this.f33683d == null) {
            this.f33683d = new HashSet();
        }
        while (true) {
            VenueServices venueServices = f33680a;
            if (i2 >= venueServices.count) {
                return this.f33685f;
            }
            boolean zContains = this.f33683d.contains(venueServices.ids[i2]);
            VenueServices venueServices2 = f33680a;
            String str = venueServices2.names[i2];
            String str2 = venueServices2.ids[i2];
            WazeSettingsView wazeSettingsView = new WazeSettingsView(getActivity(), false, 0, null, 2);
            wazeSettingsView.D(zContains);
            wazeSettingsView.A(str);
            wazeSettingsView.s(new bg(this, str2, 1));
            this.f33684e.addView(wazeSettingsView);
            wazeSettingsView.getLayoutParams().height = (int) (getResources().getDisplayMetrics().density * 80.0f);
            i2++;
        }
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        String strValueOf = String.valueOf(getClass().getName());
        bundle.putStringArrayList(strValueOf.concat(".mSetServiceIds"), new ArrayList<>(this.f33683d));
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        com.waze.shared_infra.g.e.d(view.findViewById(R.id.editPlaceServicesContainer), (ScrollView) view.findViewById(R.id.editPlaceServicesScrollView));
    }
}
