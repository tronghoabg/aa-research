package com.waze.ui.d;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final int f42137a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42138b;

    public c(int i2) {
        super(R.drawable.icon_report_not_there, i2);
        this.f42137a = R.drawable.icon_report_not_there;
        this.f42138b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i2 = cVar.f42137a;
        return this.f42138b == cVar.f42138b;
    }

    public final int hashCode() {
        return this.f42138b + 1643681599;
    }

    public final String toString() {
        return "NotThereAnswerUiData(imageResId=2131231969, labelResId=" + this.f42138b + ")";
    }
}
