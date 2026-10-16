package com.waze.planned_drive;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends android.support.v4.app.az {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlannedDriveActivity f33226a;

    b(PlannedDriveActivity plannedDriveActivity) {
        this.f33226a = plannedDriveActivity;
    }

    @Override // android.support.v4.app.az
    public final android.support.v4.app.ar a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        h.g.b.x.f(classLoader, "classLoader");
        h.g.b.x.f(str, "className");
        Class<?> cls = Class.forName(str);
        h.g.b.x.e(cls, "forName(...)");
        h.l.c cVarY = h.g.b.o.y(cls);
        PlannedDriveActivity plannedDriveActivity = this.f33226a;
        android.support.v4.app.ar arVar = (android.support.v4.app.ar) plannedDriveActivity.l().b(cVarY, null, null);
        if (arVar != null) {
            Bundle extras = plannedDriveActivity.getIntent().getExtras();
            arVar.setArguments(extras != null ? extras.getBundle("planned_drive_bundle") : null);
        } else {
            arVar = null;
        }
        if (arVar != null) {
            return arVar;
        }
        android.support.v4.app.ar arVarA = super.a(classLoader, str);
        h.g.b.x.e(arVarA, "instantiate(...)");
        return arVarA;
    }
}
