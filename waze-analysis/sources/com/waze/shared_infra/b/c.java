package com.waze.shared_infra.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f37797a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37798b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f37799c;

    public c(String str, String str2, Context context) {
        x.f(str, "filename");
        x.f(str2, "key");
        x.f(context, "context");
        this.f37797a = str;
        this.f37798b = str2;
        this.f37799c = context;
    }

    @Override // com.waze.shared_infra.b.a
    public final void a() {
        this.f37799c.getSharedPreferences(this.f37797a, 0).edit().remove(this.f37798b).apply();
    }

    @Override // com.waze.shared_infra.b.a
    public final void b(byte[] bArr) {
        x.f(bArr, "data");
        SharedPreferences.Editor editorEdit = this.f37799c.getSharedPreferences(this.f37797a, 0).edit();
        x.f(bArr, "<this>");
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        x.e(strEncodeToString, "encodeToString(...)");
        editorEdit.putString(this.f37798b, strEncodeToString).apply();
    }

    @Override // com.waze.shared_infra.b.a
    public final byte[] c() {
        String string;
        SharedPreferences sharedPreferences = this.f37799c.getSharedPreferences(this.f37797a, 0);
        if (sharedPreferences == null || (string = sharedPreferences.getString(this.f37798b, null)) == null) {
            return null;
        }
        x.f(string, "<this>");
        byte[] bArrDecode = Base64.decode(string, 0);
        x.e(bArrDecode, "decode(...)");
        return bArrDecode;
    }
}
