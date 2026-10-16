package com.dexterous.flutterlocalnotifications;

import A7.AbstractC0279p0;
import X0.AbstractC1274b;
import X0.C;
import X0.C1282j;
import X0.C1286n;
import X0.C1287o;
import X0.C1289q;
import X0.D;
import X0.G;
import X0.N;
import X0.Q;
import X0.T;
import a2.C1323c;
import a2.v;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import b7.k;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C1774u;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import j5.C3080a;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import la.C3450a;
import la.l;
import la.t;
import la.u;
import oc.C3665d;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import q.s1;
import qa.C3883a;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import uc.InterfaceC4283t;
import uc.InterfaceC4284u;
import uc.InterfaceC4285v;

@Keep
/* loaded from: classes3.dex */
public class FlutterLocalNotificationsPlugin implements InterfaceC4279p, InterfaceC4284u, InterfaceC4285v, InterfaceC4283t, InterfaceC3885b, InterfaceC3964a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ALL_PENDING_NOTIFICATIONS_METHOD = "cancelAllPendingNotifications";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    static final int FULL_SCREEN_INTENT_PERMISSION_REQUEST_CODE = 3;
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String HAS_NOTIFICATION_POLICY_ACCESS_METHOD = "hasNotificationPolicyAccess";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    static final int NOTIFICATION_POLICY_ACCESS_REQUEST_CODE = 4;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    static final String NOTIFICATION_TAG = "notificationTag";
    static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERIODICALLY_SHOW_WITH_DURATION_METHOD = "periodicallyShowWithDuration";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = "requestExactAlarmsPermission";
    private static final String REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD = "requestFullScreenIntentPermission";
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = "requestNotificationsPermission";
    private static final String REQUEST_NOTIFICATION_POLICY_ACCESS_METHOD = "requestNotificationPolicyAccess";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static l gson;
    private Context applicationContext;
    private i callback;
    private C4281r channel;
    private Activity mainActivity;
    private f permissionRequestProgress = f.f26225a;

    public class a extends C3883a<ArrayList<NotificationDetails>> {
    }

    private static void applyGrouping(NotificationDetails notificationDetails, C1289q c1289q) {
        if (StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            return;
        }
        c1289q.f15891s = notificationDetails.groupKey;
        if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
            c1289q.f15892t = true;
        }
        c1289q.f15869E = notificationDetails.groupAlertBehavior.intValue();
    }

    private void areNotificationsEnabled(InterfaceC4280q interfaceC4280q) {
        interfaceC4280q.a(Boolean.valueOf(getNotificationManager(this.applicationContext).a()));
    }

    public static l buildGson() {
        if (gson == null) {
            RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class);
            Excluder excluder = Excluder.f27385c;
            C3450a c3450a = la.h.f40184a;
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            la.i iVar = l.k;
            t tVar = l.f40194m;
            u uVar = l.f40195n;
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayList.add(C1774u.e(new C3883a(ScheduleMode.class), new ScheduleMode.Deserializer()));
            Objects.requireNonNull(runtimeTypeAdapterFactoryRegisterSubtype);
            arrayList.add(runtimeTypeAdapterFactoryRegisterSubtype);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
            arrayList3.addAll(arrayList);
            Collections.reverse(arrayList3);
            ArrayList arrayList4 = new ArrayList(arrayList2);
            Collections.reverse(arrayList4);
            arrayList3.addAll(arrayList4);
            boolean z2 = com.google.gson.internal.sql.c.f27507a;
            gson = new l(excluder, c3450a, new HashMap(map), iVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, tVar, uVar, new ArrayList(arrayDeque));
        }
        return gson;
    }

    private static Q buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        boolean value = BooleanUtils.getValue(personDetails.bot);
        Object obj = personDetails.icon;
        IconCompat iconFromSource = (obj == null || (iconSource = personDetails.iconBitmapSource) == null) ? null : getIconFromSource(context, obj, iconSource);
        boolean value2 = BooleanUtils.getValue(personDetails.important);
        String str = personDetails.key;
        if (str == null) {
            str = null;
        }
        String str2 = personDetails.name;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = personDetails.uri;
        String str4 = str3 != null ? str3 : null;
        Q q4 = new Q();
        q4.f15813a = str2;
        q4.f15814b = iconFromSource;
        q4.f15815c = str4;
        q4.f15816d = str;
        q4.f15817e = value;
        q4.f15818f = value2;
        return q4;
    }

    private static long calculateNextNotificationTrigger(long j8, long j10) {
        while (j8 < System.currentTimeMillis()) {
            j8 += j10;
        }
        return j8;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        if (notificationDetails.repeatIntervalMilliseconds != null) {
            return r0.intValue();
        }
        int i5 = d.f26221a[notificationDetails.repeatInterval.ordinal()];
        if (i5 == 1) {
            return 60000L;
        }
        if (i5 == 2) {
            return 3600000L;
        }
        if (i5 != 3) {
            return i5 != 4 ? 0L : 604800000L;
        }
        return 86400000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannelAction notificationChannelAction;
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(notificationChannelDetails.f26239id);
        return Boolean.valueOf((notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) || (notificationChannel != null && notificationChannelDetails.channelAction == NotificationChannelAction.Update));
    }

    private void cancel(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        Map map = (Map) c4278o.f46760b;
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        interfaceC4280q.a(null);
    }

    private void cancelAllNotifications(InterfaceC4280q interfaceC4280q) {
        getNotificationManager(this.applicationContext).f15812b.cancelAll();
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (arrayListLoadScheduledNotifications == null || arrayListLoadScheduledNotifications.isEmpty()) {
            interfaceC4280q.a(null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().f26241id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        interfaceC4280q.a(null);
    }

    private void cancelAllPendingNotifications(InterfaceC4280q interfaceC4280q) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (arrayListLoadScheduledNotifications == null || arrayListLoadScheduledNotifications.isEmpty()) {
            interfaceC4280q.a(null);
            return;
        }
        AlarmManager alarmManager = getAlarmManager(this.applicationContext);
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            alarmManager.cancel(getBroadcastPendingIntent(this.applicationContext, it.next().f26241id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        interfaceC4280q.a(null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class)));
        N notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.b(num.intValue(), null);
        } else {
            notificationManager.b(num.intValue(), str);
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            bArr[i5] = (byte) ((Double) arrayList.get(i5)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
            throw new e();
        }
    }

    private static C createMessage(Context context, MessageDetails messageDetails) {
        String str;
        C c10 = new C(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (str2 != null && (str = messageDetails.dataMimeType) != null) {
            Uri uri = Uri.parse(str2);
            c10.f15780e = str;
            c10.f15781f = uri;
        }
        return c10;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        Intent intent;
        int i5;
        PendingIntent broadcast;
        IconSource iconSource;
        NotificationChannelDetails notificationChannelDetailsFromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, notificationChannelDetailsFromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, notificationChannelDetailsFromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(NOTIFICATION_ID, notificationDetails.f26241id);
        launchIntent.putExtra(PAYLOAD, notificationDetails.payload);
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.f26241id.intValue(), launchIntent, 201326592);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        C1289q c1289q = new C1289q(context, notificationDetails.channelId);
        c1289q.f15878e = C1289q.b(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title);
        c1289q.f15879f = C1289q.b(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body);
        c1289q.f15871G.tickerText = C1289q.b(notificationDetails.ticker);
        c1289q.c(16, BooleanUtils.getValue(notificationDetails.autoCancel));
        c1289q.f15880g = activity;
        c1289q.k = notificationDetails.priority.intValue();
        c1289q.c(2, BooleanUtils.getValue(notificationDetails.ongoing));
        c1289q.f15872H = BooleanUtils.getValue(notificationDetails.silent);
        c1289q.c(8, BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        int i10 = 0;
        if (notificationDetails.actions != null) {
            int iIntValue = notificationDetails.f26241id.intValue() * 16;
            for (NotificationAction notificationAction : notificationDetails.actions) {
                IconCompat iconFromSource = (TextUtils.isEmpty(notificationAction.icon) || (iconSource = notificationAction.iconSource) == null) ? null : getIconFromSource(context, notificationAction.icon, iconSource);
                Boolean bool = notificationAction.showsUserInterface;
                if (bool == null || !bool.booleanValue()) {
                    intent = new Intent(context, (Class<?>) ActionBroadcastReceiver.class);
                    intent.setAction("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED");
                } else {
                    intent = getLaunchIntent(context);
                    intent.setAction(SELECT_FOREGROUND_NOTIFICATION_ACTION);
                }
                intent.putExtra(NOTIFICATION_ID, notificationDetails.f26241id).putExtra(NOTIFICATION_TAG, notificationDetails.tag).putExtra(ACTION_ID, notificationAction.f26238id).putExtra(CANCEL_NOTIFICATION, notificationAction.cancelNotification).putExtra(PAYLOAD, notificationDetails.payload);
                List<C3080a> list = notificationAction.actionInputs;
                int i11 = (list == null || list.isEmpty()) ? 201326592 : Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                Boolean bool2 = notificationAction.showsUserInterface;
                if (bool2 == null || !bool2.booleanValue()) {
                    i5 = iIntValue + 1;
                    broadcast = PendingIntent.getBroadcast(context, iIntValue, intent, i11);
                } else {
                    i5 = iIntValue + 1;
                    broadcast = PendingIntent.getActivity(context, iIntValue, intent, i11);
                }
                SpannableString spannableString = new SpannableString(notificationAction.title);
                if (notificationAction.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(notificationAction.titleColor.intValue()), i10, spannableString.length(), i10);
                }
                C1282j c1282j = new C1282j(iconFromSource, spannableString, broadcast);
                Boolean bool3 = notificationAction.contextual;
                if (bool3 != null) {
                    c1282j.f15848i = bool3.booleanValue();
                }
                Boolean bool4 = notificationAction.showsUserInterface;
                if (bool4 != null) {
                    c1282j.f15847h = bool4.booleanValue();
                }
                Boolean bool5 = notificationAction.allowGeneratedReplies;
                if (bool5 != null) {
                    c1282j.f15843d = bool5.booleanValue();
                }
                Integer num = notificationAction.semanticAction;
                if (num != null) {
                    c1282j.f15846g = num.intValue();
                }
                List<C3080a> list2 = notificationAction.actionInputs;
                if (list2 != null) {
                    for (C3080a c3080a : list2) {
                        HashSet hashSet = new HashSet();
                        Bundle bundle = new Bundle();
                        String str = c3080a.f38632c;
                        Boolean bool6 = c3080a.f38631b;
                        boolean zBooleanValue = bool6 != null ? bool6.booleanValue() : true;
                        List list3 = c3080a.f38633d;
                        if (list3 != null) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                hashSet.add((String) it.next());
                            }
                        }
                        List list4 = c3080a.f38630a;
                        T t10 = new T(str, list4 != null ? (CharSequence[]) list4.toArray(new CharSequence[0]) : null, zBooleanValue, bundle, hashSet);
                        if (c1282j.f15845f == null) {
                            c1282j.f15845f = new ArrayList();
                        }
                        c1282j.f15845f.add(t10);
                        i10 = 0;
                    }
                }
                int i12 = i10;
                if (notificationAction.invisible.booleanValue()) {
                    c1289q.f15877d.add(c1282j.a());
                } else {
                    c1289q.f15875b.add(c1282j.a());
                }
                i10 = i12;
                iIntValue = i5;
            }
        }
        int i13 = i10;
        setSmallIcon(context, notificationDetails, c1289q);
        c1289q.d(getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource));
        Integer num2 = notificationDetails.color;
        if (num2 != null) {
            c1289q.f15898z = num2.intValue();
        }
        Boolean bool7 = notificationDetails.colorized;
        if (bool7 != null) {
            c1289q.f15894v = bool7.booleanValue();
            c1289q.f15895w = true;
        }
        Boolean bool8 = notificationDetails.showWhen;
        if (bool8 != null) {
            c1289q.f15884l = BooleanUtils.getValue(bool8);
        }
        Long l10 = notificationDetails.when;
        if (l10 != null) {
            c1289q.f15871G.when = l10.longValue();
        }
        Boolean bool9 = notificationDetails.usesChronometer;
        if (bool9 != null) {
            c1289q.f15885m = bool9.booleanValue();
        }
        Boolean bool10 = notificationDetails.chronometerCountDown;
        if (bool10 != null && Build.VERSION.SDK_INT >= 24) {
            boolean zBooleanValue2 = bool10.booleanValue();
            if (c1289q.f15897y == null) {
                c1289q.f15897y = new Bundle();
            }
            c1289q.f15897y.putBoolean("android.chronometerCountDown", zBooleanValue2);
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            c1289q.f15881h = activity;
            c1289q.c(128, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            c1289q.f15867C = notificationDetails.shortcutId;
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            c1289q.f15887o = C1289q.b(notificationDetails.subText);
        }
        Integer num3 = notificationDetails.number;
        if (num3 != null) {
            c1289q.f15883j = num3.intValue();
        }
        setVisibility(notificationDetails, c1289q);
        applyGrouping(notificationDetails, c1289q);
        setSound(context, notificationDetails, c1289q);
        setVibrationPattern(notificationDetails, c1289q);
        setLights(notificationDetails, c1289q);
        setStyle(context, notificationDetails, c1289q);
        setProgress(notificationDetails, c1289q);
        setCategory(notificationDetails, c1289q);
        setTimeoutAfter(notificationDetails, c1289q);
        Notification notificationA = c1289q.a();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            for (int i14 = i13; i14 < length; i14++) {
                notificationA.flags = iArr[i14] | notificationA.flags;
            }
        }
        return notificationA;
    }

    private void createNotificationChannel(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) c4278o.f46760b));
        interfaceC4280q.a(null);
    }

    private void createNotificationChannelGroup(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            NotificationChannelGroupDetails notificationChannelGroupDetailsFrom = NotificationChannelGroupDetails.from((Map) c4278o.f46760b);
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            com.dexterous.flutterlocalnotifications.a.n();
            NotificationChannelGroup notificationChannelGroupF = com.dexterous.flutterlocalnotifications.a.f(notificationChannelGroupDetailsFrom.f26240id, notificationChannelGroupDetailsFrom.name);
            if (i5 >= 28) {
                notificationChannelGroupF.setDescription(notificationChannelGroupDetailsFrom.description);
            }
            notificationManager.createNotificationChannelGroup(notificationChannelGroupF);
        }
        interfaceC4280q.a(null);
    }

    private void deleteNotificationChannel(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) c4278o.f46760b);
        }
        interfaceC4280q.a(null);
    }

    private void deleteNotificationChannelGroup(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) c4278o.f46760b);
        }
        interfaceC4280q.a(null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) throws Resources.NotFoundException {
        IconSource iconSource;
        String resourceEntryName;
        if (iconCompat == null) {
            return null;
        }
        int iW = iconCompat.f18067a;
        if (iW == -1) {
            iW = Fe.c.w(iconCompat.f18068b);
        }
        if (iW == 2) {
            iconSource = IconSource.DrawableResource;
            resourceEntryName = this.applicationContext.getResources().getResourceEntryName(iconCompat.h());
        } else {
            if (iW != 4) {
                return null;
            }
            iconSource = IconSource.ContentUri;
            resourceEntryName = iconCompat.i().toString();
        }
        HashMap map = new HashMap();
        map.put("source", Integer.valueOf(iconSource.ordinal()));
        map.put(JsonStorageKeyNames.DATA_KEY, resourceEntryName);
        return map;
    }

    private Map<String, Object> describePerson(Q q4) {
        if (q4 == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, q4.f15816d);
        map.put(MediationMetaData.KEY_NAME, q4.f15813a);
        map.put("uri", q4.f15815c);
        map.put("bot", Boolean.valueOf(q4.f15817e));
        map.put("important", Boolean.valueOf(q4.f15818f));
        map.put("icon", describeIcon(q4.f15814b));
        return map;
    }

    private NotificationDetails extractNotificationDetails(InterfaceC4280q interfaceC4280q, Map<String, Object> map) {
        NotificationDetails notificationDetailsFrom = NotificationDetails.from(map);
        if (hasInvalidIcon(interfaceC4280q, notificationDetailsFrom.icon) || hasInvalidLargeIcon(interfaceC4280q, notificationDetailsFrom.largeIcon, notificationDetailsFrom.largeIconBitmapSource) || hasInvalidBigPictureResources(interfaceC4280q, notificationDetailsFrom) || hasInvalidRawSoundResource(interfaceC4280q, notificationDetailsFrom) || hasInvalidLedDetails(interfaceC4280q, notificationDetailsFrom)) {
            return null;
        }
        return notificationDetailsFrom;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap map = new HashMap();
        map.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        map.put(NOTIFICATION_TAG, intent.getStringExtra(NOTIFICATION_TAG));
        map.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        map.put(PAYLOAD, intent.getStringExtra(PAYLOAD));
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            map.put(INPUT, resultsFromIntent.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            map.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            map.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return map;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    private void getActiveNotificationMessagingStyle(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        Notification notification;
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) c4278o.f46760b;
            int iIntValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                if (statusBarNotification.getId() != iIntValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                }
                notification = statusBarNotification.getNotification();
            }
            notification = null;
            if (notification == null) {
                interfaceC4280q.a(null);
                return;
            }
            D dJ = D.j(notification);
            if (dJ == null) {
                interfaceC4280q.a(null);
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("groupConversation", Boolean.valueOf(dJ.k()));
            map2.put("person", describePerson(dJ.f15784g));
            map2.put("conversationTitle", dJ.f15785h);
            ArrayList arrayList = new ArrayList();
            Iterator it = dJ.f15782e.iterator();
            while (it.hasNext()) {
                C c10 = (C) it.next();
                HashMap map3 = new HashMap();
                map3.put("text", c10.f15776a);
                map3.put("timestamp", Long.valueOf(c10.f15777b));
                map3.put("person", describePerson(c10.f15778c));
                Uri uri = c10.f15781f;
                if (uri != null) {
                    map3.put("dataUri", uri.toString());
                }
                String str2 = c10.f15780e;
                if (str2 != null) {
                    map3.put("dataMimeType", str2);
                }
                arrayList.add(map3);
            }
            map2.put("messages", arrayList);
            interfaceC4280q.a(map2);
        } catch (Throwable th) {
            interfaceC4280q.b(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private void getActiveNotifications(InterfaceC4280q interfaceC4280q) {
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap map = new HashMap();
                map.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (Build.VERSION.SDK_INT >= 26) {
                    map.put("channelId", notification.getChannelId());
                }
                map.put(CANCEL_TAG, statusBarNotification.getTag());
                map.put("groupKey", notification.getGroup());
                map.put("title", notification.extras.getCharSequence("android.title"));
                map.put("body", notification.extras.getCharSequence("android.text"));
                map.put("bigText", notification.extras.getCharSequence("android.bigText"));
                arrayList.add(map);
            }
            interfaceC4280q.a(arrayList);
        } catch (Throwable th) {
            interfaceC4280q.b(UNSUPPORTED_OS_VERSION_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] bArrCastObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(bArrCastObjectToByteArray, 0, bArrCastObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i5, Intent intent) {
        return PendingIntent.getBroadcast(context, i5, intent, 201326592);
    }

    private void getCallbackHandle(InterfaceC4280q interfaceC4280q) {
        interfaceC4280q.a(Long.valueOf(this.applicationContext.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", -1L)));
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) throws IOException {
        int i5 = d.f26222b[iconSource.ordinal()];
        if (i5 == 1) {
            int drawableResourceId = getDrawableResourceId(context, (String) obj);
            PorterDuff.Mode mode = IconCompat.k;
            context.getClass();
            return IconCompat.g(context.getResources(), context.getPackageName(), drawableResourceId);
        }
        if (i5 == 2) {
            return IconCompat.f(BitmapFactory.decodeFile((String) obj));
        }
        if (i5 == 3) {
            String str = (String) obj;
            PorterDuff.Mode mode2 = IconCompat.k;
            str.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f18068b = str;
            return iconCompat;
        }
        if (i5 != 4) {
            if (i5 != 5) {
                return null;
            }
            byte[] bArrCastObjectToByteArray = castObjectToByteArray(obj);
            int length = bArrCastObjectToByteArray.length;
            IconCompat iconCompat2 = new IconCompat(3);
            iconCompat2.f18068b = bArrCastObjectToByteArray;
            iconCompat2.f18071e = 0;
            iconCompat2.f18072f = length;
            return iconCompat2;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(((C3665d) k.z().f19396b).b((String) obj));
            FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
            IconCompat iconCompatF = IconCompat.f(BitmapFactory.decodeStream(fileInputStreamCreateInputStream));
            fileInputStreamCreateInputStream.close();
            assetFileDescriptorOpenFd.close();
            return iconCompatF;
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) throws Resources.NotFoundException {
        HashMap<String, Object> map = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            map.put(CANCEL_ID, notificationChannel.getId());
            map.put(MediationMetaData.KEY_NAME, notificationChannel.getName());
            map.put("description", notificationChannel.getDescription());
            map.put("groupId", notificationChannel.getGroup());
            map.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
            map.put("importance", Integer.valueOf(notificationChannel.getImportance()));
            Uri sound = notificationChannel.getSound();
            if (sound == null) {
                map.put("sound", null);
                map.put("playSound", Boolean.FALSE);
            } else {
                map.put("playSound", Boolean.TRUE);
                List listAsList = Arrays.asList(SoundSource.values());
                if (sound.getScheme().equals("android.resource")) {
                    String str = sound.toString().split("/")[r1.length - 1];
                    Integer numTryParseInt = tryParseInt(str);
                    if (numTryParseInt == null) {
                        map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.RawResource)));
                        map.put("sound", str);
                    } else {
                        try {
                            String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(numTryParseInt.intValue());
                            if (resourceEntryName != null) {
                                map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.RawResource)));
                                map.put("sound", resourceEntryName);
                            }
                        } catch (Exception unused) {
                            map.put("sound", null);
                            map.put("playSound", Boolean.FALSE);
                        }
                    }
                } else {
                    map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.Uri)));
                    map.put("sound", sound.toString());
                }
            }
            map.put("bypassDnd", Boolean.valueOf(notificationChannel.canBypassDnd()));
            map.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
            map.put("vibrationPattern", notificationChannel.getVibrationPattern());
            map.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
            map.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
            AudioAttributes audioAttributes = notificationChannel.getAudioAttributes();
            map.put("audioAttributesUsage", Integer.valueOf(audioAttributes == null ? 5 : audioAttributes.getUsage()));
        }
        return map;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L));
        }
        if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
            return null;
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L));
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId zoneIdOf = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), zoneIdOf);
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(zoneIdOf);
        ZonedDateTime zonedDateTimeOf2 = ZonedDateTime.of(zonedDateTimeNow.getYear(), zonedDateTimeNow.getMonthValue(), zonedDateTimeNow.getDayOfMonth(), zonedDateTimeOf.getHour(), zonedDateTimeOf.getMinute(), zonedDateTimeOf.getSecond(), zonedDateTimeOf.getNano(), zoneIdOf);
        while (zonedDateTimeOf2.isBefore(zonedDateTimeNow)) {
            zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents == DateTimeComponents.Time) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
            while (zonedDateTimeOf2.getDayOfWeek() != zonedDateTimeOf.getDayOfWeek()) {
                zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
            while (zonedDateTimeOf2.getDayOfMonth() != zonedDateTimeOf.getDayOfMonth()) {
                zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents != DateTimeComponents.DateAndTime) {
            return null;
        }
        while (true) {
            if (zonedDateTimeOf2.getMonthValue() == zonedDateTimeOf.getMonthValue() && zonedDateTimeOf2.getDayOfMonth() == zonedDateTimeOf.getDayOfMonth()) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
            }
            zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
        }
    }

    private void getNotificationAppLaunchDetails(InterfaceC4280q interfaceC4280q) {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            boolean z2 = intent != null && (SELECT_NOTIFICATION.equals(intent.getAction()) || SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) && !launchedActivityFromHistory(intent);
            Boolean boolValueOf = Boolean.valueOf(z2);
            if (z2) {
                map.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = boolValueOf;
        }
        map.put(NOTIFICATION_LAUNCHED_APP, bool);
        interfaceC4280q.a(map);
    }

    private void getNotificationChannels(InterfaceC4280q interfaceC4280q) {
        List listC;
        try {
            N notificationManager = getNotificationManager(this.applicationContext);
            if (Build.VERSION.SDK_INT >= 26) {
                listC = G.c(notificationManager.f15812b);
            } else {
                notificationManager.getClass();
                listC = Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(getMappedNotificationChannel(com.dexterous.flutterlocalnotifications.a.e(it.next())));
            }
            interfaceC4280q.a(arrayList);
        } catch (Throwable th) {
            interfaceC4280q.b(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static N getNotificationManager(Context context) {
        return new N(context);
    }

    private boolean hasInvalidBigPictureResources(InterfaceC4280q interfaceC4280q, NotificationDetails notificationDetails) {
        if (notificationDetails.style == NotificationStyle.BigPicture) {
            BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
            if (hasInvalidLargeIcon(interfaceC4280q, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
                return true;
            }
            BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
            if (bitmapSource == BitmapSource.DrawableResource) {
                String str = (String) bigPictureStyleInformation.bigPicture;
                return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, interfaceC4280q, INVALID_BIG_PICTURE_ERROR_CODE);
            }
            if (bitmapSource == BitmapSource.FilePath) {
                return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
            }
            if (bitmapSource == BitmapSource.ByteArray) {
                byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
                return bArr == null || bArr.length == 0;
            }
        }
        return false;
    }

    private boolean hasInvalidIcon(InterfaceC4280q interfaceC4280q, String str) {
        return (StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, interfaceC4280q, INVALID_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLargeIcon(InterfaceC4280q interfaceC4280q, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            return bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0;
        }
        String str = (String) obj;
        return (StringUtils.isNullOrEmpty(str).booleanValue() || bitmapSource != bitmapSource2 || isValidDrawableResource(this.applicationContext, str, interfaceC4280q, INVALID_LARGE_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLedDetails(InterfaceC4280q interfaceC4280q, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        interfaceC4280q.b(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(InterfaceC4280q interfaceC4280q, NotificationDetails notificationDetails) {
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue()) {
            return false;
        }
        SoundSource soundSource = notificationDetails.soundSource;
        if ((soundSource != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0) {
            return false;
        }
        interfaceC4280q.b(INVALID_SOUND_ERROR_CODE, AbstractC0279p0.l("The resource ", notificationDetails.sound, " could not be found. Please make sure it has been added as a raw resource to your Android head project."), null);
        return true;
    }

    private void initialize(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        String str = (String) ((Map) c4278o.f46760b).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, interfaceC4280q, INVALID_ICON_ERROR_CODE)) {
            Long lJ = A6.c.J(c4278o.a(DISPATCHER_HANDLE));
            Long lJ2 = A6.c.J(c4278o.a(CALLBACK_HANDLE));
            if (lJ != null && lJ2 != null) {
                Context context = this.applicationContext;
                context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", lJ.longValue()).apply();
                context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", lJ2.longValue()).apply();
            }
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            interfaceC4280q.a(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, InterfaceC4280q interfaceC4280q, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        interfaceC4280q.b(str2, AbstractC0279p0.l("The resource ", str, " could not be found. Please make sure it has been added as a drawable resource to your Android head project."), null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & 1048576) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, null);
        return string != null ? (ArrayList) buildGson().b(string, new a().f44184b) : arrayList;
    }

    private void pendingNotificationRequests(InterfaceC4280q interfaceC4280q) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap map = new HashMap();
            map.put(CANCEL_ID, next.f26241id);
            map.put("title", next.title);
            map.put("body", next.body);
            map.put(PAYLOAD, next.payload);
            arrayList.add(map);
        }
        interfaceC4280q.a(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, false)) {
            new N(this.applicationContext).b(((Integer) map.get(NOTIFICATION_ID)).intValue(), null);
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f26241id.equals(num)) {
                it.remove();
                break;
            }
        }
        saveScheduledNotifications(context, arrayListLoadScheduledNotifications);
    }

    private void repeat(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(interfaceC4280q, (Map) c4278o.f46760b);
        if (notificationDetailsExtractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, notificationDetailsExtractNotificationDetails, Boolean.TRUE);
                interfaceC4280q.a(null);
            } catch (e e7) {
                interfaceC4280q.b(e7.f26224a, e7.getMessage(), null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long jCalculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long jLongValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            jLongValue = calendar.getTimeInMillis();
        }
        long jCalculateNextNotificationTrigger = calculateNextNotificationTrigger(jLongValue, jCalculateRepeatIntervalMilliseconds);
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f26241id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, jCalculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, jCalculateNextNotificationTrigger, jCalculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            try {
                if (next.repeatInterval != null || next.repeatIntervalMilliseconds != null) {
                    repeatNotification(context, next, Boolean.FALSE);
                } else if (next.timeZoneName != null) {
                    zonedScheduleNotification(context, next, Boolean.FALSE);
                } else {
                    scheduleNotification(context, next, Boolean.FALSE);
                }
            } catch (e e7) {
                Log.e(TAG, e7.getMessage());
                removeNotificationFromCache(context, next.f26241id);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            if (soundSource == SoundSource.Uri) {
                return Uri.parse(str);
            }
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.f26241id.equals(notificationDetails.f26241id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().f(arrayList)).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
                return;
            }
            if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
                return;
            }
            if (notificationDetails.repeatInterval == null && notificationDetails.repeatIntervalMilliseconds == null) {
                removeNotificationFromCache(context, notificationDetails.f26241id);
                return;
            }
            scheduleNextRepeatingNotification(context, notificationDetails);
        } catch (e e7) {
            Log.e(TAG, e7.getMessage());
            removeNotificationFromCache(context, notificationDetails.f26241id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long jCalculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f26241id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, jCalculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.f26241id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> mapExtractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, mapExtractNotificationResponseMap);
        }
        this.channel.a("didReceiveNotificationResponse", mapExtractNotificationResponseMap, null);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, C1289q c1289q) {
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        C1286n c1286n = new C1286n();
        if (bigPictureStyleInformation.contentTitle != null) {
            c1286n.f15789c = C1289q.b(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            c1286n.f15790d = C1289q.b(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
            c1286n.f15787a = true;
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            c1286n.k(null);
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                c1286n.k(getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource));
            }
        }
        Bitmap bitmapFromSource = getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource);
        c1286n.f15859e = bitmapFromSource != null ? IconCompat.f(bitmapFromSource) : null;
        c1289q.f(c1286n);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, C1289q c1289q) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        C1287o c1287o = new C1287o(0);
        if (bigTextStyleInformation.bigText != null) {
            c1287o.f15864f = C1289q.b(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            c1287o.f15789c = C1289q.b(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            c1287o.f15790d = C1289q.b(bigTextStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigTextStyleInformation.summaryText) : bigTextStyleInformation.summaryText);
            c1287o.f15787a = true;
        }
        c1289q.f(c1287o);
    }

    private void setCanScheduleExactNotifications(InterfaceC4280q interfaceC4280q) {
        if (Build.VERSION.SDK_INT < 31) {
            interfaceC4280q.a(Boolean.TRUE);
        } else {
            interfaceC4280q.a(Boolean.valueOf(getAlarmManager(this.applicationContext).canScheduleExactAlarms()));
        }
    }

    private static void setCategory(NotificationDetails notificationDetails, C1289q c1289q) {
        String str = notificationDetails.category;
        if (str == null) {
            return;
        }
        c1289q.f15896x = str;
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, C1289q c1289q) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        C1287o c1287o = new C1287o(1);
        if (inboxStyleInformation.contentTitle != null) {
            c1287o.f15789c = C1289q.b(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            c1287o.f15790d = C1289q.b(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
            c1287o.f15787a = true;
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CharSequence charSequenceFromHtml = next;
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    charSequenceFromHtml = fromHtml(next);
                }
                if (charSequenceFromHtml != null) {
                    ((ArrayList) c1287o.f15864f).add(C1289q.b(charSequenceFromHtml));
                }
            }
        }
        c1289q.f(c1287o);
    }

    private static void setLights(NotificationDetails notificationDetails, C1289q c1289q) {
        if (!BooleanUtils.getValue(notificationDetails.enableLights) || notificationDetails.ledOnMs == null || notificationDetails.ledOffMs == null) {
            return;
        }
        int iIntValue = notificationDetails.ledColor.intValue();
        int iIntValue2 = notificationDetails.ledOnMs.intValue();
        int iIntValue3 = notificationDetails.ledOffMs.intValue();
        Notification notification = c1289q.f15871G;
        notification.ledARGB = iIntValue;
        notification.ledOnMS = iIntValue2;
        notification.ledOffMS = iIntValue3;
        notification.flags = ((iIntValue2 == 0 || iIntValue3 == 0) ? 0 : 1) | (notification.flags & (-2));
    }

    private static void setMediaStyle(C1289q c1289q) {
        c1289q.f(new M1.c(0));
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, C1289q c1289q) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        D d3 = new D(buildPerson(context, messagingStyleInformation.person));
        d3.f15786i = Boolean.valueOf(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            d3.f15785h = str;
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                C cCreateMessage = createMessage(context, it.next());
                if (cCreateMessage != null) {
                    ArrayList arrayList2 = d3.f15782e;
                    arrayList2.add(cCreateMessage);
                    if (arrayList2.size() > 25) {
                        arrayList2.remove(0);
                    }
                }
            }
        }
        c1289q.f(d3);
    }

    private static void setProgress(NotificationDetails notificationDetails, C1289q c1289q) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            int iIntValue = notificationDetails.maxProgress.intValue();
            int iIntValue2 = notificationDetails.progress.intValue();
            boolean zBooleanValue = notificationDetails.indeterminate.booleanValue();
            c1289q.f15888p = iIntValue;
            c1289q.f15889q = iIntValue2;
            c1289q.f15890r = zBooleanValue;
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, C1289q c1289q) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            c1289q.f15871G.icon = getDrawableResourceId(context, notificationDetails.icon);
            return;
        }
        String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, null);
        if (StringUtils.isNullOrEmpty(string).booleanValue()) {
            c1289q.f15871G.icon = notificationDetails.iconResourceId.intValue();
        } else {
            c1289q.f15871G.icon = getDrawableResourceId(context, string);
        }
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, C1289q c1289q) {
        if (BooleanUtils.getValue(notificationDetails.playSound)) {
            c1289q.e(retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource));
        } else {
            c1289q.e(null);
        }
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, C1289q c1289q) {
        int i5 = d.f26223c[notificationDetails.style.ordinal()];
        if (i5 == 1) {
            setBigPictureStyle(context, notificationDetails, c1289q);
            return;
        }
        if (i5 == 2) {
            setBigTextStyle(notificationDetails, c1289q);
            return;
        }
        if (i5 == 3) {
            setInboxStyle(notificationDetails, c1289q);
        } else if (i5 == 4) {
            setMessagingStyle(context, notificationDetails, c1289q);
        } else {
            if (i5 != 5) {
                return;
            }
            setMediaStyle(c1289q);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, C1289q c1289q) {
        Long l10 = notificationDetails.timeoutAfter;
        if (l10 == null) {
            return;
        }
        c1289q.f15868D = l10.longValue();
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, C1289q c1289q) {
        if (!BooleanUtils.getValue(notificationDetails.enableVibration)) {
            c1289q.f15871G.vibrate = new long[]{0};
            return;
        }
        long[] jArr = notificationDetails.vibrationPattern;
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        c1289q.f15871G.vibrate = jArr;
    }

    private static void setVisibility(NotificationDetails notificationDetails, C1289q c1289q) {
        int i5;
        Integer num = notificationDetails.visibility;
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            i5 = 1;
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
                i5 = -1;
            }
        } else {
            i5 = 0;
        }
        c1289q.f15865A = i5;
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j8, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j8, pendingIntent);
            return;
        }
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExact(0, j8, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.set(0, j8, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j8, pendingIntent), pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j8, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExactAndAllowWhileIdle(0, j8, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.setAndAllowWhileIdle(0, j8, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j8, pendingIntent), pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            org.apache.tika.utils.a.C();
            NotificationChannel notificationChannelC = com.dexterous.flutterlocalnotifications.a.c(notificationChannelDetails.importance.intValue(), notificationChannelDetails.name, notificationChannelDetails.f26239id);
            notificationChannelC.setDescription(notificationChannelDetails.description);
            notificationChannelC.setGroup(notificationChannelDetails.groupId);
            if (notificationChannelDetails.playSound.booleanValue()) {
                Integer num2 = notificationChannelDetails.audioAttributesUsage;
                notificationChannelC.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(num2 != null ? num2.intValue() : 5).build());
            } else {
                notificationChannelC.setSound(null, null);
            }
            if (BooleanUtils.getValue(notificationChannelDetails.bypassDnd)) {
                if (notificationManager.isNotificationPolicyAccessGranted()) {
                    notificationChannelC.setBypassDnd(true);
                } else {
                    Log.w(TAG, "Channel '" + notificationChannelDetails.name + "' was set to bypass Do Not Disturb but the OS prevents it.");
                }
            }
            notificationChannelC.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                notificationChannelC.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            notificationChannelC.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                notificationChannelC.setLightColor(num.intValue());
            }
            notificationChannelC.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(notificationChannelC);
        }
    }

    private void show(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(interfaceC4280q, (Map) c4278o.f46760b);
        if (notificationDetailsExtractNotificationDetails != null) {
            showNotification(this.applicationContext, notificationDetailsExtractNotificationDetails);
            interfaceC4280q.a(null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification notificationCreateNotification = createNotification(context, notificationDetails);
        N notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        if (str != null) {
            notificationManager.c(str, notificationDetails.f26241id.intValue(), notificationCreateNotification);
        } else {
            notificationManager.c(null, notificationDetails.f26241id.intValue(), notificationCreateNotification);
        }
    }

    private void startForegroundService(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        Map<String, Object> map = (Map) c4278o.a("notificationData");
        Integer num = (Integer) c4278o.a("startType");
        ArrayList arrayList = (ArrayList) c4278o.a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            interfaceC4280q.b("ARGUMENT_ERROR", "If foregroundServiceTypes is non-null it must not be empty!", null);
            return;
        }
        if (map == null || num == null) {
            interfaceC4280q.b("ARGUMENT_ERROR", "An argument passed to startForegroundService was null!", null);
            return;
        }
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(interfaceC4280q, map);
        if (notificationDetailsExtractNotificationDetails != null) {
            if (notificationDetailsExtractNotificationDetails.f26241id.intValue() == 0) {
                interfaceC4280q.b("ARGUMENT_ERROR", "The id of the notification for a foreground service must not be 0!", null);
                return;
            }
            h hVar = new h(notificationDetailsExtractNotificationDetails, num.intValue(), arrayList);
            Intent intent = new Intent(this.applicationContext, (Class<?>) g.class);
            intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", hVar);
            Y0.e.startForegroundService(this.applicationContext, intent);
            interfaceC4280q.a(null);
        }
    }

    private void stopForegroundService(InterfaceC4280q interfaceC4280q) {
        this.applicationContext.stopService(new Intent(this.applicationContext, (Class<?>) g.class));
        interfaceC4280q.a(null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(interfaceC4280q, (Map) c4278o.f46760b);
        if (notificationDetailsExtractNotificationDetails != null) {
            if (notificationDetailsExtractNotificationDetails.matchDateTimeComponents != null) {
                notificationDetailsExtractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(notificationDetailsExtractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, notificationDetailsExtractNotificationDetails, Boolean.TRUE);
                interfaceC4280q.a(null);
            } catch (e e7) {
                interfaceC4280q.b(e7.f26224a, e7.getMessage(), null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDate;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String strF = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strF);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.f26241id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void hasNotificationPolicyAccess(InterfaceC4280q interfaceC4280q) {
        interfaceC4280q.a(Boolean.valueOf(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()));
    }

    @Override // uc.InterfaceC4283t
    public boolean onActivityResult(int i5, int i10, Intent intent) {
        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
            return false;
        }
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.f26228d;
        f fVar3 = f.f26225a;
        if (fVar == fVar2 && i5 == 2 && Build.VERSION.SDK_INT >= 31) {
            this.callback.B(getAlarmManager(this.applicationContext).canScheduleExactAlarms());
            this.permissionRequestProgress = fVar3;
        }
        if (this.permissionRequestProgress == f.f26229e && i5 == 3 && Build.VERSION.SDK_INT >= 34) {
            this.callback.B(((NotificationManager) this.applicationContext.getSystemService("notification")).canUseFullScreenIntent());
            this.permissionRequestProgress = fVar3;
        }
        if (this.permissionRequestProgress == f.f26227c && i5 == 4) {
            this.callback.B(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted());
            this.permissionRequestProgress = fVar3;
        }
        return true;
    }

    @Override // rc.InterfaceC3964a
    public void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        s1Var.c(this);
        s1Var.d(this);
        s1Var.b(this);
        Activity activity = (Activity) s1Var.f43896a;
        this.mainActivity = activity;
        Intent intent = activity.getIntent();
        if (launchedActivityFromHistory(intent) || !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return;
        }
        processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
    }

    @Override // qc.InterfaceC3885b
    public void onAttachedToEngine(C3884a c3884a) {
        this.applicationContext = c3884a.f44186a;
        C4281r c4281r = new C4281r(c3884a.f44188c, METHOD_CHANNEL);
        this.channel = c4281r;
        c4281r.b(this);
    }

    @Override // rc.InterfaceC3964a
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // rc.InterfaceC3964a
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // qc.InterfaceC3885b
    public void onDetachedFromEngine(C3884a c3884a) {
        this.channel.b(null);
        this.channel = null;
        this.applicationContext = null;
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        int i5;
        int i10;
        i5 = 4;
        i10 = 2;
        String str = c4278o.f46759a;
        str.getClass();
        switch (str) {
            case "stopForegroundService":
                stopForegroundService(interfaceC4280q);
                break;
            case "getNotificationChannels":
                getNotificationChannels(interfaceC4280q);
                break;
            case "deleteNotificationChannelGroup":
                deleteNotificationChannelGroup(c4278o, interfaceC4280q);
                break;
            case "requestNotificationsPermission":
                requestNotificationsPermission(new v(interfaceC4280q, i10));
                break;
            case "hasNotificationPolicyAccess":
                hasNotificationPolicyAccess(interfaceC4280q);
                break;
            case "cancel":
                cancel(c4278o, interfaceC4280q);
                break;
            case "requestExactAlarmsPermission":
                requestExactAlarmsPermission(new b(interfaceC4280q));
                break;
            case "requestFullScreenIntentPermission":
                requestFullScreenIntentPermission(new C1323c(interfaceC4280q, i5));
                break;
            case "pendingNotificationRequests":
                pendingNotificationRequests(interfaceC4280q);
                break;
            case "cancelAllPendingNotifications":
                cancelAllPendingNotifications(interfaceC4280q);
                break;
            case "getNotificationAppLaunchDetails":
                getNotificationAppLaunchDetails(interfaceC4280q);
                break;
            case "show":
                show(c4278o, interfaceC4280q);
                break;
            case "periodicallyShow":
                repeat(c4278o, interfaceC4280q);
                break;
            case "getActiveNotificationMessagingStyle":
                getActiveNotificationMessagingStyle(c4278o, interfaceC4280q);
                break;
            case "cancelAll":
                cancelAllNotifications(interfaceC4280q);
                break;
            case "zonedSchedule":
                zonedSchedule(c4278o, interfaceC4280q);
                break;
            case "createNotificationChannelGroup":
                createNotificationChannelGroup(c4278o, interfaceC4280q);
                break;
            case "getCallbackHandle":
                getCallbackHandle(interfaceC4280q);
                break;
            case "initialize":
                initialize(c4278o, interfaceC4280q);
                break;
            case "areNotificationsEnabled":
                areNotificationsEnabled(interfaceC4280q);
                break;
            case "canScheduleExactNotifications":
                setCanScheduleExactNotifications(interfaceC4280q);
                break;
            case "deleteNotificationChannel":
                deleteNotificationChannel(c4278o, interfaceC4280q);
                break;
            case "startForegroundService":
                startForegroundService(c4278o, interfaceC4280q);
                break;
            case "getActiveNotifications":
                getActiveNotifications(interfaceC4280q);
                break;
            case "createNotificationChannel":
                createNotificationChannel(c4278o, interfaceC4280q);
                break;
            case "requestNotificationPolicyAccess":
                requestNotificationPolicyAccess(new c(interfaceC4280q));
                break;
            case "periodicallyShowWithDuration":
                repeat(c4278o, interfaceC4280q);
                break;
            default:
                interfaceC4280q.c();
                break;
        }
    }

    @Override // uc.InterfaceC4284u
    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean zBooleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (zBooleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return zBooleanValue;
    }

    @Override // rc.InterfaceC3964a
    public void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        s1Var.c(this);
        s1Var.d(this);
        s1Var.b(this);
        this.mainActivity = (Activity) s1Var.f43896a;
    }

    @Override // uc.InterfaceC4285v
    public boolean onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        boolean z2 = false;
        if (this.permissionRequestProgress == f.f26226b && i5 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z2 = true;
            }
            this.callback.B(z2);
            this.permissionRequestProgress = f.f26225a;
        }
        return z2;
    }

    public void requestExactAlarmsPermission(i iVar) {
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.f26225a;
        if (fVar != fVar2) {
            iVar.s();
            return;
        }
        this.callback = iVar;
        if (Build.VERSION.SDK_INT < 31) {
            iVar.B(true);
            return;
        }
        if (getAlarmManager(this.applicationContext).canScheduleExactAlarms()) {
            this.callback.B(true);
            this.permissionRequestProgress = fVar2;
            return;
        }
        this.permissionRequestProgress = f.f26228d;
        this.mainActivity.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + this.applicationContext.getPackageName())), 2);
    }

    public void requestFullScreenIntentPermission(i iVar) {
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.f26225a;
        if (fVar != fVar2) {
            iVar.s();
            return;
        }
        this.callback = iVar;
        if (Build.VERSION.SDK_INT < 34) {
            iVar.B(true);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        getAlarmManager(this.applicationContext);
        if (notificationManager.canUseFullScreenIntent()) {
            this.callback.B(true);
            this.permissionRequestProgress = fVar2;
            return;
        }
        this.permissionRequestProgress = f.f26229e;
        this.mainActivity.startActivityForResult(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + this.applicationContext.getPackageName())), 3);
    }

    public void requestNotificationPolicyAccess(i iVar) {
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.f26225a;
        if (fVar != fVar2) {
            iVar.s();
            return;
        }
        this.callback = iVar;
        if (((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()) {
            this.callback.B(true);
            this.permissionRequestProgress = fVar2;
        } else {
            this.permissionRequestProgress = f.f26227c;
            this.mainActivity.startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 4);
        }
    }

    public void requestNotificationsPermission(i iVar) {
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.f26225a;
        if (fVar != fVar2) {
            iVar.s();
            return;
        }
        this.callback = iVar;
        if (Build.VERSION.SDK_INT < 33) {
            this.callback.B(new N(this.mainActivity).a());
        } else if (Y0.e.checkSelfPermission(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.callback.B(true);
            this.permissionRequestProgress = fVar2;
        } else {
            this.permissionRequestProgress = f.f26226b;
            AbstractC1274b.a(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }
}
