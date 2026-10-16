package com.waze.share;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.webkit.internal.AssetHelper;
import com.waze.R;
import com.waze.ht;
import com.waze.main.navigate.LocationData;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private static LocationData f37688a;

    /* renamed from: b, reason: collision with root package name */
    private static int f37689b;

    /* renamed from: c, reason: collision with root package name */
    private static String f37690c;

    /* renamed from: d, reason: collision with root package name */
    private static String f37691d;

    /* renamed from: e, reason: collision with root package name */
    private static String f37692e;

    public static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", str);
        return Intent.createChooser(intent, null);
    }

    static /* synthetic */ h.ab b(com.waze.shared_infra.o.a aVar, AddressItem addressItem, String str, z zVar, ht htVar, LocationData locationData) {
        f37688a = locationData;
        if (locationData != null) {
            String strB = f37690c;
            if (strB == null || strB.isEmpty()) {
                strB = aVar.b(locationData.destinationName);
            }
            if (strB.isEmpty()) {
                strB = f37688a.locationName;
            }
            int i2 = f37689b;
            int i3 = 0;
            if (i2 == 2) {
                if (strB.equalsIgnoreCase(aVar.c(R.string.HOME, new Object[0])) || strB.equalsIgnoreCase(aVar.c(R.string.TO_HOME, new Object[0]))) {
                    strB = aVar.c(R.string.HOME, new Object[0]);
                } else if (strB.equalsIgnoreCase(aVar.c(R.string.WORK, new Object[0])) || strB.equalsIgnoreCase(aVar.c(R.string.TO_WORK, new Object[0]))) {
                    strB = aVar.c(R.string.WORK, new Object[0]);
                }
            } else if (i2 == 6) {
                strB = addressItem.getAddress();
            }
            if (str == null || str.isEmpty()) {
                LocationData locationData2 = f37688a;
                str = locationData2.smsLocationUrlPrefix + "/h" + locationData2.locationHash;
            }
            String str2 = "";
            if (strB == null) {
                com.waze.shared_infra.i.h.j("ShareUtility: building share strings for null destination.");
                strB = "";
            }
            int i4 = f37689b;
            if (i4 == 1 || zVar == z.f37754a) {
                f37691d = aVar.c(R.string.SEND_DRIVE_EMAIL_SUBJECT, new Object[0]);
                String str3 = f37688a.locationEta;
                if (str3 == null) {
                    com.waze.shared_infra.i.h.j("ShareUtility: building share strings for null eta text.");
                } else {
                    str2 = str3;
                }
                f37692e = aVar.c(R.string.SEND_DRIVE_EMAIL_BODY_NAMED_PS_PS_PS, new Object[0]).replace("<LINK>", str).replace("<ADDRESS>", strB).replace("<ETA>", str2);
            } else if (i4 == 2 || i4 == 3) {
                f37691d = aVar.c(R.string.SEND_LOCATION_EMAIL_SUBJECT, new Object[0]);
                f37692e = aVar.c(R.string.SEND_LOCATION_EMAIL_BODY_NAMED_PS_PS, new Object[0]).replace("<LINK>", str).replace("<ADDRESS>", strB);
            } else if (i4 == 7) {
                f37691d = aVar.c(R.string.SEND_LOCATION_ASSISTANCE_EMAIL_SUBJECT, new Object[0]);
                f37692e = aVar.c(R.string.SEND_LOCATION_ASSISTANCE_EMAIL_BODY_PS_PS, strB, str);
            } else if (zVar == z.f37757d) {
                f37691d = aVar.c(R.string.SEND_PARKED_LOCATION_DISPLAY_TEXT_PS, strB);
                f37692e = aVar.c(R.string.SEND_PARKED_LOCATION_EMAIL_BODY_PS_PS_PS, strB, str, f37688a.downloadUrl);
            }
            if (htVar == null) {
                d(f37691d, f37692e, new w(aVar, i3));
            } else {
                d(f37691d, f37692e, htVar);
            }
        }
        return h.ab.f48028a;
    }

    public static void c(final z zVar, final String str, final AddressItem addressItem, final ht htVar) {
        int longitudeInt;
        int latitudeInt;
        f37688a = null;
        final com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        if (addressItem != null) {
            String title = addressItem.getTitle();
            f37690c = title;
            if (title.equals("")) {
                f37690c = addressItem.getAddress();
            }
        }
        if (f37690c == null) {
            f37690c = "";
        }
        z zVar2 = z.f37754a;
        if (zVar == zVar2 || addressItem == null) {
            longitudeInt = 0;
            latitudeInt = 0;
        } else {
            longitudeInt = addressItem.getLongitudeInt();
            latitudeInt = addressItem.getLatitudeInt();
        }
        int i2 = zVar == zVar2 ? 1 : zVar == z.f37757d ? 6 : zVar == z.f37756c ? 3 : zVar == z.f37758e ? 7 : 2;
        f37689b = i2;
        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class);
        String id = addressItem != null ? addressItem.getId() : null;
        f37691d = "";
        f37692e = "";
        driveToNativeManager.getLocationData(i2, longitudeInt, latitudeInt, id, new h.g.a.l() { // from class: com.waze.share.x
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return aa.b(aVarA, addressItem, str, zVar, htVar, (LocationData) obj);
            }
        });
    }

    public static void d(String str, String str2, ht htVar) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.putExtra("exit_on_sent", true);
        htVar.a(intent);
    }

    public static void e(ComponentActivity componentActivity, z zVar, AddressItem addressItem) {
        if (zVar == z.f37755b && addressItem != null) {
            com.waze.shared_infra.i.h.c("shareLocationOrDrive: ShareLocation requested but a location was passed, probably meant ShareSelection");
        }
        if (componentActivity != null) {
            v vVar = new v(componentActivity, zVar, addressItem);
            componentActivity.getLifecycle().addObserver(new y(vVar));
            vVar.show();
        }
    }

    public static void f(z zVar, String str) {
        c(zVar, str, null, null);
    }
}
