package A7;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import c8.C1581e;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.internal.measurement.zzcf;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import com.wynauto.wyn.R;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes4.dex */
public abstract class I0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f523a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f524b = {"ad_impression"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f525c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f526d = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f527e = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f528f = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f529g = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f530h = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f531i = {"items"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f532j = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", InAppPurchaseMetaData.KEY_PRICE, "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static C1581e k;

    public static Object a(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(wg.b.c(AbstractC0279p0.r("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    public static String b(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String c(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i5 = 0; i5 < iMin; i5++) {
            String str2 = strArr[i5];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i5];
            }
        }
        return null;
    }

    public static HashSet d(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static void e(N n10, SQLiteDatabase sQLiteDatabase) {
        File file = new File(zzcf.zza().zza(sQLiteDatabase.getPath()));
        boolean readable = file.setReadable(false, false);
        P p10 = n10.f608i;
        if (!readable) {
            p10.c("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            p10.c("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            p10.c("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        p10.c("Failed to turn on database write permission for owner");
    }

    public static void f(N n10, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLException {
        boolean zMoveToFirst;
        P p10 = n10.f608i;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{MediationMetaData.KEY_NAME}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (SQLiteException e7) {
                p10.b(str, "Error querying for table", e7);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                zMoveToFirst = false;
            }
            if (!zMoveToFirst) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet hashSetD = d(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!hashSetD.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i5 = 0; i5 < strArr.length; i5 += 2) {
                        if (!hashSetD.remove(strArr[i5])) {
                            sQLiteDatabase.execSQL(strArr[i5 + 1]);
                        }
                    }
                }
                if (hashSetD.isEmpty()) {
                    return;
                }
                p10.b(str, "Table has extra columns. table, columns", TextUtils.join(", ", hashSetD));
            } catch (SQLiteException e10) {
                n10.f605f.d("Failed to verify columns on table that was just created", str);
                throw e10;
            }
        } finally {
        }
    }

    public static void g(Object obj, Bundle bundle) {
        if (obj instanceof Double) {
            bundle.putDouble(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, ((Long) obj).longValue());
        } else {
            bundle.putString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, obj.toString());
        }
    }
}
