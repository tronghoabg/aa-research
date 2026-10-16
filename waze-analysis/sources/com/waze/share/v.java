package com.waze.share;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.lm;
import com.waze.main.navigate.LocationData;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.z.a.d.ai;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends com.waze.sharedui.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static v f37736a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f37737b;

    /* renamed from: c, reason: collision with root package name */
    private final z f37738c;

    /* renamed from: d, reason: collision with root package name */
    private final AddressItem f37739d;

    /* renamed from: e, reason: collision with root package name */
    private Intent f37740e;

    /* renamed from: f, reason: collision with root package name */
    private PackageManager f37741f;

    /* renamed from: g, reason: collision with root package name */
    private ResolveInfo f37742g;

    /* renamed from: h, reason: collision with root package name */
    private LocationData f37743h;

    /* renamed from: i, reason: collision with root package name */
    private List f37744i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f37745j;

    public v(Activity activity, z zVar, AddressItem addressItem) {
        super(activity);
        this.f37744i = new ArrayList();
        this.f37745j = com.waze.shared_infra.o.b.a();
        this.f37737b = activity;
        this.f37738c = zVar;
        this.f37739d = addressItem;
        setOwnerActivity(activity);
        StringTokenizer stringTokenizer = new StringTokenizer(ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_SEND_LOCATION_SUPPORTED_APPS), "|");
        this.f37744i.clear();
        while (stringTokenizer.hasMoreElements()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!TextUtils.isEmpty(strNextToken)) {
                this.f37744i.add(strNextToken);
            }
        }
    }

    public static /* synthetic */ h.ab k(v vVar, LocationData locationData) {
        if (locationData == null) {
            vVar.dismiss();
        } else {
            vVar.f37743h = locationData;
        }
        return h.ab.f48028a;
    }

    static /* bridge */ /* synthetic */ void p(v vVar) {
        LocationData locationData = vVar.f37743h;
        if (locationData != null) {
            NativeManager.getInstance().CreateSharedDrive(locationData.locationName, locationData.locationX, locationData.locationY, locationData.mStreet, locationData.mCity, null, locationData.mVenueId);
            return;
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = vVar.f37745j;
        oVar.Q(aVar.c(R.string.SOMETHING_WENT_WRONG, new Object[0]));
        oVar.P(aVar.c(R.string.PLEASE_TRY_AGAIN_LATER, new Object[0]));
        oVar.y(true);
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        ai.q(oVar);
    }

    public static void q() {
        v vVar = f37736a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    public static boolean t(String str) {
        v vVar = f37736a;
        if (vVar == null) {
            return false;
        }
        vVar.v(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str) {
        ResolveInfo resolveInfo = this.f37742g;
        z zVar = this.f37738c;
        if (resolveInfo == null) {
            aa.c(zVar, str, this.f37739d, null);
            dismiss();
        } else {
            aa.c(zVar, str, this.f37739d, new o(this, 0));
        }
        if (lm.d().c() != null) {
            lm.d().c().getWindow().setSoftInputMode(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w() {
        return this.f37738c == z.f37754a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x() {
        return !w();
    }

    @Override // com.waze.sharedui.d.a.d, android.support.v7.app.ap, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        f37736a = null;
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null || ownerActivity.isFinishing() || !isShowing()) {
            return;
        }
        super.dismiss();
    }

    @Override // com.waze.sharedui.d.a
    protected final void e() {
        if (w()) {
            com.waze.settings.h.c.c().a(h.f37710a, null);
        }
        if (x()) {
            com.waze.settings.h.c.c().c(h.f37710a, null);
        }
        cancel();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onBackPressed() {
        if (w()) {
            com.waze.settings.h.c.c().a(h.f37710a, null);
        } else {
            com.waze.settings.h.c.c().c(h.f37710a, null);
        }
        super.onBackPressed();
    }

    @Override // com.waze.sharedui.d.a, android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        int i2;
        int i3;
        int i4;
        int latitudeInt;
        AddressItem addressItem;
        super.onCreate(bundle);
        f37736a = this;
        int i5 = 2;
        if (w()) {
            i2 = 1;
        } else {
            z zVar = this.f37738c;
            if (zVar == z.f37757d) {
                i3 = 6;
            } else if (zVar == z.f37756c) {
                i3 = 3;
            } else if (zVar == z.f37758e) {
                i3 = 7;
            } else {
                i2 = 2;
            }
            i2 = i3;
        }
        if (w() || (addressItem = this.f37739d) == null) {
            i4 = 0;
            latitudeInt = 0;
        } else {
            int longitudeInt = addressItem.getLongitudeInt();
            latitudeInt = addressItem.getLatitudeInt();
            i4 = longitudeInt;
        }
        AddressItem addressItem2 = this.f37739d;
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getLocationData(i2, i4, latitudeInt, addressItem2 != null ? addressItem2.getId() : null, new com.waze.r.d(this, i5));
        aa.c(this.f37738c, null, addressItem2, new o(this, 1, null));
        setContentView(R.layout.share_selector_dialog);
        u(findViewById(R.id.shareDialogLayout));
        TextView textView = (TextView) findViewById(R.id.shareDialogTitle);
        TextView textView2 = (TextView) findViewById(R.id.shareDialogSubTitle);
        TextView textView3 = (TextView) findViewById(R.id.lblMoreSharingOptions);
        ImageView imageView = (ImageView) findViewById(R.id.shareDialogIcon);
        boolean zW = w();
        com.waze.shared_infra.o.a aVar = this.f37745j;
        if (zW) {
            textView.setText(aVar.c(R.string.SEND_LOCATION_SHEET_TITLE_DRIVE, new Object[0]));
            textView2.setText(aVar.c(R.string.SEND_LOCATION_SHEET_SUBTITLE_DRIVE, new Object[0]));
            imageView.setImageResource(R.drawable.sharedrive_modal_icon);
        } else {
            textView.setText(aVar.c(R.string.SEND_LOCATION_SHEET_TITLE_LOCATION, new Object[0]));
            textView2.setText(aVar.c(R.string.SEND_LOCATION_SHEET_SUBTITLE_LOCATION, new Object[0]));
            imageView.setImageResource(R.drawable.sharelocation_modal_icon);
        }
        textView3.setText(this.f37745j.c(R.string.SEND_LOCATION_SHEET_MORE_OPTIONS, new Object[0]));
        textView3.setPaintFlags(textView3.getPaintFlags() | 8);
        textView3.setOnClickListener(new n(this));
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        if (w()) {
            com.waze.settings.h.c.c().b();
        } else {
            com.waze.settings.h.c.c().d();
        }
    }
}
