package com.waze.ui.af;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq implements at {

    /* renamed from: a, reason: collision with root package name */
    public static final aq f41857a = new aq();

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.ui.ac.j f41858b = new com.waze.ui.ac.j(R.string.VOICE_SETTINGS_SWIPE_ACTION_EDIT);

    /* renamed from: c, reason: collision with root package name */
    private static final com.waze.z.a.ab f41859c = com.waze.z.a.ab.f45610a;

    /* renamed from: d, reason: collision with root package name */
    private static final com.waze.ui.ac.f f41860d = new com.waze.ui.ac.f(R.drawable.ic_outline_edit_24px);

    private aq() {
    }

    @Override // com.waze.z.a.ad
    public final com.waze.z.a.ab a() {
        return f41859c;
    }

    @Override // com.waze.z.a.ad
    public final /* synthetic */ com.waze.ui.ac.i b() {
        return f41860d;
    }

    @Override // com.waze.z.a.ad
    public final /* synthetic */ com.waze.ui.ac.n c() {
        return f41858b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 516498664;
    }

    public final String toString() {
        return "Edit";
    }
}
