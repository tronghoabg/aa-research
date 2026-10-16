package com.waze.sharedui.b;

import androidx.core.app.NotificationCompat;
import com.waze.shared_infra.i.h;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements d {
    @Override // com.waze.sharedui.b.d
    public final void reportAuditEvent(a aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_EVENT);
        Objects.toString(aVar);
        h.k("AuditReporter", "reporting AuditEvent: ".concat(aVar.toString()));
    }
}
