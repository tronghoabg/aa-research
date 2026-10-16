package com.google.firebase.appcheck.a;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.api.internal.av;
import com.google.firebase.components.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8869a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.appcheck.a.a.a f8870b = new com.google.firebase.appcheck.a.a.a(CmcdData.OBJECT_TYPE_INIT_SEGMENT);

    /* renamed from: c, reason: collision with root package name */
    private final w f8871c;

    public i(Context context, String str) {
        av.k(str);
        this.f8871c = new w(new h(context, String.format("com.google.firebase.appcheck.store.%s", str), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[Catch: IllegalArgumentException -> 0x0054, TRY_ENTER, TryCatch #0 {IllegalArgumentException -> 0x0054, blocks: (B:5:0x001f, B:18:0x0044, B:20:0x0049, B:22:0x004e, B:23:0x0053), top: B:27:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: IllegalArgumentException -> 0x0054, TryCatch #0 {IllegalArgumentException -> 0x0054, blocks: (B:5:0x001f, B:18:0x0044, B:20:0x0049, B:22:0x004e, B:23:0x0053), top: B:27:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.appcheck.b a() {
        /*
            r8 = this;
            com.google.firebase.components.w r0 = r8.f8871c
            java.lang.Object r1 = r0.a()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "com.google.firebase.appcheck.TOKEN_TYPE"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            java.lang.Object r0 = r0.a()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r4 = "com.google.firebase.appcheck.APP_CHECK_TOKEN"
            java.lang.String r0 = r0.getString(r4, r3)
            if (r1 == 0) goto L8b
            if (r0 == 0) goto L8b
            int r5 = r1.hashCode()     // Catch: java.lang.IllegalArgumentException -> L54
            r6 = -839025562(0xffffffffcdfd7c66, float:-5.3159853E8)
            if (r5 == r6) goto L37
            r6 = 880549999(0x347c206f, float:2.3481128E-7)
            if (r5 != r6) goto L4e
            java.lang.String r5 = "UNKNOWN_APP_CHECK_TOKEN"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L4e
            r5 = 2
            goto L40
        L37:
            java.lang.String r5 = "DEFAULT_APP_CHECK_TOKEN"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L4e
            r5 = 1
        L40:
            int r5 = r5 + (-1)
            if (r5 == 0) goto L49
            com.google.firebase.appcheck.a.a r8 = com.google.firebase.appcheck.a.a.e(r0)     // Catch: java.lang.IllegalArgumentException -> L54
            return r8
        L49:
            com.google.firebase.appcheck.a.a r8 = com.google.firebase.appcheck.a.a.f(r0)     // Catch: java.lang.IllegalArgumentException -> L54
            return r8
        L4e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L54
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> L54
            throw r0     // Catch: java.lang.IllegalArgumentException -> L54
        L54:
            r0 = move-exception
            com.google.firebase.appcheck.a.a.a r5 = com.google.firebase.appcheck.a.i.f8870b
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to parse TokenType of stored token  with type ["
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = "] with exception: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r5.b(r0)
            com.google.firebase.components.w r8 = r8.f8871c
            java.lang.Object r8 = r8.a()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            android.content.SharedPreferences$Editor r8 = r8.edit()
            android.content.SharedPreferences$Editor r8 = r8.remove(r4)
            android.content.SharedPreferences$Editor r8 = r8.remove(r2)
            r8.apply()
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appcheck.a.i.a():com.google.firebase.appcheck.b");
    }

    public final void b(com.google.firebase.appcheck.b bVar) {
        boolean z = bVar instanceof a;
        w wVar = this.f8871c;
        if (z) {
            ((SharedPreferences) wVar.a()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((a) bVar).g()).putString("com.google.firebase.appcheck.TOKEN_TYPE", "DEFAULT_APP_CHECK_TOKEN").apply();
        } else {
            ((SharedPreferences) wVar.a()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", bVar.b()).putString("com.google.firebase.appcheck.TOKEN_TYPE", "UNKNOWN_APP_CHECK_TOKEN").apply();
        }
    }
}
