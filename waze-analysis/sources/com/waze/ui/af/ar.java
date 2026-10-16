package com.waze.ui.af;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar implements at {

    /* renamed from: a, reason: collision with root package name */
    public static final ar f41861a = new ar();

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.ui.ac.j f41862b = new com.waze.ui.ac.j(R.string.VOICE_SETTINGS_SWIPE_ACTION_PREVIEW);

    /* renamed from: c, reason: collision with root package name */
    private static final com.waze.z.a.ab f41863c = com.waze.z.a.ab.f45610a;

    /* renamed from: d, reason: collision with root package name */
    private static final com.waze.ui.ac.f f41864d = new com.waze.ui.ac.f(R.drawable.info_bubble_outline_24px);

    private ar() {
    }

    @Override // com.waze.z.a.ad
    public final com.waze.z.a.ab a() {
        return f41863c;
    }

    @Override // com.waze.z.a.ad
    public final /* synthetic */ com.waze.ui.ac.i b() {
        return f41864d;
    }

    @Override // com.waze.z.a.ad
    public final /* synthetic */ com.waze.ui.ac.n c() {
        return f41862b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -286238678;
    }

    public final String toString() {
        return "Preview";
    }
}
