package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f10142a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: b, reason: collision with root package name */
    private final String f10143b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10144c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10145d;

    private ak(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f10142a.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f10143b = strSubstring;
        this.f10144c = str;
        this.f10145d = str + "!" + str2;
    }

    static ak a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length == 2) {
            return new ak(strArrSplit[0], strArrSplit[1]);
        }
        return null;
    }

    public final String b() {
        return this.f10144c;
    }

    public final String c() {
        return this.f10143b;
    }

    public final String d() {
        return this.f10145d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return this.f10143b.equals(akVar.f10143b) && this.f10144c.equals(akVar.f10144c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10144c, this.f10143b});
    }
}
