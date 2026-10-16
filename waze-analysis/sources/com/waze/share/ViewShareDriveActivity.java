package com.waze.share;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.waze.R;
import com.waze.map.MapNativeManager;
import com.waze.map.MapViewChooser;
import com.waze.map.be;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.social.EndDriveData;
import com.waze.strings.DisplayStrings;
import com.waze.user.FriendUserData;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ViewShareDriveActivity extends com.waze.ifs.ui.a implements be {
    private int A;
    private int B;

    /* renamed from: f, reason: collision with root package name */
    private MapViewChooser f37682f;

    /* renamed from: g, reason: collision with root package name */
    private ViewGroup f37683g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f37684h;

    /* renamed from: k, reason: collision with root package name */
    private TextView f37685k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f37686l;
    private TextView m;
    private ViewGroup n;
    private FriendUserData o;
    private String p;
    private String q;
    private boolean s;
    private int v;
    private int z;
    private boolean r = true;
    private final com.waze.shared_infra.o.a t = com.waze.shared_infra.o.b.a();
    private boolean u = false;

    public static /* synthetic */ h.ab m(ViewShareDriveActivity viewShareDriveActivity, EndDriveData endDriveData) {
        boolean z;
        boolean z2 = false;
        if (endDriveData != null) {
            viewShareDriveActivity.q = !TextUtils.isEmpty(endDriveData.shareOwner) ? endDriveData.shareOwner : viewShareDriveActivity.t.c(R.string.RECEIVE_SHARE_DRIVE_ANONYMOUS_NAME, new Object[0]);
            if (TextUtils.isEmpty(endDriveData.shareOwner)) {
                viewShareDriveActivity.f37685k.setText(viewShareDriveActivity.t.c(R.string.RECEIVE_SHARE_DRIVE_NO_NAME_TITLE, new Object[0]));
            } else {
                viewShareDriveActivity.f37685k.setText(String.format(Locale.US, viewShareDriveActivity.t.c(R.string.SHARE_DRIVE_MAP_USER_NAME_PS, new Object[0]), viewShareDriveActivity.q));
            }
            viewShareDriveActivity.f37686l.setText(String.format(Locale.US, viewShareDriveActivity.t.c(R.string.SHARE_DRIVE_MAP_ADDRESS_PS, new Object[0]), endDriveData.address));
            z = true;
        } else {
            z = false;
        }
        if (viewShareDriveActivity.o != null) {
            TimeZone timeZone = Calendar.getInstance().getTimeZone();
            DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(viewShareDriveActivity);
            timeFormat.setTimeZone(timeZone);
            if (viewShareDriveActivity.o.mEtaSeconds > 0) {
                viewShareDriveActivity.m.setText(timeFormat.format(new Date(System.currentTimeMillis() + (viewShareDriveActivity.o.mEtaSeconds * 1000))));
                viewShareDriveActivity.n.setVisibility(0);
            } else {
                viewShareDriveActivity.n.setVisibility(8);
            }
            z2 = true;
        }
        if (!viewShareDriveActivity.s && z && z2) {
            viewShareDriveActivity.s = true;
            viewShareDriveActivity.y();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab n(ViewShareDriveActivity viewShareDriveActivity, FriendUserData friendUserData) {
        viewShareDriveActivity.o = friendUserData;
        viewShareDriveActivity.p();
        return h.ab.f48028a;
    }

    public static /* synthetic */ void s(ViewShareDriveActivity viewShareDriveActivity) {
        com.waze.sharedui.g.i iVar = new com.waze.sharedui.g.i(viewShareDriveActivity, String.format(Locale.US, viewShareDriveActivity.t.c(R.string.SHARE_DRIVE_MAP_MESSAGE_USER_PS, new Object[0]), viewShareDriveActivity.q), com.waze.sharedui.g.f.COLUMN_TEXT_ICON);
        iVar.k(new ab(viewShareDriveActivity, iVar));
        iVar.show();
    }

    public static /* synthetic */ WindowInsetsCompat v(ViewShareDriveActivity viewShareDriveActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        Insets insets2 = windowInsetsCompat.getInsets(2);
        Insets insets3 = windowInsetsCompat.getInsets(8);
        View viewFindViewById = view.findViewById(R.id.btnBack);
        View viewFindViewById2 = view.findViewById(R.id.detailsContent);
        View viewFindViewById3 = view.findViewById(R.id.detailsContainer);
        if (!viewShareDriveActivity.u) {
            viewShareDriveActivity.u = true;
            viewShareDriveActivity.v = viewFindViewById.getPaddingLeft();
            viewShareDriveActivity.z = viewFindViewById.getPaddingTop();
            viewShareDriveActivity.A = viewFindViewById2.getPaddingTop();
            viewShareDriveActivity.B = viewFindViewById2.getPaddingBottom();
        }
        viewFindViewById.setPadding(viewShareDriveActivity.v + insets.left, viewShareDriveActivity.z + insets.top, viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById3.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = insets2.left;
            marginLayoutParams.rightMargin = insets2.right;
            viewFindViewById3.setLayoutParams(marginLayoutParams);
        }
        viewFindViewById2.setPadding(viewFindViewById2.getPaddingLeft(), viewShareDriveActivity.A, viewFindViewById2.getPaddingRight() + insets2.right, viewShareDriveActivity.B + insets2.bottom + insets3.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    private final void x() {
        if (this.r) {
            return;
        }
        this.r = true;
        this.f37683g.animate().cancel();
        this.f37684h.animate().cancel();
        com.waze.view.anim.g.d(this.f37683g).translationY(this.f37683g.getMeasuredHeight()).setListener(com.waze.view.anim.g.b(this.f37683g));
        com.waze.view.anim.g.d(this.f37684h).alpha(0.0f).setListener(com.waze.view.anim.g.b(this.f37684h));
    }

    private final void y() {
        if (this.r && this.s) {
            this.r = false;
            this.f37683g.animate().cancel();
            this.f37684h.animate().cancel();
            this.f37683g.setVisibility(0);
            this.f37683g.setTranslationY(r1.getMeasuredHeight());
            this.f37684h.setAlpha(0.0f);
            this.f37684h.setVisibility(0);
            com.waze.view.anim.g.d(this.f37683g).translationY(0.0f).setListener(null);
            com.waze.view.anim.g.d(this.f37684h).alpha(1.0f).setListener(null);
        }
    }

    @Override // com.waze.map.be
    public final void a() {
        x();
    }

    @Override // com.waze.map.be
    public final void b() {
        if (this.r) {
            y();
        } else {
            x();
        }
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.r && this.s) {
            y();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aE();
        setContentView(R.layout.view_share_drive_layout);
        View viewFindViewById = findViewById(R.id.viewShareDriveContainer);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new com.waze.ui.k.n(this, viewFindViewById, 1));
        MapViewChooser mapViewChooser = (MapViewChooser) findViewById(R.id.shareDriveMapView);
        this.f37682f = mapViewChooser;
        mapViewChooser.d(getLifecycle());
        this.f37683g = (ViewGroup) findViewById(R.id.detailsContainer);
        this.f37684h = (ImageView) findViewById(R.id.btnBack);
        this.f37685k = (TextView) findViewById(R.id.lblUserName);
        this.f37686l = (TextView) findViewById(R.id.lblAddress);
        this.m = (TextView) findViewById(R.id.lblEtaValue);
        this.n = (ViewGroup) findViewById(R.id.etaContainer);
        TextView textView = (TextView) findViewById(R.id.lblEtaTitle);
        com.waze.shared_infra.o.a aVar = this.t;
        textView.setText(aVar.c(R.string.ETA, new Object[0]));
        ((TextView) findViewById(R.id.lblReply)).setText(aVar.c(R.string.REPLY, new Object[0]));
        findViewById(R.id.btnReply).setOnClickListener(new com.waze.profile.m(this, 6));
        findViewById(R.id.addressDetailsContainer).setOnClickListener(new com.waze.profile.m(this, 7));
        this.f37684h.setOnClickListener(new com.waze.profile.m(this, 8));
        this.p = getIntent().getExtras().getString("meeting");
        this.s = false;
        this.f37683g.setVisibility(4);
        this.f37684h.setAlpha(0.0f);
        ((ShareNativeManager) com.waze.web.r.h(ShareNativeManager.class)).getFriendFromMeeting(this.p, new com.waze.r.d(this, 3));
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onPause() {
        super.onPause();
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).unsetMeeting();
        MapNativeManager.getInstance().removeShareDriveCanvasListener(this);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onResume() {
        super.onResume();
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).setMeeting(this.p);
        MapNativeManager.getInstance().addShareDriveCanvasListener(this);
    }

    public final void p() {
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getFriendsDrivingData(this.p, new com.waze.r.d(this, 5));
    }

    public final void q(FriendUserData friendUserData) {
        this.o = friendUserData;
        p();
    }

    public final boolean r(String str) {
        String str2 = this.p;
        return str2 != null && str2.equals(str);
    }
}
