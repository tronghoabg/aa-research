package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class wyl implements Handler.Callback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wyl(soc socVar, int i) {
        this.b = i;
        this.a = socVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.b == 0) {
            ((wym) this.a).a.a(null, message.what);
            return true;
        }
        int i = message.what;
        if (i == 0) {
            HashMap map = ((soc) this.a).b;
            synchronized (map) {
                sob sobVar = (sob) message.obj;
                sof sofVar = (sof) map.get(sobVar);
                if (sofVar != null && sofVar.c()) {
                    if (sofVar.c) {
                        soc socVar = sofVar.g;
                        socVar.d.removeMessages(1, sofVar.e);
                        try {
                            socVar.e.b(socVar.c, sofVar);
                            sofVar.c = false;
                            sofVar.b = 2;
                        } catch (Throwable th) {
                            sofVar.c = false;
                            sofVar.b = 2;
                            throw th;
                        }
                    }
                    map.remove(sobVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        HashMap map2 = ((soc) this.a).b;
        synchronized (map2) {
            if (message.obj instanceof sod) {
                sob sobVar2 = ((sod) message.obj).a;
                throw null;
            }
            sob sobVar3 = (sob) message.obj;
            sof sofVar2 = (sof) map2.get(sobVar3);
            if (sofVar2 != null && sofVar2.b == 3) {
                Log.e("GmsClientSupervisor", a.bY(sobVar3, "Timeout waiting for ServiceConnection callback "), new Exception());
                ComponentName componentName = sofVar2.f;
                if (componentName == null) {
                    componentName = sobVar3.c;
                }
                if (componentName == null) {
                    String str = sobVar3.b;
                    spu.aw(str);
                    componentName = new ComponentName(str, "unknown");
                }
                sofVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }

    public /* synthetic */ wyl(wym wymVar, int i) {
        this.b = i;
        this.a = wymVar;
    }
}
