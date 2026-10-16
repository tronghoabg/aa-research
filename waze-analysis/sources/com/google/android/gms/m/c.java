package com.google.android.gms.m;

import com.google.android.gms.common.api.f;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5709a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5710b = false;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5711c = false;

    /* renamed from: d, reason: collision with root package name */
    private final String f5712d = null;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5713e = false;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5716i = false;

    /* renamed from: f, reason: collision with root package name */
    private final String f5714f = null;

    /* renamed from: h, reason: collision with root package name */
    private final String f5715h = null;

    /* renamed from: j, reason: collision with root package name */
    private final Long f5717j = null;

    /* renamed from: k, reason: collision with root package name */
    private final Long f5718k = null;

    private c() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        boolean z = cVar.f5710b;
        boolean z2 = cVar.f5711c;
        String str = cVar.f5712d;
        if (Objects.equals(null, null)) {
            boolean z3 = cVar.f5713e;
            boolean z4 = cVar.f5716i;
            String str2 = cVar.f5714f;
            if (Objects.equals(null, null)) {
                String str3 = cVar.f5715h;
                if (Objects.equals(null, null)) {
                    Long l2 = cVar.f5717j;
                    if (Objects.equals(null, null)) {
                        Long l3 = cVar.f5718k;
                        if (Objects.equals(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
