package com.qonversion.android.sdk.internal;

import android.app.Application;
import android.content.Context;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.internal.dto.QPermission;
import com.unity3d.services.UnityAdsConstants;
import ff.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tf.l;
import zg.InterfaceC4664c;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r*\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0015\u0010\u0016\u001a\u00020\t*\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u000e*\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u001c*\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u001a+\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020!0\r*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 0\rH\u0000¢\u0006\u0004\b\"\u0010#\u001a.\u0010%\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0004¢\u0006\u0004\b%\u0010&\"\u0018\u0010(\u001a\u00020\t*\u00020'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0018\u0010-\u001a\u00020**\u00020'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"T", "Lzg/c;", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lef/C;", "callback", "enqueue", "(Lzg/c;Ltf/l;)V", "", "", "isInternalServerError", "(I)Z", "Lorg/json/JSONObject;", "", "", "", "toMap", "(Lorg/json/JSONObject;)Ljava/util/Map;", "Lorg/json/JSONArray;", "", "toList", "(Lorg/json/JSONArray;)Ljava/util/List;", "toBoolean", "(Ljava/lang/String;)Z", "toInt", "(Z)I", "stringValue", "(Z)Ljava/lang/String;", "", "milliSecondsToSeconds", "(J)J", "secondsToMilliSeconds", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "toEntitlementsMap", "(Ljava/util/Map;)Ljava/util/Map;", "other", "equalsIgnoreOrder", "(Ljava/util/List;Ljava/util/List;)Z", "Landroid/content/Context;", "isDebuggable", "(Landroid/content/Context;)Z", "Landroid/app/Application;", "getApplication", "(Landroid/content/Context;)Landroid/app/Application;", "application", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final <T> void enqueue(@NotNull InterfaceC4664c<T> interfaceC4664c, @NotNull l callback) {
        AbstractC3340k.e(interfaceC4664c, "<this>");
        AbstractC3340k.e(callback, "callback");
        CallBackKt callBackKt = new CallBackKt();
        callback.invoke(callBackKt);
        interfaceC4664c.i(callBackKt);
    }

    public static final <T> boolean equalsIgnoreOrder(@NotNull List<? extends T> list, @NotNull List<? extends T> other) {
        AbstractC3340k.e(list, "<this>");
        AbstractC3340k.e(other, "other");
        return list.size() == other.size() && o.X0(list).equals(o.X0(other));
    }

    @NotNull
    public static final Application getApplication(@NotNull Context context) {
        AbstractC3340k.e(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        AbstractC3340k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    public static final boolean isDebuggable(@NotNull Context context) {
        AbstractC3340k.e(context, "<this>");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final boolean isInternalServerError(int i5) {
        return 500 <= i5 && i5 < 600;
    }

    public static final long milliSecondsToSeconds(long j8) {
        return j8 / 1000;
    }

    public static final long secondsToMilliSeconds(long j8) {
        return j8 * 1000;
    }

    @NotNull
    public static final String stringValue(boolean z2) {
        return z2 ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0";
    }

    public static final boolean toBoolean(int i5) {
        return i5 != 0;
    }

    @NotNull
    public static final Map<String, QEntitlement> toEntitlementsMap(@NotNull Map<String, QPermission> map) {
        AbstractC3340k.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, QPermission> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new QEntitlement(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final int toInt(boolean z2) {
        return z2 ? 1 : 0;
    }

    @NotNull
    public static final List<Object> toList(@NotNull JSONArray jSONArray) throws JSONException {
        AbstractC3340k.e(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            Object map = jSONArray.get(i5);
            if (jSONArray.isNull(i5)) {
                map = null;
            } else if (map instanceof JSONArray) {
                map = toList((JSONArray) map);
            } else if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jSONObject) throws JSONException {
        AbstractC3340k.e(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object map = jSONObject.get(next);
            if (jSONObject.isNull(next)) {
                map = null;
            } else if (map instanceof JSONArray) {
                map = toList((JSONArray) map);
            } else if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            }
            AbstractC3340k.b(next);
            linkedHashMap.put(next, map);
        }
        return linkedHashMap;
    }

    public static final boolean toBoolean(@Nullable String str) {
        return AbstractC3340k.a(str, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }
}
