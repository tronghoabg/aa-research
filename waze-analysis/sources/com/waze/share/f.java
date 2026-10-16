package com.waze.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.lm;
import com.waze.sharedui.views.OvalButton;
import com.waze.user.FriendUserData;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends com.waze.sharedui.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static e f37702a;

    /* renamed from: b, reason: collision with root package name */
    private String f37703b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37704c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37705d;

    /* renamed from: e, reason: collision with root package name */
    private final String f37706e;

    /* renamed from: f, reason: collision with root package name */
    private final String f37707f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f37708g;

    public f(Context context, String str, String str2, String str3, String str4, String str5) {
        super(context);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        this.f37708g = aVarA;
        this.f37707f = str;
        this.f37703b = str2;
        this.f37704c = str3;
        this.f37705d = str4;
        this.f37706e = str5;
        if (TextUtils.isEmpty(str2)) {
            this.f37703b = aVarA.c(R.string.RECEIVE_SHARE_DRIVE_ANONYMOUS_NAME, new Object[0]);
        }
    }

    public static void b(String str) {
        e eVar = new e(str);
        f37702a = eVar;
        e.d(eVar);
    }

    public static void f(FriendUserData friendUserData) {
        e eVar = f37702a;
        if (eVar != null) {
            e.e(eVar, friendUserData);
        }
    }

    public static /* synthetic */ void g(f fVar) {
        j(fVar.f37707f);
        fVar.dismiss();
    }

    public static /* synthetic */ void h(f fVar) {
        NativeManager.getInstance().HideAlertTickerByMeetingId(fVar.f37707f);
        fVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(String str) {
        Intent intent = new Intent(lm.d().e(), (Class<?>) ViewShareDriveActivity.class);
        intent.putExtra("meeting", str);
        lm.d().e().startActivityForResult(intent, 0);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onBackPressed() {
        NativeManager.getInstance().HideAlertTickerByMeetingId(this.f37707f);
        super.onBackPressed();
    }

    @Override // com.waze.sharedui.d.a, android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.receive_share_preview);
        TextView textView = (TextView) findViewById(R.id.lblLive);
        TextView textView2 = (TextView) findViewById(R.id.lblReceiveShareName);
        TextView textView3 = (TextView) findViewById(R.id.lblReceiveShareAddress);
        TextView textView4 = (TextView) findViewById(R.id.lblArrivingAt);
        TextView textView5 = (TextView) findViewById(R.id.lblReceiveShareEta);
        TextView textView6 = (TextView) findViewById(R.id.lblReceiveShareDetails);
        TextView textView7 = (TextView) findViewById(R.id.lblReceiveShareCancel);
        TextView textView8 = (TextView) findViewById(R.id.lblReceiveShareViewDrive);
        OvalButton ovalButton = (OvalButton) findViewById(R.id.btnReceiveShareCancel);
        OvalButton ovalButton2 = (OvalButton) findViewById(R.id.btnReceiveShareViewDrive);
        ImageView imageView = (ImageView) findViewById(R.id.imgReceiveShareProfileImage);
        View viewFindViewById = findViewById(R.id.shareDialogLayout);
        if (viewFindViewById != null) {
            u(viewFindViewById);
        }
        com.waze.shared_infra.o.a aVar = this.f37708g;
        textView.setText(aVar.c(R.string.RECEIVE_SHARE_DRIVE_LIVE, new Object[0]));
        textView7.setText(aVar.c(R.string.RECEIVE_SHARE_DRIVE_CLOSE, new Object[0]));
        textView8.setText(aVar.c(R.string.RECEIVE_SHARE_DRIVE_VIEW_DRIVE, new Object[0]));
        textView4.setText(aVar.c(R.string.RECEIVE_SHARE_DRIVE_ARRIVING_AT, new Object[0]));
        String str = String.format(Locale.US, aVar.c(R.string.RECEIVE_SHARE_DRIVE_WAZER_DRIVING_TO_PS, new Object[0]), this.f37703b);
        String strC = aVar.c(R.string.RECEIVE_SHARE_DRIVE_DETAILS_TEXT_PS_PS, new Object[0]);
        Locale locale = Locale.US;
        String str2 = this.f37703b;
        String str3 = String.format(locale, strC, str2, str2);
        textView2.setText(str);
        textView6.setText(str3);
        textView3.setText(this.f37705d);
        textView5.setText(this.f37706e);
        String str4 = this.f37704c;
        if (!TextUtils.isEmpty(str4)) {
            com.waze.utils.i.a().c(str4, new a(this, imageView));
        }
        ovalButton.setOnClickListener(new com.waze.profile.m(this, 4));
        ovalButton2.setOnClickListener(new com.waze.profile.m(this, 5));
    }
}
