package com.moloco.sdk.acm;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.f f28449a;

    /* renamed from: b, reason: collision with root package name */
    public long f28450b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28451c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final String f28452d;

    public l(String str, com.moloco.sdk.acm.services.f fVar) {
        this.f28449a = fVar;
        this.f28452d = str;
    }

    public final void a(String str, String value) {
        AbstractC3340k.e(value, "value");
        ArrayList arrayList = this.f28451c;
        if (arrayList.size() >= 10 || str.length() > 100 || value.length() > 100) {
            return;
        }
        arrayList.add(new i(str, value));
    }
}
