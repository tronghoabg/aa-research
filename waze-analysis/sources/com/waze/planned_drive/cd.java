package com.waze.planned_drive;

import androidx.core.app.NotificationCompat;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cd extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final String f33301a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33302b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(String str, String str2, boolean z) {
        super(null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, NotificationCompat.CATEGORY_MESSAGE);
        this.f33301a = str;
        this.f33302b = str2;
        this.f33303c = z;
    }

    public final String a() {
        return this.f33302b;
    }

    public final String b() {
        return this.f33301a;
    }

    public final boolean c() {
        return this.f33303c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        cd cdVar = (cd) obj;
        return h.g.b.x.n(this.f33301a, cdVar.f33301a) && h.g.b.x.n(this.f33302b, cdVar.f33302b) && this.f33303c == cdVar.f33303c;
    }

    public final int hashCode() {
        return (((this.f33301a.hashCode() * 31) + this.f33302b.hashCode()) * 31) + a.a.a(this.f33303c);
    }

    public final String toString() {
        return "Error(title=" + this.f33301a + ", msg=" + this.f33302b + ", isFatal=" + this.f33303c + ")";
    }
}
