package com.waze.bt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.IntentCompat;
import com.waze.R;
import com.waze.authentication.as;
import com.waze.dw;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.menus.SideMenuSearchBar;
import com.waze.menus.i;
import com.waze.menus.j;
import com.waze.menus.v;
import com.waze.menus.w;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.sharedui.utils.o;
import com.waze.web.r;
import com.waze.z.a.a.h;
import h.ab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends ar implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private SideMenuSearchBar f17466a;

    /* renamed from: b, reason: collision with root package name */
    private SideMenuAutoCompleteRecycler f17467b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f17468c = h.e(this);

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f17469d = com.waze.shared_infra.o.b.a();

    /* renamed from: e, reason: collision with root package name */
    private final ActivityResultLauncher f17470e = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new dw(this, 4));

    /* renamed from: f, reason: collision with root package name */
    private final ActivityResultLauncher f17471f = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new dw(this, 5));

    /* renamed from: g, reason: collision with root package name */
    private final w f17472g = new a(this, 0);

    /* renamed from: h, reason: collision with root package name */
    private final v f17473h = new v() { // from class: com.waze.bt.b
        @Override // com.waze.menus.v
        public final void a(Intent intent) {
            this.f17459a.i(-1, intent);
        }
    };

    public static /* synthetic */ ab b(f fVar, List list, AddressItem[] addressItemArr) {
        List listAsList = Arrays.asList(addressItemArr);
        com.waze.ab.ab.m(listAsList, list, true, 1);
        com.waze.ab.ab.m(listAsList, list, true, 3);
        com.waze.ab.ab.m(listAsList, list, false, 5);
        SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler = fVar.f17467b;
        if (sideMenuAutoCompleteRecycler != null) {
            sideMenuAutoCompleteRecycler.bb(list);
        }
        return ab.f48028a;
    }

    public static /* synthetic */ void c(f fVar, ActivityResult activityResult) {
        ArrayList<String> stringArrayListExtra;
        int resultCode = activityResult.getResultCode();
        Intent data = activityResult.getData();
        if (resultCode != -1 || (stringArrayListExtra = data.getStringArrayListExtra("android.speech.extra.RESULTS")) == null || stringArrayListExtra.isEmpty()) {
            return;
        }
        o.c().e();
        fVar.f17466a.l(stringArrayListExtra.get(0));
        fVar.f17466a.g();
    }

    public static /* synthetic */ void d(f fVar, ActivityResult activityResult) {
        if (activityResult.getResultCode() != 0) {
            fVar.i(activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i2, Intent intent) {
        this.f17466a.q();
        Bundle bundle = new Bundle();
        bundle.putInt("RESULT_CODE", i2);
        if (i2 == -1 && intent != null) {
            boolean zJ = j();
            String str = true != zJ ? "com.waze.planned_drive.PlannedDriveUtils.kt.destination" : "com.waze.planned_drive.PlannedDriveUtils.kt.origin";
            if (intent.hasExtra(str)) {
                AddressItem addressItem = (AddressItem) IntentCompat.getParcelableExtra(intent, str, AddressItem.class);
                e eVar = zJ ? e.f17463b : e.f17464c;
                bundle.putParcelable("RESULT_ADDRESS_ITEM", addressItem);
                bundle.putSerializable("RESULT_EDIT_ENDPOINT_MODE", eVar);
            }
        }
        getParentFragmentManager().aD("EDIT_ENDPOINT_RESULT_KEY", bundle);
    }

    private final boolean j() {
        Bundle arguments = getArguments();
        e eVar = arguments != null ? (e) arguments.getSerializable("mode") : null;
        return eVar == null || eVar == e.f17462a || eVar == e.f17463b;
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f17468c.getValue();
    }

    @Override // org.a.a.b.a
    public final void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.select_endpoint_activity_layout, viewGroup, false);
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        this.f17466a = null;
        this.f17467b = null;
        super.onDestroyView();
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        this.f17466a = (SideMenuSearchBar) view.findViewById(R.id.searchBar);
        this.f17467b = (SideMenuAutoCompleteRecycler) view.findViewById(R.id.autocompleteRecycler);
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new c(this));
        boolean zJ = j();
        this.f17466a.j(this.f17469d.c(zJ ? R.string.FUTURE_DRIVES_PLAN_CHANGE_ORIGIN : R.string.FUTURE_DRIVES_PLAN_CHANGE_DESTINATION, new Object[0]));
        this.f17466a.i(new a(this, 1));
        this.f17467b.P = getViewLifecycleOwner().getLifecycle();
        this.f17467b.bc(zJ);
        this.f17467b.bd(this.f17473h);
        this.f17467b.ba(this.f17472g);
        ArrayList arrayList = new ArrayList();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("EXTRA_SHOW_CURRENT_LOCATION")) {
            zJ = arguments.getBoolean("EXTRA_SHOW_CURRENT_LOCATION");
        }
        if (zJ) {
            arrayList.add(new i(com.waze.shared_infra.o.b.a().c(R.string.AUTOCOMPLETE_CURRENT_LOCATION, new Object[0]), null, com.waze.design_components.b.d.I.c(com.waze.design_components.b.e.f23312a), j.f29732g));
        }
        String strC = com.waze.shared_infra.o.b.a().c(R.string.MAIN_MENU_SEARCH_FAVORITES, new Object[0]);
        com.waze.design_components.b.d dVar = com.waze.design_components.b.d.M;
        com.waze.design_components.b.e eVar = com.waze.design_components.b.e.f23312a;
        arrayList.add(new i(strC, null, dVar.c(eVar), j.f29728c));
        arrayList.add(new i(com.waze.shared_infra.o.b.a().c(R.string.MAIN_MENU_SEARCH_HISTORY, new Object[0]), null, com.waze.design_components.b.d.P.c(eVar), j.f29727b));
        if (ActivityCompat.checkSelfPermission(requireContext(), "android.permission.READ_CONTACTS") != 0) {
            arrayList.add(new i(com.waze.shared_infra.o.b.a().c(R.string.MAIN_MENU_ALLOW_CONTACTS_LINE1, new Object[0]), com.waze.shared_infra.o.b.a().c(R.string.MAIN_MENU_ALLOW_CONTACTS_LINE2, new Object[0]), com.waze.design_components.b.d.ar.c(eVar), j.f29731f));
        }
        ((DriveToNativeManager) r.h(DriveToNativeManager.class)).getFavorites(true, new as(this, arrayList, 20));
        this.f17467b.aS();
        this.f17466a.k(new d(this));
        this.f17466a.r();
        this.f17466a.g();
    }
}
