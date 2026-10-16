package com.google.android.datatransport.cct;

import com.google.android.datatransport.runtime.k;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    static final String f3909a;

    /* renamed from: b, reason: collision with root package name */
    static final String f3910b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f3911c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f3912d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f3913e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f3914f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3915g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3916h;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f3909a = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f3910b = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f3913e = strA3;
        f3914f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.a.a("proto"), com.google.android.datatransport.a.a("json"))));
        f3911c = new a(strA, null);
        f3912d = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f3915g = str;
        this.f3916h = str2;
    }

    public final String a() {
        return this.f3916h;
    }

    public final String b() {
        return this.f3915g;
    }

    @Override // com.google.android.datatransport.runtime.k
    public final Set c() {
        return f3914f;
    }

    public final byte[] d() {
        String str = this.f3916h;
        if (str == null && this.f3915g == null) {
            return null;
        }
        String str2 = this.f3915g;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }
}
