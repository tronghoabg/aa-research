package com.moloco.sdk.acm;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* renamed from: b, reason: collision with root package name */
    public final String f28418b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28417a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f28419c = 1;

    public h(String str) {
        this.f28418b = str;
    }

    public final void a(String str, String value) {
        AbstractC3340k.e(value, "value");
        ArrayList arrayList = this.f28417a;
        if (arrayList.size() >= 10 || str.length() > 100 || value.length() > 100) {
            return;
        }
        arrayList.add(new i(str, value));
    }
}
