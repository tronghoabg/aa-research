package com.google.android.libraries.surveys.internal.view;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import defpackage.em;
import defpackage.en;
import defpackage.sdo;
import defpackage.vuf;
import defpackage.wiv;
import defpackage.wkf;

/* loaded from: classes3.dex */
public final class PlatformSystemInfoDialogFragment extends DialogFragment {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.SurveyTheme);
        View viewInflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        viewInflate.getContext().setTheme(R.style.SurveyAlertDialogCustomViewTheme);
        em emVarL = vuf.L(contextThemeWrapper);
        emVarL.p(viewInflate);
        en enVarB = emVarL.b();
        viewInflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new sdo(enVarB, 9));
        Bundle arguments = getArguments();
        String string = arguments.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle2 = arguments.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.ab(new LinearLayoutManager(1));
        wkf wkfVar = new wkf();
        recyclerView.Z(wkfVar);
        recyclerView.ay(new wiv(this, viewInflate));
        wkfVar.b(vuf.G(contextThemeWrapper, string, bundle2));
        return enVarB;
    }
}
