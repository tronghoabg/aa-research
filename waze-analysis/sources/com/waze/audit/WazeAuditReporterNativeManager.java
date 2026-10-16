package com.waze.audit;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.app.NotificationCompat;
import com.waze.jni.protos.AuditEventMessage;
import com.waze.shared_infra.i.e;
import com.waze.sharedui.b.d;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeAuditReporterNativeManager extends c implements d {
    public static final int $stable = 8;
    private final Context applicationContext;
    private final e logger;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WazeAuditReporterNativeManager(Context context, e eVar, int i2, o oVar) {
        if ((i2 & 2) != 0) {
            eVar = com.waze.shared_infra.i.a.d("AuditReporter");
            x.e(eVar, "create(...)");
        }
        this(context, eVar);
    }

    private final AuditEventMessage createMessage(com.waze.sharedui.b.a aVar) {
        List listB = aVar.b();
        ArrayList arrayList = new ArrayList(i.q(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(resStringToWazeDisplayStringId(((Number) it.next()).intValue())));
        }
        AuditEventMessage.Builder builderNewBuilder = AuditEventMessage.newBuilder();
        builderNewBuilder.setName(aVar.e().getNumber());
        builderNewBuilder.setContext(aVar.c().getNumber());
        builderNewBuilder.setValue(aVar.d().getNumber());
        builderNewBuilder.setSelectedOption(aVar.a());
        builderNewBuilder.addAllDisplayStrings(arrayList);
        AuditEventMessage auditEventMessageBuild = builderNewBuilder.build();
        x.e(auditEventMessageBuild, "build(...)");
        return auditEventMessageBuild;
    }

    private final int resStringToWazeDisplayStringId(int i2) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, IllegalArgumentException {
        try {
            String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(i2);
            x.e(resourceEntryName, "getResourceEntryName(...)");
            Field field = DisplayStrings.class.getField("DS_" + resourceEntryName);
            x.e(field, "getField(...)");
            int i3 = field.getInt(null);
            if (i3 < 3889) {
                return i3;
            }
            this.logger.g("unexpected string id " + i3 + ", lastId=3889");
            return -1;
        } catch (Resources.NotFoundException e2) {
            this.logger.h("resource not found resId=" + i2, e2);
            return -1;
        } catch (NoSuchFieldException e3) {
            this.logger.h("field not found", e3);
            return -1;
        }
    }

    @Override // com.waze.sharedui.b.d
    public void reportAuditEvent(com.waze.sharedui.b.a aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_EVENT);
        c.reportAuditEvent$default(this, createMessage(aVar), null, 2, null);
    }

    public final native void reportAuditEventNTV(byte[] bArr);

    public WazeAuditReporterNativeManager(Context context, e eVar) {
        x.f(context, "applicationContext");
        x.f(eVar, "logger");
        this.applicationContext = context;
        this.logger = eVar;
    }
}
