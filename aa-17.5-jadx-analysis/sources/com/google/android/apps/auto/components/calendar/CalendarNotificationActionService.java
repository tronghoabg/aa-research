package com.google.android.apps.auto.components.calendar;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import defpackage.ebf;
import defpackage.kgo;
import defpackage.kgu;
import defpackage.mkn;
import defpackage.mpe;
import defpackage.rrc;
import defpackage.woy;
import defpackage.ype;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CalendarNotificationActionService extends IntentService {
    public CalendarNotificationActionService() {
        super("CalendarNotificationActionService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent != null) {
            kgu.c();
            ((ype) ((ype) kgu.a.f()).ai((char) 3072)).y("handleAction, type=%s", intent.getAction());
            if ("action_navigate".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("key_location");
                stringExtra.getClass();
                yzz yzzVar = (yzz) intent.getSerializableExtra("key_telemetry_context");
                yzzVar.getClass();
                woy.aa(intent.hasExtra("key_is_work_data"), "Navigate action does not have isWorkData tag");
                boolean booleanExtra = intent.getBooleanExtra("key_is_work_data", false);
                kgo.c();
                kgo.a(stringExtra, yzzVar, booleanExtra);
                return;
            }
            if ("action_call".equals(intent.getAction())) {
                CalendarEventPhoneNumber calendarEventPhoneNumber = (CalendarEventPhoneNumber) intent.getParcelableExtra("key_phone_number");
                calendarEventPhoneNumber.getClass();
                yzz yzzVar2 = (yzz) intent.getSerializableExtra("key_telemetry_context");
                yzzVar2.getClass();
                kgo.c();
                kgo.b(calendarEventPhoneNumber, yzzVar2, "android.intent.action.DIAL");
                return;
            }
            if (!"action_call_disambiguate".equals(intent.getAction())) {
                if ("action_open_app".equals(intent.getAction())) {
                    yzz yzzVar3 = (yzz) intent.getSerializableExtra("key_telemetry_context");
                    yzzVar3.getClass();
                    kgo.c();
                    ((ype) ((ype) kgo.a.f()).ai((char) 3067)).u("Opening Calendar app");
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar3, yzy.sX).l());
                    Intent intent2 = new Intent();
                    intent2.setComponent(mkn.p);
                    mpe.a().i(intent2);
                    return;
                }
                return;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_phone_number_list");
            parcelableArrayListExtra.getClass();
            yzz yzzVar4 = (yzz) intent.getSerializableExtra("key_telemetry_context");
            yzzVar4.getClass();
            kgo.c();
            ((ype) ((ype) kgo.a.f()).ai((char) 3068)).w("Opening Calendar app to phone disambiguation (%d phone numbers)", parcelableArrayListExtra.size());
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar4, yzy.sX).l());
            Intent intent3 = new Intent();
            intent3.setComponent(mkn.p);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("key_phone_number_list", new ArrayList<>(parcelableArrayListExtra));
            intent3.putExtra("key_calendar_intent_bundle", bundle);
            mpe.a().i(intent3);
        }
    }
}
