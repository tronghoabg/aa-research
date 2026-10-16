package com.waze.reports;

import com.waze.R;
import com.waze.rtalerts.MapProblem;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bo implements com.waze.rtalerts.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bp f33711a;

    bo(bp bpVar) {
        Objects.requireNonNull(bpVar);
        this.f33711a = bpVar;
    }

    @Override // com.waze.rtalerts.q
    public final void a(MapProblem[] mapProblemArr) {
        int length;
        if (mapProblemArr == null || (length = mapProblemArr.length) <= 0) {
            return;
        }
        String[] strArr = new String[length];
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < mapProblemArr.length; i2++) {
            strArr[i2] = mapProblemArr[i2].description;
            int i3 = mapProblemArr[i2].type;
            iArr[i2] = bp.V(i3);
            iArr2[i2] = i3;
        }
        this.f33711a.J(R.string.MAP_ISSUE, strArr, iArr, iArr2);
    }
}
