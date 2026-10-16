package com.waze.reports;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.rtalerts.MapProblem;
import com.waze.rtalerts.RtAlertsNativeManager;
import com.waze.sharedui.views.OvalButton;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp extends di {
    private final OvalButton x;
    private final OvalButton y;

    public bp(Context context, dr drVar) {
        super(context, drVar, R.string.MAP_ISSUE);
        this.o = 1;
        this.m = false;
        super.G();
        if (getContext().getResources().getConfiguration().orientation == 1) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reportGenericExtArea);
            if (viewGroup.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.weight = 0.0f;
                layoutParams.height = -2;
            }
            this.f33846f.inflate(R.layout.report_map_issue_disclaimer, viewGroup);
            ((TextView) findViewById(R.id.report_map_issue_disclaimer_text)).setText(this.f33841a.c(R.string.MAP_ISSUE_MORE_INFO_DISCLAIMER, new Object[0]));
            viewGroup.setVisibility(0);
            ConfigValues.CONFIG_VALUE_REPORTING_MAP_ISSUE_USER_DID_SEE_DISCLAIMER.d(true);
        }
        this.x = (OvalButton) findViewById(R.id.reportSend);
        this.y = (OvalButton) findViewById(R.id.reportLater);
        TextView textView = (TextView) findViewById(R.id.reportEditTextLegal);
        textView.setVisibility(0);
        textView.setText(this.f33841a.c(R.string.MAP_ISSUE_MORE_INFO_DISCLAIMER, new Object[0]));
        U(false);
    }

    private final void T() {
        TextView textView = (TextView) findViewById(R.id.reportGenericAddDetailsText);
        String string = this.s.getText().toString();
        if (string.isEmpty()) {
            textView.setText(this.f33841a.c(R.string.ADD_A_COMMENT, new Object[0]));
        } else {
            textView.setText(string);
        }
        ((ImageView) findViewById(R.id.reportGenericAddDetailsImage)).setVisibility(0);
        findViewById(R.id.reportGenericAddDetails).setOnClickListener(new b(this, 15));
        ((TextView) findViewById(R.id.reportSendText)).setText(this.f33841a.c(R.string.SEND, new Object[0]));
        this.y.setVisibility(0);
    }

    private final void U(boolean z) {
        OvalButton ovalButton = this.x;
        ovalButton.setEnabled(z);
        ovalButton.setAlpha(true != z ? 0.5f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 8 ? i2 != 10 ? R.drawable.map_issue_general_problem : R.drawable.map_issue_missing_road : R.drawable.map_issue_incorrect_route : R.drawable.map_issue_incorrect_turn : R.drawable.map_issue_missing_roundabout : R.drawable.map_issue_incorrect_route : R.drawable.map_issue_incorrect_address : R.drawable.map_issue_incorrect_turn;
    }

    public static /* synthetic */ void l(bp bpVar, ImageView imageView, TextView textView, MapProblem[] mapProblemArr) {
        if (mapProblemArr != null) {
            for (MapProblem mapProblem : mapProblemArr) {
                int i2 = mapProblem.type;
                if (i2 == bpVar.f33850j) {
                    bpVar.f33850j = i2;
                    imageView.setImageDrawable(ContextCompat.getDrawable(bpVar.getContext(), V(mapProblem.type)));
                    textView.setText(mapProblem.description);
                    bpVar.U(true);
                    return;
                }
            }
        }
    }

    @Override // com.waze.reports.di
    protected final int a() {
        return -1;
    }

    @Override // com.waze.reports.di
    protected final com.waze.reports_v2.b.ad b() {
        return com.waze.reports_v2.b.ad.f34017a;
    }

    @Override // com.waze.reports.di
    public final com.waze.reports_v2.b.ae c() {
        return h() != 0 ? com.waze.reports_v2.b.ae.f34030f : com.waze.reports_v2.b.ae.f34031g;
    }

    @Override // com.waze.reports.di
    protected final int[] e() {
        return new int[]{R.drawable.map_issue_map_issue};
    }

    @Override // com.waze.reports.di
    protected final int[] f() {
        return new int[]{R.string.MAP_ISSUE};
    }

    @Override // com.waze.reports.di
    protected final int[] g() {
        return new int[]{0};
    }

    @Override // com.waze.reports.di
    protected final void i(int i2) {
        L();
        if (i2 == 0) {
            this.f33849i = 0;
            U(false);
            T();
            RtAlertsNativeManager.getInstance().getMapProblems(new bo(this));
        }
    }

    @Override // com.waze.reports.di
    public final void j(com.waze.reports_v2.b.ae aeVar) {
        if (aeVar.ordinal() != 6) {
            this.f33849i = -1;
            return;
        }
        this.f33849i = 0;
        U(false);
        T();
        final ImageView imageView = (ImageView) this.r[this.f33849i].findViewById(R.id.reportGenericButtonImage);
        final TextView textView = (TextView) this.r[this.f33849i].findViewById(R.id.reportGenericButtonText);
        RtAlertsNativeManager.getInstance().getMapProblems(new com.waze.rtalerts.q() { // from class: com.waze.reports.bn
            @Override // com.waze.rtalerts.q
            public final void a(MapProblem[] mapProblemArr) {
                bp.l(this.f33708a, imageView, textView, mapProblemArr);
            }
        });
    }

    @Override // com.waze.reports.di
    protected final void m() {
        super.m();
        U(false);
    }

    @Override // com.waze.reports.di
    protected final void n() {
        if (this.f33849i == 0) {
            m();
        }
    }

    @Override // com.waze.reports.di
    public final void o() {
        L();
        if (this.f33849i == 0) {
            if (ConfigValues.CONFIG_VALUE_REPORTING_MAP_ISSUE_NEW_API_ENABLED.b().booleanValue()) {
                ((bm) com.waze.web.r.h(bm.class)).c(this.f33850j, this.s.getText().toString());
            } else {
                RtAlertsNativeManager.getInstance().reportMapIssue(this.s.getText().toString(), this.f33850j, true);
            }
            this.f33845e.D();
        }
    }

    @Override // com.waze.reports.di
    protected final void p() {
        U(true);
    }
}
