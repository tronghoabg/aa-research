package com.waze.audit;

import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.AuditEventMessage;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class c {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportAuditEvent$default(c cVar, AuditEventMessage auditEventMessage, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportAuditEvent");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        cVar.reportAuditEvent(auditEventMessage, lVar);
    }

    static final ab reportAuditEvent$lambda$0(c cVar, AuditEventMessage auditEventMessage) {
        x.d(cVar, "null cannot be cast to non-null type com.waze.audit.WazeAuditReporterNativeManager");
        byte[] byteArray = auditEventMessage.toByteArray();
        x.e(byteArray, "toByteArray(...)");
        ((WazeAuditReporterNativeManager) cVar).reportAuditEventNTV(byteArray);
        return null;
    }

    public void reportAuditEvent(final AuditEventMessage auditEventMessage, final l<? super ab, ab> lVar) {
        x.f(auditEventMessage, "messageData");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.audit.a
            @Override // com.waze.hw
            public final Object a() {
                c.reportAuditEvent$lambda$0(this.f15675a, auditEventMessage);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.audit.b
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((ab) obj);
            }
        } : null);
    }

    public final void reportAuditEvent(AuditEventMessage auditEventMessage) {
        x.f(auditEventMessage, "messageData");
        reportAuditEvent$default(this, auditEventMessage, null, 2, null);
    }
}
