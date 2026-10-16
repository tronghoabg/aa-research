package com.waze.calendar;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.CalendarContract;
import androidx.core.app.ActivityCompat;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.webkit.ProxyConfig;
import com.waze.NativeManager;
import com.waze.OfflineNativeManager;
import com.waze.config.ConfigValues;
import h.a.r;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18765a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.coroutines.a f18766b;

    public e(Context context, com.waze.coroutines.a aVar, b bVar) {
        x.f(context, "appContext");
        x.f(aVar, "coroutineDispatcherProvider");
        x.f(bVar, "config");
        this.f18765a = context;
        this.f18766b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.calendar.e r17, android.database.Cursor r18, java.lang.String r19, java.util.Map r20, java.util.List r21, h.g.a.p r22, h.c.e r23) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.calendar.e.c(com.waze.calendar.e, android.database.Cursor, java.lang.String, java.util.Map, java.util.List, h.g.a.p, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ Map f(e eVar) {
        HashMap map = new HashMap();
        Context context = eVar.f18765a;
        ContentResolver contentResolver = context.getContentResolver();
        if (ActivityCompat.checkSelfPermission(context, "android.permission.READ_CALENDAR") != 0) {
            OfflineNativeManager.log("Calendar", "getEventToCalendarMap has no permission to read calendars", new Object[0]);
            return r.j();
        }
        Cursor cursorQuery = contentResolver.query(CalendarContract.Events.CONTENT_URI, f.b(), null, null, null);
        if (cursorQuery == null) {
            OfflineNativeManager.log("Calendar", "getEventToCalendarMap failed to query calendars", new Object[0]);
            return r.j();
        }
        for (boolean zMoveToFirst = cursorQuery.moveToFirst(); zMoveToFirst; zMoveToFirst = cursorQuery.moveToNext()) {
            String string = cursorQuery.getString(0);
            String string2 = cursorQuery.getString(1);
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        cursorQuery.close();
        return map;
    }

    public static final String g(Cursor cursor, String str) {
        x.f(cursor, "<this>");
        x.f(str, "columnName");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        OfflineNativeManager.log("Calendar", "Column " + str + " not found in cursor.", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List h() {
        List listH;
        ArrayList arrayList = new ArrayList();
        Context context = this.f18765a;
        ContentResolver contentResolver = context.getContentResolver();
        if (ActivityCompat.checkSelfPermission(context, "android.permission.READ_CALENDAR") != 0) {
            OfflineNativeManager.log("Calendar", "getIgnoredCalendarIds has no permission to read calendars", new Object[0]);
            return h.a.i.h();
        }
        try {
            Cursor cursorQuery = contentResolver.query(CalendarContract.Calendars.CONTENT_URI, f.a(), null, null, null);
            if (cursorQuery == null) {
                OfflineNativeManager.log("Calendar", "getIgnoredCalendarIds failed to query calendars", new Object[0]);
                return h.a.i.h();
            }
            String strB = ConfigValues.CONFIG_VALUE_CALENDAR_EXCLUDED_CALENDAR_IDS.b();
            x.e(strB, "getValue(...)");
            List listJ = new h.n.l(",").j(strB);
            if (listJ.isEmpty()) {
                listH = h.a.i.h();
            } else {
                ListIterator listIterator = listJ.listIterator(listJ.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listH = h.a.i.am(listJ, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listH = h.a.i.h();
            }
            String[] strArr = (String[]) listH.toArray(new String[0]);
            for (boolean zMoveToFirst = cursorQuery.moveToFirst(); zMoveToFirst; zMoveToFirst = cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                String string3 = cursorQuery.getString(2);
                String string4 = cursorQuery.getString(3);
                String strK = com.waze.l.m.k(string2, string3);
                if (string == null) {
                    OfflineNativeManager.log("Calendar", "DTNM:getIgnoredCalendarIds: null Calendar ID, ignoring event", new Object[0]);
                } else if (x.n(string4, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (x.n(strArr[i2], strK)) {
                            arrayList.add(string);
                            break;
                        }
                        i2++;
                    }
                } else {
                    arrayList.add(string);
                }
            }
            cursorQuery.close();
            return h.a.i.ao(arrayList);
        } catch (Exception e2) {
            e2.toString();
            OfflineNativeManager.log("Calendar", "getIgnoredCalendarIds exception ".concat(e2.toString()), new Object[0]);
            return h.a.i.h();
        }
    }

    private static final String i(String str) {
        String pushInstallationUUID;
        if (OfflineNativeManager.isOfflineMode()) {
            pushInstallationUUID = OfflineNativeManager.getInstance().getPushInstallationUUID();
            x.c(pushInstallationUUID);
        } else {
            pushInstallationUUID = NativeManager.getInstance().getPushInstallationUUID();
            x.c(pushInstallationUUID);
        }
        return pushInstallationUUID + ProxyConfig.MATCH_ALL_SCHEMES + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x011a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.ai b(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.calendar.e.b(java.lang.String):com.waze.ai");
    }

    public final Object d(int i2, int i3, String str, p pVar, h.c.e eVar) {
        return aj.v(this.f18766b.a(), new c(this, i2, i3, str, pVar, null), eVar);
    }
}
