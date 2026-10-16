package com.waze.ui.af;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as implements at {

    /* renamed from: a, reason: collision with root package name */
    public static final as f41865a = new as();

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.ui.ac.j f41866b = new com.waze.ui.ac.j(R.string.VOICE_SETTINGS_SWIPE_ACTION_SHARE);

    /* renamed from: c, reason: collision with root package name */
    private static final com.waze.z.a.ab f41867c = com.waze.z.a.ab.f45610a;

    /* renamed from: d, reason: collision with root package name */
    private static final com.waze.ui.ac.f f41868d = new com.waze.ui.ac.f(R.drawable.share_outline_24px);

    private as() {
    }

    @Override // com.waze.z.a.ad
    public final com.waze.z.a.ab a() {
        return f41867c;
    }

    @Override // com.waze.z.a.ad
    public final /* synthetic */ com.waze.ui.ac.i b() {
        return f41868d;
    }

    @Override // com.waze.z.a.ad
    public final /* synthetic */ com.waze.ui.ac.n c() {
        return f41866b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1155369791;
    }

    public final String toString() {
        return "Share";
    }
}
