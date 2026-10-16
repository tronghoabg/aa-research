package com.waze.reports;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.v.eu;
import com.waze.R;
import com.waze.jni.protos.reports.SosProvider;
import com.waze.jni.protos.reports.SosProviders;
import com.waze.main.navigate.LocationData;
import com.waze.navigate.DriveToNativeManager;
import com.waze.view.title.TitleBar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class SosProvidersListActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33565f = 0;

    /* renamed from: g, reason: collision with root package name */
    private String f33566g;

    /* renamed from: h, reason: collision with root package name */
    private String f33567h;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f33568k = com.waze.shared_infra.o.b.a();

    public static /* synthetic */ h.ab l(SosProvidersListActivity sosProvidersListActivity, LocationData locationData) {
        if (locationData != null) {
            sosProvidersListActivity.f33566g = locationData.locationName;
            sosProvidersListActivity.f33567h = locationData.smsLocationUrlPrefix + "/h" + locationData.locationHash;
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ void m(SosProvidersListActivity sosProvidersListActivity, SosProvider sosProvider) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:".concat(String.valueOf(sosProvider.getPhoneSend()))));
        intent.putExtra("sms_body", sosProvidersListActivity.o());
        sosProvidersListActivity.startActivity(intent);
    }

    public static /* synthetic */ void n(SosProvidersListActivity sosProvidersListActivity, SosProvider sosProvider) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/html");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{sosProvider.getEmail()});
        intent.putExtra("android.intent.extra.SUBJECT", sosProvidersListActivity.f33568k.c(R.string.SEND_LOCATION_ASSISTANCE_EMAIL_SUBJECT, new Object[0]));
        intent.putExtra("android.intent.extra.TEXT", sosProvidersListActivity.o());
        sosProvidersListActivity.startActivity(intent);
    }

    private final String o() {
        String str = this.f33566g;
        if (str == null) {
            str = "";
        }
        return this.f33568k.c(R.string.SEND_LOCATION_ASSISTANCE_EMAIL_BODY_PS_PS, str, this.f33567h);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<SosProvider> sosProvidersList;
        int i2;
        aE();
        super.onCreate(bundle);
        setContentView(R.layout.sos_providers_list_layout);
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        titleBar.n(new com.waze.navigate.ai(this, 5));
        titleBar.m(new com.waze.navigate.ai(this, 6));
        String stringExtra = getIntent().getStringExtra("android.intent.extra.TITLE");
        if (stringExtra != null) {
            titleBar.p(stringExtra);
        }
        try {
            sosProvidersList = SosProviders.parseFrom(getIntent().getByteArrayExtra("providers")).getSosProvidersList();
        } catch (eu unused) {
            sosProvidersList = Collections.EMPTY_LIST;
        }
        if (sosProvidersList == null) {
            finish();
            return;
        }
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.sosProvidersContainer);
        Iterator<SosProvider> it = sosProvidersList.iterator();
        boolean z = false;
        while (true) {
            i2 = 14;
            if (!it.hasNext()) {
                break;
            }
            SosProvider next = it.next();
            View viewInflate = layoutInflater.inflate(R.layout.sos_provider_layout, viewGroup, false);
            ((TextView) viewInflate.findViewById(R.id.sosProviderName)).setText(next.getName());
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.sosProviderIcon);
            SosProvider.ProviderSubType providerSubType = SosProvider.ProviderSubType.POLICE;
            int iOrdinal = next.getSubtype().ordinal();
            imageView.setImageResource(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? R.drawable.list_icon_faq : R.drawable.search_results_fire_department : R.drawable.search_results_red_cross : R.drawable.search_results_police);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.sosProviderAction);
            com.waze.utils.o.b(imageView2, getResources().getColor(R.color.primary_variant));
            if (!TextUtils.isEmpty(next.getPhoneCall())) {
                ((TextView) viewInflate.findViewById(R.id.sosProviderPhone)).setText(next.getPhoneCall());
                imageView2.setImageResource(R.drawable.search_results_call);
                imageView2.setOnClickListener(new com.waze.a.y(this, next, 13));
            } else if (TextUtils.isEmpty(next.getUrl())) {
                viewInflate.findViewById(R.id.sosProviderAction).setAlpha(0.4f);
            } else {
                viewInflate.findViewById(R.id.sosProviderPhone).setVisibility(8);
                imageView2.setImageResource(R.drawable.search_results_open_website);
                imageView2.setOnClickListener(new com.waze.a.y(this, next, i2));
            }
            ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.sosProviderSend);
            com.waze.utils.o.b(imageView3, getResources().getColor(R.color.primary_variant));
            if (!TextUtils.isEmpty(next.getEmail())) {
                imageView3.setOnClickListener(new com.waze.a.y(this, next, 15));
            } else if (TextUtils.isEmpty(next.getPhoneSend())) {
                viewInflate.findViewById(R.id.sosProviderSendContainer).setVisibility(8);
                viewGroup.addView(viewInflate);
            } else {
                imageView3.setOnClickListener(new com.waze.a.y(this, next, 16));
            }
            z = true;
            viewGroup.addView(viewInflate);
        }
        if (z) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getLocationData(2, 0, 0, null, new com.waze.car_lib.screens.am(this, i2));
        }
        if (getIntent().getBooleanExtra("showSend", false)) {
            View viewFindViewById = findViewById(R.id.sendButton);
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new com.waze.inbox.e(11));
            com.waze.utils.o.b((ImageView) findViewById(R.id.sendButtonImage), getResources().getColor(R.color.primary_variant));
        } else {
            TextView textView = (TextView) findViewById(R.id.sosProvidersListTopTitle);
            textView.setVisibility(0);
            textView.setText(this.f33568k.c(R.string.REPORT_SOS_ASSISTANCE_LIST_TOP_TITLE, new Object[0]));
        }
        ((TextView) findViewById(R.id.sendButtonText)).setText(this.f33568k.c(R.string.SOS_LIST_SEND_LOCAITON, new Object[0]));
        com.waze.shared_infra.g.e.c(findViewById(R.id.favorites));
    }
}
