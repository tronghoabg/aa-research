package com.waze.settings;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.app.ActivityCompat;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SettingsCalendarSelectionActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f36676f = {"_id", "calendar_displayName", "account_name", "ownerAccount", "visible"};

    /* renamed from: h, reason: collision with root package name */
    private String[] f36678h;

    /* renamed from: k, reason: collision with root package name */
    private String f36679k;

    /* renamed from: l, reason: collision with root package name */
    private bo[] f36680l;
    private final com.waze.shared_infra.o.a m = com.waze.shared_infra.o.b.a();

    /* renamed from: g, reason: collision with root package name */
    private final NativeManager f36677g = NativeManager.getInstance();

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        setContentView(R.layout.settings_calendar_selection);
        ContentResolver contentResolver = getContentResolver();
        if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_CALENDAR") != 0) {
            com.waze.shared_infra.i.h.c("SettingsCalendarSelectionActivity has no permission to read calendars");
            finish();
            return;
        }
        Cursor cursorQuery = contentResolver.query(CalendarContract.Calendars.CONTENT_URI, f36676f, null, null, null);
        if (cursorQuery == null) {
            com.waze.shared_infra.i.h.c("SettingsCalendarSelectionActivity failed to query calendars");
            finish();
            return;
        }
        HashMap map = new HashMap();
        String strB = ConfigValues.CONFIG_VALUE_CALENDAR_EXCLUDED_CALENDAR_IDS.b();
        this.f36679k = strB;
        this.f36678h = strB.split(",");
        boolean zMoveToFirst = cursorQuery.moveToFirst();
        int i2 = 0;
        int i3 = 0;
        while (zMoveToFirst) {
            cursorQuery.getString(0);
            String string = cursorQuery.getString(1);
            String string2 = cursorQuery.getString(2);
            String string3 = cursorQuery.getString(3);
            if (!cursorQuery.getString(4).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                zMoveToFirst = cursorQuery.moveToNext();
            } else if (string3 == null || string2 == null) {
                com.waze.shared_infra.i.h.j("Calendar: skipping account. ownerAccount is " + string3 + ", account is " + string2 + ",displayName is " + string);
                zMoveToFirst = cursorQuery.moveToNext();
            } else {
                boolean zEquals = string3.equals(string2);
                if (zEquals) {
                    string = this.m.c(R.string.CALENDAR_SELECTION_MAIN_CALENDAR, new Object[0]);
                    i2++;
                } else {
                    i3++;
                }
                bo boVar = new bo(this, string, string2, string3);
                boVar.f36895e = true;
                boVar.f36894d = zEquals;
                int i4 = 0;
                while (true) {
                    String[] strArr = this.f36678h;
                    if (i4 >= strArr.length) {
                        break;
                    }
                    String[] strArrSplit = strArr[i4].split("//");
                    if (strArrSplit.length == 2 && strArrSplit[0].equals(boVar.f36892b) && strArrSplit[1].equals(boVar.f36893c)) {
                        boVar.f36895e = false;
                    }
                    i4++;
                }
                String str = boVar.f36892b;
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str, arrayList);
                }
                arrayList.add(boVar);
                zMoveToFirst = cursorQuery.moveToNext();
            }
        }
        this.f36680l = new bo[i2 + i2 + i3 + 1];
        int i5 = 0;
        for (String str2 : map.keySet()) {
            ArrayList arrayList2 = (ArrayList) map.get(str2);
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                bo boVar2 = (bo) arrayList2.get(i6);
                if (boVar2.f36894d) {
                    String str3 = boVar2.f36892b;
                    bo boVar3 = new bo(this, str3, str3, boVar2.f36893c);
                    boVar3.f36896f = true;
                    bo[] boVarArr = this.f36680l;
                    int i7 = i5 + 1;
                    boVarArr[i5] = boVar3;
                    i5 += 2;
                    boVarArr[i7] = boVar2;
                }
            }
            ArrayList arrayList3 = (ArrayList) map.get(str2);
            int size2 = arrayList3.size();
            for (int i8 = 0; i8 < size2; i8++) {
                bo boVar4 = (bo) arrayList3.get(i8);
                if (!boVar4.f36894d) {
                    this.f36680l[i5] = boVar4;
                    i5++;
                }
            }
        }
        this.f36680l[i5] = new bo(this, "", "", "");
        this.f36680l[i5].f36896f = true;
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        titleBar.c(this.m.c(R.string.CALENDAR_SETTINGS_CALENDARS, new Object[0]));
        titleBar.m(new com.waze.planned_drive.af(this, 13));
        titleBar.n(new com.waze.planned_drive.af(this, 14));
        ListView listView = (ListView) findViewById(R.id.calendarsListView);
        listView.setAdapter((ListAdapter) new bn(this));
        com.waze.shared_infra.g.e.d((ViewGroup) findViewById(R.id.calendarsRelativeLayout), listView);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            bo[] boVarArr = this.f36680l;
            if (i2 >= boVarArr.length) {
                break;
            }
            bo boVar = boVarArr[i2];
            if (boVar != null && !boVar.f36895e && !boVar.f36896f) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(com.waze.l.m.k(boVar.f36892b, boVar.f36893c));
            }
            i2++;
        }
        String string = sb.toString();
        if (!string.equals(this.f36679k)) {
            this.f36677g.setExcludedCalendarsNTV(string);
        }
        super.onDestroy();
    }
}
