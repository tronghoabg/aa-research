package com.waze.reports;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.ConfigManager;
import com.waze.MainActivity;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.reports.SosProvider;
import com.waze.jni.protos.reports.SosProviders;
import com.waze.lm;
import com.waze.sharedui.views.OvalButton;
import com.waze.strings.DisplayStrings;
import com.waze.view.anim.SelectorBg;
import com.waze.view.button.ReportMenuButton;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class du extends di {
    static final int[] x = {R.drawable.icon_report_sos_no_gas, R.drawable.icon_report_sos_flat_tire, R.drawable.icon_report_sos_no_battery, R.drawable.icon_report_sos_medical_care, R.drawable.icon_report_sos};
    final ArrayList A;
    private final h.f B;
    private int[] C;
    private int[] D;
    private final String[] E;
    private Animation.AnimationListener F;
    final int[] y;
    final ArrayList z;

    public du(Context context, dr drVar) {
        super(context, drVar, R.string.SOS_REPORT_TITLE);
        this.B = com.waze.web.r.j(com.waze.reports_v2.c.ds.class);
        this.y = new int[]{1, 0, 5, 2, 4};
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.E = new String[]{this.f33841a.c(R.string.SOS_REPORT_FELLOW_WAZERS_EMPTY_TANK, new Object[0]), this.f33841a.c(R.string.SOS_REPORT_FELLOW_WAZERS_FLAT_TIRE, new Object[0]), this.f33841a.c(R.string.SOS_REPORT_FELLOW_WAZERS_BATTERY_ISSUE, new Object[0]), this.f33841a.c(R.string.SOS_REPORT_FELLOW_WAZERS_MEDICAL_ISSUE, new Object[0]), this.f33841a.c(R.string.SOS_REPORT_FELLOW_WAZERS_GENERAL_ASSISTANCE, new Object[0])};
        Y();
        this.f33850j = 4;
        G();
        V();
        ((WazeReportNativeManager) com.waze.web.r.h(WazeReportNativeManager.class)).getSosProviders(new com.waze.car_lib.screens.am(this, 15));
    }

    public static boolean T() {
        return NativeManager.getInstance().getIdOfMyCurrentSosAlertNTV() != -1;
    }

    private final void V() {
        OvalButton ovalButton = (OvalButton) findViewById(R.id.reportSend);
        TextView textView = (TextView) findViewById(R.id.reportSendText);
        com.waze.shared_infra.o.a aVar = this.f33841a;
        textView.setText(aVar.c(R.string.REPORT_SOS_REPORT_BUTTON_LABEL, new Object[0]));
        OvalButton ovalButton2 = (OvalButton) findViewById(R.id.reportLater);
        ovalButton2.setOnClickListener(new com.waze.navigate.ai(this, 7));
        ((TextView) findViewById(R.id.reportLaterText)).setVisibility(8);
        ImageView imageView = (ImageView) findViewById(R.id.reportLaterImage);
        imageView.setImageResource(R.drawable.send_location_white_icon);
        imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.primary_variant)));
        imageView.setVisibility(0);
        int i2 = getContext().getResources().getConfiguration().orientation;
        if ((ovalButton2.getLayoutParams() instanceof LinearLayout.LayoutParams) && i2 == 1) {
            ((LinearLayout.LayoutParams) ovalButton2.getLayoutParams()).weight = 1.0f;
            ((LinearLayout.LayoutParams) ovalButton.getLayoutParams()).weight = 3.0f;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reportGenericDetailsArea);
        viewGroup.removeAllViews();
        View viewInflate = this.f33846f.inflate(R.layout.sos_report_extra, viewGroup);
        if (T()) {
            textView.setText(aVar.c(R.string.REPORT_SOS_UNREPORT_BUTTON_LABEL, new Object[0]));
            ovalButton.t(R.color.alarming);
            ((TextView) viewInflate.findViewById(R.id.sos_report_extra_label)).setText(aVar.c(R.string.REPORT_SOS_LOCATION_COMMENT_SENT, new Object[0]));
            int subtypeOfMyCurrentSosAlertNTV = NativeManager.getInstance().getSubtypeOfMyCurrentSosAlertNTV();
            int[] iArr = this.y;
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                int length2 = iArr.length;
                if (i3 >= 5) {
                    i3 = 4;
                    break;
                } else {
                    if (iArr[i3] == subtypeOfMyCurrentSosAlertNTV) {
                        this.f33850j = subtypeOfMyCurrentSosAlertNTV;
                        break;
                    }
                    i3++;
                }
            }
            W(0, this.E[i3]);
            View viewFindViewById = viewInflate.findViewById(R.id.sos_report_extra_animation_layout);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.setDuration(1000L);
                animationSet.setInterpolator(new DecelerateInterpolator());
                animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f));
                animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                animationSet.setFillAfter(true);
                dt dtVar = new dt(this, viewInflate, animationSet);
                this.F = dtVar;
                animationSet.setAnimationListener(dtVar);
                viewInflate.findViewById(R.id.sos_report_extra_animation_pulse).startAnimation(animationSet);
            }
        } else {
            ((TextView) viewInflate.findViewById(R.id.sos_report_extra_label)).setText(aVar.c(R.string.REPORT_SOS_LOCATION_COMMENT, new Object[0]));
            viewGroup.setVisibility(0);
        }
        X();
    }

    private final void W(int i2, String str) {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reportGenericSelectorArea);
        ViewGroup viewGroup2 = viewGroup != null ? (ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(i2) : null;
        if (viewGroup2 != null) {
            viewGroup2.findViewById(R.id.reportGenericButton).setEnabled(false);
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.reportGenericButtonImage);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            Drawable drawableMutate = getResources().getDrawable(R.drawable.icon_report_assistance_emergency_call).mutate();
            drawableMutate.setColorFilter(colorMatrixColorFilter);
            imageView.setImageDrawable(drawableMutate);
            imageView.setAlpha(0.4f);
            viewGroup2.findViewById(R.id.reportGenericButton).setEnabled(false);
            TextView textView = (TextView) viewGroup2.findViewById(R.id.reportGenericButtonText);
            textView.setText(str);
            textView.setAlpha(0.4f);
        }
    }

    private final void X() {
        ArrayList arrayList = this.z;
        if (arrayList.size() == 0 || TextUtils.isEmpty(((SosProvider) arrayList.get(0)).getPhoneCall())) {
            W(1, this.f33841a.c(this.D[1], new Object[0]));
        }
    }

    private final void Y() {
        int size = this.A.size();
        int i2 = size > 0 ? 3 : 2;
        this.o = i2;
        int[] iArr = new int[i2];
        this.C = iArr;
        int[] iArr2 = new int[i2];
        this.D = iArr2;
        iArr[0] = R.drawable.icon_report_sos;
        iArr2[0] = R.string.SOS_REPORT_FELLOW_WAZERS;
        iArr[1] = R.drawable.icon_report_assistance_emergency_call;
        iArr2[1] = R.string.SOS_REPORT_EMERGENCY_CALL;
        if (size > 0) {
            iArr[2] = R.drawable.icon_report_assistance_placeholder;
            iArr2[2] = R.string.SOS_REPORT_ROAD_ASSISTANCE;
        }
    }

    private final void Z(ArrayList arrayList, String str, boolean z, com.waze.reports_v2.d.e eVar) {
        MainActivity mainActivityC = lm.d().c();
        if (mainActivityC == null) {
            return;
        }
        com.waze.reports_v2.d.j.f34595a.a().P(eVar, 15, h(), null);
        int i2 = SosProvidersListActivity.f33565f;
        Intent intent = new Intent(mainActivityC, (Class<?>) SosProvidersListActivity.class);
        SosProviders.Builder builderNewBuilder = SosProviders.newBuilder();
        builderNewBuilder.addAllSosProviders(arrayList);
        intent.putExtra("providers", builderNewBuilder.build().toByteArray());
        intent.putExtra("android.intent.extra.TITLE", str);
        intent.putExtra("showSend", z);
        mainActivityC.startActivityForResult(intent, DisplayStrings.DS_MAP_POPUP_MENU_PREVIEW);
    }

    public static /* synthetic */ h.ab q(du duVar, SosProviders sosProviders) {
        if (sosProviders != null) {
            for (SosProvider sosProvider : sosProviders.getSosProvidersList()) {
                if (sosProvider.getType() == SosProvider.ProviderType.EMERGENCY) {
                    duVar.z.add(sosProvider);
                } else if (sosProvider.getType() == SosProvider.ProviderType.ASSISTANCE) {
                    duVar.A.add(sosProvider);
                }
            }
        }
        ArrayList arrayList = duVar.z;
        if (arrayList.size() == 0) {
            SosProvider.Builder builderNewBuilder = SosProvider.newBuilder();
            String configValueString = ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_SOS_FALLBACK_NAME);
            builderNewBuilder.setType(SosProvider.ProviderType.EMERGENCY);
            builderNewBuilder.setSubtype(SosProvider.ProviderSubType.ROADSIDE_ASSISTANCE);
            builderNewBuilder.setName(duVar.f33841a.b(configValueString));
            builderNewBuilder.setPhoneCall(ConfigValues.CONFIG_VALUE_SOS_CALL_PHONE.b());
            builderNewBuilder.setPhoneSend(ConfigValues.CONFIG_VALUE_SOS_SMS_PHONE.b());
            builderNewBuilder.setEmail(ConfigValues.CONFIG_VALUE_SOS_EMAIL.b());
            builderNewBuilder.setUrl(ConfigValues.CONFIG_VALUE_SOS_URL.b());
            arrayList.add(builderNewBuilder.build());
        }
        duVar.Y();
        duVar.B();
        duVar.X();
        return h.ab.f48028a;
    }

    @Override // com.waze.reports.di
    public final void A() {
        super.A();
        V();
    }

    @Override // com.waze.reports.di
    protected final void C() {
        super.C();
        findViewById(R.id.reportEditTextHeader).setVisibility(0);
        ((TextView) findViewById(R.id.reportEditTextHeaderTitle)).setText(this.f33841a.c(R.string.SOS_REPORT_COMMENT_TITLE, new Object[0]));
    }

    @Override // com.waze.reports.di
    protected final void F() {
        super.F();
        findViewById(R.id.reportEditTextHeaderButton).setOnClickListener(new cv(this, 2));
    }

    @Override // com.waze.reports.di
    protected final boolean N(int i2) {
        if (i2 == 0 && T()) {
            return true;
        }
        if (i2 == 1) {
            Z(this.z, this.f33841a.c(R.string.SOS_REPORT_EMERGENCY_CALL, new Object[0]), true, com.waze.reports_v2.d.e.f34571e);
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        Z(this.A, this.f33841a.c(R.string.SOS_REPORT_ROAD_ASSISTANCE, new Object[0]), false, com.waze.reports_v2.d.e.f34575i);
        return true;
    }

    @Override // com.waze.reports.di
    protected final boolean P() {
        return false;
    }

    @Override // com.waze.reports.di
    protected final int a() {
        return 15;
    }

    @Override // com.waze.reports.di
    protected final com.waze.reports_v2.b.ad b() {
        return com.waze.reports_v2.b.ad.f34018b;
    }

    @Override // com.waze.reports.di
    public final com.waze.reports_v2.b.ae c() {
        int i2 = this.f33850j;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 5 ? com.waze.reports_v2.b.ae.f34032h : com.waze.reports_v2.b.ae.f34035k : com.waze.reports_v2.b.ae.f34036l : com.waze.reports_v2.b.ae.f34033i : com.waze.reports_v2.b.ae.f34034j;
    }

    @Override // com.waze.reports.di
    protected final int[] e() {
        return this.C;
    }

    @Override // com.waze.reports.di
    protected final int[] f() {
        return this.D;
    }

    @Override // com.waze.reports.di
    protected final int[] g() {
        return new int[]{4, 1, 0, 5, 2};
    }

    @Override // com.waze.reports.di
    protected final int h() {
        int i2 = this.f33850j;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    @Override // com.waze.reports.di
    protected final void i(int i2) {
        J(R.string.SOS_REPORT_FELLOW_WAZERS_SHEET_TITLE, this.E, x, this.y);
        this.f33849i = 0;
        this.r[0].setSelected(true);
        ((SelectorBg) this.r[0].findViewById(R.id.reportGenericButtonSelector)).a();
        L();
    }

    @Override // com.waze.reports.di
    public final void j(com.waze.reports_v2.b.ae aeVar) {
        int i2;
        switch (aeVar.ordinal()) {
            case 8:
                i2 = 1;
                break;
            case 9:
                i2 = 0;
                break;
            case 10:
                i2 = 5;
                break;
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 4;
                break;
        }
        this.f33850j = i2;
        V();
    }

    @Override // com.waze.reports.di
    public final void o() {
        if (T()) {
            com.waze.reports_v2.d.j.f34595a.a().P(com.waze.reports_v2.d.e.f34570d, 15, h(), null);
            NativeManager.getInstance().cancelMySosAlert();
        } else {
            super.o();
            R(0, 0, (ReportMenuButton) findViewById(R.id.reportCloseButton));
        }
        this.f33845e.D();
    }

    @Override // com.waze.reports.di
    protected final void p() {
        if (this.f33850j == 4) {
            C();
        }
    }

    @Override // com.waze.reports.di
    protected final int s() {
        return ConfigManager.getInstance().getConfigValueInt(ConfigValues.CONFIG_VALUE_SOS_COMMENT_LIMIT);
    }
}
