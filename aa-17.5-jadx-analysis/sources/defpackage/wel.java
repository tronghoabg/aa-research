package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes3.dex */
public final class wel extends Fragment implements esl {
    private wek a;
    private LicenseMenuActivity b;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.esl
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(List list) {
        wek wekVar = this.a;
        if (wekVar != null) {
            wekVar.c(list);
        }
    }

    @Override // defpackage.esl
    public final void a(esv esvVar) {
        c(null);
    }

    @Override // defpackage.esl
    public final esv b(int i) {
        return new weh(getActivity());
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        bc activity = getActivity();
        if (activity instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) activity;
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        bc activity = getActivity();
        if (activity != null) {
            esm.a(activity).b(54321);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override // android.support.v4.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.b = null;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        bc activity = getActivity();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.license_list);
        this.a = new wek(this.b);
        recyclerView.ab(new LinearLayoutManager(1));
        recyclerView.Z(this.a);
        recyclerView.aw(new km(activity));
        wei weiVar = new wei(recyclerView, recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom(), 0);
        int[] iArr = ebm.a;
        ebe.e(recyclerView, weiVar);
        esm.a(activity).e(54321, null, this);
    }
}
