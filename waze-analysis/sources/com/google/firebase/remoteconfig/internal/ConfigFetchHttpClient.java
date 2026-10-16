package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ConfigFetchHttpClient {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f10626a = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f10627b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10628c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10629d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10630e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10631f;

    /* renamed from: g, reason: collision with root package name */
    private final long f10632g;

    /* renamed from: h, reason: collision with root package name */
    private final long f10633h;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j2, long j3) {
        this.f10627b = context;
        this.f10628c = str;
        this.f10629d = str2;
        Matcher matcher = f10626a.matcher(str);
        this.f10630e = matcher.matches() ? matcher.group(1) : null;
        this.f10631f = str3;
        this.f10632g = j2;
        this.f10633h = j3;
    }

    final HttpURLConnection a() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.f10630e, this.f10631f)).openConnection();
        } catch (IOException e2) {
            throw new com.google.firebase.remoteconfig.d(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1 A[LOOP:0: B:12:0x009b->B:14:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be A[Catch: all -> 0x027d, IOException | JSONException -> 0x0280, IOException -> 0x0282, TRY_LEAVE, TryCatch #12 {all -> 0x027d, blocks: (B:15:0x00b7, B:17:0x00be, B:18:0x0105, B:20:0x0114, B:21:0x0128, B:23:0x014a, B:25:0x016d, B:26:0x018b, B:28:0x01b9, B:29:0x01d2, B:31:0x01d9, B:32:0x01de, B:71:0x026b, B:72:0x0274, B:73:0x0275, B:74:0x027c, B:81:0x0284, B:82:0x028b), top: B:110:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0275 A[Catch: all -> 0x027d, IOException | JSONException -> 0x0280, IOException -> 0x0282, TryCatch #12 {all -> 0x027d, blocks: (B:15:0x00b7, B:17:0x00be, B:18:0x0105, B:20:0x0114, B:21:0x0128, B:23:0x014a, B:25:0x016d, B:26:0x018b, B:28:0x01b9, B:29:0x01d2, B:31:0x01d9, B:32:0x01de, B:71:0x026b, B:72:0x0274, B:73:0x0275, B:74:0x027c, B:81:0x0284, B:82:0x028b), top: B:110:0x009f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.google.firebase.remoteconfig.internal.k fetch(java.net.HttpURLConnection r11, java.lang.String r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, java.lang.Long r17, java.util.Date r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):com.google.firebase.remoteconfig.internal.k");
    }
}
