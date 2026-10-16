package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.UserHandle;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final String f4966a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4967b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f4968c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4969d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4970e;

    /* renamed from: f, reason: collision with root package name */
    private final UserHandle f4971f;

    public ai(String str, boolean z, byte[] bArr) {
        com.google.android.gms.common.api.internal.av.k(str);
        this.f4966a = str;
        com.google.android.gms.common.api.internal.av.k("com.google.android.gms");
        this.f4967b = "com.google.android.gms";
        this.f4968c = null;
        this.f4969d = 4225;
        this.f4970e = z;
        this.f4971f = null;
    }

    public final String a() {
        return this.f4966a;
    }

    public final String b() {
        return this.f4967b;
    }

    public final boolean c() {
        return this.f4970e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        if (Objects.equals(this.f4966a, aiVar.f4966a) && Objects.equals(this.f4967b, aiVar.f4967b)) {
            ComponentName componentName = aiVar.f4968c;
            if (Objects.equals(null, null)) {
                int i2 = aiVar.f4969d;
                if (this.f4970e == aiVar.f4970e) {
                    UserHandle userHandle = aiVar.f4971f;
                    if (Objects.equals(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4966a, this.f4967b, null, 4225, Boolean.valueOf(this.f4970e), null});
    }

    public final String toString() {
        return this.f4966a;
    }

    public ai(String str, boolean z) {
        this(str, z, null);
    }
}
