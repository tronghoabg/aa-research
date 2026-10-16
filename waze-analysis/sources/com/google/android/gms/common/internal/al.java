package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f4991a;

    /* synthetic */ al(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.f4991a = ajVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            aj ajVar = this.f4991a;
            synchronized (ajVar.f4976d) {
                ai aiVar = (ai) message.obj;
                ak akVar = (ak) ajVar.f4976d.get(aiVar);
                if (akVar != null && akVar.f()) {
                    if (akVar.g()) {
                        akVar.j();
                    }
                    ajVar.f4976d.remove(aiVar);
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        aj ajVar2 = this.f4991a;
        synchronized (ajVar2.f4976d) {
            ai aiVar2 = (ai) message.obj;
            ak akVar2 = (ak) ajVar2.f4976d.get(aiVar2);
            if (akVar2 != null && akVar2.a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(aiVar2), new Exception());
                ComponentName componentNameB = akVar2.b();
                if (componentNameB == null) {
                    componentNameB = null;
                }
                if (componentNameB == null) {
                    String strB = aiVar2.b();
                    String str = strB;
                    componentNameB = new ComponentName(strB, EnvironmentCompat.MEDIA_UNKNOWN);
                }
                akVar2.onServiceDisconnected(componentNameB);
            }
        }
        return true;
    }
}
