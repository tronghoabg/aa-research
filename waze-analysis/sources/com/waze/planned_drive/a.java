package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements z {
    @Override // com.waze.planned_drive.z
    public final void a(android.support.v4.app.ar arVar, y yVar) {
        h.g.b.x.f(arVar, "fragment");
        h.g.b.x.f(yVar, "result");
        int iOrdinal = yVar.ordinal();
        if (iOrdinal == 0) {
            arVar.requireActivity().setResult(-1);
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            arVar.requireActivity().setResult(0);
        }
        android.support.v4.app.av activity = arVar.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
